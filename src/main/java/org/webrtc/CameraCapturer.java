package org.webrtc;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.Arrays;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.NativeLibrary;

/* access modifiers changed from: package-private */
public abstract class CameraCapturer implements CameraVideoCapturer {
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() {
        /* class org.webrtc.CameraCapturer.C701062 */

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (CameraCapturer.this.currentSession != null) {
                    Logging.m268874w("CameraCapturer", "onCameraOpening while session was open.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                    CameraCapturer.this.eventsHandler.onCameraClosed();
                } else {
                    Logging.m268870d("CameraCapturer", "onCameraClosed from another session.");
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m268874w("CameraCapturer", "onCameraDisconnected from another session.");
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraDisconnected();
                CameraCapturer.this.stopCapture();
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m268874w("CameraCapturer", "onCameraError from another session: " + str);
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraError(str);
                CameraCapturer.this.stopCapture();
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m268874w("CameraCapturer", "onFrameCaptured from another session.");
                    return;
                }
                if (!CameraCapturer.this.firstFrameObserved) {
                    CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                    CameraCapturer.this.firstFrameObserved = true;
                }
                CameraCapturer.this.cameraStatistics.addFrame();
                CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.eventsHandler.onCameraConfig(i, i2, framerateRange);
            }
        }
    };
    public CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() {
        /* class org.webrtc.CameraCapturer.C701051 */

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            Logging.m268870d("CameraCapturer", "Create session done. Switch state: " + CameraCapturer.this.switchState);
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != null) {
                    cameraSession.setOrientationMode(CameraCapturer.this.mOrientationMode);
                }
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer.this.sessionOpening = false;
                CameraCapturer.this.currentSession = cameraSession;
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                CameraCapturer.this.firstFrameObserved = false;
                CameraCapturer.this.stateLock.notifyAll();
                if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    if (CameraCapturer.this.switchEventsHandler != null) {
                        CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    cameraCapturer2.switchCameraInternal(cameraCapturer2.switchEventsHandler);
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.openAttemptsRemaining--;
                if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                    Logging.m268874w("CameraCapturer", "Opening camera failed, passing: " + str);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState != SwitchState.IDLE) {
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                    }
                    if (failureType == CameraSession.FailureType.DISCONNECTED) {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                    }
                } else {
                    Logging.m268874w("CameraCapturer", "Opening camera failed, retry: " + str);
                    CameraCapturer.this.createSessionInternal(ParticipantRepo.f117150c);
                }
            }
        }
    };
    public CameraSession currentSession;
    public final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public CameraVideoCapturer.ORIENTATION_MODE mOrientationMode = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private NativeLibraryLoader nativeLibraryLoader = new NativeLibrary.DefaultLoader();
    private String nativeLibraryName = "bytertc";
    public int openAttemptsRemaining;
    public final Runnable openCameraTimeoutRunnable = new Runnable() {
        /* class org.webrtc.CameraCapturer.RunnableC701073 */

        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    public boolean sessionOpening;
    public final Object stateLock = new Object();
    public SurfaceTextureHelper surfaceHelper;
    public CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    public SwitchState switchState = SwitchState.IDLE;
    public final Handler uiThreadHandler;
    public int width;

    /* access modifiers changed from: package-private */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    @Override // org.webrtc.CameraVideoCapturer
    public /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer.CC.$default$addMediaRecorderToCamera(this, mediaRecorder, mediaRecorderHandler);
    }

    /* access modifiers changed from: protected */
    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback2, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer.CC.$default$removeMediaRecorderFromCamera(this, mediaRecorderHandler);
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        Logging.m268870d("CameraCapturer", "dispose");
        stopCapture();
    }

    /* access modifiers changed from: protected */
    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            Logging.m268871e("CameraCapturer", "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    public void printStackTrace() {
        Thread thread;
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            thread = handler.getLooper().getThread();
        } else {
            thread = null;
        }
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.m268870d("CameraCapturer", "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m268870d("CameraCapturer", stackTraceElement.toString());
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        Logging.m268870d("CameraCapturer", "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.m268870d("CameraCapturer", "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.m268874w("CameraCapturer", "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.m268870d("CameraCapturer", "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() {
                    /* class org.webrtc.CameraCapturer.RunnableC701106 */

                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.m268870d("CameraCapturer", "Stop capture: No session open");
            }
        }
        Logging.m268870d("CameraCapturer", "Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, (long) (i + HwBuildEx.VersionCodes.CUR_DEVELOPMENT));
        this.cameraThreadHandler.postDelayed(new Runnable() {
            /* class org.webrtc.CameraCapturer.RunnableC701095 */

            public void run() {
                try {
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
                } catch (IllegalArgumentException unused) {
                }
            }
        }, (long) i);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m268870d("CameraCapturer", "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            /* class org.webrtc.CameraCapturer.RunnableC701117 */

            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
            }
        });
    }

    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m268870d("CameraCapturer", "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length >= 2) {
            synchronized (this.stateLock) {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z = this.sessionOpening;
                if (z || this.currentSession != null) {
                    this.switchEventsHandler = cameraSwitchHandler;
                    if (z) {
                        this.switchState = SwitchState.PENDING;
                        return;
                    }
                    this.switchState = SwitchState.IN_PROGRESS;
                    Logging.m268870d("CameraCapturer", "switchCamera: Stopping session");
                    this.cameraStatistics.release();
                    this.cameraStatistics = null;
                    final CameraSession cameraSession = this.currentSession;
                    this.cameraThreadHandler.post(new Runnable() {
                        /* class org.webrtc.CameraCapturer.RunnableC701128 */

                        public void run() {
                            cameraSession.stop();
                        }
                    });
                    this.currentSession = null;
                    this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 1;
                    createSessionInternal(0);
                    Logging.m268870d("CameraCapturer", "switchCamera done");
                    return;
                }
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
            }
        } else if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
        }
    }

    private void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.m268871e("CameraCapturer", str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        Handler handler;
        this.applicationContext = context;
        this.capturerObserver = capturerObserver2;
        this.surfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            handler = null;
        } else {
            handler = surfaceTextureHelper.getHandler();
        }
        this.cameraThreadHandler = handler;
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        Logging.m268870d("CameraCapturer", "changeCaptureFormat: " + i + "x" + i2 + "@" + i3);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        Logging.m268870d("CameraCapturer", "startCapture: " + i + "x" + i2 + "@" + i3);
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (!this.sessionOpening) {
                    if (this.currentSession == null) {
                        this.width = i;
                        this.height = i2;
                        this.framerate = i3;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 3;
                        createSessionInternal(0);
                        return;
                    }
                }
                Logging.m268874w("CameraCapturer", "Session already open");
                return;
            }
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator2) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() {
            /* class org.webrtc.CameraCapturer.C701084 */

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator2;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator2.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        } else if (!Arrays.asList(deviceNames).contains(this.cameraName)) {
            throw new IllegalArgumentException("Camera name " + this.cameraName + " does not match any known camera device.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        startCapture(i, i2, i3);
    }
}

package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.Camera1Session;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoFrame;

/* access modifiers changed from: package-private */
public class Camera1Session implements CameraSession {
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 50);
    private static int sMinFramerate;
    private final Context applicationContext;
    public final Camera camera;
    private final int cameraId;
    public final Handler cameraThreadHandler;
    public final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public final Camera.CameraInfo info;
    private boolean isDesktopMode;
    private int mDisplayRotationCheckCounter;
    private int mLastDisplayRotation;
    private int mLastValidDisplayRotation;
    private CameraVideoCapturer.ORIENTATION_MODE mOrientation = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private final int scaleHeight;
    private final int scaleWidth;
    public SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;

    /* access modifiers changed from: private */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() {
            /* class org.webrtc.Camera1Session.C701032 */

            public /* synthetic */ void lambda$null$0$Camera1Session$2(byte[] bArr) {
                if (Camera1Session.this.state == SessionState.RUNNING) {
                    Camera1Session.this.camera.addCallbackBuffer(bArr);
                }
            }

            public /* synthetic */ void lambda$onPreviewFrame$1$Camera1Session$2(byte[] bArr) {
                Camera1Session.this.cameraThreadHandler.post(new Runnable(bArr) {
                    /* class org.webrtc.$$Lambda$Camera1Session$2$o1bOSaod5UNpTYix3Tr6HrdDU */
                    public final /* synthetic */ byte[] f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        Camera1Session.C701032.this.lambda$null$0$Camera1Session$2(this.f$1);
                    }
                });
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                boolean z;
                Camera1Session.this.checkIsOnCameraThread();
                if (camera != Camera1Session.this.camera) {
                    Logging.m268871e("Camera1Session", "Callback from a different camera. This should never happen.");
                } else if (Camera1Session.this.state != SessionState.RUNNING) {
                    Logging.m268870d("Camera1Session", "Bytebuffer frame captured but camera is no longer running.");
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    if (!Camera1Session.this.firstFrameReported) {
                        Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                        Camera1Session.this.firstFrameReported = true;
                    }
                    NV21Buffer nV21Buffer = new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Runnable(bArr) {
                        /* class org.webrtc.$$Lambda$Camera1Session$2$LdapGPG3Y1Mywi7EwXsGhHghjOI */
                        public final /* synthetic */ byte[] f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            Camera1Session.C701032.this.lambda$onPreviewFrame$1$Camera1Session$2(this.f$1);
                        }
                    });
                    int frameOrientation = Camera1Session.this.getFrameOrientation();
                    if (Camera1Session.this.info.facing == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    VideoFrame videoFrame = new VideoFrame(nV21Buffer, frameOrientation, nanos, z);
                    Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                    videoFrame.release();
                }
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new VideoSink() {
            /* class org.webrtc.$$Lambda$Camera1Session$66hEFVns2bvwBOCCrorCDZNW8 */

            @Override // org.webrtc.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                Camera1Session.this.lambda$listenForTextureFrames$0$Camera1Session(videoFrame);
            }
        });
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    private void startCapturing() {
        Logging.m268870d("Camera1Session", "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() {
            /* class org.webrtc.Camera1Session.C701021 */

            public void onError(int i, Camera camera) {
                String str;
                if (i == 100) {
                    str = "Camera server died!";
                } else {
                    str = "Camera error: " + i;
                }
                Logging.m268871e("Camera1Session", str);
                Camera1Session.this.stopInternal();
                if (i == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, str);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        Logging.m268870d("Camera1Session", "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.CC.getDeviceOrientation(this.applicationContext);
        int i = this.mLastValidDisplayRotation;
        int i2 = this.mDisplayRotationCheckCounter;
        if (i2 > 0) {
            this.mDisplayRotationCheckCounter = i2 - 1;
        } else if (i2 == 0) {
            if (!isInForeground(this.applicationContext)) {
                i = this.mLastValidDisplayRotation;
            } else {
                i = deviceOrientation;
            }
            this.mDisplayRotationCheckCounter = -1;
        } else if (deviceOrientation != this.mLastDisplayRotation) {
            int i3 = sMinFramerate;
            if (i3 > 0) {
                this.mDisplayRotationCheckCounter = i3;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = deviceOrientation;
        this.mLastValidDisplayRotation = i;
        if (this.info.facing == 0) {
            i = 360 - i;
        }
        return (this.info.orientation + i) % 360;
    }

    public void stopInternal() {
        Logging.m268870d("Camera1Session", "Stop internal");
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            Logging.m268870d("Camera1Session", "Camera is already stopped");
            return;
        }
        this.state = SessionState.STOPPED;
        this.surfaceTextureHelper.stopListening();
        try {
            this.camera.stopPreview();
            if (this.captureToTexture) {
                this.camera.setPreviewTexture(null);
            }
            this.camera.release();
            this.events.onCameraClosed(this);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Error e2) {
            e2.printStackTrace();
        }
        Logging.m268870d("Camera1Session", "Stop done");
    }

    @Override // org.webrtc.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isInForeground(android.content.Context r5) {
        /*
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r5 = r5.getPackageName()
            java.util.List r0 = r0.getRunningAppProcesses()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            java.lang.String r3 = r2.processName
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0032
            int r3 = r2.importance
            r4 = 100
            if (r3 == r4) goto L_0x0038
        L_0x0032:
            int r2 = r2.importance
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L_0x0018
        L_0x0038:
            r5 = 1
            return r5
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera1Session.isInForeground(android.content.Context):boolean");
    }

    public /* synthetic */ void lambda$listenForTextureFrames$0$Camera1Session(VideoFrame videoFrame) {
        VideoFrame.Buffer buffer;
        boolean z;
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.m268870d("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z2 = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        if (this.scaleWidth == 0 || this.scaleHeight == 0 || (this.captureFormat.width == this.scaleWidth && this.captureFormat.height == this.scaleHeight)) {
            buffer = videoFrame.getBuffer().cropAndScale(0, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else if (((float) this.captureFormat.width) / ((float) this.captureFormat.height) > ((float) this.scaleWidth) / ((float) this.scaleHeight)) {
            buffer = videoFrame.getBuffer().cropAndScale(((int) (((float) this.captureFormat.width) - ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)))) / 2, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else {
            buffer = videoFrame.getBuffer().cropAndScale(0, ((int) (((float) this.captureFormat.height) - ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)))) / 2, this.captureFormat.width, (int) ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)), this.scaleWidth, this.scaleHeight);
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) buffer;
        if (this.info.facing == 1) {
            z = true;
        } else {
            z = false;
        }
        VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix = CameraSession.CC.createTextureBufferWithModifiedTransformMatrix(textureBufferImpl, z, 0);
        int frameOrientation = getFrameOrientation();
        long timestampNs = videoFrame.getTimestampNs();
        if (this.info.facing != 1) {
            z2 = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(createTextureBufferWithModifiedTransformMatrix, frameOrientation, timestampNs, z2);
        buffer.release();
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.m268870d("Camera1Session", "Available fps ranges: " + convertFramerates);
        if (!Build.MODEL.equalsIgnoreCase("PEGM00") || i3 != 15) {
            framerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        } else {
            framerateRange = new CameraEnumerationAndroid.CaptureFormat.FramerateRange(15000, 20000);
            Logging.m268870d("Camera1Session", "unsupported framerate for special device found, hardcode framerange to:" + framerateRange.toString());
        }
        Logging.m268870d("Camera1Session", "selected fps range :" + framerateRange.toString());
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        Logging.m268870d("Camera1Session", "selected preview size" + closestSupportedSize.toString());
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, framerateRange);
    }

    private static void updateCameraParameters(Camera camera2, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat2, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        parameters.setPreviewFpsRange(captureFormat2.framerate.min, captureFormat2.framerate.max);
        parameters.setPreviewSize(captureFormat2.width, captureFormat2.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            captureFormat2.getClass();
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera2.setParameters(parameters);
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, int i2, int i3, int i4) {
        long nanoTime = System.nanoTime();
        Logging.m268870d("Camera1Session", "Open camera " + i + " brand:" + Build.BRAND + ", modle:" + Build.MODEL + ", width:" + i2 + ", height:" + i3 + ", framerate:" + i4);
        events2.onCameraOpening();
        try {
            Camera open = Camera.open(i);
            if (open == null) {
                CameraSession.FailureType failureType = CameraSession.FailureType.ERROR;
                createSessionCallback.onFailure(failureType, "android.hardware.Camera.open returned null for camera id = " + i);
                return;
            }
            try {
                open.setPreviewTexture(surfaceTextureHelper2.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                try {
                    Camera.Parameters parameters = open.getParameters();
                    CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i2, i3, i4);
                    Size findClosestPictureSize = findClosestPictureSize(parameters, i2, i3);
                    events2.onCameraConfig(findClosestPictureSize.width, findClosestPictureSize.height, findClosestCaptureFormat.framerate);
                    sMinFramerate = findClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize, z);
                    if (!z) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        for (int i5 = 0; i5 < 3; i5++) {
                            open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                        }
                    }
                    open.setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events2, z, z2, context, surfaceTextureHelper2, i, open, cameraInfo, findClosestCaptureFormat, nanoTime, i2, i3));
                } catch (RuntimeException e) {
                    open.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                }
            } catch (IOException | RuntimeException e2) {
                open.release();
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
        }
    }

    private Camera1Session(CameraSession.Events events2, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, Camera camera2, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat2, long j, int i2, int i3) {
        Logging.m268870d("Camera1Session", "Create new camera1 session on camera " + i);
        this.cameraThreadHandler = new Handler();
        this.events = events2;
        this.captureToTexture = z;
        this.isDesktopMode = z2;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = i;
        this.camera = camera2;
        this.info = cameraInfo;
        this.captureFormat = captureFormat2;
        this.constructionTimeNs = j;
        this.scaleWidth = i2;
        this.scaleHeight = i3;
        surfaceTextureHelper2.setTextureSize(captureFormat2.width, captureFormat2.height);
        startCapturing();
    }
}

package com.bytedance.realx.video.camera;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.realx.RXNativeFunctions;
import com.bytedance.realx.base.RXLogging;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

public class RXVideoCaptureAndroid {
    private EglBase cameraEglBase;
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C205691 */

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            RXLogging.m74903d("RXVideoCaptureAndroid", "onCapturerStopped...");
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            RXLogging.m74903d("RXVideoCaptureAndroid", "onCapturerStarted...");
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            RXNativeFunctions.nativeOnFrameCaptured(RXVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
        }
    };
    private CameraVideoCapturer.CameraEventsHandler mCameraEventsHandler = new CameraVideoCapturer.CameraEventsHandler() {
        /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C205702 */

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
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

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
            RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE);
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str) {
            RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE);
        }
    };
    private Intent mCaptureScreenIntent;
    private int mHeight;
    private boolean mIsCaptureScreen;
    public boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private VideoCapturer mVideoCapturer;
    private int mWidth;
    private EglBase.Context sharedEglGroup;

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public void stopCapture() {
        RXLogging.m74903d("RXVideoCaptureAndroid", "stopCapture...");
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                videoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void switchCamera() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && (videoCapturer instanceof CameraVideoCapturer)) {
            this.mIsFrontCamera = !this.mIsFrontCamera;
            ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() {
                /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C205713 */

                @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchError(String str) {
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchDone(boolean z) {
                    RXVideoCaptureAndroid.this.mIsFrontCamera = z;
                }
            });
        }
    }

    private boolean isCaptureToTextureSupported() {
        if (Build.VERSION.SDK_INT > 18 || !"samsung".equalsIgnoreCase(Build.MANUFACTURER) || Build.MODEL == null) {
            return true;
        }
        if (Build.MODEL.contains("SM-N") || Build.MODEL.contains("GT-N")) {
            return false;
        }
        return true;
    }

    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        EglBase eglBase = this.cameraEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.cameraEglBase = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    RXVideoCaptureAndroid(boolean z, long j, EglBase.Context context) {
        RXLogging.m74903d("RXVideoCaptureAndroid", "RXVideoCaptureAndroid Created, CaptureScreen=" + z);
        this.mIsCaptureScreen = z;
        this.mNativeCaptureObserver = j;
        this.sharedEglGroup = context;
    }

    private void startVideoCapture(int i, int i2, int i3) {
        RXLogging.m74903d("RXVideoCaptureAndroid", "startVideoCapture... ");
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                RXLogging.m74903d("RXVideoCaptureAndroid", "VideoCapture startCapture fail : " + e.getMessage());
            }
        }
    }

    private VideoCapturer createVideoCapturer(boolean z, int i, Intent intent) {
        CameraVideoCapturer createCapturer;
        CameraVideoCapturer createCapturer2;
        if (z) {
            try {
                return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() {
                    /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.C205724 */

                    public void onStop() {
                        RXLogging.m74903d("RXVideoCaptureAndroid", "User revoked permission to capture the screen.");
                    }
                });
            } catch (IllegalArgumentException e) {
                RXLogging.m74904e("RXVideoCaptureAndroid", "Create VideoCapture fail : " + e.getMessage());
                return null;
            }
        } else {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(isCaptureToTextureSupported(), false);
            String[] deviceNames = camera1Enumerator.getDeviceNames();
            for (String str : deviceNames) {
                if (camera1Enumerator.isFrontFacing(str) && i == 1 && (createCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler)) != null) {
                    return createCapturer2;
                }
                if (camera1Enumerator.isBackFacing(str) && i == 0 && (createCapturer = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler)) != null) {
                    return createCapturer;
                }
            }
            return null;
        }
    }

    public void startCapture(int i, int i2, int i3, int i4, Intent intent) {
        RXLogging.m74903d("RXVideoCaptureAndroid", "startCapture...");
        this.mWidth = i;
        this.mHeight = i2;
        this.mCaptureScreenIntent = intent;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        this.mVideoCapturer = createVideoCapturer(this.mIsCaptureScreen, i4, this.mCaptureScreenIntent);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = EglBase.CC.create(this.sharedEglGroup);
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RXLocalCapturer", this.cameraEglBase.getEglBaseContext());
        this.mSurfaceTextureHelper = create;
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 == null || create == null) {
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
            return;
        }
        videoCapturer2.initialize(create, ContextUtils.getApplicationContext(), this.localCapturerObserver);
        this.mIsVideoCaptureInited = true;
        startVideoCapture(i, i2, i3);
    }
}

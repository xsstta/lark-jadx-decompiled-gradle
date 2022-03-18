package com.ss.video.rtc.engine.video;

import android.content.Context;
import com.ss.video.rtc.engine.NativeFunctions;
import com.ss.video.rtc.engine.RtcSharedContext;
import com.ss.video.rtc.engine.data.ByteRtcData;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.engine.utils.VideoFrameConverter;
import java.lang.ref.WeakReference;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

public class VideoCapture {
    public static EglBase.Context sEglBaseContext;
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        /* class com.ss.video.rtc.engine.video.VideoCapture.C655961 */

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            NativeFunctions.nativeOnCapturerStopped(VideoCapture.this.mNativeCaptureObserver);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            NativeFunctions.nativeOnCapturerStarted(VideoCapture.this.mNativeCaptureObserver, z);
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            if (videoFrame.getBuffer() instanceof TextureBufferImpl) {
                videoFrame = new VideoFrame(new WebrtcTextureBufferWrapper((TextureBufferImpl) videoFrame.getBuffer()), videoFrame.getExtendedData(), videoFrame.getRotation(), videoFrame.getTimestampNs());
            }
            NativeFunctions.nativeOnFrameCaptured(VideoCapture.this.mNativeCaptureObserver, videoFrame);
        }
    };
    private CameraVideoCapturer.CameraEventsHandler mCameraEventsHandler;
    private WeakReference<Context> mContextRef;
    private boolean mHasFatalException;
    private int mHeight;
    public boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private CameraVideoCapturer mVideoCapturer;
    private int mWidth;

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public void release() {
        try {
            if (this.mVideoCapturer != null) {
                stopCapture();
                this.mVideoCapturer.dispose();
                this.mVideoCapturer = null;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
                this.mSurfaceTextureHelper = null;
            }
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        } catch (Exception e) {
            this.mHasFatalException = true;
            LogUtil.m257129d("VideoCapture", "VideoCapture release catch exception.\n" + e.getMessage());
        }
    }

    public void switchCamera() {
        CameraVideoCapturer cameraVideoCapturer;
        boolean z;
        try {
            if (!this.mHasFatalException && (cameraVideoCapturer = this.mVideoCapturer) != null) {
                if (this.mIsVideoCaptureInited) {
                    if (cameraVideoCapturer instanceof CameraVideoCapturer) {
                        if (!this.mIsFrontCamera) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.mIsFrontCamera = z;
                        cameraVideoCapturer.switchCamera(new CameraVideoCapturer.CameraSwitchHandler() {
                            /* class com.ss.video.rtc.engine.video.VideoCapture.C655972 */

                            @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                            public void onCameraSwitchError(String str) {
                            }

                            @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                            public void onCameraSwitchDone(boolean z) {
                                VideoCapture.this.mIsFrontCamera = z;
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.m257129d("VideoCapture", "VideoCapture release catch exception.\n" + e.getMessage());
        }
    }

    public void stopCapture() {
        CameraVideoCapturer cameraVideoCapturer;
        try {
            LogUtil.m257132i("VideoCapture", "stopCapture...");
            if (!this.mHasFatalException && (cameraVideoCapturer = this.mVideoCapturer) != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
                try {
                    cameraVideoCapturer.stopCapture();
                    this.mIsVideoCaptureWorking = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            this.mHasFatalException = true;
            LogUtil.m257129d("VideoCapture", "VideoCapture stopCapture catch exception.\n" + e2.getMessage());
        }
    }

    private CameraVideoCapturer createVideoCapturer(int i) {
        CameraVideoCapturer createCapturer;
        CameraVideoCapturer createCapturer2;
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true, false);
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
        } catch (IllegalArgumentException e) {
            LogUtil.m257132i("VideoCapture", "Create VideoCapture fail : " + e.getMessage());
            return null;
        }
    }

    VideoCapture(long j, EglBase.Context context) {
        try {
            LogUtil.m257132i("VideoCapture", "VideoCapture Created...");
            this.mHasFatalException = false;
            this.mContextRef = new WeakReference<>(RtcSharedContext.getApplicationContext());
            this.mSurfaceTextureHelper = SurfaceTextureHelper.create("LocalCapturer", sEglBaseContext);
            this.mNativeCaptureObserver = j;
        } catch (Exception e) {
            this.mHasFatalException = true;
            LogUtil.m257129d("VideoCapture", "VideoCapture constructor catch exception.\n" + e.getMessage());
        }
    }

    private void startVideoCapture(int i, int i2, int i3) {
        LogUtil.m257132i("VideoCapture", "startVideoCapture... ");
        CameraVideoCapturer cameraVideoCapturer = this.mVideoCapturer;
        if (cameraVideoCapturer != null) {
            try {
                cameraVideoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                LogUtil.m257132i("VideoCapture", "VideoCapture startCapture fail : " + e.getMessage());
            }
        }
    }

    public void startCapture(int i, int i2, int i3) {
        WeakReference<Context> weakReference;
        try {
            LogUtil.m257132i("VideoCapture", "startCapture...");
            this.mWidth = i;
            this.mHeight = i2;
            VideoFrameConverter nativeGetVideoFrameConverter = NativeFunctions.nativeGetVideoFrameConverter();
            if (nativeGetVideoFrameConverter != null) {
                nativeGetVideoFrameConverter.updateEglContext(sEglBaseContext, i, i2);
            }
            if (!this.mHasFatalException && (weakReference = this.mContextRef) != null) {
                if (weakReference.get() != null) {
                    CameraVideoCapturer cameraVideoCapturer = this.mVideoCapturer;
                    int i4 = 0;
                    if (cameraVideoCapturer != null) {
                        cameraVideoCapturer.dispose();
                        this.mVideoCapturer = null;
                        this.mIsVideoCaptureInited = false;
                        this.mIsVideoCaptureWorking = false;
                    }
                    if (this.mIsFrontCamera) {
                        i4 = 1;
                    }
                    CameraVideoCapturer createVideoCapturer = createVideoCapturer(i4);
                    this.mVideoCapturer = createVideoCapturer;
                    if (createVideoCapturer != null) {
                        createVideoCapturer.initialize(this.mSurfaceTextureHelper, this.mContextRef.get(), this.localCapturerObserver);
                        this.mVideoCapturer.setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE.convertFromInt(ByteRtcData.instance().getOrientationMode().getValue()));
                    }
                    this.mIsVideoCaptureInited = true;
                    startVideoCapture(i, i2, i3);
                }
            }
        } catch (Exception e) {
            this.mHasFatalException = true;
            LogUtil.m257129d("VideoCapture", "VideoCapture startCapture catch exception.\n" + e.getMessage());
        }
    }
}

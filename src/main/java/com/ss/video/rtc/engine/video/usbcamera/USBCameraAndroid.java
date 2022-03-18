package com.ss.video.rtc.engine.video.usbcamera;

import com.bytedance.realx.base.RXLogging;
import com.smt.usbcam.USBCamApi;
import com.smt.usbcam.USBCamManager;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.meeting.MeetingRtcNativeFunctions;
import org.webrtc.CapturerObserver;
import org.webrtc.ContextUtils;
import org.webrtc.VideoFrame;

public class USBCameraAndroid {
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        /* class com.ss.video.rtc.engine.video.usbcamera.USBCameraAndroid.C655981 */

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            LogUtil.m257129d("USBCamera", "onUSBCapturerStopped...");
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            LogUtil.m257129d("USBCamera", "onUSBCapturerStarted...");
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            MeetingRtcNativeFunctions.nativeOnUsbCamFrameCaptured(USBCameraAndroid.this.mNativeUSBCaptureObserver, videoFrame);
        }
    };
    private int mHeight;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeUSBCaptureObserver;
    private USBCamApi mUSBCamApi;
    private USBCameraCapturer mVideoCapturer;
    private int mWidth;

    private USBCameraCapturer createVideoCapturer() {
        return new USBCameraCapturer(this.mUSBCamApi);
    }

    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
    }

    public void stopCapture() {
        RXLogging.m74903d("USBCamera", "stopCapture...");
        USBCameraCapturer uSBCameraCapturer = this.mVideoCapturer;
        if (uSBCameraCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                uSBCameraCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    USBCameraAndroid(long j) {
        RXLogging.m74903d("USBCamera", "USBCameraAndroid Created");
        this.mNativeUSBCaptureObserver = j;
        this.mUSBCamApi = USBCamManager.getApiSingleton();
    }

    private void startVideoCapture(int i, int i2, int i3) {
        LogUtil.m257129d("USBCamera", "start USBCamera VideoCapture... ");
        USBCameraCapturer uSBCameraCapturer = this.mVideoCapturer;
        if (uSBCameraCapturer != null) {
            try {
                uSBCameraCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                LogUtil.m257129d("USBCamera", "USBCamera VideoCapture startCapture fail : " + e.getMessage());
            }
        }
    }

    public void startCapture(int i, int i2, int i3) {
        RXLogging.m74903d("USBCamera", "startCapture...");
        this.mWidth = i;
        this.mHeight = i2;
        USBCameraCapturer uSBCameraCapturer = this.mVideoCapturer;
        if (uSBCameraCapturer != null) {
            uSBCameraCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        USBCameraCapturer createVideoCapturer = createVideoCapturer();
        this.mVideoCapturer = createVideoCapturer;
        if (createVideoCapturer != null) {
            createVideoCapturer.initialize(null, ContextUtils.getApplicationContext(), this.localCapturerObserver);
            this.mIsVideoCaptureInited = true;
            startVideoCapture(i, i2, i3);
            return;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
    }
}

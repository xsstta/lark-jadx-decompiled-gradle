package com.ss.video.rtc.engine.video.usbcamera;

import android.content.Context;
import android.os.SystemClock;
import android.util.Size;
import com.smt.usbcam.FrameCallback;
import com.smt.usbcam.USBCamApi;
import com.smt.usbcam.USBCamPixelFormat;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.meeting.MeetingRtcNativeFunctions;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.JavaI420Buffer;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

/* access modifiers changed from: package-private */
public class USBCameraCapturer implements FrameCallback, VideoCapturer {
    private static final Object lock = new Object();
    private long constructionTimeNs;
    private boolean firstFrameReported;
    private volatile boolean isBufferFree = true;
    private CapturerObserver mCapturerObserver;
    private CameraVideoCapturer.CameraEventsHandler mEventsHandler;
    private int mHeight;
    private Size mTargetSize;
    private USBCamApi mUSBCamApi;
    private int mWidth;
    private ByteBuffer mirrorFrameOutputBuffer;
    private ByteBuffer origFrameOutputBuffer;

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public /* synthetic */ void lambda$onFrameAvailable$0$USBCameraCapturer() {
        synchronized (lock) {
            this.isBufferFree = true;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        LogUtil.m257132i("USBCameraCapturer", "stopCapture");
        this.mUSBCamApi.stopPreview();
        this.origFrameOutputBuffer = null;
        this.mirrorFrameOutputBuffer = null;
    }

    public USBCameraCapturer(USBCamApi uSBCamApi) {
        LogUtil.m257132i("USBCameraCapturer", "create");
        this.mUSBCamApi = uSBCamApi;
    }

    private ByteBuffer allocByteBuffer(Size size) {
        return ByteBuffer.allocateDirect((size.getWidth() * size.getHeight()) + (((size.getWidth() + 1) / 2) * 2 * ((size.getHeight() + 1) / 2)));
    }

    @Override // com.smt.usbcam.FrameCallback
    public void onFrameAvailable(ByteBuffer byteBuffer) {
        LogUtil.m257132i("USBCameraCapturer", "onFrameAvailable ");
        synchronized (lock) {
            if (this.isBufferFree && this.origFrameOutputBuffer != null) {
                if (this.mirrorFrameOutputBuffer != null) {
                    this.isBufferFree = false;
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    if (!this.firstFrameReported) {
                        TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs);
                        this.firstFrameReported = true;
                        LogUtil.m257132i("USBCameraCapturer", "capture output, width " + this.mTargetSize.getWidth() + ", height " + this.mTargetSize.getHeight());
                    }
                    if (this.mCapturerObserver != null) {
                        int width = this.mTargetSize.getWidth() * this.mTargetSize.getHeight();
                        byteBuffer.position(0);
                        byteBuffer.limit(width);
                        ByteBuffer slice = byteBuffer.slice();
                        byteBuffer.position(width);
                        byteBuffer.limit(width + (((this.mTargetSize.getWidth() + 1) / 2) * ((this.mTargetSize.getHeight() + 1) / 2) * 2));
                        ByteBuffer slice2 = byteBuffer.slice();
                        JavaI420Buffer allocate420Buffer = allocate420Buffer(this.mTargetSize, this.origFrameOutputBuffer, null);
                        MeetingRtcNativeFunctions.nativeNV21ToI420(slice, this.mTargetSize.getWidth(), slice2, ((this.mTargetSize.getWidth() + 1) / 2) * 2, allocate420Buffer.getDataY(), allocate420Buffer.getStrideY(), allocate420Buffer.getDataU(), allocate420Buffer.getStrideU(), allocate420Buffer.getDataV(), allocate420Buffer.getStrideV(), this.mTargetSize.getWidth(), this.mTargetSize.getHeight());
                        JavaI420Buffer allocate420Buffer2 = allocate420Buffer(this.mTargetSize, this.mirrorFrameOutputBuffer, new Runnable() {
                            /* class com.ss.video.rtc.engine.video.usbcamera.$$Lambda$USBCameraCapturer$94_uQPRcvZ5MzsQa9KctAiyLfI */

                            public final void run() {
                                USBCameraCapturer.this.lambda$onFrameAvailable$0$USBCameraCapturer();
                            }
                        });
                        MeetingRtcNativeFunctions.nativeI420Mirror(allocate420Buffer.getDataY(), allocate420Buffer.getStrideY(), allocate420Buffer.getDataU(), allocate420Buffer.getStrideU(), allocate420Buffer.getDataV(), allocate420Buffer.getStrideV(), allocate420Buffer2.getDataY(), allocate420Buffer2.getStrideY(), allocate420Buffer2.getDataU(), allocate420Buffer2.getStrideU(), allocate420Buffer2.getDataV(), allocate420Buffer2.getStrideV(), this.mTargetSize.getWidth(), this.mTargetSize.getHeight());
                        VideoFrame videoFrame = new VideoFrame(allocate420Buffer2, 0, nanos);
                        this.mCapturerObserver.onFrameCaptured(videoFrame);
                        videoFrame.release();
                    }
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        LogUtil.m257132i("USBCameraCapturer", "initialize");
        this.mCapturerObserver = capturerObserver;
    }

    private static JavaI420Buffer allocate420Buffer(Size size, ByteBuffer byteBuffer, Runnable runnable) {
        int width = size.getWidth();
        int height = size.getHeight();
        int i = (width + 1) / 2;
        int i2 = (width * height) + 0;
        int i3 = ((height + 1) / 2) * i;
        int i4 = i2 + i3;
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i2);
        byteBuffer.limit(i4);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i4);
        byteBuffer.limit(i4 + i3);
        return JavaI420Buffer.wrap(width, height, slice, width, slice2, i, byteBuffer.slice(), i, runnable);
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        LogUtil.m257132i("USBCameraCapturer", "startCapture " + i + "x" + i2 + "@" + i3);
        this.mWidth = i;
        this.mHeight = i2;
        this.constructionTimeNs = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
        List<Size> supportSize = this.mUSBCamApi.getSupportSize();
        if (supportSize != null) {
            LogUtil.m257132i("USBCameraCapturer", "supported size " + supportSize.toString());
            for (Size size : supportSize) {
                if ((i == size.getWidth() && i2 <= size.getHeight()) || (i2 == size.getHeight() && i <= size.getWidth())) {
                    LogUtil.m257132i("USBCameraCapturer", "choose size " + size.toString());
                    this.mTargetSize = size;
                    this.mUSBCamApi.setBufferSize(size);
                }
            }
            this.origFrameOutputBuffer = allocByteBuffer(this.mTargetSize);
            this.mirrorFrameOutputBuffer = allocByteBuffer(this.mTargetSize);
            this.mUSBCamApi.setFrameCallback(this, USBCamPixelFormat.YUV420SP_NV21);
            try {
                this.mUSBCamApi.startPreview();
            } catch (Exception e) {
                LogUtil.m257132i("USBCameraCapturer", "startCapture failed: " + e.getMessage());
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        startCapture(i, i2, i3);
    }
}

package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.ss.ttm.player.MediaPlayer;

public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private DeviceOrientation mCurrentOrientation;
    private Display mDisplay;
    public MediaProjection mediaProjection;
    public final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    private int width;

    /* access modifiers changed from: private */
    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    private int getDeviceRotation() {
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation != 3) {
            return 0;
        }
        return 270;
    }

    private boolean maybeDoRotation() {
        DeviceOrientation deviceOrientation = getDeviceOrientation(getDeviceRotation());
        if (deviceOrientation == this.mCurrentOrientation) {
            return false;
        }
        this.mCurrentOrientation = deviceOrientation;
        rotateCaptureOrientation(deviceOrientation);
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class org.webrtc.ScreenCapturerAndroid.RunnableC701291 */

            public void run() {
                ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
                ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
                if (ScreenCapturerAndroid.this.virtualDisplay != null) {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.virtualDisplay = null;
                }
                if (ScreenCapturerAndroid.this.mediaProjection != null) {
                    ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid.this.mediaProjectionCallback);
                    ScreenCapturerAndroid.this.mediaProjection.stop();
                    ScreenCapturerAndroid.this.mediaProjection = null;
                }
            }
        });
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("RTCScreenCapture", this.width, this.height, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    private DeviceOrientation getDeviceOrientation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        return DeviceOrientation.LANDSCAPE;
                    }
                }
            }
            return DeviceOrientation.LANDSCAPE;
        }
        return DeviceOrientation.PORTRAIT;
    }

    private void rotateCaptureOrientation(DeviceOrientation deviceOrientation) {
        if ((deviceOrientation == DeviceOrientation.LANDSCAPE && this.width < this.height) || (deviceOrientation == DeviceOrientation.PORTRAIT && this.height < this.width)) {
            int i = this.width;
            int i2 = this.height;
            this.height = i;
            this.width = i + (i2 - i);
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (maybeDoRotation()) {
            this.virtualDisplay.release();
            createVirtualDisplay();
            return;
        }
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        startCapture(i, i2, i3, 4);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver2) {
        checkNotDisposed();
        if (capturerObserver2 != null) {
            this.capturerObserver = capturerObserver2;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
                this.mDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            } else {
                throw new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
                /* class org.webrtc.ScreenCapturerAndroid.RunnableC701302 */

                public void run() {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.createVirtualDisplay();
                }
            });
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        checkNotDisposed();
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        MediaProjection mediaProjection2 = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection2;
        mediaProjection2.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (i4 <= 0) {
            i4 = 4;
        }
        surfaceTextureHelper2.setMinFps(i4);
        this.surfaceTextureHelper.startListening(this);
    }
}

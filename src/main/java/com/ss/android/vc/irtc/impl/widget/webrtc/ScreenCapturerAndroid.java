package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils;
import com.ss.ttm.player.MediaPlayer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    public CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    public MediaProjection mediaProjection;
    public final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    private int width;

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            /* class com.ss.android.vc.irtc.impl.widget.webrtc.ScreenCapturerAndroid.RunnableC610521 */

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
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
                /* class com.ss.android.vc.irtc.impl.widget.webrtc.ScreenCapturerAndroid.RunnableC610532 */

                public void run() {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.createVirtualDisplay();
                }
            });
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver2) {
        checkNotDisposed();
        if (capturerObserver2 != null) {
            this.capturerObserver = capturerObserver2;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
            } else {
                throw new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        MediaProjection mediaProjection2 = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection2;
        mediaProjection2.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }
}

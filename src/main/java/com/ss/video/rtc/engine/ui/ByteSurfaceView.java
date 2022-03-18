package com.ss.video.rtc.engine.ui;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class ByteSurfaceView extends SurfaceView implements IVideoSink {
    private boolean isRelease = true;
    private EglBase mEglBase;
    private boolean mIsStart;
    private VideoFrameRender mVideoFrameRender;

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getBufferType() {
        return 0;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public EGLContext getEGLContextHandle() {
        return null;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getPixelFormat() {
        return 1;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getRenderElapse() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public Looper getTextureFrameProcessLooper() {
        return null;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onStop() {
        this.mIsStart = false;
    }

    public void disableFpsReduction() {
        this.mVideoFrameRender.disableFpsReduction();
    }

    private void init() {
        VideoFrameRender videoFrameRender = new VideoFrameRender("ByteSurfaceViewRender");
        this.mVideoFrameRender = videoFrameRender;
        videoFrameRender.setRenderView(this, (SurfaceHolder.Callback) null);
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onStart() {
        this.mIsStart = true;
        this.mVideoFrameRender.onStart();
        return true;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onDispose() {
        if (!this.isRelease) {
            this.isRelease = true;
            this.mVideoFrameRender.release();
            EglBase eglBase = this.mEglBase;
            if (eglBase != null) {
                eglBase.release();
            }
        }
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onInitialize() {
        if (!this.isRelease) {
            return false;
        }
        EglBase create = EglBase.CC.create();
        this.mEglBase = create;
        this.isRelease = false;
        this.mVideoFrameRender.init(create.getEglBaseContext());
        this.mVideoFrameRender.setProcessTextureLopper(getTextureFrameProcessLooper());
        return true;
    }

    public void setEnableHardwareScaler(boolean z) {
        this.mVideoFrameRender.setEnableHardwareScaler(z);
    }

    public void setFpsReduction(float f) {
        this.mVideoFrameRender.setFpsReduction(f);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        this.mVideoFrameRender.setScalingType(scalingType);
    }

    public ByteSurfaceView(Context context) {
        super(context);
        init();
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RtcVideoFrame rtcVideoFrame) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeVideoFrame(rtcVideoFrame);
        }
    }

    public ByteSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ByteSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ByteSurfaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}

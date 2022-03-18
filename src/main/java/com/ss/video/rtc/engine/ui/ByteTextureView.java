package com.ss.video.rtc.engine.ui;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.TextureView;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class ByteTextureView extends TextureView implements IVideoSink {
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

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onStop() {
        this.mIsStart = false;
    }

    private void init() {
        VideoFrameRender videoFrameRender = new VideoFrameRender("ByteSurfaceViewRender");
        this.mVideoFrameRender = videoFrameRender;
        videoFrameRender.setRenderView(this, (TextureView.SurfaceTextureListener) null);
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
        this.mVideoFrameRender.init(create.getEglBaseContext());
        this.isRelease = false;
        return true;
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        this.mVideoFrameRender.setScalingType(scalingType);
    }

    public ByteTextureView(Context context) {
        super(context);
        init();
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RtcVideoFrame rtcVideoFrame) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeVideoFrame(rtcVideoFrame);
        }
    }

    public ByteTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ByteTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ByteTextureView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

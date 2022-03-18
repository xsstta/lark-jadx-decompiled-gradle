package com.ss.video.rtc.engine.mediaio;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.video.rtc.engine.ui.VideoFrameRender;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceEglRenderer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class SurfaceEglRender extends SurfaceEglRenderer {
    private boolean hasInit;
    private SurfaceHolder.Callback mCallback;
    private VideoFrameRender.OnEglSurfaceCreated mOnEglSurfaceCreated;
    private SoftReference<SurfaceView> surfaceViewSoftReference;

    @Override // org.webrtc.SurfaceEglRenderer, org.webrtc.EglRenderer
    public void release() {
        SurfaceView surfaceView;
        this.hasInit = false;
        LogUtil.m257129d("SurfaceEglRender", "release");
        super.release();
        SoftReference<SurfaceView> softReference = this.surfaceViewSoftReference;
        if (softReference != null && (surfaceView = softReference.get()) != null) {
            surfaceView.getHolder().removeCallback(this);
        }
    }

    public SurfaceEglRender(String str) {
        super(str);
    }

    public void setOnEglSurfaceCreated(VideoFrameRender.OnEglSurfaceCreated onEglSurfaceCreated) {
        this.mOnEglSurfaceCreated = onEglSurfaceCreated;
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        this.mCallback = callback;
    }

    @Override // org.webrtc.SurfaceEglRenderer, org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.hasInit) {
            super.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.SurfaceEglRenderer
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.m257129d("SurfaceEglRender", "surfaceDestroyed");
    }

    @Override // org.webrtc.SurfaceEglRenderer
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        LogUtil.m257129d("SurfaceEglRender", "surfaceCreated");
        VideoFrameRender.OnEglSurfaceCreated onEglSurfaceCreated = this.mOnEglSurfaceCreated;
        if (onEglSurfaceCreated != null) {
            onEglSurfaceCreated.onCreated();
        }
    }

    public void bind(SurfaceView surfaceView) {
        if (!this.hasInit) {
            LogUtil.m257129d("SurfaceEglRender", "surfaceView not init!");
            return;
        }
        LogUtil.m257129d("SurfaceEglRender", "bind");
        surfaceView.getHolder().addCallback(this);
        if (this.mCallback != null) {
            surfaceView.getHolder().addCallback(this.mCallback);
        }
        this.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (surfaceView.isShown()) {
            surfaceView.setVisibility(4);
            surfaceView.setVisibility(0);
        }
    }

    @Override // org.webrtc.SurfaceEglRenderer, org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m257129d("SurfaceEglRender", "init");
        this.hasInit = true;
        super.init(context, iArr, glDrawer);
    }

    @Override // org.webrtc.SurfaceEglRenderer
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        LogUtil.m257129d("SurfaceEglRender", "surfaceChanged");
    }
}

package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer;
import com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener;
import com.ss.android.vc.irtc.impl.widget.IVideoRenderListener;
import com.ss.android.vc.irtc.impl.widget.utils.EnvUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import org.webrtc.EglBase;

public class VideoViewSurfaceRenderer extends AbsVideoViewRenderer {
    private final String TAG = ("VideoViewSurfaceRenderer#" + this);
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private SurfaceViewRenderer mRenderer;

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setCornerRadius(float f) {
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public SurfaceView getRenderView() {
        return this.mRenderer;
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public RectF getOrgRect() {
        return this.mRenderer.getOrgRect();
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public RenderInfo getRenderInfo() {
        return this.mRenderer.getRenderInfo();
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void reset() {
        this.mRenderer.reset();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (EnvUtils.LOG_DEBUG) {
            C61064p.m237485a(this.TAG, "[onDetachedFromWindow]");
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void release() {
        this.mRenderer.release();
        this.hasInitEglBase = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append("#");
        Object obj = this.mRenderer;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        return sb.toString();
    }

    public static VideoViewSurfaceRenderer create(Context context) {
        return new VideoViewSurfaceRenderer(context);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void renderFrame(BvVideoFrame bvVideoFrame) {
        this.mRenderer.renderFrame(bvVideoFrame);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setAutoRenderMode(boolean z) {
        this.mRenderer.setAutoRenderMode(z);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setEnableHardwareScaler(boolean z) {
        this.mRenderer.setEnableHardwareScaler(z);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setMaxScale(float f) {
        this.mRenderer.setMaxScale(f);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setRecalBaseFrameListener(IRecalBaseFrameListener iRecalBaseFrameListener) {
        this.mRenderer.setRecalBaseFrameListener(iRecalBaseFrameListener);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setRenderListener(IVideoRenderListener iVideoRenderListener) {
        this.mRenderer.setRenderListener(iVideoRenderListener);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setZOrderMediaOverlay(boolean z) {
        this.mRenderer.setZOrderMediaOverlay(z);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setZOrderOnTop(boolean z) {
        this.mRenderer.setZOrderOnTop(z);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void init(EglBase.Context context) {
        if (!this.hasInitEglBase) {
            this.hasInitEglBase = true;
            this.mRenderer.init(context, null);
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setBgColor(int i) {
        setBackgroundColor(i);
        this.mRenderer.setBgColor(i);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setRenderMode(int i) {
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        if (i == 0) {
            scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        } else if (i == 2) {
            scalingType = RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;
        }
        this.mRenderer.setScalingType(scalingType);
    }

    VideoViewSurfaceRenderer(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mRenderer = new SurfaceViewRenderer(context);
        if (EnvUtils.LOG_DEBUG) {
            String str = this.TAG;
            C61064p.m237485a(str, "[init]" + this.mRenderer.hashCode());
        }
        addView(this.mRenderer);
    }

    VideoViewSurfaceRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public RectF setTranslate(float f, float f2, boolean z) {
        return this.mRenderer.setTranslate(f, f2, z);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public RectF setScale(float f, float f2, float f3, boolean z) {
        return this.mRenderer.setScale(f, f2, f3, z);
    }

    public /* synthetic */ void lambda$onLayout$0$VideoViewSurfaceRenderer(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.delayLayoutMillis > 0) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler.postDelayed(new Runnable(z, i, i2, i3, i4) {
                /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$VideoViewSurfaceRenderer$9BdU62NaETo_qiPI1D2ILSoT9Vg */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ int f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    VideoViewSurfaceRenderer.this.lambda$onLayout$0$VideoViewSurfaceRenderer(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            }, this.delayLayoutMillis);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}

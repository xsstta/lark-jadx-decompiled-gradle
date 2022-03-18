package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer;
import com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener;
import com.ss.android.vc.irtc.impl.widget.IVideoRenderListener;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import org.webrtc.EglBase;

public class VideoViewTextureRenderer extends AbsVideoViewRenderer {
    private String TAG = ("VideoViewTextureRenderer#" + this);
    private EglBase externalEglBase = null;
    private TextureVideoViewOutlineProvider mOutlineProvider;
    private TextureViewRenderer mRenderer;

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setEnableHardwareScaler(boolean z) {
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setZOrderMediaOverlay(boolean z) {
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setZOrderOnTop(boolean z) {
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public TextureView getRenderView() {
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

    public void initExternal() {
        String str = this.TAG;
        C61064p.m237485a(str, "[initExternal] " + hashCode());
        if (this.externalEglBase == null) {
            this.externalEglBase = EglBase.CC.create();
        }
        init(this.externalEglBase.getEglBaseContext());
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void release() {
        String str = this.TAG;
        C61064p.m237485a(str, "release: " + hashCode());
        this.mRenderer.release();
        this.hasInitEglBase = false;
        EglBase eglBase = this.externalEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.externalEglBase = null;
        }
    }

    private static class TextureVideoViewOutlineProvider extends ViewOutlineProvider {
        private int mHeight;
        private float mRadius;
        private int mWidth;

        public void updateRadius(float f) {
            this.mRadius = f;
        }

        public TextureVideoViewOutlineProvider(float f) {
            this.mRadius = f;
        }

        public void updateSize(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, this.mWidth, this.mHeight), this.mRadius);
        }
    }

    public static VideoViewTextureRenderer create(Context context) {
        return new VideoViewTextureRenderer(context);
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
    public void setBgColor(int i) {
        this.mRenderer.setBgColor(i);
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

    VideoViewTextureRenderer(Context context) {
        super(context);
        init(context, null);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void setCornerRadius(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.mOutlineProvider == null) {
                this.mOutlineProvider = new TextureVideoViewOutlineProvider(f);
            }
            this.mOutlineProvider.updateRadius(f);
            setOutlineProvider(this.mOutlineProvider);
            setClipToOutline(true);
        }
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

    @Override // com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer
    public void init(EglBase.Context context) {
        if (!this.hasInitEglBase) {
            String str = this.TAG;
            C61064p.m237486b(str, "[init] 2 " + hashCode());
            this.hasInitEglBase = true;
            this.mRenderer.init(context, null);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.mRenderer = textureViewRenderer;
        addView(textureViewRenderer);
    }

    VideoViewTextureRenderer(Context context, AttributeSet attributeSet) {
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

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        TextureVideoViewOutlineProvider textureVideoViewOutlineProvider = this.mOutlineProvider;
        if (textureVideoViewOutlineProvider != null) {
            textureVideoViewOutlineProvider.updateSize(i, i2);
            setOutlineProvider(this.mOutlineProvider);
        }
    }
}

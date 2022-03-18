package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener;
import com.ss.android.vc.irtc.impl.widget.IVideoRenderListener;
import com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, RenderView {
    private final String TAG = ("SurfaceViewRenderer#" + this);
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName = "surface";
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private volatile boolean surfaceValid = false;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();

    public RectF getOrgRect() {
        return this.eglRenderer.getOrgRect();
    }

    public RenderInfo getRenderInfo() {
        return this.eglRenderer.getRenderInfo();
    }

    public void reset() {
        this.eglRenderer.reset();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C61064p.m237485a(this.TAG, "onAttachedToWindow");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C61064p.m237485a(this.TAG, "onDetachedFromWindow");
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void release() {
        if (EglRenderer.DEBUG) {
            C61064p.m237486b(this.TAG, "[release]");
        }
        this.eglRenderer.release();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append("#");
        Object obj = this.eglRenderer;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        return sb.toString();
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) getWidth()) / ((float) getHeight());
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        if (((float) i) / ((float) i2) > width) {
            i = (int) (((float) i2) * width);
        } else {
            i2 = (int) (((float) i) / width);
        }
        Math.min(getWidth(), i);
        Math.min(getHeight(), i2);
    }

    public void setBgColor(int i) {
        this.eglRenderer.setBgColor(i);
    }

    public void setMaxScale(float f) {
        this.eglRenderer.setMaxScale(f);
    }

    public void setRecalBaseFrameListener(IRecalBaseFrameListener iRecalBaseFrameListener) {
        this.eglRenderer.setReCalBaseFrameListener(iRecalBaseFrameListener);
    }

    public void setRenderListener(IVideoRenderListener iVideoRenderListener) {
        this.eglRenderer.setListener(iVideoRenderListener);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void setAutoRenderMode(boolean z) {
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - setScalingType]");
        this.eglRenderer.setAutoRenderMode(z);
        requestLayout();
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.TAG;
        C61064p.m237485a(str, "onConfigurationChanged orientation=" + configuration.orientation);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        String str = this.TAG;
        C61064p.m237485a(str, "onVisibilityAggregated isVisible=" + z);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        String str = this.TAG;
        C61064p.m237485a(str, "onWindowFocusChanged hasWindowFocus=" + z);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        String str = this.TAG;
        C61064p.m237485a(str, "onWindowVisibilityChanged visibility=" + i);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
        this.eglRenderer.setRenderMode(scalingType);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void renderFrame(BvVideoFrame bvVideoFrame) {
        if (this.surfaceValid) {
            this.eglRenderer.onFrame(bvVideoFrame);
            return;
        }
        String str = this.TAG;
        C61064p.m237487c(str, "[renderFrame]Surface is invalid, attach = " + isAttachedToWindow());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C61064p.m237485a(this.TAG, "[surfaceDestroyed]");
        ThreadUtils.checkIsOnMainThread();
        this.surfaceValid = false;
        if (EglRenderer.DEBUG) {
            String str = this.TAG;
            C61064p.m237486b(str, this + " Surface destroyed");
        }
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer("surface");
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        setBackground(new ColorDrawable(getResources().getColor(17170445)));
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        String str = this.TAG;
        C61064p.m237485a(str, "[surfaceCreated] isShown=" + isShown() + " isAttachedToWindow=" + isAttachedToWindow());
        ThreadUtils.checkIsOnMainThread();
        getHolder().setSizeFromLayout();
        this.surfaceValid = true;
        if (EglRenderer.DEBUG) {
            String str2 = this.TAG;
            C61064p.m237486b(str2, this + " Surface created");
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        String str = this.TAG;
        C61064p.m237485a(str, "onVisibilityChanged changedView=" + view + " visibility=" + i);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer("surface");
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        setBackground(new ColorDrawable(getResources().getColor(17170445)));
    }

    public RectF setTranslate(float f, float f2, boolean z) {
        return this.eglRenderer.setTranslate(f, -f2, z);
    }

    public RectF setScale(float f, float f2, float f3, boolean z) {
        return this.eglRenderer.setScale(f, 1.0f - f2, f3, z);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, null, iArr, glDrawer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        String str = this.TAG;
        C61064p.m237485a(str, "[surfaceChanged]w=" + i2 + ", h=" + i3 + ", " + this.eglRenderer.hashCode() + " isShown=" + isShown() + " isAttachedToWindow=" + isAttachedToWindow());
        this.eglRenderer.releaseEglOnSurfaceSizeChanged();
        if (i2 > 0 && i3 > 0) {
            this.eglRenderer.createEglOnSurfaceSizeChanged(surfaceHolder.getSurface());
        }
        this.eglRenderer.postInvalidateRender();
        if (EglRenderer.DEBUG) {
            String str2 = this.TAG;
            C61064p.m237486b(str2, this + " surfaceChanged: w=" + i2 + ", h=" + i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio(i3 - i, i4 - i2);
    }
}

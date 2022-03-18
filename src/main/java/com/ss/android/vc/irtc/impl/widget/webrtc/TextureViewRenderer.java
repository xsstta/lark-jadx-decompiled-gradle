package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.impl.RtcServiceImpl;
import com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener;
import com.ss.android.vc.irtc.impl.widget.IVideoRenderListener;
import com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;

/* access modifiers changed from: package-private */
public class TextureViewRenderer extends TextureView implements TextureView.SurfaceTextureListener, RenderView {
    private final String TAG;
    private final EglRenderer eglRenderer;
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public RectF getOrgRect() {
        return this.eglRenderer.getOrgRect();
    }

    public RenderInfo getRenderInfo() {
        return this.eglRenderer.getRenderInfo();
    }

    public void reset() {
        this.eglRenderer.reset();
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void release() {
        String str = this.TAG;
        C61064p.m237486b(str, this + " release");
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

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - setScalingType]");
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
        this.eglRenderer.setRenderMode(scalingType);
    }

    public TextureViewRenderer(Context context) {
        super(context);
        this.TAG = "TextureViewRender#" + this;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        this.isRenderingPaused = false;
        this.resourceName = "texture";
        this.eglRenderer = new EglRenderer("texture");
        setSurfaceTextureListener(this);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void renderFrame(BvVideoFrame bvVideoFrame) {
        if (!isAttachedToWindow()) {
            String str = this.TAG;
            C61064p.m237487c(str, "【renderFrame]Surface is invalid, attach = " + isAttachedToWindow());
            return;
        }
        updateFrameDimensionsAndReportEvents(bvVideoFrame);
        this.eglRenderer.onFrame(bvVideoFrame);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - onSurfaceTextureDestroyed]");
        C61064p.m237485a(this.TAG, "surfaceTextureDestroyed");
        long currentTimeMillis = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.eglRenderer.releaseEglSurface(new Runnable(countDownLatch) {
            /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$xXXywdCqM5leaxXkxy473i7s2A */
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        RtcServiceImpl.getInstance().getLogCallback().statistics("surface_lifecycle_destroyed", jSONObject);
        return false;
    }

    private void updateFrameDimensionsAndReportEvents(BvVideoFrame bvVideoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isRenderingPaused) {
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    C61064p.m237486b(this.TAG, "Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFirstFrameRendered();
                    }
                }
                if (!(this.rotatedFrameWidth == bvVideoFrame.getRotatedWidth() && this.rotatedFrameHeight == bvVideoFrame.getRotatedHeight() && this.frameRotation == bvVideoFrame.getRotation())) {
                    String str = this.TAG;
                    C61064p.m237486b(str, "Reporting frame resolution changed to " + bvVideoFrame.getWidth() + "x" + bvVideoFrame.getHeight() + " with rotation " + bvVideoFrame.getRotation());
                    RendererCommon.RendererEvents rendererEvents3 = this.rendererEvents;
                    if (rendererEvents3 != null) {
                        rendererEvents3.onFrameResolutionChanged(bvVideoFrame.getWidth(), bvVideoFrame.getHeight(), bvVideoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = bvVideoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = bvVideoFrame.getRotatedHeight();
                    this.frameRotation = bvVideoFrame.getRotation();
                }
            }
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RenderView
    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - onMeasure]");
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        String str = this.TAG;
        C61064p.m237486b(str, "onMeasure(). New size: " + measure.x + "x" + measure.y);
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "TextureViewRender#" + this;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.layoutLock = new Object();
        this.isRenderingPaused = false;
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        this.eglRenderer = new EglRenderer(resourceName2);
        setSurfaceTextureListener(this);
    }

    public RectF setTranslate(float f, float f2, boolean z) {
        return this.eglRenderer.setTranslate(f, -f2, z);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.TAG;
        C61064p.m237485a(str, "surfaceAvailable: [w]" + i + "  [h]" + i2);
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - onSurfaceTextureAvailable]");
        this.eglRenderer.createEglSurface(surfaceTexture);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - onSurfaceTextureSizeChanged]");
        String str = this.TAG;
        C61064p.m237485a(str, "surfaceChanged: size: " + i + "x" + i2);
        this.eglRenderer.releaseEglOnSurfaceSizeChanged();
        this.eglRenderer.createEglOnSurfaceSizeChanged(surfaceTexture);
        this.eglRenderer.postInvalidateRender();
    }

    public RectF setScale(float f, float f2, float f3, boolean z) {
        return this.eglRenderer.setScale(f, 1.0f - f2, f3, z);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        C61064p.m237486b(this.TAG, "[init]");
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, iArr, glDrawer);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThreadSafely("[TextureViewRender - onLayout]");
        this.eglRenderer.setLayoutAspectRatio(i3 - i, i4 - i2);
    }
}

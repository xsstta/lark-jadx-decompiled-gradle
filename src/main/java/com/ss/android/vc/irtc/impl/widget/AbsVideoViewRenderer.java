package com.ss.android.vc.irtc.impl.widget;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.vc.irtc.impl.widget.webrtc.BvVideoFrame;
import com.ss.android.vc.irtc.impl.widget.webrtc.RenderInfo;
import org.webrtc.EglBase;

public abstract class AbsVideoViewRenderer extends FrameLayout {
    protected long delayLayoutMillis = -1;
    protected boolean hasInitEglBase;

    public abstract RectF getOrgRect();

    public abstract RenderInfo getRenderInfo();

    public abstract View getRenderView();

    public abstract void init(EglBase.Context context);

    public abstract void release();

    public abstract void renderFrame(BvVideoFrame bvVideoFrame);

    public abstract void reset();

    public void resetInit() {
        this.hasInitEglBase = false;
    }

    public abstract void setAutoRenderMode(boolean z);

    public abstract void setBgColor(int i);

    public abstract void setCornerRadius(float f);

    public abstract void setEnableHardwareScaler(boolean z);

    public abstract void setMaxScale(float f);

    public abstract void setRecalBaseFrameListener(IRecalBaseFrameListener iRecalBaseFrameListener);

    public abstract void setRenderListener(IVideoRenderListener iVideoRenderListener);

    public abstract void setRenderMode(int i);

    public abstract RectF setScale(float f, float f2, float f3, boolean z);

    public abstract RectF setTranslate(float f, float f2, boolean z);

    public abstract void setZOrderMediaOverlay(boolean z);

    public abstract void setZOrderOnTop(boolean z);

    public void setDelayLayout(long j) {
        this.delayLayoutMillis = j;
    }

    public AbsVideoViewRenderer(Context context) {
        super(context);
    }

    public AbsVideoViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

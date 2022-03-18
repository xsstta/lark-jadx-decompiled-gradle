package com.ss.android.vc.irtc.impl.widget.webrtc;

import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import org.webrtc.EglBase;

interface RenderView {
    void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents);

    void release();

    void renderFrame(BvVideoFrame bvVideoFrame);

    void setAutoRenderMode(boolean z);

    void setScalingType(RendererCommon.ScalingType scalingType);
}

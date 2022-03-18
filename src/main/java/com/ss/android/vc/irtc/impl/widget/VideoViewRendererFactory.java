package com.ss.android.vc.irtc.impl.widget;

import android.content.Context;
import com.ss.android.vc.irtc.impl.widget.webrtc.VideoViewSurfaceRenderer;
import com.ss.android.vc.irtc.impl.widget.webrtc.VideoViewTextureRenderer;

public final class VideoViewRendererFactory {
    public static AbsVideoViewRenderer createSurfaceRenderer(Context context) {
        return VideoViewSurfaceRenderer.create(context);
    }

    public static AbsVideoViewRenderer createTextureRenderer(Context context) {
        return VideoViewTextureRenderer.create(context);
    }
}

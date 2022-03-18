package com.ss.video.rtc.engine.ui;

import android.content.Context;
import android.util.AttributeSet;

public class SurfaceViewRenderer extends ByteSurfaceView {
    public void release() {
        super.onDispose();
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

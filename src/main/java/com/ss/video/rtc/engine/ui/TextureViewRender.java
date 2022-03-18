package com.ss.video.rtc.engine.ui;

import android.content.Context;
import android.util.AttributeSet;

public class TextureViewRender extends ByteSurfaceView {
    public void release() {
        super.onDispose();
    }

    public TextureViewRender(Context context) {
        super(context);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

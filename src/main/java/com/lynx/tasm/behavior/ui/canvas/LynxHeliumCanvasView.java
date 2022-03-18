package com.lynx.tasm.behavior.ui.canvas;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.TextureView;
import com.lynx.tasm.base.LLog;

public class LynxHeliumCanvasView extends TextureView {
    public LynxHeliumCanvasView(Context context) {
        super(context);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            LLog.m96427d("LynxHeliumCanvasView", "TextureView doesn't support displaying a foreground drawable");
        }
        super.setBackgroundDrawable(null);
    }

    public void setForeground(Drawable drawable) {
        if (drawable != null) {
            LLog.m96427d("LynxHeliumCanvasView", "TextureView doesn't support displaying a foreground drawable");
        }
        super.setForeground(null);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

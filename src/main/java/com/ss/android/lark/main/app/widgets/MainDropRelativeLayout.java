package com.ss.android.lark.main.app.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.widget.RelativeLayout;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

public class MainDropRelativeLayout extends RelativeLayout {
    public MainDropRelativeLayout(Context context) {
        super(context);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (DesktopUtil.m144301a(getContext())) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public MainDropRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MainDropRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

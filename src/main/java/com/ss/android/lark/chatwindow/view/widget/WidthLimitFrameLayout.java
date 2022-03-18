package com.ss.android.lark.chatwindow.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

public class WidthLimitFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f91335a = UIHelper.dp2px(1300.0f);

    public void setMaxWidth(int i) {
        if (i > 0) {
            this.f91335a = i;
            requestLayout();
        }
    }

    public WidthLimitFrameLayout(Context context) {
        super(context);
    }

    public WidthLimitFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (DesktopUtil.m144301a(getContext())) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f91335a;
            if (size > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public WidthLimitFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

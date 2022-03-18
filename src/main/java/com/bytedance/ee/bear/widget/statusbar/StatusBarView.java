package com.bytedance.ee.bear.widget.statusbar;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class StatusBarView extends View {

    /* renamed from: a */
    private int f31679a;

    public StatusBarView(Context context) {
        this(context, null);
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31679a = C11797i.m48882a(context);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.f31679a);
    }
}

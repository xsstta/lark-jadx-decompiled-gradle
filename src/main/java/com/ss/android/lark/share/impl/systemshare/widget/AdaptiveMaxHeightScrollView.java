package com.ss.android.lark.share.impl.systemshare.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ScrollView;

public class AdaptiveMaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private final Context f135283a;

    public AdaptiveMaxHeightScrollView(Context context) {
        this(context, null);
    }

    public AdaptiveMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            Display defaultDisplay = ((Activity) this.f135283a).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i2 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels / 2, Integer.MIN_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onMeasure(i, i2);
    }

    public AdaptiveMaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f135283a = context;
    }
}

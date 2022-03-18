package com.ss.android.lark.threadtab.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.lark.C29990c;

public class PerfMonitorConstraintLayout extends ConstraintLayout {

    /* renamed from: a */
    private boolean f138346a;

    /* renamed from: b */
    private boolean f138347b;

    public PerfMonitorConstraintLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f138347b) {
            C29990c.m110930b().mo134577e().mo120975f();
            this.f138347b = true;
        }
    }

    public PerfMonitorConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onMeasure(int i, int i2) {
        if (!this.f138346a) {
            C29990c.m110930b().mo134577e().mo120974e();
            this.f138346a = true;
        }
        super.onMeasure(i, i2);
    }

    public PerfMonitorConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

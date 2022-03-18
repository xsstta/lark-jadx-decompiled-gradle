package com.ss.android.lark.chatwindow.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.lark.C29990c;

public class PerfMonitorFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f91314a;

    /* renamed from: b */
    private boolean f91315b;

    public PerfMonitorFrameLayout(Context context) {
        super(context);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f91315b) {
            C29990c.m110930b().mo134577e().mo120975f();
            this.f91315b = true;
        }
    }

    public PerfMonitorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f91314a) {
            C29990c.m110930b().mo134577e().mo120974e();
            this.f91314a = true;
        }
        super.onMeasure(i, i2);
    }

    public PerfMonitorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

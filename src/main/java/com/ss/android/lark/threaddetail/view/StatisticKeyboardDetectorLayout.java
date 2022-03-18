package com.ss.android.lark.threaddetail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;

public class StatisticKeyboardDetectorLayout extends SysKeyBoardObserveFrameLayout {

    /* renamed from: d */
    private boolean f137853d;

    /* renamed from: e */
    private boolean f137854e;

    public StatisticKeyboardDetectorLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f137854e) {
            C29990c.m110930b().mo134577e().mo120975f();
            this.f137854e = true;
        }
    }

    public StatisticKeyboardDetectorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout
    public void onMeasure(int i, int i2) {
        if (!this.f137853d) {
            C29990c.m110930b().mo134577e().mo120974e();
            this.f137853d = true;
        }
        super.onMeasure(i, i2);
    }

    public StatisticKeyboardDetectorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.ss.android.lark.reaction.widget.detailwindow.scroller;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.h */
public class C53038h implements AbstractC53033c {

    /* renamed from: a */
    private final Interpolator f131035a;

    public C53038h(Interpolator interpolator) {
        this.f131035a = interpolator;
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53033c
    /* renamed from: a */
    public void mo181136a(ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(this.f131035a);
    }
}

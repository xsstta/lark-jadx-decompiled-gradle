package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.w */
public class C30158w extends AbstractC30124b {

    /* renamed from: e */
    private final float f75199e = 0.81f;

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30124b
    /* renamed from: a */
    public FrameLayout.LayoutParams mo108615a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f75132d * 2);
        layoutParams.gravity = 48;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30124b
    public int getCircleLeft() {
        int round = Math.round(((float) this.f75129a) * 0.81f) - getCircleRadius();
        if ((getCircleRadius() * 2) + round <= this.f75129a) {
            return round;
        }
        if (this.f75129a > getCircleRadius() * 2) {
            return this.f75129a - (getCircleRadius() * 2);
        }
        return this.f75129a / 2;
    }

    public C30158w(Context context) {
        super(context);
    }
}

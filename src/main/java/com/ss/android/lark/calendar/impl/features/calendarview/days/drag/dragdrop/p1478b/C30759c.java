package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.b.c */
public class C30759c extends AbstractC30757a {

    /* renamed from: e */
    private final float f77267e = 0.19f;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a
    /* renamed from: a */
    public FrameLayout.LayoutParams mo111211a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f77257d * 2);
        layoutParams.gravity = 80;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a
    public int getCircleLeft() {
        int round = Math.round(((float) this.f77254a) * 0.19f) - getCircleRadius();
        if (round >= 0) {
            return round;
        }
        if (this.f77254a > getCircleRadius() * 2) {
            return 0;
        }
        return this.f77254a / 2;
    }

    public C30759c(Context context) {
        super(context);
    }
}

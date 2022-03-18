package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.b.e */
public class C30761e extends AbstractC30757a {

    /* renamed from: e */
    private final float f77275e = 0.81f;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a
    /* renamed from: a */
    public FrameLayout.LayoutParams mo111211a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f77257d * 2);
        layoutParams.gravity = 48;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a
    public int getCircleLeft() {
        int round = Math.round(((float) this.f77254a) * 0.81f) - getCircleRadius();
        if ((getCircleRadius() * 2) + round <= this.f77254a) {
            return round;
        }
        if (this.f77254a > getCircleRadius() * 2) {
            return this.f77254a - (getCircleRadius() * 2);
        }
        return this.f77254a / 2;
    }

    public C30761e(Context context) {
        super(context);
    }
}

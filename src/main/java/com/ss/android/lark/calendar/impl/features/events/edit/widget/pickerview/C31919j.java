package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import java.util.TimerTask;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.j */
public final class C31919j extends TimerTask {

    /* renamed from: a */
    final WheelView f81530a;

    /* renamed from: b */
    int f81531b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f81532c;

    /* renamed from: d */
    int f81533d;

    public final void run() {
        if (this.f81531b == Integer.MAX_VALUE) {
            this.f81531b = this.f81533d;
        }
        int i = this.f81531b;
        int i2 = (int) (((float) i) * 0.1f);
        this.f81532c = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f81532c = -1;
            } else {
                this.f81532c = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f81530a.mo116462a();
            this.f81530a.f81435b.sendEmptyMessage(3000);
            return;
        }
        this.f81530a.f81455v += (float) this.f81532c;
        if (!this.f81530a.f81451r) {
            float f = this.f81530a.f81445l;
            float f2 = ((float) (-this.f81530a.f81456w)) * f;
            float itemsCount = ((float) ((this.f81530a.getItemsCount() - 1) - this.f81530a.f81456w)) * f;
            if (this.f81530a.f81455v <= f2 || this.f81530a.f81455v >= itemsCount) {
                this.f81530a.f81455v -= (float) this.f81532c;
                this.f81530a.mo116462a();
                this.f81530a.f81435b.sendEmptyMessage(3000);
                return;
            }
        }
        this.f81530a.mo116467b((float) this.f81532c);
        this.f81530a.f81435b.sendEmptyMessage(1000);
        this.f81531b -= this.f81532c;
    }

    C31919j(WheelView wheelView, int i) {
        this.f81530a = wheelView;
        this.f81533d = i;
    }
}

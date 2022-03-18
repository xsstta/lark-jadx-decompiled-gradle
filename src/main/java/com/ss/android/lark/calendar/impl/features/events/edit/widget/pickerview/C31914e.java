package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.TimerTask;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.e */
public final class C31914e extends TimerTask {

    /* renamed from: a */
    final float f81524a;

    /* renamed from: b */
    final WheelView f81525b;

    /* renamed from: c */
    float f81526c = 2.14748365E9f;

    public final void run() {
        if (this.f81526c == 2.14748365E9f) {
            if (Math.abs(this.f81524a) <= 2000.0f) {
                this.f81526c = this.f81524a;
            } else if (this.f81524a > BitmapDescriptorFactory.HUE_RED) {
                this.f81526c = 2000.0f;
            } else {
                this.f81526c = -2000.0f;
            }
        }
        if (Math.abs(this.f81526c) < BitmapDescriptorFactory.HUE_RED || Math.abs(this.f81526c) > 20.0f) {
            int i = (int) ((this.f81526c * 10.0f) / 1000.0f);
            float f = (float) i;
            this.f81525b.f81455v -= f;
            if (!this.f81525b.f81451r) {
                float f2 = this.f81525b.f81445l;
                float f3 = ((float) (-this.f81525b.f81456w)) * f2;
                float itemsCount = ((float) ((this.f81525b.getItemsCount() - 1) - this.f81525b.f81456w)) * f2;
                double d = ((double) f2) * 0.25d;
                if (((double) this.f81525b.f81455v) - d < ((double) f3)) {
                    f3 = this.f81525b.f81455v + f;
                } else if (((double) this.f81525b.f81455v) + d > ((double) itemsCount)) {
                    itemsCount = this.f81525b.f81455v + f;
                }
                if (this.f81525b.f81455v <= f3) {
                    this.f81526c = 40.0f;
                    this.f81525b.f81455v = (float) ((int) f3);
                } else if (this.f81525b.f81455v >= itemsCount) {
                    this.f81525b.f81455v = (float) ((int) itemsCount);
                    this.f81526c = -40.0f;
                }
            }
            float f4 = this.f81526c;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                this.f81526c = f4 + 20.0f;
            } else {
                this.f81526c = f4 - 20.0f;
            }
            this.f81525b.mo116467b((float) (-i));
            this.f81525b.f81435b.sendEmptyMessage(1000);
            return;
        }
        this.f81525b.mo116462a();
        this.f81525b.f81435b.sendEmptyMessage(2000);
    }

    C31914e(WheelView wheelView, float f) {
        this.f81525b = wheelView;
        this.f81524a = f;
    }
}

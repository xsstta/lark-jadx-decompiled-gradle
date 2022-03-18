package com.ss.android.lark.widget.wheelpicker;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.TimerTask;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.widget.wheelpicker.c */
public final class C59258c extends TimerTask {

    /* renamed from: a */
    final float f147209a;

    /* renamed from: b */
    final WheelView f147210b;

    /* renamed from: c */
    float f147211c = 2.14748365E9f;

    public final void run() {
        if (this.f147211c == 2.14748365E9f) {
            if (Math.abs(this.f147209a) <= 2000.0f) {
                this.f147211c = this.f147209a;
            } else if (this.f147209a > BitmapDescriptorFactory.HUE_RED) {
                this.f147211c = 2000.0f;
            } else {
                this.f147211c = -2000.0f;
            }
        }
        if (Math.abs(this.f147211c) < BitmapDescriptorFactory.HUE_RED || Math.abs(this.f147211c) > 20.0f) {
            WheelView wheelView = this.f147210b;
            float f = (float) ((int) ((this.f147211c * 40.0f) / 1000.0f));
            wheelView.f147204x -= f;
            if (!this.f147210b.f147200t) {
                float f2 = this.f147210b.f147194n;
                float f3 = ((float) (-this.f147210b.f147205y)) * f2;
                float itemsCount = ((float) ((this.f147210b.getItemsCount() - 1) - this.f147210b.f147205y)) * f2;
                double d = ((double) f2) * 0.25d;
                if (((double) this.f147210b.f147204x) - d < ((double) f3)) {
                    f3 = this.f147210b.f147204x + f;
                } else if (((double) this.f147210b.f147204x) + d > ((double) itemsCount)) {
                    itemsCount = this.f147210b.f147204x + f;
                }
                if (this.f147210b.f147204x <= f3) {
                    this.f147211c = 40.0f;
                    this.f147210b.f147204x = (float) ((int) f3);
                } else if (this.f147210b.f147204x >= itemsCount) {
                    this.f147210b.f147204x = (float) ((int) itemsCount);
                    this.f147211c = -40.0f;
                }
            }
            float f4 = this.f147211c;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                this.f147211c = f4 + 20.0f;
            } else {
                this.f147211c = f4 - 20.0f;
            }
            this.f147210b.f147184d.sendEmptyMessage(1000);
            return;
        }
        this.f147210b.mo201488d();
        this.f147210b.f147184d.sendEmptyMessage(2000);
    }

    C59258c(WheelView wheelView, float f) {
        this.f147210b = wheelView;
        this.f147209a = f;
    }
}

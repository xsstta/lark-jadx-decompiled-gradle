package com.ss.android.lark.widget.wheelpicker;

import java.util.TimerTask;

/* renamed from: com.ss.android.lark.widget.wheelpicker.i */
public final class C59264i extends TimerTask {

    /* renamed from: a */
    final WheelView f147217a;

    /* renamed from: b */
    int f147218b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f147219c;

    /* renamed from: d */
    int f147220d;

    public final void run() {
        if (this.f147218b == Integer.MAX_VALUE) {
            this.f147218b = this.f147220d;
        }
        int i = this.f147218b;
        int i2 = (int) (((float) i) * 0.1f);
        this.f147219c = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f147219c = -1;
            } else {
                this.f147219c = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f147217a.mo201488d();
            this.f147217a.f147184d.sendEmptyMessage(3000);
            return;
        }
        this.f147217a.f147204x += (float) this.f147219c;
        if (!this.f147217a.f147200t) {
            float f = this.f147217a.f147194n;
            float f2 = ((float) (-this.f147217a.f147205y)) * f;
            float itemsCount = ((float) ((this.f147217a.getItemsCount() - 1) - this.f147217a.f147205y)) * f;
            if (this.f147217a.f147204x <= f2 || this.f147217a.f147204x >= itemsCount) {
                this.f147217a.f147204x -= (float) this.f147219c;
                this.f147217a.mo201488d();
                this.f147217a.f147184d.sendEmptyMessage(3000);
                return;
            }
        }
        this.f147217a.f147184d.sendEmptyMessage(1000);
        this.f147218b -= this.f147219c;
    }

    public C59264i(WheelView wheelView, int i) {
        this.f147217a = wheelView;
        this.f147220d = i;
    }
}

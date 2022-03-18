package com.bytedance.ee.bear.widgets.wheelview.p575d;

import android.os.Process;
import com.bytedance.ee.bear.widgets.wheelview.view.WheelView;
import java.util.TimerTask;

/* renamed from: com.bytedance.ee.bear.widgets.wheelview.d.c */
public final class C11884c extends TimerTask {

    /* renamed from: a */
    private int f32138a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f32139b;

    /* renamed from: c */
    private int f32140c;

    /* renamed from: d */
    private final WheelView f32141d;

    public final void run() {
        Process.setThreadPriority(5);
        if (this.f32138a == Integer.MAX_VALUE) {
            this.f32138a = this.f32140c;
        }
        int i = this.f32138a;
        int i2 = (int) (((float) i) * 0.1f);
        this.f32139b = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f32139b = -1;
            } else {
                this.f32139b = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f32141d.mo45700a();
            this.f32141d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f32141d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + ((float) this.f32139b));
        if (!this.f32141d.mo45705d()) {
            float itemHeight = this.f32141d.getItemHeight();
            float f = ((float) (-this.f32141d.getInitPosition())) * itemHeight;
            float itemsCount = ((float) ((this.f32141d.getItemsCount() - 1) - this.f32141d.getInitPosition())) * itemHeight;
            if (this.f32141d.getTotalScrollY() <= f || this.f32141d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f32141d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - ((float) this.f32139b));
                this.f32141d.mo45700a();
                this.f32141d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f32141d.getHandler().sendEmptyMessage(1000);
        this.f32138a -= this.f32139b;
    }

    public C11884c(WheelView wheelView, int i) {
        this.f32141d = wheelView;
        this.f32140c = i;
    }
}

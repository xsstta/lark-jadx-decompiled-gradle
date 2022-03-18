package com.bytedance.ies.xelement.picker.p823f;

import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.TimerTask;

/* renamed from: com.bytedance.ies.xelement.picker.f.c */
public final class C14519c extends TimerTask {

    /* renamed from: a */
    private int f38332a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f38333b;

    /* renamed from: c */
    private int f38334c;

    /* renamed from: d */
    private final WheelView f38335d;

    public final void run() {
        if (this.f38332a == Integer.MAX_VALUE) {
            this.f38332a = this.f38334c;
        }
        int i = this.f38332a;
        int i2 = (int) (((float) i) * 0.1f);
        this.f38333b = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f38333b = -1;
            } else {
                this.f38333b = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f38335d.mo53422a();
            this.f38335d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f38335d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + ((float) this.f38333b));
        if (!this.f38335d.mo53427c()) {
            float itemHeight = this.f38335d.getItemHeight();
            float f = ((float) (-this.f38335d.getInitPosition())) * itemHeight;
            float itemsCount = ((float) ((this.f38335d.getItemsCount() - 1) - this.f38335d.getInitPosition())) * itemHeight;
            if (this.f38335d.getTotalScrollY() <= f || this.f38335d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f38335d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - ((float) this.f38333b));
                this.f38335d.mo53422a();
                this.f38335d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f38335d.getHandler().sendEmptyMessage(1000);
        this.f38332a -= this.f38333b;
    }

    public C14519c(WheelView wheelView, int i) {
        this.f38335d = wheelView;
        this.f38334c = i;
    }
}

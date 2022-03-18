package com.bytedance.ies.xelement.picker.p823f;

import com.bytedance.ies.xelement.picker.view.WheelView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.TimerTask;

/* renamed from: com.bytedance.ies.xelement.picker.f.a */
public final class C14517a extends TimerTask {

    /* renamed from: a */
    private float f38328a = 2.14748365E9f;

    /* renamed from: b */
    private final float f38329b;

    /* renamed from: c */
    private final WheelView f38330c;

    public final void run() {
        if (this.f38328a == 2.14748365E9f) {
            float f = 2000.0f;
            if (Math.abs(this.f38329b) > 2000.0f) {
                if (this.f38329b <= BitmapDescriptorFactory.HUE_RED) {
                    f = -2000.0f;
                }
                this.f38328a = f;
            } else {
                this.f38328a = this.f38329b;
            }
        }
        if (Math.abs(this.f38328a) < BitmapDescriptorFactory.HUE_RED || Math.abs(this.f38328a) > 20.0f) {
            WheelView wheelView = this.f38330c;
            float f2 = (float) ((int) (this.f38328a / 100.0f));
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            if (!this.f38330c.mo53427c()) {
                float itemHeight = this.f38330c.getItemHeight();
                float f3 = ((float) (-this.f38330c.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f38330c.getItemsCount() - 1) - this.f38330c.getInitPosition())) * itemHeight;
                double d = ((double) itemHeight) * 0.25d;
                if (((double) this.f38330c.getTotalScrollY()) - d < ((double) f3)) {
                    f3 = this.f38330c.getTotalScrollY() + f2;
                } else if (((double) this.f38330c.getTotalScrollY()) + d > ((double) itemsCount)) {
                    itemsCount = this.f38330c.getTotalScrollY() + f2;
                }
                if (this.f38330c.getTotalScrollY() <= f3) {
                    this.f38328a = 40.0f;
                    this.f38330c.setTotalScrollY((float) ((int) f3));
                } else if (this.f38330c.getTotalScrollY() >= itemsCount) {
                    this.f38330c.setTotalScrollY((float) ((int) itemsCount));
                    this.f38328a = -40.0f;
                }
            }
            float f4 = this.f38328a;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                this.f38328a = f4 + 20.0f;
            } else {
                this.f38328a = f4 - 20.0f;
            }
            this.f38330c.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f38330c.mo53422a();
        this.f38330c.getHandler().sendEmptyMessage(2000);
    }

    public C14517a(WheelView wheelView, float f) {
        this.f38330c = wheelView;
        this.f38329b = f;
    }
}

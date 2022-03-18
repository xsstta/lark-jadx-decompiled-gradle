package com.bytedance.ee.bear.widgets.wheelview.p575d;

import android.os.Process;
import com.bytedance.ee.bear.widgets.wheelview.view.WheelView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.TimerTask;

/* renamed from: com.bytedance.ee.bear.widgets.wheelview.d.a */
public final class C11882a extends TimerTask {

    /* renamed from: a */
    private float f32134a = 2.14748365E9f;

    /* renamed from: b */
    private final float f32135b;

    /* renamed from: c */
    private final WheelView f32136c;

    public final void run() {
        Process.setThreadPriority(5);
        if (this.f32134a == 2.14748365E9f) {
            float f = 2000.0f;
            if (Math.abs(this.f32135b) > 2000.0f) {
                if (this.f32135b <= BitmapDescriptorFactory.HUE_RED) {
                    f = -2000.0f;
                }
                this.f32134a = f;
            } else {
                this.f32134a = this.f32135b;
            }
        }
        if (Math.abs(this.f32134a) < BitmapDescriptorFactory.HUE_RED || Math.abs(this.f32134a) > 20.0f) {
            WheelView wheelView = this.f32136c;
            float f2 = (float) ((int) (this.f32134a / 100.0f));
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            if (!this.f32136c.mo45705d()) {
                float itemHeight = this.f32136c.getItemHeight();
                float f3 = ((float) (-this.f32136c.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f32136c.getItemsCount() - 1) - this.f32136c.getInitPosition())) * itemHeight;
                double d = ((double) itemHeight) * 0.25d;
                if (((double) this.f32136c.getTotalScrollY()) - d < ((double) f3)) {
                    f3 = this.f32136c.getTotalScrollY() + f2;
                } else if (((double) this.f32136c.getTotalScrollY()) + d > ((double) itemsCount)) {
                    itemsCount = this.f32136c.getTotalScrollY() + f2;
                }
                if (this.f32136c.getTotalScrollY() <= f3) {
                    this.f32134a = 40.0f;
                    this.f32136c.setTotalScrollY((float) ((int) f3));
                } else if (this.f32136c.getTotalScrollY() >= itemsCount) {
                    this.f32136c.setTotalScrollY((float) ((int) itemsCount));
                    this.f32134a = -40.0f;
                }
            }
            float f4 = this.f32134a;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                this.f32134a = f4 + this.f32136c.getResistance();
            } else {
                this.f32134a = f4 - this.f32136c.getResistance();
            }
            this.f32136c.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f32136c.mo45700a();
        this.f32136c.getHandler().sendEmptyMessage(2000);
    }

    public C11882a(WheelView wheelView, float f) {
        this.f32136c = wheelView;
        this.f32135b = f;
    }
}

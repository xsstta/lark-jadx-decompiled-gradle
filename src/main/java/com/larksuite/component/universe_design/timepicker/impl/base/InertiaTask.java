package com.larksuite.component.universe_design.timepicker.impl.base;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/InertiaTask;", "Ljava/lang/Runnable;", "wheelView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "velocityY", "", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;F)V", "realVelocityY", "adjustForOneWay", "", "partScrollY", "run", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.d */
public final class InertiaTask implements Runnable {

    /* renamed from: a */
    private float f63725a;

    /* renamed from: b */
    private final WheelView f63726b;

    public void run() {
        float f;
        float abs = Math.abs(this.f63725a);
        if (abs < BitmapDescriptorFactory.HUE_RED || abs > 20.0f) {
            float f2 = (this.f63725a * 10.0f) / 1000.0f;
            WheelView wheelView = this.f63726b;
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            m93154a(f2);
            float f3 = this.f63725a;
            if (f3 < BitmapDescriptorFactory.HUE_RED) {
                f = f3 + 20.0f;
            } else {
                f = f3 - 20.0f;
            }
            this.f63725a = f;
            this.f63726b.checkLoopChange(-f2);
            this.f63726b.getWheelHandler().sendEmptyMessage(1000);
            return;
        }
        this.f63726b.cancelFuture();
        this.f63726b.getWheelHandler().sendEmptyMessage(2000);
    }

    /* renamed from: a */
    private final void m93154a(float f) {
        if (!this.f63726b.isLoop()) {
            float itemHeight = this.f63726b.getItemHeight();
            float f2 = ((float) (-this.f63726b.getInitPosition())) * itemHeight;
            float itemsCount = ((float) ((this.f63726b.getItemsCount() - 1) - this.f63726b.getInitPosition())) * itemHeight;
            double d = ((double) itemHeight) * 0.25d;
            if (((double) this.f63726b.getTotalScrollY()) - d < ((double) f2)) {
                f2 = this.f63726b.getTotalScrollY() + f;
            } else if (((double) this.f63726b.getTotalScrollY()) + d > ((double) itemsCount)) {
                itemsCount = this.f63726b.getTotalScrollY() + f;
            }
            if (this.f63726b.getTotalScrollY() <= f2) {
                this.f63725a = 40.0f;
                this.f63726b.setTotalScrollY(f2);
            } else if (this.f63726b.getTotalScrollY() >= itemsCount) {
                this.f63726b.setTotalScrollY(itemsCount);
                this.f63725a = -40.0f;
            }
        }
    }

    public InertiaTask(WheelView wheelView, float f) {
        Intrinsics.checkParameterIsNotNull(wheelView, "wheelView");
        this.f63726b = wheelView;
        if (Math.abs(f) > 2000.0f) {
            if (f > BitmapDescriptorFactory.HUE_RED) {
                f = 2000.0f;
            } else {
                f = -2000.0f;
            }
        }
        this.f63725a = f;
    }
}

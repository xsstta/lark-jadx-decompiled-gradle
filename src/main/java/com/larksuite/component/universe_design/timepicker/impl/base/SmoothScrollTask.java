package com.larksuite.component.universe_design.timepicker.impl.base;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/SmoothScrollTask;", "Ljava/lang/Runnable;", "wheelView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "realTotalOffset", "", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;F)V", "realOffset", "getRealOffset", "()F", "setRealOffset", "(F)V", "getRealTotalOffset", "setRealTotalOffset", "run", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.g */
public final class SmoothScrollTask implements Runnable {

    /* renamed from: a */
    private float f63730a;

    /* renamed from: b */
    private final WheelView f63731b;

    /* renamed from: c */
    private float f63732c;

    public void run() {
        float f;
        float f2 = this.f63732c;
        float f3 = 0.1f * f2;
        this.f63730a = f3;
        if (f3 == BitmapDescriptorFactory.HUE_RED) {
            if (f2 < ((float) 0)) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            this.f63730a = f;
        }
        if (Math.abs(f2) <= ((float) 1)) {
            this.f63731b.cancelFuture();
            this.f63731b.getWheelHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f63731b;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f63730a);
        if (!this.f63731b.isLoop()) {
            float itemHeight = this.f63731b.getItemHeight();
            float f4 = ((float) (-this.f63731b.getInitPosition())) * itemHeight;
            float itemsCount = ((float) ((this.f63731b.getItemsCount() - 1) - this.f63731b.getInitPosition())) * itemHeight;
            if (this.f63731b.getTotalScrollY() <= f4 || this.f63731b.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f63731b;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - this.f63730a);
                this.f63731b.cancelFuture();
                this.f63731b.getWheelHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f63731b.checkLoopChange(this.f63730a);
        this.f63731b.getWheelHandler().sendEmptyMessage(1000);
        this.f63732c -= this.f63730a;
    }

    public SmoothScrollTask(WheelView wheelView, float f) {
        Intrinsics.checkParameterIsNotNull(wheelView, "wheelView");
        this.f63731b = wheelView;
        this.f63732c = f;
    }
}

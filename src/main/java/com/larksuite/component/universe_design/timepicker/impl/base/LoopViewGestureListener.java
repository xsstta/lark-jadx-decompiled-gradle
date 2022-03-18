package com.larksuite.component.universe_design.timepicker.impl.base;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/base/LoopViewGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "loopView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;)V", "getLoopView", "()Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.base.e */
public final class LoopViewGestureListener extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final WheelView f63727a;

    public LoopViewGestureListener(WheelView wheelView) {
        Intrinsics.checkParameterIsNotNull(wheelView, "loopView");
        this.f63727a = wheelView;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f63727a.scrollBy(f2);
        return true;
    }
}

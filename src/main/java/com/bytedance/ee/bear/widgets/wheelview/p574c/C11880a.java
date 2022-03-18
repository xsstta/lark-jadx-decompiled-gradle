package com.bytedance.ee.bear.widgets.wheelview.p574c;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.ee.bear.widgets.wheelview.view.WheelView;

/* renamed from: com.bytedance.ee.bear.widgets.wheelview.c.a */
public final class C11880a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final WheelView f32133a;

    public C11880a(WheelView wheelView) {
        this.f32133a = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f32133a.mo45701a(f2);
        return true;
    }
}

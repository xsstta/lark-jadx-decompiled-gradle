package com.bytedance.ies.xelement.picker.p822e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.ies.xelement.picker.view.WheelView;

/* renamed from: com.bytedance.ies.xelement.picker.e.d */
public final class C14510d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final WheelView f38327a;

    public C14510d(WheelView wheelView) {
        this.f38327a = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f38327a.mo53423a(f2);
        return true;
    }
}

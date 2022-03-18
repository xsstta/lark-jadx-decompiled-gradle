package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.f */
public final class C31915f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final WheelView f81527a;

    C31915f(WheelView wheelView) {
        this.f81527a = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f81527a.mo116463a(f2);
        return true;
    }
}

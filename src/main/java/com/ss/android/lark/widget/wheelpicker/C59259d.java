package com.ss.android.lark.widget.wheelpicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.widget.wheelpicker.d */
public final class C59259d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final WheelView f147212a;

    C59259d(WheelView wheelView) {
        this.f147212a = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f147212a.mo201483a(f2);
        return true;
    }
}

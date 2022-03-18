package com.bytedance.ee.bear.sheet.tab.view;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.bytedance.ee.bear.sheet.tab.view.d */
class View$OnTouchListenerC11319d implements View.OnTouchListener {

    /* renamed from: a */
    private GestureDetector f30440a;

    View$OnTouchListenerC11319d() {
    }

    /* renamed from: a */
    public void mo43433a(GestureDetector gestureDetector) {
        this.f30440a = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f30440a;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }
}

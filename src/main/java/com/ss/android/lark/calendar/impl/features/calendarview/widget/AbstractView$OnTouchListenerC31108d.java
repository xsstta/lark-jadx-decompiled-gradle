package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.calendar.impl.utils.ao;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.d */
public abstract class AbstractView$OnTouchListenerC31108d implements View.OnTouchListener {

    /* renamed from: a */
    private float f78578a;

    /* renamed from: b */
    private float f78579b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo108680a(View view, float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo108681b(View view, float f, float f2) {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.onTouchEvent(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f78578a = motionEvent.getX();
            float y = motionEvent.getY();
            this.f78579b = y;
            return true ^ mo108681b(view, this.f78578a, y);
        } else if (action != 1) {
            return true;
        } else {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (ao.m125229a(this.f78578a, this.f78579b, x, y2)) {
                return true;
            }
            mo108680a(view, x, y2);
            return true;
        }
    }
}

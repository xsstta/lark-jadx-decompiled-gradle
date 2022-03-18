package com.ss.android.lark.mail.impl.widget.time;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.lark.mail.impl.C41816b;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.o */
public abstract class AbstractView$OnTouchListenerC44133o implements View.OnTouchListener {

    /* renamed from: a */
    private float f112074a;

    /* renamed from: b */
    private float f112075b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo156802a(View view, float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo157078b(View view, float f, float f2) {
        return false;
    }

    /* renamed from: a */
    public static int m174955a() {
        return ViewConfiguration.get(C41816b.m166115a().mo150132b()).getScaledTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.onTouchEvent(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f112074a = motionEvent.getX();
            float y = motionEvent.getY();
            this.f112075b = y;
            return true ^ mo157078b(view, this.f112074a, y);
        } else if (action != 1) {
            return true;
        } else {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (m174956a(this.f112074a, this.f112075b, x, y2)) {
                return true;
            }
            mo156802a(view, x, y2);
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m174956a(float f, float f2, float f3, float f4) {
        if (Math.pow((double) (f3 - f), 2.0d) + Math.pow((double) (f4 - f2), 2.0d) >= Math.pow((double) m174955a(), 2.0d)) {
            return true;
        }
        return false;
    }
}

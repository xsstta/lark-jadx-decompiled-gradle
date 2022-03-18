package com.google.android.material.p983d;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.google.android.material.d.a */
public class View$OnTouchListenerC22219a implements View.OnTouchListener {

    /* renamed from: a */
    private final Dialog f54298a;

    /* renamed from: b */
    private final int f54299b;

    /* renamed from: c */
    private final int f54300c;

    /* renamed from: d */
    private final int f54301d;

    public View$OnTouchListenerC22219a(Dialog dialog, Rect rect) {
        this.f54298a = dialog;
        this.f54299b = rect.left;
        this.f54300c = rect.top;
        this.f54301d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f54299b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f54300c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f54301d;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f54298a.onTouchEvent(obtain);
    }
}

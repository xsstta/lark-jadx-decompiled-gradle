package com.ss.android.lark.desktopmode.p1788b.p1789a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.lark.desktopmode.C36512a;

/* renamed from: com.ss.android.lark.desktopmode.b.a.a */
public class DialogC36530a extends Dialog {

    /* renamed from: a */
    private DialogInterface.OnClickListener f94057a;

    public void show() {
        C36512a.m144041a().f94031a.mo134779a(this);
        super.show();
    }

    /* renamed from: a */
    public void mo134844a(DialogInterface.OnClickListener onClickListener) {
        this.f94057a = onClickListener;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            C36512a.m144041a().mo134777d();
        }
        super.onWindowFocusChanged(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        DialogInterface.OnClickListener onClickListener;
        if (!m144128a(getContext(), motionEvent) || (onClickListener = this.f94057a) == null) {
            return super.onTouchEvent(motionEvent);
        }
        onClickListener.onClick(this, motionEvent.getAction());
        return true;
    }

    public DialogC36530a(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    private boolean m144128a(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        if (x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop) {
            return true;
        }
        return false;
    }
}

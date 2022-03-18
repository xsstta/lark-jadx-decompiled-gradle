package com.ss.android.lark.passport.infra.widget.p2445c.p2447b;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.lark.passport.infra.widget.c.b.a */
public class C49259a {
    /* renamed from: a */
    private void m194124a(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    /* renamed from: a */
    public void mo171814a(Rect rect, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            m194124a(rect, (ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}

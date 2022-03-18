package com.larksuite.framework.ui.p1198b.p1200b;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.larksuite.framework.ui.b.b.a */
public class C26189a {
    /* renamed from: a */
    private void m94725a(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    /* renamed from: a */
    public void mo93165a(Rect rect, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            m94725a(rect, (ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}

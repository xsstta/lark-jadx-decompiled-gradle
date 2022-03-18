package com.ss.android.ad.splash.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ad.splash.utils.e */
public class C27475e extends TouchDelegate {

    /* renamed from: a */
    private View f68688a;

    /* renamed from: b */
    private Rect f68689b;

    /* renamed from: c */
    private Rect f68690c;

    /* renamed from: d */
    private boolean f68691d;

    /* renamed from: e */
    private int f68692e;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.utils.C27475e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C27475e(Rect rect, View view) {
        super(rect, view);
        this.f68689b = rect;
        this.f68692e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.f68690c = rect2;
        int i = this.f68692e;
        rect2.inset(-i, -i);
        this.f68688a = view;
    }
}

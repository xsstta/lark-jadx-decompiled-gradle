package com.ss.android.lark.calendar.impl.utils;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.lark.calendar.impl.utils.u */
public class C32670u {

    /* renamed from: a */
    private static volatile LayoutInflater f83815a;

    /* renamed from: a */
    public static LayoutInflater m125362a(Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread() || f83815a == null) {
            return LayoutInflater.from(context);
        }
        return f83815a;
    }

    /* renamed from: a */
    public static View m125363a(Context context, int i, ViewGroup viewGroup) {
        boolean z;
        if (viewGroup != null) {
            z = true;
        } else {
            z = false;
        }
        return m125364a(context, i, viewGroup, z);
    }

    /* renamed from: a */
    public static View m125364a(Context context, int i, ViewGroup viewGroup, boolean z) {
        LayoutInflater a = m125362a(context);
        for (int i2 = 2; i2 > 0; i2--) {
            try {
                return a.inflate(i, viewGroup, z);
            } catch (NullPointerException unused) {
                Thread.yield();
            }
        }
        return a.inflate(i, viewGroup, z);
    }
}

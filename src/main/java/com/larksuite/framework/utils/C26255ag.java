package com.larksuite.framework.utils;

import android.content.SharedPreferences;
import android.os.Looper;

/* renamed from: com.larksuite.framework.utils.ag */
public class C26255ag {
    /* renamed from: a */
    private static synchronized boolean m95010a() {
        boolean z;
        synchronized (C26255ag.class) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized void m95009a(SharedPreferences.Editor editor) {
        synchronized (C26255ag.class) {
            if (editor != null) {
                if (m95010a()) {
                    editor.apply();
                } else {
                    editor.commit();
                }
            }
        }
    }
}

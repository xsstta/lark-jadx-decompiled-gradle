package com.ss.android.lark.main.p2235b;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.main.b.d */
public class C44498d {

    /* renamed from: a */
    private static Map<String, WeakReference<View>> f112853a = new HashMap();

    /* renamed from: a */
    public static View m176512a(String str) {
        WeakReference<View> weakReference = f112853a.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static void m176513a(String str, View view) {
        f112853a.put(str, new WeakReference<>(view));
    }
}

package com.ss.android.lark.tour.spotlight;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.tour.spotlight.a */
public class C57298a {

    /* renamed from: a */
    private static final Map<String, WeakReference<View>> f141161a = new HashMap();

    /* renamed from: a */
    public static View m222015a(String str) {
        WeakReference<View> weakReference = f141161a.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static void m222016a(String str, View view) {
        f141161a.put(str, new WeakReference<>(view));
    }
}

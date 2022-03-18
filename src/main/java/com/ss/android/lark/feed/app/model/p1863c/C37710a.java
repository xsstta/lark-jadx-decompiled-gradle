package com.ss.android.lark.feed.app.model.p1863c;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.model.c.a */
public class C37710a {

    /* renamed from: a */
    private static final Map<String, WeakReference<Drawable>> f96666a = new HashMap(64);

    /* renamed from: a */
    public static void m148263a(String str) {
        f96666a.put(str, new WeakReference<>(null));
    }

    /* renamed from: b */
    public static Drawable m148265b(String str) {
        WeakReference<Drawable> weakReference = f96666a.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static void m148264a(String str, Drawable drawable) {
        if (drawable != null) {
            Map<String, WeakReference<Drawable>> map = f96666a;
            if (map.containsKey(str)) {
                map.put(str, new WeakReference<>(drawable));
            }
        }
    }
}

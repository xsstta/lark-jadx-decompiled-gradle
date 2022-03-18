package com.bytedance.framwork.core.sdklib.p752c;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.framwork.core.sdklib.c.d */
public class C14138d {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, AbstractC14137c> f37166a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, AbstractC14136b> f37167b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static AbstractC14137c m57207a(String str) {
        return f37166a.get(str);
    }

    /* renamed from: b */
    public static AbstractC14136b m57211b(String str) {
        return f37167b.get(str);
    }

    /* renamed from: a */
    public static void m57208a(String str, AbstractC14136b bVar) {
        f37167b.put(str, bVar);
    }

    /* renamed from: a */
    public static void m57209a(String str, AbstractC14137c cVar) {
        f37166a.put(str, cVar);
    }

    /* renamed from: a */
    public static boolean m57210a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return f37167b.get(str).mo51926b(str2);
    }
}

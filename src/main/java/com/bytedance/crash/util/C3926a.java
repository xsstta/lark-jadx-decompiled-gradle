package com.bytedance.crash.util;

import java.util.concurrent.Callable;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.util.a */
public final class C3926a {

    /* renamed from: a */
    private static Callable<JSONArray> f12022a;

    /* renamed from: a */
    public static JSONArray m16276a() {
        Callable<JSONArray> callable = f12022a;
        if (callable == null) {
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m16277a(Callable<JSONArray> callable) {
        f12022a = callable;
    }
}

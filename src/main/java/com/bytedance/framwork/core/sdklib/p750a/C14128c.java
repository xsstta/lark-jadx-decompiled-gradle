package com.bytedance.framwork.core.sdklib.p750a;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdklib.a.c */
public class C14128c {

    /* renamed from: a */
    private static AbstractC14127b f37118a = new C14126a();

    /* renamed from: b */
    private static ConcurrentHashMap<String, AbstractC14127b> f37119b;

    static {
        ConcurrentHashMap<String, AbstractC14127b> concurrentHashMap = new ConcurrentHashMap<>();
        f37119b = concurrentHashMap;
        concurrentHashMap.put("default", f37118a);
    }

    /* renamed from: a */
    public static int m57150a(String str) {
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            return f37118a.reportInterval();
        }
        return f37119b.get(str).reportInterval();
    }

    /* renamed from: b */
    public static int m57153b(String str) {
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            return f37118a.reportCount();
        }
        return f37119b.get(str).reportCount();
    }

    /* renamed from: c */
    public static JSONObject m57154c(String str) {
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            return f37118a.reportJsonHeaderInfo();
        }
        return f37119b.get(str).reportJsonHeaderInfo();
    }

    /* renamed from: d */
    public static int m57155d(String str) {
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            return f37118a.reportFailRepeatCount();
        }
        return f37119b.get(str).reportFailRepeatCount();
    }

    /* renamed from: e */
    public static int m57156e(String str) {
        int reportFailRepeatBaseTime;
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            reportFailRepeatBaseTime = f37118a.reportFailRepeatBaseTime();
        } else {
            reportFailRepeatBaseTime = f37119b.get(str).reportFailRepeatBaseTime();
        }
        return reportFailRepeatBaseTime * 1000;
    }

    /* renamed from: f */
    public static boolean m57157f(String str) {
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            return f37118a.getRemoveSwitch();
        }
        return f37119b.get(str).getRemoveSwitch();
    }

    /* renamed from: a */
    public static void m57152a(String str, AbstractC14127b bVar) {
        if (bVar != null) {
            f37119b.put(str, bVar);
        }
    }

    /* renamed from: a */
    public static List<String> m57151a(String str, String str2) {
        if (TextUtils.isEmpty(str) || f37119b.get(str) == null) {
            return f37118a.reportUrl(str2);
        }
        return f37119b.get(str).reportUrl(str2);
    }
}

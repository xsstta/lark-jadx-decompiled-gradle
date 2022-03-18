package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

public abstract class j1 {

    /* renamed from: a */
    public static h1 f58240a;

    /* renamed from: a */
    public static synchronized h1 m85771a() {
        h1 h1Var;
        synchronized (j1.class) {
            if (f58240a == null) {
                f58240a = m1.m85855c().mo83123b();
            }
            h1Var = f58240a;
        }
        return h1Var;
    }

    /* renamed from: a */
    public static void m85772a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m85771a() != null && u0.m85929b().mo83164a()) {
            if (i == 1 || i == 0) {
                f58240a.mo83016a(i, str, linkedHashMap);
                return;
            }
            C23625y.m85979d("hmsSdk", "Data type no longer collects range.type: " + i);
        }
    }

    /* renamed from: a */
    public static void m85773a(Context context, String str, String str2) {
        if (m85771a() != null) {
            f58240a.mo83017a(context, str, str2);
        }
    }

    /* renamed from: b */
    public static boolean m85774b() {
        return m1.m85855c().mo83122a();
    }

    /* renamed from: c */
    public static void m85775c() {
        if (m85771a() != null && u0.m85929b().mo83164a()) {
            f58240a.mo83015a(-1);
        }
    }
}

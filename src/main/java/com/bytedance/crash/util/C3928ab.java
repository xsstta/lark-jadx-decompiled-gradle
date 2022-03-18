package com.bytedance.crash.util;

import android.content.Context;
import com.bytedance.crash.C3774m;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.bytedance.crash.util.ab */
public class C3928ab {

    /* renamed from: a */
    private static Map<String, Object> f12027a;

    /* renamed from: a */
    public static Map<String, Object> m16294a() {
        m16295b();
        return f12027a;
    }

    /* renamed from: b */
    private static void m16295b() {
        Context j = C3774m.m15609j();
        if (f12027a == null) {
            f12027a = new HashMap();
            try {
                Properties properties = new Properties();
                properties.load(j.getAssets().open("slardar.properties"));
                for (Map.Entry entry : properties.entrySet()) {
                    f12027a.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }
}

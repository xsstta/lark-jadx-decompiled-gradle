package com.bytedance.apm.util;

import android.content.Context;
import com.bytedance.apm.C2785b;
import java.util.Properties;

/* renamed from: com.bytedance.apm.util.t */
public class C3137t {

    /* renamed from: a */
    private static Properties f10083a;

    /* renamed from: a */
    public static String m13074a() {
        return String.valueOf(m13073a("release_build"));
    }

    /* renamed from: b */
    private static void m13075b() {
        Context a = C2785b.m11735a();
        if (f10083a == null) {
            Properties properties = new Properties();
            f10083a = properties;
            try {
                properties.load(a.getApplicationContext().getAssets().open("slardar.properties"));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Object m13073a(String str) {
        m13075b();
        try {
            if (f10083a.containsKey(str)) {
                return f10083a.get(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}

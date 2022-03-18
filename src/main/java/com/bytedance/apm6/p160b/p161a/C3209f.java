package com.bytedance.apm6.p160b.p161a;

import android.app.Application;
import com.bytedance.apm6.foundation.p182a.C3318a;
import java.util.Properties;

/* renamed from: com.bytedance.apm6.b.a.f */
public class C3209f {

    /* renamed from: a */
    private static Properties f10265a;

    /* renamed from: a */
    public static String m13408a() {
        return String.valueOf(m13407a("release_build"));
    }

    /* renamed from: b */
    private static void m13409b() {
        Application w = C3318a.m13917w();
        if (f10265a == null) {
            Properties properties = new Properties();
            f10265a = properties;
            try {
                properties.load(w.getApplicationContext().getAssets().open("slardar.properties"));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Object m13407a(String str) {
        m13409b();
        try {
            if (f10265a.containsKey(str)) {
                return f10265a.get(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}

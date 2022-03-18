package com.bytedance.crash.p223g;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.crash.runtime.C3873q;
import java.util.UUID;

/* renamed from: com.bytedance.crash.g.a */
public class C3754a {

    /* renamed from: a */
    private static volatile UUID f11563a = null;

    /* renamed from: b */
    private static String f11564b = "";

    /* renamed from: a */
    private UUID m15521a() {
        return f11563a;
    }

    /* renamed from: a */
    public static synchronized String m15520a(Context context) {
        String str;
        UUID a;
        synchronized (C3754a.class) {
            if (TextUtils.isEmpty(f11564b) && (a = new C3754a(context).m15521a()) != null) {
                f11564b = a.toString();
            }
            str = f11564b;
        }
        return str;
    }

    private C3754a(Context context) {
        if (f11563a == null) {
            synchronized (C3754a.class) {
                if (f11563a == null) {
                    String str = null;
                    String b = C3873q.m16033a().mo15491b(null);
                    if (!TextUtils.isEmpty(b)) {
                        try {
                            f11563a = UUID.fromString(b);
                        } catch (Throwable unused) {
                            f11563a = UUID.randomUUID();
                        }
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused2) {
                        }
                        if (str != null) {
                            try {
                                f11563a = UUID.nameUUIDFromBytes(str.getBytes("utf8"));
                            } catch (Throwable unused3) {
                                f11563a = UUID.randomUUID();
                            }
                        } else {
                            f11563a = UUID.randomUUID();
                        }
                        C3873q.m16033a().mo15495d(String.valueOf(f11563a));
                    }
                }
            }
        }
    }
}

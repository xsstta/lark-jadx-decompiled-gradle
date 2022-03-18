package com.ss.android.lark.passport.infra.util.security;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import java.lang.reflect.Field;
import java.security.KeyStore;

/* renamed from: com.ss.android.lark.passport.infra.util.security.b */
public class C49213b {

    /* renamed from: a */
    private static volatile boolean f123529a = true;

    /* renamed from: b */
    private static boolean m194024b() {
        try {
            KeyStore.getInstance("AndroidKeyStore").load(null);
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.m165398w("AndroidKeyStoreFix", "load android key store failed", th);
            return true;
        }
    }

    /* renamed from: a */
    public static void m194023a() {
        if (f123529a) {
            synchronized (C49213b.class) {
                f123529a = m194024b();
                if (f123529a) {
                    boolean c = m194025c();
                    if (c) {
                        f123529a = false;
                    }
                    Log.m165389i("AndroidKeyStoreFix", "fix android key store, result: " + c);
                    return;
                }
            }
        }
        Log.m165389i("AndroidKeyStoreFix", "android key store don't need fix");
    }

    /* renamed from: c */
    private static boolean m194025c() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            declaredField.set(invoke, LarkContext.getApplication());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165384e("AndroidKeyStoreFix", "fixAndroidKeyStore failed", e);
            if (!C57852m.m224554a(LarkContext.getApplication())) {
                return false;
            }
            throw new RuntimeException(e);
        }
    }
}

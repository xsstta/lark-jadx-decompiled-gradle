package com.bytedance.ee.lark.infra.storage.p637a.p638a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ee.lark.infra.storage.a.a.c */
public class C12894c {

    /* renamed from: a */
    private static C12895a f34388a = new C12895a();

    /* renamed from: com.bytedance.ee.lark.infra.storage.a.a.c$a */
    public static class C12895a {

        /* renamed from: a */
        public boolean f34389a;

        /* renamed from: b */
        public boolean f34390b;
    }

    /* renamed from: b */
    public static float m53191b() {
        try {
            return ((Float) m53189a("android.os.FtBuild", "getRomVersion", new Object[0])).floatValue();
        } catch (ClassNotFoundException unused) {
            AppBrandLogger.m52830i("Util", "getRomVersion class not found!");
        } catch (Exception e) {
            AppBrandLogger.m52830i("Util", "getRomVersion Exception e = " + e);
        }
        return 2.5f;
    }

    /* renamed from: a */
    public static boolean m53190a() {
        if (!f34388a.f34389a) {
            float b = m53191b();
            if (m53192c() || b >= 3.6f) {
                f34388a.f34390b = true;
            }
            f34388a.f34389a = true;
        }
        return f34388a.f34390b;
    }

    /* renamed from: c */
    private static boolean m53192c() {
        String str = "no";
        try {
            str = (String) m53189a("android.os.SystemProperties", "get", "ro.vivo.product.overseas", str);
        } catch (ClassNotFoundException unused) {
            AppBrandLogger.m52830i("Util", "isExported class not found!");
        } catch (Exception e) {
            AppBrandLogger.m52830i("Util", "isExported Exception e = " + e);
        }
        return "yes".equals(str);
    }

    /* renamed from: a */
    private static Object m53189a(String str, String str2, Object... objArr) throws Exception {
        Class<?> cls = Class.forName(str);
        Class<?>[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method method = cls.getMethod(str2, clsArr);
        method.setAccessible(true);
        return method.invoke(null, objArr);
    }
}

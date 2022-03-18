package com.huawei.updatesdk.p1046b.p1047a.p1049b;

import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.PublicKey;

/* renamed from: com.huawei.updatesdk.b.a.b.c */
class C23876c {

    /* renamed from: com.huawei.updatesdk.b.a.b.c$a */
    static class C23877a {

        /* renamed from: a */
        ArrayMap<String, ArraySet<PublicKey>> f59119a = null;

        /* renamed from: b */
        ArraySet<String> f59120b = null;

        C23877a() {
        }
    }

    /* renamed from: a */
    static C23877a m87307a(File file) {
        C23877a aVar = new C23877a();
        Object b = m87309b(file);
        if (b != null) {
            Object a = m87308a(b, "mKeySetMapping");
            if (a instanceof ArrayMap) {
                aVar.f59119a = (ArrayMap) a;
            }
            Object a2 = m87308a(b, "mUpgradeKeySets");
            if (a2 instanceof ArraySet) {
                aVar.f59120b = (ArraySet) a2;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static Object m87308a(Object obj, String str) {
        String str2;
        try {
            return Class.forName("android.content.pm.PackageParser$Package").getDeclaredField(str).get(obj);
        } catch (ClassNotFoundException unused) {
            str2 = "can not find class,ClassNotFoundException";
        } catch (NoSuchFieldException unused2) {
            str2 = "can not find field,NoSuchFieldException";
        } catch (IllegalAccessException unused3) {
            str2 = "can not find field,IllegalAccessException";
        } catch (NoSuchFieldError unused4) {
            str2 = "can not find field,NoSuchFieldError";
        }
        C23834a.m87119c("KeySetsUtils", str2);
        return null;
    }

    /* renamed from: b */
    private static Object m87309b(File file) {
        String str;
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            return cls.getDeclaredMethod("parsePackage", File.class, Integer.TYPE).invoke(cls.newInstance(), file, 0);
        } catch (ClassNotFoundException unused) {
            str = "can not get PackageParser,ClassNotFoundException";
            C23834a.m87119c("KeySetsUtils", str);
            return null;
        } catch (NoSuchMethodException unused2) {
            str = "can not get PackageParser,NoSuchMethodException";
            C23834a.m87119c("KeySetsUtils", str);
            return null;
        } catch (InstantiationException unused3) {
            str = "can not get PackageParser,InstantiationException";
            C23834a.m87119c("KeySetsUtils", str);
            return null;
        } catch (IllegalAccessException unused4) {
            str = "can not get PackageParser,IllegalAccessException";
            C23834a.m87119c("KeySetsUtils", str);
            return null;
        } catch (InvocationTargetException unused5) {
            str = "can not get PackageParser,InvocationTargetException";
            C23834a.m87119c("KeySetsUtils", str);
            return null;
        } catch (Exception e) {
            str = "can not get PackageParser," + e.getMessage();
            C23834a.m87119c("KeySetsUtils", str);
            return null;
        }
    }
}

package org.chromium.support_lib_boundary.p3510a;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: org.chromium.support_lib_boundary.a.a */
public class C70015a {

    /* renamed from: a */
    static final /* synthetic */ boolean f174996a = true;

    /* renamed from: a */
    private static boolean m268594a() {
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            return f174996a;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> T m268593a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C70015a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: a */
    public static boolean m268595a(Collection<String> collection, String str) {
        if (f174996a || !str.endsWith(":dev")) {
            if (!collection.contains(str)) {
                if (m268594a()) {
                    if (collection.contains(str + ":dev")) {
                        return f174996a;
                    }
                }
                return false;
            }
            return f174996a;
        }
        throw new AssertionError();
    }
}

package com.ss.android.medialib.util;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.medialib.util.a */
public class C59431a {

    /* renamed from: a */
    private static Method f147542a;

    /* renamed from: b */
    private static Method f147543b;

    /* renamed from: c */
    private static Method f147544c;

    /* renamed from: d */
    private static Method f147545d;

    static {
        try {
            f147542a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            f147543b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f147544c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            f147545d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Method m230720a(Class<?> cls, String str, Class<?>... clsArr) throws Exception {
        Method method;
        Method method2;
        if (Build.VERSION.SDK_INT < 28 || (method2 = f147543b) == null) {
            method = null;
        } else {
            method = (Method) method2.invoke(cls, str, clsArr);
        }
        if (method == null) {
            return cls.getDeclaredMethod(str, clsArr);
        }
        return method;
    }
}

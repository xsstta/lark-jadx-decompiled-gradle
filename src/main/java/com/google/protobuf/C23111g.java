package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.g */
public class C23111g {

    /* renamed from: a */
    static final C23111g f57052a = new C23111g(true);

    /* renamed from: b */
    private static final Class<?> f57053b = m83797a();

    /* renamed from: c */
    private final Map<Object, Object<?, ?>> f57054c;

    /* renamed from: b */
    public static C23111g m83798b() {
        return C23110f.m83796b();
    }

    C23111g() {
        this.f57054c = new HashMap();
    }

    /* renamed from: a */
    static Class<?> m83797a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    C23111g(boolean z) {
        this.f57054c = Collections.emptyMap();
    }
}

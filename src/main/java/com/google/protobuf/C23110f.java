package com.google.protobuf;

/* access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.f */
public final class C23110f {

    /* renamed from: a */
    static final Class<?> f57051a = m83795a();

    /* renamed from: a */
    static Class<?> m83795a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C23111g m83796b() {
        if (f57051a != null) {
            try {
                return m83794a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C23111g.f57052a;
    }

    /* renamed from: a */
    private static final C23111g m83794a(String str) throws Exception {
        return (C23111g) f57051a.getMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}

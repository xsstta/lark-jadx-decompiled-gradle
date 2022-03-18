package org.apache.commons.compress.compressors.p3494a;

/* renamed from: org.apache.commons.compress.compressors.a.b */
public class C69782b {

    /* renamed from: a */
    private static volatile EnumC69783a f174323a = EnumC69783a.DONT_CACHE;

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.compress.compressors.a.b$a */
    public enum EnumC69783a {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    static {
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            m267793a(true);
        }
    }

    /* renamed from: b */
    private static boolean m267795b() {
        try {
            Class.forName("org.brotli.dec.BrotliInputStream");
            return true;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m267794a() {
        EnumC69783a aVar = f174323a;
        if (aVar == EnumC69783a.DONT_CACHE) {
            return m267795b();
        }
        if (aVar == EnumC69783a.CACHED_AVAILABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m267793a(boolean z) {
        EnumC69783a aVar;
        if (!z) {
            f174323a = EnumC69783a.DONT_CACHE;
        } else if (f174323a == EnumC69783a.DONT_CACHE) {
            if (m267795b()) {
                aVar = EnumC69783a.CACHED_AVAILABLE;
            } else {
                aVar = EnumC69783a.CACHED_UNAVAILABLE;
            }
            f174323a = aVar;
        }
    }
}

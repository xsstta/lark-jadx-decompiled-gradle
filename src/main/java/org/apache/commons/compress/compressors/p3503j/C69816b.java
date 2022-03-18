package org.apache.commons.compress.compressors.p3503j;

/* renamed from: org.apache.commons.compress.compressors.j.b */
public class C69816b {

    /* renamed from: a */
    private static final byte[] f174464a = {40, -75, 47, -3};

    /* renamed from: b */
    private static final byte[] f174465b = {42, 77, 24};

    /* renamed from: c */
    private static volatile EnumC69817a f174466c = EnumC69817a.DONT_CACHE;

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.compress.compressors.j.b$a */
    public enum EnumC69817a {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    /* renamed from: b */
    private static boolean m267916b() {
        try {
            Class.forName("com.github.luben.zstd.ZstdInputStream");
            return true;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            m267914a(true);
        }
    }

    /* renamed from: a */
    public static boolean m267915a() {
        EnumC69817a aVar = f174466c;
        if (aVar == EnumC69817a.DONT_CACHE) {
            return m267916b();
        }
        if (aVar == EnumC69817a.CACHED_AVAILABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m267914a(boolean z) {
        EnumC69817a aVar;
        if (!z) {
            f174466c = EnumC69817a.DONT_CACHE;
        } else if (f174466c == EnumC69817a.DONT_CACHE) {
            if (m267916b()) {
                aVar = EnumC69817a.CACHED_AVAILABLE;
            } else {
                aVar = EnumC69817a.CACHED_UNAVAILABLE;
            }
            f174466c = aVar;
        }
    }
}

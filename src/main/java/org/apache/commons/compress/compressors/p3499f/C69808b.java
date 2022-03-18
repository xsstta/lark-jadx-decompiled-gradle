package org.apache.commons.compress.compressors.p3499f;

import java.util.HashMap;
import org.apache.commons.compress.compressors.C69804e;

/* renamed from: org.apache.commons.compress.compressors.f.b */
public class C69808b {

    /* renamed from: a */
    private static final C69804e f174438a;

    /* renamed from: b */
    private static final byte[] f174439b = {93, 0, 0};

    /* renamed from: c */
    private static volatile EnumC69809a f174440c = EnumC69809a.DONT_CACHE;

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.compress.compressors.f.b$a */
    public enum EnumC69809a {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    /* renamed from: b */
    private static boolean m267886b() {
        try {
            C69807a.m267883a(null, 0);
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(".lzma", "");
        hashMap.put("-lzma", "");
        f174438a = new C69804e(hashMap, ".lzma");
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            m267884a(true);
        }
    }

    /* renamed from: a */
    public static boolean m267885a() {
        EnumC69809a aVar = f174440c;
        if (aVar == EnumC69809a.DONT_CACHE) {
            return m267886b();
        }
        if (aVar == EnumC69809a.CACHED_AVAILABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m267884a(boolean z) {
        EnumC69809a aVar;
        if (!z) {
            f174440c = EnumC69809a.DONT_CACHE;
        } else if (f174440c == EnumC69809a.DONT_CACHE) {
            if (m267886b()) {
                aVar = EnumC69809a.CACHED_AVAILABLE;
            } else {
                aVar = EnumC69809a.CACHED_UNAVAILABLE;
            }
            f174440c = aVar;
        }
    }
}

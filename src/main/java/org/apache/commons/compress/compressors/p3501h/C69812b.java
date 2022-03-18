package org.apache.commons.compress.compressors.p3501h;

import java.util.HashMap;
import org.apache.commons.compress.compressors.C69804e;

/* renamed from: org.apache.commons.compress.compressors.h.b */
public class C69812b {

    /* renamed from: a */
    private static final C69804e f174455a;

    /* renamed from: b */
    private static final byte[] f174456b = {-3, 55, 122, 88, 90, 0};

    /* renamed from: c */
    private static volatile EnumC69813a f174457c = EnumC69813a.DONT_CACHE;

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.compress.compressors.h.b$a */
    public enum EnumC69813a {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    /* renamed from: b */
    private static boolean m267908b() {
        try {
            C69811a.m267905a(null, 0);
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(".txz", ".tar");
        hashMap.put(".xz", "");
        hashMap.put("-xz", "");
        f174455a = new C69804e(hashMap, ".xz");
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            m267906a(true);
        }
    }

    /* renamed from: a */
    public static boolean m267907a() {
        EnumC69813a aVar = f174457c;
        if (aVar == EnumC69813a.DONT_CACHE) {
            return m267908b();
        }
        if (aVar == EnumC69813a.CACHED_AVAILABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m267906a(boolean z) {
        EnumC69813a aVar;
        if (!z) {
            f174457c = EnumC69813a.DONT_CACHE;
        } else if (f174457c == EnumC69813a.DONT_CACHE) {
            if (m267908b()) {
                aVar = EnumC69813a.CACHED_AVAILABLE;
            } else {
                aVar = EnumC69813a.CACHED_UNAVAILABLE;
            }
            f174457c = aVar;
        }
    }
}

package com.ss.android.vc.common.p3083e;

import com.larksuite.framework.utils.C26284k;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.common.e.q */
public class C60775q {
    /* renamed from: a */
    public static boolean m236138a() {
        return C26284k.m95185a(ar.m236694a());
    }

    /* renamed from: a */
    public static void m236136a(String str) {
        if (!C26284k.m95185a(ar.m236694a())) {
            C60700b.m235864f("VCDebugUtils", "[assertDebugError]", str);
            return;
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public static void m236137a(boolean z, String str) {
        if (z) {
            return;
        }
        if (!C26284k.m95185a(ar.m236694a())) {
            C60700b.m235864f("VCDebugUtils", "[assertDebug]", str);
            return;
        }
        throw new IllegalStateException(str);
    }
}

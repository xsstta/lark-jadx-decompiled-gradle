package com.ss.android.lark.exception.crash.npth;

import com.bytedance.crash.C3691b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.exception.crash.npth.b */
public class C37023b implements Log.AbstractC41686a {
    /* renamed from: a */
    private static Throwable m146078a(String str, String str2) {
        return new Throwable(m146080b(str, str2));
    }

    /* renamed from: b */
    private static String m146080b(String str, String str2) {
        return String.format("TAG: %1$s >> Message: %2$s", str, str2);
    }

    /* renamed from: a */
    private static void m146079a(String str, String str2, Throwable th) {
        if (th == null) {
            th = m146078a(str, str2);
        }
        C3691b.m15203a().mo15180b(th, m146080b(str, str2));
    }

    @Override // com.ss.android.lark.log.Log.AbstractC41686a
    /* renamed from: a */
    public void mo136546a(String str, String str2, Throwable th, boolean z) {
        if (z) {
            m146079a(str, str2, th);
        }
    }
}

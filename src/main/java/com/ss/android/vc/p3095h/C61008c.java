package com.ss.android.vc.p3095h;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.p3088d.C60868a;
import com.ss.android.vc.p3088d.p3089a.AbstractC60869a;
import com.ss.android.vc.p3088d.p3089a.AbstractC60870b;

/* renamed from: com.ss.android.vc.h.c */
public class C61008c {
    /* renamed from: b */
    private static AbstractC60869a m237263b() {
        return new AbstractC60869a() {
            /* class com.ss.android.vc.p3095h.C61008c.C610091 */

            @Override // com.ss.android.vc.p3088d.p3089a.AbstractC60869a
            /* renamed from: a */
            public AbstractC60870b mo208718a() {
                return new C61010a();
            }
        };
    }

    /* renamed from: a */
    public static void m237262a() {
        C60700b.m235851b("VCBaseModuleProvider", "[init]", "start");
        C60868a.m236602a(m237263b());
        C60700b.m235851b("VCBaseModuleProvider", "[init]", "end");
    }

    /* renamed from: com.ss.android.vc.h.c$a */
    public static class C61010a implements AbstractC60870b {
        @Override // com.ss.android.vc.p3088d.p3089a.AbstractC60870b
        /* renamed from: a */
        public void mo208719a(String str, String str2) {
            C60700b.m235843a(str, "", str2);
        }

        @Override // com.ss.android.vc.p3088d.p3089a.AbstractC60870b
        /* renamed from: b */
        public void mo208721b(String str, String str2) {
            C60700b.m235851b(str, "", str2);
        }

        @Override // com.ss.android.vc.p3088d.p3089a.AbstractC60870b
        /* renamed from: c */
        public void mo208722c(String str, String str2) {
            C60700b.m235864f(str, "", str2);
        }

        @Override // com.ss.android.vc.p3088d.p3089a.AbstractC60870b
        /* renamed from: a */
        public void mo208720a(String str, String str2, Throwable th) {
            C60700b.m235846a(str, str2, th);
        }
    }
}

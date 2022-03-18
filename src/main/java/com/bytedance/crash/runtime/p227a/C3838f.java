package com.bytedance.crash.runtime.p227a;

import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.C3970z;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.runtime.a.f */
public class C3838f extends AbstractC3829b {
    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b
    /* renamed from: a */
    public C3742b mo15418a(int i, C3742b bVar) {
        C3742b a = super.mo15418a(i, bVar);
        if (i == 0) {
            Header a2 = Header.m15398a(this.f11782b);
            a2.mo15224c();
            a.mo15231a(a2);
            C3970z.m16559a(a, a2, this.f11781a);
        } else if (i == 1) {
            Header f = a.mo15253f();
            f.mo15225d();
            f.mo15226e();
        } else if (i == 2) {
            Header.m15400a(a.mo15253f());
        } else if (i == 5) {
            Header.m15403b(a.mo15253f());
        }
        return a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3838f(android.content.Context r1, com.bytedance.crash.runtime.p227a.C3824a r2, com.bytedance.crash.runtime.p227a.C3832d r3, boolean r4) {
        /*
            r0 = this;
            if (r4 == 0) goto L_0x0005
            com.bytedance.crash.CrashType r4 = com.bytedance.crash.CrashType.LAUNCH
            goto L_0x0007
        L_0x0005:
            com.bytedance.crash.CrashType r4 = com.bytedance.crash.CrashType.JAVA
        L_0x0007:
            r0.<init>(r4, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.p227a.C3838f.<init>(android.content.Context, com.bytedance.crash.runtime.a.a, com.bytedance.crash.runtime.a.d, boolean):void");
    }
}

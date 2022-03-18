package com.bytedance.crash.runtime.p227a;

import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3970z;

/* renamed from: com.bytedance.crash.runtime.a.c */
public class C3831c extends AbstractC3829b {
    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b
    /* renamed from: a */
    public C3742b mo15419a(C3742b bVar) {
        C3742b a = super.mo15419a(bVar);
        Header a2 = Header.m15398a(this.f11782b);
        Header.m15400a(a2);
        Header.m15403b(a2);
        a2.mo15224c();
        a2.mo15225d();
        a2.mo15226e();
        a.mo15231a(a2);
        a.mo15241a("process_name", (Object) C3933b.m16337c(this.f11782b));
        C3970z.m16559a(a, a2, this.f11781a);
        return a;
    }

    C3831c(CrashType crashType, Context context, C3824a aVar, C3832d dVar) {
        super(crashType, context, aVar, dVar);
    }
}

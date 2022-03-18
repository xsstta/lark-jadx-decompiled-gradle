package com.bytedance.crash.runtime.p227a;

import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.NativeCrashCollector;
import com.bytedance.crash.util.C3970z;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.runtime.a.g */
public class C3839g extends AbstractC3829b {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b
    /* renamed from: c */
    public boolean mo15423c() {
        return false;
    }

    @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b
    /* renamed from: a */
    public int mo15417a() {
        return NativeCrashCollector.m15674a();
    }

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
        }
        return a;
    }

    C3839g(Context context, C3824a aVar, C3832d dVar) {
        super(CrashType.NATIVE, context, aVar, dVar);
    }
}

package com.bytedance.crash.runtime.p228b;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.Header;

/* renamed from: com.bytedance.crash.runtime.b.b */
public class C3843b {

    /* renamed from: b */
    private static final C3843b f11806b = new C3843b() {
        /* class com.bytedance.crash.runtime.p228b.C3843b.C38441 */

        /* renamed from: a */
        Header f11808a;

        @Override // com.bytedance.crash.runtime.p228b.C3843b
        /* renamed from: b */
        public Object mo15437b(String str) {
            if (this.f11808a == null) {
                this.f11808a = Header.m15402b(C3774m.m15609j());
            }
            return this.f11808a.mo15227f().opt(str);
        }
    };

    /* renamed from: a */
    private C3843b f11807a;

    public C3843b() {
        this(f11806b);
    }

    C3843b(C3843b bVar) {
        this.f11807a = bVar;
    }

    /* renamed from: a */
    public Object mo15396a(String str) {
        C3843b bVar = this.f11807a;
        if (bVar != null) {
            return bVar.mo15396a(str);
        }
        return null;
    }

    /* renamed from: b */
    public Object mo15437b(String str) {
        C3843b bVar = this.f11807a;
        if (bVar != null) {
            return bVar.mo15437b(str);
        }
        return null;
    }
}

package com.bytedance.ee.bear.facade.common;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p707j.C13684a;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.facade.common.g */
public class C7708g extends C13684a {
    public C7708g() {
        super(new C7709a());
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.g$a */
    public static class C7709a implements C13684a.AbstractC13685a {

        /* renamed from: a */
        private an f20824a;

        /* renamed from: b */
        private al f20825b;

        /* renamed from: c */
        private ao f20826c;

        @Override // com.bytedance.ee.util.p707j.C13684a.AbstractC13685a
        /* renamed from: b */
        public Locale mo16558b() {
            if (this.f20826c == null) {
                this.f20826c = C4484g.m18494b();
            }
            return this.f20826c.mo17253d();
        }

        @Override // com.bytedance.ee.util.p707j.C13684a.AbstractC13685a
        /* renamed from: a */
        public String mo16557a() {
            if (this.f20824a == null || this.f20825b == null) {
                this.f20824a = (an) KoinJavaComponent.m268610a(an.class);
                this.f20825b = C4511g.m18594d();
            }
            AccountService.Account f = this.f20824a.mo16408f();
            if (f != null && f.mo19677a()) {
                return f.f14591h;
            }
            String v = this.f20825b.mo17372v();
            if (!TextUtils.isEmpty(v)) {
                return v;
            }
            C13479a.m54758a("CCMCookiesAdapter", "getToken error");
            return "";
        }
    }
}

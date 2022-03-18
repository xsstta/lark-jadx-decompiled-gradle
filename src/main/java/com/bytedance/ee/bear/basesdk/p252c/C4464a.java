package com.bytedance.ee.bear.basesdk.p252c;

import com.bytedance.ee.bear.account.C4178d;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.LoginInfo;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.basesdk.c.a */
public class C4464a implements an {

    /* renamed from: a */
    private C4178d f13141a;

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: c */
    public AbstractC68307f<AccountService.Account> mo16405c() {
        return this.f13141a.mo16405c();
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: d */
    public AccountService.Account mo16406d() {
        return this.f13141a.mo16406d();
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: e */
    public AbstractC68307f<Boolean> mo16407e() {
        return this.f13141a.mo16407e();
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: f */
    public AccountService.Account mo16408f() {
        return this.f13141a.mo16408f();
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: g */
    public boolean mo16409g() {
        return this.f13141a.mo16409g();
    }

    public C4464a() {
        C4178d a = C4178d.m17331a();
        this.f13141a = a;
        a.mo16397a(C13615c.f35773a);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo16395a(DocDynamicConfig docDynamicConfig) {
        return this.f13141a.mo16395a(docDynamicConfig);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo16401b(LoginInfo loginInfo) {
        return this.f13141a.mo16401b(loginInfo);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo16396a(String str) {
        return this.f13141a.mo16396a(str);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: b */
    public void mo16404b(BinderAccountChangeCallback binderAccountChangeCallback) {
        this.f13141a.mo16404b(binderAccountChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public void mo16399a(BinderAccountChangeCallback binderAccountChangeCallback) {
        this.f13141a.mo16399a(binderAccountChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.an
    /* renamed from: a */
    public void mo16400a(LoginInfo loginInfo) {
        this.f13141a.mo16400a(loginInfo);
    }
}

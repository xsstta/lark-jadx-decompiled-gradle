package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.o */
public class C39218o implements AbstractC30052p {

    /* renamed from: a */
    ICoreApi f100516a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: a */
    public Locale mo108248a() {
        return this.f100516a.getLanguageSetting();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: b */
    public boolean mo108249b() {
        return this.f100516a.getLocaleCache().mo105661b();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: c */
    public boolean mo108250c() {
        return this.f100516a.getLocaleCache().mo105664e();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: d */
    public boolean mo108251d() {
        return this.f100516a.getLocaleCache().mo105665f();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: e */
    public boolean mo108252e() {
        return this.f100516a.getLocaleCache().mo105666g();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: f */
    public boolean mo108253f() {
        return this.f100516a.getLocaleCache().mo105667h();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: g */
    public boolean mo108254g() {
        return this.f100516a.getLocaleCache().mo105668i();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: h */
    public boolean mo108255h() {
        return this.f100516a.getLocaleCache().mo105669j();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: i */
    public boolean mo108256i() {
        return this.f100516a.getLocaleCache().mo105670k();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: j */
    public boolean mo108257j() {
        return this.f100516a.getLocaleCache().mo105671l();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: k */
    public boolean mo108258k() {
        return this.f100516a.getLocaleCache().mo105672m();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: l */
    public boolean mo108259l() {
        return this.f100516a.getLocaleCache().mo105673n();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: m */
    public boolean mo108260m() {
        return this.f100516a.getLocaleCache().mo105674o();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: n */
    public boolean mo108261n() {
        return this.f100516a.getLocaleCache().mo105675p();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: o */
    public boolean mo108262o() {
        return this.f100516a.getLocaleCache().mo105676q();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: p */
    public boolean mo108263p() {
        return this.f100516a.getLocaleCache().mo105677r();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: q */
    public boolean mo108264q() {
        return this.f100516a.getLocaleCache().mo105662c();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p
    /* renamed from: r */
    public boolean mo108265r() {
        return this.f100516a.getLocaleCache().mo105663d();
    }
}

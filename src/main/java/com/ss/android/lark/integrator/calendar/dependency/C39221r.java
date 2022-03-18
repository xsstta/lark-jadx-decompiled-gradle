package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.r */
public class C39221r implements AbstractC30054s {

    /* renamed from: a */
    private AbstractC49389b f100521a;

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s
    /* renamed from: a */
    public String mo108269a() {
        m154675f();
        String c = this.f100521a.mo172422c();
        if (c == null) {
            return "";
        }
        return c;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s
    /* renamed from: b */
    public boolean mo108270b() {
        m154675f();
        return this.f100521a.mo172429j();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s
    /* renamed from: e */
    public String mo108273e() {
        m154675f();
        return this.f100521a.mo172427h();
    }

    /* renamed from: f */
    private void m154675f() {
        if (this.f100521a == null) {
            this.f100521a = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager();
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s
    /* renamed from: c */
    public String mo108271c() {
        m154675f();
        LoginInfo a = this.f100521a.mo172419a();
        if (a != null) {
            return a.getTenantId();
        }
        return "";
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s
    /* renamed from: d */
    public String mo108272d() {
        m154675f();
        LoginInfo a = this.f100521a.mo172419a();
        if (a != null) {
            return a.getTenantName();
        }
        return "";
    }
}

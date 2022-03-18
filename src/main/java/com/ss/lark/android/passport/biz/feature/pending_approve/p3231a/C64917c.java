package com.ss.lark.android.passport.biz.feature.pending_approve.p3231a;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a;

/* renamed from: com.ss.lark.android.passport.biz.feature.pending_approve.a.c */
public class C64917c extends AbstractC49021b<C64912a.AbstractC64913a, C64912a.AbstractC64914b, C64912a.AbstractC64914b.AbstractC64915a> implements C64912a.AbstractC64914b.AbstractC64915a {

    /* renamed from: d */
    private final Activity f163616d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64912a.AbstractC64914b.AbstractC64915a mo171180c() {
        return this;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223926h();
    }

    /* renamed from: h */
    public void mo223926h() {
        boolean z;
        C64912a.AbstractC64913a aVar = (C64912a.AbstractC64913a) mo171182e();
        C64912a.AbstractC64914b bVar = (C64912a.AbstractC64914b) mo171181d();
        if (aVar == null || bVar == null) {
            PassportLog passportLog = this.f123081c;
            StringBuilder sb = new StringBuilder();
            sb.append("init model is null?");
            boolean z2 = true;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append("; view is null?");
            if (bVar == null) {
                z2 = false;
            }
            sb.append(z2);
            passportLog.mo171471d("n_page_pending_approve", sb.toString());
            return;
        }
        bVar.mo223923a(aVar.cq_());
    }

    @Override // com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a.AbstractC64914b.AbstractC64915a
    /* renamed from: a */
    public void mo223924a(View view) {
        boolean isLogin = ServiceFinder.m193748c().isLogin();
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_wait_for_permission_click").mo171607a("click", "confirm").mo171607a("target", "none"));
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_action_click_iknow_button", "isLogin:" + isLogin);
        if (isLogin) {
            ServiceFinder.m193752g().launchMainWindow(this.f163616d, ServiceFinder.m193744a().getForegroundUser(), null);
            return;
        }
        C49032c.m193132a().mo171195a("login");
    }

    public C64917c(Activity activity, C64912a.AbstractC64913a aVar, C64912a.AbstractC64914b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163616d = activity;
    }
}

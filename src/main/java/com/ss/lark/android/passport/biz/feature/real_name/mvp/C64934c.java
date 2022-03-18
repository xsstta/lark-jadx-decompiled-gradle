package com.ss.lark.android.passport.biz.feature.real_name.mvp;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a;

/* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.c */
public class C64934c extends AbstractC49021b<C64928a.AbstractC64929a, C64928a.AbstractC64930b, C64928a.AbstractC64930b.AbstractC64931a> {

    /* renamed from: d */
    public final Context f163646d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64928a.AbstractC64930b.AbstractC64931a mo171180c() {
        return new C64935a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64928a.AbstractC64930b) mo171181d()).mo223933a(((C64928a.AbstractC64929a) mo171182e()).cr_());
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.c$a */
    public class C64935a implements C64928a.AbstractC64930b.AbstractC64931a {
        @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64930b.AbstractC64931a
        /* renamed from: a */
        public String mo223951a() {
            if (C64934c.this.mo171182e() != null && ((C64928a.AbstractC64929a) C64934c.this.mo171182e()).cr_() != null) {
                return ((C64928a.AbstractC64929a) C64934c.this.mo171182e()).cr_().getAppealUrl();
            }
            C64934c.this.f123081c.mo171471d("RealNamePresenter", "getAppealLink but model or stepInfo is null");
            return null;
        }

        public C64935a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64930b.AbstractC64931a
        /* renamed from: a */
        public void mo223952a(final String str, final String str2) {
            ((C64928a.AbstractC64930b) C64934c.this.mo171181d()).mo223936d();
            ((C64928a.AbstractC64929a) C64934c.this.mo171182e()).mo223949a(str, str2, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.C64934c.C64935a.C649361 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    ((C64928a.AbstractC64930b) C64934c.this.mo171181d()).mo223937e();
                    PassportLog passportLog = C64934c.this.f123081c;
                    passportLog.mo171471d("n_action_opthree_req_fail", "op three failed, error: " + networkErrorResult);
                    StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_account_findback_realname_verify_click").mo171607a("click", "next").mo171607a("target", "none").mo171607a("verify_result", "false"));
                }

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    ((C64928a.AbstractC64930b) C64934c.this.mo171181d()).mo223937e();
                    baseStepData.stepInfo.put("name", (Object) str);
                    baseStepData.stepInfo.put("code", (Object) str2);
                    C49092f.m193532a(C64934c.this.f163646d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64934c.this.f123080b, C64934c.this.f123081c, (AbstractC49336a) null);
                    ((C64928a.AbstractC64930b) C64934c.this.mo171181d()).mo223938f();
                    PassportLog passportLog = C64934c.this.f123081c;
                    passportLog.mo171465b("n_action_opthree_req_succ", "op three success, next: " + baseStepData.nextStep);
                    StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_account_findback_realname_verify_click").mo171607a("click", "next").mo171607a("target", "none").mo171607a("verify_result", "true"));
                }
            });
        }
    }

    public C64934c(Context context, C64928a.AbstractC64929a aVar, C64928a.AbstractC64930b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163646d = context;
    }
}

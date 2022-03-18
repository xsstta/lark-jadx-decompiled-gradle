package com.ss.lark.android.passport.biz.feature.setname.p3232a;

import android.app.Activity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a;

/* renamed from: com.ss.lark.android.passport.biz.feature.setname.a.c */
public class C65015c extends AbstractC49021b<C65009a.AbstractC65010a, C65009a.AbstractC65011b, C65009a.AbstractC65011b.AbstractC65012a> {

    /* renamed from: d */
    public final Activity f163765d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo224069h();
    }

    /* renamed from: g */
    public C65009a.AbstractC65011b.AbstractC65012a mo171180c() {
        return new C65018a();
    }

    /* renamed from: h */
    public void mo224069h() {
        C65009a.AbstractC65010a aVar = (C65009a.AbstractC65010a) mo171182e();
        if (aVar != null && mo171181d() != null) {
            ((C65009a.AbstractC65011b) mo171181d()).mo224062a(aVar.cv_());
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.setname.a.c$a */
    public class C65018a implements C65009a.AbstractC65011b.AbstractC65012a {
        public C65018a() {
            C65015c.this = r1;
        }

        @Override // com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a.AbstractC65011b.AbstractC65012a
        /* renamed from: a */
        public void mo224065a(String str, boolean z) {
            StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_user_name_setting_click").mo171607a("click", "next").mo171607a("target", "none").mo171607a("flow_type", ((C65009a.AbstractC65010a) C65015c.this.mo171182e()).cv_().flowType));
            C65015c.this.mo224067a(str, z);
        }
    }

    /* renamed from: a */
    public void mo224066a(BaseStepData baseStepData) {
        C49092f.m193529a(this.f163765d, baseStepData, RouterScene.ALL.value, this.f123080b, this.f123081c, new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.feature.setname.p3232a.$$Lambda$c$GM1KNQwZdJIAqM2pJIU70_7kzY */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public final void onRouterResult(int i, Object obj) {
                C65015c.m271532lambda$GM1KNQwZdJIAqM2pJIU70_7kzY(C65015c.this, i, obj);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m255233a(int i, Object obj) {
        if (i == -106) {
            this.f123081c.mo171465b("SetNamePresenter", "afterJoinTenant enter app success");
        } else {
            PassportLog passportLog = this.f123081c;
            passportLog.mo171471d("SetNamePresenter", "afterJoinTenant error code: " + i);
        }
        ((C65009a.AbstractC65011b) mo171181d()).mo224064e();
    }

    /* renamed from: a */
    public void mo224067a(String str, boolean z) {
        this.f123081c.mo171465b("SetNamePresenter", "start setUserName");
        if (mo171182e() == null) {
            this.f123081c.mo171471d("SetNamePresenter", "setUserName but model is null");
            return;
        }
        ((C65009a.AbstractC65011b) mo171181d()).mo224063d();
        ((C65009a.AbstractC65010a) mo171182e()).mo224060a(str, z, new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.setname.p3232a.C65015c.C650161 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C65015c.this.f123081c;
                passportLog.mo171471d("SetNamePresenter", "setUserName error " + networkErrorResult.toString());
                ((C65009a.AbstractC65011b) C65015c.this.mo171181d()).mo224064e();
                UnknownCodeHandler.f123256a.mo171329a(C65015c.this.f163765d, networkErrorResult);
            }

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                if (baseStepData != null) {
                    PassportLog passportLog = C65015c.this.f123081c;
                    passportLog.mo171465b("SetNamePresenter", "setName success, nextStep: " + baseStepData.nextStep);
                    C49092f.m193529a(C65015c.this.f163765d, baseStepData, RouterScene.ALL.value, C65015c.this.f123080b, C65015c.this.f123081c, new AbstractC49336a() {
                        /* class com.ss.lark.android.passport.biz.feature.setname.p3232a.C65015c.C650161.C650171 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                        public void onRouterResult(int i, Object obj) {
                            PassportLog passportLog = C65015c.this.f123081c;
                            passportLog.mo171465b("SetNamePresenter", "sendRequest enterApp success, code: " + i);
                            if (i == -106) {
                                ((C65009a.AbstractC65011b) C65015c.this.mo171181d()).mo224064e();
                            } else if (i == -110) {
                                C65015c.this.mo224066a((BaseStepData) obj);
                            } else if (i == -111) {
                                C650161.this.mo145178a((NetworkErrorResult) obj);
                            } else {
                                ((C65009a.AbstractC65011b) C65015c.this.mo171181d()).mo224064e();
                            }
                        }
                    });
                    return;
                }
                C65015c.this.f123081c.mo171471d("SetNamePresenter", "sendRequest enterApp success, but baseStepData is null");
                ((C65009a.AbstractC65011b) C65015c.this.mo171181d()).mo224064e();
            }
        });
    }

    public C65015c(Activity activity, C65009a.AbstractC65010a aVar, C65009a.AbstractC65011b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163765d = activity;
    }
}

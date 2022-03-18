package com.ss.lark.android.passport.biz.compat.real_name.mvp;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64493b;
import com.ss.lark.android.passport.biz.compat.v2.http.common.UnknownCodeHandler;

/* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.c */
public class C64417c extends AbstractC49021b<C64412a.AbstractC64413a, C64412a.AbstractC64414b, C64412a.AbstractC64414b.AbstractC64415a> {

    /* renamed from: d */
    public Context f162711d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64412a.AbstractC64414b.AbstractC64415a mo171180c() {
        return new C64419a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.c$a */
    public class C64419a implements C64412a.AbstractC64414b.AbstractC64415a {
        @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64414b.AbstractC64415a
        /* renamed from: a */
        public String mo222976a() {
            if (C64417c.this.mo171182e() != null && ((C64412a.AbstractC64413a) C64417c.this.mo171182e()).cc_() != null) {
                return ((C64412a.AbstractC64413a) C64417c.this.mo171182e()).cc_().appealUrl;
            }
            C64417c.this.f123081c.mo171471d("RealNamePresenter", "getAppealLink but model or stepInfo is null");
            return null;
        }

        public C64419a() {
        }

        @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64414b.AbstractC64415a
        /* renamed from: a */
        public void mo222977a(final String str, final String str2) {
            final String str3;
            C49096b.m193599k();
            ((C64412a.AbstractC64414b) C64417c.this.mo171181d()).mo222963d();
            if (((C64412a.AbstractC64413a) C64417c.this.mo171182e()).cc_() != null) {
                str3 = ((C64412a.AbstractC64413a) C64417c.this.mo171182e()).cc_().from;
            } else {
                str3 = "";
            }
            C64417c.this.f123081c.mo171465b("n_action_old_opthree_next_req", "verify real name req start");
            ((C64412a.AbstractC64413a) C64417c.this.mo171182e()).mo222974a(str, str2, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.C64417c.C64419a.C644201 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    ((C64412a.AbstractC64414b) C64417c.this.mo171181d()).mo222964e();
                    C49096b.m193578a(str3, false);
                    PassportLog passportLog = C64417c.this.f123081c;
                    passportLog.mo171471d("n_action_old_opthree_req_fail", "verify real name req failed, error: " + networkErrorResult);
                }

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    ((C64412a.AbstractC64414b) C64417c.this.mo171181d()).mo222964e();
                    baseStepData.stepInfo.put("name", (Object) str);
                    baseStepData.stepInfo.put("code", (Object) str2);
                    baseStepData.stepInfo.put("from", (Object) str3);
                    C49096b.m193578a(str3, true);
                    C49092f.m193532a(C64417c.this.f162711d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64417c.this.f123080b, C64417c.this.f123081c, (AbstractC49336a) null);
                    PassportLog passportLog = C64417c.this.f123081c;
                    passportLog.mo171465b("n_action_old_opthree_req_succ", "verify real name req success, next: " + baseStepData.nextStep);
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        if (((C64412a.AbstractC64413a) mo171182e()).cc_() != null) {
            m253158a(((C64412a.AbstractC64413a) mo171182e()).cc_().unit);
        }
        ((C64412a.AbstractC64414b) mo171181d()).mo222961a(((C64412a.AbstractC64413a) mo171182e()).cc_());
    }

    /* renamed from: a */
    private boolean m253158a(String str) {
        final String d = C48998a.f123026a.mo171069d();
        final String configEnv = ServiceFinder.m193749d().getConfigEnv();
        if (TextUtils.equals(d, str)) {
            return true;
        }
        C64493b.m253418a(str, configEnv, this.f123080b, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.compat.real_name.mvp.C64417c.C644181 */

            /* renamed from: a */
            private void m253162a() {
                PassportConfigCenter.f123034a.mo171110a(configEnv);
                C48998a.f123026a.mo171065a(d, (AbstractC49352d<String>) null);
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                C64417c.this.f123081c.mo171465b("RealNamePresenter", "loginOppositeTerminal onSuccess");
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                m253162a();
                String errorMessage = networkErrorResult.getErrorMessage();
                PassportLog passportLog = C64417c.this.f123081c;
                passportLog.mo171465b("RealNamePresenter", "loginOppositeTerminal failed: " + errorMessage);
                UnknownCodeHandler.f162912a.mo223191a(C64417c.this.f162711d, networkErrorResult);
            }
        });
        return true;
    }

    public C64417c(Context context, C64412a.AbstractC64413a aVar, C64412a.AbstractC64414b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f162711d = context;
    }
}

package com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a;

import android.app.Activity;
import com.ss.android.lark.p2069j.p2070a.C40653t;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.InputTeamCodeStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.tenant_code.a.c */
public class C64837c extends AbstractC49021b<C64832a.AbstractC64833a, C64832a.AbstractC64834b, C64832a.AbstractC64834b.AbstractC64835a> {

    /* renamed from: d */
    protected Activity f163444d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223741h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64832a.AbstractC64834b.AbstractC64835a mo171180c() {
        return new C64839a();
    }

    /* renamed from: h */
    public void mo223741h() {
        C64832a.AbstractC64833a aVar = (C64832a.AbstractC64833a) mo171182e();
        if (aVar == null) {
            this.f123081c.mo171471d("n_page_input_team_code", "model is null");
        } else if (mo171181d() != null) {
            ((C64832a.AbstractC64834b) mo171181d()).mo223733a(aVar.cp_());
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.tenant_code.a.c$a */
    public class C64839a implements C64832a.AbstractC64834b.AbstractC64835a {
        public C64839a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64834b.AbstractC64835a
        /* renamed from: a */
        public void mo223737a(String str) {
            C64837c.this.mo223739a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo223738a(BaseStepData baseStepData) {
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_page_input_team_code", "afterJoinTenant success: nextStep" + baseStepData.nextStep);
        C49092f.m193529a(this.f163444d, baseStepData, RouterScene.INVITE.value, this.f123080b, this.f123081c, new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.$$Lambda$c$5O532EwByolAg_U0rF20EVAeEE */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public final void onRouterResult(int i, Object obj) {
                C64837c.this.m254598a(i, obj);
            }
        });
    }

    /* renamed from: a */
    public void mo223739a(String str) {
        C64832a.AbstractC64833a aVar = (C64832a.AbstractC64833a) mo171182e();
        if (aVar == null) {
            this.f123081c.mo171471d("n_page_input_team_code", "model is empty");
            return;
        }
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_action_join_team_by_code_req", "tenant code: " + str);
        ((C64832a.AbstractC64834b) mo171181d()).mo223734d();
        aVar.mo223731a(str, new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64837c.C648381 */

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                InputTeamCodeStatisticsHelper.m254590a(((C64832a.AbstractC64833a) C64837c.this.mo171182e()).cp_().flowType, true);
                if (baseStepData != null) {
                    C64837c.this.f123081c.mo171460a("n_action_join_team_by_code_succ");
                    C64837c.this.mo223738a(baseStepData);
                    return;
                }
                ((C64832a.AbstractC64834b) C64837c.this.mo171181d()).mo223735e();
                C64837c.this.f123081c.mo171471d("n_action_join_team_by_code_error", "response data is empty");
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                InputTeamCodeStatisticsHelper.m254590a(((C64832a.AbstractC64833a) C64837c.this.mo171182e()).cp_().flowType, false);
                ((C64832a.AbstractC64834b) C64837c.this.mo171181d()).mo223735e();
                if (networkErrorResult != null) {
                    C64837c.this.f123081c.mo171471d("n_action_join_team_by_code_error", networkErrorResult.getErrorMessage());
                    UnknownCodeHandler.f123256a.mo171331c(C64837c.this.f163444d, networkErrorResult);
                    return;
                }
                C64837c.this.f123081c.mo171471d("n_action_join_team_by_code_error", "errorResult is null");
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m254598a(int i, Object obj) {
        if (i == -106) {
            this.f123081c.mo171465b("n_page_input_team_code", "afterJoinTenant and enter app success");
        } else {
            this.f123081c.mo171465b("n_page_input_team_code", "afterJoinTenant error: code is not CODE_ENTER_APP_SUCCESS");
        }
        ((C64832a.AbstractC64834b) mo171181d()).mo223735e();
        WatcherHelper.m193664a(this.f123080b, C40653t.f103175k);
    }

    public C64837c(Activity activity, C64832a.AbstractC64833a aVar, C64832a.AbstractC64834b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163444d = activity;
    }
}

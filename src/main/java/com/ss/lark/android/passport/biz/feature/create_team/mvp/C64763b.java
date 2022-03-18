package com.ss.lark.android.passport.biz.feature.create_team.mvp;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.C64482a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.DetailInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.IndustryInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SucBCStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.TenantCreateStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.CreateAccountData;
import com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.b */
public class C64763b extends AbstractC49021b<C64767c.AbstractC64768a, C64767c.AbstractC64769b, C64767c.AbstractC64769b.AbstractC64770a> {

    /* renamed from: d */
    public final Context f163329d;

    /* renamed from: e */
    private final CreateAccountData f163330e;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223639h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64767c.AbstractC64769b.AbstractC64770a mo171180c() {
        return new C64766a();
    }

    /* renamed from: h */
    public void mo223639h() {
        C64767c.AbstractC64768a aVar = (C64767c.AbstractC64768a) mo171182e();
        if (aVar != null && mo171181d() != null) {
            ((C64767c.AbstractC64769b) mo171181d()).mo223617a(aVar.mo223634g());
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.create_team.mvp.b$a */
    public class C64766a implements C64767c.AbstractC64769b.AbstractC64770a {
        @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b.AbstractC64770a
        /* renamed from: a */
        public List<C64482a> mo223640a() {
            ArrayList arrayList = new ArrayList();
            List<TenantCreateStepInfo.CommonList> h = ((C64767c.AbstractC64768a) C64763b.this.mo171182e()).mo223635h();
            if (h == null || h.size() == 0) {
                return null;
            }
            for (int i = 0; i < h.size(); i++) {
                arrayList.add(new C64482a(h.get(i).commonContent, h.get(i).code));
            }
            return arrayList;
        }

        @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b.AbstractC64770a
        /* renamed from: b */
        public List<IndustryInfo> mo223642b() {
            ArrayList arrayList = new ArrayList();
            List<TenantCreateStepInfo.IndustryTypeList> i = ((C64767c.AbstractC64768a) C64763b.this.mo171182e()).mo223636i();
            if (i == null || i.size() == 0) {
                return null;
            }
            for (int i2 = 0; i2 < i.size(); i2++) {
                ArrayList arrayList2 = new ArrayList();
                String str = i.get(i2).industryInfo;
                String str2 = i.get(i2).code;
                if (i.get(i2).childrenList.size() == 0) {
                    arrayList2.add(new DetailInfo(str, str2));
                }
                for (int i3 = 0; i3 < i.get(i2).childrenList.size(); i3++) {
                    TenantCreateStepInfo.CommonList commonList = i.get(i2).childrenList.get(i3);
                    arrayList2.add(new DetailInfo(commonList.commonContent, commonList.code));
                }
                arrayList.add(new IndustryInfo(str, str2, arrayList2));
            }
            return arrayList;
        }

        public C64766a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b.AbstractC64770a
        /* renamed from: a */
        public void mo223641a(String str, String str2, String str3, String str4) {
            StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_team_info_setting_click").mo171607a("click", "next").mo171607a("flow_type", ((C64767c.AbstractC64768a) C64763b.this.mo171182e()).mo223634g().flowType).mo171607a("target", "passport_user_info_setting_view"));
            C64763b.this.mo223637a(str, str2, str3, str4);
        }

        @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b.AbstractC64770a
        /* renamed from: b */
        public boolean mo223643b(String str, String str2, String str3, String str4) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6 = false;
            if (C64763b.this.mo171182e() == null) {
                C64763b.this.f123081c.mo171471d("n_page_tenant_prepare_start", "Delegate.inputInfo empty model");
                return false;
            }
            TenantCreateStepInfo g = ((C64767c.AbstractC64768a) C64763b.this.mo171182e()).mo223634g();
            if (g == null) {
                C64763b.this.f123081c.mo171471d("n_page_tenant_prepare_start", "Delegate.inputInfo empty stepInfo");
                return false;
            }
            if (g.nameInput != null) {
                z = true;
            } else {
                z = false;
            }
            if (g.tenantNameInput != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g.staffSizeInput != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g.industryTypeInput != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z || !TextUtils.isEmpty(str2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z2) {
                if (TextUtils.isEmpty(str) || !z5) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            }
            if (z3) {
                if (TextUtils.isEmpty(str3) || !z5) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            }
            if (!z4) {
                return z5;
            }
            if (!TextUtils.isEmpty(str4) && z5) {
                z6 = true;
            }
            return z6;
        }
    }

    /* renamed from: a */
    private void m254346a(CreateAccountData createAccountData) {
        if (createAccountData == null) {
            this.f123081c.mo171471d("n_action_tenant_prepare_next", "afterCreateTeam but data is null");
            ((C64767c.AbstractC64769b) mo171181d()).mo223623e();
        } else if (!"success_b".equals(createAccountData.nextStep) || createAccountData.stepInfo == null) {
            PassportLog passportLog = this.f123081c;
            passportLog.mo171465b("n_action_tenant_prepare_next", "afterCreateTeam nextStep: " + createAccountData.nextStep);
            C49092f.m193529a(this.f163329d, createAccountData, RouterScene.INVITE.value, this.f123080b, this.f123081c, new AbstractC49336a() {
                /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.C64763b.C647652 */

                @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                public void onRouterResult(int i, Object obj) {
                    if (i == -106) {
                        C64763b.this.f123081c.mo171465b("n_action_tenant_prepare_next", "afterCreateTeam sendRequest success");
                    } else {
                        PassportLog passportLog = C64763b.this.f123081c;
                        passportLog.mo171471d("n_action_tenant_prepare_next", "afterCreateTeam sendRequest result: code=" + i);
                    }
                    ((C64767c.AbstractC64769b) C64763b.this.mo171181d()).mo223623e();
                }
            });
        } else {
            this.f123081c.mo171465b("n_action_tenant_prepare_next", "afterCreateTeam nextStep: success_b");
            ((C64767c.AbstractC64769b) mo171181d()).mo223623e();
            String string = createAccountData.stepInfo.getString("title");
            String string2 = createAccountData.stepInfo.getString("subtitle");
            String string3 = createAccountData.stepInfo.getString("user_id");
            String string4 = createAccountData.stepInfo.getString("user_unit");
            SucBCStepInfo sucBCStepInfo = new SucBCStepInfo();
            sucBCStepInfo.userId = string3;
            sucBCStepInfo.title = string;
            sucBCStepInfo.subTitle = string2;
            sucBCStepInfo.userUnit = string4;
        }
    }

    /* renamed from: a */
    public void mo223637a(String str, String str2, String str3, String str4) {
        this.f123081c.mo171465b("n_action_tenant_prepare_next", "start createTenantAccount");
        ((C64767c.AbstractC64769b) mo171181d()).mo223622d();
        if (this.f163330e != null) {
            this.f123081c.mo171465b("n_action_tenant_prepare_next", "createTenantAccount but mTmpCreateAccountData is not null");
            m254346a(this.f163330e);
            return;
        }
        ((C64767c.AbstractC64768a) mo171182e()).mo223633a(str2, str3, str4, this.f123080b, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.C64763b.C647641 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C64763b.this.f123081c;
                passportLog.mo171471d("n_action_tenant_prepare_next", "sendRequest CreateTeam error " + networkErrorResult.toString());
                ((C64767c.AbstractC64769b) C64763b.this.mo171181d()).mo223623e();
                UnknownCodeHandler.f123256a.mo171329a(C64763b.this.f163329d, networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                ((C64767c.AbstractC64769b) C64763b.this.mo171181d()).mo223623e();
                if (responseModel.getCode() != 0 || responseModel == null || responseModel.getData() == null) {
                    C64763b.this.f123081c.mo171471d("n_action_tenant_prepare_next", "tenantPrepare onSuccess but LoginTypeData is null");
                    return;
                }
                BaseStepData data = responseModel.getData();
                PassportLog passportLog = C64763b.this.f123081c;
                passportLog.mo171465b("n_action_tenant_prepare_next", "sendRequest CreateTeam suc" + data.nextStep);
                C49092f.m193532a(C64763b.this.f163329d, data.nextStep, data.stepInfo, RouterScene.BEFORE_LOGIN.value, C64763b.this.f123080b, C64763b.this.f123081c, (AbstractC49336a) null);
            }
        });
    }

    public C64763b(Context context, C64767c.AbstractC64768a aVar, C64767c.AbstractC64769b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163329d = context;
    }
}

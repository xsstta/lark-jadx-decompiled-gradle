package com.ss.lark.android.passport.biz.router;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import java.lang.reflect.Type;

@RouterAnno(name = "create_team_prepare")
/* renamed from: com.ss.lark.android.passport.biz.router.c */
public class C65187c extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "CreateTeamAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(final Context context, String str, final JSONObject jSONObject, int i, boolean z, UniContext uniContext, final AbstractC49336a aVar) {
        if (context == null) {
            this.f123291a.mo171471d("CreateTeamAction", "stepInfo or context is null!");
            return;
        }
        if (uniContext == null) {
            uniContext = UniContext.CONTEXT_GLOBAL;
        }
        FeatureCApi.m253694a(uniContext, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.router.C65187c.C651881 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C65187c.this.f123291a;
                passportLog.mo171471d("CreateTeamAction", "sendRequest CreateTeam error " + networkErrorResult.toString());
                aVar.onRouterResult(-105, null);
                C49096b.m193587d("prepare_tenant");
                UnknownCodeHandler.f123256a.mo171329a(context, networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                if (responseModel.getCode() != 0 || responseModel == null || responseModel.getData() == null) {
                    C65187c.this.f123291a.mo171471d("CreateTeamAction", "tenantPrepare onSuccess but LoginTypeData is null");
                    aVar.onRouterResult(-105, null);
                    return;
                }
                BaseStepData data = responseModel.getData();
                PassportLog passportLog = C65187c.this.f123291a;
                passportLog.mo171465b("CreateTeamAction", "sendRequest CreateTeam suc" + data.nextStep);
                if (jSONObject != null) {
                    data.stepInfo.put("from_guide", jSONObject.get("from_guide"));
                }
                C49092f.m193532a(context, data.nextStep, data.stepInfo, RouterScene.BEFORE_LOGIN.value, UniContext.CONTEXT_GLOBAL, C65187c.this.f123291a, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.router.C65187c.C651881.C651891 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        aVar.onRouterResult(-100, null);
                    }
                });
            }
        });
    }
}

package com.ss.android.lark.passport.ka.p2452a;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.idp.IdPSettingResponse;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.lark.passport.ka.a.b */
public class C49292b {

    /* renamed from: a */
    private static C49292b f123744a;

    /* renamed from: b */
    private final PassportLog f123745b = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static C49292b m194222a() {
        if (f123744a == null) {
            synchronized (C49292b.class) {
                if (f123744a == null) {
                    f123744a = new C49292b();
                }
            }
        }
        return f123744a;
    }

    /* renamed from: a */
    public void mo171903a(UniContext uniContext, String str, final AbstractC49352d<IdPSettingResponse> dVar) {
        if (dVar != null) {
            FeatureCApi.IdP.m253713a(str, uniContext, new ICallback<IdPSettingResponse>() {
                /* class com.ss.android.lark.passport.ka.p2452a.C49292b.C492931 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return IdPSettingResponse.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    dVar.mo145178a(networkErrorResult);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<IdPSettingResponse> responseModel) {
                    IdPSettingResponse data = responseModel.getData();
                    if (data == null) {
                        dVar.mo145178a(new NetworkErrorResult(-1, "setting is null"));
                    } else {
                        dVar.mo145179a(data);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo171902a(Context context, String str, BaseStepData baseStepData) {
        if (baseStepData == null) {
            this.f123745b.mo171471d("IDPSettingsService", "getKaPreConfig success but data is null");
            return;
        }
        C49296c.m194232a().mo171915b(str);
        PassportLog passportLog = this.f123745b;
        passportLog.mo171465b("IDPSettingsService", "getKaPreConfig success router to Other Page " + baseStepData.nextStep);
        C49092f.m193531a(context, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, (PassportLog) null, new AbstractC49336a() {
            /* class com.ss.android.lark.passport.ka.p2452a.C49292b.C492942 */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public void onRouterResult(int i, Object obj) {
            }
        });
    }

    /* renamed from: a */
    public void mo171904a(UniContext uniContext, String str, String str2, String str3, final AbstractC49352d<BaseStepData> dVar) {
        FeatureCApi.IdP.m253715a(null, str3, str, str2, "", uniContext, false, new ICallback<BaseStepData>() {
            /* class com.ss.android.lark.passport.ka.p2452a.C49292b.C492953 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                if (responseModel.getData() == null) {
                    dVar.mo145178a(new NetworkErrorResult(-1, "auth url is null"));
                } else {
                    dVar.mo145179a(responseModel.getData());
                }
            }
        });
    }
}

package com.ss.lark.android.passport.biz.feature.company_login.p3222a;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.company_login.a.a */
public class C64681a extends C49020a implements C64696d.AbstractC64697a {
    public C64681a(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d.AbstractC64697a
    /* renamed from: a */
    public void mo223488a(String str, final AbstractC49352d<BaseStepData> dVar) {
        mo171171a(FeatureCApi.IdP.m253715a(null, null, str, "", "", this.f123074a, false, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64681a.C646821 */

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
                dVar.mo145179a(responseModel.getData());
            }
        }));
    }
}

package com.ss.lark.android.passport.biz.feature.real_name.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.RecoverAccountStepInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.real_name.mvp.b */
public class C64932b extends C49020a implements C64928a.AbstractC64929a {
    @RouterFieldAnno

    /* renamed from: c */
    private RecoverAccountStepInfo f163643c;

    @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64929a
    public RecoverAccountStepInfo cr_() {
        return this.f163643c;
    }

    public C64932b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.real_name.mvp.C64928a.AbstractC64929a
    /* renamed from: a */
    public void mo223949a(String str, String str2, final AbstractC49352d<BaseStepData> dVar) {
        this.f123075b.mo171465b("n_action_opthree_next_req", "req start");
        RecoverAccountStepInfo recoverAccountStepInfo = this.f163643c;
        if (recoverAccountStepInfo == null) {
            dVar.mo145178a(new NetworkErrorResult(-1, "step info is null"));
        } else {
            mo171171a(FeatureCApi.Retrieve.m253720a(str, str2, recoverAccountStepInfo.getPublicKey(), this.f163643c.getRsaToken(), this.f163643c.getFlowType(), this.f123074a, this.f163643c.usePackageDomain, new ICallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.real_name.mvp.C64932b.C649331 */

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
}

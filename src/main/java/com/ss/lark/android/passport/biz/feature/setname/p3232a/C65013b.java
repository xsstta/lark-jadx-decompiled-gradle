package com.ss.lark.android.passport.biz.feature.setname.p3232a;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetNameStepInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.setname.a.b */
public class C65013b extends C49020a implements C65009a.AbstractC65010a {
    @RouterFieldAnno

    /* renamed from: c */
    private SetNameStepInfo f163762c;

    @Override // com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a.AbstractC65010a
    public SetNameStepInfo cv_() {
        return this.f163762c;
    }

    public C65013b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.setname.p3232a.C65009a.AbstractC65010a
    /* renamed from: a */
    public void mo224060a(String str, boolean z, final AbstractC49352d<BaseStepData> dVar) {
        PassportLog passportLog = this.f123075b;
        passportLog.mo171465b("n_action_set_name_req", "showOptIn:" + this.f163762c.showOptIn + ",checked:" + z);
        mo171171a(FeatureCApi.m253703a(str, z, this.f163762c.showOptIn, this.f163762c.flowType, this.f123074a, this.f163762c.usePackageDomain, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.setname.p3232a.C65013b.C650141 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                C65013b.this.f123075b.mo171471d("n_action_set_name_error", networkErrorResult.getErrorMessage());
                dVar.mo145178a(networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                if (responseModel.getData() != null) {
                    C65013b.this.f123075b.mo171460a("n_action_set_name_succ");
                    dVar.mo145179a(responseModel.getData());
                    return;
                }
                C65013b.this.f123075b.mo171471d("n_action_set_name_error", "Response data is Null");
                C65013b.this.f123075b.mo171465b("SetNameModel", "Response data is Null");
            }
        }));
    }
}

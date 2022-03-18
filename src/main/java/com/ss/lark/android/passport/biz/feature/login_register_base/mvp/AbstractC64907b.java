package com.ss.lark.android.passport.biz.feature.login_register_base.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.statistics.AuthChannelEnum;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.model.GetPassportConfigData;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.login_register_base.mvp.b */
public abstract class AbstractC64907b extends C49020a implements C64903a.AbstractC64904a {

    /* renamed from: d */
    protected int f163608d;

    /* renamed from: e */
    protected GetPassportConfigData.ConfigBean f163609e = PassportConfigCenter.f123034a.mo171113d();

    /* renamed from: h */
    public int mo223912h() {
        return this.f163608d;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        int i;
        super.mo171169a();
        if (ServiceFinder.m193748c().isLarkPackage()) {
            i = 2;
        } else {
            i = 1;
        }
        this.f163608d = i;
    }

    /* renamed from: a */
    public void mo223910a(int i) {
        this.f163608d = i;
    }

    public AbstractC64907b(Intent intent) {
    }

    /* renamed from: a */
    public void mo223911a(AuthChannelEnum authChannelEnum, final AbstractC49352d<BaseStepData> dVar) {
        mo171171a(FeatureCApi.IdP.m253715a(null, null, "", authChannelEnum.value(), "", this.f123074a, false, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64907b.C649081 */

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

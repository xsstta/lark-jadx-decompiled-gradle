package com.ss.lark.android.passport.biz.feature.set_credential;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.set_credential.C64996a;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Map;

public class RecoverAccountModel extends C49020a implements C64996a.AbstractC64997a {

    /* renamed from: c */
    private final RetrieveSetCredentialStep f163724c;

    public static class RetrieveSetCredentialStep extends BaseStepInfo implements Serializable {
        @JSONField(name = "country_code")
        public String countryCode;
        @JSONField(name = "credential_input")
        public InputInfo credentialInput;
        @JSONField(name = "credential_type")
        public int credentialType;
        @JSONField(name = "flow_type")
        private String flowType;
        @JSONField(name = "identity_unit")
        public String identityUnit;
        @JSONField(name = "subtitle")
        public String subTitle;
        @JSONField(name = "title")
        public String title;

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getFlowType() {
            return this.flowType;
        }

        public String getIdentityUnit() {
            return this.identityUnit;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setFlowType(String str) {
            this.flowType = str;
        }

        public void setIdentityUnit(String str) {
            this.identityUnit = str;
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    public String cs_() {
        return this.f163724c.title;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    public String ct_() {
        return this.f163724c.subTitle;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    public InputInfo cu_() {
        return this.f163724c.credentialInput;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    /* renamed from: e */
    public int mo224023e() {
        return this.f163724c.credentialType;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    /* renamed from: g */
    public String mo224024g() {
        return this.f163724c.countryCode;
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    /* renamed from: h */
    public String mo224025h() {
        return this.f163724c.identityUnit;
    }

    public RecoverAccountModel(Bundle bundle) {
        if (bundle == null) {
            Log.m165383e("RecoverAccountModel", "null arguments");
            this.f163724c = new RetrieveSetCredentialStep();
            return;
        }
        Map map = (Map) bundle.getSerializable("step_info");
        if (map == null) {
            this.f163724c = new RetrieveSetCredentialStep();
            Log.m165383e("RecoverAccountModel", "step_info json error");
            return;
        }
        this.f163724c = (RetrieveSetCredentialStep) C49202p.m193967a(new JSONObject(map), RetrieveSetCredentialStep.class);
    }

    @Override // com.ss.lark.android.passport.biz.feature.set_credential.C64996a.AbstractC64997a
    /* renamed from: a */
    public void mo224019a(String str, final AbstractC49352d<BaseStepData> dVar) {
        String str2;
        int i;
        RetrieveSetCredentialStep retrieveSetCredentialStep = this.f163724c;
        if (retrieveSetCredentialStep != null) {
            str2 = retrieveSetCredentialStep.getFlowType();
        } else {
            str2 = "";
        }
        RetrieveSetCredentialStep retrieveSetCredentialStep2 = this.f163724c;
        if (retrieveSetCredentialStep2 != null) {
            i = retrieveSetCredentialStep2.credentialType;
        } else {
            i = 0;
        }
        FeatureCApi.Retrieve.m253718a(str, i, str2, this.f123074a, this.f163724c.usePackageDomain, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountModel.C649851 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a(responseModel.getData());
                }
            }
        });
    }
}

package com.ss.lark.android.passport.biz.feature.login.onekey_login.mvp;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import com.ss.lark.android.passport.biz.feature.LoginApi;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseModel;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IModel;", "()V", "DoAuth", "", "token", "", "from", "authType", "", "securityScanResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SecurityScanResult;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getAuthToken", "Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "getSecurityPhone", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.a */
public final class OneKeyAuthModel extends C49020a implements IOneKeyAuthContract.IModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthModel$DoAuth$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.a$a */
    public static final class C64851a implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthModel f163481a;

        /* renamed from: b */
        final /* synthetic */ AbstractC49352d f163482b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            this.f163482b.mo145178a(networkErrorResult);
            this.f163481a.f123075b.mo171471d("n_action_onekey_auth_next", PassportLog.f123351c.mo171478a("doAuth onError", networkErrorResult));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            if (data != null) {
                this.f163482b.mo145179a(data);
                this.f163481a.f123075b.mo171465b("n_action_onekey_auth_next", "doAuth onSuccess");
                return;
            }
            this.f163482b.mo145178a(new NetworkErrorResult(-2, "OneKeyAuthModel request onSuccess but data is invalid"));
            this.f163481a.f123075b.mo171471d("n_action_onekey_auth_next", "doAuth onSuccess but data is null");
        }

        C64851a(OneKeyAuthModel aVar, AbstractC49352d dVar) {
            this.f163481a = aVar;
            this.f163482b = dVar;
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IModel
    /* renamed from: a */
    public void mo223778a(AbstractC49352d<OperatorAuthTokenInfo> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        OneKeyAuthUtil.f163513a.mo223822a(dVar, this.f123074a);
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IModel
    /* renamed from: a */
    public void mo223777a(int i, AbstractC49352d<OperatorAuthTokenInfo> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        OneKeyAuthUtil.m254762a(OneKeyAuthUtil.f163513a, dVar, true, this.f123074a, i, false, 16, null);
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IModel
    /* renamed from: a */
    public void mo223779a(String str, String str2, int i, SecurityScanResult securityScanResult, AbstractC49352d<BaseStepData> dVar) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "from");
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        this.f123075b.mo171465b("n_action_onekey_auth_next", "start doAuth");
        mo171171a(LoginApi.m253953a(str2, str, securityScanResult, new C64851a(this, dVar)));
    }
}

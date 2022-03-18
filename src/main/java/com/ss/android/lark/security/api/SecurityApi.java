package com.ss.android.lark.security.api;

import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49199m;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.utils.C57878s;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J2\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007J<\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/security/api/SecurityApi;", "", "()V", "TAG", "", "TAG_APP_ID", "TAG_SECURITY_PWD", "checkSecurityPwdStatus", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/security/api/CheckSecurityPwdStep;", "setNewSecurityPwd", "pwd", "flowType", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "verifySecurityPwd", "appId", "Lcom/ss/android/lark/security/api/VerifySecurityPwdResultStep;", "openplatform-security-verify_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.security.api.a */
public final class SecurityApi {

    /* renamed from: a */
    public static final SecurityApi f133861a = new SecurityApi();

    private SecurityApi() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/security/api/SecurityApi$checkSecurityPwdStatus$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "openplatform-security-verify_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.security.api.a$a */
    public static final class C54061a implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f133862a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        C54061a(IGetDataCallback iGetDataCallback) {
            this.f133862a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            this.f133862a.onError(C49069a.m193380a(networkErrorResult));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            String str;
            CheckSecurityPwdStep checkSecurityPwdStep;
            String str2;
            String str3;
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            JSONObject jSONObject2 = null;
            if (data != null) {
                str = data.nextStep;
            } else {
                str = null;
            }
            boolean z = true;
            if (StringsKt.equals("check_sec_pwd", str, true)) {
                BaseStepData data2 = responseModel.getData();
                if (data2 == null || (jSONObject = data2.stepInfo) == null) {
                    str3 = null;
                } else {
                    str3 = jSONObject.toJSONString();
                }
                checkSecurityPwdStep = (CheckSecurityPwdStep) C57878s.m224590a(str3, CheckSecurityPwdStep.class);
            } else {
                PassportLog a = PassportLog.f123351c.mo171474a();
                StringBuilder sb = new StringBuilder();
                sb.append("checkSecurityPwdStatus: unknown step: ");
                BaseStepData data3 = responseModel.getData();
                if (data3 != null) {
                    str2 = data3.nextStep;
                } else {
                    str2 = null;
                }
                sb.append(str2);
                a.mo171471d("SecurityApi", sb.toString());
                checkSecurityPwdStep = null;
            }
            if (checkSecurityPwdStep == null) {
                PassportLog a2 = PassportLog.f123351c.mo171474a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("checkSecurityPwdStatus: parsed step is null, stepInfo is null? ");
                BaseStepData data4 = responseModel.getData();
                if (data4 != null) {
                    jSONObject2 = data4.stepInfo;
                }
                if (jSONObject2 != null) {
                    z = false;
                }
                sb2.append(z);
                a2.mo171471d("SecurityApi", sb2.toString());
                this.f133862a.onError(C49069a.m193380a(new NetworkErrorResult(-1, "next is null")));
                return;
            }
            this.f133862a.onSuccess(checkSecurityPwdStep);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/security/api/SecurityApi$verifySecurityPwd$2", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "openplatform-security-verify_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.security.api.a$b */
    public static final class C54062b implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f133863a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        C54062b(IGetDataCallback iGetDataCallback) {
            this.f133863a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            this.f133863a.onError(C49069a.m193380a(networkErrorResult));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            String str;
            VerifySecurityPwdResultStep verifySecurityPwdResultStep;
            String str2;
            String str3;
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            JSONObject jSONObject2 = null;
            if (data != null) {
                str = data.nextStep;
            } else {
                str = null;
            }
            boolean z = true;
            if (StringsKt.equals("security_token", str, true)) {
                BaseStepData data2 = responseModel.getData();
                if (data2 == null || (jSONObject = data2.stepInfo) == null) {
                    str3 = null;
                } else {
                    str3 = jSONObject.toJSONString();
                }
                verifySecurityPwdResultStep = (VerifySecurityPwdResultStep) C57878s.m224590a(str3, VerifySecurityPwdResultStep.class);
            } else {
                PassportLog a = PassportLog.f123351c.mo171474a();
                StringBuilder sb = new StringBuilder();
                sb.append("verifySecurityPwd: unknown step: ");
                BaseStepData data3 = responseModel.getData();
                if (data3 != null) {
                    str2 = data3.nextStep;
                } else {
                    str2 = null;
                }
                sb.append(str2);
                a.mo171471d("SecurityApi", sb.toString());
                verifySecurityPwdResultStep = null;
            }
            if (verifySecurityPwdResultStep == null) {
                PassportLog a2 = PassportLog.f123351c.mo171474a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("verifySecurityPwd: parsed step is null, stepInfo is null? ");
                BaseStepData data4 = responseModel.getData();
                if (data4 != null) {
                    jSONObject2 = data4.stepInfo;
                }
                if (jSONObject2 != null) {
                    z = false;
                }
                sb2.append(z);
                a2.mo171471d("SecurityApi", sb2.toString());
                this.f133863a.onError(C49069a.m193380a(new NetworkErrorResult(-1, "next is null")));
                return;
            }
            this.f133863a.onSuccess(verifySecurityPwdResultStep);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m209800a(UniContext uniContext, IGetDataCallback<CheckSecurityPwdStep> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/security/check_sec_pwd").mo171310a(), new C54061a(iGetDataCallback));
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m209801a(String str, String str2, UniContext uniContext, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "pwd");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/sec_pwd/set").mo171306a("sec_pwd", (Object) str).mo171311b(str2).mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m209802a(String str, String str2, String str3, UniContext uniContext, IGetDataCallback<VerifySecurityPwdResultStep> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "pwd");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CommonRequest.Builder a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/sec_pwd/verify").mo171306a("sec_pwd", (Object) str);
        if (str2 != null) {
            a.mo171306a("app_id", (Object) str2);
        }
        return C49199m.m193957a(a.mo171311b(str3).mo171310a(), new C54062b(iGetDataCallback));
    }
}

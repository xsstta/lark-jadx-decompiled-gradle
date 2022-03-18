package com.ss.lark.android.passport.biz.feature.router;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RouterAnno(name = "get_auth_url")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016JJ\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/router/GetAuthUrlAction;", "Lcom/ss/android/lark/passport/infra/base/router/BaseRouterAction;", "()V", "KEY_USE_PACKAGE_DOMAIN", "", "TAG", "getName", "run", "", "context", "Landroid/content/Context;", "nextStep", "stepInfo", "Lcom/alibaba/fastjson/JSONObject;", "scene", "", "backFirst", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/router/IRouterCallback;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.b.b */
public final class GetAuthUrlAction extends AbstractC49088b {

    /* renamed from: b */
    public static final GetAuthUrlAction f163145b = new GetAuthUrlAction();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "GetAuthUrlAction";
    }

    private GetAuthUrlAction() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/router/GetAuthUrlAction$run$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b.b$a */
    public static final class C64662a implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49336a f163146a;

        /* renamed from: b */
        final /* synthetic */ Context f163147b;

        /* renamed from: c */
        final /* synthetic */ int f163148c;

        /* renamed from: d */
        final /* synthetic */ UniContext f163149d;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            PassportLog passportLog = GetAuthUrlAction.f163145b.f123291a;
            passportLog.mo171471d("n_action_login_idp_auth_url_req_fail", "get auth url failed, error: " + networkErrorResult);
            AbstractC49336a aVar = this.f163146a;
            if (aVar != null) {
                aVar.onRouterResult(-105, null);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            String str;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (responseModel.getData() == null) {
                GetAuthUrlAction.f163145b.f123291a.mo171471d("n_action_login_idp_auth_url_req_fail", "get auth url failed, next step is null");
                AbstractC49336a aVar = this.f163146a;
                if (aVar != null) {
                    aVar.onRouterResult(-105, null);
                    return;
                }
                return;
            }
            PassportLog passportLog = GetAuthUrlAction.f163145b.f123291a;
            StringBuilder sb = new StringBuilder();
            sb.append("get auth url success, next: ");
            BaseStepData data = responseModel.getData();
            if (data != null) {
                str = data.nextStep;
            } else {
                str = null;
            }
            sb.append(str);
            passportLog.mo171465b("n_action_login_idp_auth_url_req_suc", sb.toString());
            C49092f.m193529a(this.f163147b, responseModel.getData(), this.f163148c, this.f163149d, GetAuthUrlAction.f163145b.f123291a, (AbstractC49336a) null);
            AbstractC49336a aVar2 = this.f163146a;
            if (aVar2 != null) {
                aVar2.onRouterResult(-100, null);
            }
        }

        C64662a(AbstractC49336a aVar, Context context, int i, UniContext uniContext) {
            this.f163146a = aVar;
            this.f163147b = context;
            this.f163148c = i;
            this.f163149d = uniContext;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        boolean z2;
        this.f123291a.mo171465b("n_action_get_auth_url", "enter get auth url action");
        if (context == null || jSONObject == null) {
            PassportLog passportLog = this.f123291a;
            StringBuilder sb = new StringBuilder();
            sb.append("unknown error, context is null? ");
            boolean z3 = true;
            if (context == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            sb.append(", ");
            sb.append("step info is null? ");
            if (jSONObject != null) {
                z3 = false;
            }
            sb.append(z3);
            passportLog.mo171471d("n_action_get_auth_url", sb.toString());
            if (aVar != null) {
                aVar.onRouterResult(-105, null);
                return;
            }
            return;
        }
        this.f123291a.mo171465b("n_action_login_idp_auth_url_req", "get auth url");
        FeatureCApi.IdP.m253712a(jSONObject, uniContext, jSONObject.getBooleanValue("use_package_domain"), new C64662a(aVar, context, i, uniContext));
    }
}

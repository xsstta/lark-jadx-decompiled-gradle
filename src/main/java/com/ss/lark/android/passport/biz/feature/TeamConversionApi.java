package com.ss.lark.android.passport.biz.feature;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.base.network.handler.AfterLoginUnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.network.service.RequestService;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49199m;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64606c;
import com.ss.lark.android.passport.biz.utils.UserCpParseUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J(\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/TeamConversionApi;", "", "()V", "TAG", "", "discovery", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getDispatchNextData", "mUniContext", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "openAccountCenter", "inContext", "Landroid/content/Context;", "teaPath", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.d */
public final class TeamConversionApi {

    /* renamed from: a */
    public static final TeamConversionApi f163334a = new TeamConversionApi();

    /* renamed from: b */
    private static final String f163335b = f163335b;

    private TeamConversionApi() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/TeamConversionApi$getDispatchNextData$mCallback$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.d$a */
    public static final class C64771a implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ UniContext f163336a;

        /* renamed from: b */
        final /* synthetic */ PassportLog f163337b;

        /* renamed from: c */
        final /* synthetic */ AbstractC49352d f163338c;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            this.f163338c.mo145178a(networkErrorResult);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            String str;
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            if (data == null || (jSONObject = data.stepInfo) == null) {
                str = null;
            } else {
                str = jSONObject.toJSONString();
            }
            UserOperationCenterInfo userOperationCenterInfo = (UserOperationCenterInfo) C38760a.m153056a(str, UserOperationCenterInfo.class);
            UserCpParseUtil.m256143a(this.f163336a, userOperationCenterInfo, this.f163337b);
            this.f163338c.mo145179a(userOperationCenterInfo);
        }

        C64771a(UniContext uniContext, PassportLog passportLog, AbstractC49352d dVar) {
            this.f163336a = uniContext;
            this.f163337b = passportLog;
            this.f163338c = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/TeamConversionApi$openAccountCenter$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.d$b */
    public static final class C64772b implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ UDDialogUtils.DialogWrapper f163339a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f163340b;

        /* renamed from: c */
        final /* synthetic */ String f163341c;

        /* renamed from: d */
        final /* synthetic */ PassportLog f163342d;

        /* renamed from: e */
        final /* synthetic */ AbstractC49352d f163343e;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            this.f163339a.mo171634b();
            PassportLog passportLog = this.f163342d;
            TeamConversionApi dVar = TeamConversionApi.f163334a;
            String str = TeamConversionApi.f163335b;
            passportLog.mo171465b(str, "teamConvertType error=" + networkErrorResult);
            Context context = (Context) this.f163340b.get();
            if (context != null) {
                if (4222 == networkErrorResult.getErrorCode()) {
                    C64606c.m253859a(context);
                } else {
                    AfterLoginUnknownCodeHandler.f123240a.mo171317a(context, networkErrorResult, null);
                }
            }
            AbstractC49352d dVar2 = this.f163343e;
            if (dVar2 != null) {
                dVar2.mo145178a(networkErrorResult);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f163339a.mo171634b();
            Context context = (Context) this.f163340b.get();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "contextRf.get() ?: return");
                BaseStepData data = responseModel.getData();
                if (data != null) {
                    jSONObject = data.stepInfo;
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null && data != null) {
                    data.stepInfo = new JSONObject();
                }
                if (data != null && (jSONObject2 = data.stepInfo) != null) {
                    jSONObject2.put((Object) "__tea_path__", (Object) this.f163341c);
                    C49092f.m193527a(context, data, RouterScene.INVITE.value, this.f163342d, new C64773a(this, context, data));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "code", "", "model", "", "kotlin.jvm.PlatformType", "onRouterResult", "com/ss/lark/android/passport/biz/feature/TeamConversionApi$openAccountCenter$1$onSuccess$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.d$b$a */
        static final class C64773a implements AbstractC49336a {

            /* renamed from: a */
            final /* synthetic */ C64772b f163344a;

            /* renamed from: b */
            final /* synthetic */ Context f163345b;

            /* renamed from: c */
            final /* synthetic */ BaseStepData f163346c;

            C64773a(C64772b bVar, Context context, BaseStepData baseStepData) {
                this.f163344a = bVar;
                this.f163345b = context;
                this.f163346c = baseStepData;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public final void onRouterResult(int i, Object obj) {
                if (i == -100) {
                    AbstractC49352d dVar = this.f163344a.f163343e;
                    if (dVar != null) {
                        dVar.mo145179a((Object) true);
                        return;
                    }
                    return;
                }
                AbstractC49352d dVar2 = this.f163344a.f163343e;
                if (dVar2 != null) {
                    dVar2.mo145178a(new NetworkErrorResult(-1, "code=" + i + "; msg=" + this.f163346c));
                }
            }
        }

        C64772b(UDDialogUtils.DialogWrapper aVar, WeakReference weakReference, String str, PassportLog passportLog, AbstractC49352d dVar) {
            this.f163339a = aVar;
            this.f163340b = weakReference;
            this.f163341c = str;
            this.f163342d = passportLog;
            this.f163343e = dVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m254372a(UniContext uniContext, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171305a("/accounts/register/discovery").mo171303a(HttpMethod.GET).mo171310a();
        C49199m.m193957a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m254371a(UniContext uniContext, PassportLog passportLog, AbstractC49352d<UserOperationCenterInfo> dVar) {
        Intrinsics.checkParameterIsNotNull(passportLog, "log");
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        CommonRequest a = new CommonRequest.Builder(uniContext, true).mo171303a(HttpMethod.POST).mo171305a("/accounts/security/user/user_center").mo171309a(true).mo171310a();
        RequestService.f123287a.mo171365a(a, new C64771a(uniContext, passportLog, dVar));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m254370a(Context context, PassportLog passportLog, String str, AbstractC49352d<Boolean> dVar) {
        Intrinsics.checkParameterIsNotNull(context, "inContext");
        Intrinsics.checkParameterIsNotNull(passportLog, "log");
        Intrinsics.checkParameterIsNotNull(str, "teaPath");
        String string = context.getString(R.string.Lark_Legacy_BaseUiLoading);
        Intrinsics.checkExpressionValueIsNotNull(string, "inContext.getString(R.st…ark_Legacy_BaseUiLoading)");
        UDDialogUtils.DialogWrapper a = UDDialogUtils.m193813a(context, string, (float) BitmapDescriptorFactory.HUE_RED, (Boolean) null, 12, (Object) null);
        WeakReference weakReference = new WeakReference(context);
        CommonRequest a2 = new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, true).mo171303a(HttpMethod.POST).mo171305a("/accounts/security/user/user_center").mo171309a(true).mo171310a();
        RequestService.f123287a.mo171365a(a2, new C64772b(a, weakReference, str, passportLog, dVar));
        return a2;
    }
}

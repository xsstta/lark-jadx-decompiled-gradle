package com.ss.lark.android.passport.biz.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.lark.android.passport.biz.feature.LoginApi;
import com.ss.lark.android.passport.biz.feature.sso.QRLoginStepInfo;
import com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthActivity;
import com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(IQRLoginService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\"\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016JD\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J.\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u001a\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u001b\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/QRLoginService;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IQRLoginService;", "()V", "qrLoginCancel", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "token", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "qrLoginCheck", "qrLoginConfirm", "scopeList", "", "isMultiLogin", "", "startAuthConfirmActivity", "", "context", "Landroid/content/Context;", "qrcodeToken", ShareHitPoint.f121868c, "", "baseStepData", "startQRCodeConfirmActivity", "startSSOUrlConfirmActivity", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class QRLoginService implements IQRLoginService {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/QRLoginService$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.QRLoginService$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/QRLoginService$qrLoginCheck$callbackWrapper$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.QRLoginService$b */
    public static final class C65217b implements IGetDataCallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ PassportLog f164202a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f164203b;

        /* renamed from: a */
        public void onSuccess(BaseStepData baseStepData) {
            this.f164202a.mo171465b("n_action_qrlogin_scan_request_succ", "QRLoginService qrlogin/scan");
            IGetDataCallback iGetDataCallback = this.f164203b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(baseStepData);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f164202a.mo171471d("n_action_qrlogin_scan_request_fail", "QRLoginService qrlogin/scan");
            IGetDataCallback iGetDataCallback = this.f164203b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C65217b(PassportLog passportLog, IGetDataCallback iGetDataCallback) {
            this.f164202a = passportLog;
            this.f164203b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService
    public AbstractC49347c qrLoginCheck(String str, IGetDataCallback<BaseStepData> iGetDataCallback) {
        String str2;
        PassportLog a = PassportLog.f123351c.mo171474a();
        C65217b bVar = new C65217b(a, iGetDataCallback);
        StringBuilder sb = new StringBuilder();
        sb.append("QRLoginService qrlogin/scan begin, token=");
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        sb.append(MonitorUtil.m193717b(str2));
        a.mo171465b("n_action_qrlogin_scan_request", sb.toString());
        if (str == null) {
            str = "";
        }
        return LoginApi.m253951a(str, bVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService
    public void startQRCodeConfirmActivity(Context context, String str, BaseStepData baseStepData) {
        startAuthConfirmActivity(context, str, 1, baseStepData);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService
    public void startSSOUrlConfirmActivity(Context context, String str, BaseStepData baseStepData) {
        startAuthConfirmActivity(context, str, 2, baseStepData);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService
    public AbstractC49347c qrLoginCancel(UniContext uniContext, String str, IGetDataCallback<BaseStepData> iGetDataCallback) {
        if (str == null) {
            str = "";
        }
        return LoginApi.m253946a(uniContext, str, iGetDataCallback);
    }

    public void startAuthConfirmActivity(Context context, String str, int i, BaseStepData baseStepData) {
        JSONObject jSONObject;
        PassportLog a = PassportLog.f123351c.mo171474a();
        JSONObject jSONObject2 = null;
        if (baseStepData != null) {
            jSONObject = baseStepData.stepInfo;
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            a.mo171471d("QRLoginService", "startQRCodeConfirmActivity baseStepData.stepInfo is null");
        }
        if (baseStepData != null) {
            jSONObject2 = baseStepData.stepInfo;
        }
        QRLoginStepInfo qRLoginStepInfo = (QRLoginStepInfo) C49202p.m193967a(jSONObject2, QRLoginStepInfo.class);
        if (qRLoginStepInfo == null) {
            a.mo171471d("QRLoginService", "startQRCodeConfirmActivity qrLoginStepInfo is null");
            return;
        }
        UniContext g = WatcherUniContext.f123348l.mo171439g();
        if (Intrinsics.areEqual("authz", qRLoginStepInfo.template) && qRLoginStepInfo.authInfo != null) {
            qRLoginStepInfo.authInfo.buttonList = C49202p.m193971b(C49202p.m193970a(qRLoginStepInfo.buttonList), ButtonInfo.class);
            a.mo171465b("n_action_auth_choose", "template is auth");
            ExternalAuthActivity.m255260a(context, g, i, str, qRLoginStepInfo.authInfo, false);
        } else if (!Intrinsics.areEqual("suite", qRLoginStepInfo.template) || qRLoginStepInfo.suiteInfo == null) {
            String str2 = qRLoginStepInfo.template;
            Intrinsics.checkExpressionValueIsNotNull(str2, "qrLoginStepInfo.template");
            if (TextUtils.isEmpty(str2)) {
                str2 = "template is empty";
            }
            a.mo171471d("n_action_auth_choose_error", "unknown template type, startQRCodeConfirmActivity templateError -> " + str2);
        } else {
            qRLoginStepInfo.suiteInfo.buttonList = C49202p.m193971b(C49202p.m193970a(qRLoginStepInfo.buttonList), ButtonInfo.class);
            a.mo171465b("n_action_auth_choose", "template is suite");
            SuiteConfirmActivity.m255490a(context, g, i, str, qRLoginStepInfo.suiteInfo, false);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService
    public AbstractC49347c qrLoginConfirm(UniContext uniContext, String str, List<String> list, boolean z, IGetDataCallback<BaseStepData> iGetDataCallback) {
        if (str == null) {
            str = "";
        }
        return LoginApi.m253948a(uniContext, str, list, z, iGetDataCallback);
    }
}

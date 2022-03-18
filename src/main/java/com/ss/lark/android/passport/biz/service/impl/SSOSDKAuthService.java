package com.ss.lark.android.passport.biz.service.impl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.C49366a;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService;
import com.ss.lark.android.passport.biz.feature.LoginApi;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@ClaymoreImpl(ISSOSDKAuthService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J>\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J6\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014H\u0016JV\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/SSOSDKAuthService;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ISSOSDKAuthService;", "()V", "convertToAuthRequestData", "Lcom/ss/android/lark/passport/signinsdk_api/entity/AuthRequestData;", "appId", "", "packageId", "signature", "redirectUri", "scope", "getRandomNumber", "ssoConfirm", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "userId", "scopeList", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SSOConfirmStepInfo;", "userOAuth", "authRequestData", "isChallengeMode", "", "Lcom/ss/android/lark/passport/signinsdk_api/entity/AuthInfo;", "userSdkOAuth", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SSOSDKAuthService implements ISSOSDKAuthService {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_CODE = KEY_CODE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/SSOSDKAuthService$Companion;", "", "()V", "KEY_CODE", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.SSOSDKAuthService$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String getRandomNumber() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        return StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService
    public AbstractC49347c ssoConfirm(UniContext uniContext, String str, List<String> list, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback) {
        return LoginApi.m253947a(uniContext, str, list, PassportLog.f123351c.mo171474a(), iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService
    public AbstractC49347c userOAuth(UniContext uniContext, C49366a aVar, boolean z, IGetDataCallback<AuthInfo> iGetDataCallback) {
        return LoginApi.m253945a(uniContext, aVar, z, PassportLog.f123351c.mo171474a(), iGetDataCallback);
    }

    private final C49366a convertToAuthRequestData(String str, String str2, String str3, String str4, String str5) {
        C49366a aVar = new C49366a();
        if (str != null) {
            aVar.f123890a = str;
        }
        if (str2 != null) {
            aVar.f123891b = str2;
        }
        if (str3 != null) {
            aVar.f123894e = str3;
        }
        if (str5 != null) {
            aVar.f123896g = str5;
        }
        if (str4 != null) {
            aVar.f123895f = str4;
        } else if (str != null) {
            aVar.f123890a = str + "://oauth";
        }
        aVar.f123893d = getRandomNumber();
        aVar.f123892c = KEY_CODE;
        return aVar;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService
    public AbstractC49347c userSdkOAuth(UniContext uniContext, String str, String str2, String str3, String str4, String str5, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback) {
        return LoginApi.m253944a(uniContext, convertToAuthRequestData(str, str2, str3, str4, str5), PassportLog.f123351c.mo171474a(), iGetDataCallback);
    }
}

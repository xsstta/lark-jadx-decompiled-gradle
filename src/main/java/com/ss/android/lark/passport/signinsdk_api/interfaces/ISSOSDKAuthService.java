package com.ss.android.lark.passport.signinsdk_api.interfaces;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.C49366a;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&J6\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH&JV\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ISSOSDKAuthService;", "", "ssoConfirm", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "userId", "", "scopeList", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SSOConfirmStepInfo;", "userOAuth", "authRequestData", "Lcom/ss/android/lark/passport/signinsdk_api/entity/AuthRequestData;", "isChallengeMode", "", "Lcom/ss/android/lark/passport/signinsdk_api/entity/AuthInfo;", "userSdkOAuth", "appId", "packageId", "signature", "redirectUri", "scope", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.p */
public interface ISSOSDKAuthService {
    AbstractC49347c ssoConfirm(UniContext uniContext, String str, List<String> list, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback);

    AbstractC49347c userOAuth(UniContext uniContext, C49366a aVar, boolean z, IGetDataCallback<AuthInfo> iGetDataCallback);

    AbstractC49347c userSdkOAuth(UniContext uniContext, String str, String str2, String str3, String str4, String str5, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback);
}

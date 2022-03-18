package com.ss.android.lark.passport.infra.service;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\"\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H&J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H&J2\u0010\u0016\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00052\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H&J,\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H&J \u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005H&¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/ILogoutUserService;", "", "appendAllUserToOfflineLogoutTask", "", "users", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "clearForLogoutAll", "context", "Landroid/content/Context;", "userList", "clearForLogoutPart", "gotoLogin", "params", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SigninParams;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "logoutAll", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "logoutAllWithoutLogin", "logoutMulti", "userIdList", "", "logoutSingle", "userId", "startOfflineLogout", "tokenList", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.h */
public interface ILogoutUserService {
    void appendAllUserToOfflineLogoutTask();

    void appendAllUserToOfflineLogoutTask(List<? extends User> list);

    void clearForLogoutAll(Context context, List<? extends User> list);

    void clearForLogoutPart(List<? extends User> list);

    void logoutAll(Context context, IGetDataCallback<C49376b> iGetDataCallback);

    void logoutAllWithoutLogin(Context context, IGetDataCallback<C49376b> iGetDataCallback);

    void logoutMulti(Context context, List<String> list, IGetDataCallback<C49376b> iGetDataCallback);

    void logoutSingle(Context context, String str, IGetDataCallback<C49376b> iGetDataCallback);

    void startOfflineLogout(UniContext uniContext, List<String> list);
}

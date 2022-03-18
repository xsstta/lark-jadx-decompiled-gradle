package com.ss.android.lark.passport.infra.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J*\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J(\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/ILoginInitService;", "", "checkUserProtocolIfNeeded", "", "activity", "Landroid/app/Activity;", "userId", "", "getChatterById", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "gotoFeed", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "gotoOnBoarding", "initIMSdk", "session", "logoutToken", "isLoginFromExternal", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.g */
public interface ILoginInitService {
    void checkUserProtocolIfNeeded(Activity activity, String str);

    void getChatterById(User user, Activity activity, IGetDataCallback<Unit> iGetDataCallback);

    void gotoFeed(Context context, User user, Bundle bundle);

    void gotoOnBoarding();

    boolean isLoginFromExternal();
}

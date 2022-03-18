package com.ss.lark.android.passport.biz.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49126j;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.UserSwitchReason;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.utils.C57881t;
import com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ClaymoreImpl(AbstractC49126j.class)
public class MakeUserOnlineServiceImpl implements AbstractC49126j {
    public User foregroundUser;
    public final PassportLog log = PassportLog.f123351c.mo171474a();
    public User targetUser;

    private String getLanguageLocalTag() {
        Locale languageSetting = ServiceFinder.m193752g().getLanguageSetting();
        if (languageSetting != null) {
            return languageSetting.getLanguage();
        }
        return "zh_CN";
    }

    private String getRustAvatarPath(Context context) {
        String J = C57881t.m224611J(context);
        PassportLog passportLog = this.log;
        passportLog.mo171465b("n_action_online_succ", "Rust avatar path is:" + J);
        C26311p.m95289i(J);
        return J;
    }

    public synchronized void logoutUserListIfExcludeLogin(Context context) {
        if (this.targetUser.isExcludeLogin()) {
            this.log.mo171465b("n_action_online_succ", "isExcludeLogin");
            ArrayList arrayList = new ArrayList();
            List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
            for (int i = 0; i < allUserList.size(); i++) {
                arrayList.add(allUserList.get(i).userId);
            }
            arrayList.remove(this.targetUser.userId);
            ((ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class)).logoutMulti(context, arrayList, new IGetDataCallback<C49376b>() {
                /* class com.ss.lark.android.passport.biz.service.impl.MakeUserOnlineServiceImpl.C652163 */

                /* renamed from: a */
                public void onSuccess(C49376b bVar) {
                    if (bVar == null || !bVar.f123924a) {
                        MakeUserOnlineServiceImpl.this.log.mo171471d("n_action_online_succ", "logoutMulti failed");
                    } else {
                        MakeUserOnlineServiceImpl.this.log.mo171465b("n_action_online_succ", "logoutMulti success");
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    PassportLog passportLog = MakeUserOnlineServiceImpl.this.log;
                    passportLog.mo171471d("n_action_online_succ", "logoutMulti onError,code is:" + errorResult.getErrorCode() + ",message is:" + errorResult.getErrorMsg());
                }
            });
        }
    }

    public void dealError(String str, int i, String str2, UniContext uniContext, IGetDataCallback<C49382d> iGetDataCallback) {
        this.log.mo171471d(str, str2);
        UserSwitchListenerManager.m193645a(new ErrorResult(i, str2));
        if (iGetDataCallback == null) {
            this.log.mo171471d(str, "callback is null");
        } else {
            iGetDataCallback.onError(new ErrorResult(i, str2));
        }
    }

    public void dealSuccess(Context context, String str, UniContext uniContext, int i, IGetDataCallback<C49382d> iGetDataCallback) {
        PassportLog passportLog = this.log;
        passportLog.mo171465b("n_action_online_succ", "success, foregroundUser is" + this.foregroundUser + "targetUser is:" + this.targetUser.userId);
        doSuccessAction(context, str, i, uniContext, iGetDataCallback);
    }

    private void doSuccessAction(final Context context, String str, final int i, UniContext uniContext, final IGetDataCallback<C49382d> iGetDataCallback) {
        if (TextUtils.isEmpty(str) || this.targetUser == null) {
            dealError("n_action_online_succ", -101, "doSuccessAction, targetUser or targetUserAccessToken is null", UniContext.CONTEXT_SWITCH, iGetDataCallback);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        PassportLog passportLog = this.log;
        passportLog.mo171465b("n_action_online_succ", "on switch success time = " + currentTimeMillis);
        final IUserService userService = ServiceFinder.m193744a().getUserService(this.targetUser.userId);
        final LoginInfo loginInfo = ServiceFinder.m193748c().getLoginInfo();
        ServiceFinder.m193744a().switchUser(this.targetUser.getUserId());
        this.log.mo171460a("n_action_online_set_start");
        ServiceFinder.m193764s().executeSwitchInitTasks(this.targetUser);
        if (userService != null && userService.mo171594d() != null) {
            this.log.mo171465b("n_action_online_succ", "updateLoginUsers, getChatterById");
            ServiceFinder.m193752g().updateLoginUsers(userService.mo171594d());
        } else if (userService == null) {
            this.log.mo171471d("n_action_online_succ", "no target user");
        } else {
            this.log.mo171471d("n_action_online_succ", "target user login info is null");
        }
        this.log.mo171460a("n_action_online_set_end");
        PassportLog passportLog2 = this.log;
        passportLog2.mo171461a("n_action_online_succ", "on trigger ui change time = " + System.currentTimeMillis());
        ServiceFinder.m193764s().executeLoadAllConfigTask(this.targetUser, new Function1<Boolean, Unit>() {
            /* class com.ss.lark.android.passport.biz.service.impl.MakeUserOnlineServiceImpl.C652152 */

            /* renamed from: a */
            public Unit invoke(Boolean bool) {
                boolean z;
                PassportLog passportLog = MakeUserOnlineServiceImpl.this.log;
                passportLog.mo171465b("n_action_online_succ", "clear data time = " + (System.currentTimeMillis() - currentTimeMillis));
                MakeUserOnlineServiceImpl.this.log.mo171465b("n_action_online_succ", "onTrigger start");
                if (bool.booleanValue()) {
                    ServiceFinder.m193752g().startNewOnBoarding();
                }
                if (bool.booleanValue() || i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                ServiceFinder.m193752g().onTriggerLoginInfoChangedStart(z);
                if (userService == null) {
                    return null;
                }
                MakeUserOnlineServiceImpl.this.log.mo171465b("n_action_online_succ", "triggerLoginInfo");
                C64395b.m253103a().mo222947a(loginInfo, userService.mo171594d());
                UserSwitchListenerManager.m193647a(UserSwitchReason.fromValue(i), MakeUserOnlineServiceImpl.this.foregroundUser, MakeUserOnlineServiceImpl.this.targetUser);
                if (iGetDataCallback != null) {
                    C49382d dVar = new C49382d(UserSwitchReason.fromValue(i), MakeUserOnlineServiceImpl.this.foregroundUser, MakeUserOnlineServiceImpl.this.targetUser);
                    MakeUserOnlineServiceImpl.this.log.mo171465b("n_action_online_succ", "Make User Online success, callback onSuccess");
                    iGetDataCallback.onSuccess(dVar);
                } else {
                    MakeUserOnlineServiceImpl.this.log.mo171471d("n_action_online_succ", "Make User Online success, callback is null");
                }
                MakeUserOnlineServiceImpl.this.logoutUserListIfExcludeLogin(context);
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49126j
    public void asyncMakeUserOnline(final Context context, User user, User user2, final String str, final int i, final IGetDataCallback<C49382d> iGetDataCallback) {
        final UniContext uniContext = UniContext.CONTEXT_SWITCH;
        if (iGetDataCallback == null) {
            this.log.mo171471d("n_action_make_user_online_start", "callback is null");
            return;
        }
        ((IDeviceService) ServiceFinder.m193746a(IDeviceService.class)).setDeviceId(ServiceFinder.m193762q().getDeviceId());
        if (user2 == null || TextUtils.isEmpty(user2.userId)) {
            dealError("n_action_make_user_online_start", -101, "TargetUser or targetUserId is null", UniContext.CONTEXT_SWITCH, iGetDataCallback);
        } else if (TextUtils.isEmpty(str)) {
            dealError("n_action_make_user_online_start", -101, "TargetUserAccessToken is null", UniContext.CONTEXT_SWITCH, iGetDataCallback);
        } else {
            this.targetUser = user2;
            this.foregroundUser = user;
            this.log.mo171460a("n_action_make_user_online_start");
            ServiceFinder.m193752g().asyncMakeUserOnline(str, user2.userId, getLanguageLocalTag(), getRustAvatarPath(context), new IGetDataCallback<Boolean>() {
                /* class com.ss.lark.android.passport.biz.service.impl.MakeUserOnlineServiceImpl.C652141 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        MakeUserOnlineServiceImpl.this.dealSuccess(context, str, uniContext, i, iGetDataCallback);
                    } else {
                        MakeUserOnlineServiceImpl.this.dealError("n_action_online_succ", -101, "makeUserOnlineResponse fail", uniContext, iGetDataCallback);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UnknownCodeHandler.f123256a.mo171331c(context, new NetworkErrorResult(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
                    MakeUserOnlineServiceImpl.this.dealError("n_action_online_fail", -101, "asyncMakeUserOffline onError", uniContext, iGetDataCallback);
                }
            });
        }
    }
}

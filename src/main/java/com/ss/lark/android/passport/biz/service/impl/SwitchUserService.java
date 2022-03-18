package com.ss.lark.android.passport.biz.service.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40658y;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.entity.NextValidInfo;
import com.ss.android.lark.passport.infra.entity.RecoverEnvEntity;
import com.ss.android.lark.passport.infra.entity.SwitchEntity;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49138a;
import com.ss.android.lark.passport.infra.util.C49193h;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.account.ResponseUser;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.UserSwitchReason;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.CheckStatusResp;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.EnterAppStep;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SwitchUserData;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.switch_user.SwitchNextValidFlagActivity;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@ClaymoreImpl(AbstractC49128n.class)
public class SwitchUserService implements AbstractC49128n {
    public static final PassportLog log = PassportLog.f123351c.mo171474a();
    private Handler delayHandler;
    public User foregroundUser;
    private AtomicBoolean isIntercept = new AtomicBoolean(false);
    private volatile UDDialogUtils.DialogWrapper mSwitchTenantDialog;
    public User targetUser;
    public UniContext uniContext;

    public void hideTenantSwitchLoadingView() {
        dismissSwitchTenantDialog();
        ServiceFinder.m193752g().onTenantSwitchLoadingShow(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.SwitchUserService$a */
    public class RunnableC65231a implements Runnable {

        /* renamed from: b */
        private final WeakReference<Context> f164260b;

        /* renamed from: c */
        private final int f164261c;

        /* renamed from: d */
        private final String f164262d;

        /* renamed from: e */
        private final boolean f164263e;

        public void run() {
            SwitchUserService.this.showSwitchTenantDialog(this.f164260b.get(), this.f164261c, this.f164262d, this.f164263e);
        }

        public RunnableC65231a(Context context, int i, String str, boolean z) {
            this.f164260b = new WeakReference<>(context);
            this.f164261c = i;
            this.f164262d = str;
            this.f164263e = z;
        }
    }

    public synchronized void dismissSwitchTenantDialog() {
        PassportLog passportLog = log;
        passportLog.mo171465b("SwitchUserService", "dismissSwitchTenantDialog");
        if (this.mSwitchTenantDialog == null) {
            passportLog.mo171465b("SwitchUserService", "mSwitchTenantDialog is null");
            return;
        }
        this.delayHandler.removeCallbacksAndMessages(null);
        this.mSwitchTenantDialog.mo171634b();
        this.mSwitchTenantDialog = null;
    }

    private void printIdAndEncryptSession() {
        String str;
        HashMap hashMap = new HashMap();
        User user = this.foregroundUser;
        String str2 = "null";
        if (user == null) {
            str = str2;
        } else {
            str = user.userId;
        }
        hashMap.put("currentUserId:", str);
        User user2 = this.foregroundUser;
        if (user2 != null) {
            str2 = C49160a.m193857b(user2.getSession());
        }
        hashMap.put("currentUserSession:", str2);
        hashMap.put("targetUserId:", this.targetUser.userId);
        hashMap.put("targetUserSession:", C49160a.m193857b(this.targetUser.getSession()));
        log.mo171467b("n_action_switch_entry", "switchInfo:", hashMap);
    }

    private boolean isNextValidPath(SwitchEntity switchEntity) {
        if (switchEntity == null || switchEntity.getNextValidInfo() == null || !switchEntity.getNextValidInfo().isToNextValid()) {
            return false;
        }
        return true;
    }

    public void updateLocalSession(SwitchUserData switchUserData) {
        if (switchUserData == null) {
            log.mo171471d("n_action_switch_update_info", "data is null");
            return;
        }
        EnterAppStep enterAppStep = (EnterAppStep) C49202p.m193967a(switchUserData.stepInfo, EnterAppStep.class);
        boolean z = false;
        if (enterAppStep != null && C49193h.m193950b(enterAppStep.userList)) {
            ArrayList arrayList = new ArrayList();
            for (ResponseUser responseUser : enterAppStep.userList) {
                User user = responseUser.getUser();
                if (user != null) {
                    user.mergeWithResponseUser(responseUser);
                    arrayList.add(user);
                    if (TextUtils.equals(this.targetUser.userId, user.userId) && (!TextUtils.equals(this.targetUser.getSession(), user.getSession()) || this.targetUser.isAnonymous() != user.isAnonymous())) {
                        this.targetUser = user;
                        z = true;
                    }
                }
            }
            if (z) {
                log.mo171465b("n_action_switch_update_info", "remote and localSession is different, change it");
                ServiceFinder.m193744a().updateUsers(arrayList);
            }
        }
    }

    public boolean isValidUser(TenantInfo tenantInfo, SwitchEntity switchEntity) {
        if (tenantInfo == null || switchEntity == null || ServiceFinder.m193745a(switchEntity.getTargetUserId()) == null || ServiceFinder.m193745a(switchEntity.getTargetUserId()).mo171597e() == null || TextUtils.isEmpty(ServiceFinder.m193745a(switchEntity.getTargetUserId()).mo171597e().userId)) {
            return false;
        }
        return true;
    }

    private void checkLocalSessions(final int i, final IGetDataCallback<List<User>> iGetDataCallback) {
        final LinkedHashMap<User, String> validUserSessionMap = ServiceFinder.m193744a().getValidUserSessionMap();
        log.mo171465b("n_action_switch_to_valid_check_session", "start");
        if (validUserSessionMap.isEmpty()) {
            iGetDataCallback.onError(new ErrorResult("no more valid user"));
            return;
        }
        HashMap hashMap = new HashMap();
        final List<User> allValidUserList = ServiceFinder.m193744a().getAllValidUserList();
        ArrayList arrayList = new ArrayList(allValidUserList.size());
        for (User user : allValidUserList) {
            arrayList.add(user.getUserId());
        }
        hashMap.put("local_valid_users", arrayList);
        log.mo171467b("n_action_switch_to_valid_check_session", "local valid users", hashMap);
        WatcherHelper.m193664a(this.uniContext, C40658y.f103244m);
        FeatureCApi.m253706a(true, (ICallback<CheckStatusResp>) new ICallback<CheckStatusResp>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652203 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return CheckStatusResp.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = SwitchUserService.log;
                passportLog.mo171471d("n_action_switch_to_valid_check_session", "check session failed, use local invalid users, err: " + networkErrorResult);
                if (allValidUserList.isEmpty()) {
                    iGetDataCallback.onSuccess(allValidUserList);
                } else {
                    iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<CheckStatusResp> responseModel) {
                WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103245n);
                if (responseModel.getData() == null || C49193h.m193949a(responseModel.getData().sessionStatusMap)) {
                    iGetDataCallback.onError(new ErrorResult("no more valid user"));
                    return;
                }
                ArrayList<User> arrayList = new ArrayList();
                ArrayList<User> arrayList2 = new ArrayList();
                for (Map.Entry entry : validUserSessionMap.entrySet()) {
                    CheckStatusResp.SessionStatus sessionStatus = responseModel.getData().sessionStatusMap.get(entry.getValue());
                    if (sessionStatus == null || !sessionStatus.isLogged()) {
                        arrayList2.add(entry.getKey());
                    } else {
                        arrayList.add(entry.getKey());
                    }
                }
                if (!arrayList2.isEmpty() && i != 1) {
                    ServiceFinder.m193758m().sessionMayInvalid("switch_next_valid");
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                for (User user : arrayList) {
                    arrayList3.add(user.getUserId());
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                for (User user2 : arrayList2) {
                    arrayList4.add(user2.getUserId());
                }
                hashMap.put("valid_users", arrayList3);
                hashMap.put("invalid_users", arrayList4);
                SwitchUserService.log.mo171467b("n_action_switch_to_valid_valid_users", "users", hashMap);
                if (arrayList.isEmpty()) {
                    iGetDataCallback.onError(new ErrorResult("no more valid user"));
                } else {
                    iGetDataCallback.onSuccess(arrayList);
                }
            }
        });
    }

    private boolean isBlockSwitch(int i, IGetDataCallback<C49382d> iGetDataCallback) {
        if (ServiceFinder.m193752g().isLeanModeOn() && i != 1) {
            dealError("n_action_switch_block", "isLeanModeOn true", iGetDataCallback, 1);
            C49266a.m194146a(ServiceFinder.m193748c().getApplicationContext(), (int) R.string.Lark_Security_LeanModeFeatureNotAvailableGeneralMessage);
            return true;
        } else if (ServiceFinder.m193752g().isNetWorkUnAvailable()) {
            dealError("n_action_switch_block", "Network is UnAvailable", iGetDataCallback, 1);
            UDDialogUtils.m193815a(C64340b.m252955a().mo222861c(), UIHelper.getString(R.string.Lark_Legacy_SwitchUser_InternetErrorAlert_Title), UIHelper.getString(R.string.Lark_Legacy_SwitchUser_InternetErrorAlert_Content), UIHelper.getString(R.string.Lark_Legacy_SwitchUser_InternetErrorAlert_Confirm), null);
            return true;
        } else if (!this.isIntercept.get()) {
            return false;
        } else {
            log.mo171471d("n_action_switch_block", "SwitchUser ing, Please wait");
            return true;
        }
    }

    public void dealSuccess(int i, IGetDataCallback<C49382d> iGetDataCallback) {
        this.isIntercept.set(false);
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_switch_succ", "success, foregroundUser is" + this.foregroundUser + "targetUser is:" + this.targetUser);
        C49382d dVar = new C49382d(UserSwitchReason.fromValue(i), this.foregroundUser, this.targetUser);
        if (iGetDataCallback != null) {
            passportLog.mo171465b("n_action_switch_succ", "switch user success, end");
            iGetDataCallback.onSuccess(dVar);
        } else {
            passportLog.mo171465b("n_action_switch_succ", "switch user success, end, but callback is null");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("switch_reason", UserSwitchReason.getDescFromValue(i));
        WatcherHelper.m193665a(this.uniContext, C40658y.f103233b, hashMap);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49128n
    public synchronized void switchUser(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback) {
        switchUser(context, new SwitchEntity(str, 4, true), iGetDataCallback);
    }

    public void normalRustOfflineOnline(Context context, SwitchEntity switchEntity, IGetDataCallback<C49382d> iGetDataCallback) {
        if (2 == switchEntity.getSwitchReason() || this.foregroundUser == null) {
            log.mo171465b("n_action_make_user_online_start", "makeTargetUserOnline");
            makeTargetUserOnline(context, this.targetUser.getSession(), switchEntity.getSwitchReason(), iGetDataCallback);
            return;
        }
        log.mo171465b("n_action_make_user_offline_start", "makeForegroundUserOfflineAndMakeTargetUserOnline");
        makeForegroundUserOfflineAndMakeTargetUserOnline(context, this.targetUser.getSession(), switchEntity.getSwitchReason(), iGetDataCallback);
    }

    private void crossEnvRustOfflineOnline(final Context context, final SwitchEntity switchEntity, final IGetDataCallback<C49382d> iGetDataCallback) {
        final HostEnvBean cloneMe = C48998a.f123026a.mo171070e().cloneMe();
        final String deviceId = ServiceFinder.m193762q().getDeviceId();
        final String configEnv = ServiceFinder.m193749d().getConfigEnv();
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_update_env_start", "switchUser, oldDeviceId is:" + deviceId + "oldConfigEnv is:" + configEnv);
        ServiceFinder.m193760o().updateEnvAndDid(this.targetUser.userUnit, this.targetUser.configEnv, this.uniContext, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652247 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                String str;
                SwitchUserService.log.mo171464b("n_action_update_env_fail");
                C49266a.m194146a(context, (int) R.string.Lark_Passport_SwitchTeamFailToast);
                if (networkErrorResult != null) {
                    str = networkErrorResult.getErrorMessage();
                } else {
                    str = "null";
                }
                SwitchUserService switchUserService = SwitchUserService.this;
                switchUserService.dealCrossEnvError("n_action_update_env_fail", "updateEnvAndGetDid failed, errorMsg is:" + str, new RecoverEnvEntity(cloneMe, deviceId, configEnv), iGetDataCallback);
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                PassportLog passportLog = SwitchUserService.log;
                passportLog.mo171465b("n_action_update_env_succ", "updateEnvAndGetDid success, new DeviceId is:" + str);
                WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103238g);
                if (TextUtils.isEmpty(SwitchUserService.this.targetUser.getSession()) || SwitchUserService.this.targetUser.isAnonymous()) {
                    SwitchUserService.log.mo171460a("n_action_switch_cross_switch_start");
                    HashMap hashMap = new HashMap();
                    hashMap.put("request_type", "after_cross_env");
                    WatcherHelper.m193665a(SwitchUserService.this.uniContext, C40658y.f103235d, hashMap);
                    FeatureCApi.m253701a(SwitchUserService.this.targetUser.userId, SwitchUserService.this.targetUser.getLoginCredentialId(), SwitchUserService.this.targetUser.getSession(), SwitchUserService.this.uniContext, SwitchUserService.log, new ICallback<SwitchUserData>() {
                        /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652247.C652251 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                        /* renamed from: a */
                        public Type mo101474a() {
                            return SwitchUserData.class;
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                        /* renamed from: a */
                        public void mo101475a(NetworkErrorResult networkErrorResult) {
                            UnknownCodeHandler.f123256a.mo171331c(context, networkErrorResult);
                            SwitchUserService.this.dealCrossEnvError("n_action_switch_cross_switch_fail", "crossEnvRustOfflineOnline， switchUser failed", new RecoverEnvEntity(cloneMe, deviceId, configEnv), iGetDataCallback);
                        }

                        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                        /* renamed from: a */
                        public void mo101476a(ResponseModel<SwitchUserData> responseModel) {
                            if (responseModel == null || responseModel.getData() == null) {
                                SwitchUserService.this.dealCrossEnvError("n_action_switch_cross_switch_succ", "crossEnvRustOfflineOnline, switch/identity success, but data is null", new RecoverEnvEntity(cloneMe, deviceId, configEnv), iGetDataCallback);
                                return;
                            }
                            SwitchUserService.log.mo171460a("n_action_switch_cross_switch_succ");
                            if (!"enter_app".equals(responseModel.getData().nextStep)) {
                                C49092f.m193529a(context, responseModel.getData(), RouterScene.ALL.value, SwitchUserService.this.uniContext, (PassportLog) null, new AbstractC49336a() {
                                    /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652247.C652251.C652261 */

                                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                                    public void onRouterResult(int i, Object obj) {
                                        SwitchUserService.log.mo171465b("n_action_switch_cross_switch_succ", "crossEnv, jump success");
                                    }
                                });
                                SwitchUserService.this.dealCrossEnvError("n_action_switch_cross_switch_succ", "error step, check it.", new RecoverEnvEntity(cloneMe, deviceId, configEnv), iGetDataCallback);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("next_step", responseModel.getData().nextStep);
                            hashMap.put("request_type", "after_cross_env");
                            WatcherHelper.m193665a(SwitchUserService.this.uniContext, C40658y.f103236e, hashMap);
                            SwitchUserService.this.updateLocalSession(responseModel.getData());
                            SwitchUserService.log.mo171460a("n_action_switch_cross_init");
                            SwitchUserService.this.normalRustOfflineOnline(context, switchEntity, new IGetDataCallback<C49382d>() {
                                /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652247.C652251.C652272 */

                                /* renamed from: a */
                                public void onSuccess(C49382d dVar) {
                                    if (iGetDataCallback != null) {
                                        SwitchUserService.log.mo171465b("n_action_switch_cross_switch_succ", "normalRustOfflineOnline success");
                                        iGetDataCallback.onSuccess(dVar);
                                        return;
                                    }
                                    SwitchUserService.log.mo171468c("n_action_switch_cross_switch_succ", "normalRustOfflineOnline success, callback is null");
                                }

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    String str;
                                    SwitchUserService switchUserService = SwitchUserService.this;
                                    if (errorResult == null) {
                                        str = "normalRustOfflineOnline onError";
                                    } else {
                                        str = errorResult.getDebugMsg();
                                    }
                                    switchUserService.dealCrossEnvError("n_action_switch_cross_switch_succ", str, new RecoverEnvEntity(cloneMe, deviceId, configEnv), iGetDataCallback);
                                }
                            });
                        }
                    });
                    return;
                }
                SwitchUserService.log.mo171465b("n_action_switch_cross_init", "Session valid, no need to invoke switch/identity");
                SwitchUserService.this.normalRustOfflineOnline(context, switchEntity, iGetDataCallback);
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49128n
    public synchronized void switchUser(final Context context, final SwitchEntity switchEntity, final IGetDataCallback<C49382d> iGetDataCallback) {
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_switch_start", "switch user start");
        this.uniContext = WatcherUniContext.m193675d();
        HashMap hashMap = new HashMap();
        if (switchEntity != null) {
            hashMap.put("switch_reason", UserSwitchReason.getDescFromValue(switchEntity.getSwitchReason()));
        }
        WatcherHelper.m193665a(this.uniContext, C40658y.f103232a, hashMap);
        passportLog.mo171460a("n_action_switch_start");
        if (switchEntity == null) {
            dealError("n_action_switch_start", "SwitchEntity is null", iGetDataCallback, 1);
        } else if (context == null) {
            dealError("n_action_switch_start", "Context is null", iGetDataCallback, 1);
        } else {
            passportLog.mo171465b("n_action_switch_start", "SwitchReason is:" + UserSwitchReason.fromValue(switchEntity.getSwitchReason()));
            if (isBlockSwitch(switchEntity.getSwitchReason(), iGetDataCallback)) {
                passportLog.mo171471d("n_action_switch_block", "switchUser block");
                return;
            }
            if (switchEntity.getSwitchReason() == 1) {
                switchUserEntry(context, switchEntity, iGetDataCallback);
            } else {
                C49138a.m193781a().mo171619a(context, new IAccountInterceptor.AbstractC49386a() {
                    /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652181 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
                    /* renamed from: b */
                    public void mo133324b() {
                        SwitchUserService.this.dealError("n_action_switch_block", "intercepted, flow stopped", iGetDataCallback, 1);
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
                    /* renamed from: a */
                    public void mo133323a() {
                        SwitchUserService.log.mo171465b("n_action_switch_entry", "OnInterceptEnd");
                        SwitchUserService.this.switchUserEntry(context, switchEntity, iGetDataCallback);
                    }
                });
            }
        }
    }

    public void switchUserCore(final Context context, final SwitchEntity switchEntity, final IGetDataCallback<C49382d> iGetDataCallback) {
        if (context == null) {
            dealError("n_action_switch_entry", "Context is null", iGetDataCallback, 2);
        } else if (switchEntity == null || switchEntity.getTargetUser() == null) {
            dealError("n_action_switch_entry", "switchEntity or targetUser is null", iGetDataCallback, 2);
        } else {
            this.foregroundUser = ServiceFinder.m193744a().getForegroundUser();
            User targetUser2 = switchEntity.getTargetUser();
            this.targetUser = targetUser2;
            String str = null;
            IUserService a = ServiceFinder.m193745a(targetUser2.userId);
            if (a != null) {
                str = a.mo171592b();
            }
            if (TextUtils.isEmpty(str)) {
                log.mo171465b("n_action_switch_entry", "session is empty");
            }
            printIdAndEncryptSession();
            UserSwitchListenerManager.m193644a(switchEntity.getSwitchReason(), this.foregroundUser, this.targetUser);
            HashMap hashMap = new HashMap();
            hashMap.put("request_type", "switch_entry");
            WatcherHelper.m193665a(this.uniContext, C40658y.f103235d, hashMap);
            PassportLog passportLog = log;
            passportLog.mo171460a("n_action_switch_identity_next_req_start");
            FeatureCApi.m253701a(this.targetUser.userId, this.targetUser.getLoginCredentialId(), str, this.uniContext, passportLog, new ICallback<SwitchUserData>() {
                /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652225 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return SwitchUserData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    UnknownCodeHandler.f123256a.mo171331c(context, networkErrorResult);
                    SwitchUserService.this.dealError("n_action_switch_identity_next_req_fail", "switchUser failed", networkErrorResult.getErrorCode(), iGetDataCallback, 2);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<SwitchUserData> responseModel) {
                    if (iGetDataCallback == null || responseModel == null || responseModel.getData() == null || responseModel.getCode() != 0) {
                        SwitchUserService.this.dealError("n_action_switch_identity_next_req_succ", "interface success, but callback/data/code is error", iGetDataCallback, 2);
                        return;
                    }
                    SwitchUserService.log.mo171460a("n_action_switch_identity_next_req_succ");
                    HashMap hashMap = new HashMap();
                    hashMap.put("next_step", responseModel.getData().nextStep);
                    hashMap.put("request_type", "switch_entry");
                    WatcherHelper.m193665a(SwitchUserService.this.uniContext, C40658y.f103236e, hashMap);
                    if ("enter_app".equals(responseModel.getData().nextStep)) {
                        SwitchUserService.this.updateLocalSession(responseModel.getData());
                        SwitchUserService.this.doEnterAppStep(responseModel, context, switchEntity, iGetDataCallback);
                        return;
                    }
                    SwitchUserService.this.doOtherNextStep(responseModel, context, switchEntity, iGetDataCallback);
                }
            });
        }
    }

    public void switchUserEntry(final Context context, final SwitchEntity switchEntity, final IGetDataCallback<C49382d> iGetDataCallback) {
        int i;
        String str;
        PassportLog passportLog = log;
        passportLog.mo171460a("n_action_switch_entry");
        this.isIntercept.set(true);
        if (switchEntity == null) {
            i = 0;
        } else {
            i = switchEntity.getSwitchReason();
        }
        if (switchEntity == null) {
            str = null;
        } else {
            str = switchEntity.getCustomLoadingText();
        }
        showTenantSwitchLoadingView(context, i, str, true);
        if (switchEntity == null || context == null) {
            dealError("n_action_switch_entry", "Context is null", iGetDataCallback, 2);
            return;
        }
        passportLog.mo171465b("n_action_switch_entry", "switch user entry, switchReason is:" + UserSwitchReason.fromValue(switchEntity.getSwitchReason()));
        if (switchEntity.getTargetUser() == null) {
            passportLog.mo171468c("n_action_switch_entry", "targetUser is null");
            if (TextUtils.isEmpty(switchEntity.getTargetUserId())) {
                WatcherHelper.m193664a(this.uniContext, C40658y.f103247p);
                dealError("n_action_switch_entry", "targetUserId is empty", iGetDataCallback, 2);
                return;
            }
            String generateContextId = ServiceFinder.m193752g().generateContextId();
            WatcherHelper.m193664a(this.uniContext, C40658y.f103248q);
            passportLog.mo171465b("n_action_switch_refresh_tenant", "refreshTenantData start");
            ServiceFinder.m193754i().refreshTenantData(generateContextId, switchEntity.getTargetUserId(), new IGetDataCallback<TenantInfo>() {
                /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652214 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("switch_reason", UserSwitchReason.getDescFromValue(switchEntity.getSwitchReason()));
                    WatcherHelper.m193665a(SwitchUserService.this.uniContext, C40658y.f103250s, hashMap);
                    SwitchUserService.this.dealError("n_action_switch_refresh_tenant", "refresh onError", iGetDataCallback, 2);
                }

                /* renamed from: a */
                public void onSuccess(TenantInfo tenantInfo) {
                    if (SwitchUserService.this.isValidUser(tenantInfo, switchEntity)) {
                        WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103249r);
                        PassportLog passportLog = SwitchUserService.log;
                        passportLog.mo171465b("n_action_switch_refresh_tenant", "refresh success, start switch, userId is:" + switchEntity.getTargetUserId());
                        User e = ServiceFinder.m193745a(switchEntity.getTargetUserId()).mo171597e();
                        switchEntity.setTargetUser(e);
                        switchEntity.setTargetUserId(e.userId);
                        SwitchUserService.this.switchUserCore(context, switchEntity, iGetDataCallback);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("switch_reason", UserSwitchReason.getDescFromValue(switchEntity.getSwitchReason()));
                    WatcherHelper.m193665a(SwitchUserService.this.uniContext, C40658y.f103250s, hashMap);
                    SwitchUserService.this.dealError("n_action_switch_refresh_tenant", "refresh success, but server do not has this user", iGetDataCallback, 2);
                }
            });
            return;
        }
        passportLog.mo171465b("n_action_switch_entry", "enter switchUserCore");
        switchUserCore(context, switchEntity, iGetDataCallback);
    }

    public void dealError(String str, String str2, IGetDataCallback<C49382d> iGetDataCallback, int i) {
        dealError(str, str2, -101, iGetDataCallback, i);
    }

    public void makeForegroundUserOfflineAndMakeTargetUserOnline(final Context context, final String str, final int i, final IGetDataCallback<C49382d> iGetDataCallback) {
        WatcherHelper.m193664a(this.uniContext, C40658y.f103239h);
        ServiceFinder.m193756k().asyncMakeUserOffline(new IGetDataCallback<Boolean>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652288 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C49266a.m194146a(context, (int) R.string.Lark_Passport_SwitchTeamFailToast);
                SwitchUserService.this.dealError("n_action_offline_fail", errorResult.getDebugMsg(), errorResult.getErrorCode(), iGetDataCallback, 2);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                SwitchUserService.log.mo171460a("n_action_offline_succ");
                if (bool.booleanValue()) {
                    WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103240i);
                    WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103241j);
                    ServiceFinder.m193755j().asyncMakeUserOnline(context, SwitchUserService.this.foregroundUser, SwitchUserService.this.targetUser, str, i, new IGetDataCallback<C49382d>() {
                        /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652288.C652291 */

                        /* renamed from: a */
                        public void onSuccess(C49382d dVar) {
                            WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103242k);
                            if (dVar != null) {
                                SwitchUserService.log.mo171465b("n_action_online_succ", "MakeUserOnline onSuccess.");
                                SwitchUserService.this.hideTenantSwitchLoadingView();
                                SwitchUserService.this.dealSuccess(i, iGetDataCallback);
                                return;
                            }
                            SwitchUserService.this.dealError("n_action_online_succ", "MakeUserOnline onSuccess, but MakeUserOnlineResponse is null.", iGetDataCallback, 2);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            C49266a.m194146a(context, (int) R.string.Lark_Passport_SwitchTeamFailToast);
                            SwitchUserService.this.dealError("n_action_online_fail", errorResult.getDebugMsg(), errorResult.getErrorCode(), iGetDataCallback, 2);
                        }
                    });
                    return;
                }
                SwitchUserService.this.dealError("n_action_offline_succ", "MakeUserOffline onError, but MakeUserOfflineResponse is null.", iGetDataCallback, 2);
            }
        });
    }

    public void makeTargetUserOnline(final Context context, String str, final int i, final IGetDataCallback<C49382d> iGetDataCallback) {
        WatcherHelper.m193664a(this.uniContext, C40658y.f103241j);
        ServiceFinder.m193755j().asyncMakeUserOnline(context, this.foregroundUser, this.targetUser, str, i, new IGetDataCallback<C49382d>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652309 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C49266a.m194146a(context, (int) R.string.Lark_Passport_SwitchTeamFailToast);
                SwitchUserService.this.dealError("n_action_online_fail", errorResult.getDebugMsg(), errorResult.getErrorCode(), iGetDataCallback, 2);
            }

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
                WatcherHelper.m193664a(SwitchUserService.this.uniContext, C40658y.f103242k);
                if (dVar != null) {
                    SwitchUserService.log.mo171465b("n_action_online_succ", "MakeUserOnlineRequest onSuccess.");
                    SwitchUserService.this.hideTenantSwitchLoadingView();
                    SwitchUserService.this.dealSuccess(i, iGetDataCallback);
                    return;
                }
                SwitchUserService.this.dealError("n_action_online_succ", "MakeUserOnlineRequest onSuccess, but MakeUserOnlineResponse is null.", iGetDataCallback, 2);
            }
        });
    }

    private void showTenantSwitchLoadingView(Context context, int i, String str, boolean z) {
        if (this.delayHandler == null) {
            this.delayHandler = new Handler(Looper.getMainLooper());
        }
        this.delayHandler.postDelayed(new RunnableC65231a(context, i, str, z), 200);
        ServiceFinder.m193752g().onTenantSwitchLoadingShow(true);
    }

    public void dealCrossEnvError(String str, String str2, RecoverEnvEntity recoverEnvEntity, IGetDataCallback<C49382d> iGetDataCallback) {
        PassportLog passportLog = log;
        passportLog.mo171464b("n_action_switch_cross_fail");
        if (recoverEnvEntity != null) {
            passportLog.mo171465b(str, "recoverEnvAndSetDid start");
            ServiceFinder.m193760o().recoverEnvAndDid(recoverEnvEntity.getOldHostEnvBean(), recoverEnvEntity.getOldDeviceId(), recoverEnvEntity.getOldConfigEnv(), this.uniContext);
        } else {
            passportLog.mo171468c(str, "recoverEnvEntity is null");
        }
        dealError(str, str2, -102, iGetDataCallback, 2);
    }

    public void doEnterAppStep(ResponseModel<SwitchUserData> responseModel, Context context, SwitchEntity switchEntity, IGetDataCallback<C49382d> iGetDataCallback) {
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_enter_app", "start switchUser, Interface onSuccess" + responseModel.getData().nextStep);
        if (ServiceFinder.m193760o().isNeedCrossEnv(this.targetUser, ServiceFinder.m193749d().getUserUnit())) {
            passportLog.mo171465b("n_action_switch_cross_start", "isRedirectUser, start crossEnv");
            WatcherHelper.m193664a(this.uniContext, C40658y.f103237f);
            crossEnvRustOfflineOnline(context, switchEntity, iGetDataCallback);
            return;
        }
        normalRustOfflineOnline(context, switchEntity, iGetDataCallback);
    }

    public synchronized void showSwitchTenantDialog(Context context, int i, String str, boolean z) {
        if (this.mSwitchTenantDialog == null) {
            if ((context instanceof Activity) || ((context = ServiceFinder.m193748c().getTopActivity()) != null && (context instanceof Activity))) {
                if (TextUtils.isEmpty(str)) {
                    if (i == 1 || i == 3) {
                        str = context.getString(R.string.Lark_Legacy_BaseUiLoading);
                    } else {
                        str = context.getString(R.string.Lark_Setting_SwitchUserLoadingTip);
                    }
                }
                this.mSwitchTenantDialog = UDDialogUtils.m193812a(context, str, 0.3f, Boolean.valueOf(z));
            } else {
                log.mo171471d("SwitchUserService", "topActivity is null");
                return;
            }
        }
        if (!this.mSwitchTenantDialog.mo171635c()) {
            log.mo171465b("SwitchUserService", "showSwitchTenantDialog");
            this.mSwitchTenantDialog.mo171632a();
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49128n
    public synchronized void switchToNextValidUser(final Context context, final int i, final int i2, final IGetDataCallback<User> iGetDataCallback) {
        this.uniContext = WatcherUniContext.m193675d();
        HashMap hashMap = new HashMap();
        hashMap.put("switch_reason", UserSwitchReason.getDescFromValue(i));
        WatcherHelper.m193665a(this.uniContext, C40658y.f103243l, hashMap);
        final ILogoutUserService l = ServiceFinder.m193757l();
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_switch_to_valid_start", "start, autoSwitch");
        if (ServiceFinder.m193752g().isLeanModeOn()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("reason", "lean mode");
            passportLog.mo171472d("n_action_switch_to_valid_end", "logout all", hashMap2);
            l.logoutAll(context, null);
            return;
        }
        final AnonymousClass10 r5 = new IGetDataCallback<User>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.AnonymousClass10 */

            /* renamed from: a */
            public void onSuccess(User user) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(user);
                }
                SwitchUserService.this.hideTenantSwitchLoadingView();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                PassportLog passportLog = SwitchUserService.log;
                passportLog.mo171471d("n_action_switch_to_valid_end", "switchToNextValidUser onError, msg is:" + errorResult.toString());
                if (errorResult.getErrorCode() != -100) {
                    SwitchUserService.log.mo171471d("n_action_switch_to_valid_end", "logout all");
                    l.logoutAll(context, null);
                }
                SwitchUserService.this.hideTenantSwitchLoadingView();
                if (iGetDataCallback != null) {
                    SwitchUserService.log.mo171471d("n_action_switch_to_valid_end", "onError callback");
                    iGetDataCallback.onError(errorResult);
                }
            }
        };
        showTenantSwitchLoadingView(context, i, null, false);
        checkLocalSessions(i, new IGetDataCallback<List<User>>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                r5.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<User> list) {
                SwitchUserService.this.switchToNextValidUserWithTryNext(context, list, i2, i, r5);
            }
        });
    }

    public void doOtherNextStep(ResponseModel<SwitchUserData> responseModel, Context context, SwitchEntity switchEntity, IGetDataCallback<C49382d> iGetDataCallback) {
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_other_next_step", "start verify");
        SwitchUserData data = responseModel.getData();
        if (data == null || data.stepInfo == null) {
            dealError("n_action_other_next_step", "switchUserData is null", iGetDataCallback, 2);
            return;
        }
        data.stepInfo.put("switch_reason", (Object) Integer.valueOf(switchEntity.getSwitchReason()));
        data.stepInfo.put("target_user_id", (Object) this.targetUser.getUserId());
        if (isNextValidPath(switchEntity)) {
            passportLog.mo171465b("n_action_other_next_step", "To NextValid");
            data.stepInfo.put("current_index", (Object) Integer.valueOf(switchEntity.getNextValidInfo().getCurrentIndex()));
            C49092f.m193530a(context, data, RouterScene.ALL.value, this.uniContext, SwitchNextValidFlagActivity.class);
            dealError("n_action_other_next_step", "do other step:" + data.nextStep, -100, iGetDataCallback, 2);
            return;
        }
        passportLog.mo171465b("n_action_other_next_step", "Router Jump");
        C49092f.m193532a(context, data.nextStep, data.stepInfo, RouterScene.ALL.value, this.uniContext, (PassportLog) null, new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652236 */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public void onRouterResult(int i, Object obj) {
                SwitchUserService.log.mo171465b("n_action_other_next_step", "jump success");
            }
        });
        dealError("n_action_other_next_step", "do other step:" + data.nextStep, -100, iGetDataCallback, 2);
    }

    public void dealError(String str, String str2, int i, IGetDataCallback<C49382d> iGetDataCallback, int i2) {
        String str3;
        this.isIntercept.set(false);
        PassportLog passportLog = log;
        passportLog.mo171471d("n_action_switch_fail", "switch user fail, code is:" + i + ",tag is:" + str + ",msg is:" + str2);
        if (i2 != 1) {
            hideTenantSwitchLoadingView();
            UserSwitchListenerManager.m193645a(new ErrorResult(i, str2));
        }
        if (iGetDataCallback == null) {
            passportLog.mo171471d("n_action_switch_fail", "callback is null");
        } else {
            iGetDataCallback.onError(new ErrorResult(i, str2));
        }
        HashMap hashMap = new HashMap();
        if (i == -102) {
            str3 = "cross_env";
        } else if (i == -101) {
            str3 = "switch_user";
        } else if (i == -100) {
            str3 = "need_verify";
        } else {
            str3 = "others";
        }
        hashMap.put("fail_reason", str3);
        WatcherHelper.m193665a(this.uniContext, C40658y.f103234c, hashMap);
    }

    public void switchToNextValidUserWithTryNext(final Context context, final List<User> list, final int i, final int i2, final IGetDataCallback<User> iGetDataCallback) {
        if (i >= list.size()) {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "none_user");
            log.mo171472d("n_action_switch_to_valid_end", "logout all", hashMap);
            iGetDataCallback.onError(new ErrorResult("no more user can switch to"));
            return;
        }
        final User user = list.get(i);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("user_id", user.getUserId());
        log.mo171467b("n_action_switch_to_valid_try_switch", "begin", hashMap2);
        WatcherHelper.m193664a(this.uniContext, C40658y.f103246o);
        switchUser(context, new SwitchEntity(user.userId, i2, true, null, new NextValidInfo(i, true)), new IGetDataCallback<C49382d>() {
            /* class com.ss.lark.android.passport.biz.service.impl.SwitchUserService.C652192 */

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
                iGetDataCallback.onSuccess(user);
                SwitchUserService.log.mo171467b("n_action_switch_to_valid_success", "success", hashMap2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                hashMap2.put("msg", errorResult.getDebugMsg());
                PassportLog passportLog = SwitchUserService.log;
                passportLog.mo171472d("n_action_switch_to_valid_try_switch_fail", "failed, err: " + errorResult, hashMap2);
                if (errorResult.getErrorCode() != -100) {
                    SwitchUserService.this.switchToNextValidUserWithTryNext(context, list, i + 1, i2, iGetDataCallback);
                } else {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}

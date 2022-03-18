package com.ss.lark.android.passport.biz.feature.router;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.entity.RecoverEnvEntity;
import com.ss.android.lark.passport.infra.entity.SwitchEntity;
import com.ss.android.lark.passport.infra.listenermanage.LoginListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.p2421a.AbstractC49004a;
import com.ss.android.lark.passport.infra.service.AbstractC49124b;
import com.ss.android.lark.passport.infra.service.AbstractC49127k;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.account.ResponseUser;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.lark.android.passport.biz.afterlogin.AbstractC64339a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.EnterAppStep;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SwitchUserData;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.login.LoginInitializer;
import com.ss.lark.android.passport.biz.widget.C65297d;
import com.tt.frontendapiinterface.ApiHandler;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@RouterAnno(name = "enter_app")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J4\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016JL\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J:\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J4\u0010 \u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020#H\u0002JF\u0010$\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J \u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/router/EnterAppAction;", "Lcom/ss/android/lark/passport/infra/base/router/BaseRouterAction;", "()V", "KEY_FEED_SOURCE_FROM_LOGIN", "", "crossEnvLoginInitial", "", "context", "Landroid/app/Activity;", "loginUser", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "users", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/router/IRouterCallback;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "dealCrossEnvError", "errorCode", ApiHandler.API_CALLBACK_ERRMSG, "", "recoverEnvEntity", "Lcom/ss/android/lark/passport/infra/entity/RecoverEnvEntity;", "dealExcludeLoginCase", "targetUserId", "getName", "initializeLogin", "", "isCrossEnv", "", "isExcludeLoginUser", "processLogin", "processSwitch", "Landroid/content/Context;", "step", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/EnterAppStep;", "run", "nextStep", "stepInfo", "Lcom/alibaba/fastjson/JSONObject;", "scene", "backFirst", "updateAllUserList", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/SwitchUserData;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.b.a */
public final class EnterAppAction extends AbstractC49088b {

    /* renamed from: b */
    public static final EnterAppAction f163123b = new EnterAppAction();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "n_action_enter_app";
    }

    private EnterAppAction() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/router/EnterAppAction$crossEnvLoginInitial$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", "newDeviceId", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$a */
    public static final class C64655a implements AbstractC49352d<String> {

        /* renamed from: a */
        final /* synthetic */ User f163124a;

        /* renamed from: b */
        final /* synthetic */ Activity f163125b;

        /* renamed from: c */
        final /* synthetic */ List f163126c;

        /* renamed from: d */
        final /* synthetic */ AbstractC49336a f163127d;

        /* renamed from: e */
        final /* synthetic */ UniContext f163128e;

        /* renamed from: f */
        final /* synthetic */ HostEnvBean f163129f;

        /* renamed from: g */
        final /* synthetic */ String f163130g;

        /* renamed from: h */
        final /* synthetic */ String f163131h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/router/EnterAppAction$crossEnvLoginInitial$1$onSuccess$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/SwitchUserData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$a$a */
        public static final class C64656a implements ICallback<SwitchUserData> {

            /* renamed from: a */
            final /* synthetic */ C64655a f163132a;

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return SwitchUserData.class;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C64656a(C64655a aVar) {
                this.f163132a = aVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                Intrinsics.checkParameterIsNotNull(networkErrorResult, "errorResult");
                EnterAppAction.f163123b.f123291a.mo171464b("n_action_enter_cross_switch_fail");
                EnterAppAction.f163123b.mo223444a(networkErrorResult.getErrorCode(), PassportLog.f123351c.mo171478a("switch/identity error:", networkErrorResult), this.f163132a.f163127d, new RecoverEnvEntity(this.f163132a.f163129f, this.f163132a.f163130g, this.f163132a.f163131h), this.f163132a.f163128e);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: java.lang.Object */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<SwitchUserData> responseModel) {
                Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                EnterAppAction.f163123b.f123291a.mo171460a("n_action_enter_cross_switch_succ");
                if (responseModel.getData() == null) {
                    EnterAppAction.f163123b.mo223444a(-102, "switchUser error, data is null", this.f163132a.f163127d, new RecoverEnvEntity(this.f163132a.f163129f, this.f163132a.f163130g, this.f163132a.f163131h), this.f163132a.f163128e);
                    return;
                }
                SwitchUserData data = responseModel.getData();
                String str = null;
                String str2 = data != null ? data.nextStep : null;
                if (!Intrinsics.areEqual("enter_app", str2)) {
                    C49092f.m193529a(this.f163132a.f163125b, responseModel.getData(), RouterScene.ALL.value, this.f163132a.f163128e, EnterAppAction.f163123b.f123291a, (AbstractC49336a) null);
                    EnterAppAction aVar = EnterAppAction.f163123b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("check it, error step:");
                    SwitchUserData data2 = responseModel.getData();
                    if (data2 != null) {
                        str = data2.nextStep;
                    }
                    sb.append(str);
                    aVar.mo223444a(-102, sb.toString(), this.f163132a.f163127d, new RecoverEnvEntity(this.f163132a.f163129f, this.f163132a.f163130g, this.f163132a.f163131h), this.f163132a.f163128e);
                    return;
                }
                EnterAppAction.f163123b.mo223446a(responseModel.getData(), this.f163132a.f163126c);
                Iterator it = this.f163132a.f163126c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((User) next).userId, this.f163132a.f163124a.userId)) {
                        str = next;
                        break;
                    }
                }
                User user = (User) str;
                if (user == null) {
                    PassportLog passportLog = EnterAppAction.f163123b.f123291a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("login user: ");
                    sb2.append(this.f163132a.f163124a.userId);
                    sb2.append(" not in users: ");
                    List<User> list = this.f163132a.f163126c;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (User user2 : list) {
                        arrayList.add(user2.userId);
                    }
                    sb2.append(arrayList);
                    sb2.append(", it should not happen");
                    passportLog.mo171471d("n_action_enter_cross_switch_succ", sb2.toString());
                    user = this.f163132a.f163124a;
                }
                EnterAppAction.f163123b.f123291a.mo171465b("n_action_enter_cross_switch_succ", "enterApp, userId: " + user.userId);
                EnterAppAction.f163123b.mo223445a(this.f163132a.f163125b, user, this.f163132a.f163126c, this.f163132a.f163127d, this.f163132a.f163128e, true, new RecoverEnvEntity(this.f163132a.f163129f, this.f163132a.f163130g, this.f163132a.f163131h));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "errorResult");
            EnterAppAction.f163123b.f123291a.mo171464b("n_action_update_env_fail");
            EnterAppAction.f163123b.mo223444a(networkErrorResult.getErrorCode(), PassportLog.f123351c.mo171478a("updateEnvAndGetDid error:", networkErrorResult), this.f163127d, new RecoverEnvEntity(this.f163129f, this.f163130g, this.f163131h), this.f163128e);
        }

        /* renamed from: a */
        public void mo145179a(String str) {
            PassportLog passportLog = EnterAppAction.f163123b.f123291a;
            passportLog.mo171465b("n_action_update_env_succ", "updateEnvAndGetDid success, newDeviceId is: " + str);
            if (TextUtils.isEmpty(this.f163124a.getSession()) || this.f163124a.isAnonymous()) {
                EnterAppAction.f163123b.f123291a.mo171460a("n_action_enter_cross_switch_start");
                String str2 = this.f163124a.userId;
                String loginCredentialId = this.f163124a.getLoginCredentialId();
                String session = this.f163124a.getSession();
                UniContext uniContext = this.f163128e;
                PassportLog passportLog2 = EnterAppAction.f163123b.f123291a;
                Intrinsics.checkExpressionValueIsNotNull(passportLog2, "logger");
                FeatureCApi.m253701a(str2, loginCredentialId, session, uniContext, passportLog2, new C64656a(this));
                return;
            }
            EnterAppAction.f163123b.f123291a.mo171465b("n_action_enter_cross_init_login", "Session valid, no need to invoke switch/identity");
            EnterAppAction.f163123b.mo223445a(this.f163125b, this.f163124a, this.f163126c, this.f163127d, this.f163128e, true, new RecoverEnvEntity(this.f163129f, this.f163130g, this.f163131h));
        }

        C64655a(User user, Activity activity, List list, AbstractC49336a aVar, UniContext uniContext, HostEnvBean hostEnvBean, String str, String str2) {
            this.f163124a = user;
            this.f163125b = activity;
            this.f163126c = list;
            this.f163127d = aVar;
            this.f163128e = uniContext;
            this.f163129f = hostEnvBean;
            this.f163130g = str;
            this.f163131h = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/lark/android/passport/biz/feature/router/EnterAppAction$dealExcludeLoginCase$iFeedFirstListener$1", "Lcom/ss/android/lark/passport/infra/callbacks/IPassportFeedFirstLoadListener;", "onFirstLoadedComplete", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$b */
    public static final class C64657b implements AbstractC49004a {

        /* renamed from: a */
        final /* synthetic */ String f163133a;

        @Override // com.ss.android.lark.passport.infra.p2421a.AbstractC49004a
        /* renamed from: a */
        public void mo171104a() {
            C49148ac.m193806a(new RunnableC64658a(this));
            ServiceFinder rVar = ServiceFinder.f123386a;
            ((AbstractC49127k) ServiceFinder.m193746a(AbstractC49127k.class)).removeFeedFirstLoadListener(this);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$b$a */
        static final class RunnableC64658a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C64657b f163134a;

            RunnableC64658a(C64657b bVar) {
                this.f163134a = bVar;
            }

            public final void run() {
                User user;
                C65297d dVar = new C65297d();
                IUserService userService = ServiceFinder.m193744a().getUserService(this.f163134a.f163133a);
                if (userService != null) {
                    user = userService.mo171597e();
                } else {
                    user = null;
                }
                dVar.mo224651c(user, EnterAppAction.f163123b.f123291a);
            }
        }

        C64657b(String str) {
            this.f163133a = str;
        }
    }

    /* renamed from: b */
    private final boolean m254006b(String str) {
        User e;
        IUserService userService = ServiceFinder.m193744a().getUserService(str);
        if (userService == null || (e = userService.mo171597e()) == null) {
            return false;
        }
        return e.isExcludeLogin();
    }

    /* renamed from: a */
    public final void mo223447a(String str) {
        if (m254006b(str)) {
            C64657b bVar = new C64657b(str);
            ServiceFinder rVar = ServiceFinder.f123386a;
            ((AbstractC49127k) ServiceFinder.m193746a(AbstractC49127k.class)).addFeedFirstLoadListener(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/router/EnterAppAction$processSwitch$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "userSwitchSuccessContext", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$d */
    public static final class C64660d implements IGetDataCallback<C49382d> {

        /* renamed from: a */
        final /* synthetic */ String f163139a;

        /* renamed from: b */
        final /* synthetic */ Context f163140b;

        /* renamed from: c */
        final /* synthetic */ AbstractC49336a f163141c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            PassportLog passportLog = EnterAppAction.f163123b.f123291a;
            passportLog.mo171471d("n_action_enter_app", "processSwitch: afterLogin switch failed " + errorResult);
            AbstractC49336a aVar = this.f163141c;
            if (aVar != null) {
                aVar.onRouterResult(-105, null);
            }
        }

        /* renamed from: a */
        public void onSuccess(C49382d dVar) {
            User user;
            Intrinsics.checkParameterIsNotNull(dVar, "userSwitchSuccessContext");
            IUserService a = ServiceFinder.m193745a(this.f163139a);
            if (a != null) {
                user = a.mo171597e();
            } else {
                user = null;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("key_source_from", 1);
            ServiceFinder.m193752g().launchMainWindow(this.f163140b, user, bundle);
            EnterAppAction.f163123b.f123291a.mo171465b("n_action_enter_app", "processSwitch: afterLogin switch success");
            AbstractC49336a aVar = this.f163141c;
            if (aVar != null) {
                aVar.onRouterResult(-106, null);
            }
            EnterAppAction.f163123b.mo223447a(this.f163139a);
        }

        C64660d(String str, Context context, AbstractC49336a aVar) {
            this.f163139a = str;
            this.f163140b = context;
            this.f163141c = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "code", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "onRouterResult"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$e */
    static final class C64661e implements AbstractC49336a {

        /* renamed from: a */
        final /* synthetic */ AbstractC49336a f163142a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f163143b;

        /* renamed from: c */
        final /* synthetic */ Context f163144c;

        C64661e(AbstractC49336a aVar, Ref.ObjectRef objectRef, Context context) {
            this.f163142a = aVar;
            this.f163143b = objectRef;
            this.f163144c = context;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
        public final void onRouterResult(int i, Object obj) {
            AbstractC49336a aVar = this.f163142a;
            if (aVar != null) {
                aVar.onRouterResult(i, obj);
            }
            T t = this.f163143b.element;
            if (t != null) {
                t.mo171634b();
            }
            if (i != -106) {
                return;
            }
            if (MagicWindowUtil.m224687e(this.f163144c) || MagicWindowUtil.m224686d(this.f163144c)) {
                ((Activity) this.f163144c).finish();
            } else {
                ((Activity) this.f163144c).finishAffinity();
            }
        }
    }

    /* renamed from: a */
    public final void mo223446a(SwitchUserData switchUserData, List<User> list) {
        JSONObject jSONObject;
        this.f123291a.mo171460a("n_action_enter_cross_update_info");
        if (switchUserData != null) {
            jSONObject = switchUserData.stepInfo;
        } else {
            jSONObject = null;
        }
        EnterAppStep enterAppStep = (EnterAppStep) C49202p.m193967a(jSONObject, EnterAppStep.class);
        if (enterAppStep != null) {
            List<User> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (T t : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(TuplesKt.to(t.userId, Integer.valueOf(i)));
                i = i2;
            }
            Map map = MapsKt.toMap(arrayList);
            List<ResponseUser> list3 = enterAppStep.userList;
            if (list3 != null) {
                for (T t2 : list3) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    t2.getUser().mergeWithResponseUser(t2);
                    Integer num = (Integer) map.get(t2.getUser().userId);
                    if (num == null) {
                        User user = t2.getUser();
                        Intrinsics.checkExpressionValueIsNotNull(user, "it.user");
                        list.add(user);
                        PassportLog passportLog = f163123b.f123291a;
                        passportLog.mo171468c("n_action_enter_app", "updateAllUserList, new remote user: " + t2.getUser().userId);
                    } else {
                        int intValue = num.intValue();
                        User user2 = t2.getUser();
                        Intrinsics.checkExpressionValueIsNotNull(user2, "it.user");
                        list.set(intValue, user2);
                        PassportLog passportLog2 = f163123b.f123291a;
                        passportLog2.mo171465b("n_action_enter_app", "updateAllUserList, update user: " + t2.getUser().userId);
                    }
                }
                return;
            }
            return;
        }
        this.f123291a.mo171471d("n_action_enter_app", "updateAllUserSession, enter app step is null");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/router/EnterAppAction$initializeLogin$1", "Lcom/ss/lark/android/passport/biz/afterlogin/IAfterLoginCallback;", "onResult", "", "success", "", "code", "", "msg", "", "onStep", "stepType", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b.a$c */
    public static final class C64659c implements AbstractC64339a {

        /* renamed from: a */
        final /* synthetic */ AbstractC49336a f163135a;

        /* renamed from: b */
        final /* synthetic */ boolean f163136b;

        /* renamed from: c */
        final /* synthetic */ RecoverEnvEntity f163137c;

        /* renamed from: d */
        final /* synthetic */ UniContext f163138d;

        @Override // com.ss.lark.android.passport.biz.afterlogin.AbstractC64339a
        /* renamed from: a */
        public void mo222858a(boolean z, int i, String str) {
            HostEnvBean hostEnvBean;
            String str2;
            String str3;
            EnterAppAction.f163123b.f123291a.mo171465b("n_action_enter_app", "initializeLogin is success: " + z + ", code: " + i + ", msg: " + str);
            if (z) {
                AbstractC49336a aVar = this.f163135a;
                if (aVar != null) {
                    aVar.onRouterResult(-106, null);
                    return;
                }
                return;
            }
            ServiceFinder.m193757l().appendAllUserToOfflineLogoutTask();
            ServiceFinder.m193744a().removeAllUsers();
            EnterAppAction.f163123b.f123291a.mo171471d("n_action_enter_app", "initializeLogin failed");
            if (this.f163136b) {
                EnterAppAction.f163123b.f123291a.mo171471d("n_action_cross_recover_env", "isCrossEn, recoverEnvAndSetOldDid");
                AbstractC49124b o = ServiceFinder.m193760o();
                RecoverEnvEntity recoverEnvEntity = this.f163137c;
                if (recoverEnvEntity != null) {
                    hostEnvBean = recoverEnvEntity.getOldHostEnvBean();
                } else {
                    hostEnvBean = null;
                }
                RecoverEnvEntity recoverEnvEntity2 = this.f163137c;
                if (recoverEnvEntity2 != null) {
                    str2 = recoverEnvEntity2.getOldDeviceId();
                } else {
                    str2 = null;
                }
                RecoverEnvEntity recoverEnvEntity3 = this.f163137c;
                if (recoverEnvEntity3 != null) {
                    str3 = recoverEnvEntity3.getOldConfigEnv();
                } else {
                    str3 = null;
                }
                o.recoverEnvAndDid(hostEnvBean, str2, str3, this.f163138d);
            }
            AbstractC49336a aVar2 = this.f163135a;
            if (aVar2 != null) {
                aVar2.onRouterResult(i, null);
            }
        }

        C64659c(AbstractC49336a aVar, boolean z, RecoverEnvEntity recoverEnvEntity, UniContext uniContext) {
            this.f163135a = aVar;
            this.f163136b = z;
            this.f163137c = recoverEnvEntity;
            this.f163138d = uniContext;
        }
    }

    /* renamed from: a */
    private final void m254004a(Context context, String str, AbstractC49336a aVar, UniContext uniContext, EnterAppStep enterAppStep) {
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).mo171143o();
        }
        this.f123291a.mo171465b("n_action_enter_app", "processSwitch: login new users when login");
        ServiceFinder rVar = ServiceFinder.f123386a;
        ((AbstractC49128n) ServiceFinder.m193746a(AbstractC49128n.class)).switchUser(context, new SwitchEntity(str, 3, false, enterAppStep.toast), new C64660d(str, context, aVar));
    }

    /* renamed from: a */
    private final void m254003a(Activity activity, User user, List<User> list, AbstractC49336a aVar, UniContext uniContext) {
        String str;
        ServiceFinder.m193757l().appendAllUserToOfflineLogoutTask();
        ServiceFinder.m193744a().removeAllUsers();
        if (ServiceFinder.m193760o().isNeedCrossEnv(user, ServiceFinder.m193749d().getUserUnit())) {
            PassportLog passportLog = this.f123291a;
            StringBuilder sb = new StringBuilder();
            sb.append("isRedirectUser, userId is:");
            if (user != null) {
                str = user.userId;
            } else {
                str = null;
            }
            sb.append(str);
            passportLog.mo171465b("n_action_enter_cross_start", sb.toString());
            m254005b(activity, user, list, aVar, uniContext);
            return;
        }
        mo223445a(activity, user, (List<? extends User>) list, aVar, uniContext, false, (RecoverEnvEntity) null);
    }

    /* renamed from: b */
    private final void m254005b(Activity activity, User user, List<User> list, AbstractC49336a aVar, UniContext uniContext) {
        C48998a aVar2 = C48998a.f123026a;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "EnvModuleExport.mInstance");
        HostEnvBean cloneMe = aVar2.mo171070e().cloneMe();
        String deviceId = ServiceFinder.m193762q().getDeviceId();
        String configEnv = ServiceFinder.m193749d().getConfigEnv();
        PassportLog passportLog = this.f123291a;
        passportLog.mo171465b("n_action_update_env_start", "enterApp, oldDeviceId is:" + deviceId + ", oldConfigEnv is:" + configEnv);
        ServiceFinder.m193760o().updateEnvAndDid(user.userUnit, user.configEnv, uniContext, new C64655a(user, activity, list, aVar, uniContext, cloneMe, deviceId, configEnv));
    }

    /* renamed from: a */
    public final void mo223444a(int i, String str, AbstractC49336a aVar, RecoverEnvEntity recoverEnvEntity, UniContext uniContext) {
        this.f123291a.mo171471d("n_action_enter_cross_fail", str);
        ServiceFinder.m193760o().recoverEnvAndDid(recoverEnvEntity.getOldHostEnvBean(), recoverEnvEntity.getOldDeviceId(), recoverEnvEntity.getOldConfigEnv(), uniContext);
        if (aVar != null) {
            aVar.onRouterResult(i, null);
        }
    }

    /* renamed from: a */
    public final void mo223445a(Activity activity, User user, List<? extends User> list, AbstractC49336a aVar, UniContext uniContext, boolean z, RecoverEnvEntity recoverEnvEntity) {
        LoginInitializer.f163463a.mo223764a(activity, user, list, new C64659c(aVar, z, recoverEnvEntity, uniContext));
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(str, "nextStep");
        Intrinsics.checkParameterIsNotNull(jSONObject, "stepInfo");
        EnterAppStep enterAppStep = (EnterAppStep) C49202p.m193967a(jSONObject, EnterAppStep.class);
        List<ResponseUser> list = enterAppStep != null ? enterAppStep.userList : null;
        List<ResponseUser> list2 = list;
        boolean z4 = true;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f123291a.mo171471d("n_action_enter_app", "enterApp error: responseUsers is null");
            if (aVar != null) {
                aVar.onRouterResult(-1, null);
                return;
            }
            return;
        }
        List<ResponseUser> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (ResponseUser responseUser : list3) {
            Intrinsics.checkExpressionValueIsNotNull(responseUser, "responseUser");
            User user = responseUser.getUser();
            user.mergeWithResponseUser(responseUser);
            arrayList.add(user);
        }
        List<User> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
        if (allUserList == null || allUserList.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            if (foregroundUser != null) {
                LoginListenerManager.m193627a(false, mutableList, foregroundUser);
            } else {
                ServiceFinder.m193744a().addOrUpdateUsers(mutableList, null, IUserListService.UserLoginSource.ByLogin);
            }
            String str2 = mutableList.get(0).userId;
            if (context != null) {
                EnterAppAction aVar2 = f163123b;
                Intrinsics.checkExpressionValueIsNotNull(str2, "targetUserId");
                aVar2.m254004a(context, str2, aVar, uniContext, enterAppStep);
                return;
            }
            f163123b.f123291a.mo171471d("n_action_enter_app", "enterApp error: context is null");
        } else if (!(context instanceof Activity)) {
            this.f123291a.mo171471d("n_action_enter_app", "context is not activity");
            if (aVar != null) {
                aVar.onRouterResult(-1, null);
            }
        } else {
            String str3 = enterAppStep.toast;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            String str4 = str3;
            if (str4 != null && !StringsKt.isBlank(str4)) {
                z4 = false;
            }
            if (!z4) {
                if (context instanceof BaseActivity) {
                    ((BaseActivity) context).mo171143o();
                }
                objectRef.element = (T) UDDialogUtils.m193813a(context, (String) null, (float) BitmapDescriptorFactory.HUE_RED, (Boolean) null, 14, (Object) null);
            }
            ResponseUser responseUser2 = list.get(0);
            Intrinsics.checkExpressionValueIsNotNull(responseUser2, "responseUsers[0]");
            User user2 = responseUser2.getUser();
            Intrinsics.checkExpressionValueIsNotNull(user2, "responseUsers[0].user");
            m254003a((Activity) context, user2, mutableList, new C64661e(aVar, objectRef, context), uniContext);
        }
    }
}

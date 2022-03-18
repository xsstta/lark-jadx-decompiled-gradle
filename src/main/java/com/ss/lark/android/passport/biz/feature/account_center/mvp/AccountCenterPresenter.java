package com.ss.lark.android.passport.biz.feature.account_center.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.C49018a;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.utils.C57878s;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract;
import com.ss.lark.android.passport.biz.utils.UserCpParseUtil;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0018B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterPresenter;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BasePresenter;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IModel;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;", "mContext", "Landroid/app/Activity;", "model", "view", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "(Landroid/app/Activity;Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IModel;Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lcom/ss/android/lark/passport/infra/log/PassportLog;)V", "TAG", "", "getMContext", "()Landroid/app/Activity;", "create", "", "createViewDelegate", "destroy", "init", "jumpOfficial", "Delegate", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.b */
public class AccountCenterPresenter extends AbstractC49021b<IAccountCenterContract.IModel, IAccountCenterContract.IView, IAccountCenterContract.IView.Delegate> {

    /* renamed from: d */
    private final String f163014d = "AccountCenterPresenter";

    /* renamed from: e */
    private final Activity f163015e;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    public void cn_() {
        super.cn_();
    }

    /* renamed from: i */
    public final Activity mo223322i() {
        return this.f163015e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterPresenter$Delegate;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;", "(Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterPresenter;)V", "clickTitleBarBack", "", "createTeam", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "joinOtherTeam", "jumpLogin", "jumpOfficialList", "personalUser", "switchUser", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "verifyEmail", "tenantId", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.b$a */
    public final class Delegate implements IAccountCenterContract.IView.Delegate {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterPresenter$Delegate$verifyEmail$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.b$a$b */
        public static final class C64576b implements ICallback<BaseStepData> {

            /* renamed from: a */
            final /* synthetic */ Delegate f163019a;

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C64576b(Delegate aVar) {
                this.f163019a = aVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
                ((IAccountCenterContract.IView) AccountCenterPresenter.this.mo171181d()).mo223348p();
                PassportLog passportLog = AccountCenterPresenter.this.f123081c;
                passportLog.mo171465b("n_action_official_email_init_error", "msg: " + networkErrorResult.getErrorMessage());
                UnknownCodeHandler.f123256a.mo171331c(AccountCenterPresenter.this.mo223322i(), networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                ((IAccountCenterContract.IView) AccountCenterPresenter.this.mo171181d()).mo223348p();
                AccountCenterPresenter.this.f123081c.mo171460a("n_action_official_email_init_succ");
                C49092f.m193529a(AccountCenterPresenter.this.mo223322i(), responseModel.getData(), RouterScene.ALL.value, AccountCenterPresenter.this.f123080b, AccountCenterPresenter.this.f123081c, (AbstractC49336a) null);
                AccountCenterPresenter.this.mo223322i().finish();
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: c */
        public void mo223329c() {
            AccountCenterPresenter.this.mo223322i().finish();
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: a */
        public void mo223323a() {
            AccountCenterPresenter.this.f123081c.mo171465b("n_action_click_official_email_list", "nextStep:official_email_list");
            AccountCenterPresenter.this.mo223321h();
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: b */
        public void mo223327b() {
            SigninParams a = SigninParams.newBuilder().mo172354d(true).mo172356f(true).mo172357g(false).mo172349a(C49018a.f123070f).mo172352b(C49018a.f123071g).mo172358h(true).mo172350a();
            AccountCenterPresenter.this.f123081c.mo171460a("n_action_click_login_others");
            ServiceFinder.m193748c().openLogin(AccountCenterPresenter.this.mo223322i(), a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterPresenter$Delegate$switchUser$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.b$a$a */
        public static final class C64575a implements IGetDataCallback<C49382d> {

            /* renamed from: a */
            final /* synthetic */ Delegate f163017a;

            /* renamed from: b */
            final /* synthetic */ User f163018b;

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
                String str;
                PassportLog passportLog = AccountCenterPresenter.this.f123081c;
                StringBuilder sb = new StringBuilder();
                sb.append("switchUser success userId:");
                User user = this.f163018b;
                if (user != null) {
                    str = user.userId;
                } else {
                    str = null;
                }
                sb.append(str);
                passportLog.mo171465b("n_action_click_switch_user", sb.toString());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                PassportLog passportLog = AccountCenterPresenter.this.f123081c;
                StringBuilder sb = new StringBuilder();
                sb.append("switchUser Error userId:");
                User user = this.f163018b;
                if (user != null) {
                    str = user.userId;
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(",errMsg:");
                sb.append(errorResult.getDisplayMsg());
                passportLog.mo171471d("n_action_click_switch_user", sb.toString());
            }

            C64575a(Delegate aVar, User user) {
                this.f163017a = aVar;
                this.f163018b = user;
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: c */
        public void mo223330c(BaseStepData baseStepData) {
            String str;
            PassportLog passportLog = AccountCenterPresenter.this.f123081c;
            StringBuilder sb = new StringBuilder();
            sb.append("nextStep:");
            if (baseStepData != null) {
                str = baseStepData.nextStep;
            } else {
                str = null;
            }
            sb.append(str);
            passportLog.mo171465b("n_action_click_personal_user", sb.toString());
            C49092f.m193529a(AccountCenterPresenter.this.mo223322i(), baseStepData, RouterScene.ALL.value, AccountCenterPresenter.this.f123080b, AccountCenterPresenter.this.f123081c, (AbstractC49336a) null);
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: a */
        public void mo223325a(BaseStepData baseStepData) {
            String str;
            PassportLog passportLog = AccountCenterPresenter.this.f123081c;
            StringBuilder sb = new StringBuilder();
            sb.append("nextStep:");
            if (baseStepData != null) {
                str = baseStepData.nextStep;
            } else {
                str = null;
            }
            sb.append(str);
            passportLog.mo171465b("n_action_click_join_team", sb.toString());
            C49092f.m193529a(AccountCenterPresenter.this.mo223322i(), baseStepData, RouterScene.ALL.value, AccountCenterPresenter.this.f123080b, AccountCenterPresenter.this.f123081c, (AbstractC49336a) null);
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: b */
        public void mo223328b(BaseStepData baseStepData) {
            String str;
            PassportLog passportLog = AccountCenterPresenter.this.f123081c;
            StringBuilder sb = new StringBuilder();
            sb.append("nextStep:");
            if (baseStepData != null) {
                str = baseStepData.nextStep;
            } else {
                str = null;
            }
            sb.append(str);
            passportLog.mo171465b("n_action_click_create_team", sb.toString());
            C49092f.m193529a(AccountCenterPresenter.this.mo223322i(), baseStepData, RouterScene.ALL.value, AccountCenterPresenter.this.f123080b, AccountCenterPresenter.this.f123081c, (AbstractC49336a) null);
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: a */
        public void mo223326a(String str) {
            ((IAccountCenterContract.IView) AccountCenterPresenter.this.mo171181d()).mo223347o();
            PassportLog passportLog = AccountCenterPresenter.this.f123081c;
            passportLog.mo171465b("n_action_click_official_email_bind_team", "tenantId: " + str);
            AccountCenterPresenter.this.f123081c.mo171460a("n_action_official_email_init_req");
            ((IAccountCenterContract.IModel) AccountCenterPresenter.this.mo171182e()).mo223318a(str, new C64576b(this));
        }

        @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IView.Delegate
        /* renamed from: a */
        public void mo223324a(Context context, User user) {
            String str;
            Intrinsics.checkParameterIsNotNull(context, "context");
            PassportLog passportLog = AccountCenterPresenter.this.f123081c;
            StringBuilder sb = new StringBuilder();
            sb.append("to userid:");
            if (user != null) {
                str = user.userId;
            } else {
                str = null;
            }
            sb.append(str);
            passportLog.mo171465b("n_action_click_switch_user", sb.toString());
            ((IAccountCenterContract.IModel) AccountCenterPresenter.this.mo171182e()).mo223317a(context, user, new C64575a(this, user));
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m253758j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public IAccountCenterContract.IView.Delegate mo171180c() {
        return new Delegate();
    }

    /* renamed from: j */
    private final void m253758j() {
        UserOperationCenterInfo userOperationCenterInfo;
        IAccountCenterContract.IModel aVar = (IAccountCenterContract.IModel) mo171182e();
        if (!(aVar == null || mo171181d() == null)) {
            ((IAccountCenterContract.IView) mo171181d()).mo223334a(aVar.mo223319g());
        }
        this.f123080b = UniContext.newInstance("account_center", true);
        UniContext uniContext = this.f123080b;
        if (aVar != null) {
            userOperationCenterInfo = aVar.mo223319g();
        } else {
            userOperationCenterInfo = null;
        }
        PassportLog passportLog = this.f123081c;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        UserCpParseUtil.m256143a(uniContext, userOperationCenterInfo, passportLog);
    }

    /* renamed from: h */
    public final void mo223321h() {
        Intent intent = this.f163015e.getIntent();
        BaseStepData baseStepData = new BaseStepData();
        Serializable serializableExtra = intent.getSerializableExtra("step_info");
        if (serializableExtra != null) {
            baseStepData.nextStep = "official_email_list";
            baseStepData.stepInfo = C57878s.m224589a(JSONObject.toJSONString((Map) serializableExtra));
            C49092f.m193529a(this.f163015e, baseStepData, RouterScene.ALL.value, this.f123080b, this.f123081c, (AbstractC49336a) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountCenterPresenter(Activity activity, IAccountCenterContract.IModel aVar, IAccountCenterContract.IView bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(passportLog, "logger");
        this.f163015e = activity;
    }
}

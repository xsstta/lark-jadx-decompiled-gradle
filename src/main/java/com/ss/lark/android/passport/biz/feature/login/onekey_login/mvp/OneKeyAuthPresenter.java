package com.ss.lark.android.passport.biz.feature.login.onekey_login.mvp;

import android.app.Activity;
import android.app.Application;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.MsgBuilder;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.entity.LoginUserInputV2;
import com.ss.lark.android.passport.biz.feature.login.OneKeyLoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0014J\b\u0010$\u001a\u00020\"H\u0002J\u0006\u0010%\u001a\u00020\"J\b\u0010&\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BasePresenter;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IModel;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView$Delegate;", "context", "Landroid/app/Activity;", "model", "view", "authType", "", "fromGuide", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "(Landroid/app/Activity;Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IModel;Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView;IZLcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lcom/ss/android/lark/passport/infra/log/PassportLog;)V", "getAuthType", "()I", "getContext", "()Landroid/app/Activity;", "getFromGuide", "()Z", "mSecurityScanResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SecurityScanResult;", "getModel", "()Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IModel;", "netType", "", "securityPhone", "getView", "()Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView;", "create", "", "createViewDelegate", "getSecurityPhone", "goOtherAuth", "init", "onAuthResult", "params", "Lorg/json/JSONObject;", "realDoDoAuth", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "Delegate", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b */
public final class OneKeyAuthPresenter extends AbstractC49021b<IOneKeyAuthContract.IModel, IOneKeyAuthContract.IView, IOneKeyAuthContract.IView.Delegate> {

    /* renamed from: d */
    public String f163483d = "";

    /* renamed from: e */
    public String f163484e = "";

    /* renamed from: f */
    public SecurityScanResult f163485f;

    /* renamed from: g */
    private final Activity f163486g;

    /* renamed from: h */
    private final IOneKeyAuthContract.IModel f163487h;

    /* renamed from: i */
    private final IOneKeyAuthContract.IView f163488i;

    /* renamed from: j */
    private final int f163489j;

    /* renamed from: k */
    private final boolean f163490k;

    /* renamed from: i */
    public final Activity mo223798i() {
        return this.f163486g;
    }

    /* renamed from: j */
    public final IOneKeyAuthContract.IModel mo223799j() {
        return this.f163487h;
    }

    /* renamed from: k */
    public final IOneKeyAuthContract.IView mo223800k() {
        return this.f163488i;
    }

    /* renamed from: l */
    public final int mo223801l() {
        return this.f163489j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public IOneKeyAuthContract.IView.Delegate mo171180c() {
        return new Delegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter$Delegate;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView$Delegate;", "(Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter;)V", "DoAuth", "", "checkSecurityScan", "authType", "", "onBackPress", "onLanguageSwitched", "otherAuthType", "preparedAuth", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b$a */
    public final class Delegate implements IOneKeyAuthContract.IView.Delegate {
        @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView.Delegate
        /* renamed from: b */
        public void mo223791b() {
            OneKeyAuthPresenter.this.mo223800k().mo223789i();
        }

        @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView.Delegate
        /* renamed from: c */
        public void mo223792c() {
            OneKeyAuthPresenter.this.mo223796g();
            OneKeyLoginStatisticsHelper.m254677b();
        }

        @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView.Delegate
        /* renamed from: d */
        public void mo223793d() {
            C49032c.m193132a().mo171198c();
            OneKeyAuthUtil.f163513a.mo223819a(OneKeyAuthPresenter.this.mo223798i(), OneKeyAuthPresenter.this.mo223801l(), false, OneKeyAuthPresenter.this.f123080b);
        }

        @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.IOneKeyAuthContract.IView.Delegate
        /* renamed from: a */
        public void mo223790a() {
            if (!OneKeyAuthPresenter.this.mo223800k().mo223786f()) {
                OneKeyAuthPresenter.this.mo223800k().mo223782a(OneKeyAuthPresenter.this.f163483d);
                PassportLog passportLog = OneKeyAuthPresenter.this.f123081c;
                passportLog.mo171471d("n_action_onekey_auth_next", "DoAuth return: " + OneKeyAuthPresenter.this.mo223801l() + " checked: " + OneKeyAuthPresenter.this.mo223800k().mo223786f());
                return;
            }
            UniContext uniContext = OneKeyAuthPresenter.this.f123080b;
            C40654u uVar = C40654u.f103190m;
            Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…KEY_LOGIN_PAGE_GOTO_LOGIN");
            WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
            OneKeyAuthPresenter.this.mo223800k().mo223784d();
            m254726b(OneKeyAuthPresenter.this.mo223801l());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        /* renamed from: a */
        public final void mo223802a(int i) {
            OneKeyAuthPresenter.this.mo223799j().mo223778a(new C64853b(this, i));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter$Delegate$checkSecurityScan$1", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthUtil$SecurityScanCallback;", "onScanFinish", "", "scanResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SecurityScanResult;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b$a$a */
        public static final class C64852a implements OneKeyAuthUtil.SecurityScanCallback {

            /* renamed from: a */
            final /* synthetic */ Delegate f163492a;

            /* renamed from: b */
            final /* synthetic */ int f163493b;

            @Override // com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil.SecurityScanCallback
            /* renamed from: a */
            public void mo223803a(SecurityScanResult securityScanResult) {
                Object obj;
                OneKeyAuthPresenter.this.f163485f = securityScanResult;
                PassportLog passportLog = OneKeyAuthPresenter.this.f123081c;
                passportLog.mo171465b("n_action_onekey_auth_next", "checkSecurityScan mSecurityScanResult=" + C57878s.m224591a(OneKeyAuthPresenter.this.f163485f));
                SecurityScanResult securityScanResult2 = OneKeyAuthPresenter.this.f163485f;
                if (securityScanResult2 == null || (obj = securityScanResult2.risk) == null) {
                    obj = "";
                }
                String a = C57878s.m224591a(obj);
                UniContext uniContext = OneKeyAuthPresenter.this.f123080b;
                C40654u uVar = C40654u.f103176A;
                Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…EKEY_MOBILE_SECURITY_SCAN");
                WatcherHelper.m193665a(uniContext, uVar, MapsKt.mutableMapOf(TuplesKt.to("risk", a)));
                this.f163492a.mo223802a(this.f163493b);
            }

            C64852a(Delegate aVar, int i) {
                this.f163492a = aVar;
                this.f163493b = i;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter$Delegate$preparedAuth$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b$a$b */
        public static final class C64853b implements AbstractC49352d<OperatorAuthTokenInfo> {

            /* renamed from: a */
            final /* synthetic */ Delegate f163494a;

            /* renamed from: b */
            final /* synthetic */ int f163495b;

            /* renamed from: a */
            public void mo145179a(OperatorAuthTokenInfo operatorAuthTokenInfo) {
                if (operatorAuthTokenInfo != null) {
                    UniContext uniContext = OneKeyAuthPresenter.this.f123080b;
                    C40654u uVar = C40654u.f103193p;
                    Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…MOBILE_AUTH_REQUEST_START");
                    WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
                    OneKeyAuthPresenter.this.f123081c.mo171465b("n_action_onekey_auth_next", "preparedAuth, getAuthToken succ");
                    OneKeyAuthPresenter.this.mo223794a(operatorAuthTokenInfo);
                    return;
                }
                IOneKeyAuthContract.IView.C64850a.m254703a(OneKeyAuthPresenter.this.mo223800k(), this.f163495b, -1, null, 4, null);
                OneKeyAuthPresenter.this.mo223800k().mo223785e();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                int i;
                String str;
                OneKeyLoginStatisticsHelper.m254676a(false);
                IOneKeyAuthContract.IView.C64850a.m254703a(OneKeyAuthPresenter.this.mo223800k(), this.f163495b, -1, null, 4, null);
                OneKeyAuthPresenter.this.mo223800k().mo223785e();
                JSONObject jSONObject = new JSONObject();
                if (networkErrorResult != null) {
                    i = networkErrorResult.getErrorCode();
                } else {
                    i = 0;
                }
                if (networkErrorResult == null || (str = networkErrorResult.getErrorMessage()) == null) {
                    str = "";
                }
                jSONObject.put("result_value", 0);
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str);
                OneKeyAuthPresenter.this.mo223795a(jSONObject);
                OneKeyAuthPresenter.this.f123081c.mo171471d("n_action_onekey_auth_next", new MsgBuilder().mo171484a("preparedAuth getAuthToken onError").mo171483a(i).mo171486b(str).mo171485a());
            }

            C64853b(Delegate aVar, int i) {
                this.f163494a = aVar;
                this.f163495b = i;
            }
        }

        /* renamed from: b */
        private final void m254726b(int i) {
            boolean e = OneKeyAuthUtil.f163513a.mo223828e();
            PassportLog passportLog = OneKeyAuthPresenter.this.f123081c;
            passportLog.mo171465b("n_action_onekey_auth_next", "checkSecurityScan enableOneKeyScan=" + e);
            if (e) {
                UniContext uniContext = OneKeyAuthPresenter.this.f123080b;
                C40654u uVar = C40654u.f103176A;
                Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…EKEY_MOBILE_SECURITY_SCAN");
                WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
                OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
                Application application = LarkContext.getApplication();
                Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
                OneKeyAuthUtil.m254761a(bVar, application, new C64852a(this, i), 0, 4, null);
                return;
            }
            OneKeyAuthPresenter.this.f163485f = null;
            mo223802a(i);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m254715n();
        m254714m();
    }

    /* renamed from: g */
    public final void mo223796g() {
        this.f123081c.mo171465b("n_action_onekey_auth_other", "goOtherAuth");
        this.f163488i.mo223789i();
    }

    /* renamed from: m */
    private final void m254714m() {
        this.f163488i.mo223787g();
        this.f163488i.mo223788h();
        this.f163488i.mo223780a(this.f163489j);
    }

    /* renamed from: n */
    private final void m254715n() {
        this.f163488i.mo223784d();
        this.f163487h.mo223777a(this.f163489j, new C64854b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter$getSecurityPhone$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b$b */
    public static final class C64854b implements AbstractC49352d<OperatorAuthTokenInfo> {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthPresenter f163496a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64854b(OneKeyAuthPresenter bVar) {
            this.f163496a = bVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            this.f163496a.mo223800k().mo223785e();
            this.f163496a.f123081c.mo171471d("n_action_get_security_phone", "getSecurityPhone onError");
            this.f163496a.mo223796g();
        }

        /* renamed from: a */
        public void mo145179a(OperatorAuthTokenInfo operatorAuthTokenInfo) {
            if (operatorAuthTokenInfo != null) {
                this.f163496a.f163483d = operatorAuthTokenInfo.getNetType();
                this.f163496a.f163484e = operatorAuthTokenInfo.getSecurityPhone();
                this.f163496a.mo223800k().mo223783a(operatorAuthTokenInfo.getSecurityPhone(), operatorAuthTokenInfo.getNetType());
                this.f163496a.f123081c.mo171465b("n_action_get_security_phone", "getSecurityPhone success");
            } else {
                this.f163496a.mo223796g();
            }
            this.f163496a.mo223800k().mo223785e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter$realDoDoAuth$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b$c */
    public static final class C64855c implements AbstractC49352d<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ OneKeyAuthPresenter f163497a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64855c(OneKeyAuthPresenter bVar) {
            this.f163497a = bVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            int i;
            String str;
            int i2;
            String errorMessage;
            OneKeyLoginStatisticsHelper.m254676a(false);
            IOneKeyAuthContract.IView k = this.f163497a.mo223800k();
            int l = this.f163497a.mo223801l();
            if (networkErrorResult != null) {
                i = networkErrorResult.getErrorCode();
            } else {
                i = -1;
            }
            String str2 = "";
            if (networkErrorResult == null || (str = networkErrorResult.getErrorMessage()) == null) {
                str = str2;
            }
            k.mo223781a(l, i, str);
            this.f163497a.mo223800k().mo223785e();
            JSONObject jSONObject = new JSONObject();
            if (networkErrorResult != null) {
                i2 = networkErrorResult.getErrorCode();
            } else {
                i2 = 0;
            }
            if (!(networkErrorResult == null || (errorMessage = networkErrorResult.getErrorMessage()) == null)) {
                str2 = errorMessage;
            }
            jSONObject.put("result_value", 0);
            jSONObject.put("error_code", i2);
            jSONObject.put("error_msg", str2);
            this.f163497a.mo223795a(jSONObject);
            this.f163497a.f123081c.mo171471d("n_action_onekey_auth_next", new MsgBuilder().mo171484a("DoAuth onError").mo171483a(i2).mo171486b(str2).mo171485a());
        }

        /* renamed from: a */
        public void mo145179a(BaseStepData baseStepData) {
            OneKeyLoginStatisticsHelper.m254676a(true);
            ((IOneKeyAuthContract.IView) this.f163497a.mo171181d()).mo223785e();
            if (baseStepData == null) {
                IOneKeyAuthContract.IView.C64850a.m254703a(this.f163497a.mo223800k(), this.f163497a.mo223801l(), -1, null, 4, null);
                this.f163497a.f123081c.mo171471d("n_action_onekey_auth_next", "DoAuth success but data is null");
                return;
            }
            UniContext uniContext = this.f163497a.f123080b;
            C40654u uVar = C40654u.f103194q;
            Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…_MOBILE_AUTH_REQUEST_SUCC");
            WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result_value", 1);
            this.f163497a.mo223795a(jSONObject);
            LoginUserInputV2 loginUserInputV2 = new LoginUserInputV2();
            loginUserInputV2.setMode(1);
            C64291a.m252805a(loginUserInputV2);
            PassportLog passportLog = this.f163497a.f123081c;
            passportLog.mo171465b("n_action_onekey_auth_next", "DoAuth success and next step is " + baseStepData.nextStep);
            C49092f.m193527a(this.f163497a.mo223798i(), baseStepData, RouterScene.BEFORE_LOGIN.value, this.f163497a.f123081c, new C64856a(this, baseStepData));
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "code", "", "routerData", "", "kotlin.jvm.PlatformType", "onRouterResult"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a.b$c$a */
        public static final class C64856a implements AbstractC49336a {

            /* renamed from: a */
            final /* synthetic */ C64855c f163498a;

            /* renamed from: b */
            final /* synthetic */ BaseStepData f163499b;

            C64856a(C64855c cVar, BaseStepData baseStepData) {
                this.f163498a = cVar;
                this.f163499b = baseStepData;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public final void onRouterResult(int i, Object obj) {
                if (i == -100) {
                    Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("next_step", this.f163499b.nextStep));
                    UniContext uniContext = this.f163498a.f163497a.f123080b;
                    C40654u uVar = C40654u.f103195r;
                    Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…ode.ONEKEY_LOGIN_END_SUCC");
                    WatcherHelper.m193665a(uniContext, uVar, mutableMapOf);
                    ((IOneKeyAuthContract.IView) this.f163498a.f163497a.mo171181d()).mo223789i();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo223794a(OperatorAuthTokenInfo operatorAuthTokenInfo) {
        this.f123081c.mo171465b("n_action_onekey_auth_next", "realDoDoAuth start ");
        this.f163487h.mo223779a(operatorAuthTokenInfo.getAuthToken(), operatorAuthTokenInfo.getNetType(), this.f163489j, this.f163485f, new C64855c(this));
    }

    /* renamed from: a */
    public final void mo223795a(JSONObject jSONObject) {
        String str;
        if (this.f163489j == 1) {
            str = "register";
        } else {
            str = "login";
        }
        jSONObject.put("login_type", str);
        jSONObject.put("carrier", this.f163483d);
        Statistics.sendEvent("one_click_login_result", jSONObject);
        try {
            PassportLog passportLog = this.f123081c;
            passportLog.mo171465b("n_action_onekey_auth_next", "onAuthResult: " + jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneKeyAuthPresenter(Activity activity, IOneKeyAuthContract.IModel aVar, IOneKeyAuthContract.IView bVar, int i, boolean z, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(passportLog, "log");
        this.f163486g = activity;
        this.f163487h = aVar;
        this.f163488i = bVar;
        this.f163489j = i;
        this.f163490k = z;
    }
}

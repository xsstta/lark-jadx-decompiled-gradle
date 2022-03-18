package com.ss.lark.android.passport.biz.feature.login.onekey_login;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract;", "", "()V", "IModel", "IView", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a */
public final class IOneKeyAuthContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH&J\u001e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH&¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IModel;", "DoAuth", "", "token", "", "from", "authType", "", "securityScanResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SecurityScanResult;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getAuthToken", "Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "getSecurityPhone", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a$a */
    public interface IModel extends AbstractC49025e {
        /* renamed from: a */
        void mo223777a(int i, AbstractC49352d<OperatorAuthTokenInfo> dVar);

        /* renamed from: a */
        void mo223778a(AbstractC49352d<OperatorAuthTokenInfo> dVar);

        /* renamed from: a */
        void mo223779a(String str, String str2, int i, SecurityScanResult securityScanResult, AbstractC49352d<BaseStepData> dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\rH&J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH&¨\u0006\u0018"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView$Delegate;", "finish", "", "hideLoadingView", "isCheckBoxChecked", "", "oneAuthError", "authType", "", "errCode", ApiHandler.API_CALLBACK_ERRMSG, "", "setButtonAndPolicyText", "showBackTitle", "showLanguageSwitch", "showLoadingView", "showPolicyDaliog", "operatorName", "showSecurityPhoneAndOperatorName", "securityPhone", "netType", "Delegate", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a$b */
    public interface IView extends AbstractC49027g<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/IOneKeyAuthContract$IView$Delegate;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView$IViewDelegate;", "DoAuth", "", "onBackPress", "onLanguageSwitched", "otherAuthType", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a$b$b */
        public interface Delegate extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223790a();

            /* renamed from: b */
            void mo223791b();

            /* renamed from: c */
            void mo223792c();

            /* renamed from: d */
            void mo223793d();
        }

        /* renamed from: a */
        void mo223780a(int i);

        /* renamed from: a */
        void mo223781a(int i, int i2, String str);

        /* renamed from: a */
        void mo223782a(String str);

        /* renamed from: a */
        void mo223783a(String str, String str2);

        /* renamed from: d */
        void mo223784d();

        /* renamed from: e */
        void mo223785e();

        /* renamed from: f */
        boolean mo223786f();

        /* renamed from: g */
        void mo223787g();

        /* renamed from: h */
        void mo223788h();

        /* renamed from: i */
        void mo223789i();

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.a$b$a */
        public static final class C64850a {
            /* renamed from: a */
            public static /* synthetic */ void m254703a(IView bVar, int i, int i2, String str, int i3, Object obj) {
                if (obj == null) {
                    if ((i3 & 4) != 0) {
                        str = null;
                    }
                    bVar.mo223781a(i, i2, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oneAuthError");
            }
        }
    }
}

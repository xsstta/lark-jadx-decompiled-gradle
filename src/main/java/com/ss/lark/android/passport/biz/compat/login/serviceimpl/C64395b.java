package com.ss.lark.android.passport.biz.compat.login.serviceimpl;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.p3211a.C64360a;
import com.ss.lark.android.passport.biz.feature.sso.loading.AuthLoadingActivity;
import com.ss.lark.android.passport.biz.feature.sso.loading.TransparentLoadingActivity;

/* renamed from: com.ss.lark.android.passport.biz.compat.login.serviceimpl.b */
public class C64395b implements ILoginService {

    /* renamed from: a */
    public final PassportLog f162680a;

    /* renamed from: b */
    private AbstractC64400b f162681b;

    /* renamed from: c */
    private boolean f162682c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.compat.login.serviceimpl.b$a */
    public static class C64399a {

        /* renamed from: a */
        public static final C64395b f162689a = new C64395b();
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.login.serviceimpl.b$b */
    public interface AbstractC64400b {
        void onLoginInfoChange(LoginInfo loginInfo, LoginInfo loginInfo2);
    }

    /* renamed from: a */
    public static C64395b m253103a() {
        return C64399a.f162689a;
    }

    private C64395b() {
        this.f162680a = PassportLog.f123351c.mo171474a();
        this.f162682c = false;
    }

    /* renamed from: a */
    public void mo222948a(AbstractC64400b bVar) {
        this.f162681b = bVar;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService
    /* renamed from: a */
    public void mo172409a(Context context, SigninParams signinParams) {
        m253104a(context, signinParams, WatcherUniContext.m193672a());
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService
    /* renamed from: a */
    public void mo172410a(Context context, String str) {
        this.f162680a.mo171465b("n_action_goto_auth_page", "uri.path include verify");
        int existActivityNumber = ServiceFinder.m193752g().getExistActivityNumber();
        PassportLog a = PassportLog.f123351c.mo171474a();
        if (existActivityNumber > 1) {
            TransparentLoadingActivity.m255388a(context, str, a);
        } else {
            AuthLoadingActivity.m255343a(context, str, a);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService
    /* renamed from: a */
    public void mo172411a(Context context, boolean z) {
        UniContext b = WatcherUniContext.m193673b();
        C64360a.m253031a(context, b);
        this.f162680a.mo171465b("LoginServiceImpl", "start register");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from_guide", (Object) Boolean.valueOf(z));
        C49092f.m193532a(context, "create_team_prepare", jSONObject, RouterScene.ALL.value, b, (PassportLog) null, (AbstractC49336a) null);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService
    /* renamed from: a */
    public void mo172413a(TenantInfo tenantInfo, final IGetDataCallback<SessionResult> iGetDataCallback) {
        if (tenantInfo == null) {
            iGetDataCallback.onError(new ErrorResult(-101, "callback error"));
            this.f162680a.mo171471d("LoginServiceImpl", "tenantInfo is null");
            return;
        }
        ServiceFinder.m193753h().switchUser(C64340b.m252955a().mo222861c(), tenantInfo.getUserId(), new IGetDataCallback<C49382d>() {
            /* class com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b.C643983 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                } else {
                    C64395b.this.f162680a.mo171471d("LoginServiceImpl", "switchUser onError, but callback is null");
                }
            }

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback == null || dVar == null) {
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult(-1, "switchUser onSuccess, but callback is null"));
                    }
                    C64395b.this.f162680a.mo171471d("LoginServiceImpl", "switchUser onSuccess, but callback is null");
                    return;
                }
                C64395b.this.f162680a.mo171465b("LoginServiceImpl", "switchLoginTenantUser SwitchUser onSuccess");
                iGetDataCallback.onSuccess(new SessionResult());
            }
        });
    }

    /* renamed from: a */
    public void mo222947a(LoginInfo loginInfo, LoginInfo loginInfo2) {
        String str;
        PassportLog passportLog = this.f162680a;
        StringBuilder sb = new StringBuilder();
        sb.append("triggerLoginInfoChanged: oldLoginInfo");
        String str2 = null;
        if (loginInfo == null) {
            str = null;
        } else {
            str = loginInfo.toString();
        }
        sb.append(str);
        sb.append(",newLoginInfo is:");
        if (loginInfo2 != null) {
            str2 = loginInfo2.toString();
        }
        sb.append(str2);
        passportLog.mo171465b("LoginServiceImpl", sb.toString());
        if (this.f162681b == null) {
            this.f162680a.mo171471d("LoginServiceImpl", "listener is null");
        } else if (loginInfo2 == null) {
            this.f162680a.mo171471d("LoginServiceImpl", "newLoginInfo is null");
        } else if (!loginInfo2.equals(loginInfo)) {
            this.f162680a.mo171465b("LoginServiceImpl", "trigger account info changed");
            this.f162681b.onLoginInfoChange(loginInfo, loginInfo2);
        } else {
            this.f162680a.mo171471d("LoginServiceImpl", "newOlgLogInfo equals oldLoginInfo");
        }
    }

    /* renamed from: a */
    private void m253104a(Context context, SigninParams signinParams, UniContext uniContext) {
        C64360a.m253031a(context, uniContext);
        this.f162680a.mo171465b("LoginServiceImpl", "start login");
        C64340b.m252955a().mo222859a(context, signinParams, uniContext);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService
    /* renamed from: a */
    public void mo172412a(Context context, boolean z, String str, final AbstractC49338a aVar) {
        ServiceFinder.m193757l().logoutAll(context, new IGetDataCallback<C49376b>() {
            /* class com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b.C643961 */

            /* renamed from: a */
            public void onSuccess(C49376b bVar) {
                AbstractC49338a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(true);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC49338a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(false);
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService
    /* renamed from: b */
    public void mo172414b(Context context, boolean z, String str, final AbstractC49338a aVar) {
        ServiceFinder.m193757l().logoutAllWithoutLogin(context, new IGetDataCallback<C49376b>() {
            /* class com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b.C643972 */

            /* renamed from: a */
            public void onSuccess(C49376b bVar) {
                AbstractC49338a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(true);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC49338a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(false);
                }
            }
        });
    }
}

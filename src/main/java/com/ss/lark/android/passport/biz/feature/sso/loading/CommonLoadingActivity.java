package com.ss.lark.android.passport.biz.feature.sso.loading;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49229z;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.C49366a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthActivity;

public class CommonLoadingActivity extends BaseActivity {

    /* renamed from: h */
    public Uri f163811h;

    /* renamed from: i */
    public String f163812i;

    /* renamed from: j */
    private DialogC49246b f163813j;

    /* renamed from: k */
    private String f163814k;

    /* renamed from: a */
    public Context mo224115a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255365a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255363a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255368c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255364a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255367b(this);
    }

    /* renamed from: w */
    public void mo224122w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo224123x() {
        return super.getAssets();
    }

    /* renamed from: b */
    public void mo170969b() {
        DialogC49246b bVar = this.f163813j;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
        this.f123052c.mo171460a("n_page_ssosdk_loading_end");
    }

    /* renamed from: A */
    private String m255357A() {
        if (getIntent() == null) {
            return "";
        }
        return getIntent().getStringExtra("class_name");
    }

    /* renamed from: B */
    private String m255358B() {
        if (getIntent() == null) {
            return "";
        }
        return getIntent().getStringExtra("signature");
    }

    /* renamed from: C */
    private String m255359C() {
        if (getIntent() == null) {
            return "";
        }
        return getIntent().getStringExtra("package_id");
    }

    /* renamed from: D */
    private boolean m255360D() {
        Uri uri = this.f163811h;
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter("code_challenge"))) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private void m255361E() {
        if (this.f163813j == null) {
            this.f163813j = new DialogC49246b(this, true);
        }
        this.f163813j.setCancelable(false);
        this.f163813j.show();
    }

    /* renamed from: F */
    private boolean m255362F() {
        if (TextUtils.isEmpty(this.f163812i) || !C49229z.m194070a(this, m255359C(), m255358B()) || TextUtils.isEmpty(getPackageName()) || getPackageName().equals(m255359C())) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m255371y() {
        this.f123052c.mo171465b("n_page_ssosdk_loading_start", "init");
        String stringExtra = getIntent().getStringExtra("activity_flag");
        if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals("SSO_SDK")) {
            this.f123052c.mo171471d("n_page_ssosdk_loading_start", "end for check params fail");
            finish();
            return;
        }
        m255372z();
    }

    /* renamed from: z */
    private void m255372z() {
        if (TextUtils.isEmpty(getIntent().getStringExtra("sso_url"))) {
            this.f123052c.mo171471d("n_page_ssosdk_check_data", "check params fail, sso_url is null");
            finish();
            return;
        }
        C49366a aVar = new C49366a();
        String stringExtra = getIntent().getStringExtra("sso_url");
        this.f163814k = stringExtra;
        this.f163811h = Uri.parse(stringExtra);
        m255366b(aVar);
        if (m255360D()) {
            this.f123052c.mo171465b("n_page_ssosdk_check_data", "isChallengeMode = true");
            m255369c(aVar);
        }
        if (TextUtils.isEmpty(aVar.f123890a) || TextUtils.isEmpty(aVar.f123891b) || TextUtils.isEmpty(aVar.f123892c) || TextUtils.isEmpty(aVar.f123893d) || TextUtils.isEmpty(aVar.f123894e)) {
            PassportLog passportLog = this.f123052c;
            passportLog.mo171471d("n_page_ssosdk_check_data", "scheme is not correct, associate_id=" + aVar.f123893d);
            mo224116a(this.f163811h, "-1");
        }
        m255370d(aVar);
    }

    /* renamed from: a */
    public boolean mo170967a() {
        Uri uri = this.f163811h;
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter("safety_mode"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m255371y();
    }

    /* renamed from: a */
    public static Resources m255364a(CommonLoadingActivity commonLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(commonLoadingActivity);
        }
        return commonLoadingActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m255368c(CommonLoadingActivity commonLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(commonLoadingActivity);
        }
        return commonLoadingActivity.mo224123x();
    }

    /* renamed from: d */
    private void m255370d(final C49366a aVar) {
        m255361E();
        new Handler().postDelayed(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.sso.loading.CommonLoadingActivity.RunnableC650381 */

            public void run() {
                CommonLoadingActivity.this.mo224117a(aVar);
            }
        }, 200);
    }

    /* renamed from: b */
    public static void m255367b(CommonLoadingActivity commonLoadingActivity) {
        commonLoadingActivity.mo224122w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CommonLoadingActivity commonLoadingActivity2 = commonLoadingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    commonLoadingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private void m255369c(C49366a aVar) {
        aVar.mo172387c(this.f163811h.getQueryParameter("code_challenge"));
        aVar.mo172388d(this.f163811h.getQueryParameter("code_challenge_method"));
        aVar.mo172385a(this.f163811h.getQueryParameter("redirect_uri"));
        aVar.mo172386b(this.f163811h.getQueryParameter("scope"));
    }

    /* renamed from: b */
    private void m255366b(C49366a aVar) {
        aVar.f123890a = this.f163811h.getQueryParameter("app_id");
        aVar.f123892c = this.f163811h.getQueryParameter("response_type");
        aVar.f123893d = this.f163811h.getQueryParameter("state");
        if (mo170967a()) {
            aVar.f123891b = m255359C();
            aVar.f123894e = m255358B();
            this.f163812i = m255357A();
        } else {
            aVar.f123891b = this.f163811h.getQueryParameter("package_id");
            aVar.f123894e = this.f163811h.getQueryParameter("signature");
        }
        if (!TextUtils.isEmpty(this.f163811h.getQueryParameter("redirect_uri"))) {
            aVar.mo172385a(this.f163811h.getQueryParameter("redirect_uri"));
        }
        if (!TextUtils.isEmpty(this.f163811h.getQueryParameter("scope"))) {
            aVar.mo172386b(this.f163811h.getQueryParameter("scope"));
        }
    }

    /* renamed from: a */
    public void mo224117a(final C49366a aVar) {
        ISSOSDKAuthService pVar = (ISSOSDKAuthService) ServiceFinder.m193746a(ISSOSDKAuthService.class);
        if (pVar != null) {
            this.f123052c.mo171465b("n_action_ssosdk_auth_request", "start request auth_login/oauth2/sdk");
            pVar.userOAuth(this.f123055f, aVar, m255360D(), new IGetDataCallback<AuthInfo>() {
                /* class com.ss.lark.android.passport.biz.feature.sso.loading.CommonLoadingActivity.C650392 */

                /* renamed from: a */
                public void onSuccess(AuthInfo authInfo) {
                    CommonLoadingActivity.this.mo170969b();
                    PassportLog passportLog = CommonLoadingActivity.this.f123052c;
                    passportLog.mo171465b("n_action_ssosdk_auth_req_succ", "/accounts/auth_login/oauth2/sdk is success,associate_id=" + aVar.f123893d);
                    Intent intent = new Intent(CommonLoadingActivity.this, SSOSdkAuthActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("sso_uri", CommonLoadingActivity.this.f163811h);
                    bundle.putSerializable("sso_auth_info", authInfo);
                    if (CommonLoadingActivity.this.mo170967a()) {
                        bundle.putString("package_id", aVar.f123891b);
                        bundle.putString("class_name", CommonLoadingActivity.this.f163812i);
                        bundle.putString("signature", aVar.f123894e);
                    }
                    intent.putExtras(bundle);
                    CommonLoadingActivity.this.startActivity(intent);
                    CommonLoadingActivity.this.f123052c.mo171460a("n_page_ssosdk_loading_end_succ");
                    CommonLoadingActivity.this.finish();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    CommonLoadingActivity.this.mo170969b();
                    PassportLog passportLog = CommonLoadingActivity.this.f123052c;
                    passportLog.mo171471d("n_action_ssosdk_auth_req_fail", "errCode=" + errorResult.getErrorCode() + ", " + "/accounts/auth_login/oauth2/sdk" + " is not success,associate_id=" + aVar.f123893d);
                    if (errorResult.getErrorCode() == 4402) {
                        CommonLoadingActivity.this.mo224118a(String.valueOf(errorResult.getErrorCode()), errorResult.getDebugMsg());
                        return;
                    }
                    CommonLoadingActivity commonLoadingActivity = CommonLoadingActivity.this;
                    commonLoadingActivity.mo224116a(commonLoadingActivity.f163811h, String.valueOf(errorResult.getErrorCode()));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m255365a(CommonLoadingActivity commonLoadingActivity, Context context) {
        commonLoadingActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(commonLoadingActivity);
        }
    }

    /* renamed from: a */
    public static Context m255363a(CommonLoadingActivity commonLoadingActivity, Configuration configuration) {
        Context a = commonLoadingActivity.mo224115a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public void mo224116a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter("app_id");
        String queryParameter2 = uri.getQueryParameter("state");
        String format = String.format("%s://oauth/failure?state=%s&code=0&err_code=%s", queryParameter, queryParameter2, str);
        Intent intent = new Intent("android.intent.action.VIEW");
        if (mo170967a()) {
            if (m255362F()) {
                intent.setComponent(new ComponentName(m255359C(), this.f163812i));
            } else {
                PassportLog passportLog = this.f123052c;
                passportLog.mo171471d("n_page_ssosdk_loading_end_fail", "SSOAuthFail errCode=" + str + ",package or signature is not correct");
                finish();
                return;
            }
        }
        intent.setData(Uri.parse(format));
        intent.addFlags(268435456);
        try {
            PassportLog passportLog2 = this.f123052c;
            passportLog2.mo171465b("n_page_ssosdk_loading_end_fail", "jump to SSOSdk success,associate_id=" + queryParameter2);
            startActivity(intent);
        } catch (Exception unused) {
            PassportLog passportLog3 = this.f123052c;
            passportLog3.mo171471d("n_page_ssosdk_loading_end_fail", "jump to SSOSdk failed,associate_id=" + queryParameter2);
        }
        PassportLog passportLog4 = this.f123052c;
        passportLog4.mo171471d("n_page_ssosdk_loading_end_fail", "SSOAuthFail errCode=" + str);
        finish();
    }

    /* renamed from: b */
    public void mo224119b(final String str, String str2) {
        UDDialogUtils.DialogWrapper a = UDDialogUtils.m193815a(this, UIHelper.getString(R.string.Lark_Legacy_LarkTip), str2, UIHelper.getString(R.string.Lark_Login_SSO_TimeoutButton), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.sso.loading.CommonLoadingActivity.DialogInterface$OnClickListenerC650403 */

            public void onClick(DialogInterface dialogInterface, int i) {
                CommonLoadingActivity commonLoadingActivity = CommonLoadingActivity.this;
                commonLoadingActivity.mo224116a(commonLoadingActivity.f163811h, String.valueOf(str));
            }
        });
        if (a != null) {
            a.mo171633a(false);
            a.mo171632a();
        }
    }

    /* renamed from: a */
    public void mo224118a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = UIHelper.getString(R.string.Lark_Login_SSO_AuthorizationFailed);
        }
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        if (str2.length() >= 100) {
            str2 = str2.substring(0, 100);
        }
        mo224119b(str, str2);
    }
}

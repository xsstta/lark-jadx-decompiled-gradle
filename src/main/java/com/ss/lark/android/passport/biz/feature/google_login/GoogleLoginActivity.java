package com.ss.lark.android.passport.biz.feature.google_login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.auth.api.signin.C21577a;
import com.google.android.gms.auth.api.signin.C21579c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.api.ConnectionResult;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.statistics.AuthChannelEnum;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.google_login.mvp.GoogleLoginModel;
import com.ss.lark.android.passport.biz.feature.google_login.mvp.GoogleLoginPresenter;
import com.ss.lark.android.passport.biz.feature.google_login.mvp.GoogleLoginView;
import com.ss.lark.android.passport.biz.utils.C65246b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\bH\u0014J\b\u0010\u001a\u001a\u00020\bH\u0002¨\u0006\u001c"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/GoogleLoginActivity;", "Lcom/ss/android/lark/passport/infra/base/architecture/BaseActivity;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/GoogleLoginPresenter;", "Lcom/ss/android/lark/base/watermark/IWatermarkable;", "()V", "enableGlobalWatermark", "", "finish", "", "getWatermarkMode", "", "handleActivityResultData", "intent", "Landroid/content/Intent;", "sourceType", "initMVP", "isDoAnimationWithDefault", "isTransparentActivity", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openGoogleSdk", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GoogleLoginActivity extends BaseActivity<GoogleLoginPresenter> implements IWatermarkable {

    /* renamed from: h */
    public static final Companion f163347h = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m254382a(Context context, String str, boolean z) {
        f163347h.mo223647a(context, str, z);
    }

    /* renamed from: a */
    public Context mo223644a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254384a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public boolean cA_() {
        return false;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254380a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: f */
    public boolean mo171133f() {
        return true;
    }

    public AssetManager getAssets() {
        return m254386c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254381a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254385b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/GoogleLoginActivity$Companion;", "", "()V", "KEY_FLOW_TYPE", "", "KEY_IS_TRANSPARENT", "TAG_COMPANION", "start", "", "context", "Landroid/content/Context;", "flowType", "isTransparent", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.GoogleLoginActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo223647a(Context context, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, GoogleLoginActivity.class);
            intent.putExtra("FLOW_TYPE", str);
            intent.putExtra("IS_TRANSPARENT", z);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if (z) {
                intent.addFlags(65536);
            }
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        GoogleLoginPresenter bVar = (GoogleLoginPresenter) this.f123050a;
        if (bVar != null) {
            bVar.cn_();
        }
        super.onDestroy();
    }

    /* renamed from: w */
    private final void m254387w() {
        GoogleLoginActivity googleLoginActivity = this;
        C21579c a = C21577a.m78159a(googleLoginActivity, new GoogleSignInOptions.C21576a(GoogleSignInOptions.f52472f).mo73057b().mo73056a("183836606264-g16kmfrq1q31hd498l946eccbdrm3f2h.apps.googleusercontent.com").mo73059d());
        C65246b.m256133a().mo224500a(googleLoginActivity, a, this.f123052c);
        Intrinsics.checkExpressionValueIsNotNull(a, "client");
        Intent a2 = a.mo73064a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "client.signInIntent");
        startActivityForResult(a2, ConnectionResult.RESOLUTION_REQUIRED);
    }

    /* renamed from: x */
    private final void m254388x() {
        GoogleLoginModel aVar = new GoogleLoginModel();
        UniContext uniContext = this.f123055f;
        PassportLog passportLog = this.f123052c;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        this.f123050a = new GoogleLoginPresenter(aVar, new GoogleLoginView(this), uniContext, passportLog);
        ((GoogleLoginPresenter) this.f123050a).mo171169a();
    }

    /* renamed from: a */
    public static Resources m254381a(GoogleLoginActivity googleLoginActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(googleLoginActivity);
        }
        return googleLoginActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m254386c(GoogleLoginActivity googleLoginActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(googleLoginActivity);
        }
        return googleLoginActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new View(this));
        m254388x();
        m254387w();
    }

    /* renamed from: b */
    public static void m254385b(GoogleLoginActivity googleLoginActivity) {
        googleLoginActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GoogleLoginActivity googleLoginActivity2 = googleLoginActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    googleLoginActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254384a(GoogleLoginActivity googleLoginActivity, Context context) {
        googleLoginActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(googleLoginActivity);
        }
    }

    /* renamed from: a */
    public static Context m254380a(GoogleLoginActivity googleLoginActivity, Configuration configuration) {
        Context a = googleLoginActivity.mo223644a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final void m254383a(Intent intent, int i) {
        this.f123052c.mo171465b("n_action_idp_auth_sdk", "handle google signin account");
        try {
            GoogleSignInAccount result = C21577a.m78160a(intent).getResult(ApiException.class);
            C49096b.m193579a(true, true, AuthChannelEnum.TYPE_GOOGLE.value(), i);
            String stringExtra = getIntent().getStringExtra("FLOW_TYPE");
            GoogleLoginPresenter bVar = (GoogleLoginPresenter) this.f123050a;
            Intrinsics.checkExpressionValueIsNotNull(result, "account");
            String b = result.mo73029b();
            if (b == null) {
                b = "";
            }
            bVar.mo223649a(stringExtra, b);
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                C49096b.m193579a(true, false, AuthChannelEnum.TYPE_GOOGLE.value(), i);
                UDToast.show(this, (int) R.string.Lark_Login_V3_ThirdParty_Call_failure);
                PassportLog passportLog = this.f123052c;
                passportLog.mo171462a("n_action_idp_auth_sdk", "signInResult:failed ApiException code=" + e.getStatusCode(), e);
                finish();
            }
        } catch (Exception e2) {
            C49096b.m193579a(true, false, AuthChannelEnum.TYPE_GOOGLE.value(), i);
            UDToast.show(this, (int) R.string.Lark_Login_V3_ThirdParty_Call_failure);
            PassportLog passportLog2 = this.f123052c;
            passportLog2.mo171462a("n_action_idp_auth_sdk", "signInResult:failed Exception =" + e2.getMessage(), e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001 && i2 == -1) {
            m254383a(intent, getIntent().getIntExtra("sourceType", 1));
            return;
        }
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("GoogleLoginActivity", "onActivityResult not suc resultCode=" + i2);
        finish();
    }
}

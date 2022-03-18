package com.ss.lark.android.passport.biz.feature.auth_type;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.feature.auth_type.mvp.AuthTypeView;
import com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64629a;
import com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64630b;

@RouterAnno(name = "auth_type", teaName = "bankcard_verification_click")
public class AuthTypeActivity extends BaseActivity {

    /* renamed from: h */
    private C64630b f163095h;

    /* renamed from: i */
    private final AuthTypeView.AbstractC64628a f163096i = new AuthTypeView.AbstractC64628a() {
        /* class com.ss.lark.android.passport.biz.feature.auth_type.AuthTypeActivity.C646261 */

        @Override // com.ss.lark.android.passport.biz.feature.auth_type.mvp.AuthTypeView.AbstractC64628a
        /* renamed from: a */
        public void mo223429a(AuthTypeView authTypeView) {
            ButterKnife.bind(authTypeView, AuthTypeActivity.this);
        }
    };

    /* renamed from: j */
    private CommonUiContainer f163097j;

    /* renamed from: a */
    public Context mo223426a(Configuration configuration) {
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
        m253914a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m253912a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253916c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253913a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253915b(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        if (C49203q.m193977c(this)) {
            C49203q.m193973a((Context) this);
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.f163095h.cn_();
        super.onDestroy();
    }

    /* renamed from: w */
    private void m253917w() {
        C64630b bVar = new C64630b(this, new AuthTypeView(this.f163096i, this, this.f163097j), new C64629a(getIntent()), this.f123055f, this.f123052c);
        this.f163095h = bVar;
        bVar.mo171169a();
    }

    /* renamed from: a */
    public static Resources m253913a(AuthTypeActivity authTypeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authTypeActivity);
        }
        return authTypeActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m253916c(AuthTypeActivity authTypeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authTypeActivity);
        }
        return authTypeActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_action_auth_type", "enter");
        this.f163097j = CommonUiContainer.m252970b(this, R.layout.signin_sdk_activity_auth_type);
        m253917w();
    }

    /* renamed from: b */
    public static void m253915b(AuthTypeActivity authTypeActivity) {
        authTypeActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AuthTypeActivity authTypeActivity2 = authTypeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    authTypeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253914a(AuthTypeActivity authTypeActivity, Context context) {
        authTypeActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authTypeActivity);
        }
    }

    /* renamed from: a */
    public static Context m253912a(AuthTypeActivity authTypeActivity, Configuration configuration) {
        Context a = authTypeActivity.mo223426a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

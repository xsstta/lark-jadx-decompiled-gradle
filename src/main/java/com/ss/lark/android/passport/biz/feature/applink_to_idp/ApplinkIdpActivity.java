package com.ss.lark.android.passport.biz.feature.applink_to_idp;

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
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64612a;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64613b;
import com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c;

@RouterAnno(name = "applink_to_idp", teaName = "bankcard_verification_click")
public class ApplinkIdpActivity extends BaseActivity {

    /* renamed from: h */
    private C64613b f163074h;

    /* renamed from: i */
    private C64615c.AbstractC64621a f163075i = new C64615c.AbstractC64621a() {
        /* class com.ss.lark.android.passport.biz.feature.applink_to_idp.ApplinkIdpActivity.C646111 */

        @Override // com.ss.lark.android.passport.biz.feature.applink_to_idp.p3220a.C64615c.AbstractC64621a
        /* renamed from: a */
        public void mo223410a(C64615c cVar) {
            ButterKnife.bind(cVar, ApplinkIdpActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo223407a(Configuration configuration) {
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
        m253870a(this, context);
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
        return m253868a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253872c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253869a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: h */
    public boolean mo171136h() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253871b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.f163074h.cn_();
        super.onDestroy();
    }

    /* renamed from: w */
    private void m253873w() {
        C64613b bVar = new C64613b(this, new C64612a(getIntent()), new C64615c(this, this.f163075i), this.f123055f, this.f123052c);
        this.f163074h = bVar;
        bVar.mo171169a();
    }

    /* renamed from: a */
    public static Resources m253869a(ApplinkIdpActivity applinkIdpActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applinkIdpActivity);
        }
        return applinkIdpActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m253872c(ApplinkIdpActivity applinkIdpActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applinkIdpActivity);
        }
        return applinkIdpActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("LoadingActivity", "enter");
        setContentView(R.layout.signin_sdk_applink_to_idp);
        m253873w();
    }

    /* renamed from: b */
    public static void m253871b(ApplinkIdpActivity applinkIdpActivity) {
        applinkIdpActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ApplinkIdpActivity applinkIdpActivity2 = applinkIdpActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    applinkIdpActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253870a(ApplinkIdpActivity applinkIdpActivity, Context context) {
        applinkIdpActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applinkIdpActivity);
        }
    }

    /* renamed from: a */
    public static Context m253868a(ApplinkIdpActivity applinkIdpActivity, Configuration configuration) {
        Context a = applinkIdpActivity.mo223407a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

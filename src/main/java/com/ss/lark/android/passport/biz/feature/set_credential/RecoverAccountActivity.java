package com.ss.lark.android.passport.biz.feature.set_credential;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

@RouterAnno(name = "set_credential")
public class RecoverAccountActivity extends BaseActivity {

    /* renamed from: h */
    private C65000b f163723h;

    /* renamed from: a */
    public Context mo224016a(Configuration configuration) {
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
        m255144a(this, context);
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
        return m255142a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255146c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255143a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255145b(this);
    }

    /* renamed from: a */
    public static Resources m255143a(RecoverAccountActivity recoverAccountActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recoverAccountActivity);
        }
        return recoverAccountActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255146c(RecoverAccountActivity recoverAccountActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recoverAccountActivity);
        }
        return recoverAccountActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m255145b(RecoverAccountActivity recoverAccountActivity) {
        recoverAccountActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RecoverAccountActivity recoverAccountActivity2 = recoverAccountActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    recoverAccountActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_page_new_credential_start", "enter page");
        this.f163723h = (C65000b) Fragment.instantiate(this, C65000b.class.getName(), mo171127a(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f163723h, (String) null).commit();
    }

    /* renamed from: a */
    public static void m255144a(RecoverAccountActivity recoverAccountActivity, Context context) {
        recoverAccountActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recoverAccountActivity);
        }
    }

    /* renamed from: a */
    public static Context m255142a(RecoverAccountActivity recoverAccountActivity, Configuration configuration) {
        Context a = recoverAccountActivity.mo224016a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

package com.ss.android.lark.security.set;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

@RouterAnno(name = "set_sec_pwd")
public class SetSecurityPasswordActivity extends BaseActivity {

    /* renamed from: h */
    private C54074b f133864h;

    /* renamed from: a */
    public Context mo185084a(Configuration configuration) {
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
        m209811a(this, context);
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
        return m209809a(this, configuration);
    }

    public AssetManager getAssets() {
        return m209813c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m209810a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m209812b(this);
    }

    /* renamed from: a */
    public static Resources m209810a(SetSecurityPasswordActivity setSecurityPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setSecurityPasswordActivity);
        }
        return setSecurityPasswordActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m209813c(SetSecurityPasswordActivity setSecurityPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setSecurityPasswordActivity);
        }
        return setSecurityPasswordActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m209812b(SetSecurityPasswordActivity setSecurityPasswordActivity) {
        setSecurityPasswordActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SetSecurityPasswordActivity setSecurityPasswordActivity2 = setSecurityPasswordActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    setSecurityPasswordActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_set_security_password);
        this.f133864h = (C54074b) Fragment.instantiate(this, C54074b.class.getName(), mo171127a(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f133864h).commit();
    }

    /* renamed from: a */
    public static void m209811a(SetSecurityPasswordActivity setSecurityPasswordActivity, Context context) {
        setSecurityPasswordActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setSecurityPasswordActivity);
        }
    }

    /* renamed from: a */
    public static Context m209809a(SetSecurityPasswordActivity setSecurityPasswordActivity, Configuration configuration) {
        Context a = setSecurityPasswordActivity.mo185084a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

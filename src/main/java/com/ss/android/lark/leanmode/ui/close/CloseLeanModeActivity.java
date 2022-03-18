package com.ss.android.lark.leanmode.ui.close;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class CloseLeanModeActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C41286a f105069a;

    /* renamed from: a */
    public Context mo148704a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo148705a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo148706a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m163686a(this, context);
    }

    /* renamed from: b */
    public void mo148707b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo148708c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m163683a(this, configuration);
    }

    public AssetManager getAssets() {
        return m163688c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m163684a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m163687b(this);
    }

    /* renamed from: a */
    public static Resources m163684a(CloseLeanModeActivity closeLeanModeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(closeLeanModeActivity);
        }
        return closeLeanModeActivity.mo148705a();
    }

    /* renamed from: c */
    public static AssetManager m163688c(CloseLeanModeActivity closeLeanModeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(closeLeanModeActivity);
        }
        return closeLeanModeActivity.mo148708c();
    }

    /* renamed from: b */
    public static void m163687b(CloseLeanModeActivity closeLeanModeActivity) {
        closeLeanModeActivity.mo148707b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CloseLeanModeActivity closeLeanModeActivity2 = closeLeanModeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    closeLeanModeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setLightTextStatusBar(C57582a.m223616d(this, R.color.lkui_B500));
        setContentView(R.layout.activity_close_lean_mode);
        this.f105069a = (C41286a) Fragment.instantiate(this, C41286a.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f105069a).commit();
    }

    /* renamed from: a */
    public static void m163686a(CloseLeanModeActivity closeLeanModeActivity, Context context) {
        closeLeanModeActivity.mo148706a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(closeLeanModeActivity);
        }
    }

    /* renamed from: a */
    public static Context m163683a(CloseLeanModeActivity closeLeanModeActivity, Configuration configuration) {
        Context a = closeLeanModeActivity.mo148704a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m163685a(Context context, String str, String str2) {
        Intent intent = new Intent(context, CloseLeanModeActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("app_id", str);
        intent.putExtra("app_callback_id", str2);
        context.startActivity(intent);
    }
}

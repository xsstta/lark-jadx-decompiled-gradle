package com.ss.android.lark.upgrade.setting.about;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/AboutActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/upgrade/setting/about/AboutFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AboutActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private AboutFragment f142121a;

    /* renamed from: a */
    public Context mo195760a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo195761a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo195762a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m223891a(this, context);
    }

    /* renamed from: b */
    public void mo195763b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo195764c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m223889a(this, configuration);
    }

    public AssetManager getAssets() {
        return m223893c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m223890a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m223892b(this);
    }

    /* renamed from: d */
    private final void m223894d() {
        AboutFragment aVar = new AboutFragment();
        this.f142121a = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        AboutFragment aVar2 = this.f142121a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        beginTransaction.add(16908290, aVar2, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m223894d();
    }

    /* renamed from: a */
    public static Resources m223890a(AboutActivity aboutActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(aboutActivity);
        }
        return aboutActivity.mo195761a();
    }

    /* renamed from: c */
    public static AssetManager m223893c(AboutActivity aboutActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(aboutActivity);
        }
        return aboutActivity.mo195764c();
    }

    /* renamed from: b */
    public static void m223892b(AboutActivity aboutActivity) {
        aboutActivity.mo195763b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AboutActivity aboutActivity2 = aboutActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    aboutActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m223891a(AboutActivity aboutActivity, Context context) {
        aboutActivity.mo195762a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(aboutActivity);
        }
    }

    /* renamed from: a */
    public static Context m223889a(AboutActivity aboutActivity, Configuration configuration) {
        Context a = aboutActivity.mo195760a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

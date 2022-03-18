package com.ss.android.lark.favorite.list;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FavoriteListActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C37217b f95570a;

    /* renamed from: a */
    public Context mo136865a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo136866a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo136867a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m146522a(this, context);
    }

    /* renamed from: b */
    public void mo136868b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo136869c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m146520a(this, configuration);
    }

    public AssetManager getAssets() {
        return m146524c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m146521a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m146523b(this);
    }

    /* renamed from: d */
    private void m146525d() {
        C37217b bVar = new C37217b();
        this.f95570a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f95570a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m146525d();
    }

    /* renamed from: a */
    public static Resources m146521a(FavoriteListActivity favoriteListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(favoriteListActivity);
        }
        return favoriteListActivity.mo136866a();
    }

    /* renamed from: c */
    public static AssetManager m146524c(FavoriteListActivity favoriteListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(favoriteListActivity);
        }
        return favoriteListActivity.mo136869c();
    }

    /* renamed from: b */
    public static void m146523b(FavoriteListActivity favoriteListActivity) {
        favoriteListActivity.mo136868b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FavoriteListActivity favoriteListActivity2 = favoriteListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    favoriteListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m146522a(FavoriteListActivity favoriteListActivity, Context context) {
        favoriteListActivity.mo136867a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(favoriteListActivity);
        }
    }

    /* renamed from: a */
    public static Context m146520a(FavoriteListActivity favoriteListActivity, Configuration configuration) {
        Context a = favoriteListActivity.mo136865a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C37217b bVar = this.f95570a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}

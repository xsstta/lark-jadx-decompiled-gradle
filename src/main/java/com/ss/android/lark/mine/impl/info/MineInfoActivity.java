package com.ss.android.lark.mine.impl.info;

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

public class MineInfoActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C45763a f115513a;

    /* renamed from: a */
    public Context mo160941a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo160942a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo160943a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m181331a(this, context);
    }

    /* renamed from: b */
    public void mo160944b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo160945c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m181329a(this, configuration);
    }

    public AssetManager getAssets() {
        return m181333c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m181330a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m181332b(this);
    }

    /* renamed from: d */
    private void m181334d() {
        C45763a aVar = new C45763a();
        this.f115513a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f115513a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m181334d();
    }

    /* renamed from: a */
    public static Resources m181330a(MineInfoActivity mineInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineInfoActivity);
        }
        return mineInfoActivity.mo160942a();
    }

    /* renamed from: c */
    public static AssetManager m181333c(MineInfoActivity mineInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineInfoActivity);
        }
        return mineInfoActivity.mo160945c();
    }

    /* renamed from: b */
    public static void m181332b(MineInfoActivity mineInfoActivity) {
        mineInfoActivity.mo160944b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MineInfoActivity mineInfoActivity2 = mineInfoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mineInfoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m181331a(MineInfoActivity mineInfoActivity, Context context) {
        mineInfoActivity.mo160943a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineInfoActivity);
        }
    }

    /* renamed from: a */
    public static Context m181329a(MineInfoActivity mineInfoActivity, Configuration configuration) {
        Context a = mineInfoActivity.mo160941a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C45763a aVar = this.f115513a;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}

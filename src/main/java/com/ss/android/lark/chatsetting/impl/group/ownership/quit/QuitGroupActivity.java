package com.ss.android.lark.chatsetting.impl.group.ownership.quit;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class QuitGroupActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo128383a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128384a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128385a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135215a(this, context);
    }

    /* renamed from: b */
    public void mo128386b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128387c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135213a(this, configuration);
    }

    public AssetManager getAssets() {
        return m135217c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135214a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135216b(this);
    }

    /* renamed from: a */
    public static Resources m135214a(QuitGroupActivity quitGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(quitGroupActivity);
        }
        return quitGroupActivity.mo128384a();
    }

    /* renamed from: c */
    public static AssetManager m135217c(QuitGroupActivity quitGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(quitGroupActivity);
        }
        return quitGroupActivity.mo128387c();
    }

    /* renamed from: b */
    public static void m135216b(QuitGroupActivity quitGroupActivity) {
        quitGroupActivity.mo128386b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            QuitGroupActivity quitGroupActivity2 = quitGroupActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    quitGroupActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        QuitGroupFragment quitGroupFragment = new QuitGroupFragment();
        quitGroupFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, quitGroupFragment, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m135215a(QuitGroupActivity quitGroupActivity, Context context) {
        quitGroupActivity.mo128385a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(quitGroupActivity);
        }
    }

    /* renamed from: a */
    public static Context m135213a(QuitGroupActivity quitGroupActivity, Configuration configuration) {
        Context a = quitGroupActivity.mo128383a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

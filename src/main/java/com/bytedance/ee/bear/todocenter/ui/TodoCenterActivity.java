package com.bytedance.ee.bear.todocenter.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.todocenter.ui.host.LarkTodoCenterFragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class TodoCenterActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo44875a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo44876a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo44877a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m48574a(this, context);
    }

    /* renamed from: b */
    public void mo44878b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo44879c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m48572a(this, configuration);
    }

    public AssetManager getAssets() {
        return m48576c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m48573a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m48575b(this);
    }

    /* renamed from: a */
    public static Resources m48573a(TodoCenterActivity todoCenterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoCenterActivity);
        }
        return todoCenterActivity.mo44876a();
    }

    /* renamed from: c */
    public static AssetManager m48576c(TodoCenterActivity todoCenterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoCenterActivity);
        }
        return todoCenterActivity.mo44879c();
    }

    /* renamed from: b */
    public static void m48575b(TodoCenterActivity todoCenterActivity) {
        todoCenterActivity.mo44878b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TodoCenterActivity todoCenterActivity2 = todoCenterActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    todoCenterActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_todo_center);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment.instantiate(this, LarkTodoCenterFragment.class.getName())).commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m48574a(TodoCenterActivity todoCenterActivity, Context context) {
        todoCenterActivity.mo44877a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(todoCenterActivity);
        }
    }

    /* renamed from: a */
    public static Context m48572a(TodoCenterActivity todoCenterActivity, Configuration configuration) {
        Context a = todoCenterActivity.mo44875a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

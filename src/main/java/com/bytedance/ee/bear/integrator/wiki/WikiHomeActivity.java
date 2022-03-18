package com.bytedance.ee.bear.integrator.wiki;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.wiki.mvpframework.WikiBaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class WikiHomeActivity extends WikiBaseActivity {

    /* renamed from: a */
    private C7926a f21318a;

    /* renamed from: a */
    public Context mo30774a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo30775a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo30776a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m31663a(this, context);
    }

    /* renamed from: b */
    public void mo30777b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo30778c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m31661a(this, configuration);
    }

    public AssetManager getAssets() {
        return m31665c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m31662a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m31664b(this);
    }

    /* renamed from: a */
    public static Resources m31662a(WikiHomeActivity wikiHomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiHomeActivity);
        }
        return wikiHomeActivity.mo30775a();
    }

    /* renamed from: c */
    public static AssetManager m31665c(WikiHomeActivity wikiHomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiHomeActivity);
        }
        return wikiHomeActivity.mo30778c();
    }

    /* renamed from: b */
    public static void m31664b(WikiHomeActivity wikiHomeActivity) {
        wikiHomeActivity.mo30777b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiHomeActivity wikiHomeActivity2 = wikiHomeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiHomeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        setContentView(R.layout.wiki_activity);
        this.f21318a = new C7926a();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.list_folder_select_container, this.f21318a);
        beginTransaction.commit();
    }

    /* renamed from: a */
    public static void m31663a(WikiHomeActivity wikiHomeActivity, Context context) {
        wikiHomeActivity.mo30776a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiHomeActivity);
        }
    }

    /* renamed from: a */
    public static Context m31661a(WikiHomeActivity wikiHomeActivity, Configuration configuration) {
        Context a = wikiHomeActivity.mo30774a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

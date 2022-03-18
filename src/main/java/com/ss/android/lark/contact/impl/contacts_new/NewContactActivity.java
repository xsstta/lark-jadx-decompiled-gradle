package com.ss.android.lark.contact.impl.contacts_new;

import android.content.Context;
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

public class NewContactActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C35700b f92292a;

    /* renamed from: a */
    public Context mo131448a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131449a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131450a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m139691a(this, context);
    }

    /* renamed from: b */
    public void mo131451b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131452c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m139689a(this, configuration);
    }

    public AssetManager getAssets() {
        return m139693c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m139690a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m139692b(this);
    }

    /* renamed from: d */
    private void m139694d() {
        C35700b bVar = new C35700b();
        this.f92292a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f92292a, "NewContactFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m139694d();
    }

    /* renamed from: a */
    public static Resources m139690a(NewContactActivity newContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(newContactActivity);
        }
        return newContactActivity.mo131449a();
    }

    /* renamed from: c */
    public static AssetManager m139693c(NewContactActivity newContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(newContactActivity);
        }
        return newContactActivity.mo131452c();
    }

    /* renamed from: b */
    public static void m139692b(NewContactActivity newContactActivity) {
        newContactActivity.mo131451b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NewContactActivity newContactActivity2 = newContactActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    newContactActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139691a(NewContactActivity newContactActivity, Context context) {
        newContactActivity.mo131450a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(newContactActivity);
        }
    }

    /* renamed from: a */
    public static Context m139689a(NewContactActivity newContactActivity, Configuration configuration) {
        Context a = newContactActivity.mo131448a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

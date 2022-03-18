package com.ss.android.lark.contact.impl.contacts_external;

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
import com.ss.android.lark.contact.feat.contact_external.C35433a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ExternalContactActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo131184a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131185a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131186a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m139240a(this, context);
    }

    /* renamed from: b */
    public void mo131187b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131188c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m139238a(this, configuration);
    }

    public AssetManager getAssets() {
        return m139242c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m139239a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m139241b(this);
    }

    /* renamed from: d */
    private void m139243d() {
        C35433a aVar = new C35433a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, "ExternalContactFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m139243d();
    }

    /* renamed from: a */
    public static Resources m139239a(ExternalContactActivity externalContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(externalContactActivity);
        }
        return externalContactActivity.mo131185a();
    }

    /* renamed from: c */
    public static AssetManager m139242c(ExternalContactActivity externalContactActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(externalContactActivity);
        }
        return externalContactActivity.mo131188c();
    }

    /* renamed from: b */
    public static void m139241b(ExternalContactActivity externalContactActivity) {
        externalContactActivity.mo131187b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ExternalContactActivity externalContactActivity2 = externalContactActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    externalContactActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139240a(ExternalContactActivity externalContactActivity, Context context) {
        externalContactActivity.mo131186a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(externalContactActivity);
        }
    }

    /* renamed from: a */
    public static Context m139238a(ExternalContactActivity externalContactActivity, Configuration configuration) {
        Context a = externalContactActivity.mo131184a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

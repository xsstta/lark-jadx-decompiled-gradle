package com.ss.android.lark.notification.setting.impl.setting;

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

public class NotificationSettingsActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C48601b f122241a;

    /* renamed from: a */
    public Context mo169701a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169702a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169703a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m191563a(this, context);
    }

    /* renamed from: b */
    public void mo169704b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169705c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m191561a(this, configuration);
    }

    public AssetManager getAssets() {
        return m191565c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m191562a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m191564b(this);
    }

    /* renamed from: d */
    private void m191566d() {
        C48601b bVar = new C48601b();
        this.f122241a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f122241a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m191566d();
    }

    /* renamed from: a */
    public static Resources m191562a(NotificationSettingsActivity notificationSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationSettingsActivity);
        }
        return notificationSettingsActivity.mo169702a();
    }

    /* renamed from: c */
    public static AssetManager m191565c(NotificationSettingsActivity notificationSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationSettingsActivity);
        }
        return notificationSettingsActivity.mo169705c();
    }

    /* renamed from: b */
    public static void m191564b(NotificationSettingsActivity notificationSettingsActivity) {
        notificationSettingsActivity.mo169704b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NotificationSettingsActivity notificationSettingsActivity2 = notificationSettingsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    notificationSettingsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m191563a(NotificationSettingsActivity notificationSettingsActivity, Context context) {
        notificationSettingsActivity.mo169703a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationSettingsActivity);
        }
    }

    /* renamed from: a */
    public static Context m191561a(NotificationSettingsActivity notificationSettingsActivity, Configuration configuration) {
        Context a = notificationSettingsActivity.mo169701a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C48601b bVar = this.f122241a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}

package com.ss.android.vc.lark.setting;

import android.content.Context;
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
import com.ss.android.vcxp.C63801c;

public class VideoChatSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo211563a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo211564a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo211565a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m237951a(this, context);
    }

    /* renamed from: b */
    public void mo211566b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo211567c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m237949a(this, configuration);
    }

    public AssetManager getAssets() {
        return m237953c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m237950a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m237952b(this);
    }

    /* renamed from: d */
    private void m237954d() {
        C61190d dVar = new C61190d();
        dVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, dVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m237950a(VideoChatSettingActivity videoChatSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoChatSettingActivity);
        }
        return videoChatSettingActivity.mo211564a();
    }

    /* renamed from: c */
    public static AssetManager m237953c(VideoChatSettingActivity videoChatSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoChatSettingActivity);
        }
        return videoChatSettingActivity.mo211567c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        if (!C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m237954d();
    }

    /* renamed from: b */
    public static void m237952b(VideoChatSettingActivity videoChatSettingActivity) {
        videoChatSettingActivity.mo211566b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VideoChatSettingActivity videoChatSettingActivity2 = videoChatSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    videoChatSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m237951a(VideoChatSettingActivity videoChatSettingActivity, Context context) {
        videoChatSettingActivity.mo211565a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(videoChatSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m237949a(VideoChatSettingActivity videoChatSettingActivity, Configuration configuration) {
        Context a = videoChatSettingActivity.mo211563a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

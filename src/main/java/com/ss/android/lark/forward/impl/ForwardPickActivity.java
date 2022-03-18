package com.ss.android.lark.forward.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ForwardPickActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C38408a f98766a;

    /* renamed from: a */
    public Context mo140903a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo140904a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo140905a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m151478a(this, context);
    }

    /* renamed from: b */
    public void mo140906b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo140907c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m151476a(this, configuration);
    }

    public AssetManager getAssets() {
        return m151480c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m151477a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m151479b(this);
    }

    /* renamed from: d */
    private boolean m151481d() {
        C38408a aVar = this.f98766a;
        if (aVar == null) {
            return false;
        }
        return aVar.mo140925a();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (!m151481d()) {
            super.onBackPressed();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        int[] intArray;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (intArray = extras.getIntArray("key_transition_anim_in")) == null) {
            return super.getEnterAnimationConfig();
        }
        return new ActivityAnimationManager.AnimationConfig(intArray);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        int[] intArray;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (intArray = extras.getIntArray("key_transition_anim_out")) == null) {
            return super.getExitAnimationConfig();
        }
        return new ActivityAnimationManager.AnimationConfig(intArray);
    }

    /* renamed from: a */
    public static Resources m151477a(ForwardPickActivity forwardPickActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(forwardPickActivity);
        }
        return forwardPickActivity.mo140904a();
    }

    /* renamed from: c */
    public static AssetManager m151480c(ForwardPickActivity forwardPickActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(forwardPickActivity);
        }
        return forwardPickActivity.mo140907c();
    }

    /* renamed from: b */
    public static void m151479b(ForwardPickActivity forwardPickActivity) {
        forwardPickActivity.mo140906b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ForwardPickActivity forwardPickActivity2 = forwardPickActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    forwardPickActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a(getClass().getSimpleName()).mo168688b();
        C48211b.m190251a().mo168689b("onCreate");
        super.onCreate(bundle);
        C38408a aVar = new C38408a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
        this.f98766a = aVar;
        C48211b.m190251a().mo168691c("onCreate");
    }

    /* renamed from: a */
    public static void m151478a(ForwardPickActivity forwardPickActivity, Context context) {
        forwardPickActivity.mo140905a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(forwardPickActivity);
        }
    }

    /* renamed from: a */
    public static Context m151476a(ForwardPickActivity forwardPickActivity, Configuration configuration) {
        Context a = forwardPickActivity.mo140903a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

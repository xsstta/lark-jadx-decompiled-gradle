package com.ss.android.lark.mine.impl.status;

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
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class UserStatusUpdateActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo161024a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo161025a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo161026a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m181484a(this, context);
    }

    /* renamed from: b */
    public void mo161027b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo161028c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m181482a(this, configuration);
    }

    public AssetManager getAssets() {
        return m181486c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m181483a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m181485b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    private void m181487d() {
        C45810d dVar = new C45810d();
        dVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, dVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m181487d();
    }

    /* renamed from: a */
    public static Resources m181483a(UserStatusUpdateActivity userStatusUpdateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userStatusUpdateActivity);
        }
        return userStatusUpdateActivity.mo161025a();
    }

    /* renamed from: c */
    public static AssetManager m181486c(UserStatusUpdateActivity userStatusUpdateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userStatusUpdateActivity);
        }
        return userStatusUpdateActivity.mo161028c();
    }

    /* renamed from: b */
    public static void m181485b(UserStatusUpdateActivity userStatusUpdateActivity) {
        userStatusUpdateActivity.mo161027b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            UserStatusUpdateActivity userStatusUpdateActivity2 = userStatusUpdateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    userStatusUpdateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m181484a(UserStatusUpdateActivity userStatusUpdateActivity, Context context) {
        userStatusUpdateActivity.mo161026a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userStatusUpdateActivity);
        }
    }

    /* renamed from: a */
    public static Context m181482a(UserStatusUpdateActivity userStatusUpdateActivity, Configuration configuration) {
        Context a = userStatusUpdateActivity.mo161024a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

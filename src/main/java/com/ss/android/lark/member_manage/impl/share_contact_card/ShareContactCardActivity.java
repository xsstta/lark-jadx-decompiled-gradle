package com.ss.android.lark.member_manage.impl.share_contact_card;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ShareContactCardActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo159711a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159712a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159713a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179284a(this, context);
    }

    /* renamed from: b */
    public void mo159714b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159715c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179282a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179286c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179283a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179285b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: a */
    public static Resources m179283a(ShareContactCardActivity shareContactCardActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareContactCardActivity);
        }
        return shareContactCardActivity.mo159712a();
    }

    /* renamed from: c */
    public static AssetManager m179286c(ShareContactCardActivity shareContactCardActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareContactCardActivity);
        }
        return shareContactCardActivity.mo159715c();
    }

    /* renamed from: b */
    public static void m179285b(ShareContactCardActivity shareContactCardActivity) {
        shareContactCardActivity.mo159714b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareContactCardActivity shareContactCardActivity2 = shareContactCardActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareContactCardActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportFragmentManager().beginTransaction().add(16908290, C45179a.m179292a(getIntent().getExtras()), "ShareContactCardFragment").commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m179284a(ShareContactCardActivity shareContactCardActivity, Context context) {
        shareContactCardActivity.mo159713a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareContactCardActivity);
        }
    }

    /* renamed from: a */
    public static Context m179282a(ShareContactCardActivity shareContactCardActivity, Configuration configuration) {
        Context a = shareContactCardActivity.mo159711a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

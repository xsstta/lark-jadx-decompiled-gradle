package com.ss.android.lark.chatsetting.impl.group.avatar;

import android.content.Context;
import android.content.Intent;
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

public class AvatarEditActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C34569b f89245a;

    /* renamed from: a */
    public Context mo127722a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo127723a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo127724a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134266a(this, context);
    }

    /* renamed from: b */
    public void mo127725b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo127726c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134264a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134268c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134265a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134267b(this);
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
    private void m134269d() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        C34569b bVar = new C34569b();
        this.f89245a = bVar;
        bVar.setArguments(getIntent().getExtras());
        beginTransaction.add(16908290, this.f89245a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m134269d();
    }

    /* renamed from: a */
    public static Resources m134265a(AvatarEditActivity avatarEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(avatarEditActivity);
        }
        return avatarEditActivity.mo127723a();
    }

    /* renamed from: c */
    public static AssetManager m134268c(AvatarEditActivity avatarEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(avatarEditActivity);
        }
        return avatarEditActivity.mo127726c();
    }

    /* renamed from: b */
    public static void m134267b(AvatarEditActivity avatarEditActivity) {
        avatarEditActivity.mo127725b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AvatarEditActivity avatarEditActivity2 = avatarEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    avatarEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m134266a(AvatarEditActivity avatarEditActivity, Context context) {
        avatarEditActivity.mo127724a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(avatarEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m134264a(AvatarEditActivity avatarEditActivity, Configuration configuration) {
        Context a = avatarEditActivity.mo127722a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f89245a.onActivityResult(i, i2, intent);
    }
}

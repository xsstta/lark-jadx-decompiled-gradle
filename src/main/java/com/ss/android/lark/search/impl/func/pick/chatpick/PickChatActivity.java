package com.ss.android.lark.search.impl.func.pick.chatpick;

import android.content.Context;
import android.content.Intent;
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

public class PickChatActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo182957a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182958a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182959a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m207647a(this, context);
    }

    /* renamed from: b */
    public void mo182960b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182961c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m207645a(this, configuration);
    }

    public AssetManager getAssets() {
        return m207649c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m207646a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m207648b(this);
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
    private boolean m207650d() {
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Resources m207646a(PickChatActivity pickChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickChatActivity);
        }
        return pickChatActivity.mo182958a();
    }

    /* renamed from: c */
    public static AssetManager m207649c(PickChatActivity pickChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickChatActivity);
        }
        return pickChatActivity.mo182961c();
    }

    /* renamed from: b */
    public static void m207648b(PickChatActivity pickChatActivity) {
        pickChatActivity.mo182960b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PickChatActivity pickChatActivity2 = pickChatActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pickChatActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m207650d()) {
            Log.m165383e("LarkSearch.Search.PickChatActivity", "intent data is invalid");
            finish();
            return;
        }
        C53644b bVar = new C53644b();
        bVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, bVar, "LarkSearch.Search.PickChatActivity").commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m207647a(PickChatActivity pickChatActivity, Context context) {
        pickChatActivity.mo182959a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickChatActivity);
        }
    }

    /* renamed from: a */
    public static Context m207645a(PickChatActivity pickChatActivity, Configuration configuration) {
        Context a = pickChatActivity.mo182957a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

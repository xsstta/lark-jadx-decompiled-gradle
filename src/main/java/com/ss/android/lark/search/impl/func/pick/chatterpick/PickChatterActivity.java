package com.ss.android.lark.search.impl.func.pick.chatterpick;

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

public class PickChatterActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C53664a f132444a;

    /* renamed from: a */
    public Context mo182992a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182993a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182994a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m207725a(this, context);
    }

    /* renamed from: b */
    public void mo182995b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182996c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m207723a(this, configuration);
    }

    public AssetManager getAssets() {
        return m207727c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m207724a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m207726b(this);
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
    private boolean m207728d() {
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C53664a aVar = this.f132444a;
        if (aVar != null) {
            aVar.mo183000a();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public static Resources m207724a(PickChatterActivity pickChatterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickChatterActivity);
        }
        return pickChatterActivity.mo182993a();
    }

    /* renamed from: c */
    public static AssetManager m207727c(PickChatterActivity pickChatterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickChatterActivity);
        }
        return pickChatterActivity.mo182996c();
    }

    /* renamed from: b */
    public static void m207726b(PickChatterActivity pickChatterActivity) {
        pickChatterActivity.mo182995b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PickChatterActivity pickChatterActivity2 = pickChatterActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pickChatterActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m207728d()) {
            Log.m165383e("LarkSearch.Search.BaseFragmentActivity", "intent data is invalid");
            finish();
            return;
        }
        C53664a aVar = new C53664a();
        this.f132444a = aVar;
        aVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f132444a, "LarkSearch.Search.BaseFragmentActivity").commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m207725a(PickChatterActivity pickChatterActivity, Context context) {
        pickChatterActivity.mo182994a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickChatterActivity);
        }
    }

    /* renamed from: a */
    public static Context m207723a(PickChatterActivity pickChatterActivity, Configuration configuration) {
        Context a = pickChatterActivity.mo182992a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

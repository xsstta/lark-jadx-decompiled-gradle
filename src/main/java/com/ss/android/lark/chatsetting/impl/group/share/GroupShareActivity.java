package com.ss.android.lark.chatsetting.impl.group.share;

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

public class GroupShareActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C34992c f90270a;

    /* renamed from: a */
    public Context mo128933a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128934a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128935a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m136199a(this, context);
    }

    /* renamed from: b */
    public void mo128936b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128937c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m136197a(this, configuration);
    }

    public AssetManager getAssets() {
        return m136201c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m136198a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m136200b(this);
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

    /* renamed from: d */
    private void m136202d() {
        this.f90270a = C34992c.m136254a(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f90270a, "GroupShareFragment");
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m136202d();
    }

    /* renamed from: a */
    public static Resources m136198a(GroupShareActivity groupShareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupShareActivity);
        }
        return groupShareActivity.mo128934a();
    }

    /* renamed from: c */
    public static AssetManager m136201c(GroupShareActivity groupShareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupShareActivity);
        }
        return groupShareActivity.mo128937c();
    }

    /* renamed from: b */
    public static void m136200b(GroupShareActivity groupShareActivity) {
        groupShareActivity.mo128936b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupShareActivity groupShareActivity2 = groupShareActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupShareActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m136199a(GroupShareActivity groupShareActivity, Context context) {
        groupShareActivity.mo128935a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupShareActivity);
        }
    }

    /* renamed from: a */
    public static Context m136197a(GroupShareActivity groupShareActivity, Configuration configuration) {
        Context a = groupShareActivity.mo128933a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C34992c cVar = this.f90270a;
        if (cVar != null) {
            cVar.onActivityResult(i, i2, intent);
        }
    }
}

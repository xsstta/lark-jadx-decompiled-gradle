package com.bytedance.ee.bear.lark.selector;

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

public class DocSelectorActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C8085b f21596a;

    /* renamed from: a */
    public Context mo31177a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo31178a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo31179a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m32281a(this, context);
    }

    /* renamed from: b */
    public void mo31180b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo31181c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m32279a(this, configuration);
    }

    public AssetManager getAssets() {
        return m32283c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m32280a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m32282b(this);
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
    public static Resources m32280a(DocSelectorActivity docSelectorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docSelectorActivity);
        }
        return docSelectorActivity.mo31178a();
    }

    /* renamed from: c */
    public static AssetManager m32283c(DocSelectorActivity docSelectorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docSelectorActivity);
        }
        return docSelectorActivity.mo31181c();
    }

    /* renamed from: b */
    public static void m32282b(DocSelectorActivity docSelectorActivity) {
        docSelectorActivity.mo31180b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DocSelectorActivity docSelectorActivity2 = docSelectorActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    docSelectorActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8085b bVar = new C8085b();
        this.f21596a = bVar;
        bVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f21596a).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m32281a(DocSelectorActivity docSelectorActivity, Context context) {
        docSelectorActivity.mo31179a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docSelectorActivity);
        }
    }

    /* renamed from: a */
    public static Context m32279a(DocSelectorActivity docSelectorActivity, Configuration configuration) {
        Context a = docSelectorActivity.mo31177a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C8085b bVar = this.f21596a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}

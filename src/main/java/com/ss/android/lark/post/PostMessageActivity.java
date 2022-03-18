package com.ss.android.lark.post;

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

public class PostMessageActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C52200c f129391a;

    /* renamed from: a */
    public Context mo178625a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo178626a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo178627a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m202293a(this, context);
    }

    /* renamed from: b */
    public void mo178628b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo178629c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m202291a(this, configuration);
    }

    public AssetManager getAssets() {
        return m202295c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m202292a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m202294b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        boolean z;
        C52200c cVar = this.f129391a;
        if (cVar != null) {
            z = cVar.mo178754a();
        } else {
            z = false;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public static Resources m202292a(PostMessageActivity postMessageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(postMessageActivity);
        }
        return postMessageActivity.mo178626a();
    }

    /* renamed from: c */
    public static AssetManager m202295c(PostMessageActivity postMessageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(postMessageActivity);
        }
        return postMessageActivity.mo178629c();
    }

    /* renamed from: b */
    public static void m202294b(PostMessageActivity postMessageActivity) {
        postMessageActivity.mo178628b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PostMessageActivity postMessageActivity2 = postMessageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    postMessageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C52200c cVar = new C52200c();
        this.f129391a = cVar;
        cVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f129391a).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m202293a(PostMessageActivity postMessageActivity, Context context) {
        postMessageActivity.mo178627a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(postMessageActivity);
        }
    }

    /* renamed from: a */
    public static Context m202291a(PostMessageActivity postMessageActivity, Configuration configuration) {
        Context a = postMessageActivity.mo178625a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C52200c cVar = this.f129391a;
        if (cVar != null) {
            cVar.onActivityResult(i, i2, intent);
        }
    }
}

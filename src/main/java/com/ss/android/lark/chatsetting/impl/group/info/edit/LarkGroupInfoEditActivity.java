package com.ss.android.lark.chatsetting.impl.group.info.edit;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LarkGroupInfoEditActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo127930a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo127931a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo127932a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134578a(this, context);
    }

    /* renamed from: b */
    public void mo127933b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo127934c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134576a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134581c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134577a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134580b(this);
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
    private void m134582d() {
        C34652e eVar = new C34652e();
        eVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, eVar, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m134577a(LarkGroupInfoEditActivity larkGroupInfoEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupInfoEditActivity);
        }
        return larkGroupInfoEditActivity.mo127931a();
    }

    /* renamed from: c */
    public static AssetManager m134581c(LarkGroupInfoEditActivity larkGroupInfoEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupInfoEditActivity);
        }
        return larkGroupInfoEditActivity.mo127934c();
    }

    /* renamed from: b */
    public static void m134580b(LarkGroupInfoEditActivity larkGroupInfoEditActivity) {
        larkGroupInfoEditActivity.mo127933b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LarkGroupInfoEditActivity larkGroupInfoEditActivity2 = larkGroupInfoEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    larkGroupInfoEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        if (!m134579a(getIntent().getExtras())) {
            Log.m165382e("open group info edit failed");
            finish();
            return;
        }
        m134582d();
    }

    /* renamed from: a */
    private boolean m134579a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("chatID") || !bundle.containsKey("edit_info_type")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m134578a(LarkGroupInfoEditActivity larkGroupInfoEditActivity, Context context) {
        larkGroupInfoEditActivity.mo127932a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupInfoEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m134576a(LarkGroupInfoEditActivity larkGroupInfoEditActivity, Configuration configuration) {
        Context a = larkGroupInfoEditActivity.mo127930a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

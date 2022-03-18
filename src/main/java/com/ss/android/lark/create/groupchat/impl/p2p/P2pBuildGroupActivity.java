package com.ss.android.lark.create.groupchat.impl.p2p;

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
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupExtraParams;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class P2pBuildGroupActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C36353c f93791a;

    /* renamed from: a */
    public Context mo134082a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo134083a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo134084a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m143208a(this, context);
    }

    /* renamed from: b */
    public void mo134085b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo134086c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m143206a(this, configuration);
    }

    public AssetManager getAssets() {
        return m143210c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m143207a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m143209b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C36353c cVar = this.f93791a;
        if (cVar != null) {
            cVar.mo134129a();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.getBoolean("key_specific_transition")) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(new int[]{extras.getInt("key_activity_enter_transition"), extras.getInt("key_activity_exit_transition")});
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        this.f93791a.onSaveInstanceState(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static Resources m143207a(P2pBuildGroupActivity p2pBuildGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(p2pBuildGroupActivity);
        }
        return p2pBuildGroupActivity.mo134083a();
    }

    /* renamed from: c */
    public static AssetManager m143210c(P2pBuildGroupActivity p2pBuildGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(p2pBuildGroupActivity);
        }
        return p2pBuildGroupActivity.mo134086c();
    }

    /* renamed from: b */
    public static void m143209b(P2pBuildGroupActivity p2pBuildGroupActivity) {
        p2pBuildGroupActivity.mo134085b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            P2pBuildGroupActivity p2pBuildGroupActivity2 = p2pBuildGroupActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    p2pBuildGroupActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f93791a = new C36353c();
        Bundle extras = getIntent().getExtras();
        if (bundle != null) {
            extras.putString("department_id", bundle.getString("department_id"));
            extras.putSerializable("selectedIds", bundle.getSerializable("selectedIds"));
            extras.putSerializable("requiredIds", bundle.getSerializable("requiredIds"));
        }
        this.f93791a.setArguments(extras);
        getSupportFragmentManager().beginTransaction().add(16908290, this.f93791a).commitAllowingStateLoss();
        CreateGroupHitPointNew.f93887a.mo134199a(true, false, false, true, false, (IParam) CreateGroupExtraParams.Source.FROM_P2P);
    }

    /* renamed from: a */
    public static void m143208a(P2pBuildGroupActivity p2pBuildGroupActivity, Context context) {
        p2pBuildGroupActivity.mo134084a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(p2pBuildGroupActivity);
        }
    }

    /* renamed from: a */
    public static Context m143206a(P2pBuildGroupActivity p2pBuildGroupActivity, Configuration configuration) {
        Context a = p2pBuildGroupActivity.mo134082a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C36353c cVar = this.f93791a;
        if (cVar != null) {
            cVar.onActivityResult(i, i2, intent);
        }
    }
}

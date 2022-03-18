package com.ss.android.lark.locationmessage.ui.picklocation;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.locationmessage.p2148a.C41588a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LocationActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C41671d f105781a;

    /* renamed from: a */
    public Context mo149785a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo149786a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo149787a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m165247a(this, context);
    }

    /* renamed from: b */
    public void mo149788b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo149789c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m165245a(this, configuration);
    }

    public AssetManager getAssets() {
        return m165249c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m165246a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m165248b(this);
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
    private String m165250d() {
        Intent intent = getIntent();
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("location_unique_key");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C41588a.m165047a(m165250d());
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C41671d dVar = this.f105781a;
        if (dVar != null || dVar.isActive()) {
            this.f105781a.mo149859a();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public static Resources m165246a(LocationActivity locationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(locationActivity);
        }
        return locationActivity.mo149786a();
    }

    /* renamed from: c */
    public static AssetManager m165249c(LocationActivity locationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(locationActivity);
        }
        return locationActivity.mo149789c();
    }

    /* renamed from: b */
    public static void m165248b(LocationActivity locationActivity) {
        locationActivity.mo149788b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LocationActivity locationActivity2 = locationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    locationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_location);
        this.f105781a = (C41671d) Fragment.instantiate(this, C41671d.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f105781a).commit();
    }

    /* renamed from: a */
    public static void m165247a(LocationActivity locationActivity, Context context) {
        locationActivity.mo149787a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(locationActivity);
        }
    }

    /* renamed from: a */
    public static Context m165245a(LocationActivity locationActivity, Configuration configuration) {
        Context a = locationActivity.mo149785a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C41671d dVar = this.f105781a;
        if (dVar != null) {
            dVar.onActivityResult(i, i2, intent);
        }
    }
}

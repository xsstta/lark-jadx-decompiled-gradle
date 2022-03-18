package com.ss.android.lark.calendar.impl.features.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class CalendarSettingActivity extends CalendarBaseActivity {

    /* renamed from: a */
    private CalendarSettingFragment f82943a;

    /* renamed from: a */
    public Context mo118258a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo118259a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo118260a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m123582a(this, context);
    }

    /* renamed from: b */
    public void mo118261b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo118262c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m123580a(this, configuration);
    }

    public AssetManager getAssets() {
        return m123584c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m123581a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m123583b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        CalendarSettingFragment aVar = this.f82943a;
        if (aVar != null) {
            aVar.mo118366a();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (getIntent().getBooleanExtra("calendar_setting_is_launched_by_system_setting", false)) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (getIntent().getBooleanExtra("calendar_setting_is_launched_by_system_setting", false)) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_OUT);
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(new Bundle());
    }

    /* renamed from: a */
    public static Resources m123581a(CalendarSettingActivity calendarSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSettingActivity);
        }
        return calendarSettingActivity.mo118259a();
    }

    /* renamed from: c */
    public static AssetManager m123584c(CalendarSettingActivity calendarSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSettingActivity);
        }
        return calendarSettingActivity.mo118262c();
    }

    /* renamed from: b */
    public static void m123583b(CalendarSettingActivity calendarSettingActivity) {
        calendarSettingActivity.mo118261b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarSettingActivity calendarSettingActivity2 = calendarSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CalendarSettingFragment aVar = new CalendarSettingFragment();
        this.f82943a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f82943a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
        CalendarSettingHitPoint.m124367a();
        setStatusBarColorResource(R.color.bg_base);
    }

    /* renamed from: a */
    public static void m123582a(CalendarSettingActivity calendarSettingActivity, Context context) {
        calendarSettingActivity.mo118260a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m123580a(CalendarSettingActivity calendarSettingActivity, Configuration configuration) {
        Context a = calendarSettingActivity.mo118258a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CalendarSettingFragment aVar = this.f82943a;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}

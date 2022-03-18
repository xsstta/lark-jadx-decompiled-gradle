package com.ss.android.lark.create.groupchat.impl.type;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class GroupTypeSelectorActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C36400a f93893a;

    /* renamed from: a */
    public Context mo134225a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo134226a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo134227a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m143494a(this, context);
    }

    /* renamed from: b */
    public void mo134228b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo134229c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m143492a(this, configuration);
    }

    public AssetManager getAssets() {
        return m143496c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m143493a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m143495b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C36400a aVar = this.f93893a;
        if (aVar == null || !aVar.mo134232a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public static Resources m143493a(GroupTypeSelectorActivity groupTypeSelectorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupTypeSelectorActivity);
        }
        return groupTypeSelectorActivity.mo134226a();
    }

    /* renamed from: c */
    public static AssetManager m143496c(GroupTypeSelectorActivity groupTypeSelectorActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupTypeSelectorActivity);
        }
        return groupTypeSelectorActivity.mo134229c();
    }

    /* renamed from: b */
    public static void m143495b(GroupTypeSelectorActivity groupTypeSelectorActivity) {
        groupTypeSelectorActivity.mo134228b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupTypeSelectorActivity groupTypeSelectorActivity2 = groupTypeSelectorActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupTypeSelectorActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36400a aVar = new C36400a();
        this.f93893a = aVar;
        aVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f93893a, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m143494a(GroupTypeSelectorActivity groupTypeSelectorActivity, Context context) {
        groupTypeSelectorActivity.mo134227a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupTypeSelectorActivity);
        }
    }

    /* renamed from: a */
    public static Context m143492a(GroupTypeSelectorActivity groupTypeSelectorActivity, Configuration configuration) {
        Context a = groupTypeSelectorActivity.mo134225a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

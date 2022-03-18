package com.ss.android.lark.profile.func.group_profile;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class GroupProfileActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private BaseFragment f129690a;

    /* renamed from: b */
    private boolean f129691b;

    /* renamed from: a */
    public Context mo179129a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179130a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179131a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m202918a(this, context);
    }

    /* renamed from: b */
    public void mo179132b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179133c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m202916a(this, configuration);
    }

    public AssetManager getAssets() {
        return m202920c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m202917a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m202919b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (this.f129691b) {
            BaseFragment baseFragment = this.f129690a;
            if (baseFragment instanceof GroupProfileFragmentV2) {
                ((GroupProfileFragmentV2) baseFragment).mo179146d();
                return;
            }
        }
        super.onBackPressed();
    }

    /* renamed from: d */
    private void m202921d() {
        C52299a aVar = new C52299a();
        this.f129690a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f129690a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: e */
    private void m202922e() {
        GroupProfileFragmentV2 bVar = new GroupProfileFragmentV2();
        this.f129690a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f129690a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m202917a(GroupProfileActivity groupProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupProfileActivity);
        }
        return groupProfileActivity.mo179130a();
    }

    /* renamed from: c */
    public static AssetManager m202920c(GroupProfileActivity groupProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupProfileActivity);
        }
        return groupProfileActivity.mo179133c();
    }

    /* renamed from: b */
    public static void m202919b(GroupProfileActivity groupProfileActivity) {
        groupProfileActivity.mo179132b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupProfileActivity groupProfileActivity2 = groupProfileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupProfileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().getBooleanExtra("params_education_group", false)) {
            this.f129691b = false;
            m202921d();
        } else if (C52239a.m202617d().mo133561a("im.chat.group_card_chore")) {
            this.f129691b = true;
            m202922e();
        } else {
            this.f129691b = false;
            m202921d();
        }
    }

    /* renamed from: a */
    public static void m202918a(GroupProfileActivity groupProfileActivity, Context context) {
        groupProfileActivity.mo179131a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupProfileActivity);
        }
    }

    /* renamed from: a */
    public static Context m202916a(GroupProfileActivity groupProfileActivity, Configuration configuration) {
        Context a = groupProfileActivity.mo179129a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

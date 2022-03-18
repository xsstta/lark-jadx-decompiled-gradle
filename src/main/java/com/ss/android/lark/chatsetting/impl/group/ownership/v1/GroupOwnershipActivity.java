package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

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
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class GroupOwnershipActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C34834b f89939a;

    /* renamed from: a */
    public Context mo128522a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128523a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128524a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135364a(this, context);
    }

    /* renamed from: b */
    public void mo128525b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128526c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135362a(this, configuration);
    }

    public AssetManager getAssets() {
        return m135366c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135363a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135365b(this);
    }

    /* renamed from: d */
    private void m135367d() {
        C34834b bVar = new C34834b();
        this.f89939a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f89939a, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m135367d();
    }

    /* renamed from: a */
    public static Resources m135363a(GroupOwnershipActivity groupOwnershipActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupOwnershipActivity);
        }
        return groupOwnershipActivity.mo128523a();
    }

    /* renamed from: c */
    public static AssetManager m135366c(GroupOwnershipActivity groupOwnershipActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupOwnershipActivity);
        }
        return groupOwnershipActivity.mo128526c();
    }

    /* renamed from: b */
    public static void m135365b(GroupOwnershipActivity groupOwnershipActivity) {
        groupOwnershipActivity.mo128525b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupOwnershipActivity groupOwnershipActivity2 = groupOwnershipActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupOwnershipActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m135364a(GroupOwnershipActivity groupOwnershipActivity, Context context) {
        groupOwnershipActivity.mo128524a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupOwnershipActivity);
        }
    }

    /* renamed from: a */
    public static Context m135362a(GroupOwnershipActivity groupOwnershipActivity, Configuration configuration) {
        Context a = groupOwnershipActivity.mo128522a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C34834b bVar = this.f89939a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}

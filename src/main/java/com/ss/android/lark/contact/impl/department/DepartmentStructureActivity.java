package com.ss.android.lark.contact.impl.department;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DepartmentStructureActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C35804a f92530a;

    /* renamed from: a */
    public Context mo131704a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131705a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131706a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m140083a(this, context);
    }

    /* renamed from: b */
    public void mo131707b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131708c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m140081a(this, configuration);
    }

    public AssetManager getAssets() {
        return m140085c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m140082a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m140084b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f92530a.mo131736a();
    }

    /* renamed from: d */
    private void m140086d() {
        C35804a aVar = new C35804a();
        this.f92530a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f92530a, "DepartmentStructureFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m140086d();
    }

    /* renamed from: a */
    public static Resources m140082a(DepartmentStructureActivity departmentStructureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(departmentStructureActivity);
        }
        return departmentStructureActivity.mo131705a();
    }

    /* renamed from: c */
    public static AssetManager m140085c(DepartmentStructureActivity departmentStructureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(departmentStructureActivity);
        }
        return departmentStructureActivity.mo131708c();
    }

    /* renamed from: b */
    public static void m140084b(DepartmentStructureActivity departmentStructureActivity) {
        departmentStructureActivity.mo131707b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DepartmentStructureActivity departmentStructureActivity2 = departmentStructureActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    departmentStructureActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m140083a(DepartmentStructureActivity departmentStructureActivity, Context context) {
        departmentStructureActivity.mo131706a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(departmentStructureActivity);
        }
    }

    /* renamed from: a */
    public static Context m140081a(DepartmentStructureActivity departmentStructureActivity, Configuration configuration) {
        Context a = departmentStructureActivity.mo131704a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

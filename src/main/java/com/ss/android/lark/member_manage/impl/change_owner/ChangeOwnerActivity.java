package com.ss.android.lark.member_manage.impl.change_owner;

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

public class ChangeOwnerActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo159574a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159575a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159576a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m178970a(this, context);
    }

    /* renamed from: b */
    public void mo159577b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159578c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m178968a(this, configuration);
    }

    public AssetManager getAssets() {
        return m178972c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m178969a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m178971b(this);
    }

    /* renamed from: a */
    public static Resources m178969a(ChangeOwnerActivity changeOwnerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(changeOwnerActivity);
        }
        return changeOwnerActivity.mo159575a();
    }

    /* renamed from: c */
    public static AssetManager m178972c(ChangeOwnerActivity changeOwnerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(changeOwnerActivity);
        }
        return changeOwnerActivity.mo159578c();
    }

    /* renamed from: b */
    public static void m178971b(ChangeOwnerActivity changeOwnerActivity) {
        changeOwnerActivity.mo159577b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChangeOwnerActivity changeOwnerActivity2 = changeOwnerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    changeOwnerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45099b bVar = new C45099b();
        bVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, bVar, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m178970a(ChangeOwnerActivity changeOwnerActivity, Context context) {
        changeOwnerActivity.mo159576a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(changeOwnerActivity);
        }
    }

    /* renamed from: a */
    public static Context m178968a(ChangeOwnerActivity changeOwnerActivity, Configuration configuration) {
        Context a = changeOwnerActivity.mo159574a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

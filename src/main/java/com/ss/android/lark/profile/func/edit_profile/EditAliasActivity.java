package com.ss.android.lark.profile.func.edit_profile;

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

public class EditAliasActivity extends BaseFragmentActivity {

    /* renamed from: a */
    EditAliasFragment f129642a;

    /* renamed from: a */
    public Context mo179077a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179078a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179079a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m202843a(this, context);
    }

    /* renamed from: b */
    public void mo179080b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179081c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m202841a(this, configuration);
    }

    public AssetManager getAssets() {
        return m202845c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m202842a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m202844b(this);
    }

    /* renamed from: a */
    public static Resources m202842a(EditAliasActivity editAliasActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAliasActivity);
        }
        return editAliasActivity.mo179078a();
    }

    /* renamed from: c */
    public static AssetManager m202845c(EditAliasActivity editAliasActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAliasActivity);
        }
        return editAliasActivity.mo179081c();
    }

    /* renamed from: b */
    public static void m202844b(EditAliasActivity editAliasActivity) {
        editAliasActivity.mo179080b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EditAliasActivity editAliasActivity2 = editAliasActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    editAliasActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EditAliasFragment editAliasFragment = new EditAliasFragment();
        this.f129642a = editAliasFragment;
        editAliasFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f129642a).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m202843a(EditAliasActivity editAliasActivity, Context context) {
        editAliasActivity.mo179079a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAliasActivity);
        }
    }

    /* renamed from: a */
    public static Context m202841a(EditAliasActivity editAliasActivity, Configuration configuration) {
        Context a = editAliasActivity.mo179077a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

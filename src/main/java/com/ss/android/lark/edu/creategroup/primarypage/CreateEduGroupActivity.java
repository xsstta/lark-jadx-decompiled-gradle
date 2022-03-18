package com.ss.android.lark.edu.creategroup.primarypage;

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

public class CreateEduGroupActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo136326a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo136327a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo136328a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m145798a(this, context);
    }

    /* renamed from: b */
    public void mo136329b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo136330c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m145796a(this, configuration);
    }

    public AssetManager getAssets() {
        return m145800c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m145797a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m145799b(this);
    }

    /* renamed from: d */
    private void m145801d() {
        CreateEduGroupFragment bVar = new CreateEduGroupFragment();
        bVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(16908290, bVar).commit();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m145801d();
    }

    /* renamed from: a */
    public static Resources m145797a(CreateEduGroupActivity createEduGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createEduGroupActivity);
        }
        return createEduGroupActivity.mo136327a();
    }

    /* renamed from: c */
    public static AssetManager m145800c(CreateEduGroupActivity createEduGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createEduGroupActivity);
        }
        return createEduGroupActivity.mo136330c();
    }

    /* renamed from: b */
    public static void m145799b(CreateEduGroupActivity createEduGroupActivity) {
        createEduGroupActivity.mo136329b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CreateEduGroupActivity createEduGroupActivity2 = createEduGroupActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    createEduGroupActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m145798a(CreateEduGroupActivity createEduGroupActivity, Context context) {
        createEduGroupActivity.mo136328a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createEduGroupActivity);
        }
    }

    /* renamed from: a */
    public static Context m145796a(CreateEduGroupActivity createEduGroupActivity, Configuration configuration) {
        Context a = createEduGroupActivity.mo136326a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

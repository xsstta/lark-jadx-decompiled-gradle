package com.bytedance.ee.bear.document;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/DefaultRouteActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "onDoCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DefaultRouteActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo22300a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo22301a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo22302a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m22631a(this, context);
    }

    /* renamed from: b */
    public void mo22303b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo22304c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m22629a(this, configuration);
    }

    public AssetManager getAssets() {
        return m22633c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m22630a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m22632b(this);
    }

    /* renamed from: a */
    public static Resources m22630a(DefaultRouteActivity defaultRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(defaultRouteActivity);
        }
        return defaultRouteActivity.mo22301a();
    }

    /* renamed from: c */
    public static AssetManager m22633c(DefaultRouteActivity defaultRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(defaultRouteActivity);
        }
        return defaultRouteActivity.mo22304c();
    }

    /* renamed from: b */
    public static void m22632b(DefaultRouteActivity defaultRouteActivity) {
        defaultRouteActivity.mo22303b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DefaultRouteActivity defaultRouteActivity2 = defaultRouteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    defaultRouteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.error_info_full_screen);
    }

    /* renamed from: a */
    public static void m22631a(DefaultRouteActivity defaultRouteActivity, Context context) {
        defaultRouteActivity.mo22302a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(defaultRouteActivity);
        }
    }

    /* renamed from: a */
    public static Context m22629a(DefaultRouteActivity defaultRouteActivity, Configuration configuration) {
        Context a = defaultRouteActivity.mo22300a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

package com.ss.android.lark.main.app;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.AppActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/app/DefaultDualActivity;", "Lcom/ss/android/lark/base/activity/AppActivity;", "()V", "mLKUIStatus", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class DefaultDualActivity extends AppActivity {

    /* renamed from: a */
    private LKUIStatus f112088a;

    /* renamed from: a */
    public Context mo157142a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo157143a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m175265a(this, context);
    }

    /* renamed from: b */
    public Resources mo157144b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo157145c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m175263a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo157147d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m175267c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m175264a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m175266b(this);
    }

    /* renamed from: a */
    public static Resources m175264a(DefaultDualActivity defaultDualActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(defaultDualActivity);
        }
        return defaultDualActivity.mo157144b();
    }

    /* renamed from: c */
    public static AssetManager m175267c(DefaultDualActivity defaultDualActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(defaultDualActivity);
        }
        return defaultDualActivity.mo157147d();
    }

    /* renamed from: b */
    public static void m175266b(DefaultDualActivity defaultDualActivity) {
        defaultDualActivity.mo157145c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DefaultDualActivity defaultDualActivity2 = defaultDualActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    defaultDualActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.default_dual_layout);
        DualActivityManager.f112116a.mo157168a(new WeakReference<>(this));
        LKUIStatus a = new LKUIStatus.C25680a((FrameLayout) findViewById(R.id.empty_layout)).mo89862c(R.drawable.empty_default_icon).mo89855a(0.4d).mo89863c(UIHelper.getString(R.string.Lark_Core_NothingSelectedEmptyState)).mo89859a();
        this.f112088a = a;
        if (a != null) {
            a.mo89845c();
        }
    }

    /* renamed from: a */
    public static void m175265a(DefaultDualActivity defaultDualActivity, Context context) {
        defaultDualActivity.mo157143a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(defaultDualActivity);
        }
    }

    /* renamed from: a */
    public static Context m175263a(DefaultDualActivity defaultDualActivity, Configuration configuration) {
        Context a = defaultDualActivity.mo157142a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

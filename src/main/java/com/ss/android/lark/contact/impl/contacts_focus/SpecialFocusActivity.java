package com.ss.android.lark.contact.impl.contacts_focus;

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
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_focus/SpecialFocusActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpecialFocusActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo131204a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131205a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131206a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m139291a(this, context);
    }

    /* renamed from: b */
    public void mo131207b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131208c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m139289a(this, configuration);
    }

    public AssetManager getAssets() {
        return m139293c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m139290a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m139292b(this);
    }

    /* renamed from: a */
    public static Resources m139290a(SpecialFocusActivity specialFocusActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specialFocusActivity);
        }
        return specialFocusActivity.mo131205a();
    }

    /* renamed from: c */
    public static AssetManager m139293c(SpecialFocusActivity specialFocusActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specialFocusActivity);
        }
        return specialFocusActivity.mo131208c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportFragmentManager().beginTransaction().add(16908290, new SpecialFocusFragment(), "SpecialFocusFragment").commitNowAllowingStateLoss();
    }

    /* renamed from: b */
    public static void m139292b(SpecialFocusActivity specialFocusActivity) {
        specialFocusActivity.mo131207b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SpecialFocusActivity specialFocusActivity2 = specialFocusActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    specialFocusActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139291a(SpecialFocusActivity specialFocusActivity, Context context) {
        specialFocusActivity.mo131206a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specialFocusActivity);
        }
    }

    /* renamed from: a */
    public static Context m139289a(SpecialFocusActivity specialFocusActivity, Configuration configuration) {
        Context a = specialFocusActivity.mo131204a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

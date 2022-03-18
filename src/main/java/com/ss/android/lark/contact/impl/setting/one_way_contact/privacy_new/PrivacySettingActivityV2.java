package com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingActivityV2;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacySettingActivityV2 extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo132548a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132549a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132550a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m141355a(this, context);
    }

    /* renamed from: b */
    public void mo132551b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132552c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m141353a(this, configuration);
    }

    public AssetManager getAssets() {
        return m141357c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m141354a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m141356b(this);
    }

    /* renamed from: d */
    private final void m141358d() {
        PrivacySettingFragmentV2 bVar = new PrivacySettingFragmentV2();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        bVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, bVar, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m141358d();
    }

    /* renamed from: a */
    public static Resources m141354a(PrivacySettingActivityV2 privacySettingActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacySettingActivityV2);
        }
        return privacySettingActivityV2.mo132549a();
    }

    /* renamed from: c */
    public static AssetManager m141357c(PrivacySettingActivityV2 privacySettingActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacySettingActivityV2);
        }
        return privacySettingActivityV2.mo132552c();
    }

    /* renamed from: b */
    public static void m141356b(PrivacySettingActivityV2 privacySettingActivityV2) {
        privacySettingActivityV2.mo132551b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PrivacySettingActivityV2 privacySettingActivityV22 = privacySettingActivityV2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    privacySettingActivityV22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m141355a(PrivacySettingActivityV2 privacySettingActivityV2, Context context) {
        privacySettingActivityV2.mo132550a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacySettingActivityV2);
        }
    }

    /* renamed from: a */
    public static Context m141353a(PrivacySettingActivityV2 privacySettingActivityV2, Configuration configuration) {
        Context a = privacySettingActivityV2.mo132548a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

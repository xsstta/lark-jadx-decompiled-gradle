package com.ss.android.lark.profile.func.medal.detail;

import android.content.Context;
import android.content.Intent;
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MedalDetailActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo179262a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179263a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179264a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m203088a(this, context);
    }

    /* renamed from: b */
    public void mo179265b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179266c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m203086a(this, configuration);
    }

    public AssetManager getAssets() {
        return m203090c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m203087a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m203089b(this);
    }

    /* renamed from: d */
    private final void m203091d() {
        MedalDetailFragment aVar = new MedalDetailFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, aVar, "MedalDetailFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m203091d();
    }

    /* renamed from: a */
    public static Resources m203087a(MedalDetailActivity medalDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(medalDetailActivity);
        }
        return medalDetailActivity.mo179263a();
    }

    /* renamed from: c */
    public static AssetManager m203090c(MedalDetailActivity medalDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(medalDetailActivity);
        }
        return medalDetailActivity.mo179266c();
    }

    /* renamed from: b */
    public static void m203089b(MedalDetailActivity medalDetailActivity) {
        medalDetailActivity.mo179265b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MedalDetailActivity medalDetailActivity2 = medalDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    medalDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m203088a(MedalDetailActivity medalDetailActivity, Context context) {
        medalDetailActivity.mo179264a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(medalDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m203086a(MedalDetailActivity medalDetailActivity, Configuration configuration) {
        Context a = medalDetailActivity.mo179262a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

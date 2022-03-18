package com.ss.android.lark.setting.page.content.general.feedfilter;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterActivityV2;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "initFragment", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedMessageFilterActivityV2 extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo186168a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186169a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186170a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211361a(this, context);
    }

    /* renamed from: b */
    public void mo186171b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186172c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211359a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211363c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211360a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211362b(this);
    }

    /* renamed from: d */
    private final void m211364d() {
        FeedMessageFilterFragment feedMessageFilterFragment = new FeedMessageFilterFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        feedMessageFilterFragment.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, feedMessageFilterFragment, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m211364d();
    }

    /* renamed from: a */
    public static Resources m211360a(FeedMessageFilterActivityV2 feedMessageFilterActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(feedMessageFilterActivityV2);
        }
        return feedMessageFilterActivityV2.mo186169a();
    }

    /* renamed from: c */
    public static AssetManager m211363c(FeedMessageFilterActivityV2 feedMessageFilterActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(feedMessageFilterActivityV2);
        }
        return feedMessageFilterActivityV2.mo186172c();
    }

    /* renamed from: b */
    public static void m211362b(FeedMessageFilterActivityV2 feedMessageFilterActivityV2) {
        feedMessageFilterActivityV2.mo186171b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FeedMessageFilterActivityV2 feedMessageFilterActivityV22 = feedMessageFilterActivityV2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    feedMessageFilterActivityV22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m211361a(FeedMessageFilterActivityV2 feedMessageFilterActivityV2, Context context) {
        feedMessageFilterActivityV2.mo186170a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(feedMessageFilterActivityV2);
        }
    }

    /* renamed from: a */
    public static Context m211359a(FeedMessageFilterActivityV2 feedMessageFilterActivityV2, Configuration configuration) {
        Context a = feedMessageFilterActivityV2.mo186168a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

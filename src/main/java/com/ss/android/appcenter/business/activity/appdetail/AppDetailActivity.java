package com.ss.android.appcenter.business.activity.appdetail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.appcenter.common.base.BaseActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AppDetailActivity extends BaseActivity {

    /* renamed from: a */
    private C27626a f68919a;

    /* renamed from: a */
    public Context mo98406a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo98268a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo98407a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m100821a(this, context);
    }

    /* renamed from: b */
    public void mo98408b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo98409c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m100816a(this, configuration);
    }

    public AssetManager getAssets() {
        return m100823c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m100817a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m100822b(this);
    }

    /* renamed from: d */
    private void m100824d() {
        C27626a aVar = new C27626a();
        this.f68919a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f68919a, "AppDetailFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m100824d();
    }

    /* renamed from: a */
    public static Resources m100817a(AppDetailActivity appDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appDetailActivity);
        }
        return appDetailActivity.mo98268a();
    }

    /* renamed from: c */
    public static AssetManager m100823c(AppDetailActivity appDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appDetailActivity);
        }
        return appDetailActivity.mo98409c();
    }

    /* renamed from: b */
    public static void m100822b(AppDetailActivity appDetailActivity) {
        appDetailActivity.mo98408b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppDetailActivity appDetailActivity2 = appDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m100821a(AppDetailActivity appDetailActivity, Context context) {
        appDetailActivity.mo98407a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m100816a(AppDetailActivity appDetailActivity, Configuration configuration) {
        Context a = appDetailActivity.mo98406a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m100819a(Context context, String str, boolean z) {
        m100820a(context, str, z, null, null);
    }

    /* renamed from: a */
    public static void m100818a(Context context, String str, String str2, boolean z) {
        if (context != null) {
            Intent intent = new Intent(context, AppDetailActivity.class);
            intent.putExtra("id", str);
            intent.putExtra("is_app", false);
            intent.putExtra("chat_id", str2);
            intent.putExtra("added_to_group", z);
            intent.putExtra("from_add_group_bot", true);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m100820a(Context context, String str, boolean z, String str2, String str3) {
        if (context != null) {
            Intent intent = new Intent(context, AppDetailActivity.class);
            intent.putExtra("id", str);
            intent.putExtra("is_app", z);
            intent.putExtra("inviter_name", str2);
            intent.putExtra("inviter_chat_id", str3);
            context.startActivity(intent);
        }
    }
}

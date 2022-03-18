package com.ss.lark.android.passport.biz.feature.session;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class TransparentBringAppToFrontActivity extends BaseActivity implements IWatermarkable {
    /* renamed from: a */
    public Context mo223955a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254995a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: b */
    public void mo223956b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public boolean cA_() {
        return false;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254992a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: f */
    public boolean mo171133f() {
        return true;
    }

    public AssetManager getAssets() {
        return m254997c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254993a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254996b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new View(this));
    }

    /* renamed from: a */
    public static Resources m254993a(TransparentBringAppToFrontActivity transparentBringAppToFrontActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transparentBringAppToFrontActivity);
        }
        return transparentBringAppToFrontActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m254997c(TransparentBringAppToFrontActivity transparentBringAppToFrontActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transparentBringAppToFrontActivity);
        }
        return transparentBringAppToFrontActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m254996b(TransparentBringAppToFrontActivity transparentBringAppToFrontActivity) {
        transparentBringAppToFrontActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TransparentBringAppToFrontActivity transparentBringAppToFrontActivity2 = transparentBringAppToFrontActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    transparentBringAppToFrontActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254994a(Context context) {
        if (!ServiceFinder.m193748c().isAppForeground()) {
            Intent intent = new Intent(context, TransparentBringAppToFrontActivity.class);
            intent.addFlags(65536);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m254995a(TransparentBringAppToFrontActivity transparentBringAppToFrontActivity, Context context) {
        transparentBringAppToFrontActivity.mo223956b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(transparentBringAppToFrontActivity);
        }
    }

    /* renamed from: a */
    public static Context m254992a(TransparentBringAppToFrontActivity transparentBringAppToFrontActivity, Configuration configuration) {
        Context a = transparentBringAppToFrontActivity.mo223955a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

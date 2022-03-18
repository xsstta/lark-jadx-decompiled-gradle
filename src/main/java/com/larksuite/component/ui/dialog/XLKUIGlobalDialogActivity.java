package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vcxp.C63801c;
import java.lang.ref.WeakReference;

public class XLKUIGlobalDialogActivity extends BaseActivity implements IWatermarkable {

    /* renamed from: b */
    private static WeakReference<C25648u> f62572b = new WeakReference<>(null);

    /* renamed from: a */
    public Context mo89193a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo89194a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo89195a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m91734a(this, context);
    }

    /* renamed from: b */
    public void mo89196b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo89197c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m91732a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return false;
    }

    public AssetManager getAssets() {
        return m91737c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m91733a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m91736b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m91738d() {
        super.finish();
    }

    public void finish() {
        C26171w.m94676a(new Runnable() {
            /* class com.larksuite.component.ui.dialog.$$Lambda$XLKUIGlobalDialogActivity$TzUwqbaxibVk2AfIAbrrev4cdhc */

            public final void run() {
                XLKUIGlobalDialogActivity.lambda$TzUwqbaxibVk2AfIAbrrev4cdhc(XLKUIGlobalDialogActivity.this);
            }
        }, 400);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        if (f62572b.get() != null) {
            f62572b.get().mo89296b(null);
            f62572b.get().f62617d = null;
            f62572b.get().f62616c = false;
        }
    }

    /* renamed from: a */
    public static void m91735a(C25648u uVar) {
        f62572b = new WeakReference<>(uVar);
    }

    /* renamed from: a */
    public static Resources m91733a(XLKUIGlobalDialogActivity xLKUIGlobalDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xLKUIGlobalDialogActivity);
        }
        return xLKUIGlobalDialogActivity.mo89194a();
    }

    /* renamed from: c */
    public static AssetManager m91737c(XLKUIGlobalDialogActivity xLKUIGlobalDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xLKUIGlobalDialogActivity);
        }
        return xLKUIGlobalDialogActivity.mo89197c();
    }

    /* renamed from: b */
    public static void m91736b(XLKUIGlobalDialogActivity xLKUIGlobalDialogActivity) {
        xLKUIGlobalDialogActivity.mo89196b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            XLKUIGlobalDialogActivity xLKUIGlobalDialogActivity2 = xLKUIGlobalDialogActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    xLKUIGlobalDialogActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        if (!C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        getWindow().addFlags(67108864);
        if (f62572b.get() == null || f62572b.get().f62614a == null) {
            finish();
            return;
        }
        C25639g gVar = f62572b.get().f62614a;
        gVar.f62583b = this;
        DialogC25637f c = gVar.mo89239c();
        f62572b.get().mo89296b(this);
        f62572b.get().f62617d = c;
        f62572b.get().f62616c = true;
        c.mo89218a(this);
    }

    /* renamed from: a */
    public static void m91734a(XLKUIGlobalDialogActivity xLKUIGlobalDialogActivity, Context context) {
        xLKUIGlobalDialogActivity.mo89195a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xLKUIGlobalDialogActivity);
        }
    }

    /* renamed from: a */
    public static Context m91732a(XLKUIGlobalDialogActivity xLKUIGlobalDialogActivity, Configuration configuration) {
        Context a = xLKUIGlobalDialogActivity.mo89193a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

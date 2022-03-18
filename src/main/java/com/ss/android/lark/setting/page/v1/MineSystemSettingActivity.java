package com.ss.android.lark.setting.page.v1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.v1.mvp.C54571b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MineSystemSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C54571b f134852a;

    /* renamed from: a */
    public Context mo186414a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186415a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186416a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211641a(this, context);
    }

    /* renamed from: b */
    public void mo186417b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186418c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211639a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211643c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211640a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211642b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m211645e() {
        try {
            C54115c.m210080a().mo178299k().mo178320a(this);
        } catch (Throwable th) {
            Log.m165383e("MineSystemSettingActivity", "warmUpP0Process: " + th.getMessage());
        }
    }

    /* renamed from: d */
    private void m211644d() {
        C54571b bVar = new C54571b();
        this.f134852a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f134852a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
        if (C54115c.m210080a().mo178291e().mo178337a("android.setting.warm.up.p0")) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.v1.$$Lambda$MineSystemSettingActivity$ME_a3NixOHPCFku1xvhdAGt53vA */

                public final void run() {
                    MineSystemSettingActivity.lambda$ME_a3NixOHPCFku1xvhdAGt53vA(MineSystemSettingActivity.this);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m211644d();
    }

    /* renamed from: a */
    public static Resources m211640a(MineSystemSettingActivity mineSystemSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineSystemSettingActivity);
        }
        return mineSystemSettingActivity.mo186415a();
    }

    /* renamed from: c */
    public static AssetManager m211643c(MineSystemSettingActivity mineSystemSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineSystemSettingActivity);
        }
        return mineSystemSettingActivity.mo186418c();
    }

    /* renamed from: b */
    public static void m211642b(MineSystemSettingActivity mineSystemSettingActivity) {
        mineSystemSettingActivity.mo186417b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MineSystemSettingActivity mineSystemSettingActivity2 = mineSystemSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mineSystemSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m211641a(MineSystemSettingActivity mineSystemSettingActivity, Context context) {
        mineSystemSettingActivity.mo186416a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineSystemSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m211639a(MineSystemSettingActivity mineSystemSettingActivity, Configuration configuration) {
        Context a = mineSystemSettingActivity.mo186414a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

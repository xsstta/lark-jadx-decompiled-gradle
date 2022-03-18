package com.ss.android.lark.setting.page.v2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MineSystemSettingActivityV2 extends BaseFragmentActivity {

    /* renamed from: a */
    C54595b f134912a;

    /* renamed from: a */
    public Context mo186494a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186495a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186496a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211771a(this, context);
    }

    /* renamed from: b */
    public void mo186497b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186498c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211769a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211773c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211770a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211772b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m211775e() {
        try {
            C54115c.m210080a().mo178299k().mo178320a(this);
        } catch (Throwable th) {
            Log.m165383e("MineSystemSettingActivityV2", "warmUpP0Process: " + th.getMessage());
        }
    }

    /* renamed from: d */
    private void m211774d() {
        C54595b bVar = new C54595b();
        this.f134912a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f134912a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
        if (C54115c.m210080a().mo178291e().mo178337a("android.setting.warm.up.p0")) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.setting.page.v2.$$Lambda$MineSystemSettingActivityV2$g_Sdb1VC8o_vd5iLyyXazVFuhM */

                public final void run() {
                    MineSystemSettingActivityV2.this.m211775e();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m211774d();
    }

    /* renamed from: a */
    public static Resources m211770a(MineSystemSettingActivityV2 mineSystemSettingActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineSystemSettingActivityV2);
        }
        return mineSystemSettingActivityV2.mo186495a();
    }

    /* renamed from: c */
    public static AssetManager m211773c(MineSystemSettingActivityV2 mineSystemSettingActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineSystemSettingActivityV2);
        }
        return mineSystemSettingActivityV2.mo186498c();
    }

    /* renamed from: b */
    public static void m211772b(MineSystemSettingActivityV2 mineSystemSettingActivityV2) {
        mineSystemSettingActivityV2.mo186497b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MineSystemSettingActivityV2 mineSystemSettingActivityV22 = mineSystemSettingActivityV2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mineSystemSettingActivityV22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m211771a(MineSystemSettingActivityV2 mineSystemSettingActivityV2, Context context) {
        mineSystemSettingActivityV2.mo186496a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineSystemSettingActivityV2);
        }
    }

    /* renamed from: a */
    public static Context m211769a(MineSystemSettingActivityV2 mineSystemSettingActivityV2, Configuration configuration) {
        Context a = mineSystemSettingActivityV2.mo186494a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

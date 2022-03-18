package com.ss.android.lark.upgrade.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26310o;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.File;

public class InstallApkActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private File f141995a;

    /* renamed from: a */
    public Context mo195681a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo195682a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo195683a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m223765a(this, context);
    }

    /* renamed from: b */
    public void mo195684b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo195685c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m223762a(this, configuration);
    }

    public AssetManager getAssets() {
        return m223768c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m223764a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m223767b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    /* renamed from: d */
    private boolean m223769d() {
        if (getIntent().getExtras() == null) {
            return false;
        }
        String stringExtra = getIntent().getStringExtra("extra.file.path");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        File file = new File(stringExtra);
        this.f141995a = file;
        if (!file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static AssetManager m223768c(InstallApkActivity installApkActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(installApkActivity);
        }
        return installApkActivity.mo195685c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m223769d()) {
            finish();
        } else {
            m223766b(this, this.f141995a);
        }
    }

    /* renamed from: b */
    public static void m223767b(InstallApkActivity installApkActivity) {
        installApkActivity.mo195684b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InstallApkActivity installApkActivity2 = installApkActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    installApkActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static Resources m223764a(InstallApkActivity installApkActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(installApkActivity);
        }
        return installApkActivity.mo195682a();
    }

    /* renamed from: a */
    public static void m223765a(InstallApkActivity installApkActivity, Context context) {
        installApkActivity.mo195683a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(installApkActivity);
        }
    }

    /* renamed from: a */
    public static Intent m223763a(Context context, File file) {
        Intent intent = new Intent(context, InstallApkActivity.class);
        intent.putExtra("extra.file.path", file.getPath());
        return intent;
    }

    /* renamed from: a */
    public static Context m223762a(InstallApkActivity installApkActivity, Configuration configuration) {
        Context a = installApkActivity.mo195681a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: b */
    private void m223766b(Context context, File file) {
        if (C26311p.m95275a(context)) {
            try {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                C26310o.m95260a(context, intent, "application/vnd.android.package-archive", file, true);
                context.startActivity(intent);
            } catch (Exception e) {
                Log.m165386e("installApkFile Error", e);
                if (context != null) {
                    LKUIToast.show(context.getApplicationContext(), (int) R.string.Lark_Legacy_InstallFailed);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            C26311p.m95267a(context, 1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                m223766b(this, this.f141995a);
            }
            finish();
        }
    }
}

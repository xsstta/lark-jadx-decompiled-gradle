package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SignatureMultiProcessActivity extends SignatureActivity {
    /* renamed from: a */
    public Context mo155538a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155539a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172959a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172957a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155541f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155542g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172961c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172958a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172960b(this);
    }

    /* renamed from: a */
    public static Resources m172958a(SignatureMultiProcessActivity signatureMultiProcessActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(signatureMultiProcessActivity);
        }
        return signatureMultiProcessActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172961c(SignatureMultiProcessActivity signatureMultiProcessActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(signatureMultiProcessActivity);
        }
        return signatureMultiProcessActivity.mo155542g();
    }

    /* renamed from: b */
    public static void m172960b(SignatureMultiProcessActivity signatureMultiProcessActivity) {
        signatureMultiProcessActivity.mo155541f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SignatureMultiProcessActivity signatureMultiProcessActivity2 = signatureMultiProcessActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    signatureMultiProcessActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172959a(SignatureMultiProcessActivity signatureMultiProcessActivity, Context context) {
        signatureMultiProcessActivity.mo155539a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(signatureMultiProcessActivity);
        }
    }

    /* renamed from: a */
    public static Context m172957a(SignatureMultiProcessActivity signatureMultiProcessActivity, Configuration configuration) {
        Context a = signatureMultiProcessActivity.mo155538a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

package com.ss.android.lark.mail.impl.compose;

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

public class MulProComposeMailActivity extends ComposeMailActivity {
    /* renamed from: a */
    public Context mo150712a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo150713a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.compose.ComposeMailActivity
    public void attachBaseContext(Context context) {
        m166646a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m166644a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo150715d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo150716e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo150717f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m166648c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m166645a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity, com.ss.android.lark.mail.impl.compose.ComposeMailActivity
    public void onStop() {
        m166647b(this);
    }

    /* renamed from: a */
    public static Resources m166645a(MulProComposeMailActivity mulProComposeMailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProComposeMailActivity);
        }
        return mulProComposeMailActivity.mo150715d();
    }

    /* renamed from: c */
    public static AssetManager m166648c(MulProComposeMailActivity mulProComposeMailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProComposeMailActivity);
        }
        return mulProComposeMailActivity.mo150717f();
    }

    /* renamed from: b */
    public static void m166647b(MulProComposeMailActivity mulProComposeMailActivity) {
        mulProComposeMailActivity.mo150716e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MulProComposeMailActivity mulProComposeMailActivity2 = mulProComposeMailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mulProComposeMailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m166646a(MulProComposeMailActivity mulProComposeMailActivity, Context context) {
        mulProComposeMailActivity.mo150713a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProComposeMailActivity);
        }
    }

    /* renamed from: a */
    public static Context m166644a(MulProComposeMailActivity mulProComposeMailActivity, Configuration configuration) {
        Context a = mulProComposeMailActivity.mo150712a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

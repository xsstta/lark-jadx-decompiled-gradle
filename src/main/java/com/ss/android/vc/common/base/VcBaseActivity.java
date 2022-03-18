package com.ss.android.vc.common.base;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.air.AirActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.VideoChatModule;
import java.util.Locale;

public class VcBaseActivity extends AirActivity {
    /* renamed from: a */
    public Context mo208280a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo208281a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m235882a(this, context);
    }

    /* renamed from: b */
    public void mo208284b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo208285c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m235880a(this, configuration);
    }

    public AssetManager getAssets() {
        return m235884c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m235881a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m235883b(this);
    }

    /* renamed from: a */
    public static Resources m235881a(VcBaseActivity vcBaseActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcBaseActivity);
        }
        return vcBaseActivity.mo208281a();
    }

    /* renamed from: c */
    public static AssetManager m235884c(VcBaseActivity vcBaseActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcBaseActivity);
        }
        return vcBaseActivity.mo208285c();
    }

    /* renamed from: b */
    public static void m235883b(VcBaseActivity vcBaseActivity) {
        vcBaseActivity.mo208284b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VcBaseActivity vcBaseActivity2 = vcBaseActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    vcBaseActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public Context mo208283b(Context context) {
        if (VideoChatModule.getDependency() == null) {
            return context;
        }
        Configuration configuration = context.getResources().getConfiguration();
        Locale languageSetting = VideoChatModule.getDependency().getLanguageDependency().getLanguageSetting();
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(languageSetting);
        } else {
            configuration.locale = languageSetting;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return context.createConfigurationContext(configuration);
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        return context;
    }

    /* renamed from: a */
    public void mo208282a(Context context) {
        super.attachBaseContext(mo208283b(context));
    }

    /* renamed from: a */
    public static void m235882a(VcBaseActivity vcBaseActivity, Context context) {
        vcBaseActivity.mo208282a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcBaseActivity);
        }
    }

    /* renamed from: a */
    public static Context m235880a(VcBaseActivity vcBaseActivity, Configuration configuration) {
        Context a = vcBaseActivity.mo208280a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplaySettingInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DisplaySettingDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private LanguageDisplaySettingInfo f134460a;

    /* renamed from: a */
    public Context mo185905a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185906a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185907a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210996a(this, context);
    }

    /* renamed from: b */
    public void mo185908b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185909c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210994a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210998c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210995a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210997b(this);
    }

    /* renamed from: a */
    public static Resources m210995a(DisplaySettingDetailActivity displaySettingDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displaySettingDetailActivity);
        }
        return displaySettingDetailActivity.mo185906a();
    }

    /* renamed from: c */
    public static AssetManager m210998c(DisplaySettingDetailActivity displaySettingDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displaySettingDetailActivity);
        }
        return displaySettingDetailActivity.mo185909c();
    }

    /* renamed from: b */
    public static void m210997b(DisplaySettingDetailActivity displaySettingDetailActivity) {
        displaySettingDetailActivity.mo185908b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DisplaySettingDetailActivity displaySettingDetailActivity2 = displaySettingDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    displaySettingDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        LanguageDisplaySettingInfo languageDisplaySettingInfo = (LanguageDisplaySettingInfo) getIntent().getParcelableExtra("arg1");
        this.f134460a = languageDisplaySettingInfo;
        getSupportFragmentManager().beginTransaction().add(16908290, C54356a.m211028a(languageDisplaySettingInfo)).commit();
    }

    /* renamed from: a */
    public static void m210996a(DisplaySettingDetailActivity displaySettingDetailActivity, Context context) {
        displaySettingDetailActivity.mo185907a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displaySettingDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m210994a(DisplaySettingDetailActivity displaySettingDetailActivity, Configuration configuration) {
        Context a = displaySettingDetailActivity.mo185905a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

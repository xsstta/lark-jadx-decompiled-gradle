package com.bytedance.ee.bear.document.bitable;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class BitableMainActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo22663a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo22664a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo22665a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m23017a(this, context);
    }

    /* renamed from: b */
    public void mo22666b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo22667c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m23015a(this, configuration);
    }

    public AssetManager getAssets() {
        return m23019c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m23016a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m23018b(this);
    }

    /* renamed from: a */
    public static Resources m23016a(BitableMainActivity bitableMainActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bitableMainActivity);
        }
        return bitableMainActivity.mo22664a();
    }

    /* renamed from: c */
    public static AssetManager m23019c(BitableMainActivity bitableMainActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bitableMainActivity);
        }
        return bitableMainActivity.mo22667c();
    }

    /* renamed from: b */
    public static void m23018b(BitableMainActivity bitableMainActivity) {
        bitableMainActivity.mo22666b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BitableMainActivity bitableMainActivity2 = bitableMainActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    bitableMainActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_bitable_main);
    }

    /* renamed from: a */
    public static void m23017a(BitableMainActivity bitableMainActivity, Context context) {
        bitableMainActivity.mo22665a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bitableMainActivity);
        }
    }

    /* renamed from: a */
    public static Context m23015a(BitableMainActivity bitableMainActivity, Configuration configuration) {
        Context a = bitableMainActivity.mo22663a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

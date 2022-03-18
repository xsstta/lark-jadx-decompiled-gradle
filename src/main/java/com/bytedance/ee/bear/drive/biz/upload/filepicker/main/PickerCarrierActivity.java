package com.bytedance.ee.bear.drive.biz.upload.filepicker.main;

import android.content.Context;
import android.content.Intent;
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

public class PickerCarrierActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo26662a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26663a() {
    }

    /* renamed from: a */
    public void mo26664a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m26774a(this, context);
    }

    /* renamed from: b */
    public Resources mo26665b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo26666c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m26772a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo26668d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m26776c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m26773a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m26775b(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    public static Resources m26773a(PickerCarrierActivity pickerCarrierActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerCarrierActivity);
        }
        return pickerCarrierActivity.mo26665b();
    }

    /* renamed from: c */
    public static AssetManager m26776c(PickerCarrierActivity pickerCarrierActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerCarrierActivity);
        }
        return pickerCarrierActivity.mo26668d();
    }

    /* renamed from: b */
    public static void m26775b(PickerCarrierActivity pickerCarrierActivity) {
        pickerCarrierActivity.mo26666c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PickerCarrierActivity pickerCarrierActivity2 = pickerCarrierActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pickerCarrierActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        setContentView(R.layout.facade_activity_carrier);
        mo26663a();
    }

    /* renamed from: a */
    public static void m26774a(PickerCarrierActivity pickerCarrierActivity, Context context) {
        pickerCarrierActivity.mo26664a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerCarrierActivity);
        }
    }

    /* renamed from: a */
    public static Context m26772a(PickerCarrierActivity pickerCarrierActivity, Configuration configuration) {
        Context a = pickerCarrierActivity.mo26662a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}

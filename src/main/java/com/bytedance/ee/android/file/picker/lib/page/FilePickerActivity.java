package com.bytedance.ee.android.file.picker.lib.page;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.android.file.picker.lib.base.BaseFragmentActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FilePickerActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo16038a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo16039a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo16040a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m17063a(this, context);
    }

    /* renamed from: b */
    public void mo16041b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo16042c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m17061a(this, configuration);
    }

    public AssetManager getAssets() {
        return m17065c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m17062a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m17064b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    private void m17066d() {
        C4099b bVar = new C4099b();
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, bVar);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.android.file.picker.lib.base.BaseFragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17066d();
    }

    /* renamed from: a */
    public static Resources m17062a(FilePickerActivity filePickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(filePickerActivity);
        }
        return filePickerActivity.mo16039a();
    }

    /* renamed from: c */
    public static AssetManager m17065c(FilePickerActivity filePickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(filePickerActivity);
        }
        return filePickerActivity.mo16042c();
    }

    /* renamed from: b */
    public static void m17064b(FilePickerActivity filePickerActivity) {
        filePickerActivity.mo16041b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FilePickerActivity filePickerActivity2 = filePickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    filePickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m17063a(FilePickerActivity filePickerActivity, Context context) {
        filePickerActivity.mo16040a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(filePickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m17061a(FilePickerActivity filePickerActivity, Configuration configuration) {
        Context a = filePickerActivity.mo16038a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

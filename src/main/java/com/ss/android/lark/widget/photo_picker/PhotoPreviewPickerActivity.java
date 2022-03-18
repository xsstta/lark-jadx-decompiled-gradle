package com.ss.android.lark.widget.photo_picker;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class PhotoPreviewPickerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C58641f f144559a;

    /* renamed from: a */
    public Context mo198499a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo198500a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo198501a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m227118a(this, context);
    }

    /* renamed from: b */
    public void mo198502b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo198503c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m227116a(this, configuration);
    }

    public AssetManager getAssets() {
        return m227120c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m227117a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m227119b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C58641f fVar = this.f144559a;
        if (fVar != null) {
            fVar.mo198840b();
        }
    }

    /* renamed from: d */
    private void m227121d() {
        C58641f fVar = new C58641f();
        this.f144559a = fVar;
        fVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f144559a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        if (!DesktopUtil.m144301a((Context) this)) {
            disableBlackStatusBarBeforeOnCreate();
        }
        super.onCreate(bundle);
        m227121d();
    }

    /* renamed from: a */
    public static Resources m227117a(PhotoPreviewPickerActivity photoPreviewPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPreviewPickerActivity);
        }
        return photoPreviewPickerActivity.mo198500a();
    }

    /* renamed from: c */
    public static AssetManager m227120c(PhotoPreviewPickerActivity photoPreviewPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPreviewPickerActivity);
        }
        return photoPreviewPickerActivity.mo198503c();
    }

    /* renamed from: b */
    public static void m227119b(PhotoPreviewPickerActivity photoPreviewPickerActivity) {
        photoPreviewPickerActivity.mo198502b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PhotoPreviewPickerActivity photoPreviewPickerActivity2 = photoPreviewPickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    photoPreviewPickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m227118a(PhotoPreviewPickerActivity photoPreviewPickerActivity, Context context) {
        photoPreviewPickerActivity.mo198501a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPreviewPickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m227116a(PhotoPreviewPickerActivity photoPreviewPickerActivity, Configuration configuration) {
        Context a = photoPreviewPickerActivity.mo198499a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C58641f fVar = this.f144559a;
        if (fVar != null) {
            fVar.onActivityResult(i, i2, intent);
        }
    }
}

package com.ss.android.lark.widget.photo_picker;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.widget.p2933d.C58394d;

public class PhotoPickerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    Fragment f144558a;

    /* renamed from: a */
    public Context mo198491a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo198493a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m227107a(this, context);
    }

    /* renamed from: b */
    public Resources mo198494b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo198495c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m227105a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo198497d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m227109c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m227106a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m227108b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        if (!DesktopUtil.m144301a((Context) this)) {
            StatusBarUtil.showStatusBar(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Fragment fragment = this.f144558a;
        if (fragment == null) {
            return;
        }
        if (fragment instanceof C58596b) {
            ((C58596b) fragment).mo198615c();
        } else if (fragment instanceof C58394d) {
            ((C58394d) fragment).mo197701a();
        } else {
            String str = this.TAG;
            Log.m165383e(str, "mFragment is unexpected, is " + this.f144558a);
        }
    }

    /* renamed from: a */
    public void mo198492a() {
        boolean z = false;
        boolean z2 = getIntent().getExtras().getBoolean("extra_use_new_photo_picker", false);
        if (getIntent().getExtras().getInt("ONLY_CAMERA_TYPE", 0) != 0) {
            z = true;
        }
        if (!z2 || z) {
            this.f144558a = new C58596b();
        } else {
            this.f144558a = new C58394d();
        }
        this.f144558a.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f144558a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        if (!DesktopUtil.m144301a((Context) this)) {
            disableBlackStatusBarBeforeOnCreate();
        }
        super.onCreate(bundle);
        mo198492a();
    }

    /* renamed from: a */
    public static Resources m227106a(PhotoPickerActivity photoPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPickerActivity);
        }
        return photoPickerActivity.mo198494b();
    }

    /* renamed from: c */
    public static AssetManager m227109c(PhotoPickerActivity photoPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPickerActivity);
        }
        return photoPickerActivity.mo198497d();
    }

    /* renamed from: b */
    public static void m227108b(PhotoPickerActivity photoPickerActivity) {
        photoPickerActivity.mo198495c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PhotoPickerActivity photoPickerActivity2 = photoPickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    photoPickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m227107a(PhotoPickerActivity photoPickerActivity, Context context) {
        photoPickerActivity.mo198493a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m227105a(PhotoPickerActivity photoPickerActivity, Configuration configuration) {
        Context a = photoPickerActivity.mo198491a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Fragment fragment = this.f144558a;
        if (fragment != null) {
            fragment.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        super.onActivityResult(i, i2, intent);
        if (!isFinishing() && (fragment = this.f144558a) != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}

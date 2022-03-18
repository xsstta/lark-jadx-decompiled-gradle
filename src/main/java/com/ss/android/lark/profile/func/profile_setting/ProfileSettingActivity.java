package com.ss.android.lark.profile.func.profile_setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupFragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProfileSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private ProfileSettingFragment f129882a;

    /* renamed from: a */
    public Context mo179406a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179407a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179408a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m203193a(this, context);
    }

    /* renamed from: b */
    public void mo179409b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179410c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m203191a(this, configuration);
    }

    public AssetManager getAssets() {
        return m203195c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m203192a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m203194b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        ProfileSettingFragment cVar = this.f129882a;
        if (cVar != null) {
            cVar.mo179445a();
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f129882a = null;
        super.onDestroy();
    }

    /* renamed from: d */
    private final void m203196d() {
        ProfileSettingFragment cVar = new ProfileSettingFragment();
        this.f129882a = cVar;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        cVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        ProfileSettingFragment cVar2 = this.f129882a;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        beginTransaction.add(16908290, cVar2, "ProfileSettingFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m203196d();
    }

    /* renamed from: a */
    public static Resources m203192a(ProfileSettingActivity profileSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(profileSettingActivity);
        }
        return profileSettingActivity.mo179407a();
    }

    /* renamed from: c */
    public static AssetManager m203195c(ProfileSettingActivity profileSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(profileSettingActivity);
        }
        return profileSettingActivity.mo179410c();
    }

    /* renamed from: b */
    public static void m203194b(ProfileSettingActivity profileSettingActivity) {
        profileSettingActivity.mo179409b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ProfileSettingActivity profileSettingActivity2 = profileSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    profileSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m203193a(ProfileSettingActivity profileSettingActivity, Context context) {
        profileSettingActivity.mo179408a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(profileSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m203191a(ProfileSettingActivity profileSettingActivity, Configuration configuration) {
        Context a = profileSettingActivity.mo179406a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ProfileSettingFragment cVar = this.f129882a;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            cVar.onActivityResult(i, i2, intent);
        }
    }
}

package com.ss.lark.android.avatar.ui;

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
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AvatarPreviewActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C64236d f162339a;

    /* renamed from: a */
    public Context mo222646a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo222647a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo222648a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m252566a(this, context);
    }

    /* renamed from: b */
    public void mo222649b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo222650c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m252563a(this, configuration);
    }

    public AssetManager getAssets() {
        return m252568c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m252565a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m252567b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C64236d dVar = this.f162339a;
        if (dVar != null) {
            dVar.mo222691a();
        }
    }

    /* renamed from: d */
    private void m252569d() {
        C64236d dVar = new C64236d();
        this.f162339a = dVar;
        dVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f162339a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m252569d();
    }

    /* renamed from: a */
    public static Resources m252565a(AvatarPreviewActivity avatarPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(avatarPreviewActivity);
        }
        return avatarPreviewActivity.mo222647a();
    }

    /* renamed from: c */
    public static AssetManager m252568c(AvatarPreviewActivity avatarPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(avatarPreviewActivity);
        }
        return avatarPreviewActivity.mo222650c();
    }

    /* renamed from: b */
    public static void m252567b(AvatarPreviewActivity avatarPreviewActivity) {
        avatarPreviewActivity.mo222649b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AvatarPreviewActivity avatarPreviewActivity2 = avatarPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    avatarPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static Intent m252564a(Context context, Bundle bundle) {
        Intent intent = new Intent(context, AvatarPreviewActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: a */
    public static Context m252563a(AvatarPreviewActivity avatarPreviewActivity, Configuration configuration) {
        Context a = avatarPreviewActivity.mo222646a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m252566a(AvatarPreviewActivity avatarPreviewActivity, Context context) {
        avatarPreviewActivity.mo222648a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(avatarPreviewActivity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C64236d dVar = this.f162339a;
        if (dVar != null) {
            dVar.onActivityResult(i, i2, intent);
        }
    }
}

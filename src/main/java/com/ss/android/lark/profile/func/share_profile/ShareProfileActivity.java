package com.ss.android.lark.profile.func.share_profile;

import android.content.Context;
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

public class ShareProfileActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C52459a f129922a;

    /* renamed from: a */
    public Context mo179469a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179470a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179471a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m203268a(this, context);
    }

    /* renamed from: b */
    public void mo179472b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179473c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m203266a(this, configuration);
    }

    public AssetManager getAssets() {
        return m203270c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m203267a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m203269b(this);
    }

    /* renamed from: d */
    private void m203271d() {
        C52459a aVar = new C52459a();
        this.f129922a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f129922a, "ShareProfileFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m203271d();
    }

    /* renamed from: a */
    public static Resources m203267a(ShareProfileActivity shareProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareProfileActivity);
        }
        return shareProfileActivity.mo179470a();
    }

    /* renamed from: c */
    public static AssetManager m203270c(ShareProfileActivity shareProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareProfileActivity);
        }
        return shareProfileActivity.mo179473c();
    }

    /* renamed from: b */
    public static void m203269b(ShareProfileActivity shareProfileActivity) {
        shareProfileActivity.mo179472b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareProfileActivity shareProfileActivity2 = shareProfileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareProfileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m203268a(ShareProfileActivity shareProfileActivity, Context context) {
        shareProfileActivity.mo179471a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareProfileActivity);
        }
    }

    /* renamed from: a */
    public static Context m203266a(ShareProfileActivity shareProfileActivity, Configuration configuration) {
        Context a = shareProfileActivity.mo179469a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

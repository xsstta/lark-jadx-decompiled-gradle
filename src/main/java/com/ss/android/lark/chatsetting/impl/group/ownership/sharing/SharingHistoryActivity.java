package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.content.Context;
import android.content.Intent;
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
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SharingHistoryActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo128396a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128397a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128398a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135229a(this, context);
    }

    /* renamed from: b */
    public void mo128399b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128400c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135227a(this, configuration);
    }

    public AssetManager getAssets() {
        return m135231c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135228a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135230b(this);
    }

    /* renamed from: a */
    public static Resources m135228a(SharingHistoryActivity sharingHistoryActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sharingHistoryActivity);
        }
        return sharingHistoryActivity.mo128397a();
    }

    /* renamed from: c */
    public static AssetManager m135231c(SharingHistoryActivity sharingHistoryActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sharingHistoryActivity);
        }
        return sharingHistoryActivity.mo128400c();
    }

    /* renamed from: b */
    public static void m135230b(SharingHistoryActivity sharingHistoryActivity) {
        sharingHistoryActivity.mo128399b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SharingHistoryActivity sharingHistoryActivity2 = sharingHistoryActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sharingHistoryActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        SharingHistoryFragment gVar = new SharingHistoryFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        gVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, gVar, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m135229a(SharingHistoryActivity sharingHistoryActivity, Context context) {
        sharingHistoryActivity.mo128398a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sharingHistoryActivity);
        }
    }

    /* renamed from: a */
    public static Context m135227a(SharingHistoryActivity sharingHistoryActivity, Configuration configuration) {
        Context a = sharingHistoryActivity.mo128396a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

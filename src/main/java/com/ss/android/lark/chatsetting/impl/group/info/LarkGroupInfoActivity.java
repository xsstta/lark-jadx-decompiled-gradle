package com.ss.android.lark.chatsetting.impl.group.info;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LarkGroupInfoActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo127879a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo127880a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo127881a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134482a(this, context);
    }

    /* renamed from: b */
    public void mo127882b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo127883c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134480a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134485c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134481a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134484b(this);
    }

    /* renamed from: d */
    private void m134486d() {
        C34624d dVar = new C34624d();
        dVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, dVar, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m134481a(LarkGroupInfoActivity larkGroupInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupInfoActivity);
        }
        return larkGroupInfoActivity.mo127880a();
    }

    /* renamed from: c */
    public static AssetManager m134485c(LarkGroupInfoActivity larkGroupInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupInfoActivity);
        }
        return larkGroupInfoActivity.mo127883c();
    }

    /* renamed from: b */
    public static void m134484b(LarkGroupInfoActivity larkGroupInfoActivity) {
        larkGroupInfoActivity.mo127882b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LarkGroupInfoActivity larkGroupInfoActivity2 = larkGroupInfoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    larkGroupInfoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        if (!m134483a(getIntent().getExtras())) {
            Log.m165382e("open group info failed");
            finish();
            return;
        }
        m134486d();
    }

    /* renamed from: a */
    private boolean m134483a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("curr_chat")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m134482a(LarkGroupInfoActivity larkGroupInfoActivity, Context context) {
        larkGroupInfoActivity.mo127881a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupInfoActivity);
        }
    }

    /* renamed from: a */
    public static Context m134480a(LarkGroupInfoActivity larkGroupInfoActivity, Configuration configuration) {
        Context a = larkGroupInfoActivity.mo127879a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

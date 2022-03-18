package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

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
import com.ss.android.lark.utils.StatusBarUtil;

public class GroupQRCodeActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private GroupQRCodeFragment f89440a;

    /* renamed from: a */
    public Context mo127966a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo127967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo127968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134636a(this, context);
    }

    /* renamed from: b */
    public void mo127969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo127970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134634a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134638c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134635a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134637b(this);
    }

    /* renamed from: d */
    private void m134639d() {
        GroupQRCodeFragment groupQRCodeFragment = new GroupQRCodeFragment();
        this.f89440a = groupQRCodeFragment;
        groupQRCodeFragment.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f89440a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StatusBarUtil.setTransparent(this);
        m134639d();
    }

    /* renamed from: a */
    public static Resources m134635a(GroupQRCodeActivity groupQRCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupQRCodeActivity);
        }
        return groupQRCodeActivity.mo127967a();
    }

    /* renamed from: c */
    public static AssetManager m134638c(GroupQRCodeActivity groupQRCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupQRCodeActivity);
        }
        return groupQRCodeActivity.mo127970c();
    }

    /* renamed from: b */
    public static void m134637b(GroupQRCodeActivity groupQRCodeActivity) {
        groupQRCodeActivity.mo127969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupQRCodeActivity groupQRCodeActivity2 = groupQRCodeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupQRCodeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m134636a(GroupQRCodeActivity groupQRCodeActivity, Context context) {
        groupQRCodeActivity.mo127968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupQRCodeActivity);
        }
    }

    /* renamed from: a */
    public static Context m134634a(GroupQRCodeActivity groupQRCodeActivity, Configuration configuration) {
        Context a = groupQRCodeActivity.mo127966a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.f89440a.onActivityResult(i, i2, intent);
        }
    }
}

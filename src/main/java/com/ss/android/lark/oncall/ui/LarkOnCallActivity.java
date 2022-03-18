package com.ss.android.lark.oncall.ui;

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
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.oncall.OnCallModule;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LarkOnCallActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C48737b f122448a;

    /* renamed from: a */
    public Context mo169968a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169969a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169970a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m191965a(this, context);
    }

    /* renamed from: b */
    public void mo169971b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169972c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m191962a(this, configuration);
    }

    public AssetManager getAssets() {
        return m191967c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m191963a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m191966b(this);
    }

    /* renamed from: d */
    private void m191968d() {
        C48737b bVar = new C48737b();
        this.f122448a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f122448a, "LarkOnCallFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m191968d();
    }

    /* renamed from: a */
    public static Resources m191963a(LarkOnCallActivity larkOnCallActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkOnCallActivity);
        }
        return larkOnCallActivity.mo169969a();
    }

    /* renamed from: c */
    public static AssetManager m191967c(LarkOnCallActivity larkOnCallActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkOnCallActivity);
        }
        return larkOnCallActivity.mo169972c();
    }

    /* renamed from: b */
    public static void m191966b(LarkOnCallActivity larkOnCallActivity) {
        larkOnCallActivity.mo169971b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LarkOnCallActivity larkOnCallActivity2 = larkOnCallActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    larkOnCallActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m191965a(LarkOnCallActivity larkOnCallActivity, Context context) {
        larkOnCallActivity.mo169970a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkOnCallActivity);
        }
    }

    /* renamed from: a */
    public static Context m191962a(LarkOnCallActivity larkOnCallActivity, Configuration configuration) {
        Context a = larkOnCallActivity.mo169968a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m191964a(Context context, String str) {
        if (DesktopUtil.m144301a(context)) {
            C36512a.m144041a().mo134763a(new C48737b(), new MainWindowParams.C36570a(ContainerType.Right).mo134958a(OnCallModule.f122434b.mo169922a().mo143996b()).mo134930b());
            return;
        }
        Intent intent = new Intent(context, LarkOnCallActivity.class);
        intent.putExtra("APPRECIABLE_KEY_LARK_ON_CALL", str);
        context.startActivity(intent);
    }
}

package com.ss.lark.android.passport.biz.feature.pending_approve;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.base.ui.UiParams;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64916b;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64917c;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64918d;

@RouterAnno(name = "join_tenant_review", teaName = "passport_wait_for_permission_view")
public class PendingApproveActivity extends BaseActivity<C64917c> {
    /* renamed from: a */
    public Context mo223915a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254913a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254911a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254915c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254912a(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254914b(this);
    }

    /* renamed from: w */
    public void mo223919w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo223920x() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C64912a.AbstractC64913a mo170969b() {
        return new C64916b(getIntent());
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        ((C64917c) this.f123050a).mo223924a(getWindow().getDecorView());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C64917c) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: y */
    private void m254916y() {
        this.f123050a = mo223916a(mo170969b(), mo170967a());
        ((C64917c) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64912a.AbstractC64914b mo170967a() {
        return new C64918d(this);
    }

    /* renamed from: a */
    public static Resources m254912a(PendingApproveActivity pendingApproveActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pendingApproveActivity);
        }
        return pendingApproveActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m254915c(PendingApproveActivity pendingApproveActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pendingApproveActivity);
        }
        return pendingApproveActivity.mo223920x();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_page_pending_approve", "page enter");
        BaseUiContainer.m252996a(this, R.layout.signin_sdk_activity_pending_approve, new UiParams(true, false));
        m254916y();
    }

    /* renamed from: b */
    public static void m254914b(PendingApproveActivity pendingApproveActivity) {
        pendingApproveActivity.mo223919w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PendingApproveActivity pendingApproveActivity2 = pendingApproveActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pendingApproveActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254913a(PendingApproveActivity pendingApproveActivity, Context context) {
        pendingApproveActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pendingApproveActivity);
        }
    }

    /* renamed from: a */
    public static Context m254911a(PendingApproveActivity pendingApproveActivity, Configuration configuration) {
        Context a = pendingApproveActivity.mo223915a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64917c mo223916a(C64912a.AbstractC64913a aVar, C64912a.AbstractC64914b bVar) {
        return new C64917c(this, aVar, bVar, this.f123055f, this.f123052c);
    }
}

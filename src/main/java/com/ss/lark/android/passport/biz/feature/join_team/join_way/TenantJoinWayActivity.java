package com.ss.lark.android.passport.biz.feature.join_team.join_way;

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
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64825b;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64826c;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64828d;

@RouterAnno(name = "dispatch_register", teaName = "passport_join_team_view")
public class TenantJoinWayActivity extends BaseActivity<C64826c> {
    /* renamed from: a */
    public Context mo223698a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254528a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254526a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254530c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254527a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254529b(this);
    }

    /* renamed from: w */
    public void mo223702w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo223703x() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C64821a.AbstractC64822a mo170969b() {
        return new C64825b(getIntent());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C64826c) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: y */
    private void m254531y() {
        this.f123050a = mo223699a(mo170969b(), mo170967a());
        ((C64826c) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64821a.AbstractC64823b mo170967a() {
        return new C64828d(this);
    }

    /* renamed from: a */
    public static Resources m254527a(TenantJoinWayActivity tenantJoinWayActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tenantJoinWayActivity);
        }
        return tenantJoinWayActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m254530c(TenantJoinWayActivity tenantJoinWayActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tenantJoinWayActivity);
        }
        return tenantJoinWayActivity.mo223703x();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseUiContainer.m252995a(this, R.layout.signin_sdk_activity_tenant_join_way);
        this.f123052c.mo171465b("n_page_tenant_join_way", "enter page");
        m254531y();
    }

    /* renamed from: b */
    public static void m254529b(TenantJoinWayActivity tenantJoinWayActivity) {
        tenantJoinWayActivity.mo223702w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TenantJoinWayActivity tenantJoinWayActivity2 = tenantJoinWayActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    tenantJoinWayActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254528a(TenantJoinWayActivity tenantJoinWayActivity, Context context) {
        tenantJoinWayActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tenantJoinWayActivity);
        }
    }

    /* renamed from: a */
    public static Context m254526a(TenantJoinWayActivity tenantJoinWayActivity, Configuration configuration) {
        Context a = tenantJoinWayActivity.mo223698a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64826c mo223699a(C64821a.AbstractC64822a aVar, C64821a.AbstractC64823b bVar) {
        return new C64826c(this, aVar, bVar, this.f123055f, this.f123052c);
    }
}

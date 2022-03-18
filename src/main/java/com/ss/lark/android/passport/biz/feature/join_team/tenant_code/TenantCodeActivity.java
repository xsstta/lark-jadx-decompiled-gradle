package com.ss.lark.android.passport.biz.feature.join_team.tenant_code;

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
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64836b;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64837c;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64840d;

@RouterAnno(name = "join_by_code", teaName = "passport_team_code_input_view")
public class TenantCodeActivity extends BaseActivity<C64837c> {

    /* renamed from: h */
    private C64832a.AbstractC64834b f163440h;

    /* renamed from: i */
    private CommonUiContainer f163441i;

    /* renamed from: a */
    public Context mo223725a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254577a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254575a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254579c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254576a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254578b(this);
    }

    /* renamed from: w */
    public void mo223729w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo223730x() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C64832a.AbstractC64833a mo170969b() {
        return new C64836b(getIntent());
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        C64832a.AbstractC64834b bVar = this.f163440h;
        if (bVar != null) {
            bVar.mo223736f();
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C64837c) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: y */
    private void m254580y() {
        this.f163440h = mo170967a();
        this.f123050a = mo223726a(mo170969b(), this.f163440h);
        ((C64837c) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64832a.AbstractC64834b mo170967a() {
        return new C64840d(this, this.f163441i);
    }

    /* renamed from: a */
    public static Resources m254576a(TenantCodeActivity tenantCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tenantCodeActivity);
        }
        return tenantCodeActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m254579c(TenantCodeActivity tenantCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tenantCodeActivity);
        }
        return tenantCodeActivity.mo223730x();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f163441i = CommonUiContainer.m252970b(this, R.layout.signin_sdk_activity_tenant_code);
        this.f123052c.mo171465b("n_page_input_team_code", "enter page");
        m254580y();
    }

    /* renamed from: b */
    public static void m254578b(TenantCodeActivity tenantCodeActivity) {
        tenantCodeActivity.mo223729w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TenantCodeActivity tenantCodeActivity2 = tenantCodeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    tenantCodeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254577a(TenantCodeActivity tenantCodeActivity, Context context) {
        tenantCodeActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tenantCodeActivity);
        }
    }

    /* renamed from: a */
    public static Context m254575a(TenantCodeActivity tenantCodeActivity, Configuration configuration) {
        Context a = tenantCodeActivity.mo223725a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64837c mo223726a(C64832a.AbstractC64833a aVar, C64832a.AbstractC64834b bVar) {
        return new C64837c(this, aVar, bVar, this.f123055f, this.f123052c);
    }
}

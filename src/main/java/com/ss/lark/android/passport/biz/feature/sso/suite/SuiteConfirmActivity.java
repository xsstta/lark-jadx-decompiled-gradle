package com.ss.lark.android.passport.biz.feature.sso.suite;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40651r;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SuiteInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.sso.C65022a;
import java.util.HashMap;

@RouterAnno(teaName = "passport_login_auth_view")
public class SuiteConfirmActivity extends BaseActivity {

    /* renamed from: h */
    C65071b f163862h;

    /* renamed from: a */
    public Context mo224174a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255491a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255488a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255494c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255489a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255493b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        super.onBackPressed();
        C65071b bVar = this.f163862h;
        if (bVar != null) {
            bVar.mo185117d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C65022a.m255255a("page_dismiss", "suite");
        this.f123052c.mo171465b("n_page_suite_end", "SuiteConfirmActivity is onDestroy");
    }

    /* renamed from: w */
    private void m255495w() {
        C65071b bVar = new C65071b();
        this.f163862h = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f163862h, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C65071b bVar = this.f163862h;
        if (bVar != null) {
            bVar.onWindowFocusChanged(z);
        }
    }

    /* renamed from: a */
    public static Resources m255489a(SuiteConfirmActivity suiteConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(suiteConfirmActivity);
        }
        return suiteConfirmActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255494c(SuiteConfirmActivity suiteConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(suiteConfirmActivity);
        }
        return suiteConfirmActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m255493b(SuiteConfirmActivity suiteConfirmActivity) {
        suiteConfirmActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SuiteConfirmActivity suiteConfirmActivity2 = suiteConfirmActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    suiteConfirmActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m255492a(getIntent().getExtras())) {
            finish();
            return;
        }
        m255495w();
        C65022a.m255255a("page_show", "suite");
        this.f123052c.mo171465b("n_page_suite_start", "SuiteConfirmActivity is created");
    }

    /* renamed from: a */
    private boolean m255492a(Bundle bundle) {
        if (bundle != null) {
            return true;
        }
        this.f123052c.mo171471d("SuiteConfirmActivity", "checkValidity bundle == null");
        return false;
    }

    /* renamed from: a */
    public static void m255491a(SuiteConfirmActivity suiteConfirmActivity, Context context) {
        suiteConfirmActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(suiteConfirmActivity);
        }
    }

    /* renamed from: a */
    public static Context m255488a(SuiteConfirmActivity suiteConfirmActivity, Configuration configuration) {
        Context a = suiteConfirmActivity.mo224174a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m255490a(Context context, UniContext uniContext, int i, String str, SuiteInfo suiteInfo, boolean z) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        bundle.putSerializable("suite_info", suiteInfo);
        bundle.putInt(ShareHitPoint.f121868c, i);
        bundle.putSerializable("key_of_uni_context", uniContext);
        if (!DesktopUtil.m144307b() || z) {
            Intent intent = new Intent(context, SuiteConfirmActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        } else {
            C65071b bVar = new C65071b();
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(bVar, (FloatWindowParams) new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134953b(true).mo134930b());
        }
        HashMap hashMap = new HashMap();
        if (i == 1) {
            str2 = "qr";
        } else {
            str2 = "url";
        }
        hashMap.put(ShareHitPoint.f121868c, str2);
        WatcherHelper.m193665a(uniContext, C40651r.f103142d, hashMap);
    }
}

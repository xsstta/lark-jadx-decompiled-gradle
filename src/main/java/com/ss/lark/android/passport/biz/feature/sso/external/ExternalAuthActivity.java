package com.ss.lark.android.passport.biz.feature.sso.external;

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
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.sso.C65022a;
import java.util.HashMap;

public class ExternalAuthActivity extends BaseActivity {

    /* renamed from: h */
    C65027a f163779h;

    /* renamed from: a */
    public Context mo224074a(Configuration configuration) {
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
        m255261a(this, context);
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
        return m255258a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255264c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255259a(this);
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
        m255263b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        C65027a aVar = this.f163779h;
        if (aVar != null) {
            aVar.mo224094e();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C65022a.m255255a("page_dismiss", "auth");
        this.f123052c.mo171465b("n_page_authz_end", "ExternalAuthActivity is onDestroy");
    }

    /* renamed from: w */
    private void m255265w() {
        C65027a aVar = new C65027a();
        this.f163779h = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f163779h, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m255259a(ExternalAuthActivity externalAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(externalAuthActivity);
        }
        return externalAuthActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255264c(ExternalAuthActivity externalAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(externalAuthActivity);
        }
        return externalAuthActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m255263b(ExternalAuthActivity externalAuthActivity) {
        externalAuthActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ExternalAuthActivity externalAuthActivity2 = externalAuthActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    externalAuthActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!DesktopUtil.m144301a((Context) this)) {
            mo171132e();
        }
        if (!m255262a(getIntent().getExtras())) {
            finish();
            return;
        }
        m255265w();
        C65022a.m255255a("page_show", "auth");
        this.f123052c.mo171460a("n_page_authz_start");
    }

    /* renamed from: a */
    private boolean m255262a(Bundle bundle) {
        if (bundle != null) {
            return true;
        }
        this.f123052c.mo171471d("n_page_authz_start", "checkValidity bundle == null");
        return false;
    }

    /* renamed from: a */
    public static void m255261a(ExternalAuthActivity externalAuthActivity, Context context) {
        externalAuthActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(externalAuthActivity);
        }
    }

    /* renamed from: a */
    public static Context m255258a(ExternalAuthActivity externalAuthActivity, Configuration configuration) {
        Context a = externalAuthActivity.mo224074a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m255260a(Context context, UniContext uniContext, int i, String str, AuthInfo authInfo, boolean z) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        bundle.putSerializable("auth_info", authInfo);
        bundle.putInt(ShareHitPoint.f121868c, i);
        bundle.putSerializable("key_of_uni_context", uniContext);
        if (!DesktopUtil.m144301a(context) || z) {
            Intent intent = new Intent(context, ExternalAuthActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        } else {
            C65027a aVar = new C65027a();
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(aVar, (FloatWindowParams) new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134953b(true).mo134930b());
        }
        HashMap hashMap = new HashMap();
        if (i == 1) {
            str2 = "qr";
        } else {
            str2 = "url";
        }
        hashMap.put(ShareHitPoint.f121868c, str2);
        WatcherHelper.m193665a(uniContext, C40651r.f103143e, hashMap);
    }
}

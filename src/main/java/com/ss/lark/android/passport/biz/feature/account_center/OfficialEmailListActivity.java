package com.ss.lark.android.passport.biz.feature.account_center;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterModel;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterPresenter;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.OfficialEmailListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RouterAnno(name = "official_email_list", teaName = "passport_authed_email_tenant_list_view")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/OfficialEmailListActivity;", "Lcom/ss/lark/android/passport/biz/feature/account_center/AccountCenterActivity;", "()V", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OfficialEmailListActivity extends AccountCenterActivity {
    /* renamed from: a */
    public Context mo223306a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m253740a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m253738a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253742c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253739a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253741b(this);
    }

    /* renamed from: w */
    public void mo223309w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo223310x() {
        return super.getAssets();
    }

    @Override // com.ss.lark.android.passport.biz.feature.account_center.AccountCenterActivity
    /* renamed from: b */
    public void mo170969b() {
        this.f123052c.mo171465b("n_page_official_email_list", "enter");
        OfficialEmailListView eVar = new OfficialEmailListView(this);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        mo223305a(new AccountCenterModel(intent));
        UniContext uniContext = this.f123055f;
        PassportLog passportLog = this.f123052c;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        this.f123050a = new AccountCenterPresenter(this, mo170967a(), eVar, uniContext, passportLog);
        ((AccountCenterPresenter) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.lark.android.passport.biz.feature.account_center.AccountCenterActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static Resources m253739a(OfficialEmailListActivity officialEmailListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(officialEmailListActivity);
        }
        return officialEmailListActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m253742c(OfficialEmailListActivity officialEmailListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(officialEmailListActivity);
        }
        return officialEmailListActivity.mo223310x();
    }

    /* renamed from: b */
    public static void m253741b(OfficialEmailListActivity officialEmailListActivity) {
        officialEmailListActivity.mo223309w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OfficialEmailListActivity officialEmailListActivity2 = officialEmailListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    officialEmailListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253740a(OfficialEmailListActivity officialEmailListActivity, Context context) {
        officialEmailListActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(officialEmailListActivity);
        }
    }

    /* renamed from: a */
    public static Context m253738a(OfficialEmailListActivity officialEmailListActivity, Configuration configuration) {
        Context a = officialEmailListActivity.mo223306a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

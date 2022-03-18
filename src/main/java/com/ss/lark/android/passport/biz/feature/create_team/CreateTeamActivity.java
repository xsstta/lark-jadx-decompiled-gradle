package com.ss.lark.android.passport.biz.feature.create_team;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.base.ui.UiParams;
import com.ss.lark.android.passport.biz.feature.create_team.mvp.C64762a;
import com.ss.lark.android.passport.biz.feature.create_team.mvp.C64763b;
import com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView;

@RouterAnno(name = "prepare_tenant", teaName = "passport_team_info_setting_view")
public class CreateTeamActivity extends BaseActivity<C64763b> {

    /* renamed from: h */
    private C64762a f163304h;

    /* renamed from: a */
    public Context mo223610a(Configuration configuration) {
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
        m254298a(this, context);
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
        return m254297a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254301d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254299b(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254300c(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: u */
    public String mo171149u() {
        return "n_page_tenant_prepare_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: s */
    public UniContext mo171147s() {
        return WatcherUniContext.m193673b();
    }

    /* renamed from: w */
    private void m254302w() {
        ServiceFinder.m193760o().cleanEnvAndDid(this.f123055f, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.CreateTeamActivity.C647511 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                CreateTeamActivity.this.f123052c.mo171471d("n_action_clean_env", "CreateTeamActivity, cleanEnvAndGetDid error");
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                PassportLog passportLog = CreateTeamActivity.this.f123052c;
                passportLog.mo171465b("n_action_clean_env", "CreateTeamActivity, cleanEnvAndGetDid success, deviceId is:" + str);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C64763b) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: x */
    private void m254303x() {
        View findViewById = findViewById(R.id.iv_back);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = StatusBarUtil.getStatusBarHeight(this);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: y */
    private void m254304y() {
        this.f123050a = mo223612a(this, m254305z(), mo223611a(this));
        ((C64763b) this.f123050a).mo171169a();
    }

    /* renamed from: z */
    private C64762a m254305z() {
        if (this.f163304h == null) {
            this.f163304h = mo223613b(getIntent());
        }
        return this.f163304h;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        if (m254305z().mo223634g().fromGuide) {
            ServiceFinder.m193748c().openLogin(this, SigninParams.newBuilder().mo172353c(true).mo172351b(true).mo172350a());
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C64762a mo223613b(Intent intent) {
        return new C64762a(intent);
    }

    /* renamed from: b */
    public static Resources m254299b(CreateTeamActivity createTeamActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamActivity);
        }
        return createTeamActivity.mo170967a();
    }

    /* renamed from: d */
    public static AssetManager m254301d(CreateTeamActivity createTeamActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamActivity);
        }
        return createTeamActivity.mo170970c();
    }

    /* renamed from: c */
    public static void m254300c(CreateTeamActivity createTeamActivity) {
        createTeamActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CreateTeamActivity createTeamActivity2 = createTeamActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    createTeamActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        mo171132e();
        super.onCreate(bundle);
        if (ServiceFinder.m193744a().getForegroundUser() == null) {
            this.f123052c.mo171465b("n_action_clean_env", "CreateTeamActivity, no foregroundUser, clean Env");
            m254302w();
        }
        BaseUiContainer.m252996a(this, R.layout.signin_sdk_activity_create_team, new UiParams(true, false));
        m254303x();
        m254304y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public CreateTeamView mo223611a(CreateTeamActivity createTeamActivity) {
        return new CreateTeamView(createTeamActivity);
    }

    /* renamed from: a */
    public static void m254298a(CreateTeamActivity createTeamActivity, Context context) {
        createTeamActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamActivity);
        }
    }

    /* renamed from: a */
    public static Context m254297a(CreateTeamActivity createTeamActivity, Configuration configuration) {
        Context a = createTeamActivity.mo223610a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64763b mo223612a(Context context, C64762a aVar, CreateTeamView createTeamView) {
        return new C64763b(context, aVar, createTeamView, this.f123055f, this.f123052c);
    }
}

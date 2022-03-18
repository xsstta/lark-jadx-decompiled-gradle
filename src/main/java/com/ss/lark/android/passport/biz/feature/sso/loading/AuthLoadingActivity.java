package com.ss.lark.android.passport.biz.feature.sso.loading;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AuthLoadingActivity extends BaseActivity implements IWatermarkable {

    /* renamed from: h */
    private LKUIStatus f163806h;

    /* renamed from: i */
    private AbstractC49347c f163807i;

    /* renamed from: a */
    public Context mo224110a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255344a(this, context);
    }

    /* renamed from: b */
    public Resources mo170969b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo170970c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255341a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return true;
    }

    public AssetManager getAssets() {
        return m255346c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255342a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255345b(this);
    }

    /* renamed from: w */
    public AssetManager mo224113w() {
        return super.getAssets();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m255339A() {
        LKUIStatus lKUIStatus = this.f163806h;
        if (lKUIStatus != null) {
            lKUIStatus.mo89847d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m255340B() {
        LKUIStatus lKUIStatus = this.f163806h;
        if (lKUIStatus != null) {
            lKUIStatus.mo89837a();
        }
    }

    /* renamed from: y */
    private void m255348y() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.sso.loading.$$Lambda$AuthLoadingActivity$vWDGDDaCEhM2W7GlLHVzYjMiZ0A */

            public final void run() {
                AuthLoadingActivity.this.m255340B();
            }
        });
    }

    /* renamed from: z */
    private void m255349z() {
        AbstractC49347c cVar = this.f163807i;
        if (cVar != null) {
            cVar.mo171123a();
            this.f163807i = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        m255349z();
        mo170967a();
        super.onDestroy();
        this.f123052c.mo171460a("n_page_authloading_end");
    }

    /* renamed from: x */
    private void m255347x() {
        this.f123052c.mo171460a("n_page_authloading_start");
        final String stringExtra = getIntent().getStringExtra("token");
        if (TextUtils.isEmpty(stringExtra)) {
            this.f123052c.mo171471d("n_page_authloading_start", "return for token is empty ");
            return;
        }
        final IQRLoginService nVar = (IQRLoginService) ServiceFinder.m193746a(IQRLoginService.class);
        if (nVar != null) {
            m255348y();
            m255349z();
            this.f123052c.mo171465b("n_action_qrlogin_scan_req", "start in AuthLoadingActivity");
            this.f163807i = nVar.qrLoginCheck(stringExtra, new IGetDataCallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.sso.loading.AuthLoadingActivity.C650371 */

                /* renamed from: a */
                public void onSuccess(BaseStepData baseStepData) {
                    AuthLoadingActivity.this.mo170967a();
                    AuthLoadingActivity.this.f123052c.mo171465b("n_action_qrlogin_scan_req", "startSSOUrlConfirmActivity, succ in AuthLoadingActivity");
                    nVar.startSSOUrlConfirmActivity(AuthLoadingActivity.this, stringExtra, baseStepData);
                    AuthLoadingActivity.this.finish();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    AuthLoadingActivity.this.f123052c.mo171471d("n_action_qrlogin_scan_req", "errMsg =  err.getDisplayMsg(), fail in AuthLoadingActivity");
                    AuthLoadingActivity.this.mo170967a();
                    AuthLoadingActivity.this.finish();
                }
            });
            return;
        }
        this.f123052c.mo171471d("n_action_qrlogin_scan_req", "errMsg = QRLoginService is null , fail in AuthLoadingActivity");
    }

    /* renamed from: a */
    public void mo170967a() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.sso.loading.$$Lambda$AuthLoadingActivity$_1S0f4nWujbZmmClKbjEZcFwu0Q */

            public final void run() {
                AuthLoadingActivity.this.m255339A();
            }
        });
    }

    /* renamed from: a */
    public static Resources m255342a(AuthLoadingActivity authLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authLoadingActivity);
        }
        return authLoadingActivity.mo170969b();
    }

    /* renamed from: c */
    public static AssetManager m255346c(AuthLoadingActivity authLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authLoadingActivity);
        }
        return authLoadingActivity.mo224113w();
    }

    /* renamed from: b */
    public static void m255345b(AuthLoadingActivity authLoadingActivity) {
        authLoadingActivity.mo170970c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AuthLoadingActivity authLoadingActivity2 = authLoadingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    authLoadingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_auth_loading);
        this.f163806h = new LKUIStatus.C25680a((FrameLayout) findViewById(R.id.fl_content)).mo89859a();
        m255347x();
    }

    /* renamed from: a */
    public static void m255344a(AuthLoadingActivity authLoadingActivity, Context context) {
        authLoadingActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authLoadingActivity);
        }
    }

    /* renamed from: a */
    public static Context m255341a(AuthLoadingActivity authLoadingActivity, Configuration configuration) {
        Context a = authLoadingActivity.mo224110a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m255343a(Context context, String str, PassportLog passportLog) {
        if (TextUtils.isEmpty(str)) {
            passportLog.mo171471d("AuthLoadingActivity", "the token is null");
            return;
        }
        Intent intent = new Intent(context, AuthLoadingActivity.class);
        intent.putExtra("token", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}

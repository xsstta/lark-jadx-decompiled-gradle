package com.ss.lark.android.passport.biz.feature.company_login.scheme;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.company_login.scheme.SSOVerifyActivity;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;

public class SSOVerifyActivity extends BaseActivity {

    /* renamed from: h */
    private AbstractC49347c f163205h;

    public static class PassportSSOStepInfo implements Serializable {
        public int code;
        public String message;
        @JSONField(name = "security_id")
        public String securityId;
        public String state;
    }

    /* renamed from: a */
    public Context mo223513a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254158a(this, context);
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
        return m254155a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254160c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254156a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254159b(this);
    }

    /* renamed from: w */
    public AssetManager mo223517w() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        AbstractC49347c cVar = this.f163205h;
        if (cVar != null) {
            cVar.mo171123a();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public void mo170967a() {
        C57744a.m224104a().putString("passport_security_id", "");
    }

    /* renamed from: a */
    public static Resources m254156a(SSOVerifyActivity sSOVerifyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sSOVerifyActivity);
        }
        return sSOVerifyActivity.mo170969b();
    }

    /* renamed from: c */
    public static AssetManager m254160c(SSOVerifyActivity sSOVerifyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sSOVerifyActivity);
        }
        return sSOVerifyActivity.mo223517w();
    }

    /* renamed from: b */
    public static void m254159b(SSOVerifyActivity sSOVerifyActivity) {
        sSOVerifyActivity.mo170970c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SSOVerifyActivity sSOVerifyActivity2 = sSOVerifyActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sSOVerifyActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.signin_sdk_activity_loading_dialog);
        if (getIntent() != null) {
            Uri data = getIntent().getData();
            if (data == null) {
                this.f123052c.mo171471d("n_action_idp_auth_external_fail", "uri is null");
                finish();
                return;
            }
            this.f123052c.mo171465b("n_action_idp_auth_external", "deal passport sso");
            mo223514a(data.getQueryParameter("token"));
            return;
        }
        this.f123052c.mo171471d("n_action_idp_auth_external_fail", "data is null.");
        finish();
    }

    /* renamed from: a */
    public void mo223514a(String str) {
        if (TextUtils.isEmpty(str) || !ServiceFinder.m193763r().isLoadingUrlOpen()) {
            this.f123052c.mo171471d("n_action_idp_auth_external_fail", "toke is null or url is not open");
            finish();
            return;
        }
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode == null || decode.length == 0) {
                this.f123052c.mo171471d("n_action_idp_auth_external_fail", "decodeTokenBytes length is zero");
                finish();
                return;
            }
            PassportSSOStepInfo passportSSOStepInfo = (PassportSSOStepInfo) C49202p.m193968a(new String(decode), PassportSSOStepInfo.class);
            if (passportSSOStepInfo == null) {
                this.f123052c.mo171471d("n_action_idp_auth_external_fail", "parsed step info is null");
                finish();
                return;
            }
            this.f123052c.mo171465b("n_action_idp_auth_external_suc", "parsed sso step info success");
            if (TextUtils.isEmpty(passportSSOStepInfo.securityId)) {
                this.f123052c.mo171471d("n_action_idp_auth_external_fail", "securityId is null");
                finish();
                return;
            }
            String string = C57744a.m224104a().getString("passport_security_id");
            if (!passportSSOStepInfo.securityId.equals(string) || passportSSOStepInfo.code != 0) {
                if (TextUtils.isEmpty(string)) {
                    this.f123052c.mo171471d("n_action_idp_auth_external_fail", "SecurityId is null");
                } else {
                    this.f123052c.mo171471d("n_action_idp_auth_external_fail", "SecurityId not same");
                    UDToast.build(this).mo91640a(-2L).mo91643a(C49154ag.m193830a((Context) this, (int) R.string.Lark_Passport_SSOLogin_VerifyExpireToast)).mo91655j().show();
                }
                finish();
                return;
            }
            this.f123052c.mo171465b("n_action_idp_auth_security_suc", "SecurityId is same");
            m254157a(this, passportSSOStepInfo.state);
        } catch (IllegalArgumentException e) {
            this.f123052c.mo171462a("n_action_idp_auth_external_fail", "decode failed", e);
            finish();
        }
    }

    /* renamed from: a */
    public static void m254158a(SSOVerifyActivity sSOVerifyActivity, Context context) {
        sSOVerifyActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sSOVerifyActivity);
        }
    }

    /* renamed from: a */
    public static Context m254155a(SSOVerifyActivity sSOVerifyActivity, Configuration configuration) {
        Context a = sSOVerifyActivity.mo223513a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m254157a(final Context context, String str) {
        mo171141m();
        AbstractC49347c cVar = this.f163205h;
        if (cVar != null) {
            cVar.mo171123a();
            this.f163205h = null;
        }
        this.f123052c.mo171465b("n_action_idp_auth_dispatch_req", "idp auth dispatch request start");
        WatcherHelper.m193664a(this.f123055f, C40654u.f103199v);
        this.f163205h = FeatureCApi.IdP.m253716a(str, true, this.f123055f, (ICallback<BaseStepData>) new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.scheme.SSOVerifyActivity.C647011 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                SSOVerifyActivity.this.mo171143o();
                SSOVerifyActivity.this.mo170967a();
                PassportLog passportLog = SSOVerifyActivity.this.f123052c;
                passportLog.mo171471d("n_action_idp_auth_dispatch_req_fail", "sendRequest clientDispatch error " + networkErrorResult.toString());
                SSOVerifyActivity.this.finish();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                SSOVerifyActivity.this.mo170967a();
                BaseStepData data = responseModel.getData();
                if (data == null) {
                    SSOVerifyActivity.this.f123052c.mo171471d("n_action_idp_auth_dispatch_req_fail", " clientDispatch rsp data = null");
                    mo101475a(new NetworkErrorResult(-1, "onSuccess unknown empty"));
                    SSOVerifyActivity.this.mo171143o();
                    SSOVerifyActivity.this.finish();
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("next_step", data.nextStep);
                WatcherHelper.m193665a(null, C40654u.f103200w, hashMap);
                PassportLog passportLog = SSOVerifyActivity.this.f123052c;
                passportLog.mo171465b("n_action_idp_auth_dispatch_req_suc", "sendRequest clientDispatch nextStep " + responseModel.getData());
                C49092f.m193529a(context, data, RouterScene.ALL.value, SSOVerifyActivity.this.f123055f, SSOVerifyActivity.this.f123052c, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.feature.company_login.scheme.$$Lambda$SSOVerifyActivity$1$WfKQiGyZLItx2kodmTp3lPIcQI */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public final void onRouterResult(int i, Object obj) {
                        SSOVerifyActivity.C647011.m271526lambda$WfKQiGyZLItx2kodmTp3lPIcQI(SSOVerifyActivity.C647011.this, i, obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m254169a(int i, Object obj) {
                if (i == -100) {
                    SSOVerifyActivity.this.mo171143o();
                    WatcherHelper.m193664a((UniContext) null, C40654u.f103201x);
                }
                SSOVerifyActivity.this.finish();
            }
        });
    }
}

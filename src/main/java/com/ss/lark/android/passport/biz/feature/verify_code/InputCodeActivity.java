package com.ss.lark.android.passport.biz.feature.verify_code;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import java.util.HashMap;

@RouterAnno(name = "page_verify_identity_new")
public class InputCodeActivity extends VerifyBaseActivity implements IChangePage {
    @RouterFieldAnno

    /* renamed from: h */
    VerifyIdentityStepInfo f164013h;

    /* renamed from: a */
    public Context mo224303a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255765a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255763a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255768c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255764a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255767b(this);
    }

    /* renamed from: w */
    public Resources mo224306w() {
        return super.getResources();
    }

    /* renamed from: x */
    public void mo224307x() {
        super.onStop();
    }

    /* renamed from: y */
    public AssetManager mo224308y() {
        return super.getAssets();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        super.onBackPressed();
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f164013h;
        if (verifyIdentityStepInfo == null) {
            this.f123052c.mo171468c("InputCodeActivity", "stepInfo is null, onBackPressed");
        } else if (verifyIdentityStepInfo.verifyCode != null && TextUtils.equals("contact_verify", this.f164013h.verifyCode.scope)) {
            this.f123052c.mo171465b("InputCodeActivity", "contact_verify, external invoke");
            m255766a("cancelVerify");
        } else if (this.f164013h.backToFeed && ServiceFinder.m193748c().isLogin()) {
            this.f123052c.mo171465b("InputCodeActivity", "oldModel backToFeed");
            ServiceFinder.m193752g().launchMainWindow(this, ServiceFinder.m193744a().getForegroundUser(), null);
        }
    }

    /* renamed from: a */
    public static Resources m255764a(InputCodeActivity inputCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputCodeActivity);
        }
        return inputCodeActivity.mo224306w();
    }

    /* renamed from: c */
    public static AssetManager m255768c(InputCodeActivity inputCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputCodeActivity);
        }
        return inputCodeActivity.mo224308y();
    }

    /* renamed from: b */
    public static void m255767b(InputCodeActivity inputCodeActivity) {
        inputCodeActivity.mo224307x();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InputCodeActivity inputCodeActivity2 = inputCodeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inputCodeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m255766a(String str) {
        Intent intent = new Intent();
        intent.putExtra("errorMsg", str);
        setResult(0, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.lark.android.passport.biz.feature.verify_code.VerifyBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("InputCodeActivity", "Login and enterActivity");
        C49092f.m193525a(this, getIntent());
        StringBuilder sb = new StringBuilder();
        if (this.f164013h.verifyPwd != null) {
            sb.append("verify_pwd");
        }
        if (this.f164013h.verifyCode != null) {
            sb.append("verify_code");
        }
        if (this.f164013h.verifyCodeSpare != null) {
            sb.append("verify_code_spare");
        }
        if (this.f164013h.verifyOtp != null) {
            sb.append("verify_otp");
        }
        if (this.f164013h.forgetVerifyCode != null) {
            sb.append("verify_forget_code");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("options", sb.toString());
        PassportLog passportLog = this.f123052c;
        passportLog.mo171467b("n_page_verify_code_steps", "defaultVerifyItem = " + this.f164013h.defaultVerifyItem, hashMap);
        mo224309a(this.f164013h, "login");
    }

    /* renamed from: a */
    public static void m255765a(InputCodeActivity inputCodeActivity, Context context) {
        inputCodeActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputCodeActivity);
        }
    }

    /* renamed from: a */
    public static Context m255763a(InputCodeActivity inputCodeActivity, Configuration configuration) {
        Context a = inputCodeActivity.mo224303a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

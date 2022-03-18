package com.ss.lark.android.passport.biz.compat;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.compat.input_pwd.C64363a;
import com.ss.lark.android.passport.biz.compat.verify_code.C64525a;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;

@RouterAnno(name = "page_verify_identity")
public class InputCodeActivity extends BaseActivity implements AbstractC64359a {
    @RouterFieldAnno

    /* renamed from: h */
    VerifyIdentityStepInfo f162631h;

    /* renamed from: i */
    private C64363a f162632i;

    /* renamed from: j */
    private C64525a f162633j;

    /* renamed from: k */
    private boolean f162634k;

    /* renamed from: a */
    public Context mo222905a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m253018a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m253016a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253021c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253017a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253020b(this);
    }

    /* renamed from: w */
    public void mo222908w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo222909x() {
        return super.getAssets();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f162631h;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.verifyCode == null || !TextUtils.equals("contact_verify", this.f162631h.verifyCode.scope)) {
            super.onBackPressed();
        } else {
            m253019a("cancelVerify");
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.AbstractC64359a
    /* renamed from: a */
    public void mo170967a() {
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("InputCodeActivity", "changePage showPwdFrg = " + this.f162634k);
        if (this.f162632i != null && this.f162633j != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (this.f162634k) {
                beginTransaction.replace(R.id.fragment_container, this.f162632i).commit();
            } else {
                beginTransaction.replace(R.id.fragment_container, this.f162633j).commit();
            }
            this.f162634k = !this.f162634k;
        }
    }

    /* renamed from: b */
    public void mo170969b() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.f162631h == null) {
            PassportLog passportLog = this.f123052c;
            passportLog.mo171465b("InputCodeActivity", "initFragmentInfo but stepInfo is null" + this.f162631h.type);
            beginTransaction.replace(R.id.fragment_container, this.f162633j).commit();
            return;
        }
        PassportLog passportLog2 = this.f123052c;
        passportLog2.mo171465b("InputCodeActivity", "Identify type " + this.f162631h.type);
        Bundle bundle = new Bundle();
        bundle.putSerializable("verify_step_info", this.f162631h);
        this.f162633j.setArguments(bundle);
        this.f162632i.setArguments(bundle);
        if ("verify_code".equals(this.f162631h.type) || "forget_verify_code".equals(this.f162631h.type)) {
            beginTransaction.replace(R.id.fragment_container, this.f162633j).commit();
        } else if ("verify_pwd".equals(this.f162631h.type)) {
            beginTransaction.replace(R.id.fragment_container, this.f162632i).commit();
        }
    }

    /* renamed from: a */
    public static Resources m253017a(InputCodeActivity inputCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputCodeActivity);
        }
        return inputCodeActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m253021c(InputCodeActivity inputCodeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputCodeActivity);
        }
        return inputCodeActivity.mo222909x();
    }

    /* renamed from: b */
    public static void m253020b(InputCodeActivity inputCodeActivity) {
        inputCodeActivity.mo222908w();
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
    private void m253019a(String str) {
        Intent intent = new Intent();
        intent.putExtra("errorMsg", str);
        setResult(0, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_page_old_verify_code_start", "enter old verify code page");
        C49092f.m193525a(this, getIntent());
        setContentView(R.layout.signin_sdk_activity_input_code);
        this.f162632i = (C64363a) Fragment.instantiate(this, C64363a.class.getName(), null);
        this.f162633j = (C64525a) Fragment.instantiate(this, C64525a.class.getName(), null);
        C64363a aVar = this.f162632i;
        if (aVar != null) {
            aVar.mo222911a(this);
        }
        C64525a aVar2 = this.f162633j;
        if (aVar2 != null) {
            aVar2.mo223197a(this);
        }
        mo170969b();
    }

    /* renamed from: a */
    public static void m253018a(InputCodeActivity inputCodeActivity, Context context) {
        inputCodeActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inputCodeActivity);
        }
    }

    /* renamed from: a */
    public static Context m253016a(InputCodeActivity inputCodeActivity, Configuration configuration) {
        Context a = inputCodeActivity.mo222905a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

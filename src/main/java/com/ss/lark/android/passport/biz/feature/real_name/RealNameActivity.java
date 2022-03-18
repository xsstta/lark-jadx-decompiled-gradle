package com.ss.lark.android.passport.biz.feature.real_name;

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
import com.ss.lark.android.passport.biz.feature.real_name.mvp.C64932b;
import com.ss.lark.android.passport.biz.feature.real_name.mvp.C64934c;
import com.ss.lark.android.passport.biz.feature.real_name.mvp.RealNameView;

@RouterAnno(name = "op_three_and_gov_face", teaName = "passport_account_findback_realname_verify_view")
public class RealNameActivity extends BaseActivity {

    /* renamed from: h */
    private C64934c f163622h;

    /* renamed from: i */
    private CommonUiContainer f163623i;

    /* renamed from: a */
    public Context mo223928a(Configuration configuration) {
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
        m254941a(this, context);
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
        return m254939a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254943c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254940a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254942b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.f163622h.cn_();
        super.onDestroy();
    }

    /* renamed from: w */
    private void m254944w() {
        RealNameView realNameView = new RealNameView(this, this.f163623i);
        this.f163622h = new C64934c(this, new C64932b(getIntent()), realNameView, this.f123055f, this.f123052c);
        this.f163623i.mo222875a(realNameView);
        this.f163622h.mo171169a();
    }

    /* renamed from: a */
    public static Resources m254940a(RealNameActivity realNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realNameActivity);
        }
        return realNameActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m254943c(RealNameActivity realNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realNameActivity);
        }
        return realNameActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m254942b(RealNameActivity realNameActivity) {
        realNameActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RealNameActivity realNameActivity2 = realNameActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    realNameActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("RealNameActivity", "enter");
        this.f123052c.mo171465b("n_page_opthree_start", "enter real name");
        this.f163623i = CommonUiContainer.m252970b(this, R.layout.signin_sdk_activity_real_name);
        m254944w();
    }

    /* renamed from: a */
    public static void m254941a(RealNameActivity realNameActivity, Context context) {
        realNameActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realNameActivity);
        }
    }

    /* renamed from: a */
    public static Context m254939a(RealNameActivity realNameActivity, Configuration configuration) {
        Context a = realNameActivity.mo223928a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

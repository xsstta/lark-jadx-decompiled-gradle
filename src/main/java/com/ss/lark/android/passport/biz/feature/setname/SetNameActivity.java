package com.ss.lark.android.passport.biz.feature.setname;

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
import com.ss.lark.android.passport.biz.feature.setname.p3232a.C65013b;
import com.ss.lark.android.passport.biz.feature.setname.p3232a.C65015c;
import com.ss.lark.android.passport.biz.feature.setname.p3232a.C65019d;

@RouterAnno(name = "set_name", teaName = "passport_user_name_setting_view")
public class SetNameActivity extends BaseActivity<C65015c> {

    /* renamed from: h */
    private C65013b f163760h;

    /* renamed from: i */
    private CommonUiContainer f163761i;

    /* renamed from: a */
    public Context mo224057a(Configuration configuration) {
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
        m255214a(this, context);
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
        return m255212a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255216c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255213a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255215b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C65015c) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: x */
    private C65013b m255218x() {
        if (this.f163760h == null) {
            this.f163760h = new C65013b(getIntent());
        }
        return this.f163760h;
    }

    /* renamed from: w */
    private void m255217w() {
        C65019d dVar = new C65019d(this, this.f163761i);
        C65013b x = m255218x();
        this.f163760h = x;
        this.f123050a = new C65015c(this, x, dVar, this.f123055f, this.f123052c);
        ((C65015c) this.f123050a).mo171169a();
    }

    /* renamed from: a */
    public static Resources m255213a(SetNameActivity setNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setNameActivity);
        }
        return setNameActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255216c(SetNameActivity setNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setNameActivity);
        }
        return setNameActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f163761i = CommonUiContainer.m252970b(this, R.layout.signin_sdk_activity_set_name);
        m255217w();
        this.f123052c.mo171465b("n_page_set_name", "enter");
    }

    /* renamed from: b */
    public static void m255215b(SetNameActivity setNameActivity) {
        setNameActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SetNameActivity setNameActivity2 = setNameActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    setNameActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m255214a(SetNameActivity setNameActivity, Context context) {
        setNameActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setNameActivity);
        }
    }

    /* renamed from: a */
    public static Context m255212a(SetNameActivity setNameActivity, Configuration configuration) {
        Context a = setNameActivity.mo224057a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

package com.ss.lark.android.passport.biz.compat.reset_phone_num;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
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
import com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64429b;
import com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64430c;
import com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.ResetPhoneNumView;

@RouterAnno(name = "set_input_credential", teaName = "set_phone_number_next")
public class RestPhoneNumActivity extends BaseActivity {

    /* renamed from: h */
    private C64430c f162720h;

    /* renamed from: i */
    private CommonUiContainer f162721i;

    /* renamed from: j */
    private final ResetPhoneNumView.AbstractC64424a f162722j = new ResetPhoneNumView.AbstractC64424a() {
        /* class com.ss.lark.android.passport.biz.compat.reset_phone_num.RestPhoneNumActivity.C644211 */

        @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.ResetPhoneNumView.AbstractC64424a
        /* renamed from: a */
        public void mo222984a(ResetPhoneNumView resetPhoneNumView) {
            ButterKnife.bind(resetPhoneNumView, RestPhoneNumActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo222981a(Configuration configuration) {
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
        m253173a(this, context);
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
        return m253171a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253175c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253172a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253174b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.f162720h.cn_();
        super.onDestroy();
    }

    /* renamed from: w */
    private void m253176w() {
        C64430c cVar = new C64430c(this, new C64429b(getIntent()), new ResetPhoneNumView(this, this.f162722j, this.f162721i), this.f123055f, this.f123052c);
        this.f162720h = cVar;
        cVar.mo171169a();
    }

    /* renamed from: a */
    public static Resources m253172a(RestPhoneNumActivity restPhoneNumActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(restPhoneNumActivity);
        }
        return restPhoneNumActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m253175c(RestPhoneNumActivity restPhoneNumActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(restPhoneNumActivity);
        }
        return restPhoneNumActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_page_old_new_credential_start", "enter old set new credential page");
        this.f162721i = CommonUiContainer.m252970b(this, R.layout.activity_rest_phone_num);
        m253176w();
    }

    /* renamed from: b */
    public static void m253174b(RestPhoneNumActivity restPhoneNumActivity) {
        restPhoneNumActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RestPhoneNumActivity restPhoneNumActivity2 = restPhoneNumActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    restPhoneNumActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253173a(RestPhoneNumActivity restPhoneNumActivity, Context context) {
        restPhoneNumActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(restPhoneNumActivity);
        }
    }

    /* renamed from: a */
    public static Context m253171a(RestPhoneNumActivity restPhoneNumActivity, Configuration configuration) {
        Context a = restPhoneNumActivity.mo222981a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

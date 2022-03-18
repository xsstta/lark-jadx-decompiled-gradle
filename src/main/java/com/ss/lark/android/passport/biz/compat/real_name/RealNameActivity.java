package com.ss.lark.android.passport.biz.compat.real_name;

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
import com.ss.lark.android.passport.biz.compat.real_name.mvp.C64416b;
import com.ss.lark.android.passport.biz.compat.real_name.mvp.C64417c;
import com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView;

@RouterAnno(name = "recover_account_carrier", teaName = "login_account_recovery_entry_click")
public class RealNameActivity extends BaseActivity {

    /* renamed from: h */
    private C64417c f162690h;

    /* renamed from: i */
    private RealNameView.AbstractC64411a f162691i = new RealNameView.AbstractC64411a() {
        /* class com.ss.lark.android.passport.biz.compat.real_name.RealNameActivity.C644011 */

        @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.RealNameView.AbstractC64411a
        /* renamed from: a */
        public void mo222955a(RealNameView realNameView) {
            ButterKnife.bind(realNameView, RealNameActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo222952a(Configuration configuration) {
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
        m253118a(this, context);
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
        return m253116a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253120c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253117a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253119b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.f162690h.cn_();
        super.onDestroy();
    }

    /* renamed from: w */
    private void m253121w() {
        C64417c cVar = new C64417c(this, new C64416b(getIntent()), new RealNameView(this, this.f162691i), this.f123055f, this.f123052c);
        this.f162690h = cVar;
        cVar.mo171169a();
    }

    /* renamed from: a */
    public static Resources m253117a(RealNameActivity realNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realNameActivity);
        }
        return realNameActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m253120c(RealNameActivity realNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realNameActivity);
        }
        return realNameActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_page_old_opthree_start", "enter old opthree");
        setContentView(R.layout.signin_sdk_activity_real_name_backup);
        m253121w();
    }

    /* renamed from: b */
    public static void m253119b(RealNameActivity realNameActivity) {
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

    /* renamed from: a */
    public static void m253118a(RealNameActivity realNameActivity, Context context) {
        realNameActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realNameActivity);
        }
    }

    /* renamed from: a */
    public static Context m253116a(RealNameActivity realNameActivity, Configuration configuration) {
        Context a = realNameActivity.mo222952a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

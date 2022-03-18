package com.ss.lark.android.passport.biz.feature.bio_auth;

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
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.BioStepInfo;
import com.ss.lark.android.passport.biz.feature.bio_auth.mvp.BioAuthView;
import com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64668a;
import com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64669b;

@RouterAnno(name = "bio_auth", teaName = "passport_face_verify_view")
public class BioAuthActivity extends BaseActivity {
    @RouterFieldAnno

    /* renamed from: h */
    BioStepInfo f163152h;

    /* renamed from: i */
    private C64669b f163153i;

    /* renamed from: j */
    private final BioAuthView.AbstractC64667a f163154j = new BioAuthView.AbstractC64667a() {
        /* class com.ss.lark.android.passport.biz.feature.bio_auth.BioAuthActivity.C646631 */

        @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.BioAuthView.AbstractC64667a
        /* renamed from: a */
        public void mo223455a(BioAuthView bioAuthView) {
            ButterKnife.bind(bioAuthView, BioAuthActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo223451a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254034a(this, context);
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
        return m254032a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254036c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254033a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254035b(this);
    }

    /* renamed from: w */
    public AssetManager mo223454w() {
        return super.getAssets();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        super.onBackPressed();
        if (mo170967a()) {
            setResult(0, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        this.f163153i.cn_();
        super.onDestroy();
    }

    /* renamed from: x */
    private void m254037x() {
        C64669b bVar = new C64669b(this, new C64668a(getIntent()), new BioAuthView(this, this.f163154j), this.f123055f, this.f123052c);
        this.f163153i = bVar;
        bVar.mo171169a();
    }

    /* renamed from: a */
    public boolean mo170967a() {
        BioStepInfo bioStepInfo = this.f163152h;
        if (bioStepInfo == null || !"bio_unbind".equals(bioStepInfo.mFlowType)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Resources m254033a(BioAuthActivity bioAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bioAuthActivity);
        }
        return bioAuthActivity.mo170969b();
    }

    /* renamed from: c */
    public static AssetManager m254036c(BioAuthActivity bioAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bioAuthActivity);
        }
        return bioAuthActivity.mo223454w();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_action_bio_auth", "enter");
        BaseUiContainer.m252995a(this, R.layout.signin_sdk_activity_split_flow_page);
        m254037x();
    }

    /* renamed from: b */
    public static void m254035b(BioAuthActivity bioAuthActivity) {
        bioAuthActivity.mo170970c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BioAuthActivity bioAuthActivity2 = bioAuthActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    bioAuthActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254034a(BioAuthActivity bioAuthActivity, Context context) {
        bioAuthActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bioAuthActivity);
        }
    }

    /* renamed from: a */
    public static Context m254032a(BioAuthActivity bioAuthActivity, Configuration configuration) {
        Context a = bioAuthActivity.mo223451a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

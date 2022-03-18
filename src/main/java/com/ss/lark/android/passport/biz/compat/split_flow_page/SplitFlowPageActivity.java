package com.ss.lark.android.passport.biz.compat.split_flow_page;

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
import com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64454b;
import com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c;
import com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.SplitFlowPageView;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SpliteStepInfo;

@RouterAnno(name = "verify_choose")
public class SplitFlowPageActivity extends BaseActivity {
    @RouterFieldAnno

    /* renamed from: h */
    SpliteStepInfo f162757h;

    /* renamed from: i */
    private C64455c f162758i;

    /* renamed from: j */
    private SplitFlowPageView.AbstractC64449a f162759j = new SplitFlowPageView.AbstractC64449a() {
        /* class com.ss.lark.android.passport.biz.compat.split_flow_page.SplitFlowPageActivity.C644451 */

        @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.SplitFlowPageView.AbstractC64449a
        /* renamed from: a */
        public void mo223020a(SplitFlowPageView splitFlowPageView) {
            ButterKnife.bind(splitFlowPageView, SplitFlowPageActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo223016a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m253256a(this, context);
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
        return m253254a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253258c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253255a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253257b(this);
    }

    /* renamed from: w */
    public AssetManager mo223019w() {
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
        this.f162758i.cn_();
        super.onDestroy();
    }

    /* renamed from: x */
    private void m253259x() {
        C64455c cVar = new C64455c(this, new C64454b(getIntent()), new SplitFlowPageView(this, this.f162759j), this.f123055f, this.f123052c);
        this.f162758i = cVar;
        cVar.mo171169a();
    }

    /* renamed from: a */
    public boolean mo170967a() {
        SpliteStepInfo spliteStepInfo = this.f162757h;
        if (spliteStepInfo == null || spliteStepInfo.next == null || this.f162757h.next.verifyFace == null || (this.f162757h.next.verifyFace.sourceType != 12 && this.f162757h.next.verifyFace.sourceType != 13)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Resources m253255a(SplitFlowPageActivity splitFlowPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(splitFlowPageActivity);
        }
        return splitFlowPageActivity.mo170969b();
    }

    /* renamed from: c */
    public static AssetManager m253258c(SplitFlowPageActivity splitFlowPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(splitFlowPageActivity);
        }
        return splitFlowPageActivity.mo223019w();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("SplitFlowPageActivity", "enter");
        setContentView(R.layout.signin_sdk_activity_split_flow_page_backup);
        m253259x();
    }

    /* renamed from: b */
    public static void m253257b(SplitFlowPageActivity splitFlowPageActivity) {
        splitFlowPageActivity.mo170970c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SplitFlowPageActivity splitFlowPageActivity2 = splitFlowPageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    splitFlowPageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253256a(SplitFlowPageActivity splitFlowPageActivity, Context context) {
        splitFlowPageActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(splitFlowPageActivity);
        }
    }

    /* renamed from: a */
    public static Context m253254a(SplitFlowPageActivity splitFlowPageActivity, Configuration configuration) {
        Context a = splitFlowPageActivity.mo223016a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

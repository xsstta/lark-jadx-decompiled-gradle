package com.ss.android.lark.ug.dyflow.steps.welcome;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.dyflow.common.BaseFlowAct;
import com.ss.android.lark.ug.dyflow.steps.welcome.mvp.WelcomeModel;
import com.ss.android.lark.ug.dyflow.steps.welcome.mvp.WelcomePresenter;
import com.ss.android.lark.ug.dyflow.steps.welcome.mvp.WelcomeView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/WelcomeActivity;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "()V", "presenter", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter;", "initMvp", "", "onCreate2", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "PresenterDependencyImpl", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WelcomeActivity extends BaseFlowAct {

    /* renamed from: b */
    private WelcomePresenter f141643b;

    /* renamed from: a */
    public Context mo195104a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo195105a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m223097a(this, context);
    }

    /* renamed from: b */
    public Resources mo195106b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo195107c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m223095a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo195109d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m223099c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m223096a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m223098b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        WelcomePresenter cVar = this.f141643b;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        OnboardingHitPoint.f99379a.mo141597a();
    }

    /* renamed from: e */
    private final void m223100e() {
        if (mo194720a() != null) {
            WelcomeView dVar = new WelcomeView(this);
            WelcomePresenter cVar = new WelcomePresenter(new WelcomeModel(), dVar, new PresenterDependencyImpl());
            cVar.create();
            setContentView(dVar);
            this.f141643b = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/WelcomeActivity$PresenterDependencyImpl;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct$DefaultFlowStepResDependency;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter$PresenterDependency;", "(Lcom/ss/android/lark/ug/dyflow/steps/welcome/WelcomeActivity;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.WelcomeActivity$a */
    public final class PresenterDependencyImpl extends BaseFlowAct.DefaultFlowStepResDependency implements WelcomePresenter.PresenterDependency {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterDependencyImpl() {
            super();
        }
    }

    /* renamed from: a */
    public static Resources m223096a(WelcomeActivity welcomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(welcomeActivity);
        }
        return welcomeActivity.mo195106b();
    }

    /* renamed from: c */
    public static AssetManager m223099c(WelcomeActivity welcomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(welcomeActivity);
        }
        return welcomeActivity.mo195109d();
    }

    /* renamed from: b */
    public static void m223098b(WelcomeActivity welcomeActivity) {
        welcomeActivity.mo195107c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WelcomeActivity welcomeActivity2 = welcomeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    welcomeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowAct
    /* renamed from: a */
    public void mo194722a(Bundle bundle) {
        DeviceUtils.setFullScreen(this);
        m223100e();
    }

    /* renamed from: a */
    public static void m223097a(WelcomeActivity welcomeActivity, Context context) {
        welcomeActivity.mo195105a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(welcomeActivity);
        }
    }

    /* renamed from: a */
    public static Context m223095a(WelcomeActivity welcomeActivity, Configuration configuration) {
        Context a = welcomeActivity.mo195104a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

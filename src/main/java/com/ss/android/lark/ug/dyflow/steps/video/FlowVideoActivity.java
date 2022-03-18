package com.ss.android.lark.ug.dyflow.steps.video;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger_constants.domains.onboarding.video.C24355b;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.metric.OnboardingMetric;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.dyflow.common.BaseFlowAct;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.data.elements.VideoElementData;
import com.ss.android.lark.ug.dyflow.steps.video.FlowVideoFragment;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoActivity;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "()V", "rootViewId", "", "isDoAnimationWithDefault", "", "isPortrait", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreate2", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onKeyUp", "FragmentDependencyImpl", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public class FlowVideoActivity extends BaseFlowAct {

    /* renamed from: b */
    private final int f141566b = R.id.fragment_guide;

    /* renamed from: a */
    public Context mo195033a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo195034a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m222969a(this, context);
    }

    /* renamed from: b */
    public Resources mo195035b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo195036c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m222967a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo195038d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m222972c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m222968a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m222971b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoActivity$FragmentDependencyImpl;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct$DefaultFlowStepResDependency;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$FragmentDependency;", "(Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoActivity;)V", "onError", "", "onNext", "onSkip", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.FlowVideoActivity$a */
    public final class FragmentDependencyImpl extends BaseFlowAct.DefaultFlowStepResDependency implements FlowVideoFragment.FragmentDependency {
        @Override // com.ss.android.lark.ug.dyflow.steps.video.FlowVideoFragment.FragmentDependency
        /* renamed from: a */
        public void mo195040a() {
            FlowVideoActivity.this.onBackPressed();
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.FlowVideoFragment.FragmentDependency
        /* renamed from: b */
        public void mo195041b() {
            BaseFlowAct.m222605a(FlowVideoActivity.this, "video_skip", false, 2, null);
            FlowVideoActivity.this.onBackPressed();
            OnboardingMetric.Companion aVar = OnboardingMetric.f99302a;
            C24341b bVar = C24355b.f60086d;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "VideoPlayDomain.QUIT_VIDEO_PAGE");
            aVar.mo141515a(bVar);
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.FlowVideoFragment.FragmentDependency
        /* renamed from: c */
        public void mo195042c() {
            BaseFlowAct.m222605a(FlowVideoActivity.this, "video_next", false, 2, null);
            FlowVideoActivity.this.onBackPressed();
            OnboardingMetric.Companion aVar = OnboardingMetric.f99302a;
            C24341b bVar = C24355b.f60086d;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "VideoPlayDomain.QUIT_VIDEO_PAGE");
            aVar.mo141515a(bVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public FragmentDependencyImpl() {
            super();
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        StatusBarUtil.showStatusBar(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if (fragment instanceof VideoFragmentController) {
                ((VideoFragmentController) fragment).mo195043a();
            }
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowAct, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static Resources m222968a(FlowVideoActivity flowVideoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(flowVideoActivity);
        }
        return flowVideoActivity.mo195035b();
    }

    /* renamed from: c */
    public static AssetManager m222972c(FlowVideoActivity flowVideoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(flowVideoActivity);
        }
        return flowVideoActivity.mo195038d();
    }

    /* renamed from: b */
    public static void m222971b(FlowVideoActivity flowVideoActivity) {
        flowVideoActivity.mo195036c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FlowVideoActivity flowVideoActivity2 = flowVideoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    flowVideoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m222970a(FlowStepData flowStepData) {
        if (DesktopUtil.m144301a((Context) this)) {
            return false;
        }
        VideoElementData g = flowStepData.mo194845g("video_content");
        if (g != null) {
            return g.mo194912b();
        }
        return true;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowAct
    /* renamed from: a */
    public void mo194722a(Bundle bundle) {
        FlowStepData a = mo194720a();
        if (a != null) {
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setId(this.f141566b);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            setContentView(frameLayout);
            StatusBarUtil.setTranslucentForImageView(this, 255, findViewById(this.f141566b));
            setRequestedOrientation(m222970a(a) ? 1 : 0);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.add(this.f141566b, FlowVideoFragment.f141568f.mo195049a(new FragmentDependencyImpl()));
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public static void m222969a(FlowVideoActivity flowVideoActivity, Context context) {
        flowVideoActivity.mo195034a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(flowVideoActivity);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(this.f141566b);
        if (!(findFragmentById instanceof VideoFragmentController) || !((VideoFragmentController) findFragmentById).mo195046a(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(this.f141566b);
        if (!(findFragmentById instanceof VideoFragmentController) || !((VideoFragmentController) findFragmentById).mo195048b(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    /* renamed from: a */
    public static Context m222967a(FlowVideoActivity flowVideoActivity, Configuration configuration) {
        Context a = flowVideoActivity.mo195033a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

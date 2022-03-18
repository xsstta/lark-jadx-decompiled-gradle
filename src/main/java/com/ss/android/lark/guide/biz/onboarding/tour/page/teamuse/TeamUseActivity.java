package com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.onboarding.PageOpener;
import com.ss.android.lark.guide.biz.onboarding.tour.page.UpdateTeamStack;
import com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.TeamUsePresenter;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUseActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "hitFrom", "", "presenter", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "PresenterDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamUseActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public static final Companion f99286b = new Companion(null);

    /* renamed from: a */
    public String f99287a;

    /* renamed from: c */
    private TeamUsePresenter f99288c;

    /* renamed from: d */
    private HashMap f99289d;

    /* renamed from: a */
    public Context mo141499a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo141500a() {
        return super.getResources();
    }

    /* renamed from: a */
    public View mo141501a(int i) {
        if (this.f99289d == null) {
            this.f99289d = new HashMap();
        }
        View view = (View) this.f99289d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f99289d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo141502a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m152428a(this, context);
    }

    /* renamed from: b */
    public void mo141503b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo141504c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m152426a(this, configuration);
    }

    public AssetManager getAssets() {
        return m152430c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m152427a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m152429b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUseActivity$Companion;", "", "()V", "HIT_FROM", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.TeamUseActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        TeamUsePresenter cVar = this.f99288c;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUseActivity$PresenterDependency;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter$IPresenterDependency;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUseActivity;)V", "openJoinTeamPage", "", "context", "Landroid/content/Context;", "openUpgradeTeamPage", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.TeamUseActivity$b */
    private final class PresenterDependency implements TeamUsePresenter.IPresenterDependency {
        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.TeamUsePresenter.IPresenterDependency
        /* renamed from: a */
        public void mo141507a() {
            PageOpener.f99148a.mo141346a(TeamUseActivity.this, "in_app_upgrade", OnboardingHitPoint.NodePath.m152607a(TeamUseActivity.this.f99287a, "select_page"));
            UpdateTeamStack.f99189a.mo141389a().mo141386a("team_use", TeamUseActivity.this);
            OnboardingHitPoint.f99379a.mo141612c(TeamUseActivity.this.f99287a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterDependency() {
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.TeamUsePresenter.IPresenterDependency
        /* renamed from: a */
        public void mo141508a(Context context) {
            OnboardingHitPoint.UserType userType;
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            if (a.mo141255e()) {
                userType = OnboardingHitPoint.UserType.Customer;
            } else {
                AbstractC38549a a2 = C38548a.m152027a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "GuideModule.getDependency()");
                if (a2.mo141256f()) {
                    userType = OnboardingHitPoint.UserType.SimpleUser;
                } else {
                    userType = OnboardingHitPoint.UserType.StandardUser;
                }
            }
            OnboardingHitPoint.f99379a.mo141602a(userType, TeamUseActivity.this.f99287a);
            String a3 = OnboardingHitPoint.NodePath.m152607a(TeamUseActivity.this.f99287a, "select_page");
            AbstractC38549a a4 = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "GuideModule.getDependency()");
            a4.mo141260j().mo141274a(context, a3, null);
        }
    }

    /* renamed from: a */
    public static Resources m152427a(TeamUseActivity teamUseActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamUseActivity);
        }
        return teamUseActivity.mo141500a();
    }

    /* renamed from: c */
    public static AssetManager m152430c(TeamUseActivity teamUseActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamUseActivity);
        }
        return teamUseActivity.mo141504c();
    }

    /* renamed from: b */
    public static void m152429b(TeamUseActivity teamUseActivity) {
        teamUseActivity.mo141503b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamUseActivity teamUseActivity2 = teamUseActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamUseActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_new_onboarding_team_use);
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("hit_from");
        } else {
            str = null;
        }
        this.f99287a = str;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo141501a(R.id.team_use);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "team_use");
        TeamUsePresenter cVar = new TeamUsePresenter(new TeamUseModel(), new TeamUseView(constraintLayout), new PresenterDependency());
        cVar.create();
        this.f99288c = cVar;
    }

    /* renamed from: a */
    public static void m152428a(TeamUseActivity teamUseActivity, Context context) {
        teamUseActivity.mo141502a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamUseActivity);
        }
    }

    /* renamed from: a */
    public static Context m152426a(TeamUseActivity teamUseActivity, Configuration configuration) {
        Context a = teamUseActivity.mo141499a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

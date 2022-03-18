package com.ss.android.lark.ug.dyflow.steps.welcome.mvp;

import android.os.SystemClock;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.ug.dyflow.common.FlowStepResDependency;
import com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeModel;", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView;", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView$IDelegate;", "model", "view", "presenterDelegate", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter$PresenterDependency;", "(Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeModel;Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView;Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter$PresenterDependency;)V", "createViewDelegate", "PresenterDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.c */
public final class WelcomePresenter extends BasePresenter<IWelcomeContract.IWelcomeModel, IWelcomeContract.IWelcomeView, IWelcomeContract.IWelcomeView.IDelegate> {

    /* renamed from: a */
    public final PresenterDependency f141645a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter$PresenterDependency;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepResDependency;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.c$a */
    public interface PresenterDependency extends FlowStepResDependency {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IWelcomeContract.IWelcomeView.IDelegate createViewDelegate() {
        return new C57477b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/welcome/mvp/WelcomePresenter$createViewDelegate$1", "Lcom/ss/android/lark/ug/dyflow/steps/welcome/mvp/IWelcomeContract$IWelcomeView$IDelegate;", "createTime", "", "getWelcomeAddition", "", "getWelcomeDetail", "getWelcomeEmoji", "getWelcomeExplore", "getWelcomeSubTitle", "getWelcomeTitle", "onClickWelcomeAddition", "", "onClickWelcomeExplore", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.welcome.a.c$b */
    public static final class C57477b implements IWelcomeContract.IWelcomeView.IDelegate {

        /* renamed from: a */
        final /* synthetic */ WelcomePresenter f141646a;

        /* renamed from: b */
        private long f141647b = SystemClock.uptimeMillis();

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: c */
        public String mo195113c() {
            String a = this.f141646a.f141645a.mo194725a("welcome_title");
            if (a != null) {
                return a;
            }
            return "";
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: d */
        public String mo195114d() {
            return this.f141646a.f141645a.mo194725a("welcome_subtitle");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: e */
        public String mo195115e() {
            return this.f141646a.f141645a.mo194725a("welcome_detail");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: f */
        public String mo195116f() {
            return this.f141646a.f141645a.mo194727b("welcome_emoji");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: g */
        public String mo195117g() {
            String c = this.f141646a.f141645a.mo194728c("welcome_explore");
            if (c != null) {
                return c;
            }
            return "";
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: h */
        public String mo195118h() {
            return this.f141646a.f141645a.mo194728c("welcome_addition");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: a */
        public void mo195111a() {
            this.f141646a.f141645a.mo194726a(null, "welcome_explore");
            OnboardingHitPoint.f99379a.mo141607b((int) (SystemClock.uptimeMillis() - this.f141647b));
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.welcome.mvp.IWelcomeContract.IWelcomeView.IDelegate
        /* renamed from: b */
        public void mo195112b() {
            this.f141646a.f141645a.mo194726a(null, "welcome_addition");
            OnboardingHitPoint.f99379a.mo141599a((int) (SystemClock.uptimeMillis() - this.f141647b));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57477b(WelcomePresenter cVar) {
            this.f141646a = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomePresenter(IWelcomeContract.IWelcomeModel aVar, IWelcomeContract.IWelcomeView bVar, PresenterDependency aVar2) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar2, "presenterDelegate");
        this.f141645a = aVar2;
    }
}

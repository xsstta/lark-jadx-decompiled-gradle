package com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp;

import android.app.Activity;
import android.os.SystemClock;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.ug.dyflow.common.FlowStepResDependency;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u0010\u0011\u0012B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideModel;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView$IDelegate;", "activity", "Landroid/app/Activity;", "dependency", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter$IPresenterDependency;", "model", "view", "(Landroid/app/Activity;Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter$IPresenterDependency;Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideModel;Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView;)V", "create", "", "createViewDelegate", "finishActivity", "Companion", "IPresenterDependency", "ViewDelegateFromSetting", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.c */
public final class InviteGuidePresenter extends BasePresenter<IInviteGuideContract.IInviteGuideModel, IInviteGuideContract.IInviteGuideView, IInviteGuideContract.IInviteGuideView.IDelegate> {

    /* renamed from: b */
    public static final Companion f141555b = new Companion(null);

    /* renamed from: a */
    public final IPresenterDependency f141556a;

    /* renamed from: c */
    private final Activity f141557c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter$IPresenterDependency;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepResDependency;", "getHitFrom", "", "trustedEmailDomain", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.c$b */
    public interface IPresenterDependency extends FlowStepResDependency {
        /* renamed from: a */
        String mo195011a();

        /* renamed from: b */
        String mo195012b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter$ViewDelegateFromSetting;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/IInviteGuideContract$IInviteGuideView$IDelegate;", "(Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter;)V", "firstTime", "", "finish", "", "getHitFrom", "", "getInviteGuideAddBtnText", "getInviteGuideDetail", "getInviteGuideSkipBtnText", "getInviteGuideTitle", "getInviteGuideTrustedMail", "needShowTitleLeftBtn", "", "onAddBtnClick", "onItemChecked", "isChecked", "onSkipBtnClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.a.c$c */
    public final class ViewDelegateFromSetting implements IInviteGuideContract.IInviteGuideView.IDelegate {

        /* renamed from: b */
        private final long f141559b = SystemClock.uptimeMillis();

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: a */
        public boolean mo195015a() {
            return false;
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: d */
        public void mo195018d() {
            InviteGuidePresenter.this.mo195027b();
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: e */
        public String mo195019e() {
            return InviteGuidePresenter.this.f141556a.mo195011a();
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: f */
        public String mo195020f() {
            String a = InviteGuidePresenter.this.f141556a.mo194725a("invite_guide_title");
            if (a != null) {
                return a;
            }
            return "";
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: g */
        public String mo195021g() {
            return InviteGuidePresenter.this.f141556a.mo194725a("invite_guide_detail");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: h */
        public String mo195022h() {
            String c = InviteGuidePresenter.this.f141556a.mo194728c("invite_guide_add");
            if (c != null) {
                return c;
            }
            return "";
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: i */
        public String mo195023i() {
            String c = InviteGuidePresenter.this.f141556a.mo194728c("invite_guide_skip");
            if (c != null) {
                return c;
            }
            return "";
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: j */
        public String mo195024j() {
            return InviteGuidePresenter.this.f141556a.mo194728c("invite_guide_trusted_mail");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: b */
        public void mo195016b() {
            OnboardingHitPoint.f99379a.mo141601a((int) (SystemClock.uptimeMillis() - this.f141559b), "add", InviteGuidePresenter.this.f141556a.mo195011a());
            InviteGuidePresenter.this.f141556a.mo194726a(null, "invite_guide_add");
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: c */
        public void mo195017c() {
            OnboardingHitPoint.f99379a.mo141601a((int) (SystemClock.uptimeMillis() - this.f141559b), "skip", InviteGuidePresenter.this.f141556a.mo195011a());
            InviteGuidePresenter.this.f141556a.mo194726a(null, "invite_guide_skip");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegateFromSetting() {
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.IInviteGuideContract.IInviteGuideView.IDelegate
        /* renamed from: a */
        public void mo195014a(boolean z) {
            ((IInviteGuideContract.IInviteGuideModel) InviteGuidePresenter.this.getModel()).mo195013a(z, InviteGuidePresenter.this.f141556a.mo195012b(), InviteGuidePresenter.this.f141556a.mo195011a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteGuideContract.IInviteGuideView.IDelegate createViewDelegate() {
        return new ViewDelegateFromSetting();
    }

    /* renamed from: b */
    public final void mo195027b() {
        if (UIUtils.isActivityRunning(this.f141557c)) {
            this.f141557c.finish();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        OnboardingHitPoint.f99379a.mo141603a(this.f141556a.mo195011a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteGuidePresenter(Activity activity, IPresenterDependency bVar, IInviteGuideContract.IInviteGuideModel aVar, IInviteGuideContract.IInviteGuideView bVar2) {
        super(aVar, bVar2);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar2, "view");
        this.f141557c = activity;
        this.f141556a = bVar;
    }
}

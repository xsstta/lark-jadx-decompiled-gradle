package com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse;

import android.content.Context;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.ITeamUseContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0013\u0014B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0004H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseModel;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView$IDelegate;", "model", "view", "dependency", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter$IPresenterDependency;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseModel;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter$IPresenterDependency;)V", "getModel", "()Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseModel;", "setModel", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseModel;)V", "getView", "()Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView;", "setView", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView;)V", "createViewDelegate", "IPresenterDependency", "ViewDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.c */
public final class TeamUsePresenter extends BasePresenter<ITeamUseContract.ITeamUseModel, ITeamUseContract.ITeamUseView, ITeamUseContract.ITeamUseView.IDelegate> {

    /* renamed from: a */
    public final IPresenterDependency f99291a;

    /* renamed from: b */
    private ITeamUseContract.ITeamUseModel f99292b;

    /* renamed from: c */
    private ITeamUseContract.ITeamUseView f99293c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter$IPresenterDependency;", "", "openJoinTeamPage", "", "context", "Landroid/content/Context;", "openUpgradeTeamPage", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.c$a */
    public interface IPresenterDependency {
        /* renamed from: a */
        void mo141507a();

        /* renamed from: a */
        void mo141508a(Context context);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter$ViewDelegate;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView$IDelegate;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUsePresenter;)V", "onJoinTeamClick", "", "context", "Landroid/content/Context;", "onUpgradeTeamClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.c$b */
    public final class ViewDelegate implements ITeamUseContract.ITeamUseView.IDelegate {
        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.ITeamUseContract.ITeamUseView.IDelegate
        /* renamed from: a */
        public void mo141509a() {
            TeamUsePresenter.this.f99291a.mo141507a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.ITeamUseContract.ITeamUseView.IDelegate
        /* renamed from: a */
        public void mo141510a(Context context) {
            TeamUsePresenter.this.f99291a.mo141508a(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ITeamUseContract.ITeamUseView.IDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamUsePresenter(ITeamUseContract.ITeamUseModel aVar, ITeamUseContract.ITeamUseView bVar, IPresenterDependency aVar2) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar2, "dependency");
        this.f99292b = aVar;
        this.f99293c = bVar;
        this.f99291a = aVar2;
    }
}

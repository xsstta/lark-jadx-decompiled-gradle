package com.ss.android.lark.guide.biz.onboarding.tour.page.member;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.onboarding.PageOpener;
import com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.common.BackToHomeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0004\u001f !\"B'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView$IDelegate;", "activity", "Landroid/app/Activity;", "model", "view", "dependency", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$IPresenterDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$IPresenterDependency;)V", "from", "", "from$annotations", "()V", "create", "", "createViewDelegate", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "finishActivity", "loadTrustedMailData", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "Companion", "IPresenterDependency", "ViewDelegate", "ViewDelegateFromInAppUpdate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b */
public final class AddTeamMemberPresenter extends BasePresenter<IAddTeamMemberContract.IAddTeamMemberModel, IAddTeamMemberContract.IAddTeamMemberView, IAddTeamMemberContract.IAddTeamMemberView.IDelegate> {

    /* renamed from: c */
    public static final Companion f99250c = new Companion(null);

    /* renamed from: a */
    public final Activity f99251a;

    /* renamed from: b */
    public final IPresenterDependency f99252b;

    /* renamed from: d */
    private final String f99253d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$IPresenterDependency;", "", "attachToParent", "", "view", "Landroid/view/View;", "getFrom", "", "getHitFrom", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$b */
    public interface IPresenterDependency {
        /* renamed from: a */
        String mo141447a();

        /* renamed from: a */
        void mo141448a(View view);

        /* renamed from: b */
        String mo141449b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$ViewDelegate;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView$IDelegate;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter;)V", "firstTime", "", "getFirstTime", "()J", "attachToParent", "", "view", "Landroid/view/View;", "finish", "getHitFrom", "", "getTenantName", "onItemChecked", "isChecked", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$c */
    private abstract class ViewDelegate implements IAddTeamMemberContract.IAddTeamMemberView.IDelegate {

        /* renamed from: b */
        private final long f99255b = SystemClock.uptimeMillis();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final long mo141462a() {
            return this.f99255b;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: c */
        public void mo141466c() {
            AddTeamMemberPresenter.this.mo141461b();
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: b */
        public String mo141465b() {
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            return a.mo141254d();
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: d */
        public String mo141467d() {
            return AddTeamMemberPresenter.this.f99252b.mo141449b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: a */
        public void mo141463a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            AddTeamMemberPresenter.this.f99252b.mo141448a(view);
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: a */
        public void mo141464a(boolean z) {
            IAddTeamMemberContract.IAddTeamMemberModel aVar = (IAddTeamMemberContract.IAddTeamMemberModel) AddTeamMemberPresenter.this.getModel();
            if (aVar != null) {
                aVar.mo141453a(z, AddTeamMemberPresenter.this.f99252b.mo141449b());
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m152369c();
    }

    /* renamed from: b */
    public final void mo141461b() {
        if (UIUtils.isActivityRunning(this.f99251a)) {
            this.f99251a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$loadTrustedMailData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberModel$TrustedMail;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$e */
    public static final class C38617e implements IGetDataCallback<IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail> {

        /* renamed from: a */
        final /* synthetic */ AddTeamMemberPresenter f99257a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$e$a */
        public static final class RunnableC38618a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C38617e f99258a;

            RunnableC38618a(C38617e eVar) {
                this.f99258a = eVar;
            }

            public final void run() {
                IAddTeamMemberContract.IAddTeamMemberView bVar = (IAddTeamMemberContract.IAddTeamMemberView) this.f99258a.f99257a.getView();
                if (bVar != null) {
                    bVar.mo141475a(false, null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$e$b */
        public static final class RunnableC38619b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C38617e f99259a;

            /* renamed from: b */
            final /* synthetic */ IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail f99260b;

            RunnableC38619b(C38617e eVar, IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail aVar) {
                this.f99259a = eVar;
                this.f99260b = aVar;
            }

            public final void run() {
                Boolean bool;
                IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail aVar = this.f99260b;
                if (aVar != null) {
                    bool = aVar.mo141485b();
                } else {
                    bool = null;
                }
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    IAddTeamMemberContract.IAddTeamMemberView bVar = (IAddTeamMemberContract.IAddTeamMemberView) this.f99259a.f99257a.getView();
                    if (bVar != null) {
                        bVar.mo141475a(true, this.f99260b.mo141482a());
                        return;
                    }
                    return;
                }
                IAddTeamMemberContract.IAddTeamMemberView bVar2 = (IAddTeamMemberContract.IAddTeamMemberView) this.f99259a.f99257a.getView();
                if (bVar2 != null) {
                    bVar2.mo141475a(false, null);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38617e(AddTeamMemberPresenter bVar) {
            this.f99257a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(IAddTeamMemberContract.IAddTeamMemberModel.TrustedMail aVar) {
            UICallbackExecutor.post(new RunnableC38619b(this, aVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("AddTeamMemberPresenter", String.valueOf(errorResult));
            UICallbackExecutor.post(new RunnableC38618a(this));
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$ViewDelegateFromInAppUpdate;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$ViewDelegate;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter;)V", "needShowTitleLeftBtn", "", "onAddBtnClick", "", "onSkipBtnClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.b$d */
    public final class ViewDelegateFromInAppUpdate extends ViewDelegate {
        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: e */
        public boolean mo141468e() {
            return true;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: g */
        public void mo141470g() {
            AddTeamMemberPresenter.this.mo141461b();
            OnboardingHitPoint.f99379a.mo141601a((int) (SystemClock.uptimeMillis() - mo141462a()), "skip", AddTeamMemberPresenter.this.f99252b.mo141449b());
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView.IDelegate
        /* renamed from: f */
        public void mo141469f() {
            PageOpener.f99148a.mo141344a(AddTeamMemberPresenter.this.f99251a, "new_guide");
            OnboardingHitPoint.f99379a.mo141601a((int) (SystemClock.uptimeMillis() - mo141462a()), "add", AddTeamMemberPresenter.this.f99252b.mo141449b());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegateFromInAppUpdate() {
            super();
        }
    }

    /* renamed from: c */
    private final void m152369c() {
        C38617e eVar = new C38617e(this);
        IAddTeamMemberContract.IAddTeamMemberModel aVar = (IAddTeamMemberContract.IAddTeamMemberModel) getModel();
        if (aVar != null) {
            aVar.mo141455a(eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IAddTeamMemberContract.IAddTeamMemberView.IDelegate createViewDelegate() {
        ViewDelegateFromInAppUpdate dVar;
        String str = this.f99253d;
        if (str.hashCode() == -1565334044 && str.equals("in_app_upgrade")) {
            dVar = new ViewDelegateFromInAppUpdate();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            OnboardingHitPoint.f99379a.mo141603a(this.f99252b.mo141449b());
            return dVar;
        }
        mo141461b();
        return new ViewDelegateFromInAppUpdate();
    }

    /* renamed from: a */
    public final boolean mo141460a(KeyEvent keyEvent) {
        if (!Intrinsics.areEqual(this.f99252b.mo141447a(), "setting") || !BackToHomeUtils.f141336a.mo194683a(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo141459a(int i, int i2, Intent intent) {
        mo141461b();
    }

    public AddTeamMemberPresenter(Activity activity, IAddTeamMemberContract.IAddTeamMemberModel aVar, IAddTeamMemberContract.IAddTeamMemberView bVar, IPresenterDependency bVar2) {
        String str;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        this.f99251a = activity;
        this.f99252b = bVar2;
        Intent intent = activity.getIntent();
        this.f99253d = (intent == null || (str = intent.getStringExtra("from")) == null) ? "unknown" : str;
        setModel(aVar);
        setView(bVar);
        bVar.setViewDelegate(createViewDelegate());
    }
}

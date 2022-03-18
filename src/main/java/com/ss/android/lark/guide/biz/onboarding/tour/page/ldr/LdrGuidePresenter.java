package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrModel;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView$IViewDelegate;", "model", "view", "dependency", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter$PresenterDependency;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrModel;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter$PresenterDependency;)V", "create", "", "createViewDelegate", "PresenterDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.f */
public final class LdrGuidePresenter extends BasePresenter<ILdrGuideContract.ILdrModel, ILdrGuideContract.ILdrView, ILdrGuideContract.ILdrView.IViewDelegate> {

    /* renamed from: a */
    public final PresenterDependency f99218a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter$PresenterDependency;", "", "onBackClick", "", "onButtonClick", "onDoneClick", "openLdrLink", "link", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.f$a */
    public interface PresenterDependency {
        /* renamed from: a */
        void mo141428a();

        /* renamed from: b */
        void mo141429b();

        /* renamed from: c */
        void mo141430c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter$createViewDelegate$1", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/ILdrGuideContract$ILdrView$IViewDelegate;", "onBackClick", "", "onButtonClick", "eventKeyList", "", "", "onDoneClick", "openLdrLink", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.f$c */
    public static final class C38610c implements ILdrGuideContract.ILdrView.IViewDelegate {

        /* renamed from: a */
        final /* synthetic */ LdrGuidePresenter f99220a;

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract.ILdrView.IViewDelegate
        /* renamed from: a */
        public void mo141403a() {
            this.f99220a.f99218a.mo141428a();
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract.ILdrView.IViewDelegate
        /* renamed from: b */
        public void mo141405b() {
            this.f99220a.f99218a.mo141429b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38610c(LdrGuidePresenter fVar) {
            this.f99220a = fVar;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.ILdrGuideContract.ILdrView.IViewDelegate
        /* renamed from: a */
        public void mo141404a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "eventKeyList");
            this.f99220a.f99218a.mo141430c();
            ((ILdrGuideContract.ILdrModel) this.f99220a.getModel()).mo141401a(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ILdrGuideContract.ILdrView.IViewDelegate createViewDelegate() {
        return new C38610c(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ILdrGuideContract.ILdrModel) getModel()).mo141400a(new C38609b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter$create$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.f$b */
    public static final class C38609b extends UIGetDataCallback<List<? extends LdrServiceData>> {

        /* renamed from: a */
        final /* synthetic */ LdrGuidePresenter f99219a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38609b(LdrGuidePresenter fVar) {
            this.f99219a = fVar;
        }

        /* renamed from: a */
        public void onSuccessed(List<LdrServiceData> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((ILdrGuideContract.ILdrView) this.f99219a.getView()).mo141402a(list);
            Log.m165389i("LdrGuide", "loadLdrData success");
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            ((ILdrGuideContract.ILdrView) this.f99219a.getView()).mo141402a(CollectionsKt.emptyList());
            Log.m165384e("LdrGuide", "loadLdrData error", errorResult);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LdrGuidePresenter(ILdrGuideContract.ILdrModel bVar, ILdrGuideContract.ILdrView cVar, PresenterDependency aVar) {
        super(bVar, cVar);
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f99218a = aVar;
    }
}

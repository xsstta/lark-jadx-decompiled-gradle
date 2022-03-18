package com.bytedance.ee.bear.templates.banner;

import com.bytedance.ee.bear.templates.banner.TemplateBannerContract;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u0001\u0011B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IModel;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView$IViewDelegate;", "model", "view", "(Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IModel;Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "create", "", "createViewDelegate", "destroy", "onBannerClicked", "banner", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.banner.f */
public final class TemplateBannerPresenter extends BasePresenter<TemplateBannerContract.IModel, TemplateBannerContract.IView, TemplateBannerContract.IView.IViewDelegate> implements TemplateBannerContract.IView.IViewDelegate {

    /* renamed from: a */
    public static final Companion f30774a = new Companion(null);

    /* renamed from: b */
    private final C68289a f30775b = new C68289a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public TemplateBannerContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerPresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f30775b.dispose();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f30775b.mo237937a(((TemplateBannerContract.IModel) getModel()).mo43974a().mo237985a(C11678b.m48481e()).mo238001b(new C11445b(this), new C11446c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/banner/BannerDataResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.f$b */
    static final class C11445b<T> implements Consumer<BannerDataResult> {

        /* renamed from: a */
        final /* synthetic */ TemplateBannerPresenter f30776a;

        C11445b(TemplateBannerPresenter fVar) {
            this.f30776a = fVar;
        }

        /* renamed from: a */
        public final void accept(BannerDataResult bannerDataResult) {
            Serializable serializable = bannerDataResult.data;
            Intrinsics.checkExpressionValueIsNotNull(serializable, "it.data");
            ((TemplateBannerContract.IView) this.f30776a.getView()).mo43975a((ArrayList) serializable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.f$c */
    static final class C11446c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ TemplateBannerPresenter f30777a;

        C11446c(TemplateBannerPresenter fVar) {
            this.f30777a = fVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ((TemplateBannerContract.IView) this.f30777a.getView()).mo43976a(false);
            C13479a.m54759a("TemplateBannerPresenter", "fetchBannerData()..fail", th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateBannerPresenter(TemplateBannerContract.IModel aVar, TemplateBannerContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
    }
}

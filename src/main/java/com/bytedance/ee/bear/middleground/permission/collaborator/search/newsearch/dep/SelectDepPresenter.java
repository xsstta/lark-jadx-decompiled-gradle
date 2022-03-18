package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep;

import android.content.Context;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0016B%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IView$IViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter$Dependency;", "context", "Landroid/content/Context;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter$Dependency;Landroid/content/Context;)V", "create", "", "createViewDelegate", "destroy", "onAddUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onRemoveUser", "updateBottomTipsView", "Dependency", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.d */
public final class SelectDepPresenter extends BasePresenter<ISelectDepContract.IModel, ISelectDepContract.IView, ISelectDepContract.IView.IViewDelegate> implements SelectedUserChangeListener {

    /* renamed from: a */
    public final Dependency f26761a;

    /* renamed from: b */
    private final Context f26762b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter$Dependency;", "", "jumpToNextPage", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.d$a */
    public interface Dependency {
        /* renamed from: a */
        void mo37665a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter$createViewDelegate$1", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IView$IViewDelegate;", "onNextClicked", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.d$b */
    public static final class C9892b implements ISelectDepContract.IView.IViewDelegate {

        /* renamed from: a */
        final /* synthetic */ SelectDepPresenter f26763a;

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo37664a() {
            this.f26763a.f26761a.mo37665a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9892b(SelectDepPresenter dVar) {
            this.f26763a = dVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ISelectDepContract.IView.IViewDelegate createViewDelegate() {
        return new C9892b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        ((ISelectDepContract.IModel) getModel()).mo37659b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ISelectDepContract.IModel) getModel()).mo37658a(this);
        m41146b();
    }

    /* renamed from: b */
    private final void m41146b() {
        boolean z;
        int size = ((ISelectDepContract.IModel) getModel()).mo37657a().size();
        ISelectDepContract.IView bVar = (ISelectDepContract.IView) getView();
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo37662a(z);
        String a = C10539a.m43639a(this.f26762b, R.string.Doc_Permission_AddUserSelectedTips, "count", String.valueOf(size));
        Intrinsics.checkExpressionValueIsNotNull(a, "tips");
        ((ISelectDepContract.IView) getView()).mo37661a(a);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: a */
    public void mo37126a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        m41146b();
        if (((ISelectDepContract.IModel) getModel()).mo37657a().size() == 1) {
            ((ISelectDepContract.IView) getView()).mo37660a();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: b */
    public void mo37127b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        m41146b();
        if (((ISelectDepContract.IModel) getModel()).mo37657a().size() == 0) {
            ((ISelectDepContract.IView) getView()).mo37663b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectDepPresenter(ISelectDepContract.IModel aVar, ISelectDepContract.IView bVar, Dependency aVar2, Context context) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar2, "dependency");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f26761a = aVar2;
        this.f26762b = context;
    }
}

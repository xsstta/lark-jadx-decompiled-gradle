package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0003\u0018\u0019\u001aB%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IView$IViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter$Dependency;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter$Dependency;Landroidx/fragment/app/FragmentActivity;)V", "create", "", "createViewDelegate", "onAddUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onKeywordChange", "keyword", "", "onRemoveUser", "updateBottomTipsView", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.d */
public final class NewSearchUserPresenter extends BasePresenter<INewSearchUserContract.IModel, INewSearchUserContract.IView, INewSearchUserContract.IView.IViewDelegate> implements SelectedUserChangeListener {

    /* renamed from: b */
    public static final Companion f26775b = new Companion(null);

    /* renamed from: a */
    public final Dependency f26776a;

    /* renamed from: c */
    private final FragmentActivity f26777c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter$Dependency;", "", "jumpToNextPage", "", "jumpToSelectedDep", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.d$b */
    public interface Dependency {
        /* renamed from: a */
        void mo37681a();

        /* renamed from: b */
        void mo37682b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter;)V", "onDepEntranceClicked", "", "onNextClicked", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.d$c */
    public final class ViewDelegate implements INewSearchUserContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo37679a() {
            NewSearchUserPresenter.this.f26776a.mo37682b();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo37680b() {
            NewSearchUserPresenter.this.f26776a.mo37681a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public INewSearchUserContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((INewSearchUserContract.IModel) getModel()).mo37672a(this);
        m41177b();
    }

    /* renamed from: b */
    private final void m41177b() {
        boolean z;
        int size = ((INewSearchUserContract.IModel) getModel()).mo37671a().size();
        INewSearchUserContract.IView bVar = (INewSearchUserContract.IView) getView();
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo37675a(z);
        String a = C10539a.m43639a(this.f26777c, R.string.Doc_Permission_AddUserSelectedTips, "count", String.valueOf(size));
        Intrinsics.checkExpressionValueIsNotNull(a, "tips");
        ((INewSearchUserContract.IView) getView()).mo37674a(a);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: a */
    public void mo37126a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        m41177b();
        if (((INewSearchUserContract.IModel) getModel()).mo37671a().size() == 1) {
            ((INewSearchUserContract.IView) getView()).mo37673a();
        }
    }

    /* renamed from: a */
    public final void mo37686a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((INewSearchUserContract.IView) getView()).mo37677c();
        } else {
            ((INewSearchUserContract.IView) getView()).mo37678d();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: b */
    public void mo37127b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        m41177b();
        if (((INewSearchUserContract.IModel) getModel()).mo37671a().size() == 0) {
            ((INewSearchUserContract.IView) getView()).mo37676b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewSearchUserPresenter(INewSearchUserContract.IModel aVar, INewSearchUserContract.IView bVar, Dependency bVar2, FragmentActivity fragmentActivity) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        this.f26776a = bVar2;
        this.f26777c = fragmentActivity;
    }
}

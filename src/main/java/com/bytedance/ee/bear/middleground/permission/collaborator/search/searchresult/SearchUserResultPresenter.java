package com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.SearchUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u001e\u001fB%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView$IDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "model", "view", "fragment", "Landroidx/fragment/app/Fragment;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView;Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getParams", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "create", "", "createViewDelegate", "destroy", "loadMore", "onAddUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onKeywordChange", "keyword", "", "onRemoveUser", "search", "Companion", "Delegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.d */
public final class SearchUserResultPresenter extends BasePresenter<ISearchUserResultContract.IModel, ISearchUserResultContract.IView, ISearchUserResultContract.IView.IDelegate> implements SelectedUserChangeListener {

    /* renamed from: a */
    public static final Companion f26588a = new Companion(null);

    /* renamed from: b */
    private final Fragment f26589b;

    /* renamed from: c */
    private final InviteMemberParams f26590c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Fragment mo37482c() {
        return this.f26589b;
    }

    /* renamed from: d */
    public final InviteMemberParams mo37483d() {
        return this.f26590c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter$Delegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView$IDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter;)V", "onBlockUserClick", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onItemSelected", "onItemUnSelected", "onLoadMore", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.d$b */
    public final class Delegate implements ISearchUserResultContract.IView.IDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView.IDelegate
        /* renamed from: a */
        public void mo37464a() {
            SearchUserResultPresenter.this.mo37481b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView.IDelegate
        /* renamed from: a */
        public void mo37465a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            ((ISearchUserResultContract.IModel) SearchUserResultPresenter.this.getModel()).mo37451a(userInfo);
            PermissionAnalytic.m39405a(SearchUserResultPresenter.this.mo37483d().mo36834a(), SearchUserResultPresenter.this.mo37483d().mo36835b(), userInfo);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView.IDelegate
        /* renamed from: b */
        public void mo37466b(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            ((ISearchUserResultContract.IModel) SearchUserResultPresenter.this.getModel()).mo37454b(userInfo);
            PermissionAnalytic.m39405a(SearchUserResultPresenter.this.mo37483d().mo36834a(), SearchUserResultPresenter.this.mo37483d().mo36835b(), userInfo);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView.IDelegate
        /* renamed from: c */
        public void mo37467c(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            Locale d = C4484g.m18494b().mo17253d();
            Context context = SearchUserResultPresenter.this.mo37482c().getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(context, "fragment.context!!");
            Intrinsics.checkExpressionValueIsNotNull(d, "locale");
            NotNotifyOperator.m41294a(context, userInfo, d, SearchUserResultPresenter.this.mo37483d().mo36834a(), SearchUserResultPresenter.this.mo37483d().mo36839e());
            PermissionAnalytic.m39405a(SearchUserResultPresenter.this.mo37483d().mo36834a(), SearchUserResultPresenter.this.mo37483d().mo36835b(), userInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ISearchUserResultContract.IView.IDelegate createViewDelegate() {
        return new Delegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        ((ISearchUserResultContract.IModel) getModel()).mo37453b(this);
    }

    /* renamed from: b */
    public final void mo37481b() {
        C13479a.m54764b("SearchUserResultPresenter", "loadMore()...");
        ((ISearchUserResultContract.IModel) getModel()).mo37449a(new C9859c(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("SearchUserResultPresenter", "create()...");
        ((ISearchUserResultContract.IModel) getModel()).mo37450a(this);
        ((ISearchUserResultContract.IView) getView()).mo37458a(((ISearchUserResultContract.IModel) getModel()).mo37448a());
        ((ISearchUserResultContract.IView) getView()).mo37455a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter$loadMore$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.d$c */
    public static final class C9859c implements AbstractC5204e<SearchUserResult> {

        /* renamed from: a */
        final /* synthetic */ SearchUserResultPresenter f26592a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9859c(SearchUserResultPresenter dVar) {
            this.f26592a = dVar;
        }

        /* renamed from: a */
        public void mo20806a(SearchUserResult searchUserResult) {
            Intrinsics.checkParameterIsNotNull(searchUserResult, "result");
            C13479a.m54764b("SearchUserResultPresenter", "loadMore()...succeed");
            ((ISearchUserResultContract.IView) this.f26592a.getView()).mo37461b(searchUserResult);
            ((ISearchUserResultContract.IView) this.f26592a.getView()).mo37459a(searchUserResult.hasMore);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            C13479a.m54764b("SearchUserResultPresenter", "loadMore()...failed: " + th);
            ((ISearchUserResultContract.IView) this.f26592a.getView()).mo37463c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter$search$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.d$d */
    public static final class C9860d implements AbstractC5204e<SearchUserResult> {

        /* renamed from: a */
        final /* synthetic */ SearchUserResultPresenter f26593a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9860d(SearchUserResultPresenter dVar) {
            this.f26593a = dVar;
        }

        /* renamed from: a */
        public void mo20806a(SearchUserResult searchUserResult) {
            Intrinsics.checkParameterIsNotNull(searchUserResult, "result");
            C13479a.m54764b("SearchUserResultPresenter", "search()...succeed");
            ((ISearchUserResultContract.IView) this.f26593a.getView()).mo37460b();
            ((ISearchUserResultContract.IView) this.f26593a.getView()).mo37456a(searchUserResult);
            ((ISearchUserResultContract.IView) this.f26593a.getView()).mo37459a(searchUserResult.hasMore);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            C13479a.m54758a("SearchUserResultPresenter", "search()...failed: " + th);
            ((ISearchUserResultContract.IView) this.f26593a.getView()).mo37460b();
            ((ISearchUserResultContract.IView) this.f26593a.getView()).mo37459a(false);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: a */
    public void mo37126a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        ((ISearchUserResultContract.IView) getView()).mo37462b(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: b */
    public void mo37127b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        ((ISearchUserResultContract.IView) getView()).mo37457a(userInfo);
    }

    /* renamed from: a */
    public final void mo37480a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        m40852b(str);
    }

    /* renamed from: b */
    private final void m40852b(String str) {
        C13479a.m54764b("SearchUserResultPresenter", "search()...keyword = " + C13598b.m55197d(str));
        ((ISearchUserResultContract.IView) getView()).mo37455a();
        ((ISearchUserResultContract.IModel) getModel()).mo37452a(str, new C9860d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchUserResultPresenter(ISearchUserResultContract.IModel aVar, ISearchUserResultContract.IView bVar, Fragment fragment, InviteMemberParams inviteMemberParams) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
        this.f26589b = fragment;
        this.f26590c = inviteMemberParams;
    }
}

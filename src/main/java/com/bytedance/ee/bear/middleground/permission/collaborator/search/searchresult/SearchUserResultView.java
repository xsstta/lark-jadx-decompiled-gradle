package com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.C9884g;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.SearchUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J \u0010#\u001a\u00020\u00152\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0016J\u0012\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0012\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView;", "Lcom/scwang/smartrefresh/layout/listener/OnLoadmoreListener;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/ee/bear/service/ServiceContext;Ljava/util/ArrayList;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IView$IDelegate;", "searchUserAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResultAdapter;", "addSelectedUser", "", "userInfo", "addUsers", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "canLoadMore", "enable", "", "create", "destroy", "finisLoadMore", "hideLoading", "initAndGetEmptyView", "initRecyclerView", "initSelectedUsers", "userInfos", "onLoadmore", "refreshlayout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "removeSelectedUser", "setViewDelegate", "viewDelegate", "showLoading", "showUsers", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.e */
public final class SearchUserResultView implements ISearchUserResultContract.IView, AbstractC27137a {

    /* renamed from: b */
    public static final Companion f26594b = new Companion(null);

    /* renamed from: a */
    public ISearchUserResultContract.IView.IDelegate f26595a;

    /* renamed from: c */
    private C9884g f26596c;

    /* renamed from: d */
    private final Context f26597d;

    /* renamed from: e */
    private final View f26598e;

    /* renamed from: f */
    private final C10917c f26599f;

    /* renamed from: g */
    private final ArrayList<UserInfo> f26600g;

    /* renamed from: h */
    private final InviteMemberParams f26601h;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultView$initRecyclerView$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.e$c */
    public static final class C9862c extends RecyclerView.OnScrollListener {
        C9862c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 && recyclerView.requestFocus()) {
                C10548d.m43697a(recyclerView);
            }
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m40870d();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: c */
    public void mo37463c() {
        ((SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout)).mo96416n();
    }

    /* renamed from: e */
    private final View m40871e() {
        TextView textView = new TextView(this.f26597d);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setTextColor(this.f26597d.getResources().getColor(R.color.space_kit_n500));
        textView.setText(R.string.Doc_Share_NothingFound);
        return textView;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: a */
    public void mo37455a() {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permSearchUserRefreshLayout");
        smartRefreshLayout.setVisibility(8);
        BearLottieView bearLottieView = (BearLottieView) this.f26598e.findViewById(R.id.permSearchUserLoading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "rootView.permSearchUserLoading");
        bearLottieView.setVisibility(0);
        ((BearLottieView) this.f26598e.findViewById(R.id.permSearchUserLoading)).playAnimation();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: b */
    public void mo37460b() {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permSearchUserRefreshLayout");
        smartRefreshLayout.setVisibility(0);
        ((BearLottieView) this.f26598e.findViewById(R.id.permSearchUserLoading)).cancelAnimation();
        BearLottieView bearLottieView = (BearLottieView) this.f26598e.findViewById(R.id.permSearchUserLoading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "rootView.permSearchUserLoading");
        bearLottieView.setVisibility(8);
    }

    /* renamed from: d */
    private final void m40870d() {
        C9884g gVar = new C9884g(this.f26597d, C4484g.m18494b().mo17253d(), ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f(), this.f26601h);
        this.f26596c = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar.mo37645a((List<UserInfo>) this.f26600g);
        C9884g gVar2 = this.f26596c;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar2.mo70683c(true);
        C9884g gVar3 = this.f26596c;
        if (gVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar3.mo70686e(m40871e());
        C9884g gVar4 = this.f26596c;
        if (gVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar4.mo37641a((C9884g.AbstractC9887a) new C9861b(this));
        RecyclerView recyclerView = (RecyclerView) this.f26598e.findViewById(R.id.permSearchUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.permSearchUserList");
        C9884g gVar5 = this.f26596c;
        if (gVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        recyclerView.setAdapter(gVar5);
        RecyclerView recyclerView2 = (RecyclerView) this.f26598e.findViewById(R.id.permSearchUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.permSearchUserList");
        recyclerView2.setLayoutManager(new LinearLayoutManagerWrapper(this.f26597d));
        ((RecyclerView) this.f26598e.findViewById(R.id.permSearchUserList)).addOnScrollListener(new C9862c());
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permSearchUserRefreshLayout");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f26597d));
        ((SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout)).mo96368b(this);
        mo37459a(false);
    }

    /* renamed from: a */
    public void setViewDelegate(ISearchUserResultContract.IView.IDelegate aVar) {
        this.f26595a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultView$initRecyclerView$1", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResultAdapter$OnItemClickListener;", "onBlockUserClick", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onItemClick", "viewHolder", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResultAdapter$SearchUserViewHolder;", "item", "isSelected", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.e$b */
    public static final class C9861b implements C9884g.AbstractC9887a {

        /* renamed from: a */
        final /* synthetic */ SearchUserResultView f26602a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9861b(SearchUserResultView eVar) {
            this.f26602a = eVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.C9884g.AbstractC9887a
        /* renamed from: a */
        public void mo37488a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            ISearchUserResultContract.IView.IDelegate aVar = this.f26602a.f26595a;
            if (aVar != null) {
                aVar.mo37467c(userInfo);
            }
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.C9884g.AbstractC9887a
        /* renamed from: a */
        public void mo37487a(C9884g.C9888b bVar, UserInfo userInfo, boolean z) {
            Intrinsics.checkParameterIsNotNull(bVar, "viewHolder");
            Intrinsics.checkParameterIsNotNull(userInfo, "item");
            if (z) {
                ISearchUserResultContract.IView.IDelegate aVar = this.f26602a.f26595a;
                if (aVar != null) {
                    aVar.mo37465a(userInfo);
                    return;
                }
                return;
            }
            ISearchUserResultContract.IView.IDelegate aVar2 = this.f26602a.f26595a;
            if (aVar2 != null) {
                aVar2.mo37466b(userInfo);
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
    public void onLoadmore(AbstractC27129h hVar) {
        ISearchUserResultContract.IView.IDelegate aVar = this.f26595a;
        if (aVar != null) {
            aVar.mo37464a();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: a */
    public void mo37457a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C9884g gVar = this.f26596c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar.mo37646b(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: b */
    public void mo37462b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C9884g gVar = this.f26596c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar.mo37644a(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: a */
    public void mo37456a(SearchUserResult searchUserResult) {
        Intrinsics.checkParameterIsNotNull(searchUserResult, "result");
        C9884g gVar = this.f26596c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar.mo37651d(searchUserResult.existMembers);
        C9884g gVar2 = this.f26596c;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar2.mo70690f(searchUserResult.list);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: b */
    public void mo37461b(SearchUserResult searchUserResult) {
        Intrinsics.checkParameterIsNotNull(searchUserResult, "result");
        C9884g gVar = this.f26596c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar.mo37652e(searchUserResult.existMembers);
        C9884g gVar2 = this.f26596c;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar2.mo37649c((List<UserInfo>) searchUserResult.list);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: a */
    public void mo37458a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfos");
        C9884g gVar = this.f26596c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserAdapter");
        }
        gVar.mo37647b((List<UserInfo>) arrayList);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IView
    /* renamed from: a */
    public void mo37459a(boolean z) {
        ((SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout)).mo96416n();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26598e.findViewById(R.id.permSearchUserRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permSearchUserRefreshLayout");
        smartRefreshLayout.mo96415m(z);
    }

    public SearchUserResultView(Context context, View view, C10917c cVar, ArrayList<UserInfo> arrayList, InviteMemberParams inviteMemberParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
        Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
        this.f26597d = context;
        this.f26598e = view;
        this.f26599f = cVar;
        this.f26600g = arrayList;
        this.f26601h = inviteMemberParams;
    }
}

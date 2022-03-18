package com.bytedance.ee.bear.list.folderselect.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.list.C8707s;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folderselect.search.C8434b;
import com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0012\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020 H\u0003J\u0018\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u00105\u001a\u00020 H\u0016J\b\u00106\u001a\u00020 H\u0016J\u0016\u00107\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(09H\u0016R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00180\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0010*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0010*\u0004\u0018\u00010\u001c0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0010*\u0004\u0018\u00010\u001e0\u001eX\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderView;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView;", "Lcom/bytedance/ee/bear/list/folderselect/search/SearchAdapter$OnItemClickListener;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "operateBean", "Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;)V", "adapter", "Lcom/bytedance/ee/bear/list/folderselect/search/SearchAdapter;", "clearIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "delegate", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IView$Delegate;", "emptyView", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEmptyState;", "loadingView", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "recyclerView", "Lcom/bytedance/ee/bear/widgets/BaseRecyclerView;", "refreshLayout", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "searchInput", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEditText;", "titleBar", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "create", "", "destroy", "doSearch", "s", "Landroid/text/Editable;", "initView", "onItemClick", "item", "Lcom/bytedance/ee/bear/list/dto/Document;", "position", "", "refreshNetworkState", "isConnect", "", "setHasMoreState", "isHasMore", "setTitle", "title", "", "setViewDelegate", "viewDelegate", "showEmpty", "showLoading", "showResult", "documents", "", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folderselect.search.f */
public final class SearchFolderView implements ISearchFolderContract.IView, C8434b.AbstractC8436a {

    /* renamed from: d */
    public static final Companion f22806d = new Companion(null);

    /* renamed from: a */
    public final SpaceEditText f22807a;

    /* renamed from: b */
    public ISearchFolderContract.IView.Delegate f22808b;

    /* renamed from: c */
    public C8434b f22809c;

    /* renamed from: e */
    private final BaseTitleBar f22810e;

    /* renamed from: f */
    private final ImageView f22811f;

    /* renamed from: g */
    private final SmartRefreshLayout f22812g;

    /* renamed from: h */
    private final BaseRecyclerView f22813h;

    /* renamed from: i */
    private final SpaceEmptyState f22814i;

    /* renamed from: j */
    private final BearLottieView f22815j;

    /* renamed from: k */
    private final Context f22816k;

    /* renamed from: l */
    private final View f22817l;

    /* renamed from: m */
    private final C10917c f22818m;

    /* renamed from: n */
    private final DocOperateBean f22819n;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderView$Companion;", "", "()V", "TAG", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m34999c();
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView
    /* renamed from: a */
    public void mo33010a() {
        SmartRefreshLayout smartRefreshLayout = this.f22812g;
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "refreshLayout");
        smartRefreshLayout.setVisibility(8);
        BearLottieView bearLottieView = this.f22815j;
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loadingView");
        bearLottieView.setVisibility(8);
        SpaceEmptyState spaceEmptyState = this.f22814i;
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "emptyView");
        spaceEmptyState.setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView
    /* renamed from: b */
    public void mo33013b() {
        SmartRefreshLayout smartRefreshLayout = this.f22812g;
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "refreshLayout");
        smartRefreshLayout.setVisibility(8);
        BearLottieView bearLottieView = this.f22815j;
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loadingView");
        bearLottieView.setVisibility(0);
        SpaceEmptyState spaceEmptyState = this.f22814i;
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "emptyView");
        spaceEmptyState.setVisibility(8);
    }

    /* renamed from: c */
    private final void m34999c() {
        this.f22810e.setLeftClickListener(new C8445b(this));
        this.f22812g.mo96368b(new C8446c(this));
        SmartRefreshLayout smartRefreshLayout = this.f22812g;
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "refreshLayout");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f22816k));
        this.f22809c = new C8434b(this, this.f22819n, this.f22818m);
        ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16405c().mo237985a(C11678b.m48481e()).mo238001b(new C8447d(this), C8448e.f22823a);
        BaseRecyclerView baseRecyclerView = this.f22813h;
        Intrinsics.checkExpressionValueIsNotNull(baseRecyclerView, "recyclerView");
        C8434b bVar = this.f22809c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        baseRecyclerView.setAdapter(bVar);
        BaseRecyclerView baseRecyclerView2 = this.f22813h;
        Intrinsics.checkExpressionValueIsNotNull(baseRecyclerView2, "recyclerView");
        baseRecyclerView2.setLayoutManager(new DocsLinearLayoutManager(this.f22816k));
        this.f22807a.addTextChangedListener(new C8449f(this));
        this.f22807a.setOnEditorActionListener(new C8450g(this));
        C10548d.m43703b(this.f22807a);
        this.f22811f.setOnClickListener(new View$OnClickListenerC8451h(this));
        this.f22817l.setOnClickListener(View$OnClickListenerC8452i.f22827a);
    }

    /* renamed from: a */
    public void setViewDelegate(ISearchFolderContract.IView.Delegate aVar) {
        this.f22808b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/list/folderselect/search/SearchFolderView$initView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$b */
    public static final class C8445b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SearchFolderView f22820a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8445b(SearchFolderView fVar) {
            this.f22820a = fVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ISearchFolderContract.IView.Delegate aVar = this.f22820a.f22808b;
            if (aVar != null) {
                aVar.mo33017b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$e */
    public static final class C8448e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C8448e f22823a = new C8448e();

        C8448e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SearchFolderView", "findLoginUser failed", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/list/folderselect/search/SearchFolderView$initView$5", "Lcom/bytedance/ee/bear/list/TextWatcherImpl;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$f */
    public static final class C8449f extends C8707s {

        /* renamed from: a */
        final /* synthetic */ SearchFolderView f22824a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8449f(SearchFolderView fVar) {
            this.f22824a = fVar;
        }

        @Override // com.bytedance.ee.bear.list.C8707s
        public void afterTextChanged(Editable editable) {
            this.f22824a.mo33045a(editable);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$i */
    public static final class View$OnClickListenerC8452i implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC8452i f22827a = new View$OnClickListenerC8452i();

        View$OnClickListenerC8452i() {
        }

        public final void onClick(View view) {
            C13479a.m54764b("SearchFolderView", "intercept clicked");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$c */
    public static final class C8446c implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ SearchFolderView f22821a;

        C8446c(SearchFolderView fVar) {
            this.f22821a = fVar;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            ISearchFolderContract.IView.Delegate aVar = this.f22821a.f22808b;
            if (aVar != null) {
                aVar.mo33014a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$d */
    public static final class C8447d<T> implements Consumer<AccountService.Account> {

        /* renamed from: a */
        final /* synthetic */ SearchFolderView f22822a;

        C8447d(SearchFolderView fVar) {
            this.f22822a = fVar;
        }

        /* renamed from: a */
        public final void accept(AccountService.Account account) {
            SearchFolderView.m34998a(this.f22822a).mo33019a(account);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$h */
    public static final class View$OnClickListenerC8451h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFolderView f22826a;

        View$OnClickListenerC8451h(SearchFolderView fVar) {
            this.f22826a = fVar;
        }

        public final void onClick(View view) {
            this.f22826a.f22807a.setText("");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C8434b m34998a(SearchFolderView fVar) {
        C8434b bVar = fVar.f22809c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo33045a(Editable editable) {
        String str;
        int i;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        ImageView imageView = this.f22811f;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "clearIcon");
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ISearchFolderContract.IView.Delegate aVar = this.f22808b;
        if (aVar != null) {
            aVar.mo33016a(str);
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView
    /* renamed from: a */
    public void mo33011a(List<? extends Document> list) {
        Intrinsics.checkParameterIsNotNull(list, "documents");
        this.f22812g.mo96416n();
        SmartRefreshLayout smartRefreshLayout = this.f22812g;
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "refreshLayout");
        smartRefreshLayout.setVisibility(0);
        BearLottieView bearLottieView = this.f22815j;
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "loadingView");
        bearLottieView.setVisibility(8);
        SpaceEmptyState spaceEmptyState = this.f22814i;
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "emptyView");
        spaceEmptyState.setVisibility(8);
        C8434b bVar = this.f22809c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        bVar.mo33021a((List<Document>) list);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IView
    /* renamed from: a */
    public void mo33012a(boolean z) {
        SmartRefreshLayout smartRefreshLayout = this.f22812g;
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "refreshLayout");
        smartRefreshLayout.mo96415m(z);
        SmartRefreshLayout smartRefreshLayout2 = this.f22812g;
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout2, "refreshLayout");
        smartRefreshLayout2.mo96401h(!z);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.C8434b.AbstractC8436a
    /* renamed from: a */
    public void mo33022a(Document document, int i) {
        Intrinsics.checkParameterIsNotNull(document, "item");
        C10548d.m43697a((View) this.f22807a);
        ISearchFolderContract.IView.Delegate aVar = this.f22808b;
        if (aVar != null) {
            aVar.mo33015a(document);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.f$g */
    public static final class C8450g implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ SearchFolderView f22825a;

        C8450g(SearchFolderView fVar) {
            this.f22825a = fVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return true;
            }
            SearchFolderView fVar = this.f22825a;
            SpaceEditText spaceEditText = fVar.f22807a;
            Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "searchInput");
            fVar.mo33045a(spaceEditText.getText());
            return true;
        }
    }

    public SearchFolderView(Context context, View view, C10917c cVar, DocOperateBean docOperateBean) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(docOperateBean, "operateBean");
        this.f22816k = context;
        this.f22817l = view;
        this.f22818m = cVar;
        this.f22819n = docOperateBean;
        this.f22810e = (BaseTitleBar) view.findViewById(R.id.search_folder_title_bar);
        this.f22807a = (SpaceEditText) view.findViewById(R.id.search_bar_item_search_bar);
        this.f22811f = (ImageView) view.findViewById(R.id.search_bar_item_clear_icon);
        this.f22812g = (SmartRefreshLayout) view.findViewById(R.id.search_refresh_layout);
        this.f22813h = (BaseRecyclerView) view.findViewById(R.id.search_folder_result);
        this.f22814i = (SpaceEmptyState) view.findViewById(R.id.search_not_found_empty_state);
        this.f22815j = (BearLottieView) view.findViewById(R.id.search_loading);
    }
}

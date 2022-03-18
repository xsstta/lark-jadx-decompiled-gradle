package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9753a;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010-\u001a\u00020&H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u0018H\u0016J\u0012\u00100\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u00102\u001a\u00020&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\b\u00106\u001a\u00020&H\u0016J\u0018\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u000205H\u0016R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView;", "fragment", "Landroidx/fragment/app/Fragment;", "view", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "permType", "", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;I)V", "TAG", "", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "getAccount", "()Lcom/bytedance/ee/bear/contract/AccountService$Account;", "account$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/BaseCollaboratorManageAdapter;", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView$IViewDelegate;", "hasMore", "", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "loadingDialog$delegate", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale$delegate", "networkState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "create", "", "destroy", "finishLoadMore", "getAdapter", "setDescVisible", "visible", "setHasMore", "setLoadMoreEnable", "setLoading", "show", "setViewDelegate", "viewDelegate", "showCollaborators", "collaborators", "", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "showLoadingImmediately", "updateCollaborator", "position", "userInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j */
public final class DocCollaboratorSubView implements DocCollaboratorSubContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26426a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocCollaboratorSubView.class), "account", "getAccount()Lcom/bytedance/ee/bear/contract/AccountService$Account;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocCollaboratorSubView.class), "locale", "getLocale()Ljava/util/Locale;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocCollaboratorSubView.class), "loadingDialog", "getLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};

    /* renamed from: b */
    public final String f26427b = "DocCollaboratorSubView";

    /* renamed from: c */
    public DocCollaboratorSubContract.IView.IViewDelegate f26428c;

    /* renamed from: d */
    public ConnectionService.NetworkState f26429d;

    /* renamed from: e */
    public final View f26430e;

    /* renamed from: f */
    public final DocPermSetInfo f26431f;

    /* renamed from: g */
    private AbstractC9753a f26432g;

    /* renamed from: h */
    private final Lazy f26433h = LazyKt.lazy(C9804a.INSTANCE);

    /* renamed from: i */
    private final Lazy f26434i = LazyKt.lazy(C9811h.INSTANCE);

    /* renamed from: j */
    private boolean f26435j;

    /* renamed from: k */
    private final Lazy f26436k = LazyKt.lazy(new C9810g(this));

    /* renamed from: l */
    private final Fragment f26437l;

    /* renamed from: m */
    private final int f26438m;

    /* renamed from: d */
    private final AccountService.Account m40493d() {
        Lazy lazy = this.f26433h;
        KProperty kProperty = f26426a[0];
        return (AccountService.Account) lazy.getValue();
    }

    /* renamed from: e */
    private final Locale m40494e() {
        Lazy lazy = this.f26434i;
        KProperty kProperty = f26426a[1];
        return (Locale) lazy.getValue();
    }

    /* renamed from: f */
    private final C11824c m40495f() {
        Lazy lazy = this.f26436k;
        KProperty kProperty = f26426a[2];
        return (C11824c) lazy.getValue();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: b */
    public void mo37265b() {
        m40495f().m49046e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$a */
    static final class C9804a extends Lambda implements Function0<AccountService.Account> {
        public static final C9804a INSTANCE = new C9804a();

        C9804a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountService.Account invoke() {
            return ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$g */
    static final class C9810g extends Lambda implements Function0<C11824c> {
        final /* synthetic */ DocCollaboratorSubView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9810g(DocCollaboratorSubView jVar) {
            super(0);
            this.this$0 = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.f26430e.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$h */
    static final class C9811h extends Lambda implements Function0<Locale> {
        public static final C9811h INSTANCE = new C9811h();

        C9811h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Locale invoke() {
            return C4484g.m18494b().mo17253d();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: a */
    public void mo37261a() {
        ((SmartRefreshLayout) this.f26430e.findViewById(R.id.refreshLayout)).mo96416n();
    }

    /* renamed from: c */
    public final void mo37322c() {
        boolean z;
        ((SmartRefreshLayout) this.f26430e.findViewById(R.id.refreshLayout)).mo96434w();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26430e.findViewById(R.id.refreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "view.refreshLayout");
        boolean z2 = false;
        if (this.f26435j) {
            ConnectionService.NetworkState networkState = this.f26429d;
            if (networkState != null) {
                z = networkState.mo20041b();
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        smartRefreshLayout.mo96415m(z2);
    }

    /* renamed from: g */
    private final AbstractC9753a m40496g() {
        boolean z;
        AccountService.Account d = m40493d();
        Locale e = m40494e();
        boolean q = this.f26431f.mo38844q();
        if ((!this.f26431f.mo38844q() || !this.f26431f.ab()) && !this.f26431f.mo38816Y()) {
            z = false;
        } else {
            z = true;
        }
        C9812b bVar = new C9812b(d, e, q, z);
        bVar.mo37326a((C9812b.AbstractC9818b) new C9807d(this));
        bVar.mo37325a((C9812b.AbstractC9817a) new C9808e(this));
        bVar.mo37327a((C9812b.AbstractC9819c) new C9809f(this));
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        String str;
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26430e.findViewById(R.id.refreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "view.refreshLayout");
        Context context = this.f26430e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        ((SmartRefreshLayout) this.f26430e.findViewById(R.id.refreshLayout)).mo96368b(new C9805b(this));
        RecyclerView recyclerView = (RecyclerView) this.f26430e.findViewById(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "view.recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this.f26430e.getContext()));
        this.f26432g = m40496g();
        RecyclerView recyclerView2 = (RecyclerView) this.f26430e.findViewById(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "view.recyclerView");
        AbstractC9753a aVar = this.f26432g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(aVar);
        C5084ad.m20847d().mo20037a().mo5923a(this.f26437l, new C9806c(this));
        TextView textView = (TextView) this.f26430e.findViewById(R.id.tabDesc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tabDesc");
        if (this.f26438m == 1) {
            str = this.f26430e.getContext().getString(R.string.CreationMobile_Wiki_Page_CurrentNSub_desc);
        } else {
            str = this.f26430e.getContext().getString(R.string.CreationMobile_Wiki_Page_Current_desc);
        }
        textView.setText(str);
    }

    /* renamed from: a */
    public void setViewDelegate(DocCollaboratorSubContract.IView.IViewDelegate aVar) {
        this.f26428c = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: a */
    public void mo37264a(boolean z) {
        this.f26435j = z;
        mo37322c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$b */
    static final class C9805b implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubView f26439a;

        C9805b(DocCollaboratorSubView jVar) {
            this.f26439a = jVar;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            DocCollaboratorSubContract.IView.IViewDelegate aVar = this.f26439a.f26428c;
            if (aVar != null) {
                aVar.mo37268a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: b */
    public void mo37266b(boolean z) {
        if (z) {
            m40495f().mo45304d();
        } else {
            m40495f().mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: c */
    public void mo37267c(boolean z) {
        int i;
        TextView textView = (TextView) this.f26430e.findViewById(R.id.tabDesc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tabDesc");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$c */
    static final class C9806c<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubView f26440a;

        C9806c(DocCollaboratorSubView jVar) {
            this.f26440a = jVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            String str = this.f26440a.f26427b;
            C13479a.m54764b(str, "observeNetwork()...networkState = " + networkState);
            this.f26440a.f26429d = networkState;
            this.f26440a.mo37322c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: a */
    public void mo37263a(List<? extends UserInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "collaborators");
        AbstractC9753a aVar = this.f26432g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo70690f(list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onEditPermission"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$d */
    public static final class C9807d implements C9812b.AbstractC9818b {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubView f26441a;

        C9807d(DocCollaboratorSubView jVar) {
            this.f26441a = jVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.AbstractC9818b
        public final void onEditPermission(int i, UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            DocCollaboratorSubContract.IView.IViewDelegate aVar = this.f26441a.f26428c;
            if (aVar != null) {
                aVar.mo37269a(i, userInfo);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView
    /* renamed from: a */
    public void mo37262a(int i, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        AbstractC9753a aVar = this.f26432g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo70664a(i, userInfo);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onAvatarClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$e */
    public static final class C9808e implements C9812b.AbstractC9817a {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubView f26442a;

        C9808e(DocCollaboratorSubView jVar) {
            this.f26442a = jVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.AbstractC9817a
        public final void onAvatarClick(int i, UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22257a(userInfo.getId(), this.f26442a.f26431f.mo38828d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onTipsClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.j$f */
    public static final class C9809f implements C9812b.AbstractC9819c {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubView f26443a;

        C9809f(DocCollaboratorSubView jVar) {
            this.f26443a = jVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.AbstractC9819c
        public final void onTipsClick(int i, UserInfo userInfo) {
            boolean z;
            int i2;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            if (userInfo.getOwnerType() == 5 || userInfo.getOwnerType() == 11) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = R.string.Doc_Share_FolderMembersExternalContent;
            } else {
                i2 = R.string.Doc_Permission_ExternalSharingTooltip;
            }
            Context context = this.f26443a.f26430e.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            new BearUDDialogBuilder(context).mo45362d(i2).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_OfflineKnow, (DialogInterface.OnClickListener) null).mo45361c(false).mo45359b();
        }
    }

    public DocCollaboratorSubView(Fragment fragment, View view, DocPermSetInfo docPermSetInfo, int i) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26437l = fragment;
        this.f26430e = view;
        this.f26431f = docPermSetInfo;
        this.f26438m = i;
    }
}

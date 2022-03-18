package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentAdapter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.pathnavigationview.PathNavigationAdapter;
import com.bytedance.ee.bear.pathnavigationview.PathNodeClickListener;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\rH\u0016J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\rH\u0016J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\rH\u0016J\u0012\u0010,\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0003H\u0016J\u0010\u00103\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u00104\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016JP\u00105\u001a\u00020\u00182\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`92\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u000307j\b\u0012\u0004\u0012\u00020\u0003`92\u0016\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u001f07j\b\u0012\u0004\u0012\u00020\u001f`9H\u0016J\u0012\u0010<\u001a\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010>\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\rH\u0016J\b\u0010A\u001a\u00020\u0018H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView;", "Lcom/bytedance/ee/bear/pathnavigationview/PathNodeClickListener;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter$DepItemClickListener;", "Lcom/scwang/smartrefresh/layout/listener/OnLoadmoreListener;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "uid", "", "canReAdd", "", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Z)V", "anim", "Landroid/animation/ObjectAnimator;", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView$Delegate;", "depAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter;", "navigationAdapter", "Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationAdapter;", "addDepartment", "", "department", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "addSelectedDep", "visibleDepartment", "addSelectedTopUser", "visibleTopUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "canLoadMore", "enable", "create", "destroy", "finishLoadmore", "hideEmpty", "hideLoading", "onDepItemClick", "isSelected", "onDepNextClick", "onDepTopUserItemClick", "topUserInDep", "onLoadmore", "refreshlayout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "onPathNodeClick", "index", "", "node", "removeSelectedDep", "removeSelectedTopUser", "setOriginUsers", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "selectedDeps", "selectedTopUsers", "setViewDelegate", "viewDelegate", "showDepartment", "showEmpty", "isRoot", "showLoading", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.f */
public final class DepartmentView implements PathNodeClickListener<VisibleDepartment>, DepartmentAdapter.DepItemClickListener, IDepartmentContract.IView, AbstractC27137a {

    /* renamed from: a */
    private PathNavigationAdapter<VisibleDepartment> f26717a;

    /* renamed from: b */
    private DepartmentAdapter f26718b;

    /* renamed from: c */
    private IDepartmentContract.IView.Delegate f26719c;

    /* renamed from: d */
    private ObjectAnimator f26720d;

    /* renamed from: e */
    private final Context f26721e;

    /* renamed from: f */
    private final View f26722f;

    /* renamed from: g */
    private final String f26723g;

    /* renamed from: h */
    private final boolean f26724h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.f$b */
    static final class View$OnClickListenerC9883b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9883b f26725a = new View$OnClickListenerC9883b();

        View$OnClickListenerC9883b() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentView$create$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.f$a */
    public static final class C9882a extends RecyclerView.OnScrollListener {
        C9882a() {
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

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: a */
    public void mo37625a(boolean z) {
        ((SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout)).mo96416n();
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permDepRefreshLayout");
        smartRefreshLayout.mo96415m(z);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        ObjectAnimator objectAnimator = this.f26720d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: d */
    public void mo37632d() {
        ((SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout)).mo96416n();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: a */
    public void mo37618a() {
        RecyclerView recyclerView = (RecyclerView) this.f26722f.findViewById(R.id.permDepList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.permDepList");
        recyclerView.setVisibility(8);
        BearLottieView bearLottieView = (BearLottieView) this.f26722f.findViewById(R.id.permDepLoading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "rootView.permDepLoading");
        bearLottieView.setVisibility(0);
        ((BearLottieView) this.f26722f.findViewById(R.id.permDepLoading)).playAnimation();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: b */
    public void mo37626b() {
        ((BearLottieView) this.f26722f.findViewById(R.id.permDepLoading)).cancelAnimation();
        BearLottieView bearLottieView = (BearLottieView) this.f26722f.findViewById(R.id.permDepLoading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "rootView.permDepLoading");
        bearLottieView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26722f.findViewById(R.id.permDepList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.permDepList");
        recyclerView.setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: c */
    public void mo37631c() {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permDepRefreshLayout");
        smartRefreshLayout.setVisibility(0);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) this.f26722f.findViewById(R.id.permDepEmptyState);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "rootView.permDepEmptyState");
        spaceEmptyState.setVisibility(8);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f26717a = new PathNavigationAdapter<>();
        RecyclerView recyclerView = (RecyclerView) this.f26722f.findViewById(R.id.permDepPathNavigation);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.permDepPathNavigation");
        PathNavigationAdapter<VisibleDepartment> aVar = this.f26717a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f26722f.findViewById(R.id.permDepPathNavigation);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.permDepPathNavigation");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f26721e, 0, false));
        PathNavigationAdapter<VisibleDepartment> aVar2 = this.f26717a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        aVar2.mo30862a((PathNodeClickListener<VisibleDepartment>) this);
        PathNavigationAdapter<VisibleDepartment> aVar3 = this.f26717a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        aVar3.mo70676b(VisibleDepartment.f26659a.mo37548a(this.f26721e));
        PathNavigationAdapter<VisibleDepartment> aVar4 = this.f26717a;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        aVar4.mo70676b(VisibleDepartment.f26659a.mo37549b(this.f26721e));
        this.f26718b = new DepartmentAdapter(this.f26723g, this.f26724h);
        RecyclerView recyclerView3 = (RecyclerView) this.f26722f.findViewById(R.id.permDepList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.permDepList");
        DepartmentAdapter aVar5 = this.f26718b;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        recyclerView3.setAdapter(aVar5);
        RecyclerView recyclerView4 = (RecyclerView) this.f26722f.findViewById(R.id.permDepList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "rootView.permDepList");
        recyclerView4.setLayoutManager(new LinearLayoutManager(this.f26721e));
        DepartmentAdapter aVar6 = this.f26718b;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar6.mo37565a(this);
        ((RecyclerView) this.f26722f.findViewById(R.id.permDepList)).addOnScrollListener(new C9882a());
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permDepRefreshLayout");
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f26721e));
        ((SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout)).mo96368b(this);
        mo37625a(false);
        this.f26722f.setOnClickListener(View$OnClickListenerC9883b.f26725a);
    }

    /* renamed from: a */
    public void setViewDelegate(IDepartmentContract.IView.Delegate aVar) {
        this.f26719c = aVar;
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
    public void onLoadmore(AbstractC27129h hVar) {
        IDepartmentContract.IView.Delegate aVar = this.f26719c;
        if (aVar != null) {
            aVar.mo37608a();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: a */
    public void mo37620a(Department department) {
        Intrinsics.checkParameterIsNotNull(department, "department");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37562a(department);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: b */
    public void mo37627b(Department department) {
        Intrinsics.checkParameterIsNotNull(department, "department");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37568b(department);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: b */
    public void mo37628b(VisibleDepartment visibleDepartment) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37563a(visibleDepartment);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: a */
    public void mo37621a(VisibleDepartment visibleDepartment) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37569b(visibleDepartment);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: b */
    public void mo37629b(VisibleTopUserInDep visibleTopUserInDep) {
        Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "visibleTopUserInDep");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37564a(visibleTopUserInDep);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: a */
    public void mo37622a(VisibleTopUserInDep visibleTopUserInDep) {
        Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "visibleTopUserInDep");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37570b(visibleTopUserInDep);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: b */
    public void mo37630b(boolean z) {
        int i;
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(smartRefreshLayout, "rootView.permDepRefreshLayout");
        smartRefreshLayout.setVisibility(8);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) this.f26722f.findViewById(R.id.permDepEmptyState);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "rootView.permDepEmptyState");
        spaceEmptyState.setVisibility(0);
        if (z) {
            i = R.string.Doc_Permission_RootDepNoMemberDesc;
        } else {
            i = R.string.Doc_Permission_NoMemberDesc;
        }
        ((SpaceEmptyState) this.f26722f.findViewById(R.id.permDepEmptyState)).setDesc(this.f26721e.getString(i));
    }

    /* renamed from: a */
    public void mo30865a(int i, VisibleDepartment visibleDepartment) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "node");
        ((SmartRefreshLayout) this.f26722f.findViewById(R.id.permDepRefreshLayout)).mo96416n();
        if (TextUtils.equals(visibleDepartment.mo37540b(), "root_contact")) {
            IDepartmentContract.IView.Delegate aVar = this.f26719c;
            if (aVar != null) {
                aVar.mo37611b();
                return;
            }
            return;
        }
        IDepartmentContract.IView.Delegate aVar2 = this.f26719c;
        if (aVar2 != null) {
            aVar2.mo37609a(visibleDepartment);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentAdapter.DepItemClickListener
    /* renamed from: b */
    public void mo37574b(VisibleDepartment visibleDepartment, boolean z) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
        if (z) {
            Context context = this.f26721e;
            Toast.showText(context, context.getString(R.string.Doc_Permission_DepSelectedClickTips));
            return;
        }
        IDepartmentContract.IView.Delegate aVar = this.f26719c;
        if (aVar != null) {
            aVar.mo37612b(visibleDepartment);
        }
        PathNavigationAdapter<VisibleDepartment> aVar2 = this.f26717a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        aVar2.mo70676b(visibleDepartment);
        PathNavigationAdapter<VisibleDepartment> aVar3 = this.f26717a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        aVar3.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) this.f26722f.findViewById(R.id.permDepPathNavigation);
        PathNavigationAdapter<VisibleDepartment> aVar4 = this.f26717a;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationAdapter");
        }
        recyclerView.smoothScrollToPosition(aVar4.mo70673b().size() - 1);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentAdapter.DepItemClickListener
    /* renamed from: a */
    public void mo37572a(VisibleDepartment visibleDepartment, boolean z) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "department");
        if (z) {
            IDepartmentContract.IView.Delegate aVar = this.f26719c;
            if (aVar != null) {
                aVar.mo37614c(visibleDepartment);
                return;
            }
            return;
        }
        IDepartmentContract.IView.Delegate aVar2 = this.f26719c;
        if (aVar2 != null) {
            aVar2.mo37615d(visibleDepartment);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentAdapter.DepItemClickListener
    /* renamed from: a */
    public void mo37573a(VisibleTopUserInDep visibleTopUserInDep, boolean z) {
        Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "topUserInDep");
        if (z) {
            IDepartmentContract.IView.Delegate aVar = this.f26719c;
            if (aVar != null) {
                aVar.mo37610a(visibleTopUserInDep);
                return;
            }
            return;
        }
        IDepartmentContract.IView.Delegate aVar2 = this.f26719c;
        if (aVar2 != null) {
            aVar2.mo37613b(visibleTopUserInDep);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView
    /* renamed from: a */
    public void mo37624a(ArrayList<UserInfo> arrayList, ArrayList<VisibleDepartment> arrayList2, ArrayList<VisibleTopUserInDep> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
        Intrinsics.checkParameterIsNotNull(arrayList2, "selectedDeps");
        Intrinsics.checkParameterIsNotNull(arrayList3, "selectedTopUsers");
        DepartmentAdapter aVar = this.f26718b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depAdapter");
        }
        aVar.mo37566a(arrayList, arrayList2, arrayList3);
    }

    public DepartmentView(Context context, View view, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "uid");
        this.f26721e = context;
        this.f26722f = view;
        this.f26723g = str;
        this.f26724h = z;
    }
}

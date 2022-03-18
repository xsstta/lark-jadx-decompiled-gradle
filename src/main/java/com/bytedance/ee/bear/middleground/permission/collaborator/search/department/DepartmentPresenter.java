package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u001f B-\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView$Delegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "context", "Landroid/content/Context;", "depModel", "depView", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$Dependency;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$Dependency;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;)V", "create", "", "createViewDelegate", "destroy", "loadData", "visibleDepartment", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "loadMore", "onAddUser", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onLoadDepSuccess", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "currentDep", "onRemoveUser", "Delegate", "Dependency", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.e */
public final class DepartmentPresenter extends BasePresenter<IDepartmentContract.IModel, IDepartmentContract.IView, IDepartmentContract.IView.Delegate> implements SelectedUserChangeListener {

    /* renamed from: a */
    public final IDepartmentContract.IModel f26708a;

    /* renamed from: b */
    public final IDepartmentContract.IView f26709b;

    /* renamed from: c */
    public final Dependency f26710c;

    /* renamed from: d */
    public final InviteMemberParams f26711d;

    /* renamed from: e */
    private final Context f26712e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$Dependency;", "", "onBack", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.e$b */
    public interface Dependency {
        /* renamed from: a */
        void mo37581a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$Delegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IView$Delegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter;)V", "back", "", "onClickNextDep", "visibleDepartment", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "onLoadMore", "onNavigationNodeClick", "onSelectedDep", "onSelectedTopUser", "visibleTopUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "onUnSelectedDep", "onUnSelectedTopUser", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.e$a */
    public final class Delegate implements IDepartmentContract.IView.Delegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: a */
        public void mo37608a() {
            DepartmentPresenter.this.mo37604a();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: b */
        public void mo37611b() {
            DepartmentPresenter.this.f26710c.mo37581a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: a */
        public void mo37609a(VisibleDepartment visibleDepartment) {
            Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
            DepartmentPresenter.this.mo37606a(visibleDepartment);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: a */
        public void mo37610a(VisibleTopUserInDep visibleTopUserInDep) {
            Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "visibleTopUserInDep");
            DepartmentPresenter.this.f26708a.mo37596c(DepartmentPresenter.this.f26708a.mo37586a(visibleTopUserInDep));
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: b */
        public void mo37613b(VisibleTopUserInDep visibleTopUserInDep) {
            Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "visibleTopUserInDep");
            DepartmentPresenter.this.f26708a.mo37597d(DepartmentPresenter.this.f26708a.mo37586a(visibleTopUserInDep));
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: c */
        public void mo37614c(VisibleDepartment visibleDepartment) {
            Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
            DepartmentPresenter.this.f26708a.mo37596c(DepartmentPresenter.this.f26708a.mo37585a(visibleDepartment));
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: d */
        public void mo37615d(VisibleDepartment visibleDepartment) {
            Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
            DepartmentPresenter.this.f26708a.mo37597d(DepartmentPresenter.this.f26708a.mo37585a(visibleDepartment));
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IView.Delegate
        /* renamed from: b */
        public void mo37612b(VisibleDepartment visibleDepartment) {
            Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
            DepartmentPresenter.this.mo37606a(visibleDepartment);
            PermissionAnalyticV2.m39686j(DepartmentPresenter.this.f26711d.mo36834a(), DepartmentPresenter.this.f26711d.mo36835b(), DepartmentPresenter.this.f26711d.mo36837d(), DepartmentPresenter.this.f26711d.mo36843h());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IDepartmentContract.IView.Delegate createViewDelegate() {
        return new Delegate();
    }

    /* renamed from: a */
    public final void mo37604a() {
        this.f26708a.mo37589a(new C9881d(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f26708a.mo37594b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26709b.mo37624a(this.f26708a.mo37588a(), this.f26708a.mo37593b(), this.f26708a.mo37595c());
        this.f26708a.mo37591a(this);
        mo37606a(VisibleDepartment.f26659a.mo37549b(this.f26712e));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$loadMore$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.e$d */
    public static final class C9881d implements AbstractC5204e<Department> {

        /* renamed from: a */
        final /* synthetic */ DepartmentPresenter f26716a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9881d(DepartmentPresenter eVar) {
            this.f26716a = eVar;
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            this.f26716a.f26709b.mo37632d();
        }

        /* renamed from: a */
        public void mo20806a(Department department) {
            Intrinsics.checkParameterIsNotNull(department, "result");
            this.f26716a.f26709b.mo37627b(department);
            this.f26716a.f26709b.mo37625a(department.getHasMore());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentPresenter$loadData$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.e$c */
    public static final class C9880c implements AbstractC5204e<Department> {

        /* renamed from: a */
        final /* synthetic */ DepartmentPresenter f26714a;

        /* renamed from: b */
        final /* synthetic */ VisibleDepartment f26715b;

        /* renamed from: a */
        public void mo20806a(Department department) {
            Intrinsics.checkParameterIsNotNull(department, "result");
            this.f26714a.mo37605a(department, this.f26715b);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            this.f26714a.f26709b.mo37626b();
        }

        C9880c(DepartmentPresenter eVar, VisibleDepartment visibleDepartment) {
            this.f26714a = eVar;
            this.f26715b = visibleDepartment;
        }
    }

    /* renamed from: a */
    public final void mo37606a(VisibleDepartment visibleDepartment) {
        this.f26709b.mo37618a();
        this.f26708a.mo37590a(visibleDepartment, new C9880c(this, visibleDepartment));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: b */
    public void mo37127b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (userInfo.getOwnerType() == 18) {
            this.f26709b.mo37628b(this.f26708a.mo37584a(userInfo));
        } else if (userInfo.getOwnerType() == 1 || userInfo.getOwnerType() == 0) {
            this.f26709b.mo37629b(this.f26708a.mo37592b(userInfo));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener
    /* renamed from: a */
    public void mo37126a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (userInfo.getOwnerType() == 18) {
            this.f26709b.mo37621a(this.f26708a.mo37584a(userInfo));
        } else if (userInfo.getOwnerType() == 1 || userInfo.getOwnerType() == 0) {
            this.f26709b.mo37622a(this.f26708a.mo37592b(userInfo));
        }
    }

    /* renamed from: a */
    public final void mo37605a(Department department, VisibleDepartment visibleDepartment) {
        this.f26709b.mo37626b();
        this.f26709b.mo37625a(department.getHasMore());
        if (department.isEmpty()) {
            this.f26709b.mo37630b(TextUtils.equals(visibleDepartment.mo37540b(), "0"));
            return;
        }
        this.f26709b.mo37631c();
        this.f26709b.mo37620a(department);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentPresenter(Context context, IDepartmentContract.IModel aVar, IDepartmentContract.IView bVar, Dependency bVar2, InviteMemberParams inviteMemberParams) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "depModel");
        Intrinsics.checkParameterIsNotNull(bVar, "depView");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
        this.f26712e = context;
        this.f26708a = aVar;
        this.f26709b = bVar;
        this.f26710c = bVar2;
        this.f26711d = inviteMemberParams;
    }
}

package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003$%&BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "context", "Landroidx/fragment/app/FragmentActivity;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$Dependency;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "module", "", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "fromSharePanel", "", "(Landroidx/fragment/app/FragmentActivity;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$Dependency;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;Ljava/lang/String;Lcom/bytedance/ee/bear/share/export/UserInfo;Z)V", "create", "", "createViewDelegate", "dismissShareFragment", "notifyListUpdateFolderItem", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "onInviteFailed", "throwable", "", "onInviteSuccess", "reportInviteFailed", "reportInviteSuccess", "sure", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.c */
public final class FolderInviteMemberManagerPresenter extends BasePresenter<IInviteMemberManagerContract.IModel, IInviteMemberManagerContract.IView, IInviteMemberManagerContract.IView.IViewDelegate> {

    /* renamed from: d */
    public static final Companion f26045d = new Companion(null);

    /* renamed from: a */
    public final IInviteMemberManagerContract.IModel f26046a;

    /* renamed from: b */
    public final IInviteMemberManagerContract.IView f26047b;

    /* renamed from: c */
    public final Dependency f26048c;

    /* renamed from: e */
    private final FragmentActivity f26049e;

    /* renamed from: f */
    private final C10917c f26050f;

    /* renamed from: g */
    private final FolderPermSetInfo f26051g;

    /* renamed from: h */
    private final String f26052h;

    /* renamed from: i */
    private final UserInfo f26053i;

    /* renamed from: j */
    private final boolean f26054j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$Dependency;", "", "back", "", "finish", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.c$b */
    public interface Dependency {
        /* renamed from: a */
        void mo36951a();

        /* renamed from: b */
        void mo36952b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter;)V", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "onBack", "", "onInviteBtnClick", "onOperateToastDismiss", "notificationId", "", "onRemoveSelectedUser", "userInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.c$c */
    public final class ViewDelegate implements IInviteMemberManagerContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo36878b() {
            FolderInviteMemberManagerPresenter.this.mo36960b();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36875a() {
            Dependency bVar = FolderInviteMemberManagerPresenter.this.f26048c;
            if (bVar != null) {
                bVar.mo36951a();
            }
            PermissionAnalyticV2.m39677g();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: c */
        public ArrayList<UserInfo> mo36879c() {
            return FolderInviteMemberManagerPresenter.this.f26046a.mo36861a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36877a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "notificationId");
            FolderInviteMemberManagerPresenter.this.f26046a.mo36867a(str);
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36876a(UserInfo userInfo) {
            Dependency bVar;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            FolderInviteMemberManagerPresenter.this.f26046a.mo36862a(userInfo);
            FolderInviteMemberManagerPresenter.this.f26047b.mo36883n();
            if (FolderInviteMemberManagerPresenter.this.f26046a.mo36861a().size() == 0 && (bVar = FolderInviteMemberManagerPresenter.this.f26048c) != null) {
                bVar.mo36951a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteMemberManagerContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* renamed from: c */
    private final void m40066c() {
        if (this.f26054j) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41768d();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f26047b.mo36889a(this.f26046a.mo36861a());
        this.f26047b.mo36883n();
        PermissionAnalyticV2.m39629a(this.f26046a.mo36861a());
    }

    /* renamed from: b */
    public final void mo36960b() {
        boolean z;
        ArrayList<UserInfo> a = this.f26046a.mo36861a();
        if (this.f26047b.mo36899j().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        PermissionAnalyticV2.m39633a((ArrayList) a, z, this.f26047b.mo36897h(), false, 8, (Object) null);
        this.f26047b.mo36900k();
        this.f26046a.mo36868a(this.f26047b.mo36897h(), this.f26047b.mo36898i(), this.f26047b.mo36899j(), new C9678d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$sure$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.c$d */
    public static final class C9678d implements AbstractC5204e<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ FolderInviteMemberManagerPresenter f26056a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9678d(FolderInviteMemberManagerPresenter cVar) {
            this.f26056a = cVar;
        }

        /* renamed from: a */
        public void mo20806a(InviteResult inviteResult) {
            Intrinsics.checkParameterIsNotNull(inviteResult, "result");
            this.f26056a.mo36958a(inviteResult);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            this.f26056a.mo36959a(th);
        }
    }

    /* renamed from: b */
    private final void m40064b(InviteResult inviteResult) {
        if (inviteResult.getData() != null) {
            ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31521d(this.f26051g.mo38864c());
        }
    }

    /* renamed from: a */
    public final void mo36959a(Throwable th) {
        this.f26047b.mo36901l();
        this.f26047b.mo36888a(th, this.f26051g.mo38864c(), this.f26052h);
        m40065b(th);
    }

    /* renamed from: b */
    private final void m40065b(Throwable th) {
        PermissionAnalytic.m39416a(this.f26046a.mo36861a(), this.f26051g.mo38864c(), this.f26051g.mo38863b(), this.f26047b.mo36897h(), th);
    }

    /* renamed from: c */
    private final void m40067c(InviteResult inviteResult) {
        PermissionAnalytic.m39415a(this.f26046a.mo36861a(), this.f26051g.mo38864c(), this.f26051g.mo38863b(), this.f26047b.mo36897h(), String.valueOf(inviteResult.getCode()), inviteResult.getMsg());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36958a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult r5) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder.FolderInviteMemberManagerPresenter.mo36958a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderInviteMemberManagerPresenter(FragmentActivity fragmentActivity, C10917c cVar, IInviteMemberManagerContract.IModel aVar, IInviteMemberManagerContract.IView bVar, Dependency bVar2, FolderPermSetInfo folderPermSetInfo, String str, UserInfo userInfo, boolean z) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "module");
        this.f26049e = fragmentActivity;
        this.f26050f = cVar;
        this.f26046a = aVar;
        this.f26047b = bVar;
        this.f26048c = bVar2;
        this.f26051g = folderPermSetInfo;
        this.f26052h = str;
        this.f26053i = userInfo;
        this.f26054j = z;
    }
}

package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u0019\u001a\u001bB/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$Dependency;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "fromSharePanel", "", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$Dependency;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;Z)V", "create", "", "createViewDelegate", "dismissShareFragment", "onInviteFailed", "throwable", "", "onInviteSuccess", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "sure", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.d */
public final class BitableShareInviteMemberManagerPresenter extends BasePresenter<IInviteMemberManagerContract.IModel, IInviteMemberManagerContract.IView, IInviteMemberManagerContract.IView.IViewDelegate> {

    /* renamed from: d */
    public static final Companion f25967d = new Companion(null);

    /* renamed from: a */
    public final IInviteMemberManagerContract.IModel f25968a;

    /* renamed from: b */
    public final IInviteMemberManagerContract.IView f25969b;

    /* renamed from: c */
    public final Dependency f25970c;

    /* renamed from: e */
    private final BitableSharePermSetInfo f25971e;

    /* renamed from: f */
    private final boolean f25972f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$Dependency;", "", "back", "", "finish", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.d$b */
    public interface Dependency {
        /* renamed from: a */
        void mo36916a();

        /* renamed from: b */
        void mo36917b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter;)V", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "onBack", "", "onInviteBtnClick", "onOperateToastDismiss", "notificationId", "", "onRemoveSelectedUser", "userInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.d$c */
    public final class ViewDelegate implements IInviteMemberManagerContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36877a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "notificationId");
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo36878b() {
            BitableShareInviteMemberManagerPresenter.this.mo36926b();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36875a() {
            Dependency bVar = BitableShareInviteMemberManagerPresenter.this.f25970c;
            if (bVar != null) {
                bVar.mo36916a();
            }
            PermBitableShareAnalytic.f25618a.mo36538l();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: c */
        public ArrayList<UserInfo> mo36879c() {
            return BitableShareInviteMemberManagerPresenter.this.f25968a.mo36861a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36876a(UserInfo userInfo) {
            Dependency bVar;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            BitableShareInviteMemberManagerPresenter.this.f25968a.mo36862a(userInfo);
            BitableShareInviteMemberManagerPresenter.this.f25969b.mo36883n();
            if (BitableShareInviteMemberManagerPresenter.this.f25968a.mo36861a().size() == 0 && (bVar = BitableShareInviteMemberManagerPresenter.this.f25970c) != null) {
                bVar.mo36916a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteMemberManagerContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* renamed from: c */
    private final void m39956c() {
        if (this.f25972f) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41768d();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f25969b.mo36889a(this.f25968a.mo36861a());
        this.f25969b.mo36883n();
        PermBitableShareAnalytic.f25618a.mo36537k();
    }

    /* renamed from: b */
    public final void mo36926b() {
        PermBitableShareAnalytic.f25618a.mo36527a(this.f25969b.mo36897h(), this.f25968a.mo36861a());
        this.f25969b.mo36900k();
        this.f25968a.mo36868a(this.f25969b.mo36897h(), this.f25969b.mo36898i(), this.f25969b.mo36899j(), new C9663d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$sure$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.d$d */
    public static final class C9663d implements AbstractC5204e<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ BitableShareInviteMemberManagerPresenter f25974a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9663d(BitableShareInviteMemberManagerPresenter dVar) {
            this.f25974a = dVar;
        }

        /* renamed from: a */
        public void mo20806a(InviteResult inviteResult) {
            Intrinsics.checkParameterIsNotNull(inviteResult, "result");
            this.f25974a.mo36924a(inviteResult);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            this.f25974a.mo36925a(th);
        }
    }

    /* renamed from: a */
    public final void mo36925a(Throwable th) {
        this.f25969b.mo36901l();
        this.f25969b.mo36888a(th, this.f25971e.mo38783d(), "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36924a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult r3) {
        /*
            r2 = this;
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b r0 = r2.f25969b
            r0.mo36901l()
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteData r0 = r3.getData()
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = r3.getNotNotifyUsers()
            java.lang.String r1 = "result.notNotifyUsers"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002b
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b r0 = r2.f25969b
            java.util.List r3 = r3.getNotNotifyUsers()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
            r0.mo36890a(r3)
            goto L_0x0030
        L_0x002b:
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b r3 = r2.f25969b
            r3.mo36902m()
        L_0x0030:
            java.lang.Class<com.bytedance.ee.bear.middleground_permission_export.model.a.c> r3 = com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c.class
            r0 = 6
            r1 = 0
            java.lang.Object r3 = org.koin.java.KoinJavaComponent.m268613a(r3, r1, r1, r0, r1)
            com.bytedance.ee.bear.middleground_permission_export.model.a.c r3 = (com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c) r3
            com.bytedance.ee.bear.middleground_permission_export.model.a.b r3 = r3.mo36638a()
            r0 = 0
            r3.mo36646a(r0)
            r2.m39956c()
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.d$b r3 = r2.f25970c
            if (r3 == 0) goto L_0x004c
            r3.mo36917b()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare.BitableShareInviteMemberManagerPresenter.mo36924a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableShareInviteMemberManagerPresenter(IInviteMemberManagerContract.IModel aVar, IInviteMemberManagerContract.IView bVar, Dependency bVar2, BitableSharePermSetInfo bitableSharePermSetInfo, boolean z) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "permSetInfo");
        this.f25968a = aVar;
        this.f25969b = bVar;
        this.f25970c = bVar2;
        this.f25971e = bitableSharePermSetInfo;
        this.f25972f = z;
    }
}

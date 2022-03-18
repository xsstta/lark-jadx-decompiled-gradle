package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u0016\u0017\u0018B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "model", "view", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$Dependency;", "token", "", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$Dependency;Ljava/lang/String;)V", "create", "", "createViewDelegate", "onInviteFailed", "throwable", "", "onInviteSuccess", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "sure", "Companion", "Dependency", "ViewDelegate", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.d */
public final class BitableProInviteMemberManagerPresenter extends BasePresenter<IInviteMemberManagerContract.IModel, IInviteMemberManagerContract.IView, IInviteMemberManagerContract.IView.IViewDelegate> {

    /* renamed from: c */
    public static final Companion f25905c = new Companion(null);

    /* renamed from: a */
    public final IInviteMemberManagerContract.IModel f25906a;

    /* renamed from: b */
    public final Dependency f25907b;

    /* renamed from: d */
    private final IInviteMemberManagerContract.IView f25908d;

    /* renamed from: e */
    private final String f25909e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$Dependency;", "", "back", "", "finish", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.d$b */
    public interface Dependency {
        /* renamed from: a */
        void mo36863a();

        /* renamed from: b */
        void mo36864b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$ViewDelegate;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter;)V", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "onBack", "", "onInviteBtnClick", "onOperateToastDismiss", "notificationId", "", "onRemoveSelectedUser", "userInfo", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.d$c */
    public final class ViewDelegate implements IInviteMemberManagerContract.IView.IViewDelegate {
        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36877a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "notificationId");
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: b */
        public void mo36878b() {
            BitableProInviteMemberManagerPresenter.this.mo36874b();
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36875a() {
            Dependency bVar = BitableProInviteMemberManagerPresenter.this.f25907b;
            if (bVar != null) {
                bVar.mo36863a();
            }
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: c */
        public ArrayList<UserInfo> mo36879c() {
            return BitableProInviteMemberManagerPresenter.this.f25906a.mo36861a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView.IViewDelegate
        /* renamed from: a */
        public void mo36876a(UserInfo userInfo) {
            Dependency bVar;
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            BitableProInviteMemberManagerPresenter.this.f25906a.mo36862a(userInfo);
            if (BitableProInviteMemberManagerPresenter.this.f25906a.mo36861a().size() == 0 && (bVar = BitableProInviteMemberManagerPresenter.this.f25907b) != null) {
                bVar.mo36863a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IInviteMemberManagerContract.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f25908d.mo36889a(this.f25906a.mo36861a());
        this.f25908d.mo36883n();
    }

    /* renamed from: b */
    public final void mo36874b() {
        this.f25908d.mo36900k();
        this.f25906a.mo36868a(this.f25908d.mo36897h(), this.f25908d.mo36898i(), this.f25908d.mo36899j(), new C9643d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$sure$1", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "onFailed", "", "throwable", "", "onSuccess", "result", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.d$d */
    public static final class C9643d implements AbstractC5204e<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ BitableProInviteMemberManagerPresenter f25911a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9643d(BitableProInviteMemberManagerPresenter dVar) {
            this.f25911a = dVar;
        }

        /* renamed from: a */
        public void mo20806a(InviteResult inviteResult) {
            Intrinsics.checkParameterIsNotNull(inviteResult, "result");
            this.f25911a.mo36872a(inviteResult);
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            this.f25911a.mo36873a(th);
        }
    }

    /* renamed from: a */
    public final void mo36873a(Throwable th) {
        this.f25908d.mo36901l();
        this.f25908d.mo36888a(th, this.f25909e, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36872a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult r3) {
        /*
            r2 = this;
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b r0 = r2.f25908d
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
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b r0 = r2.f25908d
            java.util.List r3 = r3.getNotNotifyUsers()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
            r0.mo36890a(r3)
            goto L_0x0030
        L_0x002b:
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c$b r3 = r2.f25908d
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
            com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.d$b r3 = r2.f25907b
            if (r3 == 0) goto L_0x0049
            r3.mo36864b()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro.BitableProInviteMemberManagerPresenter.mo36872a(com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableProInviteMemberManagerPresenter(IInviteMemberManagerContract.IModel aVar, IInviteMemberManagerContract.IView bVar, Dependency bVar2, String str) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f25906a = aVar;
        this.f25908d = bVar;
        this.f25907b = bVar2;
        this.f25909e = str;
    }
}

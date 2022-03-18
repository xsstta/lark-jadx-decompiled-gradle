package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.permission.bitableshare.BitableSharePermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J.\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerModel;", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "info", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "applyDefaultMemberPermission", "", "create", "destroy", "inviteUsers", "notify", "", "isContainerPerm", "notes", "", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "sendNotifyRequest", "notificationId", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.c */
public class BitableShareInviteMemberManagerModel extends BaseInviteMemberManagerModel {

    /* renamed from: b */
    public static final Companion f25961b = new Companion(null);

    /* renamed from: c */
    private Disposable f25962c;

    /* renamed from: d */
    private final ISelectedUserModel f25963d;

    /* renamed from: e */
    private final BitableSharePermSetInfo f25964e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo36920b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36920b() {
        Iterator<T> it = this.f25963d.getSelected().iterator();
        while (it.hasNext()) {
            it.next().setPermission(4);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        super.destroy();
        Disposable disposable2 = this.f25962c;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f25962c) != null) {
            disposable.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.c$b */
    static final class C9661b<T> implements Consumer<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f25965a;

        C9661b(AbstractC5204e eVar) {
            this.f25965a = eVar;
        }

        /* renamed from: a */
        public final void accept(InviteResult inviteResult) {
            C13479a.m54764b("BitableShareInviteMemberManagerModel", "inviteUsers()...succeed");
            this.f25965a.mo20806a(inviteResult);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36867a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
        C13479a.m54764b("BitableShareInviteMemberManagerModel", "sendNotifyRequest()...");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.c$c */
    static final class C9662c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f25966a;

        C9662c(AbstractC5204e eVar) {
            this.f25966a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54764b("BitableShareInviteMemberManagerModel", "inviteUsers()...error = " + th.getMessage());
            this.f25966a.mo20807a(th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableShareInviteMemberManagerModel(ISelectedUserModel bVar, BitableSharePermSetInfo bitableSharePermSetInfo) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "info");
        this.f25963d = bVar;
        this.f25964e = bitableSharePermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36868a(boolean z, boolean z2, String str, AbstractC5204e<InviteResult> eVar) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        ArrayList<UserInfo> selected = this.f25963d.getSelected();
        C13479a.m54764b("BitableShareInviteMemberManagerModel", "inviteUsers()...size = " + selected.size() + ", notify = " + z);
        if (C13657b.m55421a(selected)) {
            C13479a.m54775e("BitableShareInviteMemberManagerModel", "inviteUser()...users is empty");
            eVar.mo20807a(new Throwable("empty users"));
            return;
        }
        this.f25962c = BitableSharePermissionManager.m41327a(this.f25964e.mo38785e().getShareToken(), selected, z, str).mo238001b(new C9661b(eVar), new C9662c(eVar));
    }
}

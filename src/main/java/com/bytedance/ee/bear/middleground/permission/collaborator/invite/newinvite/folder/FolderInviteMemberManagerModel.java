package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016JF\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J.\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110!H\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001bH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "(Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "applyDefaultMemberPermission", "", "create", "destroy", "getInviteFlow", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notify", "", "notes", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "inviteUsers", "isContainerPerm", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "sendNotifyRequest", "notificationId", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.b */
public final class FolderInviteMemberManagerModel extends BaseInviteMemberManagerModel {

    /* renamed from: b */
    public static final Companion f26038b = new Companion(null);

    /* renamed from: c */
    private Disposable f26039c;

    /* renamed from: d */
    private final C10917c f26040d;

    /* renamed from: e */
    private final ISelectedUserModel f26041e;

    /* renamed from: f */
    private final FolderPermSetInfo f26042f;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36867a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.b$a */
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
        m40059b();
    }

    /* renamed from: b */
    private final void m40059b() {
        Iterator<T> it = this.f26041e.getSelected().iterator();
        while (it.hasNext()) {
            it.next().setPermission(1);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        super.destroy();
        Disposable disposable2 = this.f26039c;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f26039c) != null) {
            disposable.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.b$b */
    static final class C9676b<T> implements Consumer<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f26043a;

        C9676b(AbstractC5204e eVar) {
            this.f26043a = eVar;
        }

        /* renamed from: a */
        public final void accept(InviteResult inviteResult) {
            C13479a.m54764b("FolderInviteMemberManagerModel", "inviteUsers()...succeed");
            this.f26043a.mo20806a(inviteResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.b$c */
    static final class C9677c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f26044a;

        C9677c(AbstractC5204e eVar) {
            this.f26044a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54764b("FolderInviteMemberManagerModel", "inviteUsers()...error = " + th.getMessage());
            this.f26044a.mo20807a(th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderInviteMemberManagerModel(C10917c cVar, ISelectedUserModel bVar, FolderPermSetInfo folderPermSetInfo) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        this.f26040d = cVar;
        this.f26041e = bVar;
        this.f26042f = folderPermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36868a(boolean z, boolean z2, String str, AbstractC5204e<InviteResult> eVar) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        ArrayList<UserInfo> selected = this.f26041e.getSelected();
        C13479a.m54764b("FolderInviteMemberManagerModel", "inviteUsers()...size = " + selected.size() + "}, notify = " + z);
        if (C13657b.m55421a(selected)) {
            C13479a.m54775e("FolderInviteMemberManagerModel", "inviteUser()...users is empty");
            eVar.mo20807a(new Throwable("empty users"));
            return;
        }
        this.f26039c = m40058a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), selected, z, str, this.f26042f.mo38873i()).mo238001b(new C9676b(eVar), new C9677c(eVar));
    }

    /* renamed from: a */
    private final AbstractC68307f<InviteResult> m40058a(NetService netService, ArrayList<UserInfo> arrayList, boolean z, String str, FolderVersion folderVersion) {
        return FolderPermissionManagerDispatcher.m41256a(folderVersion.isShareFolderV2()).mo37740a(arrayList, z, str, this.f26042f.mo38864c(), this.f26042f.mo38871h());
    }
}

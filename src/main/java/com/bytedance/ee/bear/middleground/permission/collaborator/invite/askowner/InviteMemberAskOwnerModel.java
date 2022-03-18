package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IModel;", "selectedUserModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "applyDefaultMemberPermission", "", "askOwner", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "notes", "", "create", "destroy", "getUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "removeUser", "position", "", "userInfo", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.d */
public class InviteMemberAskOwnerModel implements IInviteMemberAskOwnerContract.IModel {

    /* renamed from: a */
    public static final Companion f26151a = new Companion(null);

    /* renamed from: b */
    private final ISelectedUserModel f26152b;

    /* renamed from: c */
    private final DocPermSetInfo f26153c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IModel
    /* renamed from: a */
    public ArrayList<UserInfo> mo37016a() {
        return this.f26152b.getSelected();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("InviteMemberAskOwnerModel", "destroy()...");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("InviteMemberAskOwnerModel", "create()...");
        mo37028b();
    }

    /* renamed from: b */
    public void mo37028b() {
        Iterator<T> it = this.f26152b.getSelected().iterator();
        while (it.hasNext()) {
            it.next().setPermission(1);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IModel
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37015a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        C13479a.m54764b("InviteMemberAskOwnerModel", "askOwner()...");
        return AskOwnerHelper.f26081a.mo36985a(this.f26153c.mo38827c(), this.f26153c.mo38825b(), this.f26152b.getSelected(), str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IModel
    /* renamed from: a */
    public void mo37017a(int i, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26152b.removeUser(userInfo);
    }

    public InviteMemberAskOwnerModel(ISelectedUserModel bVar, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(bVar, "selectedUserModel");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26152b = bVar;
        this.f26153c = docPermSetInfo;
    }
}

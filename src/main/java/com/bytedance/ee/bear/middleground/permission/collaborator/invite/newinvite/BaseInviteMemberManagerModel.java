package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite;

import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IModel;", "selectedUserModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;)V", "create", "", "destroy", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "removeSelectedUses", "userInfo", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a */
public abstract class BaseInviteMemberManagerModel implements IInviteMemberManagerContract.IModel {

    /* renamed from: a */
    public static final Companion f25882a = new Companion(null);

    /* renamed from: b */
    private final ISelectedUserModel f25883b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public ArrayList<UserInfo> mo36861a() {
        return this.f25883b.getSelected();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("BaseInviteMemberManagerModel", "create()...");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("BaseInviteMemberManagerModel", "destroy()...");
    }

    public BaseInviteMemberManagerModel(ISelectedUserModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "selectedUserModel");
        this.f25883b = bVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36862a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f25883b.removeUser(userInfo);
    }
}

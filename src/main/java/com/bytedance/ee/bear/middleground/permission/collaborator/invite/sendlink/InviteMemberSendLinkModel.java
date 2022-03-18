package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.SendLinkParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J0\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fH\u0002J\u0018\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010 \u001a\u00020!2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IModel;", "selectedUserModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "create", "", "destroy", "getOwnerList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/SendLinkParams$MembersBean;", "Lkotlin/collections/ArrayList;", "selectedUsers", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "getUsers", "registerSelectedUserChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeUser", "position", "", "userInfo", "sendLink", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "notes", "", "sendLinkFlow", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "unRegisterSelectedUserChangeListener", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.e */
public final class InviteMemberSendLinkModel implements IInviteMemberSendLinkContract.IModel {

    /* renamed from: a */
    public static final Companion f26217a = new Companion(null);

    /* renamed from: b */
    private final ISelectedUserModel f26218b;

    /* renamed from: c */
    private final DocPermSetInfo f26219c;

    /* renamed from: d */
    private final C10917c f26220d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkModel$Companion;", "", "()V", "SEND_LINK_API_PATH", "", "TAG", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IModel
    /* renamed from: a */
    public ArrayList<UserInfo> mo37108a() {
        return this.f26218b.getSelected();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("InviteMemberSendLinkModel", "create()...");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("InviteMemberSendLinkModel", "destroy()...");
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IModel
    /* renamed from: b */
    public void mo37111b(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26218b.unregisterChangeListener(cVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IModel
    /* renamed from: a */
    public void mo37110a(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26218b.registerChangeListener(cVar);
    }

    /* renamed from: a */
    private final ArrayList<SendLinkParams.MembersBean> m40224a(ArrayList<UserInfo> arrayList) {
        ArrayList<SendLinkParams.MembersBean> arrayList2 = new ArrayList<>();
        for (T t : arrayList) {
            SendLinkParams.MembersBean membersBean = new SendLinkParams.MembersBean();
            membersBean.setOwner_id(t.getId());
            membersBean.setOwner_type(Integer.valueOf(t.getOwnerType()));
            arrayList2.add(membersBean);
        }
        return arrayList2;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IModel
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37107a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        C13479a.m54764b("InviteMemberSendLinkModel", "sendLink()...");
        ArrayList<UserInfo> selected = this.f26218b.getSelected();
        if (!C13657b.m55421a(selected)) {
            return m40223a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), selected, str);
        }
        C13479a.m54764b("InviteMemberSendLinkModel", "users is empty");
        AbstractC68307f<SimpleRequestResult> a = AbstractC68307f.m265084a(new Throwable("users is empty"));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.error(Throwable(\"users is empty\"))");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IModel
    /* renamed from: a */
    public void mo37109a(int i, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26218b.removeUser(userInfo);
    }

    public InviteMemberSendLinkModel(ISelectedUserModel bVar, DocPermSetInfo docPermSetInfo, C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "selectedUserModel");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f26218b = bVar;
        this.f26219c = docPermSetInfo;
        this.f26220d = cVar;
    }

    /* renamed from: a */
    private final AbstractC68307f<SimpleRequestResult> m40223a(NetService netService, ArrayList<UserInfo> arrayList, String str) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/members/share/");
        fVar.mo20143a(1);
        SendLinkParams sendLinkParams = new SendLinkParams();
        sendLinkParams.setToken(this.f26219c.mo38827c());
        sendLinkParams.setType(Integer.valueOf(this.f26219c.mo38825b()));
        sendLinkParams.setMembers(m40224a(arrayList));
        sendLinkParams.setRemark(str);
        fVar.mo20153c(JSON.toJSONString(sendLinkParams));
        AbstractC68307f<SimpleRequestResult> a = netService.mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller<…           .pull(request)");
        return a;
    }
}

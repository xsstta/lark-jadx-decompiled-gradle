package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9716f;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0014JT\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016JF\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J.\u0010 \u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"H\u0016J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000fH\u0016J \u0010%\u001a\u00020\u000f2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0004R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "applyDefaultMemberPermission", "", "buildParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notify", "", "isContainerPerm", "notes", "create", "destroy", "getInviteFlow", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "inviteUsers", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "sendNotifyRequest", "notificationId", "usersConvertToJson", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.b */
public class DocInviteMemberManagerModel extends BaseInviteMemberManagerModel {

    /* renamed from: b */
    public static final Companion f25994b = new Companion(null);

    /* renamed from: c */
    private Disposable f25995c;

    /* renamed from: d */
    private final C10917c f25996d;

    /* renamed from: e */
    private final ISelectedUserModel f25997e;

    /* renamed from: f */
    private final DocPermSetInfo f25998f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerModel$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.b$a */
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
        mo36934b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36934b() {
        Iterator<T> it = this.f25997e.getSelected().iterator();
        while (it.hasNext()) {
            it.next().setPermission(1);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        super.destroy();
        Disposable disposable2 = this.f25995c;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f25995c) != null) {
            disposable.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.b$b */
    static final class C9667b<T> implements Consumer<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f25999a;

        C9667b(AbstractC5204e eVar) {
            this.f25999a = eVar;
        }

        /* renamed from: a */
        public final void accept(InviteResult inviteResult) {
            C13479a.m54764b("DocInviteMemberManagerModel", "inviteUsers()...succeed");
            this.f25999a.mo20806a(inviteResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.b$c */
    static final class C9668c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f26000a;

        C9668c(AbstractC5204e eVar) {
            this.f26000a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54764b("DocInviteMemberManagerModel", "inviteUsers()...error = " + th.getMessage());
            this.f26000a.mo20807a(th);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36867a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
        C13479a.m54764b("DocInviteMemberManagerModel", "sendNotifyRequest()...");
        DocPermissionManager.f27276a.mo38437a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo36933a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<UserInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                JSONObject jSONObject = new JSONObject();
                Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
                jSONObject.put("owner_id", next.getId());
                jSONObject.put("owner_type", next.getOwnerType());
                jSONObject.put("permission", next.getPermission());
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e) {
            C13479a.m54761a("DocInviteMemberManagerModel", e);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONArray2, "jsonArray.toString()");
        return jSONArray2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocInviteMemberManagerModel(C10917c cVar, ISelectedUserModel bVar, DocPermSetInfo docPermSetInfo) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f25996d = cVar;
        this.f25997e = bVar;
        this.f25998f = docPermSetInfo;
    }

    /* renamed from: a */
    public HashMap<String, String> mo36932a(ArrayList<UserInfo> arrayList, boolean z, boolean z2, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str, "notes");
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("token", this.f25998f.mo38827c());
        hashMap2.put(ShareHitPoint.f121869d, String.valueOf(this.f25998f.mo38825b()));
        hashMap2.put("owners", mo36933a(arrayList));
        hashMap2.put("notify_lark_v3", String.valueOf(z));
        hashMap2.put("lark_im_text", str);
        if (z2) {
            str2 = String.valueOf(1);
        } else {
            str2 = String.valueOf(2);
        }
        hashMap2.put("perm_type", str2);
        return hashMap;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36868a(boolean z, boolean z2, String str, AbstractC5204e<InviteResult> eVar) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        ArrayList<UserInfo> selected = this.f25997e.getSelected();
        C13479a.m54764b("DocInviteMemberManagerModel", "inviteUsers()...size = " + selected.size() + ", notify = " + z);
        if (C13657b.m55421a(selected)) {
            C13479a.m54775e("DocInviteMemberManagerModel", "inviteUser()...users is empty");
            eVar.mo20807a(new Throwable("empty users"));
            return;
        }
        this.f25995c = m40014a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), selected, z, z2, str).mo238001b(new C9667b(eVar), new C9668c(eVar));
    }

    /* renamed from: a */
    private final AbstractC68307f<InviteResult> m40014a(NetService netService, ArrayList<UserInfo> arrayList, boolean z, boolean z2, String str) {
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/members/create/");
        fVar.mo20147a(mo36932a(arrayList, z, z2, str));
        fVar.mo20143a(1);
        AbstractC68307f<InviteResult> a = netService.mo20117a(new C9716f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller<…           .pull(request)");
        return a;
    }
}

package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J8\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerModel;", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "token", "", "roleId", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "destroy", "", "inviteUsers", "notify", "", "isContainerPerm", "notes", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "memberList2Json", "Lcom/alibaba/fastjson/JSONArray;", "userInfoList", "sendNotifyRequest", "notificationId", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.c */
public class BitableProInviteMemberManagerModel extends BaseInviteMemberManagerModel {

    /* renamed from: b */
    public static final Companion f25897b = new Companion(null);

    /* renamed from: c */
    private Disposable f25898c;

    /* renamed from: d */
    private final ISelectedUserModel f25899d;

    /* renamed from: e */
    private final String f25900e;

    /* renamed from: f */
    private final String f25901f;

    /* renamed from: g */
    private final ArrayList<UserInfo> f25902g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerModel$Companion;", "", "()V", "API_PATH_UPDATE_ROLE", "", "TAG", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        super.destroy();
        Disposable disposable2 = this.f25898c;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f25898c) != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36867a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
        C13479a.m54764b("BitableShareInviteMemberManagerModel", "sendNotifyRequest()...");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.c$b */
    static final class C9641b<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f25903a;

        C9641b(AbstractC5204e eVar) {
            this.f25903a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.bytedance.ee.bear.contract.net.e */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            C13479a.m54764b("BitableShareInviteMemberManagerModel", "inviteUsers()...succeed");
            this.f25903a.mo20806a(new InviteResult());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.c$c */
    static final class C9642c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f25904a;

        C9642c(AbstractC5204e eVar) {
            this.f25904a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54764b("BitableShareInviteMemberManagerModel", "inviteUsers()...error = " + th.getMessage());
            this.f25904a.mo20807a(th);
        }
    }

    /* renamed from: a */
    private final JSONArray m39877a(ArrayList<UserInfo> arrayList, ArrayList<UserInfo> arrayList2) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<UserInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                JSONObject jSONObject = new JSONObject();
                Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
                jSONObject.put((Object) "memberId", (Object) next.getId());
                jSONObject.put((Object) "memberType", (Object) Integer.valueOf(next.getOwnerType()));
                jSONArray.add(jSONObject);
            }
            Iterator<UserInfo> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                UserInfo next2 = it2.next();
                JSONObject jSONObject2 = new JSONObject();
                Intrinsics.checkExpressionValueIsNotNull(next2, "userInfo");
                jSONObject2.put((Object) "memberId", (Object) next2.getId());
                jSONObject2.put((Object) "memberType", (Object) Integer.valueOf(next2.getOwnerType()));
                jSONArray.add(jSONObject2);
            }
        } catch (JSONException e) {
            C13479a.m54761a("BitableShareInviteMemberManagerModel", e);
        }
        return jSONArray;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableProInviteMemberManagerModel(ISelectedUserModel bVar, String str, String str2, ArrayList<UserInfo> arrayList) {
        super(bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "roleId");
        Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
        this.f25899d = bVar;
        this.f25900e = str;
        this.f25901f = str2;
        this.f25902g = arrayList;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IModel
    /* renamed from: a */
    public void mo36868a(boolean z, boolean z2, String str, AbstractC5204e<InviteResult> eVar) {
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        ArrayList<UserInfo> selected = this.f25899d.getSelected();
        C13479a.m54764b("BitableShareInviteMemberManagerModel", "inviteUsers()...size = " + selected.size() + ", notify = " + z);
        if (C13657b.m55421a(selected)) {
            C13479a.m54775e("BitableShareInviteMemberManagerModel", "inviteUser()...users is empty");
            eVar.mo20807a(new Throwable("empty users"));
            return;
        }
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("/space/api/bitable/roles/%s/update", Arrays.copyOf(new Object[]{this.f25900e}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        NetService.C5077f fVar = new NetService.C5077f(format);
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "roleId", (Object) this.f25901f);
        jSONObject2.put((Object) "members", (Object) m39877a(this.f25902g, selected));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((Object) "baseRole", (Object) jSONObject);
        fVar.mo20153c(jSONObject3.toJSONString());
        this.f25898c = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar).mo238001b(new C9641b(eVar), new C9642c(eVar));
    }
}

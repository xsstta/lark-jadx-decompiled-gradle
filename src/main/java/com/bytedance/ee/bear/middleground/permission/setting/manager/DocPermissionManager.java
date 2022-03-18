package com.bytedance.ee.bear.middleground.permission.setting.manager;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.AbstractC9636d;
import com.bytedance.ee.bear.middleground.permission.collaborator.C9635c;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9716f;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9828h;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00042\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001b0 j\b\u0012\u0004\u0012\u00020\u001b`!H\u0007JB\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00042\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001b0 j\b\u0012\u0004\u0012\u00020\u001b`!H\u0002JB\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$0\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00042\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!H\u0002JB\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020$0\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00042\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!H\u0007J2\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020\u0011H\u0007J:\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0007J(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u001cH\u0007J(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u0011H\u0007J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u00101\u001a\u00020\u0004H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0004J2\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0007J2\u00103\u001a\u0002072\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00020409H\u0007J2\u0010:\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00112\u0006\u00108\u001a\u00020?H\u0007J6\u0010:\u001a\b\u0012\u0004\u0012\u00020@0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011J*\u0010A\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u00108\u001a\u00020BH\u0007J2\u0010A\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u00105\u001a\u00020\u00112\u0006\u00108\u001a\u00020BH\u0007J0\u0010A\u001a\b\u0012\u0004\u0012\u00020C0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020\u00112\u0006\u0010<\u001a\u00020=H\u0007J\u0010\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020\u0004H\u0007J&\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=J*\u0010F\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u00108\u001a\u00020?H\u0007J \u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0007J2\u0010I\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010+\u001a\u00020\u00112\u0006\u00108\u001a\u00020?H\u0007J8\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010+\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011H\u0007J\u0018\u0010J\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/manager/DocPermissionManager;", "", "()V", "API_UNLOCK", "", "BATCH_DOC_PERMISSION", "BATCH_USER_PERMISSION", "CHECK_LOCK_MEMBERS_DELETE", "CHECK_LOCK_MEMBERS_UPDATE", "CHECK_LOCK_PUBLIC_PERM_UPDATE", "COLLABORATOR_COUNT", "PERMISSION_MEMBERS_DELETE", "PERMISSION_MEMBERS_UPDATE", "PERMISSION_MEMBERS_UPDATE_V2", "PERMISSION_MEMBERS_V2", "PERMISSION_TRANSFER_OWNER", "PERM_TYPE_ALL", "", "PERM_TYPE_CONTAINER", "PERM_TYPE_SINGLE_PAGE", "REMOVE_PERMISSION", "SEND_NOTIFY_PATH", "TAG", "TRANS_OWNER_PERMISSION", "batchFetchDocPermissionWrapper", "Lio/reactivex/Flowable;", "Ljava/util/HashMap;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/SimpleDocInfo;", "", ShareHitPoint.f121869d, "token", "docList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "batchFetchDocReadPermission", "batchFetchUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "userIds", "batchFetchUserPermissionWrapper", "checkMembersDeleteLock", "memberId", "memberType", "checkMembersUpdateLock", "permission", "checkUpdateExternalAccess", "externalAccess", "checkUpdateLinkShareEntity", "linkShareEntity", "checkUpdatePublicPermLock", "params", "fetchCollaboratorNum", "getUserInfoV2", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "permType", "lastLabel", "Lio/reactivex/disposables/Disposable;", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "inviteNoPermissionUser", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "newPermission", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/UpdatePermissionRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "removeUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "sendNotifyRequest", "notificationId", "transferOwner", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "unlock", "updateUserPermission", "usersConvertToJson", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c */
public final class DocPermissionManager {

    /* renamed from: a */
    public static final DocPermissionManager f27276a = new DocPermissionManager();

    private DocPermissionManager() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41998a(int i, String str, UserInfo userInfo, int i2, AbstractC9636d dVar) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        f27276a.mo38436a(i, str, userInfo, i2, 1).mo238001b(new C10098j(dVar, i2), new C10099k(dVar));
    }

    /* renamed from: a */
    public final AbstractC68307f<InviteResult> mo38436a(int i, String str, UserInfo userInfo, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/members/create/");
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("token", str);
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        hashMap.put("owners", m41997a(userInfo, i2));
        hashMap.put("notify_lark_v3", String.valueOf(false));
        hashMap.put("lark_im_text", "");
        hashMap.put("perm_type", String.valueOf(i3));
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        AbstractC68307f<InviteResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9716f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    /* renamed from: a */
    private final String m41997a(UserInfo userInfo, int i) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("owner_id", userInfo.getId());
            jSONObject.put("owner_type", userInfo.getOwnerType());
            jSONObject.put("permission", i);
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            C13479a.m54761a("DocPermissionManager", e);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONArray2, "jsonArray.toString()");
        return jSONArray2;
    }

    /* renamed from: a */
    public final void mo38437a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
        C13479a.m54764b("DocPermissionManager", "sendNotifyRequest()...");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("DocPermissionManager", "notificationId is null or empty");
            return;
        }
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission.v2/members/notify/");
        HashMap hashMap = new HashMap();
        hashMap.put("notification_id", str);
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar).mo238001b(C10102n.f27291a, C10103o.f27292a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m42000a(int i, String str, UserInfo userInfo, AbstractC9636d dVar) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        f27276a.mo38435a(i, str, userInfo).mo238001b(new C10104p(dVar), new C10105q(dVar));
    }

    /* renamed from: a */
    public final AbstractC68307f<NotNotifyUserResult> mo38435a(int i, String str, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap.put("token", str);
        String id = userInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "userInfo.id");
        hashMap.put("owner_id", id);
        hashMap.put("owner_type", String.valueOf(0));
        hashMap.put(ShareHitPoint.f121868c, "suite_share");
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/members/transfer/");
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        AbstractC68307f<NotNotifyUserResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9635c()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41996a(int i, String str, boolean z) {
        C13479a.m54764b("DocPermissionManager", "checkUpdateExternalAccess");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "external_access", (Object) Boolean.valueOf(z));
        DocPermissionManager cVar = f27276a;
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        return cVar.m42003b(jSONString);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$n */
    static final class C10102n<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        public static final C10102n f27291a = new C10102n();

        C10102n() {
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            C13479a.m54764b("DocPermissionManager", "sendNotifyRequest()...Success");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$b */
    static final class C10090b<T, R> implements Function<Throwable, Boolean> {

        /* renamed from: a */
        public static final C10090b f27278a = new C10090b();

        C10090b() {
        }

        /* renamed from: a */
        public final boolean mo38440a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            C13479a.m54761a("DocPermissionManager", th);
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(Throwable th) {
            return Boolean.valueOf(mo38440a(th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$d */
    static final class C10092d<T, R> implements Function<Throwable, Boolean> {

        /* renamed from: a */
        public static final C10092d f27280a = new C10092d();

        C10092d() {
        }

        /* renamed from: a */
        public final boolean mo38442a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            C13479a.m54761a("DocPermissionManager", th);
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(Throwable th) {
            return Boolean.valueOf(mo38442a(th));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$f */
    public static final class C10094f<T, R> implements Function<Throwable, Boolean> {

        /* renamed from: a */
        public static final C10094f f27282a = new C10094f();

        C10094f() {
        }

        /* renamed from: a */
        public final boolean mo38444a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "e");
            C13479a.m54761a("DocPermissionManager", th);
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(Throwable th) {
            return Boolean.valueOf(mo38444a(th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CollaboratorCountResult;", "apply", "(Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CollaboratorCountResult;)Ljava/lang/Integer;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$g */
    static final class C10095g<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C10095g f27283a = new C10095g();

        C10095g() {
        }

        /* renamed from: a */
        public final Integer apply(CollaboratorCountResult collaboratorCountResult) {
            Intrinsics.checkParameterIsNotNull(collaboratorCountResult, "it");
            return (Integer) collaboratorCountResult.data;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$h */
    static final class C10096h<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f27284a;

        C10096h(AbstractC5204e eVar) {
            this.f27284a = eVar;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            C13479a.m54764b("DocPermissionManager", "getUserInfo succeed");
            this.f27284a.mo20806a(shareUserInfoResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$i */
    static final class C10097i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f27285a;

        C10097i(AbstractC5204e eVar) {
            this.f27285a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("DocPermissionManager", th);
            this.f27285a.mo20807a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$k */
    static final class C10099k<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9636d f27288a;

        C10099k(AbstractC9636d dVar) {
            this.f27288a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocPermissionManager", "inviteNoPermissionUser().. error:", th);
            this.f27288a.mo17112a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$l */
    public static final class C10100l<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10169g f27289a;

        C10100l(AbstractC10169g gVar) {
            this.f27289a = gVar;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            C13479a.m54764b("DocPermissionManager", "removeUserPermission succeed");
            this.f27289a.mo17111a(-1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$m */
    public static final class C10101m<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10169g f27290a;

        C10101m(AbstractC10169g gVar) {
            this.f27290a = gVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocPermissionManager", "removeUserPermission error:", th);
            this.f27290a.mo17112a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$q */
    static final class C10105q<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9636d f27294a;

        C10105q(AbstractC9636d dVar) {
            this.f27294a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocPermissionManager", "transferOwner error:", th);
            this.f27294a.mo17112a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$r */
    static final class C10106r<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C10106r f27295a = new C10106r();

        C10106r() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(SimpleRequestResult simpleRequestResult) {
            Intrinsics.checkParameterIsNotNull(simpleRequestResult, "it");
            return AbstractC68307f.m265083a((Object) true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$t */
    static final class C10108t<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9636d f27298a;

        C10108t(AbstractC9636d dVar) {
            this.f27298a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("DocPermissionManager", "updateUserPermission error:", th);
            this.f27298a.mo17112a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$a */
    static final class C10089a<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C10089a f27277a = new C10089a();

        C10089a() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(CheckLockResult checkLockResult) {
            Intrinsics.checkParameterIsNotNull(checkLockResult, "it");
            return AbstractC68307f.m265083a(Boolean.valueOf(checkLockResult.isNeedLock()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$c */
    static final class C10091c<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C10091c f27279a = new C10091c();

        C10091c() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(CheckLockResult checkLockResult) {
            Intrinsics.checkParameterIsNotNull(checkLockResult, "it");
            return AbstractC68307f.m265083a(Boolean.valueOf(checkLockResult.isNeedLock()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$e */
    public static final class C10093e<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C10093e f27281a = new C10093e();

        C10093e() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(CheckLockResult checkLockResult) {
            Intrinsics.checkParameterIsNotNull(checkLockResult, "it");
            return AbstractC68307f.m265083a(Boolean.valueOf(checkLockResult.isNeedLock()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$o */
    static final class C10103o<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C10103o f27292a = new C10103o();

        C10103o() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54758a("DocPermissionManager", "sendNotifyRequest()...failed: " + th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$j */
    static final class C10098j<T> implements Consumer<InviteResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9636d f27286a;

        /* renamed from: b */
        final /* synthetic */ int f27287b;

        C10098j(AbstractC9636d dVar, int i) {
            this.f27286a = dVar;
            this.f27287b = i;
        }

        /* renamed from: a */
        public final void accept(InviteResult inviteResult) {
            C13479a.m54764b("DocPermissionManager", "inviteNoPermissionUser()... success");
            Intrinsics.checkExpressionValueIsNotNull(inviteResult, "it");
            if (inviteResult.getNotNotifyUsers() == null || inviteResult.getNotNotifyUsers().isEmpty()) {
                this.f27286a.mo17111a(this.f27287b);
            } else {
                this.f27286a.mo36832a(this.f27287b, inviteResult.getNotNotifyUsers());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$p */
    static final class C10104p<T> implements Consumer<NotNotifyUserResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9636d f27293a;

        C10104p(AbstractC9636d dVar) {
            this.f27293a = dVar;
        }

        /* renamed from: a */
        public final void accept(NotNotifyUserResult notNotifyUserResult) {
            Intrinsics.checkExpressionValueIsNotNull(notNotifyUserResult, "it");
            if (notNotifyUserResult.getNotNotifyUsers() == null || notNotifyUserResult.getNotNotifyUsers().isEmpty()) {
                this.f27293a.mo17111a(-2);
            } else {
                this.f27293a.mo36832a(-2, notNotifyUserResult.getNotNotifyUsers());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.manager.c$s */
    static final class C10107s<T> implements Consumer<NotNotifyUserResult> {

        /* renamed from: a */
        final /* synthetic */ AbstractC9636d f27296a;

        /* renamed from: b */
        final /* synthetic */ int f27297b;

        C10107s(AbstractC9636d dVar, int i) {
            this.f27296a = dVar;
            this.f27297b = i;
        }

        /* renamed from: a */
        public final void accept(NotNotifyUserResult notNotifyUserResult) {
            C13479a.m54764b("DocPermissionManager", "updateUserPermission succeed");
            Intrinsics.checkExpressionValueIsNotNull(notNotifyUserResult, "it");
            if (notNotifyUserResult.getNotNotifyUsers() == null || notNotifyUserResult.getNotNotifyUsers().isEmpty()) {
                this.f27296a.mo17111a(this.f27297b);
            } else {
                this.f27296a.mo36832a(this.f27297b, notNotifyUserResult.getNotNotifyUsers());
            }
        }
    }

    /* renamed from: b */
    private final AbstractC68307f<Boolean> m42003b(String str) {
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/check_lock/public/update/");
        fVar.mo20153c(str);
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CheckLockParser());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(CheckLockParser())");
        AbstractC68307f<Boolean> f = a.mo20141a(fVar).mo238014c(C10093e.f27281a).mo238029f(C10094f.f27282a);
        Intrinsics.checkExpressionValueIsNotNull(f, "puller.pull(request)\n   …  false\n                }");
        return f;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41990a(int i, String str) {
        C13479a.m54764b("DocPermissionManager", "unlock()...");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/unlock/");
        fVar.mo20153c(jSONObject.toJSONString());
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(SimpleResultParser())");
        AbstractC68307f<Boolean> c = a.mo20141a(fVar).mo238014c(C10106r.f27295a);
        Intrinsics.checkExpressionValueIsNotNull(c, "puller.pull(request)\n   …p { Flowable.just(true) }");
        return c;
    }

    /* renamed from: b */
    public final AbstractC68307f<Integer> mo38438b(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        C13479a.m54764b("DocPermissionManager", "fetchCollaboratorNum()...");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/members/count/");
        fVar.mo20145a("token", str);
        fVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(i));
        AbstractC68307f<Integer> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CollaboratorCountParser()).mo20141a(fVar).mo238020d(C10095g.f27283a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne…         .map { it.data }");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41991a(int i, String str, int i2) {
        C13479a.m54764b("DocPermissionManager", "updateLinkShareEntity");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) Integer.valueOf(i2));
        DocPermissionManager cVar = f27276a;
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        return cVar.m42003b(jSONString);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m42001a(int i, String str, UserInfo userInfo, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m41999a(i, str, userInfo, 1, gVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Disposable m41989a(int i, String str, String str2, AbstractC5204e<ShareUserInfoResult> eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        Disposable b = m41993a(i, str, 0, str2).mo238001b(new C10096h(eVar), new C10097i(eVar));
        Intrinsics.checkExpressionValueIsNotNull(b, "getUserInfoV2(type, toke…                       })");
        return b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<SimpleRequestResult> m41992a(int i, String str, int i2, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap.put("token", str);
        String id = userInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "userInfo.id");
        hashMap.put("owner_id", id);
        hashMap.put("owner_type", String.valueOf(userInfo.getOwnerType()));
        hashMap.put("perm_type", String.valueOf(i2));
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/members/delete/");
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<ShareUserInfoResult> m41993a(int i, String str, int i2, String str2) {
        C13479a.m54764b("DocPermissionManager", "getUserInfoV2()...lastLabel = " + str2);
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/members.v2/");
        if (str == null) {
            str = "";
        }
        fVar.mo20145a("token", str);
        fVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        fVar.mo20145a("last_label", str2);
        fVar.mo20145a("perm_type", String.valueOf(i2));
        AbstractC68307f<ShareUserInfoResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9828h()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41994a(int i, String str, String str2, int i2) {
        C13479a.m54764b("DocPermissionManager", "checkMembersDeleteLock");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put((Object) "member_id", (Object) str2);
        jSONObject2.put((Object) "member_type", (Object) Integer.valueOf(i2));
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/check_lock/members/delete/");
        fVar.mo20153c(jSONObject.toJSONString());
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CheckLockParser());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(CheckLockParser())");
        AbstractC68307f<Boolean> f = a.mo20141a(fVar).mo238014c(C10089a.f27277a).mo238029f(C10090b.f27278a);
        Intrinsics.checkExpressionValueIsNotNull(f, "puller.pull(request)\n   …  false\n                }");
        return f;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m41999a(int i, String str, UserInfo userInfo, int i2, AbstractC10169g gVar) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        m41992a(i, str, i2, userInfo).mo238001b(new C10100l(gVar), new C10101m(gVar));
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC68307f<NotNotifyUserResult> m42002b(int i, String str, UserInfo userInfo, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap.put("token", str);
        String id = userInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "userInfo.id");
        hashMap.put("owner_id", id);
        hashMap.put("owner_type", String.valueOf(userInfo.getOwnerType()));
        hashMap.put("permission", String.valueOf(i2));
        hashMap.put("perm_type", String.valueOf(i3));
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission.v2/members/update/");
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        AbstractC68307f<NotNotifyUserResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9635c()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m42004b(int i, String str, UserInfo userInfo, int i2, AbstractC9636d dVar) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        m42002b(i, str, userInfo, i2, 1).mo238001b(new C10107s(dVar, i2), new C10108t(dVar));
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41995a(int i, String str, String str2, int i2, int i3) {
        C13479a.m54764b("DocPermissionManager", "checkUpdateMembersLock");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put((Object) "member_id", (Object) str2);
        jSONObject2.put((Object) "member_type", (Object) Integer.valueOf(i2));
        jSONObject2.put((Object) "permission", (Object) Integer.valueOf(i3));
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/check_lock/members/update/");
        fVar.mo20153c(jSONObject.toJSONString());
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CheckLockParser());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller(CheckLockParser())");
        AbstractC68307f<Boolean> f = a.mo20141a(fVar).mo238014c(C10091c.f27279a).mo238029f(C10092d.f27280a);
        Intrinsics.checkExpressionValueIsNotNull(f, "puller.pull(request)\n   …  false\n                }");
        return f;
    }
}

package com.bytedance.ee.bear.middleground.permission.permission.bitableshare;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9716f;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableShareUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J(\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\u0006\u0010\"\u001a\u00020#H\u0002J>\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0004H\u0007J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010*\u001a\u00020 H\u0007J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0017H\u0007J6\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableSharePermissionManager;", "", "()V", "API_PATH_FETCH_COLLABORATORS", "", "API_PATH_INVITE_COLLABORATORS", "API_PATH_PUBLIC_PERMISSION", "API_PATH_REMOVE_COLLABORATOR", "API_PATH_UPDATE_PUBLIC_PERMISSION", "API_PATH_UPDATE_SHARE_FLAG", "API_PATH_USER_PERMISSION", "TAG", "fetchCollaborators", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "baseToken", "shareToken", "lastLabel", "fetchPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "tableId", "viewId", "shareType", "", "fetchPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "fetchUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;", "getMembersJsonArray", "Lcom/alibaba/fastjson/JSONArray;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "withPerm", "", "inviteCollaborators", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "notify", "notes", "removeCollaborator", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "userInfo", "updateLinkShareEntity", "linkShareEntity", "updateShareFlag", "flag", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.a */
public final class BitableSharePermissionManager {

    /* renamed from: a */
    public static final BitableSharePermissionManager f26840a = new BitableSharePermissionManager();

    private BitableSharePermissionManager() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<String> m41325a(String str, String str2, String str3, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(str3, "viewId");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/bitable/share/flag/update");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "baseToken", (Object) str);
        jSONObject2.put((Object) "tableId", (Object) str2);
        jSONObject2.put((Object) "viewId", (Object) str3);
        jSONObject2.put((Object) "shareType", (Object) Integer.valueOf(i));
        jSONObject2.put((Object) "flag", (Object) Integer.valueOf(i2));
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<String> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new ShareTokenParser()).mo20141a(fVar).mo238020d(C9928d.f26844a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne…   .map { it.shareToken }");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<InviteResult> m41327a(String str, ArrayList<UserInfo> arrayList, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str2, "notes");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/bitable/share/permission/members/create");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "shareToken", (Object) str);
        jSONObject2.put((Object) "members", (Object) f26840a.m41319a(arrayList, true));
        jSONObject2.put((Object) "notifyLark", (Object) Integer.valueOf(z ? 1 : 0));
        fVar.mo20143a(1);
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<InviteResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9716f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableSharePublicPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.a$b */
    public static final class C9926b<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9926b f26842a = new C9926b();

        C9926b() {
        }

        /* renamed from: a */
        public final IBitableSharePublicPermission apply(BitableSharePublicPermission bitableSharePublicPermission) {
            Intrinsics.checkParameterIsNotNull(bitableSharePublicPermission, "it");
            return bitableSharePublicPermission;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableShareUserPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.a$c */
    public static final class C9927c<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9927c f26843a = new C9927c();

        C9927c() {
        }

        /* renamed from: a */
        public final IBitableShareUserPermission apply(BitableShareUserPermission bitableShareUserPermission) {
            Intrinsics.checkParameterIsNotNull(bitableShareUserPermission, "it");
            return bitableShareUserPermission;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/ShareTokenData;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.a$d */
    public static final class C9928d<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C9928d f26844a = new C9928d();

        C9928d() {
        }

        /* renamed from: a */
        public final String apply(ShareTokenData shareTokenData) {
            Intrinsics.checkParameterIsNotNull(shareTokenData, "it");
            return shareTokenData.getShareToken();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "t1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;", "t2", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.a$a */
    public static final class C9925a<T1, T2, R> implements BiFunction<IBitableShareUserPermission, IBitableSharePublicPermission, BitableSharePermission> {

        /* renamed from: a */
        public static final C9925a f26841a = new C9925a();

        C9925a() {
        }

        /* renamed from: a */
        public final BitableSharePermission apply(IBitableShareUserPermission iBitableShareUserPermission, IBitableSharePublicPermission iBitableSharePublicPermission) {
            Intrinsics.checkParameterIsNotNull(iBitableShareUserPermission, "t1");
            Intrinsics.checkParameterIsNotNull(iBitableSharePublicPermission, "t2");
            return new BitableSharePermission(iBitableShareUserPermission, iBitableSharePublicPermission);
        }
    }

    /* renamed from: a */
    private final JSONArray m41319a(ArrayList<UserInfo> arrayList, boolean z) {
        JSONArray jSONArray = new JSONArray();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            Intrinsics.checkExpressionValueIsNotNull(next, "user");
            jSONObject2.put((Object) "memberId", (Object) next.getId());
            jSONObject2.put((Object) "memberType", (Object) Integer.valueOf(next.getOwnerType()));
            if (z) {
                jSONObject2.put((Object) "permission", (Object) Integer.valueOf(next.getPermission()));
            }
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<SimpleRequestResult> m41320a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/bitable/share/permission");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "shareToken", (Object) str);
        jSONObject2.put((Object) "linkShareEntity", (Object) Integer.valueOf(i));
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<SimpleRequestResult> m41321a(String str, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(str, "shareToken");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/bitable/share/permission/members/delete");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "shareToken", (Object) str);
        jSONObject2.put((Object) "members", (Object) f26840a.m41319a(CollectionsKt.arrayListOf(userInfo), false));
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<IBitableSharePublicPermission> m41322a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "shareToken");
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("space/api/bitable/%s/share/permission", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        NetService.C5077f fVar = new NetService.C5077f(format);
        fVar.mo20145a("shareToken", str2);
        fVar.mo20143a(2);
        AbstractC68307f<IBitableSharePublicPermission> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new BitableSharePublicPermissionParser()).mo20141a(fVar).mo238020d(C9926b.f26842a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<ShareUserInfoResult> m41323a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "shareToken");
        Intrinsics.checkParameterIsNotNull(str3, "lastLabel");
        C13479a.m54764b("BitableSharePermissionManager", "fetchCollaborators()...lastLabel = " + str3);
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("/space/api/bitable/%s/share/permission/members", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        NetService.C5077f fVar = new NetService.C5077f(format);
        fVar.mo20145a("shareToken", str2);
        fVar.mo20145a("lastLabel", str3);
        fVar.mo20143a(2);
        AbstractC68307f<ShareUserInfoResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CollaboratorsParser()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<IBitableShareUserPermission> m41324a(String str, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(str3, "viewId");
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("/space/api/bitable/%s/share/user_permission", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        NetService.C5077f fVar = new NetService.C5077f(format);
        fVar.mo20145a("tableId", str2);
        fVar.mo20145a("viewId", str3);
        fVar.mo20145a("shareType", String.valueOf(i));
        fVar.mo20143a(2);
        AbstractC68307f<IBitableShareUserPermission> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new BitableShareUserPermissionParser()).mo20141a(fVar).mo238020d(C9927c.f26843a);
        Intrinsics.checkExpressionValueIsNotNull(d, "KoinJavaComponent.get(Ne… result\n                }");
        return d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<BitableSharePermission> m41326a(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkParameterIsNotNull(str, "baseToken");
        Intrinsics.checkParameterIsNotNull(str2, "shareToken");
        Intrinsics.checkParameterIsNotNull(str3, "tableId");
        Intrinsics.checkParameterIsNotNull(str4, "viewId");
        AbstractC68307f<BitableSharePermission> a = AbstractC68307f.m265092a(m41324a(str, str3, str4, i), m41322a(str, str2), C9925a.f26841a);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.zip(userPermFlo…1, t2)\n                })");
        return a;
    }
}

package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ \u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BlockUserParser;", "", "()V", "TAG", "", "getFailMembers", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserEntity;", "code", "", "failMembersObj", "Lorg/json/JSONObject;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "getMemberById", "id", "getUsers", "blockUsersMapObj", "usersMapObj", "parseFailMember", "memberInfoObj", "parseUser", "userInfoObj", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.b */
public final class BlockUserParser {

    /* renamed from: a */
    public static final BlockUserParser f26192a = new BlockUserParser();

    private BlockUserParser() {
    }

    /* renamed from: a */
    private final NotNotifyUserEntity m40172a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        NotNotifyUserEntity notNotifyUserEntity = new NotNotifyUserEntity();
        notNotifyUserEntity.setId(jSONObject.optString("id"));
        notNotifyUserEntity.setName(jSONObject.optString("name"));
        notNotifyUserEntity.setCn_name(jSONObject.optString("cn_name"));
        notNotifyUserEntity.setEn_name(jSONObject.optString("en_name"));
        notNotifyUserEntity.setEmail(jSONObject.optString("email"));
        notNotifyUserEntity.setSuid(jSONObject.optString("suid"));
        notNotifyUserEntity.setAvatar_url(jSONObject.optString("avatar_url"));
        notNotifyUserEntity.setTenant_name(jSONObject.optString("tenant_name"));
        notNotifyUserEntity.setTenant_id(jSONObject.optString("tenant_id"));
        return notNotifyUserEntity;
    }

    /* renamed from: a */
    private final UserInfo m40174a(String str, ArrayList<UserInfo> arrayList) {
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "user");
            if (TextUtils.equals(str, next.getId())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final NotNotifyUserEntity m40173a(JSONObject jSONObject, ArrayList<UserInfo> arrayList) {
        if (jSONObject == null) {
            return null;
        }
        NotNotifyUserEntity notNotifyUserEntity = new NotNotifyUserEntity();
        notNotifyUserEntity.setId(jSONObject.optString("owner_id"));
        notNotifyUserEntity.setOwnerType(jSONObject.optInt("owner_type"));
        notNotifyUserEntity.setPermission(jSONObject.optInt("permission"));
        String id = notNotifyUserEntity.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "member.id");
        UserInfo a = m40174a(id, arrayList);
        if (a == null) {
            C13479a.m54775e("BlockUserParser", "getMemberById()... not found");
            return null;
        }
        notNotifyUserEntity.setName(a.getName());
        notNotifyUserEntity.setCn_name(a.getCnName());
        notNotifyUserEntity.setAvatar_url(a.getAvatarUrl());
        notNotifyUserEntity.setTenant_id(a.getTenantId());
        notNotifyUserEntity.setTenant_name(a.getTenantName());
        return notNotifyUserEntity;
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<NotNotifyUserEntity> m40175a(int i, JSONObject jSONObject, JSONObject jSONObject2) {
        NotNotifyUserEntity a;
        Intrinsics.checkParameterIsNotNull(jSONObject, "blockUsersMapObj");
        Intrinsics.checkParameterIsNotNull(jSONObject2, "usersMapObj");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(String.valueOf(i));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString) && (a = f26192a.m40172a(jSONObject2.optJSONObject(optString))) != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<NotNotifyUserEntity> mo37043a(int i, JSONObject jSONObject, ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "failMembersObj");
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(String.valueOf(i));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                NotNotifyUserEntity a = m40173a(optJSONArray.optJSONObject(i2), arrayList);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
        }
        return arrayList2;
    }
}

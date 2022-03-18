package com.bytedance.ee.bear.middleground.permission.sharefolder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.ModifyOldShareFolderMemberParam;
import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/sharefolder/FolderPermissionManagerDispatcher;", "", "()V", "TAG", "", "getModifyUserReqParam", "isShareFolderV2", "", "spaceId", "token", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "getPermissionManagerWithVersion", "Lcom/bytedance/ee/bear/middleground/permission/sharefolder/IFolderPermission;", "getUpdatePublicReqParam", "param", "linkShareEntity", "", "allowCrossTenant", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.f.c */
public final class FolderPermissionManagerDispatcher {

    /* renamed from: a */
    public static final FolderPermissionManagerDispatcher f26820a = new FolderPermissionManagerDispatcher();

    /* renamed from: b */
    private static final String f26821b = f26821b;

    private FolderPermissionManagerDispatcher() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final IFolderPermission m41256a(boolean z) {
        if (z) {
            return FolderPermissionManager.f26813a;
        }
        return FolderPermissionManagerOV.f26822a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m41257a(String str, int i, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "param");
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "token", (Object) str);
            jSONObject2.put((Object) "link_share_entity", (Object) Integer.valueOf(i));
        } else if (!z2) {
            JSONObject jSONObject3 = jSONObject;
            jSONObject3.put((Object) "space_id", (Object) str);
            jSONObject3.put((Object) "link_perm", (Object) Integer.valueOf(i));
            if (z) {
                jSONObject3.put((Object) "allow_cross_tenant", (Object) Boolean.valueOf(z));
            }
        }
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "paramObject.toJSONString()");
        return jSONString;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m41258a(boolean z, String str, String str2, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        String str3 = "";
        if (z) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            if (str2 == null) {
                str2 = str3;
            }
            jSONObject2.put((Object) "token", (Object) str2);
            jSONObject2.put((Object) "collaborator_id", (Object) userInfo.getId());
            jSONObject2.put((Object) "collaborator_type", (Object) Integer.valueOf(userInfo.getOwnerType()));
            jSONObject2.put((Object) "perm_role", (Object) Integer.valueOf(userInfo.getPermission()));
            String jSONString = jSONObject.toJSONString();
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "jsonObject.toJSONString()");
            return jSONString;
        } else if (!z) {
            ModifyOldShareFolderMemberParam modifyOldShareFolderMemberParam = new ModifyOldShareFolderMemberParam();
            modifyOldShareFolderMemberParam.setSpace_id(str);
            ArrayList arrayList = new ArrayList();
            ModifyOldShareFolderMemberParam.Owner owner = new ModifyOldShareFolderMemberParam.Owner();
            String id = userInfo.getId();
            if (id != null) {
                str3 = id;
            }
            owner.setId(str3);
            owner.setType(userInfo.getOwnerType());
            owner.setPerm(userInfo.getPermission());
            arrayList.add(owner);
            modifyOldShareFolderMemberParam.setOwners(arrayList);
            String jSONString2 = JSON.toJSONString(modifyOldShareFolderMemberParam);
            Intrinsics.checkExpressionValueIsNotNull(jSONString2, "JSON.toJSONString(param)");
            return jSONString2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}

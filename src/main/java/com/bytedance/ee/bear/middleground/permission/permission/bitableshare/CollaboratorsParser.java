package com.bytedance.ee.bear.middleground.permission.permission.bitableshare;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/CollaboratorsParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "()V", "parse", "json", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.bitableshare.d */
public final class CollaboratorsParser implements NetService.AbstractC5074c<ShareUserInfoResult> {
    /* renamed from: a */
    public ShareUserInfoResult parse(String str) {
        JSONArray jSONArray;
        int i;
        boolean z;
        String optString;
        if (str == null) {
            C13479a.m54758a("BitableSharePermissionParser", "parseCollaborators()...json is null");
            return new ShareUserInfoResult();
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("members");
            } else {
                jSONArray = null;
            }
            int i2 = 0;
            if (jSONArray != null) {
                i = jSONArray.length();
            } else {
                i = 0;
            }
            ArrayList<UserInfo> arrayList = new ArrayList<>();
            String str2 = "";
            if (jSONArray != null && i > 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    UserInfo userInfo = new UserInfo();
                    userInfo.setOwnerType(jSONObject.optInt("memberType"));
                    String optString2 = jSONObject.optString("memberId");
                    if (optString2 == null) {
                        optString2 = str2;
                    }
                    userInfo.setId(optString2);
                    userInfo.setPermission(jSONObject.optInt("permission"));
                    String optString3 = jSONObject.optString("memberName");
                    if (optString3 == null) {
                        optString3 = str2;
                    }
                    userInfo.setName(optString3);
                    String optString4 = jSONObject.optString("avatarUrl");
                    if (optString4 == null) {
                        optString4 = str2;
                    }
                    userInfo.setAvatarUrl(optString4);
                    if (userInfo.isUserType()) {
                        String optString5 = jSONObject.optString("departmentName");
                        if (optString5 == null) {
                            optString5 = str2;
                        }
                        userInfo.setLabel(optString5);
                    } else if (userInfo.getOwnerType() == 2) {
                        String optString6 = jSONObject.optString("groupDescription");
                        if (optString6 == null) {
                            optString6 = str2;
                        }
                        userInfo.setLabel(optString6);
                    }
                    String optString7 = jSONObject.optString("tenantName");
                    if (optString7 == null) {
                        optString7 = str2;
                    }
                    userInfo.setTenantName(optString7);
                    String optString8 = jSONObject.optString("tenantId");
                    if (optString8 == null) {
                        optString8 = str2;
                    }
                    userInfo.setTenantId(optString8);
                    userInfo.setOwner(jSONObject.optBoolean("isOwner"));
                    arrayList.add(userInfo);
                }
            }
            ShareUserInfoResult shareUserInfoResult = new ShareUserInfoResult();
            shareUserInfoResult.setUserInfoList(arrayList);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("lastLabel")) == null)) {
                str2 = optString;
            }
            shareUserInfoResult.setLastLabel(str2);
            if (optJSONObject != null) {
                z = optJSONObject.optBoolean("hasMore");
            } else {
                z = false;
            }
            shareUserInfoResult.setHasMore(z);
            if (optJSONObject != null) {
                i2 = optJSONObject.optInt("totalNum");
            }
            shareUserInfoResult.setTotalNum(i2);
            return shareUserInfoResult;
        } catch (Throwable th) {
            C13479a.m54759a("BitableSharePermissionParser", "parseCollaborators()...error", th);
            return new ShareUserInfoResult();
        }
    }
}

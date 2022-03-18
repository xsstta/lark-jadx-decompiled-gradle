package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.h */
public class C9828h implements NetService.AbstractC5074c<ShareUserInfoResult> {
    /* renamed from: a */
    private void m40632a(ArrayList<UserInfo> arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator<UserInfo> it = arrayList.iterator();
            UserInfo userInfo = null;
            UserInfo userInfo2 = null;
            UserInfo userInfo3 = null;
            while (it.hasNext()) {
                UserInfo next = it.next();
                if (next.getOwnerType() == 23) {
                    userInfo3 = next;
                }
                if (next.getOwnerType() == 24) {
                    userInfo2 = next;
                }
                if (next.isOwner()) {
                    userInfo = next;
                }
            }
            if (userInfo != null) {
                arrayList.remove(userInfo);
                arrayList.add(0, userInfo);
            }
            if (userInfo2 != null) {
                arrayList.remove(userInfo2);
                arrayList.add(0, userInfo2);
            }
            if (userInfo3 != null) {
                arrayList.remove(userInfo3);
                arrayList.add(0, userInfo3);
            }
        }
    }

    /* renamed from: a */
    public ShareUserInfoResult parse(String str) throws NetService.ParseException {
        ShareUserInfoResult shareUserInfoResult = new ShareUserInfoResult();
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONArray optJSONArray = optJSONObject.optJSONArray("members");
            shareUserInfoResult.setExternal(optJSONObject.optBoolean("is_external"));
            shareUserInfoResult.setTotalNum(optJSONObject.optInt("total_num"));
            shareUserInfoResult.setHasMore(optJSONObject.optBoolean("has_more"));
            shareUserInfoResult.setLastLabel(optJSONObject.optString("last_label"));
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("entities").optJSONObject("users");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                UserInfo userInfo = new UserInfo();
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                String optString = jSONObject.optString("owner_id");
                userInfo.setId(optString);
                userInfo.setName(jSONObject.optString("owner_name"));
                userInfo.setAvatarUrl(jSONObject.optString("avatar_url"));
                userInfo.setPermission(jSONObject.optInt("permissions"));
                userInfo.setOwner(jSONObject.optBoolean("is_owner"));
                userInfo.setOwnerType(jSONObject.optInt("owner_type"));
                userInfo.setExternal(jSONObject.optBoolean("is_external"));
                userInfo.setHas_tips(jSONObject.optBoolean("has_tips", false));
                userInfo.setCan_modify_perm(jSONObject.optBoolean("can_modify_perm", false));
                userInfo.setPermSource(jSONObject.optString("perm_source", ""));
                int ownerType = userInfo.getOwnerType();
                if (ownerType != 0) {
                    if (ownerType == 2) {
                        userInfo.setLabel(jSONObject.optString("group_description"));
                    } else if (ownerType != 17) {
                    }
                    arrayList.add(userInfo);
                }
                userInfo.setLabel(jSONObject.optString("department_name"));
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString);
                if (optJSONObject3 != null) {
                    userInfo.setCnName(optJSONObject3.optString("cn_name"));
                    userInfo.setEnName(optJSONObject3.optString("en_name"));
                    userInfo.setTenantName(optJSONObject3.optString("tenant_name"));
                    userInfo.setTenantId(optJSONObject3.optString("tenant_id"));
                    userInfo.setTenant_tag(optJSONObject3.optString("tenant_tag"));
                    userInfo.setIs_single_product(optJSONObject3.optBoolean("is_single_product"));
                }
                arrayList.add(userInfo);
            }
        } catch (JSONException unused) {
            C13479a.m54764b("UserInfoV2Parser", "new mainObj exception");
        }
        m40632a(arrayList);
        shareUserInfoResult.setUserInfoList(arrayList);
        return shareUserInfoResult;
    }
}

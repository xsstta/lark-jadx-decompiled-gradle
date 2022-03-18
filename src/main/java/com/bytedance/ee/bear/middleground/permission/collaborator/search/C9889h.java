package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.h */
public class C9889h implements NetService.AbstractC5074c<SearchUserResult> {

    /* renamed from: a */
    private Context f26751a;

    public C9889h(Context context) {
        this.f26751a = context;
    }

    /* renamed from: a */
    public SearchUserResult parse(String str) {
        SearchUserResult searchUserResult = new SearchUserResult();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            searchUserResult.list = mo37655a(optJSONObject.optJSONArray("candidates"), optJSONObject.optJSONObject("entities").optJSONObject("users"));
            searchUserResult.hasMore = optJSONObject.optBoolean("has_more");
            searchUserResult.isValid = optJSONObject.optBoolean("is_valid");
            searchUserResult.isRealUser = optJSONObject.optBoolean("is_real_user");
        } catch (JSONException e) {
            C13479a.m54766b("SearchUserResultParser", e);
        } catch (Exception e2) {
            C13479a.m54766b("SearchUserResultParser", e2);
        }
        return searchUserResult;
    }

    /* renamed from: a */
    public ArrayList<UserInfo> mo37655a(JSONArray jSONArray, JSONObject jSONObject) {
        String str;
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        String string = this.f26751a.getResources().getString(R.string.Doc_Facade_NoGroupDesc);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                UserInfo userInfo = new UserInfo();
                userInfo.setAvatarUrl(jSONObject2.optString("avatar_url"));
                userInfo.setId(jSONObject2.optString("owner_id"));
                userInfo.setOwnerType(jSONObject2.optInt("owner_type"));
                userInfo.setCan_modify_perm(true);
                userInfo.setCan_modify_role(true);
                int ownerType = userInfo.getOwnerType();
                if (ownerType != 0) {
                    if (ownerType != 1) {
                        if (ownerType == 2) {
                            userInfo.setName(jSONObject2.optString("owner_name"));
                            userInfo.setExternal(jSONObject2.optBoolean("is_cross_tenant"));
                            if (jSONObject2.isNull("group_description")) {
                                str = "";
                            } else {
                                str = jSONObject2.optString("group_description");
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = string;
                            }
                            userInfo.setLabel(str);
                            userInfo.setUserCount(jSONObject2.optInt("user_count", 0));
                            arrayList.add(userInfo);
                        } else if (ownerType == 18) {
                            userInfo.setName(jSONObject2.optString("owner_name"));
                            arrayList.add(userInfo);
                        }
                    } else {
                        userInfo.setOwnerType(0);
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(jSONObject2.optString("owner_id"));
                userInfo.setLabel(jSONObject2.optString("department_name"));
                userInfo.setExternal(jSONObject2.optBoolean("is_external"));
                userInfo.setBlockStatus(jSONObject2.optInt("block_status"));
                userInfo.setFriend(jSONObject2.optBoolean("is_friend"));
                if (optJSONObject != null) {
                    userInfo.setName(optJSONObject.optString("name"));
                    userInfo.setCnName(optJSONObject.optString("cn_name"));
                    userInfo.setEnName(optJSONObject.optString("en_name"));
                    userInfo.setTenantId(optJSONObject.optString("tenant_id"));
                    userInfo.setTenantName(optJSONObject.optString("tenant_name"));
                    userInfo.setTenant_tag(optJSONObject.optString("tenant_tag"));
                    userInfo.setIs_single_product(optJSONObject.optBoolean("is_single_product"));
                }
                if (userInfo.getOwnerType() == 17) {
                    userInfo.setLabel(this.f26751a.getString(R.string.Doc_Permission_InviteByPhone));
                }
                arrayList.add(userInfo);
            } catch (JSONException e) {
                C13479a.m54766b("SearchUserResultParser", e);
                return null;
            }
        }
        C13479a.m54772d("SearchUserResultParser", arrayList.toString());
        return arrayList;
    }
}

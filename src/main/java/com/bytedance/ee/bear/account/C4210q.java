package com.bytedance.ee.bear.account;

import com.bytedance.ee.bear.account.NetContract;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.account.q */
public class C4210q implements NetContract.AbstractC4160a<UserInfo> {
    /* renamed from: b */
    public UserInfo mo16368a(String str) {
        UserInfo userInfo = new UserInfo();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            userInfo.id = optJSONObject.optString("id");
            userInfo.cnName = optJSONObject.optString("cn_name");
            userInfo.enName = optJSONObject.optString("en_name");
            userInfo.email = optJSONObject.optString("email");
            userInfo.mobile = optJSONObject.optString("mobile");
            userInfo.avatarUrl = optJSONObject.optString("avatar_url");
            userInfo.suid = optJSONObject.optString("suid");
            userInfo.tenantName = optJSONObject.optString("tenant_name");
            userInfo.tenantId = optJSONObject.optString("tenant_id");
            userInfo.departmentId = optJSONObject.optString("department_id");
            userInfo.canCreateSheet = optJSONObject.optBoolean("can_create_sheet");
            userInfo.domain = optJSONObject.optString("domain");
            userInfo.isSingleproduct = optJSONObject.optBoolean("is_singleproduct");
            userInfo.tenantTag = optJSONObject.optString("tenant_tag");
            userInfo.isManager = optJSONObject.optBoolean("is_manager", false);
        } catch (JSONException e) {
            C13479a.m54769c("UserParser", "new mainObj exception", e);
        } catch (Exception e2) {
            C13479a.m54769c("UserParser", "exception : " + e2.toString(), e2);
        }
        return userInfo;
    }
}

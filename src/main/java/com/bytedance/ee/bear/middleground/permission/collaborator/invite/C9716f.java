package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.f */
public class C9716f implements NetService.AbstractC5074c<InviteResult> {
    /* renamed from: a */
    public InviteResult parse(String str) {
        JSONObject jSONObject;
        InviteResult inviteResult = new InviteResult();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            inviteResult.msg = jSONObject2.optString("msg");
            inviteResult.code = jSONObject2.optString("code");
            C13479a.m54764b("InviteParser", "InviteParser()...code = " + inviteResult.code + ", msg = " + inviteResult.msg);
            if (jSONObject2.isNull(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                jSONObject = null;
            } else {
                jSONObject = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            if (jSONObject != null) {
                InviteData inviteData = new InviteData();
                inviteResult.data = inviteData;
                String optString = jSONObject.optString("space_id");
                String optString2 = jSONObject.optString("link_token");
                if (!TextUtils.isEmpty(optString)) {
                    inviteData.spaceId = optString;
                    inviteData.linkToken = optString2;
                }
                inviteData.notificationId = "";
                String optString3 = jSONObject.optString("not_notify_users");
                if (!TextUtils.isEmpty(optString3)) {
                    inviteData.notNotifyUsers = JSON.parseArray(optString3, NotNotifyUserEntity.class);
                }
                inviteData.limitNum = jSONObject.optInt("limit_num");
                JSONObject optJSONObject = jSONObject.optJSONObject("block_user_map");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("user_map");
                if (!(optJSONObject == null || optJSONObject2 == null)) {
                    inviteData.blockUsers = BlockUserParser.m40175a(10021, optJSONObject, optJSONObject2);
                    inviteData.blockedUsers = BlockUserParser.m40175a(10022, optJSONObject, optJSONObject2);
                    inviteData.privacyUsers = BlockUserParser.m40175a(10023, optJSONObject, optJSONObject2);
                    inviteData.addFailedUsers = BlockUserParser.m40175a(10024, optJSONObject, optJSONObject2);
                    inviteData.limitUsers = BlockUserParser.m40175a(10025, optJSONObject, optJSONObject2);
                    inviteData.phoneLimitUsers = BlockUserParser.m40175a(10026, optJSONObject, optJSONObject2);
                }
            }
            return inviteResult;
        } catch (JSONException e) {
            C13479a.m54761a("InviteParser", e);
            return inviteResult;
        }
    }
}

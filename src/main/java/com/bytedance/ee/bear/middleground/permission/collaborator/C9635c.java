package com.bytedance.ee.bear.middleground.permission.collaborator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.c */
public class C9635c implements NetService.AbstractC5074c<NotNotifyUserResult> {
    /* renamed from: a */
    public NotNotifyUserResult parse(String str) throws NetService.ParseException {
        JSONObject jSONObject;
        NotNotifyUserResult notNotifyUserResult = new NotNotifyUserResult();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            notNotifyUserResult.msg = jSONObject2.optString("msg");
            notNotifyUserResult.code = jSONObject2.optInt("code");
            if (jSONObject2.isNull(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                jSONObject = null;
            } else {
                jSONObject = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("not_notify_users");
                if (!TextUtils.isEmpty(optString)) {
                    notNotifyUserResult.setNotNotifyUsers(JSON.parseArray(optString, NotNotifyUserEntity.class));
                }
            }
            return notNotifyUserResult;
        } catch (JSONException e) {
            C13479a.m54761a("NotNotifyUserParser", e);
            return notNotifyUserResult;
        }
    }
}

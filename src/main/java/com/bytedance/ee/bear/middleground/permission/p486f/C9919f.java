package com.bytedance.ee.bear.middleground.permission.p486f;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.permission.f.f */
public class C9919f implements NetService.AbstractC5074c<ShareUserInfoResult> {

    /* renamed from: a */
    private String f26824a;

    C9919f(String str) {
        this.f26824a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray mo37753a(JSONObject jSONObject) {
        return jSONObject.optJSONArray(this.f26824a);
    }

    /* renamed from: a */
    public ShareUserInfoResult parse(String str) {
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject jSONObject = optJSONObject.getJSONObject("entities").getJSONObject("users");
            JSONArray a = mo37753a(optJSONObject);
            if (a != null) {
                for (int i = 0; i < a.length(); i++) {
                    m41282a(arrayList, jSONObject, a, i);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ShareUserInfoResult shareUserInfoResult = new ShareUserInfoResult();
        shareUserInfoResult.setUserInfoList(arrayList);
        return shareUserInfoResult;
    }

    /* renamed from: a */
    private void m41283a(JSONObject jSONObject, UserInfo userInfo) {
        if (jSONObject != null) {
            userInfo.setCnName(jSONObject.optString("cn_name"));
            userInfo.setEnName(jSONObject.optString("en_name"));
            userInfo.setTenantName(jSONObject.optString("tenant_name"));
            userInfo.setTenantId(jSONObject.optString("tenant_id"));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (r5 != 17) goto L_0x009c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ee.bear.share.export.UserInfo mo37752a(org.json.JSONObject r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.p486f.C9919f.mo37752a(org.json.JSONObject, java.lang.String):com.bytedance.ee.bear.share.export.UserInfo");
    }

    /* renamed from: a */
    private void m41282a(ArrayList<UserInfo> arrayList, JSONObject jSONObject, JSONArray jSONArray, int i) throws JSONException {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("owner_id");
        JSONObject optJSONObject = jSONObject.optJSONObject(optString);
        UserInfo a = mo37752a(jSONObject2, optString);
        m41283a(optJSONObject, a);
        arrayList.add(a);
    }
}

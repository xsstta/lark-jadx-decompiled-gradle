package com.bytedance.ee.bear.list.folder.complaint;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.g */
public class C8352g implements NetService.AbstractC5074c<GetComplaintResult> {
    /* renamed from: a */
    public GetComplaintResult parse(String str) {
        GetComplaintResult getComplaintResult = new GetComplaintResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            getComplaintResult.setCode(jSONObject.optInt("code"));
            getComplaintResult.setResult(jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optInt("result"));
        } catch (JSONException e) {
            C13479a.m54758a("GetComplaintParser", "parse()...error = " + e);
        }
        return getComplaintResult;
    }
}

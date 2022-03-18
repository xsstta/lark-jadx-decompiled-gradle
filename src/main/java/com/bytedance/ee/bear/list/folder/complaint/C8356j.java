package com.bytedance.ee.bear.list.folder.complaint;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.j */
public class C8356j implements NetService.AbstractC5074c<SendComplaintResult> {
    /* renamed from: a */
    public SendComplaintResult parse(String str) {
        SendComplaintResult sendComplaintResult = new SendComplaintResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            sendComplaintResult.setCode(jSONObject.optInt("code"));
            sendComplaintResult.setComplaintId(jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optInt("id"));
        } catch (JSONException e) {
            C13479a.m54758a("SendComplaintParser", "parse()...error = " + e);
        }
        return sendComplaintResult;
    }
}

package com.bytedance.ee.bear.list.folderselect;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folderselect.c */
public class C8401c implements NetService.AbstractC5074c<GetMyRootFolderTokenResult> {
    /* renamed from: a */
    public GetMyRootFolderTokenResult parse(String str) {
        GetMyRootFolderTokenResult getMyRootFolderTokenResult = new GetMyRootFolderTokenResult();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                getMyRootFolderTokenResult.setToken(optJSONObject.optString("4"));
            }
        } catch (JSONException e) {
            C13479a.m54758a("GetMyRootFolderTokenParser", "parse()... exception = " + e);
        }
        return getMyRootFolderTokenResult;
    }
}

package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.folder.x */
public class C8385x implements NetService.AbstractC5074c<GetDocumentExternalPermResult> {
    /* renamed from: a */
    public GetDocumentExternalPermResult parse(String str) {
        GetDocumentExternalPermResult getDocumentExternalPermResult = new GetDocumentExternalPermResult();
        HashMap<String, Boolean> hashMap = new HashMap<>();
        getDocumentExternalPermResult.setPermMap(hashMap);
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Boolean.valueOf(optJSONObject.optBoolean(next, true)));
            }
        } catch (JSONException e) {
            C13479a.m54759a("GetDocumentExternalPermParser", "parse()...json = " + str, e);
        }
        return getDocumentExternalPermResult;
    }
}

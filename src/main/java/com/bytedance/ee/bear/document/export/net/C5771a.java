package com.bytedance.ee.bear.document.export.net;

import com.bytedance.ee.bear.contract.NetService;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.document.export.net.a */
public class C5771a implements NetService.AbstractC5074c<NetService.Result<String>> {
    C5771a() {
    }

    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<String> parse(String str) throws NetService.ParseException {
        try {
            String optString = new JSONObject(str).optString("ticket");
            NetService.Result<String> result = new NetService.Result<>();
            result.setData(optString);
            return result;
        } catch (JSONException unused) {
            throw new NetService.ParseException();
        }
    }
}

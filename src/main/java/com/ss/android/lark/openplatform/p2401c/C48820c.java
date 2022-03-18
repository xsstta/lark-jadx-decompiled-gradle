package com.ss.android.lark.openplatform.p2401c;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.openplatform.common.C48822a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.c.c */
public class C48820c {
    /* renamed from: a */
    public static String m192347a(String str, String str2, long j) {
        String d = C48822a.m192353d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("link", str);
            jSONObject.put("businessTag", str2);
            jSONObject.put("expiration", String.valueOf(j));
        } catch (JSONException e) {
            C53241h.m205895a("LinkUtil", " put params err ", e);
        }
        return (String) SdkSender.syncSend(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(d).mo55533c(jSONObject.toString()).mo55526a(SendHttpRequest.Method.POST), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.openplatform.p2401c.C48820c.C488211 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                try {
                    JSONObject optJSONObject = new JSONObject(SendHttpResponse.ADAPTER.decode(bArr).json_body).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject != null) {
                        return optJSONObject.optString("shortLink");
                    }
                    return null;
                } catch (JSONException e) {
                    C53241h.m205895a("LinkUtil", " get short link err", e);
                    return null;
                }
            }
        });
    }
}

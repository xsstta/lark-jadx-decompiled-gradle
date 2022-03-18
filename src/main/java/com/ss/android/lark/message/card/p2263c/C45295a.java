package com.ss.android.lark.message.card.p2263c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.C45277a;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.p2264d.C45302a;
import com.ss.android.lark.message.card.p2264d.C45304b;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.message.card.c.a */
public class C45295a {

    /* renamed from: a */
    private static final List<String> f114673a = Arrays.asList("https://applink.feishu.cn/client/mini_program/open", "https://applink.larksuite.com/client/mini_program/open", "lark://applink.feishu.cn/client/mini_program/open", "lark://applink.larksuite.com/client/mini_program/open");

    /* renamed from: a */
    public boolean mo160044a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("sslocal://")) {
            return true;
        }
        for (String str2 : f114673a) {
            if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public String mo160041a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && mo160044a(str)) {
            return m179885c(str, str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str;
        }
        OPMonitor a = C45302a.m179899a(C45304b.f114705k);
        a.setErrorMessage(C45304b.f114705k.message);
        a.flush();
        return str;
    }

    /* renamed from: b */
    public void mo160045b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + C45294c.m179871a().mo143902c());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", C45294c.m179871a().mo143901b());
            jSONObject.put("message_id", str2);
            jSONObject.put("trigger_code", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        SendHttpRequest.C15253a c = new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55528a(C45277a.m179798a()).mo55529a(hashMap).mo55533c(jSONObject.toString());
        Command command = Command.SEND_HTTP;
        C452961 r2 = new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.lark.message.card.p2263c.C45295a.C452961 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                try {
                    C45295a.this.mo160043a(false, errorResult.getMessage(), currentTimeMillis);
                    Log.m165383e("InteractiveHandler", "generateTokenForRefreshCard fail:" + errorResult.getMessage());
                    OPMonitor a = C45302a.m179899a(C45304b.f114701g);
                    a.setErrorMessage(C45304b.f114701g.message);
                    a.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                try {
                    JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                    if (jSONObject.optInt("code") == 0) {
                        Log.m165379d("InteractiveHandler", "generateTokenForRefreshCard success!");
                    } else {
                        Log.m165379d("InteractiveHandler", "generateTokenForRefreshCard fail!" + jSONObject.optString("message"));
                        OPMonitor a = C45302a.m179899a(C45304b.f114701g);
                        a.setErrorMessage(C45304b.f114701g.message);
                        a.flush();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C45295a.this.mo160043a(true, "", currentTimeMillis);
            }
        };
        ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, c, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.message.card.p2263c.$$Lambda$nlGhYri8FPznwzigG1jXpA4FnXA */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SendHttpResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: c */
    private String m179885c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("bdp_launch_query");
        if (queryParameter == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("__trigger_id__", str2);
                StringBuffer stringBuffer = new StringBuffer("bdp_launch_query");
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                stringBuffer.append(URLEncoder.encode(jSONObject.toString(), "utf-8"));
                int length = str.length();
                int indexOf = str.indexOf("?");
                if (indexOf <= -1) {
                    return str + "?" + stringBuffer.toString();
                } else if (length - 1 == indexOf) {
                    return str + stringBuffer.toString();
                } else {
                    return str + ContainerUtils.FIELD_DELIMITER + stringBuffer.toString();
                }
            } catch (UnsupportedEncodingException | JSONException e) {
                e.printStackTrace();
                return str;
            }
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(URLDecoder.decode(queryParameter, "utf-8").replace("\\", ""));
                jSONObject2.put("__trigger_id__", str2);
                return mo160042a(str, "bdp_launch_query", URLEncoder.encode(jSONObject2.toString(), "utf-8"));
            } catch (UnsupportedEncodingException | JSONException e2) {
                C53241h.m205894a("InteractiveHandler", "error:" + e2.getMessage());
                e2.printStackTrace();
                return str;
            }
        }
    }

    /* renamed from: a */
    public String mo160042a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replaceAll("(" + str2 + "=[^&]*)", str2 + ContainerUtils.KEY_VALUE_DELIMITER + str3);
    }

    /* renamed from: a */
    public void mo160043a(boolean z, String str, long j) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            jSONObject.put("state", str2);
            if (!z) {
                jSONObject.put("errorMsg", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", System.currentTimeMillis() - j);
            MonitorUtils.monitorEvent("op_messagecard_trigger_code", jSONObject, jSONObject2, null);
        } catch (Exception e) {
            Log.m165384e("InteractiveHandler", e.getMessage(), e);
        }
    }
}

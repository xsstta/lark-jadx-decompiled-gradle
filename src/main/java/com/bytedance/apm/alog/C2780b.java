package com.bytedance.apm.alog;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.util.C3138u;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.alog.b */
public class C2780b {
    /* renamed from: a */
    public static void m11727a(String str) {
        m11728a(str, null);
    }

    /* renamed from: a */
    public static void m11728a(String str, Throwable th) {
        String str2;
        if (C2785b.m11769j()) {
            String[] strArr = new String[2];
            strArr[0] = str;
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = "";
            }
            strArr[1] = str2;
            C2925e.m12374c("AlogUploadTag", strArr);
        }
    }

    /* renamed from: a */
    public static JSONObject m11726a(boolean z, int i, Exception exc, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("success", z);
            jSONObject.put("code", i);
            if (exc != null) {
                jSONObject.put(ApiHandler.API_CALLBACK_EXCEPTION, exc.getMessage() + C3138u.m13079b(exc));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}

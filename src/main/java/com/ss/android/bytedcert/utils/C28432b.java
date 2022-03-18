package com.ss.android.bytedcert.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.bytedcert.callback.AbstractC28333d;
import com.ss.android.bytedcert.config.AbstractC28343c;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.manager.C28396a;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.p1314g.C28380b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.utils.b */
public class C28432b {
    /* renamed from: a */
    public static void m104207a(String str, String str2) {
        try {
            m104209a(str, new JSONObject(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m104210a(Throwable th, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (th != null) {
                jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
                jSONObject.put("exception_msg", th.getMessage());
            }
            jSONObject.put("error_code", i);
            m104209a("byted_cert_sdk_exception", jSONObject);
            AbstractC28333d exceptionCallback = BytedCertManager.getInstance().getExceptionCallback();
            if (exceptionCallback != null) {
                exceptionCallback.mo100937a(th, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m104208a(String str, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            m104209a(str, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m104209a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("uc_verify_action_time", System.currentTimeMillis());
            jSONObject.put("sdk_version", "4.1.0");
            AbstractC28343c certMonitorConfig = BytedCertManager.getInstance().getCertMonitorConfig();
            if (certMonitorConfig != null) {
                jSONObject.put("app_id", certMonitorConfig.mo100948a() + "");
                C28380b certInfo = BytedCertManager.getInstance().getCertInfo();
                if (certInfo != null) {
                    jSONObject.put("uc_verify_scene", certInfo.f71351a);
                    jSONObject.put("uc_verify_mode", certInfo.f71353c);
                    jSONObject.put("uc_verify_session_id", certInfo.f71352b);
                }
                if (C28396a.m104125a().mo101170b()) {
                    jSONObject.put("auto_test_event", str);
                    C28396a.m104126a(jSONObject.toString());
                }
                certMonitorConfig.mo100949a(str, jSONObject);
                return;
            }
            throw new RuntimeException("please setCertMonitorConfig");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m104206a(String str, BDResponse bDResponse, Integer num, JSONObject jSONObject) {
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bDResponse != null) {
            try {
                if (bDResponse.success) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                jSONObject.put("result", str2);
                jSONObject.put("error_code", String.valueOf(bDResponse.errorCode));
                if (!TextUtils.isEmpty(bDResponse.errorMsg)) {
                    jSONObject.put("error_msg", bDResponse.errorMsg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (num != null) {
            jSONObject.put("during", num);
        }
        m104209a(str, jSONObject);
    }
}

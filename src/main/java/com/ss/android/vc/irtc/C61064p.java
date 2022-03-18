package com.ss.android.vc.irtc;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.irtc.p */
public class C61064p {

    /* renamed from: a */
    private static AbstractC61026e f152922a;

    /* renamed from: a */
    public static void m237484a(AbstractC61026e eVar) {
        f152922a = eVar;
    }

    /* renamed from: a */
    public static void m237485a(String str, String str2) {
        AbstractC61026e eVar = f152922a;
        if (eVar != null) {
            eVar.logI("RtcSdkWrapper", "[" + str + "] " + str2);
            return;
        }
        Log.i("RtcSdkWrapper", "[" + str + "] " + str2);
    }

    /* renamed from: b */
    public static void m237486b(String str, String str2) {
        AbstractC61026e eVar = f152922a;
        if (eVar != null) {
            eVar.logD("RtcSdkWrapper", "[" + str + "] " + str2);
            return;
        }
        Log.d("RtcSdkWrapper", "[" + str + "] " + str2);
    }

    /* renamed from: c */
    public static void m237487c(String str, String str2) {
        AbstractC61026e eVar = f152922a;
        if (eVar != null) {
            eVar.logE("RtcSdkWrapper", "[" + str + "] " + str2);
            return;
        }
        Log.e("RtcSdkWrapper", "[" + str + "] " + str2);
    }

    /* renamed from: d */
    public static void m237488d(String str, String str2) {
        if (f152922a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("TAG", str);
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            f152922a.monitor("RtcSdkWrapper", jSONObject);
            return;
        }
        Log.i("RtcSdkWrapper", "[" + str + "] " + str2);
    }
}

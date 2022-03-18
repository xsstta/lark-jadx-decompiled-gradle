package com.bytedance.apm.p129b;

import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.common.p1317a.C28446a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.a */
public class C2786a {

    /* renamed from: a */
    private static AtomicInteger f8895a = new AtomicInteger(0);

    /* renamed from: a */
    public static void m11785a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C2787b.m11791a().mo12091a("DATA_SAVE_TO_DB", new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static void m11789c(byte[] bArr) {
        for (JSONObject jSONObject : m11790d(bArr)) {
            m11786a(jSONObject, "DATA_SEND_FAIL");
            m11786a(jSONObject, "DATA_SEND_END");
        }
    }

    /* renamed from: a */
    public static void m11787a(byte[] bArr) {
        List<JSONObject> d = m11790d(bArr);
        if (d != null) {
            for (JSONObject jSONObject : d) {
                m11786a(jSONObject, "DATA_SEND_BEGIN");
            }
        }
    }

    /* renamed from: b */
    public static void m11788b(byte[] bArr) {
        for (JSONObject jSONObject : m11790d(bArr)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("DATA_DOCTOR");
                if (jSONObject2 != null) {
                    jSONObject2.put("DATA_SEND_RESULT", LocationRequest.PRIORITY_HD_ACCURACY);
                }
            } catch (Exception unused) {
            }
            m11786a(jSONObject, "DATA_SEND_SUCCESS");
            m11786a(jSONObject, "DATA_SEND_END");
        }
    }

    /* renamed from: d */
    private static List<JSONObject> m11790d(byte[] bArr) {
        JSONArray optJSONArray;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("list")) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("list");
                if (optJSONArray2 == null) {
                    return null;
                }
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    if (!(jSONObject2 == null || (optJSONArray = jSONObject2.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null)) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            arrayList.add(optJSONArray.getJSONObject(i2));
                        }
                    }
                }
            } else {
                JSONArray optJSONArray3 = jSONObject.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    arrayList.add(optJSONArray3.getJSONObject(i3));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m11786a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                C2787b.m11791a().mo12091a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m11784a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("DATA_ID", f8895a.incrementAndGet());
            jSONObject2.put("DATA_PROCESS", C28446a.m104270b(C3318a.m13917w()));
            jSONObject2.put("DATA_TYPE", str);
            jSONObject2.put("DATA_SAMPLE", z);
            jSONObject2.put("DATA_SAVE_DB_IMMEDIATE", false);
            jSONObject2.put("DATA_UPLOAD_IMMEDIATE", false);
            jSONObject.put("DATA_DOCTOR", jSONObject2);
            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
            C2787b.m11791a().mo12091a("DATA_RECEIVE", jSONObject3);
            C2787b.m11791a().mo12091a("DATA_CACHE", jSONObject3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

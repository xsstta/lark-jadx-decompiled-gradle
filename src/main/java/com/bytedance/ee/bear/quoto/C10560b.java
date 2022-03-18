package com.bytedance.ee.bear.quoto;

import android.util.Log;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.quoto.b */
public class C10560b {
    /* renamed from: a */
    public static void m43765a(AbstractC5233x xVar, boolean z, boolean z2, boolean z3) {
        if (xVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_owner", String.valueOf(z));
                jSONObject.put("is_default", String.valueOf(z2));
                jSONObject.put("is_folder", String.valueOf(z3));
                xVar.mo21081a("ccm_space_storage_excess_view", jSONObject, "");
            } catch (JSONException e) {
                Log.e("ExceedQuotaAnalytic", "reportExceedQuotaView()...error = " + e);
            }
        }
    }

    /* renamed from: a */
    public static void m43766a(AbstractC5233x xVar, boolean z, boolean z2, boolean z3, String str, String str2) {
        if (xVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_owner", String.valueOf(z));
                jSONObject.put("is_default", String.valueOf(z2));
                jSONObject.put("is_folder", String.valueOf(z3));
                jSONObject.put("click", str);
                jSONObject.put("target", str2);
                xVar.mo21081a("ccm_space_storage_excess_click", jSONObject, "");
            } catch (JSONException e) {
                Log.e("ExceedQuotaAnalytic", "reportExceedQuotaClick()...error = " + e);
            }
        }
    }
}

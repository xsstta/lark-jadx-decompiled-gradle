package com.ss.android.lark.message.card.p2266f;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.message.card.f.a */
public class C45309a {
    /* renamed from: a */
    public static void m179927a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", "message_card");
            jSONObject.put("msg_id", str);
            jSONObject.put("target", "none");
            jSONObject.put("action_type", str2);
        } catch (JSONException e) {
            Log.m165384e("CardStatisticsUtil", "card action click statistics args fail", e);
        }
        Statistics.sendEvent("openplatform_im_message_card_click", jSONObject);
    }
}

package com.ss.android.lark.locationmessage.statistics;

import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

public class LocationHitPoint {

    public @interface Event {
    }

    public @interface NameType {
    }

    public @interface ResultType {
    }

    /* renamed from: a */
    public static void m165166a() {
        Statistics.sendEvent("message_location_search_bar_click");
    }

    /* renamed from: b */
    public static void m165168b() {
        Statistics.sendEvent("message_location__sugg_click");
    }

    /* renamed from: c */
    public static void m165169c() {
        Statistics.sendEvent("lark_message_location_google_poi_no_response");
    }

    /* renamed from: d */
    public static void m165170d() {
        Statistics.sendEvent("feishu_message_location_outside_mainlandchina");
    }

    /* renamed from: a */
    public static void m165167a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name_type", str2);
            jSONObject.put("chat_type", C41597c.m165069a().mo143910c());
            jSONObject.put("result_type", str3);
            Statistics.sendEvent(str, jSONObject);
        } catch (JSONException e) {
            Log.m165378d("sendLocationSendEvent failed to e:" + e);
        }
    }
}

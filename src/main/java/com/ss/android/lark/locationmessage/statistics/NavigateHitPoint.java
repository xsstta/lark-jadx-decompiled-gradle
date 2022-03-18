package com.ss.android.lark.locationmessage.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

public class NavigateHitPoint {

    public @interface Event {
    }

    public @interface MapType {
    }

    /* renamed from: a */
    private static String m165171a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "none" : "waze" : "google" : "tencent" : "baidu" : "gaode";
    }

    /* renamed from: a */
    public static void m165172a() {
        Statistics.sendEvent("message_location_navigation_click");
    }

    /* renamed from: b */
    public static void m165175b() {
        Statistics.sendEvent("message_location_share_click");
    }

    /* renamed from: c */
    public static void m165177c() {
        Statistics.sendEvent("message_location_favorite_click");
    }

    /* renamed from: a */
    public static void m165173a(String str) {
        Statistics.sendEvent(str);
    }

    /* renamed from: b */
    public static void m165176b(String str) {
        Statistics.sendEvent(str);
    }

    /* renamed from: a */
    public static void m165174a(String str, int i) {
        try {
            Statistics.sendEvent(str, new JSONObject().put("navigation_map_type", m165171a(i)));
        } catch (JSONException e) {
            Log.m165378d("sendNavigationClick failed to e:" + e);
        }
    }
}

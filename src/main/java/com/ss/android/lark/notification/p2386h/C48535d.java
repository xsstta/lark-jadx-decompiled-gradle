package com.ss.android.lark.notification.p2386h;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.notification.h.d */
public class C48535d extends BaseHitPoint {

    /* renamed from: com.ss.android.lark.notification.h.d$a */
    private static class C48536a {

        /* renamed from: a */
        public static final C48535d f122129a = new C48535d();
    }

    /* renamed from: a */
    public static C48535d m191354a() {
        return C48536a.f122129a;
    }

    /* renamed from: a */
    public void mo169623a(String str) {
        try {
            Statistics.sendEvent("ev_open_app_chat_feed", new JSONObject().put("anchor", "feed_item").put("app_id", str));
        } catch (JSONException e) {
            Log.m165379d("OpenAppHitPoint", e.getMessage());
            e.printStackTrace();
        }
    }
}

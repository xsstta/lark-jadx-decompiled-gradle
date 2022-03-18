package com.ss.android.lark.platform.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.e */
public class C51987e extends BaseHitPoint {

    /* renamed from: com.ss.android.lark.platform.statistics.e$a */
    private static class C51988a {

        /* renamed from: a */
        public static final C51987e f129088a = new C51987e();
    }

    /* renamed from: a */
    public static C51987e m201660a() {
        return C51988a.f129088a;
    }

    /* renamed from: a */
    public void mo178193a(String str) {
        try {
            Statistics.sendEvent("ev_open_app_chat_feed", new JSONObject().put("anchor", "feed_item").put("app_id", str));
        } catch (JSONException e) {
            Log.m165379d("OpenAppHitPoint", e.getMessage());
            e.printStackTrace();
        }
    }
}

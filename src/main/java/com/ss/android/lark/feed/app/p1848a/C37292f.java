package com.ss.android.lark.feed.app.p1848a;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.feed.app.a.f */
public class C37292f {

    /* renamed from: a */
    private static boolean f95787a = true;

    /* renamed from: a */
    public static boolean m146922a() {
        if (!f95787a) {
            return false;
        }
        String a = C37268c.m146766b().mo139155B().mo139208a();
        C57744a a2 = C57744a.m224104a();
        boolean z = a2.getBoolean("first_sync_feed_" + a, true);
        f95787a = z;
        if (z) {
            C57744a a3 = C57744a.m224104a();
            a3.putBoolean("first_sync_feed_" + a, false);
        }
        return f95787a;
    }

    /* renamed from: a */
    public static void m146921a(final long j, final boolean z) {
        Log.m165389i("FeedSyncHitPoint", "onFeedLoaded feedLoadCost:" + j + ", coldStart:" + z);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.p1848a.C37292f.RunnableC372931 */

            public void run() {
                String str;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timelong", j);
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    jSONObject.put("islaunching", str);
                    Statistics.sendEvent("feed_loading_time_new", jSONObject);
                    if (C37292f.m146922a()) {
                        String a = AppreciableKit.m107394b().mo103508a(Biz.Messenger, Scene.Feed, Event.first_login_feed_load, "MainActivity", true);
                        HashMap hashMap = new HashMap();
                        hashMap.put("sdk_get_feed_cards", Long.valueOf(j));
                        AppreciableKit.m107394b().mo103516a(a, j, hashMap, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
                    }
                } catch (Exception e) {
                    Log.m165390i("FeedSyncHitPoint", "JSONException", e);
                }
            }
        });
    }
}

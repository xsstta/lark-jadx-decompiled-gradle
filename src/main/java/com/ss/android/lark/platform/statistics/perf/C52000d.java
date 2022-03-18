package com.ss.android.lark.platform.statistics.perf;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.batterymonitor.p2481e.C51752a;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57765ac;
import java.util.Observable;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.perf.d */
public class C52000d extends Observable {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.statistics.perf.d$a */
    public static class C52002a {

        /* renamed from: a */
        public static final C52000d f129160a = new C52000d();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.statistics.perf.d$b */
    public static class C52003b {

        /* renamed from: a */
        public static String f129161a = "process_start_record";

        /* renamed from: b */
        public static String f129162b = "process_name";

        /* renamed from: c */
        public static String f129163c = "background";

        /* renamed from: d */
        public static String f129164d = "process_start_time";
    }

    private C52000d() {
    }

    /* renamed from: a */
    public static C52000d m201770a() {
        return C52002a.f129160a;
    }

    /* renamed from: a */
    public void mo178242a(final Context context) {
        final String a = C26252ad.m94992a(context);
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.platform.statistics.perf.C52000d.RunnableC520011 */

            public void run() {
                C52000d.this.mo178243a(a, context);
            }
        }, (long) 5, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private void m201772b(Context context) {
        Log.m165389i("ProcessStartMonitor", "notifyAppLifecycleState called.");
        if (context != null && !C51752a.m200649a(context) && !AppLifecycle.m200904a().mo177975e()) {
            setChanged();
            notifyObservers();
            Log.m165389i("ProcessStartMonitor", "notifyAppLifecycleState called. execute notifyObservers.");
        }
    }

    /* renamed from: a */
    public void mo178243a(String str, Context context) {
        m201772b(context);
        boolean f = AppLifecycle.m200904a().mo177976f();
        int i = 1;
        String format = String.format("%d", Long.valueOf(System.currentTimeMillis()));
        Log.m165389i("ProcessStartMonitor", "processName " + str + " isAppFront " + f);
        if (f) {
            i = 0;
        }
        JSONObject a = m201771a(str, i, format);
        if (C57765ac.m224193g(context)) {
            C51702c.m200484a().mo201588a(C52003b.f129161a, a);
        } else {
            Statistics.sendEvent(C52003b.f129161a, a);
        }
    }

    /* renamed from: a */
    private JSONObject m201771a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C52003b.f129162b, str);
            jSONObject.put(C52003b.f129163c, i);
            jSONObject.put(C52003b.f129164d, str2);
        } catch (Exception e) {
            Log.m165384e("ProcessStartMonitor", "genProcessStartRecordMetricsJson: error occurs: " + e.getMessage(), e);
        }
        return jSONObject;
    }
}

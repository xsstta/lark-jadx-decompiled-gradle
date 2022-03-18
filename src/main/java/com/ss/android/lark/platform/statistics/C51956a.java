package com.ss.android.lark.platform.statistics;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.a */
public class C51956a {

    /* renamed from: a */
    private static String f129011a;

    /* renamed from: b */
    private static long f129012b;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m201512b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("repeat_open_activity_name", str);
            MonitorUtils.monitorEvent("repeat_open_activity_v2", jSONObject, jSONObject, null);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m201509a(String str) {
        if (C37239a.m146648b().mo136951a("repeat.activity.monitor")) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (TextUtils.equals(f129011a, str) && uptimeMillis - f129012b <= 500) {
                Log.m165389i("Navigation", "repeat open:pageName=" + str + ";lastTime=" + f129011a + ";currentTime=" + uptimeMillis);
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str) {
                    /* class com.ss.android.lark.platform.statistics.$$Lambda$a$AcwQtBdtXqzu8t6Swf1KdbjCCGg */
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        C51956a.m201512b(this.f$0);
                    }
                });
            }
            f129011a = str;
            f129012b = uptimeMillis;
        }
    }

    /* renamed from: a */
    public static void m201510a(String str, int i) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, i) {
            /* class com.ss.android.lark.platform.statistics.$$Lambda$a$BJLxuAuK7_1YR56NhliNaUbGEWs */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C51956a.m201513b(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m201513b(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("navigation_open_page_name", str);
            jSONObject.put("navigation_cancel_repeat_count", i);
            MonitorUtils.monitorEvent("navigation_cancel_repeat_open", jSONObject, jSONObject, null);
            Log.m165389i("Navigation", "navigation cancel repeat open:pageName=" + str + ";cancelCount=" + i);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m201511a(String str, String str2, long j) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, str2, j) {
            /* class com.ss.android.lark.platform.statistics.$$Lambda$a$7w0HtnwnzA4J5fPLCjqvfLWwSYI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C51956a.m201514b(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m201514b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("navigation_open_page_name", str);
            jSONObject.put("navigation_source_name", str2);
            jSONObject.put("navigation_open_page_cost", j);
            MonitorUtils.monitorEvent("navigation_open_activity", jSONObject, jSONObject, null);
            Log.m165389i("Navigation", "navigation open:pageName=" + str + ";sourceName=" + str2 + ";cost=" + j);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.m165382e(e.getMessage());
        }
    }
}

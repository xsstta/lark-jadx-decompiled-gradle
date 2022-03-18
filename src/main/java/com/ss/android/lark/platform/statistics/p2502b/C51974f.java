package com.ss.android.lark.platform.statistics.p2502b;

import android.os.SystemClock;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.log.Log;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.b.f */
final class C51974f implements AbstractC29620m {

    /* renamed from: a */
    public volatile long f129053a;

    /* renamed from: b */
    public volatile long f129054b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.statistics.b.f$a */
    public static final class C51976a {

        /* renamed from: a */
        public static final C51974f f129058a = new C51974f();
    }

    /* renamed from: b */
    public static C51974f m201596b() {
        return C51976a.f129058a;
    }

    private C51974f() {
        this.f129053a = -1;
        this.f129054b = -1;
    }

    @Override // com.ss.android.lark.biz.im.api.AbstractC29620m
    /* renamed from: a */
    public void mo106729a() {
        Log.m165389i("LaunchTracer", "onFeedFirstLoaded");
        this.f129054b = SystemClock.uptimeMillis() - C51973e.m201593k();
        m201597c();
    }

    /* renamed from: c */
    private void m201597c() {
        Log.m165389i("LaunchTracer", "reportColdStartEvent mFeedFirstRenderCostMillis:" + this.f129053a + ", mFeedFirstLoadedCostMills:" + this.f129054b);
        if (this.f129053a != -1 && this.f129054b != -1) {
            long max = Math.max(this.f129053a, this.f129054b);
            final long m = C51973e.m201595m();
            final long j = max + m;
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.platform.statistics.p2502b.C51974f.RunnableC519751 */

                public void run() {
                    try {
                        if (m != 0) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timelong", m);
                            C51974f.this.mo178152a("pct_to_cet", jSONObject, new JSONObject());
                        }
                        if (!C51973e.m201591i()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("timelong", j);
                            C51974f.this.mo178152a("feed_cold_start_loading_end", jSONObject2, new JSONObject());
                        }
                        C51974f.this.f129053a = -1;
                        C51974f.this.f129054b = -1;
                    } catch (Exception e) {
                        Log.m165390i("LaunchTracer", "JSONException", e);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo178151a(long j) {
        Log.m165389i("LaunchTracer", "setFeedFirstRenderCost feedFirstRenderCostMillis:" + j);
        this.f129053a = j;
        m201597c();
    }

    /* renamed from: a */
    public void mo178152a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        MonitorUtils.monitorEvent(str, null, jSONObject, jSONObject2);
    }
}

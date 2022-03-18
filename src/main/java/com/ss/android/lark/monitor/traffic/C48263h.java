package com.ss.android.lark.monitor.traffic;

import android.net.TrafficStats;
import android.os.Process;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.AbstractC48230h;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.monitor.traffic.h */
public class C48263h {

    /* renamed from: a */
    private AbstractC48230h f121529a;

    /* renamed from: b */
    private int f121530b = Process.myUid();

    /* renamed from: b */
    public void mo168848b() {
        Log.m165379d("TrafficMetricsVerify", "start get app current traffic statistics ");
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.monitor.traffic.C48263h.RunnableC482641 */

            public void run() {
                C48263h.this.mo168847a();
            }
        });
    }

    /* renamed from: a */
    public void mo168847a() {
        try {
            long uidTxBytes = TrafficStats.getUidTxBytes(this.f121530b);
            long uidRxBytes = TrafficStats.getUidRxBytes(this.f121530b);
            Log.m165379d("TrafficMetricsVerify", "getUidTxBytes = " + uidTxBytes + ", getUidRxBytes = " + uidRxBytes);
            m190434a(uidTxBytes, uidRxBytes);
        } catch (Exception e) {
            Log.m165379d("TrafficMetricsVerify", "getCurrentAppTrafficStats have exceptoin " + e.getMessage());
        }
    }

    public C48263h(AbstractC48230h hVar) {
        this.f121529a = hVar;
    }

    /* renamed from: a */
    private void m190434a(long j, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trafficTxBytes", j);
            jSONObject.put("trafficRxBytes", j2);
            AbstractC48230h hVar = this.f121529a;
            if (hVar != null) {
                hVar.mo168763a("total_traffic_stats", jSONObject);
            }
        } catch (Exception unused) {
            Log.m165383e("TrafficMetricsVerify", "doTrafficHitPointOnSlardar gen json failed!");
        }
    }
}

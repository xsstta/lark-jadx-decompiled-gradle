package com.facebook.battery.p951a.p955d;

import com.facebook.battery.metrics.time.TimeMetrics;
import com.facebook.battery.p951a.p953b.AbstractC20990a;

/* renamed from: com.facebook.battery.a.d.a */
public class C20993a implements AbstractC20990a<TimeMetrics> {
    /* renamed from: a */
    public void mo71087a(TimeMetrics timeMetrics, AbstractC20990a.AbstractC20991a aVar) {
        if (timeMetrics.realtimeMs != 0) {
            aVar.mo71090a("realtime_ms", timeMetrics.realtimeMs);
        }
        if (timeMetrics.uptimeMs != 0) {
            aVar.mo71090a("uptime_ms", timeMetrics.uptimeMs);
        }
    }
}

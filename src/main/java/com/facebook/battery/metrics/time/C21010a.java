package com.facebook.battery.metrics.time;

import android.os.SystemClock;
import com.facebook.battery.metrics.core.AbstractC20997b;
import com.facebook.battery.metrics.core.AbstractC21000d;

/* renamed from: com.facebook.battery.metrics.time.a */
public class C21010a extends AbstractC20997b<TimeMetrics> {
    /* renamed from: a */
    public TimeMetrics mo71110b() {
        return new TimeMetrics();
    }

    /* renamed from: a */
    public boolean mo71109a(TimeMetrics timeMetrics) {
        AbstractC21000d.m76507a(timeMetrics, "Null value passed to getSnapshot!");
        timeMetrics.realtimeMs = SystemClock.elapsedRealtime();
        timeMetrics.uptimeMs = SystemClock.uptimeMillis();
        return true;
    }
}

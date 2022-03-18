package com.facebook.battery.metrics.time;

import com.facebook.battery.metrics.core.SystemMetrics;

public class TimeMetrics extends SystemMetrics<TimeMetrics> {
    public long realtimeMs;
    public long uptimeMs;

    public int hashCode() {
        long j = this.uptimeMs;
        long j2 = this.realtimeMs;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "TimeMetrics{uptimeMs=" + this.uptimeMs + ", realtimeMs=" + this.realtimeMs + '}';
    }

    public TimeMetrics set(TimeMetrics timeMetrics) {
        this.uptimeMs = timeMetrics.uptimeMs;
        this.realtimeMs = timeMetrics.realtimeMs;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeMetrics timeMetrics = (TimeMetrics) obj;
        if (this.uptimeMs == timeMetrics.uptimeMs && this.realtimeMs == timeMetrics.realtimeMs) {
            return true;
        }
        return false;
    }

    public TimeMetrics diff(TimeMetrics timeMetrics, TimeMetrics timeMetrics2) {
        if (timeMetrics2 == null) {
            timeMetrics2 = new TimeMetrics();
        }
        if (timeMetrics == null) {
            timeMetrics2.set(this);
        } else {
            timeMetrics2.uptimeMs = this.uptimeMs - timeMetrics.uptimeMs;
            timeMetrics2.realtimeMs = this.realtimeMs - timeMetrics.realtimeMs;
        }
        return timeMetrics2;
    }

    public TimeMetrics sum(TimeMetrics timeMetrics, TimeMetrics timeMetrics2) {
        if (timeMetrics2 == null) {
            timeMetrics2 = new TimeMetrics();
        }
        if (timeMetrics == null) {
            timeMetrics2.set(this);
        } else {
            timeMetrics2.uptimeMs = this.uptimeMs + timeMetrics.uptimeMs;
            timeMetrics2.realtimeMs = this.realtimeMs + timeMetrics.realtimeMs;
        }
        return timeMetrics2;
    }
}

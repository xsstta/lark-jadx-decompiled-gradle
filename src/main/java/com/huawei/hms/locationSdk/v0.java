package com.huawei.hms.locationSdk;

import android.os.SystemClock;
import com.huawei.hms.support.log.HMSLog;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class v0 {

    /* renamed from: d */
    private static final String f58433d = "v0";

    /* renamed from: e */
    private static final byte[] f58434e = new byte[0];

    /* renamed from: a */
    private volatile AtomicLong f58435a;

    /* renamed from: b */
    private volatile AtomicInteger f58436b;

    /* renamed from: c */
    private volatile AtomicInteger f58437c;

    /* renamed from: com.huawei.hms.locationSdk.v0$b */
    private static class C23673b {

        /* renamed from: a */
        private static final v0 f58438a = new v0();
    }

    private v0() {
        this.f58435a = new AtomicLong(0);
        this.f58436b = new AtomicInteger(0);
        this.f58437c = new AtomicInteger(0);
    }

    /* renamed from: e */
    private boolean m86109e() {
        synchronized (f58434e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f58435a.get() < 500) {
                return false;
            }
            if (this.f58436b.get() == 0) {
                this.f58435a.set(elapsedRealtime);
                this.f58436b.incrementAndGet();
                HMSLog.m86966i(f58433d, "first reconnect");
                return true;
            } else if (elapsedRealtime - this.f58435a.get() > 300000) {
                this.f58436b.set(1);
                this.f58435a.set(elapsedRealtime);
                HMSLog.m86966i(f58433d, "over MAX_INTERVAL_TIME , restart first reconnect");
                return true;
            } else if (this.f58436b.get() >= 3) {
                this.f58435a.set(elapsedRealtime);
                HMSLog.m86966i(f58433d, "can not reconnect , cause count > MAX_RECONNECT_COUNT");
                return false;
            } else {
                HMSLog.m86966i(f58433d, "can reconnect");
                this.f58435a.set(elapsedRealtime);
                this.f58436b.incrementAndGet();
                return true;
            }
        }
    }

    /* renamed from: f */
    public static v0 m86110f() {
        return C23673b.f58438a;
    }

    /* renamed from: a */
    public void mo83536a(int i) {
        synchronized (f58434e) {
            this.f58437c.set(i);
        }
    }

    /* renamed from: a */
    public boolean mo83537a() {
        boolean z;
        synchronized (f58434e) {
            if (this.f58437c.get() != 2) {
                if (this.f58437c.get() != 0) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo83538b() {
        boolean z;
        synchronized (f58434e) {
            z = m86109e() && mo83537a();
        }
        return z;
    }

    /* renamed from: c */
    public synchronized int mo83539c() {
        return this.f58437c.get();
    }

    /* renamed from: d */
    public void mo83540d() {
        synchronized (f58434e) {
            if (this.f58436b.get() == 0 && this.f58435a.get() == 0) {
                HMSLog.m86966i(f58433d, "not need resetCache");
                return;
            }
            HMSLog.m86966i(f58433d, "resetCache");
            this.f58435a.set(0);
            this.f58436b.set(0);
        }
    }
}

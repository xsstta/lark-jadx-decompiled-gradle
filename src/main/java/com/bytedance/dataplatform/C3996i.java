package com.bytedance.dataplatform;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.dataplatform.i */
class C3996i {

    /* renamed from: a */
    static ScheduledExecutorService f12148a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public static Future m16638a(Runnable runnable) {
        return f12148a.submit(runnable);
    }

    /* renamed from: a */
    public static Future m16639a(Runnable runnable, long j, long j2) {
        return f12148a.scheduleWithFixedDelay(runnable, j, j2, TimeUnit.MILLISECONDS);
    }
}

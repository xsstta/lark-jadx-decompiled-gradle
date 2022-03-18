package com.bytedance.android.monitor.exception;

import com.bytedance.android.monitor.p112i.C2655c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/monitor/exception/MonitorRunnable;", "Ljava/lang/Runnable;", "realRunnable", "(Ljava/lang/Runnable;)V", "run", "", "com.bytedance.android.livesdk.monitor.base"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.d.a */
public final class MonitorRunnable implements Runnable {

    /* renamed from: a */
    private final Runnable f8416a;

    public void run() {
        try {
            this.f8416a.run();
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    public MonitorRunnable(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "realRunnable");
        this.f8416a = runnable;
    }
}

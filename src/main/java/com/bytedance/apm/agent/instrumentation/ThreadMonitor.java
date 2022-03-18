package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.util.C3111a;
import com.bytedance.apm.util.C3139v;

public class ThreadMonitor {
    private static boolean isLocalChannel() {
        return C2785b.m11771l();
    }

    private static boolean isDebuggable() {
        return C3111a.m12937c(C2785b.m11735a());
    }

    public static void sleepMonitor(long j) throws InterruptedException {
        if (C3139v.m13080a() && j > 10 && !isDebuggable()) {
            isLocalChannel();
        }
        Thread.sleep(j);
    }
}

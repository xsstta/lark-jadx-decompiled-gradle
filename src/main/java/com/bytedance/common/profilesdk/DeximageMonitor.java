package com.bytedance.common.profilesdk;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class DeximageMonitor {
    private static ExecutorService monitorService = Executors.newFixedThreadPool(1, new ThreadFactory() {
        /* class com.bytedance.common.profilesdk.DeximageMonitor.ThreadFactoryC36231 */

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(runnable));
            new_insert_after_java_lang_Thread_by_knot.setName("deximage_monitor");
            return new_insert_after_java_lang_Thread_by_knot;
        }
    });

    public static synchronized SDKMonitor getSdkMonitor() {
        SDKMonitor instance;
        synchronized (DeximageMonitor.class) {
            instance = SDKMonitorUtils.getInstance("2021");
        }
        return instance;
    }
}

package com.bytedance.apm.launch.p151a;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm.launch.a.d */
public class C3034d {

    /* renamed from: a */
    public static volatile boolean f9763a;

    /* renamed from: b */
    public static EnumC3036a f9764b = EnumC3036a.NONE;

    /* renamed from: c */
    public static long f9765c = -1;

    /* renamed from: d */
    public static long f9766d;

    /* renamed from: e */
    public static String f9767e = "";

    /* renamed from: f */
    private static long f9768f = 8000;

    /* renamed from: g */
    private static ExecutorService f9769g = Executors.newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.apm.launch.p151a.C3034d.ThreadFactoryC30351 */

        /* renamed from: a */
        public static Thread m12716a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m12716a(new Thread(runnable));
            a.setName("launch_sleep_detector");
            return a;
        }
    });

    /* renamed from: com.bytedance.apm.launch.a.d$a */
    private enum EnumC3036a {
        NONE,
        SLEEP,
        NOT_SLEEP,
        DISK_SLEEP
    }

    /* renamed from: a */
    public static void m12715a() {
        if (f9763a) {
            f9763a = false;
            f9764b = EnumC3036a.NONE;
            f9765c = -1;
            f9766d = 0;
            f9767e = "";
        }
    }
}

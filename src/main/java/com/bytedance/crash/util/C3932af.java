package com.bytedance.crash.util;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.bytedance.crash.util.af */
public final class C3932af {
    /* renamed from: a */
    public static Thread m16323a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public static Thread m16322a(Runnable runnable, String str) {
        Thread thread;
        if (runnable == null) {
            return null;
        }
        if (str == null) {
            thread = m16323a(new Thread(runnable));
        } else {
            thread = m16323a(new Thread(runnable, str));
        }
        thread.start();
        return thread;
    }
}

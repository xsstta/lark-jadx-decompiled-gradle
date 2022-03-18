package com.bytedance.memory.p846b;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.memory.b.f */
public class ThreadFactoryC20068f implements ThreadFactory {

    /* renamed from: a */
    private final String f49012a;

    /* renamed from: a */
    public static Thread m73231a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public Thread newThread(Runnable runnable) {
        return m73231a(new Thread(runnable, this.f49012a));
    }

    public ThreadFactoryC20068f(String str) {
        this.f49012a = "MemoryWidget_" + str;
    }
}

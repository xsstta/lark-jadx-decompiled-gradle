package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.concurrent.b */
public class ThreadFactoryC21808b implements ThreadFactory {

    /* renamed from: a */
    private final String f53205a;

    /* renamed from: b */
    private final int f53206b;

    /* renamed from: c */
    private final AtomicInteger f53207c;

    /* renamed from: d */
    private final ThreadFactory f53208d;

    public ThreadFactoryC21808b(String str) {
        this(str, 0);
    }

    private ThreadFactoryC21808b(String str, int i) {
        this.f53207c = new AtomicInteger();
        this.f53208d = Executors.defaultThreadFactory();
        this.f53205a = (String) Preconditions.checkNotNull(str, "Name must not be null");
        this.f53206b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f53208d.newThread(new RunnableC21809c(runnable, 0));
        String str = this.f53205a;
        int andIncrement = this.f53207c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}

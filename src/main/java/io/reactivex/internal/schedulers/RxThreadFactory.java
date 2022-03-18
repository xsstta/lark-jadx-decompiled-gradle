package io.reactivex.internal.schedulers;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.prefix + '-' + incrementAndGet();
        if (this.nonBlocking) {
            thread = new C68927a(runnable, str);
        } else {
            thread = new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, str));
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: io.reactivex.internal.schedulers.RxThreadFactory$a */
    static final class C68927a extends Thread implements AbstractC68947i {
        C68927a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }
}

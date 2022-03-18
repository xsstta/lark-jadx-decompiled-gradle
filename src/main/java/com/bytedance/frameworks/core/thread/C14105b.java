package com.bytedance.frameworks.core.thread;

import com.bytedance.frameworks.core.thread.TTPriority;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.frameworks.core.thread.b */
public class C14105b<V> extends FutureTask<V> implements TTPriority, Comparable<C14105b<V>> {

    /* renamed from: a */
    private TTPriority.Priority f37064a;

    /* renamed from: b */
    private TTPriority.ThreadType f37065b;

    /* renamed from: a */
    public TTPriority.Priority mo51849a() {
        return this.f37064a;
    }

    /* renamed from: b */
    public TTPriority.ThreadType mo51850b() {
        return this.f37065b;
    }

    /* renamed from: a */
    public int compareTo(C14105b bVar) {
        if (mo51849a().getValue() < bVar.mo51849a().getValue()) {
            return 1;
        }
        if (mo51849a().getValue() > bVar.mo51849a().getValue()) {
            return -1;
        }
        return 0;
    }

    public C14105b(Callable<V> callable, TTPriority.Priority priority, TTPriority.ThreadType threadType) {
        super(callable);
        this.f37064a = priority == null ? TTPriority.Priority.NORMAL : priority;
        this.f37065b = threadType;
    }
}

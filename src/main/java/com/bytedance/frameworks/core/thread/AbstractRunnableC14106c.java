package com.bytedance.frameworks.core.thread;

import com.bytedance.frameworks.core.thread.TTPriority;
import java.util.UUID;

/* renamed from: com.bytedance.frameworks.core.thread.c */
public abstract class AbstractRunnableC14106c implements TTPriority, Comparable<AbstractRunnableC14106c>, Runnable {

    /* renamed from: a */
    private TTPriority.Priority f37066a;

    /* renamed from: b */
    private String f37067b;

    /* renamed from: a */
    public TTPriority.Priority mo51853a() {
        return this.f37066a;
    }

    public AbstractRunnableC14106c() {
        this.f37066a = TTPriority.Priority.NORMAL;
        this.f37067b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
    }

    /* renamed from: a */
    public int compareTo(AbstractRunnableC14106c cVar) {
        if (mo51853a().getValue() < cVar.mo51853a().getValue()) {
            return 1;
        }
        if (mo51853a().getValue() > cVar.mo51853a().getValue()) {
            return -1;
        }
        return 0;
    }

    public AbstractRunnableC14106c(TTPriority.Priority priority) {
        this.f37066a = priority == null ? TTPriority.Priority.NORMAL : priority;
        this.f37067b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
    }
}

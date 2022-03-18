package com.bytedance.monitor.util.thread;

import com.bytedance.monitor.util.thread.p855a.AbstractC20187c;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.monitor.util.thread.c */
public interface AbstractC20190c extends AbstractC20187c {

    /* renamed from: com.bytedance.monitor.util.thread.c$a */
    public interface AbstractC20191a {
        /* renamed from: a */
        void mo12829a(Throwable th, String str);
    }

    /* renamed from: a */
    long mo68320a(AsyncTaskType asyncTaskType);

    /* renamed from: a */
    void mo68321a(AbstractC20191a aVar);

    /* renamed from: a */
    void mo68325a(Throwable th, String str);

    /* renamed from: a */
    void mo68326a(ExecutorService executorService);

    /* renamed from: b */
    ExecutorService mo68327b();

    /* renamed from: c */
    AbstractC20193e mo68329c();
}

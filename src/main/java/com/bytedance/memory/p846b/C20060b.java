package com.bytedance.memory.p846b;

import com.bytedance.monitor.util.thread.C20188b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.bytedance.memory.b.b */
public class C20060b {

    /* renamed from: a */
    public static final ScheduledExecutorService f49006a = Executors.newScheduledThreadPool(1, new ThreadFactoryC20068f("CheckToDump"));

    /* renamed from: b */
    public static final AbstractC20062a f49007b = new AbstractC20062a() {
        /* class com.bytedance.memory.p846b.C20060b.C200611 */

        @Override // com.bytedance.memory.p846b.C20060b.AbstractC20062a
        /* renamed from: a */
        public void mo68035a(Runnable runnable, String str) {
            C20188b.m73688a().mo68322a(C20188b.m73693b(str, runnable));
        }
    };

    /* renamed from: com.bytedance.memory.b.b$a */
    public interface AbstractC20062a {
        /* renamed from: a */
        void mo68035a(Runnable runnable, String str);
    }
}

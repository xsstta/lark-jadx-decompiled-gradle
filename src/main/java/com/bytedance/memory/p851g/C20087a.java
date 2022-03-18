package com.bytedance.memory.p851g;

import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.memory.p846b.AbstractC20059a;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p846b.C20066d;
import com.bytedance.monitor.util.thread.AbstractC20190c;
import com.bytedance.monitor.util.thread.AbstractRunnableC20192d;
import com.bytedance.monitor.util.thread.AsyncTaskType;
import com.bytedance.monitor.util.thread.C20188b;

/* renamed from: com.bytedance.memory.g.a */
public class C20087a {

    /* renamed from: f */
    private static volatile C20087a f49043f;

    /* renamed from: a */
    public volatile boolean f49044a;

    /* renamed from: b */
    public AbstractC20059a f49045b;

    /* renamed from: c */
    public MemoryWidgetConfig f49046c;

    /* renamed from: d */
    private volatile boolean f49047d;

    /* renamed from: e */
    private volatile boolean f49048e;

    /* renamed from: g */
    private AbstractC20190c f49049g = C20188b.m73688a();

    /* renamed from: h */
    private AbstractRunnableC20192d f49050h = new AbstractRunnableC20192d() {
        /* class com.bytedance.memory.p851g.C20087a.C200881 */

        @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
        /* renamed from: a */
        public String mo12092a() {
            return "mDumpHeapTask-MC";
        }

        @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
        /* renamed from: b */
        public AsyncTaskType mo12093b() {
            return AsyncTaskType.IO;
        }

        public void run() {
            if (!C20087a.this.mo68066b()) {
                C20087a aVar = C20087a.this;
                if (aVar.mo68065a(aVar.f49046c)) {
                    C20087a.this.f49044a = true;
                    C20087a.this.f49045b.mo68029a();
                    C20063c.m73220a("begin dumpHeap", new Object[0]);
                }
            }
        }
    };

    /* renamed from: d */
    public void mo68068d() {
        C20063c.m73220a("finish dumpHeap", new Object[0]);
        this.f49044a = false;
    }

    private C20087a() {
    }

    /* renamed from: a */
    public static C20087a m73278a() {
        if (f49043f == null) {
            synchronized (C20087a.class) {
                if (f49043f == null) {
                    f49043f = new C20087a();
                }
            }
        }
        return f49043f;
    }

    /* renamed from: c */
    public void mo68067c() {
        C20063c.m73220a("stopCheck", new Object[0]);
        this.f49048e = true;
        AbstractC20190c cVar = this.f49049g;
        if (cVar != null) {
            cVar.mo68328b(this.f49050h);
        }
    }

    /* renamed from: b */
    public boolean mo68066b() {
        boolean b = this.f49045b.mo68030b();
        if (b && this.f49049g != null) {
            C20063c.m73220a("canAnalyse, so cancel check", new Object[0]);
            this.f49049g.mo68328b(this.f49050h);
            this.f49047d = true;
        }
        if (b || this.f49044a || this.f49048e || this.f49045b.mo68031c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo68064a(boolean z) {
        this.f49047d = z;
    }

    /* renamed from: a */
    public boolean mo68065a(MemoryWidgetConfig memoryWidgetConfig) {
        if (C20066d.m73226a() >= ((float) memoryWidgetConfig.getMemoryRate())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo68063a(MemoryWidgetConfig memoryWidgetConfig, AbstractC20059a aVar) {
        int i;
        if (this.f49047d) {
            C20063c.m73220a("startCheck canAnalyse", new Object[0]);
            return;
        }
        this.f49048e = false;
        this.f49046c = memoryWidgetConfig;
        if (this.f49049g != null) {
            C20063c.m73220a("enter startCheck", new Object[0]);
            this.f49045b = aVar;
            if (aVar.mo68032d()) {
                i = 1;
            } else {
                i = 30;
            }
            long j = (long) (i * 1000);
            this.f49049g.mo68324a(this.f49050h, j, j);
        }
    }
}

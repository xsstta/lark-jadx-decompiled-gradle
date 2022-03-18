package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.engine.C2376p;
import com.bumptech.glide.util.C2567j;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.a */
public final class C2271a {

    /* renamed from: a */
    final Map<AbstractC2265c, C2276b> f7608a;

    /* renamed from: b */
    private final boolean f7609b;

    /* renamed from: c */
    private final Executor f7610c;

    /* renamed from: d */
    private final ReferenceQueue<C2376p<?>> f7611d;

    /* renamed from: e */
    private C2376p.AbstractC2377a f7612e;

    /* renamed from: f */
    private volatile boolean f7613f;

    /* renamed from: g */
    private volatile AbstractC2275a f7614g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public interface AbstractC2275a {
        /* renamed from: a */
        void mo10662a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public static final class C2276b extends WeakReference<C2376p<?>> {

        /* renamed from: a */
        final AbstractC2265c f7618a;

        /* renamed from: b */
        final boolean f7619b;

        /* renamed from: c */
        AbstractC2383u<?> f7620c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10663a() {
            this.f7620c = null;
            clear();
        }

        C2276b(AbstractC2265c cVar, C2376p<?> pVar, ReferenceQueue<? super C2376p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            AbstractC2383u<?> uVar;
            this.f7618a = (AbstractC2265c) C2567j.m10894a(cVar);
            if (!pVar.mo10876b() || !z) {
                uVar = null;
            } else {
                uVar = (AbstractC2383u) C2567j.m10894a(pVar.mo10875a());
            }
            this.f7620c = uVar;
            this.f7619b = pVar.mo10876b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10653a() {
        while (!this.f7613f) {
            try {
                mo10656a((C2276b) this.f7611d.remove());
                AbstractC2275a aVar = this.f7614g;
                if (aVar != null) {
                    aVar.mo10662a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    C2271a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() {
            /* class com.bumptech.glide.load.engine.C2271a.ThreadFactoryC22721 */

            /* renamed from: a */
            public static Thread m9725a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(final Runnable runnable) {
                return m9725a(new Thread(new Runnable() {
                    /* class com.bumptech.glide.load.engine.C2271a.ThreadFactoryC22721.RunnableC22731 */

                    public void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources"));
            }
        }));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10657a(C2376p.AbstractC2377a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f7612e = aVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C2376p<?> mo10658b(AbstractC2265c cVar) {
        C2276b bVar = this.f7608a.get(cVar);
        if (bVar == null) {
            return null;
        }
        C2376p<?> pVar = (C2376p) bVar.get();
        if (pVar == null) {
            mo10656a(bVar);
        }
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10654a(AbstractC2265c cVar) {
        C2276b remove = this.f7608a.remove(cVar);
        if (remove != null) {
            remove.mo10663a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10656a(C2276b bVar) {
        synchronized (this) {
            this.f7608a.remove(bVar.f7618a);
            if (bVar.f7619b) {
                if (bVar.f7620c != null) {
                    this.f7612e.mo10839a(bVar.f7618a, new C2376p<>(bVar.f7620c, true, false, bVar.f7618a, this.f7612e));
                }
            }
        }
    }

    C2271a(boolean z, Executor executor) {
        this.f7608a = new HashMap();
        this.f7611d = new ReferenceQueue<>();
        this.f7609b = z;
        this.f7610c = executor;
        executor.execute(new Runnable() {
            /* class com.bumptech.glide.load.engine.C2271a.RunnableC22742 */

            public void run() {
                C2271a.this.mo10653a();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10655a(AbstractC2265c cVar, C2376p<?> pVar) {
        C2276b put = this.f7608a.put(cVar, new C2276b(cVar, pVar, this.f7611d, this.f7609b));
        if (put != null) {
            put.mo10663a();
        }
    }
}

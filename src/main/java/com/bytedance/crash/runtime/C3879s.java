package com.bytedance.crash.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.crash.runtime.s */
public class C3879s {

    /* renamed from: f */
    private static final AbstractC3883b<C3885d, Runnable> f11879f = new AbstractC3883b<C3885d, Runnable>() {
        /* class com.bytedance.crash.runtime.C3879s.C38801 */

        /* renamed from: a */
        public boolean mo15514a(C3885d dVar, Runnable runnable) {
            if (runnable == null) {
                if (dVar == null || dVar.f11890a == null || dVar.f11890a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (dVar == null || dVar.f11890a == null || !runnable.equals(dVar.f11890a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g */
    private static final AbstractC3883b<Message, Runnable> f11880g = new AbstractC3883b<Message, Runnable>() {
        /* class com.bytedance.crash.runtime.C3879s.C38812 */

        /* renamed from: a */
        public boolean mo15514a(Message message, Runnable runnable) {
            if (runnable == null) {
                if (message == null || message.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (message == null || !runnable.equals(message.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: a */
    public final Queue<C3885d> f11881a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Queue<Message> f11882b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile Handler f11883c;

    /* renamed from: d */
    public final Object f11884d = new Object();

    /* renamed from: e */
    private final HandlerThread f11885e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.s$b */
    public interface AbstractC3883b<A, B> {
        /* renamed from: a */
        boolean mo15514a(A a, B b);
    }

    /* renamed from: a */
    public Handler mo15507a() {
        return this.f11883c;
    }

    /* renamed from: c */
    public HandlerThread mo15512c() {
        return this.f11885e;
    }

    /* renamed from: com.bytedance.crash.runtime.s$a */
    class RunnableC3882a implements Runnable {
        public void run() {
            mo15517b();
            mo15516a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15516a() {
            while (!C3879s.this.f11881a.isEmpty()) {
                C3885d poll = C3879s.this.f11881a.poll();
                if (C3879s.this.f11883c != null) {
                    try {
                        C3879s.this.f11883c.sendMessageAtTime(poll.f11890a, poll.f11891b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15517b() {
            while (!C3879s.this.f11882b.isEmpty()) {
                if (C3879s.this.f11883c != null) {
                    try {
                        C3879s.this.f11883c.sendMessageAtFrontOfQueue(C3879s.this.f11882b.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        RunnableC3882a() {
        }
    }

    /* renamed from: b */
    public void mo15510b() {
        this.f11885e.start();
    }

    /* renamed from: com.bytedance.crash.runtime.s$c */
    class HandlerThreadC3884c extends HandlerThread {

        /* renamed from: a */
        volatile int f11887a;

        /* renamed from: b */
        volatile boolean f11888b;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|21|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.bytedance.crash.p218b.C3715k.m15322a(com.bytedance.crash.C3774m.m15609j()).mo15165a().mo15107c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r4.f11887a < 5) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
            com.bytedance.crash.C3691b.m15203a().mo15177a("NPTH_CATCH", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
            if (r4.f11888b == false) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
            r4.f11888b = true;
            com.bytedance.crash.C3691b.m15203a().mo15177a("NPTH_ERR_MAX", new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
            r4.f11887a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[LOOP:0: B:6:0x0020->B:20:0x0020, LOOP_START, SYNTHETIC, Splitter:B:6:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLooperPrepared() {
            /*
                r4 = this;
                super.onLooperPrepared()
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.C3879s.this
                java.lang.Object r0 = r0.f11884d
                monitor-enter(r0)
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.C3879s.this     // Catch:{ all -> 0x005e }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x005e }
                r2.<init>()     // Catch:{ all -> 0x005e }
                r1.f11883c = r2     // Catch:{ all -> 0x005e }
                monitor-exit(r0)     // Catch:{ all -> 0x005e }
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.C3879s.this
                android.os.Handler r0 = r0.f11883c
                com.bytedance.crash.runtime.s$a r1 = new com.bytedance.crash.runtime.s$a
                com.bytedance.crash.runtime.s r2 = com.bytedance.crash.runtime.C3879s.this
                r1.<init>()
                r0.post(r1)
            L_0x0020:
                android.os.Looper.loop()     // Catch:{ all -> 0x0024 }
                goto L_0x0020
            L_0x0024:
                r0 = move-exception
                android.content.Context r1 = com.bytedance.crash.C3774m.m15609j()     // Catch:{ all -> 0x0020 }
                com.bytedance.crash.b.k r1 = com.bytedance.crash.p218b.C3715k.m15322a(r1)     // Catch:{ all -> 0x0020 }
                com.bytedance.crash.b.b r1 = r1.mo15165a()     // Catch:{ all -> 0x0020 }
                r1.mo15107c()     // Catch:{ all -> 0x0020 }
                int r1 = r4.f11887a     // Catch:{ all -> 0x0020 }
                r2 = 5
                r3 = 1
                if (r1 >= r2) goto L_0x0044
                com.bytedance.crash.c r1 = com.bytedance.crash.C3691b.m15203a()     // Catch:{ all -> 0x0020 }
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo15177a(r2, r0)     // Catch:{ all -> 0x0020 }
                goto L_0x0058
            L_0x0044:
                boolean r0 = r4.f11888b     // Catch:{ all -> 0x0020 }
                if (r0 != 0) goto L_0x0058
                r4.f11888b = r3     // Catch:{ all -> 0x0020 }
                com.bytedance.crash.c r0 = com.bytedance.crash.C3691b.m15203a()     // Catch:{ all -> 0x0020 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0020 }
                r2.<init>()     // Catch:{ all -> 0x0020 }
                r0.mo15177a(r1, r2)     // Catch:{ all -> 0x0020 }
            L_0x0058:
                int r0 = r4.f11887a     // Catch:{ all -> 0x0020 }
                int r0 = r0 + r3
                r4.f11887a = r0     // Catch:{ all -> 0x0020 }
                goto L_0x0020
            L_0x005e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.C3879s.HandlerThreadC3884c.onLooperPrepared():void");
        }

        HandlerThreadC3884c(String str) {
            super(str);
        }
    }

    /* renamed from: c */
    private Message m16064c(Runnable runnable) {
        return Message.obtain(this.f11883c, runnable);
    }

    /* renamed from: a */
    public final boolean mo15508a(Runnable runnable) {
        return m16061a(m16064c(runnable), 0);
    }

    public C3879s(String str) {
        this.f11885e = new HandlerThreadC3884c(str);
    }

    /* renamed from: b */
    public final void mo15511b(Runnable runnable) {
        if (!this.f11881a.isEmpty() || !this.f11882b.isEmpty()) {
            m16062a(this.f11881a, runnable, f11879f);
            m16062a(this.f11882b, runnable, f11880g);
        }
        if (this.f11883c != null) {
            this.f11883c.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.s$d */
    public static class C3885d {

        /* renamed from: a */
        Message f11890a;

        /* renamed from: b */
        long f11891b;

        C3885d(Message message, long j) {
            this.f11890a = message;
            this.f11891b = j;
        }
    }

    /* renamed from: a */
    private boolean m16061a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m16063b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m16063b(Message message, long j) {
        if (this.f11883c == null) {
            synchronized (this.f11884d) {
                if (this.f11883c == null) {
                    this.f11881a.add(new C3885d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f11883c.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo15509a(Runnable runnable, long j) {
        return m16061a(m16064c(runnable), j);
    }

    /* renamed from: a */
    private static <L, O> boolean m16062a(Collection<L> collection, O o, AbstractC3883b<? super L, O> bVar) {
        boolean z = false;
        if (!(collection == null || collection.isEmpty() || bVar == null)) {
            try {
                Iterator<L> it = collection.iterator();
                while (it.hasNext()) {
                    if (bVar.mo15514a(it.next(), o)) {
                        it.remove();
                        z = true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }
}

package com.bytedance.framwork.core.sdklib.p753d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.framwork.core.sdklib.util.C14156c;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.framwork.core.sdklib.d.d */
public class C14148d {

    /* renamed from: e */
    static final C14156c.AbstractC14157a<C14153c, Runnable> f37191e = new C14156c.AbstractC14157a<C14153c, Runnable>() {
        /* class com.bytedance.framwork.core.sdklib.p753d.C14148d.C141491 */

        /* renamed from: a */
        public boolean mo51953a(C14153c cVar, Runnable runnable) {
            if (runnable == null) {
                if (cVar == null || cVar.f37200a == null || cVar.f37200a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar == null || cVar.f37200a == null || !runnable.equals(cVar.f37200a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: f */
    static final C14156c.AbstractC14157a<Message, Runnable> f37192f = new C14156c.AbstractC14157a<Message, Runnable>() {
        /* class com.bytedance.framwork.core.sdklib.p753d.C14148d.C141502 */

        /* renamed from: a */
        public boolean mo51953a(Message message, Runnable runnable) {
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
    public final Queue<C14153c> f37193a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Queue<Message> f37194b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile Handler f37195c;

    /* renamed from: d */
    public final Object f37196d = new Object();

    /* renamed from: g */
    private final HandlerThread f37197g;

    /* renamed from: com.bytedance.framwork.core.sdklib.d.d$a */
    class RunnableC14151a implements Runnable {
        public void run() {
            mo51956b();
            mo51955a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo51955a() {
            while (!C14148d.this.f37193a.isEmpty()) {
                C14153c poll = C14148d.this.f37193a.poll();
                if (C14148d.this.f37195c != null) {
                    C14148d.this.f37195c.sendMessageAtTime(poll.f37200a, poll.f37201b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo51956b() {
            while (!C14148d.this.f37194b.isEmpty()) {
                if (C14148d.this.f37195c != null) {
                    C14148d.this.f37195c.sendMessageAtFrontOfQueue(C14148d.this.f37194b.poll());
                }
            }
        }

        RunnableC14151a() {
        }
    }

    /* renamed from: a */
    public void mo51946a() {
        this.f37197g.start();
    }

    /* renamed from: com.bytedance.framwork.core.sdklib.d.d$b */
    class HandlerThreadC14152b extends HandlerThread {
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[LOOP:0: B:6:0x0020->B:7:?, LOOP_START, SYNTHETIC, Splitter:B:6:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLooperPrepared() {
            /*
                r3 = this;
                super.onLooperPrepared()
                com.bytedance.framwork.core.sdklib.d.d r0 = com.bytedance.framwork.core.sdklib.p753d.C14148d.this
                java.lang.Object r0 = r0.f37196d
                monitor-enter(r0)
                com.bytedance.framwork.core.sdklib.d.d r1 = com.bytedance.framwork.core.sdklib.p753d.C14148d.this     // Catch:{ all -> 0x0024 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0024 }
                r2.<init>()     // Catch:{ all -> 0x0024 }
                r1.f37195c = r2     // Catch:{ all -> 0x0024 }
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                com.bytedance.framwork.core.sdklib.d.d r0 = com.bytedance.framwork.core.sdklib.p753d.C14148d.this
                android.os.Handler r0 = r0.f37195c
                com.bytedance.framwork.core.sdklib.d.d$a r1 = new com.bytedance.framwork.core.sdklib.d.d$a
                com.bytedance.framwork.core.sdklib.d.d r2 = com.bytedance.framwork.core.sdklib.p753d.C14148d.this
                r1.<init>()
                r0.post(r1)
            L_0x0020:
                android.os.Looper.loop()     // Catch:{ all -> 0x0020 }
                goto L_0x0020
            L_0x0024:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdklib.p753d.C14148d.HandlerThreadC14152b.onLooperPrepared():void");
        }

        HandlerThreadC14152b(String str) {
            super(str);
        }
    }

    /* renamed from: c */
    private Message m57224c(Runnable runnable) {
        return Message.obtain(this.f37195c, runnable);
    }

    /* renamed from: a */
    public final boolean mo51948a(Runnable runnable) {
        return mo51947a(m57224c(runnable), 0);
    }

    public C14148d(String str) {
        this.f37197g = new HandlerThreadC14152b(str);
    }

    /* renamed from: b */
    public final void mo51950b(Runnable runnable) {
        if (!this.f37193a.isEmpty() || !this.f37194b.isEmpty()) {
            C14156c.m57241a(this.f37193a, runnable, f37191e);
            C14156c.m57241a(this.f37194b, runnable, f37192f);
        }
        if (this.f37195c != null) {
            this.f37195c.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.framwork.core.sdklib.d.d$c */
    public static class C14153c {

        /* renamed from: a */
        Message f37200a;

        /* renamed from: b */
        long f37201b;

        C14153c(Message message, long j) {
            this.f37200a = message;
            this.f37201b = j;
        }
    }

    /* renamed from: a */
    public final boolean mo51947a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return mo51951b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public final boolean mo51949a(Runnable runnable, long j) {
        return mo51947a(m57224c(runnable), j);
    }

    /* renamed from: b */
    public final boolean mo51951b(Message message, long j) {
        if (this.f37195c == null) {
            synchronized (this.f37196d) {
                if (this.f37195c == null) {
                    this.f37193a.add(new C14153c(message, j));
                    return true;
                }
            }
        }
        return this.f37195c.sendMessageAtTime(message, j);
    }
}

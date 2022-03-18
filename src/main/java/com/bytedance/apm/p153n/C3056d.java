package com.bytedance.apm.p153n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.C3013j;
import com.bytedance.apm.util.C3122i;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.apm.n.d */
public class C3056d {

    /* renamed from: e */
    static final C3122i.AbstractC3123a<C3061c, Runnable> f9830e = new C3122i.AbstractC3123a<C3061c, Runnable>() {
        /* class com.bytedance.apm.p153n.C3056d.C30571 */

        /* renamed from: a */
        public boolean mo12907a(C3061c cVar, Runnable runnable) {
            if (runnable == null) {
                if (cVar == null || cVar.f9839a == null || cVar.f9839a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar == null || cVar.f9839a == null || !runnable.equals(cVar.f9839a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: f */
    static final C3122i.AbstractC3123a<Message, Runnable> f9831f = new C3122i.AbstractC3123a<Message, Runnable>() {
        /* class com.bytedance.apm.p153n.C3056d.C30582 */

        /* renamed from: a */
        public boolean mo12907a(Message message, Runnable runnable) {
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
    public final Queue<C3061c> f9832a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Queue<Message> f9833b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile Handler f9834c;

    /* renamed from: d */
    public final Object f9835d = new Object();

    /* renamed from: g */
    private final HandlerThread f9836g;

    /* renamed from: com.bytedance.apm.n.d$a */
    class RunnableC3059a implements Runnable {
        public void run() {
            mo12910b();
            mo12909a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12909a() {
            while (!C3056d.this.f9832a.isEmpty()) {
                synchronized (C3056d.this.f9835d) {
                    C3061c poll = C3056d.this.f9832a.poll();
                    if (C3056d.this.f9834c != null) {
                        C3056d.this.f9834c.sendMessageAtTime(poll.f9839a, poll.f9840b);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12910b() {
            while (!C3056d.this.f9833b.isEmpty()) {
                synchronized (C3056d.this.f9835d) {
                    if (C3056d.this.f9834c != null) {
                        C3056d.this.f9834c.sendMessageAtFrontOfQueue(C3056d.this.f9833b.poll());
                    }
                }
            }
        }

        RunnableC3059a() {
        }
    }

    /* renamed from: a */
    public void mo12899a() {
        this.f9836g.start();
    }

    /* renamed from: b */
    public boolean mo12904b() {
        if (this.f9834c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.apm.n.d$b */
    class HandlerThreadC3060b extends HandlerThread {
        /* access modifiers changed from: protected */
        public void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C3056d.this.f9835d) {
                C3056d.this.f9834c = new Handler();
            }
            C3056d.this.f9834c.post(new RunnableC3059a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    C3013j.m12658a().mo12828b(th, "apm_error");
                }
            }
        }

        HandlerThreadC3060b(String str) {
            super(str);
        }
    }

    /* renamed from: c */
    private Message m12777c(Runnable runnable) {
        return Message.obtain(this.f9834c, runnable);
    }

    /* renamed from: a */
    public final boolean mo12901a(Runnable runnable) {
        return mo12900a(m12777c(runnable), 0);
    }

    public C3056d(String str) {
        this.f9836g = new HandlerThreadC3060b(str);
    }

    /* renamed from: b */
    public final void mo12903b(Runnable runnable) {
        if (!this.f9832a.isEmpty() || !this.f9833b.isEmpty()) {
            C3122i.m13008a(this.f9832a, runnable, f9830e);
            C3122i.m13008a(this.f9833b, runnable, f9831f);
        }
        if (this.f9834c != null) {
            this.f9834c.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.n.d$c */
    public static class C3061c {

        /* renamed from: a */
        Message f9839a;

        /* renamed from: b */
        long f9840b;

        C3061c(Message message, long j) {
            this.f9839a = message;
            this.f9840b = j;
        }
    }

    /* renamed from: a */
    public final boolean mo12900a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return mo12905b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public final boolean mo12902a(Runnable runnable, long j) {
        return mo12900a(m12777c(runnable), j);
    }

    /* renamed from: b */
    public final boolean mo12905b(Message message, long j) {
        if (this.f9834c == null) {
            synchronized (this.f9835d) {
                if (this.f9834c == null) {
                    this.f9832a.add(new C3061c(message, j));
                    return true;
                }
            }
        }
        return this.f9834c.sendMessageAtTime(message, j);
    }
}

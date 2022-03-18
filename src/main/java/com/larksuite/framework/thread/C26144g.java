package com.larksuite.framework.thread;

import android.os.SystemClock;
import com.ss.android.lark.log.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.g */
public class C26144g extends AbstractExecutorService {

    /* renamed from: b */
    private static String f64560b = "CoreSerialThreadPool";

    /* renamed from: c */
    private static AtomicInteger f64561c = new AtomicInteger(0);

    /* renamed from: a */
    public volatile ExecutorService f64562a;

    /* renamed from: d */
    private final AtomicInteger f64563d;

    /* renamed from: e */
    private final int f64564e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f64565f;

    /* renamed from: g */
    private final ReentrantLock f64566g;

    /* renamed from: h */
    private final Condition f64567h;

    /* renamed from: i */
    private volatile Runnable f64568i;

    /* renamed from: j */
    private volatile AtomicInteger f64569j;

    /* renamed from: k */
    private String f64570k;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.thread.g$a */
    public class C26145a extends RunnableC26148j {

        /* renamed from: f */
        private String f64572f;

        /* renamed from: g */
        private long f64573g;

        /* renamed from: a */
        public long mo93070a() {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f64573g = uptimeMillis;
            return uptimeMillis;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
        @Override // com.larksuite.framework.thread.RunnableC26148j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 171
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.thread.C26144g.C26145a.run():void");
        }

        /* renamed from: a */
        private void m94618a(String str) {
            long j = this.f64573g - this.f64582c;
            long j2 = this.f64583d - this.f64573g;
            long j3 = this.f64584e - this.f64583d;
            Log.m165379d("CoreThreadPool CoreSerialThreadPool", this.f64572f + ", " + str + ", serialqueuetime& dispatchtime & runtime is(ms) " + j + ", " + j2 + ", " + j3);
            if (CoreThreadPool.needMonitorTask()) {
                boolean z = false;
                if (C26144g.this.f64562a instanceof C26146h) {
                    boolean z2 = true;
                    if (((C26146h) C26144g.this.f64562a).f64578c < j) {
                        z = true;
                    }
                    if (((C26146h) C26144g.this.f64562a).f64576a < j2) {
                        z = true;
                    }
                    if (((C26146h) C26144g.this.f64562a).f64577b >= j3) {
                        z2 = z;
                    }
                    if (z2) {
                        long j4 = ((C26146h) C26144g.this.f64562a).f64578c;
                        long j5 = ((C26146h) C26144g.this.f64562a).f64576a;
                        long j6 = ((C26146h) C26144g.this.f64562a).f64577b;
                        C26149k.m94631a().mo93081a(C26149k.m94631a().mo93080a(str, this.f64572f, j, j2, j3, j4, j5, j6));
                        Log.m165379d("CoreThreadPool CoreSerialThreadPool", this.f64572f + ", " + str + ", serialqueuetime& dispatchtime & runtime is(ms) " + j + ", " + j2 + ", " + j3 + ", limit is " + j4 + ", " + j5 + ", " + j6);
                    }
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26145a(java.lang.Runnable r2, java.util.concurrent.ExecutorService r3, java.lang.String r4) {
            /*
                r0 = this;
                com.larksuite.framework.thread.C26144g.this = r1
                boolean r1 = r3 instanceof com.larksuite.framework.thread.AbstractC26160p
                if (r1 == 0) goto L_0x0009
                com.larksuite.framework.thread.p r3 = (com.larksuite.framework.thread.AbstractC26160p) r3
                goto L_0x000a
            L_0x0009:
                r3 = 0
            L_0x000a:
                r0.<init>(r2, r3)
                r0.f64572f = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.thread.C26144g.C26145a.<init>(com.larksuite.framework.thread.g, java.lang.Runnable, java.util.concurrent.ExecutorService, java.lang.String):void");
        }
    }

    public C26144g() {
        this(f64560b, 1);
    }

    /* renamed from: c */
    private void m94615c() {
        if (this.f64562a instanceof C26146h) {
            ((C26146h) this.f64562a).mo93073a(false);
        }
    }

    public boolean isShutdown() {
        if (this.f64563d.get() > -1) {
            return true;
        }
        return false;
    }

    public boolean isTerminated() {
        if (this.f64563d.get() == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        List<Runnable> list;
        this.f64566g.lock();
        try {
            int i = this.f64563d.get();
            if (i == -1) {
                this.f64563d.compareAndSet(i, 1);
            } else if (i == 0) {
                this.f64563d.getAndIncrement();
            } else {
                list = Collections.emptyList();
                return list;
            }
            list = mo93064b();
            return list;
        } finally {
            this.f64566g.unlock();
            m94615c();
        }
    }

    /* renamed from: a */
    public void mo93062a() {
        this.f64566g.lock();
        try {
            Runnable poll = this.f64565f.poll();
            this.f64568i = poll;
            if (poll != null) {
                if (this.f64568i instanceof C26145a) {
                    ((C26145a) this.f64568i).mo93070a();
                }
                this.f64562a.execute(this.f64568i);
            } else if (this.f64563d.get() == 0) {
                Log.m165389i("CoreThreadPool CoreSerialThreadPool", "scheduleNext: found Lark Serial ThreadPool shutdown");
                this.f64563d.getAndIncrement();
                this.f64567h.signalAll();
                m94615c();
            }
        } finally {
            this.f64566g.unlock();
        }
    }

    /* renamed from: b */
    public List<Runnable> mo93064b() {
        ArrayList arrayList;
        Exception e;
        this.f64566g.lock();
        Log.m165389i("CoreThreadPool CoreSerialThreadPool", "drainQueue: remove all undo task!");
        try {
            ArrayDeque<Runnable> arrayDeque = this.f64565f;
            arrayList = new ArrayList();
            try {
                if (!arrayDeque.isEmpty()) {
                    Iterator<Runnable> it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        Runnable next = it.next();
                        if (arrayDeque.remove(next)) {
                            arrayList.add(next);
                        }
                    }
                    this.f64567h.signalAll();
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    Log.m165384e("CoreThreadPool CoreSerialThreadPool", "drainQueue: ", e);
                    this.f64566g.unlock();
                    return arrayList;
                } catch (Throwable th) {
                    this.f64566g.unlock();
                    throw th;
                }
            }
        } catch (Exception e3) {
            arrayList = null;
            e = e3;
            Log.m165384e("CoreThreadPool CoreSerialThreadPool", "drainQueue: ", e);
            this.f64566g.unlock();
            return arrayList;
        }
        this.f64566g.unlock();
        return arrayList;
    }

    public void shutdown() {
        this.f64566g.lock();
        try {
            if (this.f64563d.get() == -1) {
                this.f64563d.getAndIncrement();
                if (this.f64565f.size() == 0) {
                    this.f64563d.getAndIncrement();
                }
                this.f64566g.unlock();
                if (this.f64563d.get() == 1) {
                    m94615c();
                }
            }
        } finally {
            this.f64566g.unlock();
            if (this.f64563d.get() == 1) {
                m94615c();
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f64566g.lock();
        try {
            if (this.f64563d.get() != -1) {
                Log.m165397w("CoreThreadPool CoreSerialThreadPool", "execute: found SerialThreadPool already shutdown!");
                return;
            }
            this.f64565f.offer(new C26145a(runnable, this.f64562a, this.f64570k));
            if (this.f64565f.size() > this.f64569j.get()) {
                this.f64569j.set(this.f64565f.size());
            }
            if (this.f64568i == null) {
                mo93062a();
            }
            this.f64566g.unlock();
        } finally {
            this.f64566g.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        this.f64566g.lock();
        while (this.f64563d.get() != 1) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.f64567h.awaitNanos(nanos);
            } finally {
                this.f64566g.unlock();
            }
        }
        this.f64566g.unlock();
        return true;
    }

    public C26144g(String str, int i) {
        this.f64563d = new AtomicInteger(-1);
        this.f64565f = new ArrayDeque<>();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f64566g = reentrantLock;
        this.f64567h = reentrantLock.newCondition();
        this.f64568i = null;
        this.f64562a = null;
        this.f64569j = new AtomicInteger(0);
        this.f64564e = i;
        if (i == 2) {
            this.f64570k = str + "_IO_" + Integer.valueOf(f64561c.incrementAndGet()).toString();
            this.f64562a = CoreThreadPool.getDefault().getCachedThreadPool();
        } else if (i == 1) {
            this.f64570k = str + "_CPU_" + Integer.valueOf(f64561c.incrementAndGet()).toString();
            this.f64562a = CoreThreadPool.getDefault().getFixedThreadPool();
        } else if (i == 0) {
            this.f64570k = str + "_HIGH_" + Integer.valueOf(f64561c.incrementAndGet()).toString();
            this.f64562a = C26146h.m94620c(str);
            ((C26146h) this.f64562a).mo93073a(true);
        } else {
            throw new IllegalArgumentException("Create CoreSerialThreadPool param: serialType illegal!");
        }
    }
}

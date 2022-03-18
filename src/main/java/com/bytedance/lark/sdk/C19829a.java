package com.bytedance.lark.sdk;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.lark.sdk.a */
public class C19829a {

    /* renamed from: a */
    public final Deque<Runnable> f48379a = new ArrayDeque();

    /* renamed from: b */
    private final Deque<Runnable> f48380b = new ArrayDeque();

    /* renamed from: c */
    private int f48381c = 64;

    /* renamed from: d */
    private ExecutorService f48382d;

    /* renamed from: a */
    public synchronized ExecutorService mo67168a() {
        if (this.f48382d == null) {
            this.f48382d = CoreThreadPool.getDefault().getCachedThreadPool();
        }
        return this.f48382d;
    }

    /* renamed from: com.bytedance.lark.sdk.a$a */
    public static class RunnableC19830a implements Runnable {

        /* renamed from: a */
        private Runnable f48383a;

        /* renamed from: b */
        private C19829a f48384b;

        public void run() {
            try {
                this.f48383a.run();
                C19829a aVar = this.f48384b;
                aVar.mo67170a(aVar.f48379a, this);
            } catch (Exception e) {
                C53241h.m205894a("Dispatcher", "error in run: " + e);
                throw e;
            } catch (Throwable th) {
                C19829a aVar2 = this.f48384b;
                aVar2.mo67170a(aVar2.f48379a, this);
                throw th;
            }
        }

        public RunnableC19830a(Runnable runnable, C19829a aVar) {
            this.f48383a = runnable;
            this.f48384b = aVar;
        }
    }

    /* renamed from: b */
    private void m72316b() {
        if (this.f48379a.size() < this.f48381c && !this.f48380b.isEmpty()) {
            Iterator<Runnable> it = this.f48380b.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                it.remove();
                this.f48379a.add(next);
                mo67168a().execute(next);
                if (this.f48379a.size() >= this.f48381c) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo67169a(Runnable runnable, boolean z) {
        if (z) {
            mo67168a().execute(runnable);
        } else {
            RunnableC19830a aVar = new RunnableC19830a(runnable, this);
            if (this.f48379a.size() < this.f48381c) {
                this.f48379a.add(aVar);
                mo67168a().execute(aVar);
            } else {
                this.f48380b.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo67170a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.isEmpty()) {
                C53241h.m205899c("Dispatcher", "finished runningAsyncCalls size = " + this.f48379a.size() + ", readyAsyncCalls size = " + this.f48380b.size());
                if (!deque.remove(t)) {
                    C53241h.m205894a("Dispatcher", "remove call error");
                }
            }
            m72316b();
        }
    }
}

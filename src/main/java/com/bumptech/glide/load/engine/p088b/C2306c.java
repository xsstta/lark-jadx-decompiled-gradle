package com.bumptech.glide.load.engine.p088b;

import com.bumptech.glide.util.C2567j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.b.c */
final class C2306c {

    /* renamed from: a */
    private final Map<String, C2307a> f7666a = new HashMap();

    /* renamed from: b */
    private final C2308b f7667b = new C2308b();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.b.c$a */
    public static class C2307a {

        /* renamed from: a */
        final Lock f7668a = new ReentrantLock();

        /* renamed from: b */
        int f7669b;

        C2307a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.c$b */
    private static class C2308b {

        /* renamed from: a */
        private final Queue<C2307a> f7670a = new ArrayDeque();

        C2308b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2307a mo10728a() {
            C2307a poll;
            synchronized (this.f7670a) {
                poll = this.f7670a.poll();
            }
            if (poll == null) {
                return new C2307a();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10729a(C2307a aVar) {
            synchronized (this.f7670a) {
                if (this.f7670a.size() < 10) {
                    this.f7670a.offer(aVar);
                }
            }
        }
    }

    C2306c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10726a(String str) {
        C2307a aVar;
        synchronized (this) {
            aVar = this.f7666a.get(str);
            if (aVar == null) {
                aVar = this.f7667b.mo10728a();
                this.f7666a.put(str, aVar);
            }
            aVar.f7669b++;
        }
        aVar.f7668a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10727b(String str) {
        C2307a aVar;
        synchronized (this) {
            aVar = (C2307a) C2567j.m10894a(this.f7666a.get(str));
            if (aVar.f7669b >= 1) {
                aVar.f7669b--;
                if (aVar.f7669b == 0) {
                    C2307a remove = this.f7666a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f7667b.mo10729a(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f7669b);
            }
        }
        aVar.f7668a.unlock();
    }
}

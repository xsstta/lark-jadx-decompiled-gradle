package com.google.android.gms.internal.p979b;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.b.m */
public final class C21897m {

    /* renamed from: a */
    private final ConcurrentHashMap<C21900p, List<Throwable>> f53311a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f53312b = new ReferenceQueue<>();

    C21897m() {
    }

    /* renamed from: a */
    public final List<Throwable> mo74007a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f53312b.poll();
        while (poll != null) {
            this.f53311a.remove(poll);
            poll = this.f53312b.poll();
        }
        List<Throwable> list = this.f53311a.get(new C21900p(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f53311a.putIfAbsent(new C21900p(th, this.f53312b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}

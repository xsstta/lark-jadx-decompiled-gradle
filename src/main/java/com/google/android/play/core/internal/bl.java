package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class bl {

    /* renamed from: a */
    private final ConcurrentHashMap<bk, List<Throwable>> f56038a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f56039b = new ReferenceQueue<>();

    bl() {
    }

    /* renamed from: a */
    public final List<Throwable> mo78887a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f56039b.poll();
            if (poll == null) {
                break;
            }
            this.f56038a.remove(poll);
        }
        List<Throwable> list = this.f56038a.get(new bk(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f56038a.putIfAbsent(new bk(th, this.f56039b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}

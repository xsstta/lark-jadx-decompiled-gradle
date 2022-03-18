package com.bumptech.glide.load.engine.p087a;

import com.bumptech.glide.load.engine.p087a.AbstractC2296m;
import com.bumptech.glide.util.C2568k;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.a.d */
public abstract class AbstractC2282d<T extends AbstractC2296m> {

    /* renamed from: a */
    private final Queue<T> f7627a = C2568k.m10909a(20);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo10687b();

    AbstractC2282d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public T mo10689c() {
        T poll = this.f7627a.poll();
        if (poll == null) {
            return mo10687b();
        }
        return poll;
    }

    /* renamed from: a */
    public void mo10688a(T t) {
        if (this.f7627a.size() < 20) {
            this.f7627a.offer(t);
        }
    }
}

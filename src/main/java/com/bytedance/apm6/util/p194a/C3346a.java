package com.bytedance.apm6.util.p194a;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.apm6.util.a.a */
public class C3346a<T> {

    /* renamed from: a */
    private final int f10638a;

    /* renamed from: b */
    private ConcurrentLinkedQueue<T> f10639b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private AbstractC3347a<T> f10640c;

    /* renamed from: com.bytedance.apm6.util.a.a$a */
    public interface AbstractC3347a<T> {
        /* renamed from: a */
        void mo13094a(T t);
    }

    /* renamed from: a */
    public T mo13574a() {
        return this.f10639b.poll();
    }

    /* renamed from: b */
    public boolean mo13577b() {
        return this.f10639b.isEmpty();
    }

    /* renamed from: a */
    public void mo13575a(AbstractC3347a<T> aVar) {
        this.f10640c = aVar;
    }

    public C3346a(int i) {
        this.f10638a = i;
    }

    /* renamed from: a */
    public void mo13576a(T t) {
        this.f10639b.add(t);
        if (this.f10639b.size() > this.f10638a) {
            T poll = this.f10639b.poll();
            AbstractC3347a<T> aVar = this.f10640c;
            if (aVar != null) {
                aVar.mo13094a(poll);
            }
        }
    }
}

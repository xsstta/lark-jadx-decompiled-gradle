package com.bytedance.memory.shrink;

/* renamed from: com.bytedance.memory.shrink.b */
public final class C20099b {

    /* renamed from: a */
    public final int f49072a;

    /* renamed from: b */
    public final C20101d f49073b;

    /* renamed from: c */
    public final Object f49074c;

    public int hashCode() {
        return (this.f49073b.hashCode() << 31) + this.f49072a;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20099b)) {
            return false;
        }
        C20099b bVar = (C20099b) obj;
        if (this.f49072a != bVar.f49072a || !this.f49073b.equals(bVar.f49073b)) {
            return false;
        }
        Object obj3 = this.f49074c;
        if ((obj3 == null || obj3.equals(bVar.f49074c)) && ((obj2 = bVar.f49074c) == null || obj2.equals(this.f49074c))) {
            return true;
        }
        return false;
    }

    public C20099b(int i, C20101d dVar, Object obj) {
        this.f49072a = i;
        this.f49073b = dVar;
        this.f49074c = obj;
    }
}

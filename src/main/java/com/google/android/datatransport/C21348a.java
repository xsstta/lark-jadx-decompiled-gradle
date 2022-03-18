package com.google.android.datatransport;

import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.a */
public final class C21348a<T> extends AbstractC21350c<T> {

    /* renamed from: a */
    private final Integer f51899a;

    /* renamed from: b */
    private final T f51900b;

    /* renamed from: c */
    private final Priority f51901c;

    @Override // com.google.android.datatransport.AbstractC21350c
    /* renamed from: a */
    public Integer mo72493a() {
        return this.f51899a;
    }

    @Override // com.google.android.datatransport.AbstractC21350c
    /* renamed from: b */
    public T mo72494b() {
        return this.f51900b;
    }

    @Override // com.google.android.datatransport.AbstractC21350c
    /* renamed from: c */
    public Priority mo72495c() {
        return this.f51901c;
    }

    public int hashCode() {
        int i;
        Integer num = this.f51899a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f51900b.hashCode()) * 1000003) ^ this.f51901c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f51899a + ", payload=" + ((Object) this.f51900b) + ", priority=" + this.f51901c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21350c)) {
            return false;
        }
        AbstractC21350c cVar = (AbstractC21350c) obj;
        Integer num = this.f51899a;
        if (num != null ? num.equals(cVar.mo72493a()) : cVar.mo72493a() == null) {
            if (!this.f51900b.equals(cVar.mo72494b()) || !this.f51901c.equals(cVar.mo72495c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    C21348a(Integer num, T t, Priority priority) {
        this.f51899a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f51900b = t;
        Objects.requireNonNull(priority, "Null priority");
        this.f51901c = priority;
    }
}

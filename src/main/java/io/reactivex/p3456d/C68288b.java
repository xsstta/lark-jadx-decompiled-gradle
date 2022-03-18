package io.reactivex.p3456d;

import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.d.b */
public final class C68288b<T> {

    /* renamed from: a */
    final T f171589a;

    /* renamed from: b */
    final long f171590b;

    /* renamed from: c */
    final TimeUnit f171591c;

    /* renamed from: a */
    public T mo237930a() {
        return this.f171589a;
    }

    /* renamed from: b */
    public long mo237931b() {
        return this.f171590b;
    }

    public int hashCode() {
        int i;
        T t = this.f171589a;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        long j = this.f171590b;
        return (((i * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f171591c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f171590b + ", unit=" + this.f171591c + ", value=" + ((Object) this.f171589a) + "]";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C68288b)) {
            return false;
        }
        C68288b bVar = (C68288b) obj;
        if (!C68362b.m265230a((Object) this.f171589a, (Object) bVar.f171589a) || this.f171590b != bVar.f171590b || !C68362b.m265230a(this.f171591c, bVar.f171591c)) {
            return false;
        }
        return true;
    }

    public C68288b(T t, long j, TimeUnit timeUnit) {
        this.f171589a = t;
        this.f171590b = j;
        this.f171591c = (TimeUnit) C68362b.m265229a((Object) timeUnit, "unit is null");
    }
}

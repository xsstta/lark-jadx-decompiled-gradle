package io.reactivex;

import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.m */
public final class C68991m<T> {

    /* renamed from: b */
    static final C68991m<Object> f172990b = new C68991m<>(null);

    /* renamed from: a */
    final Object f172991a;

    /* renamed from: f */
    public static <T> C68991m<T> m265593f() {
        return (C68991m<T>) f172990b;
    }

    /* renamed from: a */
    public boolean mo238774a() {
        if (this.f172991a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo238775b() {
        return NotificationLite.isError(this.f172991a);
    }

    /* renamed from: c */
    public boolean mo238776c() {
        Object obj = this.f172991a;
        if (obj == null || NotificationLite.isError(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public T mo238777d() {
        Object obj = this.f172991a;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.f172991a;
    }

    /* renamed from: e */
    public Throwable mo238778e() {
        Object obj = this.f172991a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f172991a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f172991a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f172991a + "]";
    }

    private C68991m(Object obj) {
        this.f172991a = obj;
    }

    /* renamed from: a */
    public static <T> C68991m<T> m265591a(T t) {
        C68362b.m265229a((Object) t, "value is null");
        return new C68991m<>(t);
    }

    /* renamed from: a */
    public static <T> C68991m<T> m265592a(Throwable th) {
        C68362b.m265229a((Object) th, "error is null");
        return new C68991m<>(NotificationLite.error(th));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C68991m) {
            return C68362b.m265230a(this.f172991a, ((C68991m) obj).f172991a);
        }
        return false;
    }
}

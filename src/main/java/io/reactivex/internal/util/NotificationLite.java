package io.reactivex.internal.util;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3459a.C68362b;
import java.io.Serializable;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public enum NotificationLite {
    COMPLETE;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object complete() {
        return COMPLETE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.util.NotificationLite$b */
    public static final class C68973b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        final Throwable f172978e;

        public int hashCode() {
            return this.f172978e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f172978e + "]";
        }

        C68973b(Throwable th) {
            this.f172978e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C68973b) {
                return C68362b.m265230a(this.f172978e, ((C68973b) obj).f172978e);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.util.NotificationLite$a */
    public static final class C68972a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final Disposable upstream;

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }

        C68972a(Disposable disposable) {
            this.upstream = disposable;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.util.NotificationLite$c */
    public static final class C68974c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final AbstractC70022d upstream;

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }

        C68974c(AbstractC70022d dVar) {
            this.upstream = dVar;
        }
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C68972a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C68973b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C68974c;
    }

    public static Object disposable(Disposable disposable) {
        return new C68972a(disposable);
    }

    public static Object error(Throwable th) {
        return new C68973b(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((C68972a) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((C68973b) obj).f172978e;
    }

    public static AbstractC70022d getSubscription(Object obj) {
        return ((C68974c) obj).upstream;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static Object subscription(AbstractC70022d dVar) {
        return new C68974c(dVar);
    }

    public static <T> boolean accept(Object obj, AbstractC69009q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.onComplete();
            return true;
        } else if (obj instanceof C68973b) {
            qVar.onError(((C68973b) obj).f172978e);
            return true;
        } else {
            qVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, AbstractC70021c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C68973b) {
            cVar.onError(((C68973b) obj).f172978e);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, AbstractC69009q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.onComplete();
            return true;
        } else if (obj instanceof C68973b) {
            qVar.onError(((C68973b) obj).f172978e);
            return true;
        } else if (obj instanceof C68972a) {
            qVar.onSubscribe(((C68972a) obj).upstream);
            return false;
        } else {
            qVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, AbstractC70021c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C68973b) {
            cVar.onError(((C68973b) obj).f172978e);
            return true;
        } else if (obj instanceof C68974c) {
            cVar.onSubscribe(((C68974c) obj).upstream);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }
}

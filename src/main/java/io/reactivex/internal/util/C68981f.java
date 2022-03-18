package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.util.f */
public final class C68981f {

    /* renamed from: a */
    public static final Throwable f172984a = new C68982a();

    /* renamed from: io.reactivex.internal.util.f$a */
    static final class C68982a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Throwable fillInStackTrace() {
            return this;
        }

        C68982a() {
            super("No further exceptions");
        }
    }

    /* renamed from: b */
    public static <E extends Throwable> Exception m265561b(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: a */
    public static RuntimeException m265557a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> Throwable m265559a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f172984a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    /* renamed from: a */
    public static String m265558a(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: a */
    public static <T> boolean m265560a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f172984a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }
}

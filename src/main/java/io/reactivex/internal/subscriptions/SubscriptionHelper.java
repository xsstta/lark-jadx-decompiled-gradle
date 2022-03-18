package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68977b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3511d.AbstractC70022d;

public enum SubscriptionHelper implements AbstractC70022d {
    CANCELLED;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean cancel(AtomicReference<AbstractC70022d> atomicReference) {
        AbstractC70022d andSet;
        AbstractC70022d dVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (dVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void reportMoreProduced(long j) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean replace(AtomicReference<AbstractC70022d> atomicReference, AbstractC70022d dVar) {
        AbstractC70022d dVar2;
        do {
            dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        return true;
    }

    public static boolean set(AtomicReference<AbstractC70022d> atomicReference, AbstractC70022d dVar) {
        AbstractC70022d dVar2;
        do {
            dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        if (dVar2 == null) {
            return true;
        }
        dVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<AbstractC70022d> atomicReference, AbstractC70022d dVar) {
        C68362b.m265229a((Object) dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(AbstractC70022d dVar, AbstractC70022d dVar2) {
        if (dVar2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static boolean setOnce(AtomicReference<AbstractC70022d> atomicReference, AbstractC70022d dVar, long j) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j);
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<AbstractC70022d> atomicReference, AtomicLong atomicLong, AbstractC70022d dVar) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        dVar.request(andSet);
        return true;
    }

    public static void deferredRequest(AtomicReference<AbstractC70022d> atomicReference, AtomicLong atomicLong, long j) {
        AbstractC70022d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
        } else if (validate(j)) {
            C68977b.m265548a(atomicLong, j);
            AbstractC70022d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }
}

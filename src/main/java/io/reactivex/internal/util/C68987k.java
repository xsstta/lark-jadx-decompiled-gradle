package io.reactivex.internal.util;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.queue.SpscArrayQueue;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.util.k */
public final class C68987k {
    /* renamed from: a */
    public static <T> AbstractC68373j<T> m265581a(int i) {
        if (i < 0) {
            return new C68926b(-i);
        }
        return new SpscArrayQueue(i);
    }

    /* renamed from: a */
    public static void m265583a(AbstractC70022d dVar, int i) {
        long j;
        if (i < 0) {
            j = Long.MAX_VALUE;
        } else {
            j = (long) i;
        }
        dVar.request(j);
    }

    /* renamed from: a */
    public static <T, U> void m265582a(AbstractC68372i<T> iVar, AbstractC69009q<? super U> qVar, boolean z, Disposable disposable, AbstractC68984h<T, U> hVar) {
        boolean z2;
        int i = 1;
        while (!m265584a(hVar.mo238130b(), iVar.isEmpty(), qVar, z, iVar, disposable, hVar)) {
            while (true) {
                boolean b = hVar.mo238130b();
                T poll = iVar.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!m265584a(b, z2, qVar, z, iVar, disposable, hVar)) {
                    if (z2) {
                        i = hVar.mo238125a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        hVar.mo238126a(qVar, poll);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, U> boolean m265584a(boolean z, boolean z2, AbstractC69009q<?> qVar, boolean z3, AbstractC68373j<?> jVar, Disposable disposable, AbstractC68984h<T, U> hVar) {
        if (hVar.mo238128a()) {
            jVar.clear();
            disposable.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable e = hVar.mo238133e();
                if (e != null) {
                    jVar.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    qVar.onError(e);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    qVar.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                if (disposable != null) {
                    disposable.dispose();
                }
                Throwable e2 = hVar.mo238133e();
                if (e2 != null) {
                    qVar.onError(e2);
                } else {
                    qVar.onComplete();
                }
                return true;
            }
        }
    }
}

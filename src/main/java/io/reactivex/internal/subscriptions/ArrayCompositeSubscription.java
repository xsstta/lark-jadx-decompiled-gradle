package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.p3511d.AbstractC70022d;

public final class ArrayCompositeSubscription extends AtomicReferenceArray<AbstractC70022d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get(0) == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        AbstractC70022d dVar;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (!(((AbstractC70022d) get(i)) == SubscriptionHelper.CANCELLED || (dVar = (AbstractC70022d) getAndSet(i, SubscriptionHelper.CANCELLED)) == SubscriptionHelper.CANCELLED || dVar == null)) {
                    dVar.cancel();
                }
            }
        }
    }

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    public AbstractC70022d replaceResource(int i, AbstractC70022d dVar) {
        AbstractC70022d dVar2;
        do {
            dVar2 = (AbstractC70022d) get(i);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar == null) {
                    return null;
                }
                dVar.cancel();
                return null;
            }
        } while (!compareAndSet(i, dVar2, dVar));
        return dVar2;
    }

    public boolean setResource(int i, AbstractC70022d dVar) {
        AbstractC70022d dVar2;
        do {
            dVar2 = (AbstractC70022d) get(i);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!compareAndSet(i, dVar2, dVar));
        if (dVar2 == null) {
            return true;
        }
        dVar2.cancel();
        return true;
    }
}

package com.ttnet.org.chromium.base;

import android.os.Handler;
import java.util.Iterator;

public class ObservableSupplierImpl<E> implements ObservableSupplier<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Handler mHandler = new Handler();
    private E mObject;
    private final ObserverList<Callback<E>> mObservers = new ObserverList<>();
    private final Thread mThread = Thread.currentThread();

    private void checkThread() {
    }

    @Override // com.ttnet.org.chromium.base.Supplier
    public E get() {
        checkThread();
        return this.mObject;
    }

    @Override // com.ttnet.org.chromium.base.ObservableSupplier
    public void removeObserver(Callback<E> callback) {
        checkThread();
        this.mObservers.removeObserver(callback);
    }

    @Override // com.ttnet.org.chromium.base.ObservableSupplier
    public E addObserver(Callback<E> callback) {
        checkThread();
        this.mObservers.addObserver(callback);
        E e = this.mObject;
        if (e != null) {
            this.mHandler.post(new Runnable(e, callback) {
                /* class com.ttnet.org.chromium.base.$$Lambda$ObservableSupplierImpl$Go4WgWiMnHDMsTOcS8DuqLy8g */
                public final /* synthetic */ Object f$1;
                public final /* synthetic */ Callback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    ObservableSupplierImpl.this.lambda$addObserver$0$ObservableSupplierImpl(this.f$1, this.f$2);
                }
            });
        }
        return this.mObject;
    }

    public void set(E e) {
        checkThread();
        if (e != this.mObject) {
            this.mObject = e;
            Iterator<Callback<E>> it = this.mObservers.iterator();
            while (it.hasNext()) {
                it.next().onResult(this.mObject);
            }
        }
    }

    public /* synthetic */ void lambda$addObserver$0$ObservableSupplierImpl(Object obj, Callback callback) {
        if (this.mObject == obj && this.mObservers.hasObserver(callback)) {
            callback.onResult(this.mObject);
        }
    }
}

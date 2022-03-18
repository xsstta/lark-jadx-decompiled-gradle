package com.ttnet.org.chromium.base;

import android.os.Handler;
import com.ttnet.org.chromium.base.Promise;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Promise<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final List<Callback<T>> mFulfillCallbacks = new LinkedList();
    private final Handler mHandler = new Handler();
    private final List<Callback<Exception>> mRejectCallbacks = new LinkedList();
    private Exception mRejectReason;
    private T mResult;
    private int mState;
    private final Thread mThread = Thread.currentThread();
    private boolean mThrowingRejectionHandler;

    public interface AsyncFunction<A, R> {
        Promise<R> apply(A a);
    }

    public interface Function<A, R> {
        R apply(A a);
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface PromiseState {
    }

    private void checkThread() {
    }

    public T getResult() {
        return this.mResult;
    }

    public void reject() {
        reject(null);
    }

    public boolean isFulfilled() {
        checkThread();
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    public boolean isRejected() {
        checkThread();
        if (this.mState == 2) {
            return true;
        }
        return false;
    }

    static /* synthetic */ void lambda$then$0(Exception exc) {
        throw new UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
    }

    public void except(Callback<Exception> callback) {
        checkThread();
        exceptInner(callback);
    }

    public static <T> Promise<T> fulfilled(T t) {
        Promise<T> promise = new Promise<>();
        promise.fulfill(t);
        return promise;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ttnet.org.chromium.base.Callback<java.lang.Exception> */
    /* JADX WARN: Multi-variable type inference failed */
    private void exceptInner(Callback<Exception> callback) {
        int i = this.mState;
        if (i == 2) {
            postCallbackToLooper(callback, this.mRejectReason);
        } else if (i == 0) {
            this.mRejectCallbacks.add(callback);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ttnet.org.chromium.base.Callback<T> */
    /* JADX WARN: Multi-variable type inference failed */
    private void thenInner(Callback<T> callback) {
        int i = this.mState;
        if (i == 1) {
            postCallbackToLooper(callback, this.mResult);
        } else if (i == 0) {
            this.mFulfillCallbacks.add(callback);
        }
    }

    public <R> Promise<R> then(AsyncFunction<T, R> asyncFunction) {
        checkThread();
        Promise<R> promise = new Promise<>();
        thenInner(new Callback(promise) {
            /* class com.ttnet.org.chromium.base.$$Lambda$Promise$nfdCgZP_WT4HpOavcmXZLpvo3M */
            public final /* synthetic */ Promise f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ttnet.org.chromium.base.Callback
            public final void onResult(Object obj) {
                Promise.lambda$then$2(Promise.AsyncFunction.this, this.f$1, obj);
            }
        });
        exceptInner(new Callback() {
            /* class com.ttnet.org.chromium.base.$$Lambda$EZnZNrcCA72vS8z3mA_yvnO1EPY */

            @Override // com.ttnet.org.chromium.base.Callback
            public final void onResult(Object obj) {
                Promise.this.reject((Exception) obj);
            }
        });
        return promise;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: com.ttnet.org.chromium.base.Callback<T>, com.ttnet.org.chromium.base.Callback<S> */
    public void fulfill(T t) {
        checkThread();
        this.mState = 1;
        this.mResult = t;
        Iterator<Callback<T>> it = this.mFulfillCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper((Callback<T>) it.next(), t);
        }
        this.mFulfillCallbacks.clear();
    }

    public void reject(Exception exc) {
        checkThread();
        this.mState = 2;
        this.mRejectReason = exc;
        Iterator<Callback<Exception>> it = this.mRejectCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper((Callback<S>) it.next(), exc);
        }
        this.mRejectCallbacks.clear();
    }

    public <R> Promise<R> then(Function<T, R> function) {
        checkThread();
        Promise<R> promise = new Promise<>();
        thenInner(new Callback(function) {
            /* class com.ttnet.org.chromium.base.$$Lambda$Promise$FWyV1sz6dMKx_bcBttPKFOn6SZM */
            public final /* synthetic */ Promise.Function f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ttnet.org.chromium.base.Callback
            public final void onResult(Object obj) {
                Promise.lambda$then$1(Promise.this, this.f$1, obj);
            }
        });
        exceptInner(new Callback() {
            /* class com.ttnet.org.chromium.base.$$Lambda$EZnZNrcCA72vS8z3mA_yvnO1EPY */

            @Override // com.ttnet.org.chromium.base.Callback
            public final void onResult(Object obj) {
                Promise.this.reject((Exception) obj);
            }
        });
        return promise;
    }

    public void then(Callback<T> callback) {
        checkThread();
        if (this.mThrowingRejectionHandler) {
            thenInner(callback);
            return;
        }
        then(callback, $$Lambda$Promise$xPAeeNuwimVFIzNGIpt4RjZw4uc.INSTANCE);
        this.mThrowingRejectionHandler = true;
    }

    public static class UnhandledRejectionException extends RuntimeException {
        public UnhandledRejectionException(String str, Throwable th) {
            super(str, th);
        }
    }

    private <S> void postCallbackToLooper(Callback<S> callback, S s) {
        this.mHandler.post(new Runnable(s) {
            /* class com.ttnet.org.chromium.base.$$Lambda$Promise$caLrYWlweu5vwgO_NQJv1qbB5uU */
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                Callback.this.onResult(this.f$1);
            }
        });
    }

    public void then(Callback<T> callback, Callback<Exception> callback2) {
        checkThread();
        thenInner(callback);
        exceptInner(callback2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ttnet.org.chromium.base.Promise */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$then$1(Promise promise, Function function, Object obj) {
        try {
            promise.fulfill(function.apply(obj));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    static /* synthetic */ void lambda$then$2(AsyncFunction asyncFunction, Promise promise, Object obj) {
        try {
            Promise apply = asyncFunction.apply(obj);
            Objects.requireNonNull(promise);
            $$Lambda$9Upca4gyXIiOJEcVqy3DvlA5Mhk r3 = new Callback() {
                /* class com.ttnet.org.chromium.base.$$Lambda$9Upca4gyXIiOJEcVqy3DvlA5Mhk */

                @Override // com.ttnet.org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Promise.this.fulfill(obj);
                }
            };
            Objects.requireNonNull(promise);
            apply.then(r3, new Callback() {
                /* class com.ttnet.org.chromium.base.$$Lambda$EZnZNrcCA72vS8z3mA_yvnO1EPY */

                @Override // com.ttnet.org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Promise.this.reject((Exception) obj);
                }
            });
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}

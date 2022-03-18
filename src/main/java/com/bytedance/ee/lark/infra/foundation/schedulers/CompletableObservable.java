package com.bytedance.ee.lark.infra.foundation.schedulers;

import java.util.Objects;

public class CompletableObservable<T> extends Observable implements Excutor {
    private Action innerAction;
    private Function<T> innerFunction;
    private CompletableFutureTask<T> task;

    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Observable
    public boolean isUnSubscribe() {
        CompletableFutureTask<T> completableFutureTask = this.task;
        if (completableFutureTask == null) {
            return false;
        }
        return completableFutureTask.isUnSubscribe();
    }

    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Observable
    public boolean unSubscribe() {
        CompletableFutureTask<T> completableFutureTask = this.task;
        if (completableFutureTask == null) {
            return false;
        }
        return completableFutureTask.cancel();
    }

    CompletableObservable(Action action) {
        this.innerAction = action;
    }

    CompletableObservable(Function<T> function) {
        this.innerFunction = function;
    }

    public static CompletableObservable newInstance(Action action) {
        Objects.requireNonNull(action, "action is null");
        return new CompletableObservable(action);
    }

    public static <M> CompletableObservable newInstance(Function<M> function) {
        Objects.requireNonNull(function, "function is null");
        return new CompletableObservable(function);
    }

    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Observable
    public synchronized void subscribe(final Subscriber subscriber) {
        if (this.task == null) {
            Action action = this.innerAction;
            if (action != null) {
                this.task = new SpanWrappedTask<T>(new CompletableCallable(action)) {
                    /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableObservable.C127741 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.CompletableFutureTask
                    public void onError(final Throwable th) {
                        if (CompletableObservable.this.mObsverSchduler == null) {
                            Subscriber subscriber = subscriber;
                            if (subscriber != null) {
                                subscriber.onError(th);
                                return;
                            }
                            return;
                        }
                        CompletableObservable.this.mObsverSchduler.execute(new Runnable() {
                            /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableObservable.C127741.RunnableC127762 */

                            public void run() {
                                if (subscriber != null) {
                                    subscriber.onError(th);
                                }
                            }
                        });
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.CompletableFutureTask
                    public void onResult(T t) {
                        if (CompletableObservable.this.mObsverSchduler == null) {
                            Subscriber subscriber = subscriber;
                            if (subscriber != null) {
                                subscriber.onSuccess();
                                return;
                            }
                            return;
                        }
                        CompletableObservable.this.mObsverSchduler.execute(new Runnable() {
                            /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableObservable.C127741.RunnableC127751 */

                            public void run() {
                                if (subscriber != null) {
                                    subscriber.onSuccess();
                                }
                            }
                        });
                    }
                };
            }
            Function<T> function = this.innerFunction;
            if (function != null) {
                this.task = new SpanWrappedTask<T>(new CompletableCallable(function)) {
                    /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableObservable.C127772 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.CompletableFutureTask
                    public void onError(final Throwable th) {
                        if (CompletableObservable.this.mObsverSchduler == null) {
                            Subscriber subscriber = subscriber;
                            if (subscriber != null) {
                                subscriber.onError(th);
                                return;
                            }
                            return;
                        }
                        CompletableObservable.this.mObsverSchduler.execute(new Runnable() {
                            /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableObservable.C127772.RunnableC127792 */

                            public void run() {
                                if (subscriber != null) {
                                    subscriber.onError(th);
                                }
                            }
                        });
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.CompletableFutureTask
                    public void onResult(final T t) {
                        if (CompletableObservable.this.mObsverSchduler == null) {
                            Subscriber subscriber = subscriber;
                            if (subscriber != null) {
                                subscriber.onSuccess(t);
                                return;
                            }
                            return;
                        }
                        CompletableObservable.this.mObsverSchduler.execute(new Runnable() {
                            /* class com.bytedance.ee.lark.infra.foundation.schedulers.CompletableObservable.C127772.RunnableC127781 */

                            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber */
                            /* JADX WARN: Multi-variable type inference failed */
                            public void run() {
                                if (subscriber != null) {
                                    subscriber.onSuccess(t);
                                }
                            }
                        });
                    }
                };
            }
            if (this.mSubScheduler == null) {
                this.task.run();
            } else {
                this.mSubScheduler.execute(this.task);
            }
        } else {
            throw new IllegalStateException("Observable has subscribed");
        }
    }
}

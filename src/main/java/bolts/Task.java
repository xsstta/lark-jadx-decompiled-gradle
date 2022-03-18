package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR = C1663b.m7399a();
    private static final Executor IMMEDIATE_EXECUTOR = C1663b.m7401c();
    private static Task<?> TASK_CANCELLED = new Task<>(true);
    private static Task<Boolean> TASK_FALSE = new Task<>((Boolean) false);
    private static Task<?> TASK_NULL = new Task<>((Object) null);
    private static Task<Boolean> TASK_TRUE = new Task<>((Boolean) true);
    public static final Executor UI_THREAD_EXECUTOR = C1660a.m7398b();
    private static volatile AbstractC1659b unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private List<Continuation<TResult, Void>> continuations = new ArrayList();
    private Exception error;
    private boolean errorHasBeenObserved;
    private final Object lock = new Object();
    private TResult result;
    private C1671h unobservedErrorNotifier;

    /* renamed from: bolts.Task$b */
    public interface AbstractC1659b {
        /* renamed from: a */
        void mo8481a(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: bolts.Task<TResult> */
    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    public static AbstractC1659b getUnobservedExceptionHandler() {
        return unobservedExceptionHandler;
    }

    public static <TResult> Task<TResult>.C1658a create() {
        return new C1658a();
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public Task<Void> makeVoid() {
        return continueWithTask(new Continuation<TResult, Task<Void>>() {
            /* class bolts.Task.C16579 */

            /* renamed from: a */
            public Task<Void> then(Task<TResult> task) throws Exception {
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                return Task.forResult(null);
            }
        });
    }

    Task() {
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            if (this.error != null) {
                this.errorHasBeenObserved = true;
                C1671h hVar = this.unobservedErrorNotifier;
                if (hVar != null) {
                    hVar.mo8503a();
                    this.unobservedErrorNotifier = null;
                }
            }
            exc = this.error;
        }
        return exc;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            if (getError() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean trySetCancelled() {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.cancelled = true;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            if (!isCompleted()) {
                this.lock.wait();
            }
        }
    }

    private void runContinuations() {
        synchronized (this.lock) {
            for (Continuation<TResult, Void> continuation : this.continuations) {
                try {
                    continuation.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(AbstractC1659b bVar) {
        unobservedExceptionHandler = bVar;
    }

    /* renamed from: bolts.Task$a */
    public class C1658a extends C1670g<TResult> {
        C1658a() {
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public static Task<Void> delay(long j) {
        return delay(j, C1663b.m7400b(), null);
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        C1670g gVar = new C1670g();
        gVar.mo8499b(exc);
        return gVar.mo8496a();
    }

    public static <TResult> Task<List<TResult>> whenAllResult(final Collection<? extends Task<TResult>> collection) {
        return whenAll(collection).onSuccess(new Continuation<Void, List<TResult>>() {
            /* class bolts.Task.AnonymousClass13 */

            /* renamed from: a */
            public List<TResult> then(Task<Void> task) throws Exception {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Task task2 : collection) {
                    arrayList.add(task2.getResult());
                }
                return arrayList;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.result = tresult;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == null) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return tresult.booleanValue() ? (Task<TResult>) TASK_TRUE : (Task<TResult>) TASK_FALSE;
        }
        C1670g gVar = new C1670g();
        gVar.mo8500b((Object) tresult);
        return gVar.mo8496a();
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        final C1670g gVar = new C1670g();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            ((Task) it.next()).continueWith(new Continuation<Object, Void>() {
                /* class bolts.Task.AnonymousClass12 */

                /* renamed from: a */
                public Void then(Task<Object> task) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        gVar.mo8500b(task);
                        return null;
                    }
                    task.getError();
                    return null;
                }
            });
        }
        return gVar.mo8496a();
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        final C1670g gVar = new C1670g();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            ((Task) it.next()).continueWith(new Continuation<TResult, Void>() {
                /* class bolts.Task.AnonymousClass11 */

                /* renamed from: a */
                public Void then(Task<TResult> task) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        gVar.mo8500b(task);
                        return null;
                    }
                    task.getError();
                    return null;
                }
            });
        }
        return gVar.mo8496a();
    }

    /* access modifiers changed from: package-private */
    public boolean trySetError(Exception exc) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.error = exc;
            this.errorHasBeenObserved = false;
            this.lock.notifyAll();
            runContinuations();
            if (!this.errorHasBeenObserved && getUnobservedExceptionHandler() != null) {
                this.unobservedErrorNotifier = new C1671h(this);
            }
            return true;
        }
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        final C1670g gVar = new C1670g();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            ((Task) it.next()).continueWith(new Continuation<Object, Void>() {
                /* class bolts.Task.AnonymousClass14 */

                /* renamed from: a */
                public Void then(Task<Object> task) {
                    if (task.isFaulted()) {
                        synchronized (obj) {
                            arrayList.add(task.getError());
                        }
                    }
                    if (task.isCancelled()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                gVar.mo8499b((Exception) arrayList.get(0));
                            } else {
                                gVar.mo8499b((Exception) new AggregateException(String.format("There were %d exceptions.", Integer.valueOf(arrayList.size())), arrayList));
                            }
                        } else if (atomicBoolean.get()) {
                            gVar.mo8502c();
                        } else {
                            gVar.mo8500b((Object) null);
                        }
                    }
                    return null;
                }
            });
        }
        return gVar.mo8496a();
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation) {
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, C1666c cVar) {
        return call(callable, IMMEDIATE_EXECUTOR, cVar);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, C1666c cVar) {
        return call(callable, BACKGROUND_EXECUTOR, cVar);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, C1666c cVar) {
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cVar);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, C1666c cVar) {
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cVar);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, C1666c cVar) {
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cVar);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, C1666c cVar) {
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cVar);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static Task<Void> delay(long j, C1666c cVar) {
        return delay(j, C1663b.m7400b(), cVar);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return continueWith(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return continueWithTask(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return onSuccess(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return onSuccessTask(continuation, executor, null);
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean isCompleted;
        synchronized (this.lock) {
            if (!isCompleted()) {
                this.lock.wait(timeUnit.toMillis(j));
            }
            isCompleted = isCompleted();
        }
        return isCompleted;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, C1666c cVar) {
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cVar);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor) {
        return continueWhile(callable, continuation, executor, null);
    }

    public static <TResult> Task<TResult> call(final Callable<TResult> callable, Executor executor, final C1666c cVar) {
        final C1670g gVar = new C1670g();
        try {
            executor.execute(new Runnable() {
                /* class bolts.Task.AnonymousClass10 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: bolts.g */
                /* JADX WARN: Multi-variable type inference failed */
                public void run() {
                    C1666c cVar = cVar;
                    if (cVar == null || !cVar.mo8485a()) {
                        try {
                            gVar.mo8500b(callable.call());
                        } catch (CancellationException unused) {
                            gVar.mo8502c();
                        } catch (Exception e) {
                            gVar.mo8499b(e);
                        }
                    } else {
                        gVar.mo8502c();
                    }
                }
            });
        } catch (Exception e) {
            gVar.mo8499b((Exception) new ExecutorException(e));
        }
        return gVar.mo8496a();
    }

    static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, C1666c cVar) {
        if (cVar != null && cVar.mo8485a()) {
            return cancelled();
        }
        if (j <= 0) {
            return forResult(null);
        }
        final C1670g gVar = new C1670g();
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() {
            /* class bolts.Task.RunnableC16481 */

            public void run() {
                gVar.mo8498a((Object) null);
            }
        }, j, TimeUnit.MILLISECONDS);
        if (cVar != null) {
            cVar.mo8484a(new Runnable() {
                /* class bolts.Task.RunnableC16568 */

                public void run() {
                    schedule.cancel(true);
                    gVar.mo8501b();
                }
            });
        }
        return gVar.mo8496a();
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(final Continuation<TResult, TContinuationResult> continuation, final Executor executor, final C1666c cVar) {
        boolean isCompleted;
        final C1670g gVar = new C1670g();
        synchronized (this.lock) {
            isCompleted = isCompleted();
            if (!isCompleted) {
                this.continuations.add(new Continuation<TResult, Void>() {
                    /* class bolts.Task.C16492 */

                    /* renamed from: a */
                    public Void then(Task<TResult> task) {
                        Task.completeImmediately(gVar, continuation, task, executor, cVar);
                        return null;
                    }
                });
            }
        }
        if (isCompleted) {
            completeImmediately(gVar, continuation, this, executor, cVar);
        }
        return gVar.mo8496a();
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(final Continuation<TResult, Task<TContinuationResult>> continuation, final Executor executor, final C1666c cVar) {
        boolean isCompleted;
        final C1670g gVar = new C1670g();
        synchronized (this.lock) {
            isCompleted = isCompleted();
            if (!isCompleted) {
                this.continuations.add(new Continuation<TResult, Void>() {
                    /* class bolts.Task.C16503 */

                    /* renamed from: a */
                    public Void then(Task<TResult> task) {
                        Task.completeAfterTask(gVar, continuation, task, executor, cVar);
                        return null;
                    }
                });
            }
        }
        if (isCompleted) {
            completeAfterTask(gVar, continuation, this, executor, cVar);
        }
        return gVar.mo8496a();
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> continuation, Executor executor, final C1666c cVar) {
        return continueWithTask(new Continuation<TResult, Task<TContinuationResult>>() {
            /* class bolts.Task.C16514 */

            /* renamed from: a */
            public Task<TContinuationResult> then(Task<TResult> task) {
                C1666c cVar = cVar;
                if (cVar != null && cVar.mo8485a()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                return task.continueWith(continuation);
            }
        }, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, final C1666c cVar) {
        return continueWithTask(new Continuation<TResult, Task<TContinuationResult>>() {
            /* class bolts.Task.C16525 */

            /* renamed from: a */
            public Task<TContinuationResult> then(Task<TResult> task) {
                C1666c cVar = cVar;
                if (cVar != null && cVar.mo8485a()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                return task.continueWithTask(continuation);
            }
        }, executor);
    }

    public Task<Void> continueWhile(final Callable<Boolean> callable, final Continuation<Void, Task<Void>> continuation, final Executor executor, final C1666c cVar) {
        final C1669f fVar = new C1669f();
        fVar.mo8495a(new Continuation<Void, Task<Void>>() {
            /* class bolts.Task.AnonymousClass15 */

            /* renamed from: a */
            public Task<Void> then(Task<Void> task) throws Exception {
                C1666c cVar = cVar;
                if (cVar != null && cVar.mo8485a()) {
                    return Task.cancelled();
                }
                if (((Boolean) callable.call()).booleanValue()) {
                    return Task.forResult(null).onSuccessTask(continuation, executor).onSuccessTask((Continuation) fVar.mo8494a(), executor);
                }
                return Task.forResult(null);
            }
        });
        return makeVoid().continueWithTask((Continuation) fVar.mo8494a(), executor);
    }

    public static <TContinuationResult, TResult> void completeAfterTask(final C1670g<TContinuationResult> gVar, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor, final C1666c cVar) {
        try {
            executor.execute(new Runnable() {
                /* class bolts.Task.RunnableC16547 */

                public void run() {
                    C1666c cVar = cVar;
                    if (cVar == null || !cVar.mo8485a()) {
                        try {
                            Task task = (Task) continuation.then(task);
                            if (task == null) {
                                gVar.mo8500b((Object) null);
                            } else {
                                task.continueWith(new Continuation<TContinuationResult, Void>() {
                                    /* class bolts.Task.RunnableC16547.C16551 */

                                    /* renamed from: a */
                                    public Void then(Task<TContinuationResult> task) {
                                        if (cVar == null || !cVar.mo8485a()) {
                                            if (task.isCancelled()) {
                                                gVar.mo8502c();
                                            } else if (task.isFaulted()) {
                                                gVar.mo8499b(task.getError());
                                            } else {
                                                gVar.mo8500b((Object) task.getResult());
                                            }
                                            return null;
                                        }
                                        gVar.mo8502c();
                                        return null;
                                    }
                                });
                            }
                        } catch (CancellationException unused) {
                            gVar.mo8502c();
                        } catch (Exception e) {
                            gVar.mo8499b(e);
                        }
                    } else {
                        gVar.mo8502c();
                    }
                }
            });
        } catch (Exception e) {
            gVar.mo8499b(new ExecutorException(e));
        }
    }

    public static <TContinuationResult, TResult> void completeImmediately(final C1670g<TContinuationResult> gVar, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor, final C1666c cVar) {
        try {
            executor.execute(new Runnable() {
                /* class bolts.Task.RunnableC16536 */

                /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: bolts.g */
                /* JADX WARN: Multi-variable type inference failed */
                public void run() {
                    C1666c cVar = cVar;
                    if (cVar == null || !cVar.mo8485a()) {
                        try {
                            gVar.mo8500b(continuation.then(task));
                        } catch (CancellationException unused) {
                            gVar.mo8502c();
                        } catch (Exception e) {
                            gVar.mo8499b(e);
                        }
                    } else {
                        gVar.mo8502c();
                    }
                }
            });
        } catch (Exception e) {
            gVar.mo8499b(new ExecutorException(e));
        }
    }
}

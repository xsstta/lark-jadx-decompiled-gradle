package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tasks.Tasks$b */
    public interface AbstractC22081b extends AbstractC22091c, AbstractC22092d, AbstractC22093e<Object> {
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        C22085ab abVar = new C22085ab();
        abVar.mo75033a((Object) tresult);
        return abVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tasks.Tasks$a */
    public static final class C22080a implements AbstractC22081b {

        /* renamed from: a */
        private final CountDownLatch f53715a;

        private C22080a() {
            this.f53715a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.AbstractC22093e
        /* renamed from: a */
        public final void mo75026a(Object obj) {
            this.f53715a.countDown();
        }

        @Override // com.google.android.gms.tasks.AbstractC22092d
        /* renamed from: a */
        public final void mo75025a(Exception exc) {
            this.f53715a.countDown();
        }

        @Override // com.google.android.gms.tasks.AbstractC22091c
        public final void V_() {
            this.f53715a.countDown();
        }

        /* renamed from: b */
        public final void mo75028b() throws InterruptedException {
            this.f53715a.await();
        }

        /* renamed from: a */
        public final boolean mo75027a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f53715a.await(j, timeUnit);
        }

        /* synthetic */ C22080a(RunnableC22087ac acVar) {
            this();
        }
    }

    public static <TResult> Task<TResult> forException(Exception exc) {
        C22085ab abVar = new C22085ab();
        abVar.mo75032a(exc);
        return abVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tasks.Tasks$c */
    public static final class C22082c implements AbstractC22081b {

        /* renamed from: a */
        private final Object f53716a = new Object();

        /* renamed from: b */
        private final int f53717b;

        /* renamed from: c */
        private final C22085ab<Void> f53718c;

        /* renamed from: d */
        private int f53719d;

        /* renamed from: e */
        private int f53720e;

        /* renamed from: f */
        private int f53721f;

        /* renamed from: g */
        private Exception f53722g;

        /* renamed from: h */
        private boolean f53723h;

        public C22082c(int i, C22085ab<Void> abVar) {
            this.f53717b = i;
            this.f53718c = abVar;
        }

        @Override // com.google.android.gms.tasks.AbstractC22092d
        /* renamed from: a */
        public final void mo75025a(Exception exc) {
            synchronized (this.f53716a) {
                this.f53720e++;
                this.f53722g = exc;
                m79645b();
            }
        }

        @Override // com.google.android.gms.tasks.AbstractC22093e
        /* renamed from: a */
        public final void mo75026a(Object obj) {
            synchronized (this.f53716a) {
                this.f53719d++;
                m79645b();
            }
        }

        @Override // com.google.android.gms.tasks.AbstractC22091c
        public final void V_() {
            synchronized (this.f53716a) {
                this.f53721f++;
                this.f53723h = true;
                m79645b();
            }
        }

        /* renamed from: b */
        private final void m79645b() {
            if (this.f53719d + this.f53720e + this.f53721f != this.f53717b) {
                return;
            }
            if (this.f53722g != null) {
                C22085ab<Void> abVar = this.f53718c;
                int i = this.f53720e;
                int i2 = this.f53717b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i);
                sb.append(" out of ");
                sb.append(i2);
                sb.append(" underlying tasks failed");
                abVar.mo75032a(new ExecutionException(sb.toString(), this.f53722g));
            } else if (this.f53723h) {
                this.f53718c.mo75034a();
            } else {
                this.f53718c.mo75033a((Void) null);
            }
        }
    }

    public static <TResult> Task<TResult> forCanceled() {
        C22085ab abVar = new C22085ab();
        abVar.mo75034a();
        return abVar;
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(C22095g.f53736a, callable);
    }

    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        C22085ab abVar = new C22085ab();
        executor.execute(new RunnableC22087ac(abVar, callable));
        return abVar;
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zzb(task);
        }
        C22080a aVar = new C22080a(null);
        zza(task, aVar);
        aVar.mo75028b();
        return (TResult) zzb(task);
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zzb(task);
        }
        C22080a aVar = new C22080a(null);
        zza(task, aVar);
        if (aVar.mo75027a(j, timeUnit)) {
            return (TResult) zzb(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull((Task) it.next(), "null tasks are not accepted");
        }
        C22085ab abVar = new C22085ab();
        C22082c cVar = new C22082c(collection.size(), abVar);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zza((Task) it2.next(), cVar);
        }
        return abVar;
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
        if (taskArr.length == 0) {
            return forResult(null);
        }
        return whenAll(Arrays.asList(taskArr));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task<?>> collection) {
        return whenAll(collection).continueWith(new C22088ad(collection));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Task<?>... taskArr) {
        return whenAllSuccess(Arrays.asList(taskArr));
    }

    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        return whenAll(collection).continueWithTask(new C22089ae(collection));
    }

    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        return whenAllComplete(Arrays.asList(taskArr));
    }

    private static <TResult> TResult zzb(Task<TResult> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zza(Task<?> task, AbstractC22081b bVar) {
        task.addOnSuccessListener(C22095g.f53737b, bVar);
        task.addOnFailureListener(C22095g.f53737b, bVar);
        task.addOnCanceledListener(C22095g.f53737b, bVar);
    }

    private Tasks() {
    }
}

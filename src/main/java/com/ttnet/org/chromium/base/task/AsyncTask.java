package com.ttnet.org.chromium.base.task;

import android.os.Binder;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTask<Result> {
    public static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static final StealRunnableHandler STEAL_RUNNABLE_HANDLER = new StealRunnableHandler();
    public static final Executor THREAD_POOL_EXECUTOR = $$Lambda$AsyncTask$ICh7DU2niUnrzsbP408rdiDtwJA.INSTANCE;
    public final AtomicBoolean mCancelled = new AtomicBoolean();
    private final FutureTask<Result> mFuture;
    private volatile int mStatus;
    public final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final Callable<Result> mWorker;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    /* access modifiers changed from: protected */
    public abstract Result doInBackground();

    /* access modifiers changed from: protected */
    public void onCancelled() {
    }

    /* access modifiers changed from: protected */
    public abstract void onPostExecute(Result result);

    /* access modifiers changed from: protected */
    public void onPreExecute() {
    }

    private static class StealRunnableHandler implements RejectedExecutionHandler {
        private StealRunnableHandler() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public final int getStatus() {
        return this.mStatus;
    }

    class NamedFutureTask extends FutureTask<Result> {
        /* access modifiers changed from: package-private */
        public Class getBlamedClass() {
            return AsyncTask.this.getClass();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.ttnet.org.chromium.base.task.AsyncTask */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        public void done() {
            try {
                AsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.m264566w("AsyncTask", e.toString(), new Object[0]);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                AsyncTask.this.postResultIfNotInvoked(null);
            }
        }

        NamedFutureTask(Callable<Result> callable) {
            super(callable);
        }
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public static void takeOverAndroidThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        threadPoolExecutor.setRejectedExecutionHandler(STEAL_RUNNABLE_HANDLER);
        threadPoolExecutor.shutdown();
    }

    public AsyncTask() {
        CallableC679971 r0 = new Callable<Result>() {
            /* class com.ttnet.org.chromium.base.task.AsyncTask.CallableC679971 */

            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                AsyncTask.this.mTaskInvoked.set(true);
                Result result = null;
                try {
                    result = (Result) AsyncTask.this.doInBackground();
                    Binder.flushPendingCommands();
                    AsyncTask.this.postResult(result);
                    return result;
                } catch (Throwable th) {
                    AsyncTask.this.postResult(result);
                    throw th;
                }
            }
        };
        this.mWorker = r0;
        this.mFuture = new NamedFutureTask(r0);
    }

    private void executionPreamble() {
        if (this.mStatus != 0) {
            int i = this.mStatus;
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.mStatus = 1;
        onPreExecute();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r0 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.AsyncTask.get():java.lang.Object");
    }

    static /* synthetic */ void lambda$static$0(Runnable runnable) {
        PostTask.postTask(TaskTraits.BEST_EFFORT_MAY_BLOCK, runnable);
    }

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    public final AsyncTask<Result> executeOnExecutor(Executor executor) {
        executionPreamble();
        executor.execute(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeOnTaskRunner(TaskRunner taskRunner) {
        executionPreamble();
        taskRunner.postTask(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeWithTaskTraits(TaskTraits taskTraits) {
        executionPreamble();
        PostTask.postTask(taskTraits, this.mFuture);
        return this;
    }

    public void postResultIfNotInvoked(Result result) {
        if (!this.mTaskInvoked.get()) {
            postResult(result);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: finish */
    public void lambda$postResult$1$AsyncTask(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = 2;
    }

    public void postResult(Result result) {
        if (this instanceof BackgroundOnlyAsyncTask) {
            this.mStatus = 2;
        } else {
            ThreadUtils.postOnUiThread(new Runnable(result) {
                /* class com.ttnet.org.chromium.base.task.$$Lambda$AsyncTask$_pYuRRD6M6XISdLzdie9IryZcsM */
                public final /* synthetic */ Object f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AsyncTask.this.lambda$postResult$1$AsyncTask(this.f$1);
                }
            });
        }
    }
}

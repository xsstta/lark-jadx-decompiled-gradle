package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public abstract class AbstractDataSource<T> implements DataSource<T> {
    private EnumC21035a mDataSourceStatus = EnumC21035a.IN_PROGRESS;
    private Throwable mFailureThrowable;
    private boolean mIsClosed;
    private float mProgress;
    @Nullable
    private T mResult;
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> mSubscribers = new ConcurrentLinkedQueue<>();

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.AbstractDataSource$a */
    public enum EnumC21035a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* access modifiers changed from: protected */
    public void closeResult(@Nullable T t) {
    }

    @Override // com.facebook.datasource.DataSource
    public boolean hasMultipleResults() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized Throwable getFailureCause() {
        return this.mFailureThrowable;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized float getProgress() {
        return this.mProgress;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized T getResult() {
        return this.mResult;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    protected AbstractDataSource() {
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasFailed() {
        boolean z;
        if (this.mDataSourceStatus == EnumC21035a.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasResult() {
        boolean z;
        if (this.mResult != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isFinished() {
        boolean z;
        if (this.mDataSourceStatus != EnumC21035a.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private synchronized boolean wasCancelled() {
        boolean z;
        if (!isClosed() || isFinished()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    private void notifyDataSubscribers() {
        boolean hasFailed = hasFailed();
        boolean wasCancelled = wasCancelled();
        Iterator<Pair<DataSubscriber<T>, Executor>> it = this.mSubscribers.iterator();
        while (it.hasNext()) {
            Pair<DataSubscriber<T>, Executor> next = it.next();
            notifyDataSubscriber((DataSubscriber) next.first, (Executor) next.second, hasFailed, wasCancelled);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        closeResult(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (isFinished() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        notifyDataSubscribers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.mSubscribers.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    @Override // com.facebook.datasource.DataSource
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mIsClosed     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.mIsClosed = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.mResult     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.mResult = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.closeResult(r1)
        L_0x0016:
            boolean r1 = r3.isFinished()
            if (r1 != 0) goto L_0x001f
            r3.notifyDataSubscribers()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r1 = r3.mSubscribers     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.close():boolean");
    }

    /* access modifiers changed from: protected */
    public void notifyProgressUpdate() {
        Iterator<Pair<DataSubscriber<T>, Executor>> it = this.mSubscribers.iterator();
        while (it.hasNext()) {
            Pair<DataSubscriber<T>, Executor> next = it.next();
            final DataSubscriber dataSubscriber = (DataSubscriber) next.first;
            ((Executor) next.second).execute(new Runnable() {
                /* class com.facebook.datasource.AbstractDataSource.RunnableC210342 */

                public void run() {
                    dataSubscriber.onProgressUpdate(AbstractDataSource.this);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public boolean setFailure(Throwable th) {
        boolean failureInternal = setFailureInternal(th);
        if (failureInternal) {
            notifyDataSubscribers();
        }
        return failureInternal;
    }

    /* access modifiers changed from: protected */
    public boolean setProgress(float f) {
        boolean progressInternal = setProgressInternal(f);
        if (progressInternal) {
            notifyProgressUpdate();
        }
        return progressInternal;
    }

    private synchronized boolean setFailureInternal(Throwable th) {
        if (!this.mIsClosed) {
            if (this.mDataSourceStatus == EnumC21035a.IN_PROGRESS) {
                this.mDataSourceStatus = EnumC21035a.FAILURE;
                this.mFailureThrowable = th;
                return true;
            }
        }
        return false;
    }

    private synchronized boolean setProgressInternal(float f) {
        if (!this.mIsClosed) {
            if (this.mDataSourceStatus == EnumC21035a.IN_PROGRESS) {
                if (f < this.mProgress) {
                    return false;
                }
                this.mProgress = f;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean setResult(@Nullable T t, boolean z) {
        boolean resultInternal = setResultInternal(t, z);
        if (resultInternal) {
            notifyDataSubscribers();
        }
        return resultInternal;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        if (r4 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        closeResult(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setResultInternal(@javax.annotation.Nullable T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003a }
            boolean r1 = r3.mIsClosed     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002b
            com.facebook.datasource.AbstractDataSource$a r1 = r3.mDataSourceStatus     // Catch:{ all -> 0x0037 }
            com.facebook.datasource.AbstractDataSource$a r2 = com.facebook.datasource.AbstractDataSource.EnumC21035a.IN_PROGRESS     // Catch:{ all -> 0x0037 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002b
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.datasource.AbstractDataSource$a r5 = com.facebook.datasource.AbstractDataSource.EnumC21035a.SUCCESS     // Catch:{ all -> 0x0037 }
            r3.mDataSourceStatus = r5     // Catch:{ all -> 0x0037 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.mProgress = r5     // Catch:{ all -> 0x0037 }
        L_0x0017:
            T r5 = r3.mResult     // Catch:{ all -> 0x0037 }
            if (r5 == r4) goto L_0x0022
            r3.mResult = r4     // Catch:{ all -> 0x001f }
            r4 = r5
            goto L_0x0023
        L_0x001f:
            r4 = move-exception
            r0 = r5
            goto L_0x0038
        L_0x0022:
            r4 = r0
        L_0x0023:
            r5 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002a
            r3.closeResult(r4)
        L_0x002a:
            return r5
        L_0x002b:
            r5 = 0
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0032
            r3.closeResult(r4)
        L_0x0032:
            return r5
        L_0x0033:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x0038
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            monitor-exit(r3)
            throw r4
        L_0x003a:
            r4 = move-exception
            if (r0 == 0) goto L_0x0040
            r3.closeResult(r0)
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.setResultInternal(java.lang.Object, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        notifyDataSubscriber(r3, r4, hasFailed(), wasCancelled());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    @Override // com.facebook.datasource.DataSource
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void subscribe(com.facebook.datasource.DataSubscriber<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r3)
            com.facebook.common.internal.Preconditions.checkNotNull(r4)
            monitor-enter(r2)
            boolean r0 = r2.mIsClosed     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.datasource.AbstractDataSource$a r0 = r2.mDataSourceStatus     // Catch:{ all -> 0x0041 }
            com.facebook.datasource.AbstractDataSource$a r1 = com.facebook.datasource.AbstractDataSource.EnumC21035a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r0 = r2.mSubscribers     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.hasResult()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.isFinished()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.wasCancelled()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.hasFailed()
            boolean r1 = r2.wasCancelled()
            r2.notifyDataSubscriber(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.subscribe(com.facebook.datasource.DataSubscriber, java.util.concurrent.Executor):void");
    }

    private void notifyDataSubscriber(final DataSubscriber<T> dataSubscriber, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() {
            /* class com.facebook.datasource.AbstractDataSource.RunnableC210331 */

            public void run() {
                if (z) {
                    dataSubscriber.onFailure(AbstractDataSource.this);
                } else if (z2) {
                    dataSubscriber.onCancellation(AbstractDataSource.this);
                } else {
                    dataSubscriber.onNewResult(AbstractDataSource.this);
                }
            }
        });
    }
}

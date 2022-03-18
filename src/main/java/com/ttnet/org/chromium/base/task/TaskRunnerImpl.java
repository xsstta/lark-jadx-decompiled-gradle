package com.ttnet.org.chromium.base.task;

import android.util.Pair;
import com.ttnet.org.chromium.base.LifetimeAssert;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@JNINamespace("base")
public class TaskRunnerImpl implements TaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mIsDestroying;
    private final LifetimeAssert mLifetimeAssert;
    protected final Object mLock;
    protected long mNativeTaskRunnerAndroid;
    protected List<Pair<Runnable, Long>> mPreNativeDelayedTasks;
    protected LinkedList<Runnable> mPreNativeTasks;
    protected final Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    private final TaskTraits mTaskTraits;
    private final String mTraceEvent;

    private native void nativeDestroy(long j);

    private native long nativeInit(int i, boolean z, int i2, boolean z2, boolean z3, byte b, byte[] bArr);

    private native void nativePostDelayedTask(long j, Runnable runnable, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeBelongsToCurrentThread(long j);

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void disableLifetimeCheck() {
        LifetimeAssert.setSafeToGc(this.mLifetimeAssert, true);
    }

    /* access modifiers changed from: protected */
    public void destroyInternal() {
        long j = this.mNativeTaskRunnerAndroid;
        if (j != 0) {
            nativeDestroy(j);
        }
        this.mNativeTaskRunnerAndroid = 0;
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void initNativeTaskRunner() {
        synchronized (this.mLock) {
            initNativeTaskRunnerInternal();
            migratePreNativeTasksToNative();
        }
    }

    /* access modifiers changed from: protected */
    public void schedulePreNativeTask() {
        PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void destroy() {
        synchronized (this.mLock) {
            LifetimeAssert.setSafeToGc(this.mLifetimeAssert, true);
            this.mIsDestroying = true;
            destroyInternal();
        }
    }

    /* access modifiers changed from: protected */
    public void initNativeTaskRunnerInternal() {
        if (this.mNativeTaskRunnerAndroid == 0) {
            this.mNativeTaskRunnerAndroid = nativeInit(this.mTaskRunnerType, this.mTaskTraits.mPrioritySetExplicitly, this.mTaskTraits.mPriority, this.mTaskTraits.mMayBlock, this.mTaskTraits.mUseThreadPool, this.mTaskTraits.mExtensionId, this.mTaskTraits.mExtensionData);
        }
    }

    /* access modifiers changed from: protected */
    public void migratePreNativeTasksToNative() {
        LinkedList<Runnable> linkedList = this.mPreNativeTasks;
        if (linkedList != null) {
            Iterator<Runnable> it = linkedList.iterator();
            while (it.hasNext()) {
                postDelayedTaskToNative(it.next(), 0);
            }
            for (Pair<Runnable, Long> pair : this.mPreNativeDelayedTasks) {
                postDelayedTaskToNative((Runnable) pair.first, ((Long) pair.second).longValue());
            }
            this.mPreNativeTasks = null;
            this.mPreNativeDelayedTasks = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1 = r4.mTaskTraits.mPriority;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 == 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r1 == 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        android.os.Process.setThreadPriority(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        android.os.Process.setThreadPriority(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        android.os.Process.setThreadPriority(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0043, code lost:
        if (r0 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void runPreNativeTask() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mTraceEvent
            com.ttnet.org.chromium.base.TraceEvent r0 = com.ttnet.org.chromium.base.TraceEvent.scoped(r0)
            java.lang.Object r1 = r4.mLock     // Catch:{ all -> 0x0040 }
            monitor-enter(r1)     // Catch:{ all -> 0x0040 }
            java.util.LinkedList<java.lang.Runnable> r2 = r4.mPreNativeTasks     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0013
            r0.close()
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r2 = r2.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            monitor-exit(r1)
            com.ttnet.org.chromium.base.task.TaskTraits r1 = r4.mTaskTraits
            int r1 = r1.mPriority
            r3 = 1
            if (r1 == r3) goto L_0x0030
            r3 = 2
            if (r1 == r3) goto L_0x002b
            r1 = 10
            android.os.Process.setThreadPriority(r1)
            goto L_0x0034
        L_0x002b:
            r1 = -1
            android.os.Process.setThreadPriority(r1)
            goto L_0x0034
        L_0x0030:
            r1 = 0
            android.os.Process.setThreadPriority(r1)
        L_0x0034:
            r2.run()
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x004d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.TaskRunnerImpl.runPreNativeTask():void");
    }

    TaskRunnerImpl(TaskTraits taskTraits) {
        this(taskTraits, "TaskRunnerImpl", 0);
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void postTask(Runnable runnable) {
        postDelayedTask(runnable, 0);
    }

    /* access modifiers changed from: protected */
    public void postDelayedTaskToNative(Runnable runnable, long j) {
        nativePostDelayedTask(this.mNativeTaskRunnerAndroid, runnable, j);
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void postDelayedTask(Runnable runnable, long j) {
        synchronized (this.mLock) {
            LinkedList<Runnable> linkedList = this.mPreNativeTasks;
            if (linkedList == null) {
                postDelayedTaskToNative(runnable, j);
                return;
            }
            if (j == 0) {
                linkedList.add(runnable);
                schedulePreNativeTask();
            } else {
                this.mPreNativeDelayedTasks.add(new Pair<>(runnable, Long.valueOf(j)));
            }
        }
    }

    protected TaskRunnerImpl(TaskTraits taskTraits, String str, int i) {
        this.mLock = new Object();
        this.mRunPreNativeTaskClosure = new Runnable() {
            /* class com.ttnet.org.chromium.base.task.$$Lambda$T5uz9GV8LcCnvHnFtZG5isvEdEk */

            public final void run() {
                TaskRunnerImpl.this.runPreNativeTask();
            }
        };
        this.mLifetimeAssert = LifetimeAssert.create(this);
        this.mPreNativeTasks = new LinkedList<>();
        this.mPreNativeDelayedTasks = new ArrayList();
        this.mTaskTraits = taskTraits;
        this.mTraceEvent = str + ".PreNativeTask.run";
        this.mTaskRunnerType = i;
        if (!PostTask.registerPreNativeTaskRunnerLocked(this)) {
            initNativeTaskRunner();
        }
    }
}

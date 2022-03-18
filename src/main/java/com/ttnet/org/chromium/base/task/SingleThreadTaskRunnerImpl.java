package com.ttnet.org.chromium.base.task;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base")
public class SingleThreadTaskRunnerImpl extends TaskRunnerImpl implements SingleThreadTaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Handler mHandler;
    private final boolean mPostTaskAtFrontOfQueue;

    private void postAtFrontOfQueue() {
        if (Build.VERSION.SDK_INT >= 21) {
            Message obtain = Message.obtain(this.mHandler, this.mRunPreNativeTaskClosure);
            obtain.setAsynchronous(true);
            this.mHandler.sendMessageAtFrontOfQueue(obtain);
            return;
        }
        this.mHandler.postAtFrontOfQueue(this.mRunPreNativeTaskClosure);
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.base.task.TaskRunnerImpl
    public void schedulePreNativeTask() {
        Handler handler = this.mHandler;
        if (handler != null) {
            if (this.mPostTaskAtFrontOfQueue) {
                postAtFrontOfQueue();
            } else {
                handler.post(this.mRunPreNativeTaskClosure);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0.getLooper().getThread() != java.lang.Thread.currentThread()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r6.mHandler;
     */
    @Override // com.ttnet.org.chromium.base.task.SingleThreadTaskRunner
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean belongsToCurrentThread() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            long r1 = r6.mNativeTaskRunnerAndroid     // Catch:{ all -> 0x0029 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0013
            long r1 = r6.mNativeTaskRunnerAndroid     // Catch:{ all -> 0x0029 }
            boolean r1 = r6.nativeBelongsToCurrentThread(r1)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            android.os.Handler r0 = r6.mHandler
            r1 = 0
            if (r0 == 0) goto L_0x0028
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r0 != r2) goto L_0x0028
            r1 = 1
        L_0x0028:
            return r1
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.SingleThreadTaskRunnerImpl.belongsToCurrentThread():boolean");
    }

    public SingleThreadTaskRunnerImpl(Handler handler, TaskTraits taskTraits) {
        this(handler, taskTraits, false);
    }

    public SingleThreadTaskRunnerImpl(Handler handler, TaskTraits taskTraits, boolean z) {
        super(taskTraits, "SingleThreadTaskRunnerImpl", 2);
        this.mHandler = handler;
        this.mPostTaskAtFrontOfQueue = z;
    }
}

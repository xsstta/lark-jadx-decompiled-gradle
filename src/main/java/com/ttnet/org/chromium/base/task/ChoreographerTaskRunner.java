package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;

/* access modifiers changed from: package-private */
public final class ChoreographerTaskRunner implements SingleThreadTaskRunner {
    private final Choreographer mChoreographer;

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void destroy() {
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void disableLifetimeCheck() {
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void initNativeTaskRunner() {
    }

    @Override // com.ttnet.org.chromium.base.task.SingleThreadTaskRunner
    public boolean belongsToCurrentThread() {
        try {
            if (this.mChoreographer == Choreographer.getInstance()) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    ChoreographerTaskRunner(Choreographer choreographer) {
        this.mChoreographer = choreographer;
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void postTask(final Runnable runnable) {
        this.mChoreographer.postFrameCallback(new Choreographer.FrameCallback() {
            /* class com.ttnet.org.chromium.base.task.ChoreographerTaskRunner.Choreographer$FrameCallbackC679981 */

            public void doFrame(long j) {
                runnable.run();
            }
        });
    }

    @Override // com.ttnet.org.chromium.base.task.TaskRunner
    public void postDelayedTask(final Runnable runnable, long j) {
        this.mChoreographer.postFrameCallbackDelayed(new Choreographer.FrameCallback() {
            /* class com.ttnet.org.chromium.base.task.ChoreographerTaskRunner.Choreographer$FrameCallbackC679992 */

            public void doFrame(long j) {
                runnable.run();
            }
        }, j);
    }
}

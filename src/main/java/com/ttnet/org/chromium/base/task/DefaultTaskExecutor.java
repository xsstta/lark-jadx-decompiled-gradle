package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class DefaultTaskExecutor implements TaskExecutor {
    private final Map<TaskTraits, TaskRunner> mTraitsToRunnerMap = new HashMap();

    @Override // com.ttnet.org.chromium.base.task.TaskExecutor
    public boolean canRunTaskImmediately(TaskTraits taskTraits) {
        return false;
    }

    DefaultTaskExecutor() {
    }

    private synchronized ChoreographerTaskRunner createChoreographerTaskRunner() {
        return (ChoreographerTaskRunner) ThreadUtils.runOnUiThreadBlockingNoException($$Lambda$DefaultTaskExecutor$7gYUTBu98Awmvc8kVKoOR54waiQ.INSTANCE);
    }

    static /* synthetic */ ChoreographerTaskRunner lambda$createChoreographerTaskRunner$0() throws Exception {
        return new ChoreographerTaskRunner(Choreographer.getInstance());
    }

    @Override // com.ttnet.org.chromium.base.task.TaskExecutor
    public SequencedTaskRunner createSequencedTaskRunner(TaskTraits taskTraits) {
        if (taskTraits.mIsChoreographerFrame) {
            return createChoreographerTaskRunner();
        }
        return new SequencedTaskRunnerImpl(taskTraits);
    }

    @Override // com.ttnet.org.chromium.base.task.TaskExecutor
    public SingleThreadTaskRunner createSingleThreadTaskRunner(TaskTraits taskTraits) {
        if (taskTraits.mIsChoreographerFrame) {
            return createChoreographerTaskRunner();
        }
        return new SingleThreadTaskRunnerImpl(null, taskTraits);
    }

    @Override // com.ttnet.org.chromium.base.task.TaskExecutor
    public TaskRunner createTaskRunner(TaskTraits taskTraits) {
        if (taskTraits.mIsChoreographerFrame) {
            return createChoreographerTaskRunner();
        }
        return new TaskRunnerImpl(taskTraits);
    }

    @Override // com.ttnet.org.chromium.base.task.TaskExecutor
    public synchronized void postDelayedTask(TaskTraits taskTraits, Runnable runnable, long j) {
        if (taskTraits.hasExtension()) {
            TaskRunner createTaskRunner = createTaskRunner(taskTraits);
            createTaskRunner.postDelayedTask(runnable, j);
            createTaskRunner.destroy();
        } else {
            TaskRunner taskRunner = this.mTraitsToRunnerMap.get(taskTraits);
            if (taskRunner == null) {
                taskRunner = createTaskRunner(taskTraits);
                taskRunner.disableLifetimeCheck();
                this.mTraitsToRunnerMap.put(taskTraits, taskRunner);
            }
            taskRunner.postDelayedTask(runnable, j);
        }
    }
}

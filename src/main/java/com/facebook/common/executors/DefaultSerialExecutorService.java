package com.facebook.common.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public class DefaultSerialExecutorService extends C21011a implements AbstractExecutorServiceC21017e {
    public DefaultSerialExecutorService(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    @Override // com.facebook.common.executors.C21011a
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}

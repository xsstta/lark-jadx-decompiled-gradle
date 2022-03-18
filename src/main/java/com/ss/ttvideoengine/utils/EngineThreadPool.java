package com.ss.ttvideoengine.utils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EngineThreadPool {
    private static volatile boolean mEnableThreadPoolOptimize = true;
    private static volatile ThreadPoolExecutor mExecutorInstance;
    private static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    private static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    public static class AsyncRunnable implements Runnable {
        private Runnable mRunnable;

        public void run() {
            this.mRunnable.run();
            EngineThreadPool._finished(this);
        }

        public AsyncRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    public static int getPoolSize() {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.getPoolSize();
    }

    public static void shutdown() {
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
    }

    private static void _promoteRunnable() {
        if (mReadyRunnables.size() > 0) {
            Iterator<AsyncRunnable> it = mReadyRunnables.iterator();
            if (it.hasNext()) {
                AsyncRunnable next = it.next();
                it.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (EngineThreadPool.class) {
                if (mExecutorInstance == null) {
                    if (mEnableThreadPoolOptimize) {
                        TTVideoEngineLog.m256505i("EngineThreadPool", "mEnableThreadPoolOptimize true");
                        mExecutorInstance = new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        mExecutorInstance.allowCoreThreadTimeOut(true);
                    } else {
                        mExecutorInstance = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                }
            }
        }
        return mExecutorInstance;
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        synchronized (EngineThreadPool.class) {
            mRunningRunnables.remove(asyncRunnable);
            _promoteRunnable();
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (EngineThreadPool.class) {
            mExecutorInstance = threadPoolExecutor;
        }
    }

    public static synchronized void setOptimizeEnabled(boolean z) {
        synchronized (EngineThreadPool.class) {
            mEnableThreadPoolOptimize = z;
        }
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        synchronized (EngineThreadPool.class) {
            if (runnable == null) {
                return null;
            }
            if (mExecutorInstance == null) {
                getExecutorInstance();
            }
            TTVideoEngineLog.m256505i("EngineThreadPool", "addExecuteTask,pool size:" + getPoolSize() + ", active:" + mExecutorInstance.getActiveCount());
            if (mEnableThreadPoolOptimize) {
                return mExecutorInstance.submit(runnable);
            }
            TTVideoEngineLog.m256505i("EngineThreadPool", "running:" + mRunningRunnables.size() + ", ready:" + mReadyRunnables.size());
            AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
            if (mRunningRunnables.size() >= 5) {
                mReadyRunnables.add(asyncRunnable);
                return null;
            }
            mRunningRunnables.add(asyncRunnable);
            return mExecutorInstance.submit(asyncRunnable);
        }
    }
}

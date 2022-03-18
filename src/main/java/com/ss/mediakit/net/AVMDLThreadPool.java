package com.ss.mediakit.net;

import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AVMDLThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;
    private static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    private static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    public static class AsyncRunnable implements Runnable {
        private Runnable mRunnable;

        public void run() {
            this.mRunnable.run();
            AVMDLThreadPool._finished(this);
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
            synchronized (AVMDLThreadPool.class) {
                if (mExecutorInstance == null) {
                    mExecutorInstance = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                }
            }
        }
        return mExecutorInstance;
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        synchronized (AVMDLThreadPool.class) {
            mRunningRunnables.remove(asyncRunnable);
            _promoteRunnable();
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (AVMDLThreadPool.class) {
            mExecutorInstance = threadPoolExecutor;
        }
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        synchronized (AVMDLThreadPool.class) {
            if (runnable == null) {
                return null;
            }
            if (mExecutorInstance == null) {
                getExecutorInstance();
            }
            AVMDLLog.m256407d("AVMDLThreadPool", "addExecuteTask,cur thread num:" + getPoolSize());
            AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
            if (mRunningRunnables.size() >= 64) {
                mReadyRunnables.add(asyncRunnable);
                return null;
            }
            mRunningRunnables.add(asyncRunnable);
            return mExecutorInstance.submit(asyncRunnable);
        }
    }
}

package com.ss.android.lark.utils.rxjava;

import com.larksuite.framework.thread.CoreThreadPool;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.C68934d;

public class LarkRxSchedulers {
    private static volatile C68934d mComputeScheduler;
    private static volatile C68934d mIOScheduler;
    private static volatile C68934d mUIScheduler;

    public static Scheduler computation() {
        if (mComputeScheduler == null) {
            C68934d dVar = new C68934d(CoreThreadPool.getDefault().getFixedThreadPool());
            synchronized (LarkRxSchedulers.class) {
                if (mComputeScheduler == null) {
                    mComputeScheduler = dVar;
                }
            }
        }
        return mComputeScheduler;
    }

    public static Scheduler io() {
        if (mIOScheduler == null) {
            C68934d dVar = new C68934d(CoreThreadPool.getDefault().getCachedThreadPool());
            synchronized (LarkRxSchedulers.class) {
                if (mIOScheduler == null) {
                    mIOScheduler = dVar;
                }
            }
        }
        return mIOScheduler;
    }

    public static Scheduler mainThread() {
        if (mUIScheduler == null) {
            C68934d dVar = new C68934d(CoreThreadPool.getDefault().getUIExecutor());
            synchronized (LarkRxSchedulers.class) {
                if (mUIScheduler == null) {
                    mUIScheduler = dVar;
                }
            }
        }
        return mUIScheduler;
    }
}

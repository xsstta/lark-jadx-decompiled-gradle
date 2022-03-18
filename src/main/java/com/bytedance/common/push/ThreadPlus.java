package com.bytedance.common.push;

import com.bytedance.common.utility.concurrent.TTExecutors;

public class ThreadPlus {
    public static void submitRunnable(Runnable runnable) {
        TTExecutors.getIOThreadPool().submit(runnable);
    }
}

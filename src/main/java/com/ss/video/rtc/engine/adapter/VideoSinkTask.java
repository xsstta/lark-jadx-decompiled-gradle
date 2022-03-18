package com.ss.video.rtc.engine.adapter;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

public class VideoSinkTask extends HandlerThread {
    private Handler mHandler;
    private Object mLock = new Object();

    public VideoSinkTask() {
        super("VideoSinkTaskManager", 0);
    }

    public void exit() {
        synchronized (this.mLock) {
            if (Build.VERSION.SDK_INT >= 18) {
                quitSafely();
            } else {
                quit();
            }
            this.mHandler = null;
        }
    }

    public void init() {
        synchronized (this.mLock) {
            start();
            this.mHandler = new Handler(getLooper());
        }
    }

    public void post(Runnable runnable) {
        synchronized (this.mLock) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        synchronized (this.mLock) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(runnable, j);
            }
        }
    }
}

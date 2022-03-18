package com.serenegiant.usb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

class HandlerThreadHandler extends Handler {
    private final boolean mAsynchronous;
    private final long mId;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public long getId() {
        return this.mId;
    }

    public static final HandlerThreadHandler createHandler() {
        return createHandler("HandlerThreadHandler", false);
    }

    public boolean isCurrentThread() throws IllegalStateException {
        if (getLooper() == null) {
            throw new IllegalStateException("has no looper");
        } else if (this.mId == Thread.currentThread().getId()) {
            return true;
        } else {
            return false;
        }
    }

    public void quit() throws IllegalStateException {
        Looper looper = getLooper();
        if (looper != null) {
            looper.quit();
            return;
        }
        throw new IllegalStateException("has no looper");
    }

    public void quitSafely() throws IllegalStateException {
        Looper looper = getLooper();
        if (looper != null) {
            looper.quitSafely();
            return;
        }
        throw new IllegalStateException("has no looper");
    }

    public static final HandlerThreadHandler createHandler(Handler.Callback callback) {
        return createHandler("HandlerThreadHandler", callback);
    }

    public static final HandlerThreadHandler createHandler(String str) {
        return createHandler(str, false);
    }

    public static final HandlerThreadHandler createHandler(boolean z) {
        return createHandler("HandlerThreadHandler", z);
    }

    public static final HandlerThreadHandler createHandler(Handler.Callback callback, boolean z) {
        return createHandler("HandlerThreadHandler", callback, z);
    }

    public boolean sendMessageAtTime(Message message, long j) {
        if (this.mAsynchronous && Build.VERSION.SDK_INT >= 22) {
            message.setAsynchronous(true);
        }
        return super.sendMessageAtTime(message, j);
    }

    private HandlerThreadHandler(Looper looper, boolean z) {
        super(looper);
        long j;
        Thread thread = looper.getThread();
        if (thread != null) {
            j = thread.getId();
        } else {
            j = 0;
        }
        this.mId = j;
        this.mAsynchronous = z;
    }

    public static final HandlerThreadHandler createHandler(String str, Handler.Callback callback) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        return new HandlerThreadHandler(new_android_os_HandlerThread_by_knot.getLooper(), callback, false);
    }

    public static final HandlerThreadHandler createHandler(String str, boolean z) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        return new HandlerThreadHandler(new_android_os_HandlerThread_by_knot.getLooper(), z);
    }

    private HandlerThreadHandler(Looper looper, Handler.Callback callback, boolean z) {
        super(looper, callback);
        long j;
        Thread thread = looper.getThread();
        if (thread != null) {
            j = thread.getId();
        } else {
            j = 0;
        }
        this.mId = j;
        this.mAsynchronous = z;
    }

    public static final HandlerThreadHandler createHandler(String str, Handler.Callback callback, boolean z) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        return new HandlerThreadHandler(new_android_os_HandlerThread_by_knot.getLooper(), callback, z);
    }
}

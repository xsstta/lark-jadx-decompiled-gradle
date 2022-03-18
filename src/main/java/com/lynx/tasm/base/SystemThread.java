package com.lynx.tasm.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

public class SystemThread {
    private Thread mAndroidThread;
    public long mNativeThread;

    public static native void nativeRun(long j);

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public void join() {
        try {
            this.mAndroidThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        Looper myLooper = Looper.myLooper();
        if (Thread.currentThread() == this.mAndroidThread && myLooper != null) {
            myLooper.quit();
        }
    }

    public static void attachMainThread(final long j) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            nativeRun(j);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.lynx.tasm.base.SystemThread.RunnableC266082 */

                public void run() {
                    SystemThread.nativeRun(j);
                }
            });
        }
    }

    private void createAndroidThread(String str, int i) {
        Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
            /* class com.lynx.tasm.base.SystemThread.RunnableC266071 */

            public void run() {
                Looper.prepare();
                SystemThread.nativeRun(SystemThread.this.mNativeThread);
                Looper.loop();
            }
        }, str));
        this.mAndroidThread = new_insert_after_java_lang_Thread_by_knot;
        new_insert_after_java_lang_Thread_by_knot.setPriority(i);
        this.mAndroidThread.start();
    }

    public static SystemThread create(long j, String str, int i) {
        return new SystemThread(j, str, i);
    }

    private SystemThread(long j, String str, int i) {
        this.mNativeThread = j;
        createAndroidThread(str, i);
    }
}

package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

public class NativeBitmap {
    public static boolean mEnabled;
    private static boolean mStarted;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    private static native boolean start(int i);

    private NativeBitmap() {
    }

    public static double getJavaHeapUtilizaiton() {
        return (((double) Runtime.getRuntime().totalMemory()) * 1.0d) / ((double) Runtime.getRuntime().maxMemory());
    }

    public static synchronized boolean enable(Context context) {
        synchronized (NativeBitmap.class) {
            if (Build.VERSION.SDK_INT >= 22) {
                if (Build.VERSION.SDK_INT <= 25) {
                    return realStart(context);
                }
            }
            return false;
        }
    }

    public static synchronized boolean realStart(Context context) {
        synchronized (NativeBitmap.class) {
            if (mEnabled) {
                return true;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    mEnabled = start(Build.VERSION.SDK_INT);
                    Log.d("NativeBitmap", "NativeBitmap.enable: " + mEnabled);
                    return mEnabled;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("NativeBitmap", "UnsatisfiedLinkError", e);
                }
            }
            return false;
        }
    }

    public static synchronized boolean enable(final Context context, final long j, final double d, long j2) {
        synchronized (NativeBitmap.class) {
            if (Build.VERSION.SDK_INT >= 22) {
                if (Build.VERSION.SDK_INT <= 25) {
                    if (Runtime.getRuntime().maxMemory() > j2) {
                        Log.e("NativeBitmap", "disabled: The java heap is big enough. ");
                        return false;
                    } else if (mStarted || mEnabled) {
                        return true;
                    } else {
                        mStarted = true;
                        new_insert_after_java_lang_Thread_by_knot(new Thread(null, new Runnable() {
                            /* class com.bytedance.sysoptimizer.NativeBitmap.RunnableC207071 */

                            public void run() {
                                while (true) {
                                    try {
                                        Thread.sleep(j);
                                        if (!NativeBitmap.mEnabled) {
                                            if (NativeBitmap.getJavaHeapUtilizaiton() >= d) {
                                                NativeBitmap.realStart(context);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }, "NativeBitmap", 262144)).start();
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

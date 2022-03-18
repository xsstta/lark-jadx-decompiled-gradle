package com.bytedance.common.jato.fdio.launch;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.Trace;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoNativeLoader;
import com.bytedance.common.jato.fdio.FDIOMonitor;
import com.bytedance.common.jato.util.SpUtils;
import java.io.File;

public class FDIOLaunchWrapper {
    public static boolean isCollectByTryTime;
    public static boolean isNoMerge;
    private static boolean isStart;

    public static synchronized void start() {
        synchronized (FDIOLaunchWrapper.class) {
            if (!isStart) {
                Jato.getWorkExecutorService().execute(new Runnable() {
                    /* class com.bytedance.common.jato.fdio.launch.FDIOLaunchWrapper.RunnableC36161 */

                    public void run() {
                        if (JatoNativeLoader.loadLibrary()) {
                            if (FDIOLaunchWrapper.isNeedCollect()) {
                                Trace.beginSection("start_collect");
                                Jato.startFDIOCollect("jato_start_up_default_2", FDIOLaunchWrapper.isNoMerge);
                                FDIOMonitor.monitorIsCollect("collect");
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    /* class com.bytedance.common.jato.fdio.launch.FDIOLaunchWrapper.RunnableC36161.RunnableC36171 */

                                    public void run() {
                                        FDIOLaunchWrapper.stop(true);
                                    }
                                }, 10000);
                            } else {
                                Trace.beginSection("start_preload");
                                Jato.startFDIOPreload("jato_start_up_default_2", true);
                                FDIOMonitor.monitorIsCollect("preload");
                            }
                            Trace.endSection();
                        }
                    }
                });
                isStart = true;
            }
        }
    }

    public static boolean isNeedCollect() {
        boolean z;
        int i;
        Context context = Jato.getContext();
        if (context == null) {
            return false;
        }
        SharedPreferences sp = SpUtils.getSp();
        String packageCodePath = context.getPackageCodePath();
        File file = new File(packageCodePath);
        long j = sp.getLong("start_up_base_apk", 0);
        long lastModified = file.lastModified();
        if (lastModified == j || lastModified == 0) {
            z = false;
        } else {
            sp.edit().putLong("start_up_base_apk", lastModified).apply();
            sp.edit().putInt("start_up_retry_time", 0).apply();
            isNoMerge = true;
            FDIOMonitor.monitorCollectReason("apk");
            z = true;
        }
        File file2 = new File(findOdexPath(packageCodePath.substring(0, packageCodePath.lastIndexOf("/"))));
        long j2 = sp.getLong("start_up_odex", 0);
        long lastModified2 = file2.lastModified();
        long j3 = sp.getLong("start_up_odex_size", 0);
        long length = file2.length();
        if (!(j2 == lastModified2 || lastModified2 == 0)) {
            sp.edit().putLong("start_up_odex", lastModified2).apply();
            FDIOMonitor.monitorCollectReason("odex_time");
            z = true;
        }
        if (!(j3 == length || length == 0)) {
            sp.edit().putLong("start_up_odex_size", length).apply();
            FDIOMonitor.monitorCollectReason("odex_size");
            z = true;
        }
        if (z || (i = sp.getInt("start_up_retry_time", 0)) >= 2) {
            return z;
        }
        sp.edit().putInt("start_up_retry_time", i + 1).apply();
        isCollectByTryTime = true;
        FDIOMonitor.monitorCollectReason("collect_time");
        return true;
    }

    public static synchronized void stop(final boolean z) {
        synchronized (FDIOLaunchWrapper.class) {
            if (isStart) {
                Trace.beginSection("stop_fdio");
                Jato.getWorkExecutorService().execute(new Runnable() {
                    /* class com.bytedance.common.jato.fdio.launch.FDIOLaunchWrapper.RunnableC36182 */

                    public void run() {
                        if (z && FDIOLaunchWrapper.isCollectByTryTime) {
                            SharedPreferences sp = SpUtils.getSp();
                            sp.edit().putInt("start_up_retry_time", sp.getInt("start_up_retry_time", 0) - 1).apply();
                        }
                        Jato.endFDIOOperator("jato_start_up_default_2", z);
                    }
                });
                isStart = false;
                Trace.endSection();
            }
        }
    }

    private static String findOdexPath(String str) {
        if (!Process.is64Bit()) {
            String str2 = str + "/oat/arm/base.odex";
            if (new File(str2).exists()) {
                return str2;
            }
            String str3 = str + "/oat/x86/base.odex";
            if (new File(str3).exists()) {
                return str3;
            }
            return "";
        }
        String str4 = str + "/oat/arm64/base.odex";
        if (new File(str4).exists()) {
            return str4;
        }
        String str5 = str + "/oat/x86_64/base.odex";
        if (new File(str5).exists()) {
            return str5;
        }
        return "";
    }
}

package com.ss.android.lark.monitor.app;

import android.os.Debug;
import com.C1711a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48246q;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public class NativeMonitor {
    private static ExecutorService fixThreadPool = CoreThreadPool.getDefault().getFixedThreadPool();
    public static List<C48246q.AbstractC48247a> listeners = new CopyOnWriteArrayList();
    private static float s_AppCpu;
    private static boolean s_bInitSuccess;
    private static NativeMonitor s_nativeMonitor;
    private boolean mEnableAppCpuChangeMonitor;

    private native String getAppCpuExceptionUseRecordN();

    private native String getAppCpuUsageN();

    private native String getAppUseOneMinuteCpuN();

    private native boolean initN(String str, String str2, long j, long j2);

    private native String setAndGetAppMemN(long j, long j2, long j3);

    private native void setAppStatusN(boolean z);

    private native void setCpuExceptionStandardN(long j, long j2, long j3);

    private native void setVcStatusN(boolean z);

    public native void setEnableAppCpuChangeMonitorN(boolean z);

    public static NativeMonitor getInstance() {
        if (s_nativeMonitor == null) {
            s_nativeMonitor = new NativeMonitor();
        }
        return s_nativeMonitor;
    }

    public String getAppCpuExceptionUseRecord() {
        if (!s_bInitSuccess) {
            Log.m165383e("NativeMonitor", "appmonitor not init success");
            return null;
        }
        String appCpuExceptionUseRecordN = getAppCpuExceptionUseRecordN();
        Log.m165389i("NativeMonitor", "getAppCpuExceptionUseRecord is " + appCpuExceptionUseRecordN);
        return appCpuExceptionUseRecordN;
    }

    public String getAppCpuUsage() {
        if (!s_bInitSuccess) {
            Log.m165383e("NativeMonitor", "appmonitor not init success");
            return null;
        }
        String appCpuUsageN = getAppCpuUsageN();
        Log.m165389i("NativeMonitor", "getAppCpuUsage is " + appCpuUsageN);
        return appCpuUsageN;
    }

    public String getAppUseOneMinuteCpu() {
        if (!s_bInitSuccess) {
            Log.m165383e("NativeMonitor", "appmonitor not init success");
            return null;
        }
        String appUseOneMinuteCpuN = getAppUseOneMinuteCpuN();
        Log.m165389i("NativeMonitor", "getAppUseOneMinuteCpu is " + appUseOneMinuteCpuN);
        return appUseOneMinuteCpuN;
    }

    public static void addAppCpuChangeListener(C48246q.AbstractC48247a aVar) {
        if (!listeners.contains(aVar)) {
            listeners.add(aVar);
        }
    }

    public static void removeAppCpuChangeListener(C48246q.AbstractC48247a aVar) {
        if (listeners.contains(aVar)) {
            listeners.remove(aVar);
        }
    }

    public void setEnableAppCpuChangeMonitor(boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = s_bInitSuccess;
            this.mEnableAppCpuChangeMonitor = z;
        }
        if (z2) {
            setEnableAppCpuChangeMonitorN(z);
        }
    }

    public void setVcStatus(boolean z) {
        Log.m165389i("NativeMonitor", "setVcStatus bInUsing is " + z);
        setVcStatusN(z);
    }

    public static void updateAppCpu(final float f) {
        ExecutorService executorService;
        Log.m165379d("NativeMonitor", "updateAppCpu newAppCpu is " + f);
        s_AppCpu = f;
        if (listeners.size() > 0 && (executorService = fixThreadPool) != null) {
            executorService.execute(new Runnable() {
                /* class com.ss.android.lark.monitor.app.NativeMonitor.RunnableC482151 */

                public void run() {
                    for (C48246q.AbstractC48247a aVar : NativeMonitor.listeners) {
                        aVar.mo103071a(f);
                    }
                }
            });
        }
    }

    public String setAndGetAppMem(Debug.MemoryInfo memoryInfo) {
        if (!s_bInitSuccess) {
            Log.m165383e("NativeMonitor", "appmonitor not init success");
            return null;
        }
        String andGetAppMemN = setAndGetAppMemN((long) memoryInfo.dalvikPss, (long) memoryInfo.nativePss, (long) memoryInfo.getTotalPss());
        Log.m165389i("NativeMonitor", "setAndGetAppMem is " + andGetAppMemN);
        return andGetAppMemN;
    }

    public void setAppStatus(boolean z) {
        if (!s_bInitSuccess) {
            Log.m165383e("NativeMonitor", "appmonitor not init success");
            return;
        }
        Log.m165389i("NativeMonitor", "setAppStatus bFront is " + z);
        setAppStatusN(z);
    }

    private long getProcRecordIndex(String str) {
        if (str.equalsIgnoreCase("main")) {
            return 0;
        }
        if (str.equalsIgnoreCase("p0")) {
            return 1;
        }
        if (str.equalsIgnoreCase("wschannel")) {
            return 2;
        }
        if (str.equalsIgnoreCase("miniapp0")) {
            return 3;
        }
        if (str.equalsIgnoreCase("miniapp1")) {
            return 4;
        }
        if (str.equalsIgnoreCase("miniapp2")) {
            return 5;
        }
        if (str.equalsIgnoreCase("miniapp3")) {
            return 6;
        }
        if (str.equalsIgnoreCase("miniapp4")) {
            return 7;
        }
        if (str.equalsIgnoreCase("sandboxed_process1")) {
            return 8;
        }
        if (str.equalsIgnoreCase("sandboxed_process2")) {
            return 9;
        }
        if (str.equalsIgnoreCase("sandboxed_process3")) {
            return 10;
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public boolean initLarkMonitorLib(String str, String str2) {
        long procRecordIndex = getProcRecordIndex(str2);
        if (procRecordIndex == Long.MAX_VALUE) {
            Log.m165383e("NativeMonitor", "allocate procRecordIndex falied! procName is " + str2);
            return false;
        }
        boolean initN = initN(str, str2, procRecordIndex, 12);
        if (!initN) {
            Log.m165383e("NativeMonitor", "init larkMonitor failed");
        }
        return initN;
    }

    public synchronized boolean init(String str, String str2) {
        Log.m165379d("NativeMonitor", "init, begin init bRet = " + false);
        if (s_bInitSuccess) {
            Log.m165379d("NativeMonitor", "appmonitor.so have already inited ");
            return false;
        }
        C1711a.m7628a("appmonitor");
        boolean initLarkMonitorLib = initLarkMonitorLib(str, str2);
        if (initLarkMonitorLib) {
            s_bInitSuccess = true;
            Log.m165379d("NativeMonitor", "init, success");
            setEnableAppCpuChangeMonitorN(this.mEnableAppCpuChangeMonitor);
        }
        return initLarkMonitorLib;
    }

    public void setCpuExceptionStandard(long j, long j2, long j3) {
        setCpuExceptionStandardN(j, j2, j3);
    }
}

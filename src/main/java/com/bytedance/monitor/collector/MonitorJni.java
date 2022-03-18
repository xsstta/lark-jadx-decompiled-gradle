package com.bytedance.monitor.collector;

public class MonitorJni {
    static native void disableBinderHook();

    static native void doCloseLockStackTrace();

    static native void doCollect();

    static native void doDestroy();

    static native void doDisableAtrace();

    static native String doDumpAtrace();

    static native String doDumpAtraceRange(long j, long j2);

    static native void doDumpAtraceRangeToALog(long j, long j2);

    static native void doEnableAtrace(int i, long j);

    static native void doEnableLock();

    static native long doGetCpuTime(int i);

    static native String doGetSchedInfo(int i);

    static native void doInit();

    static native void doOpenLockStackTrace();

    static native void doStart();

    static native void doStop();

    static native void dumpProcInfoTimeRangeToALog(long j, long j2);

    static native void enableBinderHook();

    static native String getProcInfoTimeRange(long j, long j2);

    static native String getProcInfos();

    static native void keepProcHyperOpen(boolean z);

    static native void setAlogInstance(long j);

    static native void setBufferSize(int i);

    static native void startHyperMonitor();

    static native void stopHyperMonitor();
}

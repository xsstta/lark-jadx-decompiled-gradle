package com.bytedance.crash;

public interface IOOMCallback {
    void onCrash(CrashType crashType, Throwable th, Thread thread, long j);
}

package com.bytedance.crash;

public interface ICrashCallback {
    void onCrash(CrashType crashType, String str, Thread thread);
}

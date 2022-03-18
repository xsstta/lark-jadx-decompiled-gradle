package com.bytedance.crash;

public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable th, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}

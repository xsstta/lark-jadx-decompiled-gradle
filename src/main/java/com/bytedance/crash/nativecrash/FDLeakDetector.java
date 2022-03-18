package com.bytedance.crash.nativecrash;

import java.util.concurrent.atomic.AtomicBoolean;

public class FDLeakDetector {

    /* renamed from: a */
    private static final AtomicBoolean f11643a = new AtomicBoolean();

    private static native void doSetAddrs(long j, long j2);

    private static native void doStartDetect(String str);
}

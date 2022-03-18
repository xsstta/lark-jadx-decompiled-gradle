package com.bytedance.platform.godzilla.sysopt;

import com.C1711a;

public class PthreadCreateHook {
    public static native void end();

    public static native void start(int i);

    private PthreadCreateHook() {
    }

    static {
        C1711a.m7628a("godzilla-sysopt");
    }
}

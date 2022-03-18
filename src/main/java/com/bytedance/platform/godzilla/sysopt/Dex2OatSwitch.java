package com.bytedance.platform.godzilla.sysopt;

import com.C1711a;

public class Dex2OatSwitch {
    public static native boolean setDex2OatEnabled(boolean z, int i);

    private Dex2OatSwitch() {
    }

    static {
        C1711a.m7628a("godzilla-sysopt");
    }
}

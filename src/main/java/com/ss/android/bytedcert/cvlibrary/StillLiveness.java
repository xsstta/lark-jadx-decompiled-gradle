package com.ss.android.bytedcert.cvlibrary;

import com.C1711a;

public class StillLiveness {
    public native int native_SL_CreateHandler(String str, String str2);

    public native int native_SL_DoPredict(byte[] bArr, int i, int i2, int i3, int i4, int i5);

    public native int native_SL_ReleaseHandle();

    static {
        try {
            C1711a.m7628a("smash");
            System.err.println("FaceLivess: library load!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("WARNING: FaceLivess Could not load library!");
            System.err.print(e);
        }
    }
}

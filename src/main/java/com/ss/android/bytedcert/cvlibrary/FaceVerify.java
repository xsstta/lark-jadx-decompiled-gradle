package com.ss.android.bytedcert.cvlibrary;

import com.C1711a;

public class FaceVerify {
    public native int native_FV_AddOri(byte[] bArr, int i, int i2, int i3, int i4, int i5);

    public native int native_FV_CreateHandler(String str, String str2);

    public native int native_FV_ReleaseHandle();

    public native int native_FV_Verify(byte[] bArr, int i, int i2, int i3, int i4, int i5);

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

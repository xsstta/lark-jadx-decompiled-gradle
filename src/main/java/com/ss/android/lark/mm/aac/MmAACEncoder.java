package com.ss.android.lark.mm.aac;

import com.C1711a;

public class MmAACEncoder {
    public native byte[] Enc(byte[] bArr);

    public native int Init(int i, int i2, short s, short s2);

    public native int Uninit();

    static {
        C1711a.m7628a("VoAACEncoder");
    }
}

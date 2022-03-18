package com.ss.android.ttve.common;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class TECloudCtrlInvoker {
    private native int nativeVerifyJson(byte[] bArr, byte[] bArr2);

    static {
        TENativeLibsLoader.m234143a();
    }

    /* renamed from: a */
    public boolean mo205511a(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty() || nativeVerifyJson(str.getBytes(), str2.getBytes()) != 0) {
            return false;
        }
        return true;
    }
}

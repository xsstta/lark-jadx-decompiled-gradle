package com.lynx.tasm.core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ResourceLoader {
    private native void nativeConfigLynxResourceSetting();

    /* renamed from: a */
    private byte[] m97711a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        if (r4 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        if (r4 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0139 A[SYNTHETIC, Splitter:B:67:0x0139] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] loadJSSource(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.core.ResourceLoader.loadJSSource(java.lang.String):byte[]");
    }
}

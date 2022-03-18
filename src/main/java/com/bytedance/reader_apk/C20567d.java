package com.bytedance.reader_apk;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.bytedance.reader_apk.d */
public final class C20567d {
    /* renamed from: a */
    private static byte[] m74900a(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(array, byteBuffer.position() + arrayOffset, arrayOffset + byteBuffer.limit());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0043, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f A[SYNTHETIC, Splitter:B:20:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036 A[SYNTHETIC, Splitter:B:24:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003e A[SYNTHETIC, Splitter:B:32:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[ExcHandler: SignatureNotFoundException (unused com.bytedance.reader_apk.SignatureNotFoundException), SYNTHETIC, Splitter:B:10:0x001f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.Integer, java.nio.ByteBuffer> m74899a(java.io.File r3) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x003a, all -> 0x002a }
            java.lang.String r2 = "r"
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x003a, all -> 0x002a }
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            com.bytedance.reader_apk.b r2 = com.bytedance.reader_apk.C20563a.m74888c(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0023 }
            java.lang.Object r2 = r2.mo69211a()     // Catch:{ IOException -> 0x003c, all -> 0x0023 }
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ IOException -> 0x003c, all -> 0x0023 }
            java.util.Map r0 = com.bytedance.reader_apk.C20563a.m74884a(r2)     // Catch:{ IOException -> 0x003c, all -> 0x0023 }
            if (r3 == 0) goto L_0x001f
            r3.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r1.close()     // Catch:{ SignatureNotFoundException -> 0x0046, SignatureNotFoundException -> 0x0046 }
            goto L_0x0046
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r0
            goto L_0x002d
        L_0x0028:
            r3 = r0
            goto L_0x003c
        L_0x002a:
            r2 = move-exception
            r3 = r0
            r1 = r3
        L_0x002d:
            if (r3 == 0) goto L_0x0034
            r3.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r2
        L_0x003a:
            r3 = r0
            r1 = r3
        L_0x003c:
            if (r3 == 0) goto L_0x0043
            r3.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            goto L_0x001f
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.reader_apk.C20567d.m74899a(java.io.File):java.util.Map");
    }

    /* renamed from: a */
    public static String[] m74901a(File file, int[] iArr) {
        byte[][] b = m74902b(file, iArr);
        if (b == null) {
            return null;
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            try {
                if (b[i] != null) {
                    strArr[i] = new String(b[i], "UTF-8");
                } else {
                    strArr[i] = "";
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return strArr;
    }

    /* renamed from: b */
    public static byte[][] m74902b(File file, int[] iArr) {
        Map<Integer, ByteBuffer> a = m74899a(file);
        if (a == null || iArr.length <= 0) {
            return null;
        }
        byte[][] bArr = new byte[iArr.length][];
        for (int i = 0; i < iArr.length; i++) {
            ByteBuffer byteBuffer = a.get(Integer.valueOf(iArr[i]));
            if (byteBuffer != null) {
                bArr[i] = m74900a(byteBuffer);
            }
        }
        return bArr;
    }
}

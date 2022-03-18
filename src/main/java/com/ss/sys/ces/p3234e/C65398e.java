package com.ss.sys.ces.p3234e;

import java.io.BufferedInputStream;

/* renamed from: com.ss.sys.ces.e.e */
public class C65398e {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        if (r8.length() == 0) goto L_0x00b3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m256471a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.p3234e.C65398e.m256471a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static String m256472a(BufferedInputStream bufferedInputStream) {
        int read;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r1 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0074, code lost:
        if (r1 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0076, code lost:
        r1.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062 A[SYNTHETIC, Splitter:B:33:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[SYNTHETIC, Splitter:B:38:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082 A[SYNTHETIC, Splitter:B:49:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008c A[SYNTHETIC, Splitter:B:54:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m256473a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.p3234e.C65398e.m256473a(java.lang.String):java.lang.String");
    }
}

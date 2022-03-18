package com.ss.android.ugc.effectmanager.common.p3053h;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.o */
public class C60536o {

    /* renamed from: a */
    protected static char[] f151361a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m235319a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094 A[SYNTHETIC, Splitter:B:26:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a A[SYNTHETIC, Splitter:B:31:0x009a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m235318a(java.io.File r7, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.p3053h.C60536o.m235318a(java.io.File, com.ss.android.ugc.effectmanager.common.e.b):java.lang.String");
    }
}

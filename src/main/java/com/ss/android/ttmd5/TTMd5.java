package com.ss.android.ttmd5;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.MessageDigest;
import java.util.Objects;

public class TTMd5 {

    /* renamed from: a */
    private static final char[] f150174a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Retention(RetentionPolicy.SOURCE)
    public @interface CHECK_MD5_STATUS {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttmd5.TTMd5$a */
    public static class C60174a {

        /* renamed from: a */
        public int f150175a;

        /* renamed from: b */
        public int f150176b;

        /* renamed from: c */
        public int f150177c;

        /* renamed from: d */
        public long f150178d;

        /* renamed from: e */
        public String f150179e;

        private C60174a() {
        }
    }

    /* renamed from: a */
    private static String m233893a(long j) {
        return Long.toHexString((j << 4) + 31);
    }

    /* renamed from: b */
    private static long m233898b(String str) throws RuntimeException {
        try {
            return (Long.parseLong(str, 16) - 31) >> 4;
        } catch (Throwable unused) {
            throw new RuntimeException("ttmd5 decryptNum error, num = " + str);
        }
    }

    /* renamed from: a */
    private static C60174a m233891a(String str) throws Exception {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] split = str.split(";");
        String[] split2 = split[0].split(":");
        C60174a aVar = new C60174a();
        aVar.f150175a = Integer.parseInt(split2[1]);
        if (aVar.f150175a > 1) {
            return aVar;
        }
        aVar.f150176b = Integer.parseInt(split2[2]);
        String[] split3 = split2[3].split("g");
        aVar.f150177c = (int) m233898b(split3[0]);
        aVar.f150178d = m233898b(split3[1]);
        aVar.f150179e = split[1];
        return aVar;
    }

    /* renamed from: a */
    private static String m233896a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        int length = bArr.length;
        int i = length * 2;
        char[] cArr = new char[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = bArr[i3 + 0] & 255;
            int i5 = i2 + 1;
            char[] cArr2 = f150174a;
            cArr[i2] = cArr2[i4 >> 4];
            i2 = i5 + 1;
            cArr[i5] = cArr2[i4 & 15];
        }
        return new String(cArr, 0, i);
    }

    /* renamed from: a */
    private static String m233892a(int i, long j) {
        return "ttmd5:1:1:" + m233893a((long) i) + "g" + m233893a(j);
    }

    /* renamed from: a */
    public static int m233890a(String str, File file) {
        String str2;
        if (str == null || str.length() == 0) {
            return 2;
        }
        if (file == null) {
            return 5;
        }
        try {
            if (!file.exists()) {
                return 5;
            }
            int i = -1;
            long j = -1;
            try {
                C60174a a = m233891a(str);
                if (a != null) {
                    if (a.f150175a > 1) {
                        return 3;
                    }
                    i = a.f150177c;
                    j = a.f150178d;
                }
                C60174a aVar = null;
                try {
                    str2 = m233895a(file, i, j);
                } catch (Throwable th) {
                    th.printStackTrace();
                    str2 = null;
                }
                if (str2 == null || str2.length() == 0) {
                    return 6;
                }
                if (a == null || (a.f150175a == 1 && a.f150176b == 1)) {
                    if (str2.equals(str)) {
                        return 0;
                    }
                } else if (a.f150179e != null) {
                    try {
                        aVar = m233891a(str2);
                    } catch (Throwable unused) {
                    }
                    if (aVar == null || a.f150177c != aVar.f150177c || a.f150178d != aVar.f150178d || !a.f150179e.equals(aVar.f150179e)) {
                        return 1;
                    }
                    return 0;
                }
                return 1;
            } catch (Throwable unused2) {
                return 4;
            }
        } catch (Throwable unused3) {
            return 99;
        }
    }

    /* renamed from: a */
    private static String m233895a(File file, int i, long j) throws Exception {
        return m233894a(new C60175a(file), i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[Catch:{ all -> 0x009c, all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[Catch:{ all -> 0x009c, all -> 0x00a0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m233894a(com.ss.android.ttmd5.AbstractC60176b r21, int r22, long r23) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttmd5.TTMd5.m233894a(com.ss.android.ttmd5.b, int, long):java.lang.String");
    }

    /* renamed from: a */
    private static void m233897a(AbstractC60176b bVar, MessageDigest messageDigest, byte[] bArr, long j, long j2) throws IOException {
        bVar.mo205494a(j, j2);
        long j3 = 0;
        while (j3 < j2) {
            int a = bVar.mo205492a(bArr, 0, (int) Math.min(j2 - j3, (long) bArr.length));
            if (a > 0) {
                messageDigest.update(bArr, 0, a);
                j3 += (long) a;
            } else {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + a + ", readTotalCount = " + j3 + ", sampleSize = " + j2);
            }
        }
    }
}

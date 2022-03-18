package com.larksuite.framework.utils;

import java.security.SecureRandom;
import java.util.UUID;

public class ao {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f64856a = new ThreadLocal<>();

    /* renamed from: a */
    public static UUID m95038a() {
        ThreadLocal<SecureRandom> threadLocal = f64856a;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        bArr[6] = (byte) (bArr[6] & 15);
        bArr[6] = (byte) (bArr[6] | 64);
        bArr[8] = (byte) (bArr[8] & 63);
        bArr[8] = (byte) (bArr[8] | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return new UUID(j2, j);
    }
}

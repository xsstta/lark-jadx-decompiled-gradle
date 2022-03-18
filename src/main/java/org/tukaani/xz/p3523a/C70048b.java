package org.tukaani.xz.p3523a;

import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: org.tukaani.xz.a.b */
public class C70048b extends AbstractC70049c {

    /* renamed from: c */
    private static final long[] f175073c = new long[DynamicModule.f58006b];

    /* renamed from: d */
    private long f175074d = -1;

    static {
        for (int i = 0; i < f175073c.length; i++) {
            long j = (long) i;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1));
                j >>>= 1;
                if (i3 == 0) {
                    j ^= -3932672073523589310L;
                }
            }
            f175073c[i] = j;
        }
    }

    public C70048b() {
        this.f175075a = 8;
        this.f175076b = "CRC64";
    }

    @Override // org.tukaani.xz.p3523a.AbstractC70049c
    /* renamed from: a */
    public void mo246723a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            long[] jArr = f175073c;
            int i4 = i + 1;
            byte b = bArr[i];
            long j = this.f175074d;
            this.f175074d = (j >>> 8) ^ jArr[(b ^ ((int) j)) & 255];
            i = i4;
        }
    }

    @Override // org.tukaani.xz.p3523a.AbstractC70049c
    /* renamed from: a */
    public byte[] mo246724a() {
        long j = ~this.f175074d;
        this.f175074d = -1;
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) (j >> (i * 8)));
        }
        return bArr;
    }
}

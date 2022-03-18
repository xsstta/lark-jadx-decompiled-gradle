package org.tukaani.xz.p3523a;

import java.util.zip.CRC32;

/* renamed from: org.tukaani.xz.a.a */
public class C70047a extends AbstractC70049c {

    /* renamed from: c */
    private final CRC32 f175072c = new CRC32();

    public C70047a() {
        this.f175075a = 4;
        this.f175076b = "CRC32";
    }

    @Override // org.tukaani.xz.p3523a.AbstractC70049c
    /* renamed from: a */
    public void mo246723a(byte[] bArr, int i, int i2) {
        this.f175072c.update(bArr, i, i2);
    }

    @Override // org.tukaani.xz.p3523a.AbstractC70049c
    /* renamed from: a */
    public byte[] mo246724a() {
        long value = this.f175072c.getValue();
        byte[] bArr = {(byte) ((int) value), (byte) ((int) (value >>> 8)), (byte) ((int) (value >>> 16)), (byte) ((int) (value >>> 24))};
        this.f175072c.reset();
        return bArr;
    }
}

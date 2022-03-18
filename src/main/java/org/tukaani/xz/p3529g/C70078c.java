package org.tukaani.xz.p3529g;

import java.io.DataInputStream;
import java.io.IOException;
import org.tukaani.xz.C70046a;
import org.tukaani.xz.CorruptedInputException;

/* renamed from: org.tukaani.xz.g.c */
public final class C70078c extends AbstractC70077b {

    /* renamed from: c */
    private final byte[] f175148c;

    /* renamed from: d */
    private int f175149d;

    public C70078c(int i, C70046a aVar) {
        byte[] a = aVar.mo246722a(i - 5, false);
        this.f175148c = a;
        this.f175149d = a.length;
    }

    @Override // org.tukaani.xz.p3529g.AbstractC70077b
    /* renamed from: a */
    public void mo246780a() throws IOException {
        if ((this.f175146a & -16777216) == 0) {
            try {
                byte[] bArr = this.f175148c;
                int i = this.f175149d;
                this.f175149d = i + 1;
                this.f175147b = (this.f175147b << 8) | (bArr[i] & 255);
                this.f175146a <<= 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new CorruptedInputException();
            }
        }
    }

    /* renamed from: a */
    public void mo246783a(DataInputStream dataInputStream, int i) throws IOException {
        if (i < 5) {
            throw new CorruptedInputException();
        } else if (dataInputStream.readUnsignedByte() == 0) {
            this.f175147b = dataInputStream.readInt();
            this.f175146a = -1;
            int i2 = i - 5;
            byte[] bArr = this.f175148c;
            int length = bArr.length - i2;
            this.f175149d = length;
            dataInputStream.readFully(bArr, length, i2);
        } else {
            throw new CorruptedInputException();
        }
    }

    /* renamed from: a */
    public void mo246784a(C70046a aVar) {
        aVar.mo246721a(this.f175148c);
    }

    /* renamed from: b */
    public boolean mo246785b() {
        return this.f175149d == this.f175148c.length && this.f175147b == 0;
    }
}

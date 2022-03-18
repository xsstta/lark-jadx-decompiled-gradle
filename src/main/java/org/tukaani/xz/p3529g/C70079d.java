package org.tukaani.xz.p3529g;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.CorruptedInputException;

/* renamed from: org.tukaani.xz.g.d */
public final class C70079d extends AbstractC70077b {

    /* renamed from: c */
    private final DataInputStream f175150c;

    public C70079d(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f175150c = dataInputStream;
        if (dataInputStream.readUnsignedByte() == 0) {
            this.f175147b = dataInputStream.readInt();
            this.f175146a = -1;
            return;
        }
        throw new CorruptedInputException();
    }

    @Override // org.tukaani.xz.p3529g.AbstractC70077b
    /* renamed from: a */
    public void mo246780a() throws IOException {
        if ((this.f175146a & -16777216) == 0) {
            this.f175147b = (this.f175147b << 8) | this.f175150c.readUnsignedByte();
            this.f175146a <<= 8;
        }
    }

    /* renamed from: b */
    public boolean mo246786b() {
        return this.f175147b == 0;
    }
}

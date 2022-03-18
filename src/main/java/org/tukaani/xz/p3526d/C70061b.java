package org.tukaani.xz.p3526d;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import org.tukaani.xz.CorruptedInputException;
import org.tukaani.xz.XZIOException;
import org.tukaani.xz.p3523a.AbstractC70049c;
import org.tukaani.xz.p3523a.C70047a;
import org.tukaani.xz.p3523a.C70051e;
import org.tukaani.xz.p3524b.C70053a;

/* renamed from: org.tukaani.xz.d.b */
public class C70061b extends AbstractC70060a {

    /* renamed from: e */
    private AbstractC70049c f175104e;

    public C70061b() {
        super(new CorruptedInputException());
        try {
            this.f175104e = new C70051e();
        } catch (NoSuchAlgorithmException unused) {
            this.f175104e = new C70047a();
        }
    }

    @Override // org.tukaani.xz.p3526d.AbstractC70060a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ long mo246740a() {
        return super.mo246740a();
    }

    @Override // org.tukaani.xz.p3526d.AbstractC70060a
    /* renamed from: a */
    public void mo246741a(long j, long j2) throws XZIOException {
        super.mo246741a(j, j2);
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        this.f175104e.mo246725a(allocate.array());
    }

    /* renamed from: a */
    public void mo246744a(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (C70053a.m268761a(checkedInputStream) == this.f175102d) {
            C70061b bVar = new C70061b();
            for (long j = 0; j < this.f175102d; j++) {
                try {
                    bVar.mo246741a(C70053a.m268761a(checkedInputStream), C70053a.m268761a(checkedInputStream));
                    if (bVar.f175099a > this.f175099a || bVar.f175100b > this.f175100b || bVar.f175101c > this.f175101c) {
                        throw new CorruptedInputException("XZ Index is corrupt");
                    }
                } catch (XZIOException unused) {
                    throw new CorruptedInputException("XZ Index is corrupt");
                }
            }
            if (bVar.f175099a == this.f175099a && bVar.f175100b == this.f175100b && bVar.f175101c == this.f175101c && Arrays.equals(bVar.f175104e.mo246724a(), this.f175104e.mo246724a())) {
                DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
                for (int c = mo246743c(); c > 0; c--) {
                    if (dataInputStream.readUnsignedByte() != 0) {
                        throw new CorruptedInputException("XZ Index is corrupt");
                    }
                }
                long value = crc32.getValue();
                for (int i = 0; i < 4; i++) {
                    if (((value >>> (i * 8)) & 255) != ((long) dataInputStream.readUnsignedByte())) {
                        throw new CorruptedInputException("XZ Index is corrupt");
                    }
                }
                return;
            }
            throw new CorruptedInputException("XZ Index is corrupt");
        }
        throw new CorruptedInputException("XZ Block Header or the start of XZ Index is corrupt");
    }

    @Override // org.tukaani.xz.p3526d.AbstractC70060a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ long mo246742b() {
        return super.mo246742b();
    }
}

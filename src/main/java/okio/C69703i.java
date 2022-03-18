package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: okio.i */
public final class C69703i implements AbstractC69723u {

    /* renamed from: a */
    private int f174127a;

    /* renamed from: b */
    private final AbstractC69699e f174128b;

    /* renamed from: c */
    private final Inflater f174129c;

    /* renamed from: d */
    private final C69704j f174130d;

    /* renamed from: e */
    private final CRC32 f174131e = new CRC32();

    @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f174130d.close();
    }

    @Override // okio.AbstractC69723u
    public C69724v timeout() {
        return this.f174128b.timeout();
    }

    /* renamed from: b */
    private void m267586b() throws IOException {
        m267584a("CRC", this.f174128b.readIntLe(), (int) this.f174131e.getValue());
        m267584a("ISIZE", this.f174128b.readIntLe(), (int) this.f174129c.getBytesWritten());
    }

    /* renamed from: a */
    private void m267583a() throws IOException {
        boolean z;
        this.f174128b.require(10);
        byte a = this.f174128b.buffer().mo244508a(3L);
        if (((a >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m267585a(this.f174128b.buffer(), 0, 10);
        }
        m267584a("ID1ID2", 8075, this.f174128b.readShort());
        this.f174128b.skip(8);
        if (((a >> 2) & 1) == 1) {
            this.f174128b.require(2);
            if (z) {
                m267585a(this.f174128b.buffer(), 0, 2);
            }
            long readShortLe = (long) this.f174128b.buffer().readShortLe();
            this.f174128b.require(readShortLe);
            if (z) {
                m267585a(this.f174128b.buffer(), 0, readShortLe);
            }
            this.f174128b.skip(readShortLe);
        }
        if (((a >> 3) & 1) == 1) {
            long indexOf = this.f174128b.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z) {
                    m267585a(this.f174128b.buffer(), 0, indexOf + 1);
                }
                this.f174128b.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((a >> 4) & 1) == 1) {
            long indexOf2 = this.f174128b.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z) {
                    m267585a(this.f174128b.buffer(), 0, indexOf2 + 1);
                }
                this.f174128b.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m267584a("FHCRC", this.f174128b.readShortLe(), (short) ((int) this.f174131e.getValue()));
            this.f174131e.reset();
        }
    }

    public C69703i(AbstractC69723u uVar) {
        if (uVar != null) {
            Inflater inflater = new Inflater(true);
            this.f174129c = inflater;
            AbstractC69699e a = C69705k.m267590a(uVar);
            this.f174128b = a;
            this.f174130d = new C69704j(a, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // okio.AbstractC69723u
    public long read(C69694c cVar, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f174127a == 0) {
                m267583a();
                this.f174127a = 1;
            }
            if (this.f174127a == 1) {
                long j2 = cVar.f174116b;
                long read = this.f174130d.read(cVar, j);
                if (read != -1) {
                    m267585a(cVar, j2, read);
                    return read;
                }
                this.f174127a = 2;
            }
            if (this.f174127a == 2) {
                m267586b();
                this.f174127a = 3;
                if (!this.f174128b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    private void m267584a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    private void m267585a(C69694c cVar, long j, long j2) {
        C69719q qVar = cVar.f174115a;
        while (j >= ((long) (qVar.f174169c - qVar.f174168b))) {
            j -= (long) (qVar.f174169c - qVar.f174168b);
            qVar = qVar.f174172f;
        }
        while (j2 > 0) {
            int i = (int) (((long) qVar.f174168b) + j);
            int min = (int) Math.min((long) (qVar.f174169c - i), j2);
            this.f174131e.update(qVar.f174167a, i, min);
            j2 -= (long) min;
            qVar = qVar.f174172f;
            j = 0;
        }
    }
}

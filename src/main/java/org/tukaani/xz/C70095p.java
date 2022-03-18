package org.tukaani.xz;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.p3527e.C70063a;
import org.tukaani.xz.p3528f.C70069b;
import org.tukaani.xz.p3529g.C70079d;

/* renamed from: org.tukaani.xz.p */
public class C70095p extends InputStream {

    /* renamed from: a */
    static final /* synthetic */ boolean f175185a = true;

    /* renamed from: b */
    private InputStream f175186b;

    /* renamed from: c */
    private C70046a f175187c;

    /* renamed from: d */
    private C70063a f175188d;

    /* renamed from: e */
    private C70079d f175189e;

    /* renamed from: f */
    private C70069b f175190f;

    /* renamed from: g */
    private boolean f175191g;

    /* renamed from: h */
    private final byte[] f175192h;

    /* renamed from: i */
    private long f175193i;

    /* renamed from: j */
    private IOException f175194j;

    public C70095p(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, C70046a.m268740a());
    }

    public C70095p(InputStream inputStream, int i, C70046a aVar) throws IOException {
        this.f175192h = new byte[1];
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte readByte = dataInputStream.readByte();
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 |= dataInputStream.readUnsignedByte() << (i3 * 8);
        }
        long j = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            j |= ((long) dataInputStream.readUnsignedByte()) << (i4 * 8);
        }
        int a = m268858a(i2, readByte);
        if (i == -1 || a <= i) {
            m268861a(inputStream, j, readByte, i2, null, aVar);
            return;
        }
        throw new MemoryLimitException(a, i);
    }

    /* renamed from: a */
    private static int m268857a(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & -16;
    }

    /* renamed from: a */
    public static int m268858a(int i, byte b) throws UnsupportedOptionsException, CorruptedInputException {
        if (i < 0 || i > 2147483632) {
            throw new UnsupportedOptionsException("LZMA dictionary is too big for this implementation");
        }
        int i2 = b & 255;
        if (i2 <= 224) {
            int i3 = i2 % 45;
            int i4 = i3 / 9;
            return m268859a(i, i3 - (i4 * 9), i4);
        }
        throw new CorruptedInputException("Invalid LZMA properties byte");
    }

    /* renamed from: a */
    public static int m268859a(int i, int i2, int i3) {
        if (i2 >= 0 && i2 <= 8 && i3 >= 0 && i3 <= 4) {
            return (m268857a(i) / 1024) + 10 + ((1536 << (i2 + i3)) / 1024);
        }
        throw new IllegalArgumentException("Invalid lc or lp");
    }

    /* renamed from: a */
    private void m268860a() {
        C70063a aVar = this.f175188d;
        if (aVar != null) {
            aVar.mo246752a(this.f175187c);
            this.f175188d = null;
        }
    }

    /* renamed from: a */
    private void m268861a(InputStream inputStream, long j, byte b, int i, byte[] bArr, C70046a aVar) throws IOException {
        if (j >= -1) {
            int i2 = b & 255;
            if (i2 <= 224) {
                int i3 = i2 / 45;
                int i4 = i2 - ((i3 * 9) * 5);
                int i5 = i4 / 9;
                int i6 = i4 - (i5 * 9);
                if (i < 0 || i > 2147483632) {
                    throw new UnsupportedOptionsException("LZMA dictionary is too big for this implementation");
                }
                m268862a(inputStream, j, i6, i5, i3, i, bArr, aVar);
                return;
            }
            throw new CorruptedInputException("Invalid LZMA properties byte");
        }
        throw new UnsupportedOptionsException("Uncompressed size is too big");
    }

    /* renamed from: a */
    private void m268862a(InputStream inputStream, long j, int i, int i2, int i3, int i4, byte[] bArr, C70046a aVar) throws IOException {
        if (j < -1 || i < 0 || i > 8 || i2 < 0 || i2 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f175186b = inputStream;
        this.f175187c = aVar;
        int a = m268857a(i4);
        if (j >= 0 && ((long) a) > j) {
            a = m268857a((int) j);
        }
        this.f175188d = new C70063a(m268857a(a), bArr, aVar);
        C70079d dVar = new C70079d(inputStream);
        this.f175189e = dVar;
        this.f175190f = new C70069b(this.f175188d, dVar, i, i2, i3);
        this.f175193i = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        if (this.f175186b != null) {
            m268860a();
            try {
                this.f175186b.close();
            } finally {
                this.f175186b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175192h, 0, 1) == -1) {
            return -1;
        }
        return this.f175192h[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f175186b != null) {
            IOException iOException = this.f175194j;
            if (iOException != null) {
                throw iOException;
            } else if (this.f175191g) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        long j = this.f175193i;
                        this.f175188d.mo246749a((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                        try {
                            this.f175190f.mo246766c();
                        } catch (CorruptedInputException e) {
                            if (this.f175193i != -1 || !this.f175190f.mo246765b()) {
                                throw e;
                            }
                            this.f175191g = f175185a;
                            this.f175189e.mo246780a();
                        }
                        int a = this.f175188d.mo246746a(bArr, i);
                        i += a;
                        i2 -= a;
                        i4 += a;
                        long j2 = this.f175193i;
                        if (j2 >= 0) {
                            long j3 = j2 - ((long) a);
                            this.f175193i = j3;
                            if (!f175185a && j3 < 0) {
                                throw new AssertionError();
                            } else if (j3 == 0) {
                                this.f175191g = f175185a;
                            }
                        }
                        if (this.f175191g) {
                            if (!this.f175189e.mo246786b() || this.f175188d.mo246755c()) {
                                throw new CorruptedInputException();
                            }
                            m268860a();
                            if (i4 == 0) {
                                return -1;
                            }
                            return i4;
                        }
                    } catch (IOException e2) {
                        this.f175194j = e2;
                        throw e2;
                    }
                }
                return i4;
            }
        } else {
            throw new XZIOException("Stream closed");
        }
    }
}

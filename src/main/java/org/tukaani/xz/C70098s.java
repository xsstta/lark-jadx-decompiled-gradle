package org.tukaani.xz;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.p3523a.AbstractC70049c;
import org.tukaani.xz.p3524b.C70053a;
import org.tukaani.xz.p3524b.C70054b;
import org.tukaani.xz.p3526d.C70061b;

/* renamed from: org.tukaani.xz.s */
public class C70098s extends InputStream {

    /* renamed from: a */
    private InputStream f175205a;

    /* renamed from: b */
    private final C70046a f175206b;

    /* renamed from: c */
    private final int f175207c;

    /* renamed from: d */
    private final C70054b f175208d;

    /* renamed from: e */
    private final AbstractC70049c f175209e;

    /* renamed from: f */
    private final boolean f175210f;

    /* renamed from: g */
    private C70059d f175211g;

    /* renamed from: h */
    private final C70061b f175212h;

    /* renamed from: i */
    private boolean f175213i;

    /* renamed from: j */
    private IOException f175214j;

    /* renamed from: k */
    private final byte[] f175215k;

    public C70098s(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, true);
    }

    public C70098s(InputStream inputStream, int i, boolean z) throws IOException {
        this(inputStream, i, z, C70046a.m268740a());
    }

    public C70098s(InputStream inputStream, int i, boolean z, C70046a aVar) throws IOException {
        this(inputStream, i, z, m268866a(inputStream), aVar);
    }

    C70098s(InputStream inputStream, int i, boolean z, byte[] bArr, C70046a aVar) throws IOException {
        this.f175212h = new C70061b();
        this.f175213i = false;
        this.f175214j = null;
        this.f175215k = new byte[1];
        this.f175206b = aVar;
        this.f175205a = inputStream;
        this.f175207c = i;
        this.f175210f = z;
        C70054b a = C70053a.m268762a(bArr);
        this.f175208d = a;
        this.f175209e = AbstractC70049c.m268747a(a.f175078a);
    }

    /* renamed from: a */
    private void m268865a() throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(this.f175205a).readFully(bArr);
        C70054b b = C70053a.m268766b(bArr);
        if (!C70053a.m268764a(this.f175208d, b) || this.f175212h.mo246740a() != b.f175079b) {
            throw new CorruptedInputException("XZ Stream Footer does not match Stream Header");
        }
    }

    /* renamed from: a */
    private static byte[] m268866a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        return bArr;
    }

    /* renamed from: a */
    public void mo246803a(boolean z) throws IOException {
        if (this.f175205a != null) {
            C70059d dVar = this.f175211g;
            if (dVar != null) {
                dVar.close();
                this.f175211g = null;
            }
            if (z) {
                try {
                    this.f175205a.close();
                } catch (Throwable th) {
                    this.f175205a = null;
                    throw th;
                }
            }
            this.f175205a = null;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f175205a != null) {
            IOException iOException = this.f175214j;
            if (iOException == null) {
                C70059d dVar = this.f175211g;
                if (dVar == null) {
                    return 0;
                }
                return dVar.available();
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        mo246803a(true);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175215k, 0, 1) == -1) {
            return -1;
        }
        return this.f175215k[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f175205a != null) {
                IOException iOException = this.f175214j;
                if (iOException != null) {
                    throw iOException;
                } else if (this.f175213i) {
                    return -1;
                } else {
                    int i4 = i;
                    int i5 = i2;
                    int i6 = 0;
                    while (i5 > 0) {
                        try {
                            if (this.f175211g == null) {
                                try {
                                    this.f175211g = new C70059d(this.f175205a, this.f175209e, this.f175210f, this.f175207c, -1, -1, this.f175206b);
                                } catch (C70091l unused) {
                                    this.f175212h.mo246744a(this.f175205a);
                                    m268865a();
                                    this.f175213i = true;
                                    if (i6 > 0) {
                                        return i6;
                                    }
                                    return -1;
                                }
                            }
                            int read = this.f175211g.read(bArr, i4, i5);
                            if (read > 0) {
                                i6 += read;
                                i4 += read;
                                i5 -= read;
                            } else if (read == -1) {
                                this.f175212h.mo246741a(this.f175211g.mo246734a(), this.f175211g.mo246736b());
                                this.f175211g = null;
                            }
                        } catch (IOException e) {
                            this.f175214j = e;
                            if (i6 == 0) {
                                throw e;
                            }
                        }
                    }
                    return i6;
                }
            } else {
                throw new XZIOException("Stream closed");
            }
        }
    }
}

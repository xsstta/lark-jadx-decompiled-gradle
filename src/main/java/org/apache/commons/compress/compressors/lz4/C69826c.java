package org.apache.commons.compress.compressors.lz4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69747b;
import org.apache.commons.compress.p3493a.C69748c;
import org.apache.commons.compress.p3493a.C69750d;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.lz4.c */
public class C69826c extends AbstractC69780a {

    /* renamed from: a */
    static final byte[] f174501a = {4, 34, 77, 24};

    /* renamed from: b */
    private static final byte[] f174502b = {42, 77, 24};

    /* renamed from: c */
    private final byte[] f174503c = new byte[1];

    /* renamed from: d */
    private final C69748c.AbstractC69749a f174504d = new C69748c.AbstractC69749a() {
        /* class org.apache.commons.compress.compressors.lz4.C69826c.C698271 */

        @Override // org.apache.commons.compress.p3493a.C69748c.AbstractC69749a
        /* renamed from: a */
        public int mo244680a() throws IOException {
            return C69826c.this.mo244945b();
        }
    };

    /* renamed from: e */
    private final C69752f f174505e;

    /* renamed from: f */
    private final boolean f174506f;

    /* renamed from: g */
    private boolean f174507g;

    /* renamed from: h */
    private boolean f174508h;

    /* renamed from: i */
    private boolean f174509i;

    /* renamed from: j */
    private boolean f174510j;

    /* renamed from: k */
    private InputStream f174511k;

    /* renamed from: l */
    private boolean f174512l;

    /* renamed from: m */
    private boolean f174513m;

    /* renamed from: n */
    private final C69828d f174514n = new C69828d();

    /* renamed from: o */
    private final C69828d f174515o = new C69828d();

    /* renamed from: p */
    private byte[] f174516p;

    /* renamed from: e */
    private void m267965e() throws IOException {
        InputStream inputStream = this.f174511k;
        if (inputStream != null) {
            inputStream.close();
            this.f174511k = null;
            if (this.f174507g) {
                m267956a(this.f174515o, "block");
                this.f174515o.reset();
            }
        }
    }

    /* renamed from: f */
    private void m267966f() throws IOException {
        if (this.f174510j) {
            m267956a(this.f174514n, "content");
        }
        this.f174514n.reset();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            InputStream inputStream = this.f174511k;
            if (inputStream != null) {
                inputStream.close();
                this.f174511k = null;
            }
        } finally {
            this.f174505e.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f174503c, 0, 1) == -1) {
            return -1;
        }
        return this.f174503c[0] & 255;
    }

    /* renamed from: d */
    private void m267964d() throws IOException {
        boolean z;
        m267965e();
        long a = C69748c.m267710a(this.f174504d, 4);
        if ((-2147483648L & a) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = (int) (a & 2147483647L);
        if (i == 0) {
            m267966f();
            if (!this.f174506f) {
                this.f174512l = true;
            } else {
                m267957a(false);
            }
        } else {
            InputStream bVar = new C69747b(this.f174505e, (long) i);
            if (this.f174507g) {
                bVar = new C69750d(this.f174515o, bVar);
            }
            if (z) {
                this.f174513m = true;
                this.f174511k = bVar;
                return;
            }
            this.f174513m = false;
            C69819a aVar = new C69819a(bVar);
            if (this.f174508h) {
                aVar.mo244966a(this.f174516p);
            }
            this.f174511k = aVar;
        }
    }

    /* renamed from: c */
    private void m267963c() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        int b = mo244945b();
        if (b != -1) {
            this.f174514n.update(b);
            if ((b & 192) == 64) {
                boolean z4 = true;
                if ((b & 32) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f174508h = z;
                if (!z) {
                    this.f174516p = null;
                } else if (this.f174516p == null) {
                    this.f174516p = new byte[65536];
                }
                if ((b & 16) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f174507g = z2;
                if ((b & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f174509i = z3;
                if ((b & 4) == 0) {
                    z4 = false;
                }
                this.f174510j = z4;
                int b2 = mo244945b();
                if (b2 != -1) {
                    this.f174514n.update(b2);
                    if (this.f174509i) {
                        byte[] bArr = new byte[8];
                        int a = C69753g.m267719a(this.f174505e, bArr);
                        mo244818a(a);
                        if (8 == a) {
                            this.f174514n.update(bArr, 0, 8);
                        } else {
                            throw new IOException("Premature end of stream while reading content size");
                        }
                    }
                    int b3 = mo244945b();
                    if (b3 != -1) {
                        int value = (int) ((this.f174514n.getValue() >> 8) & 255);
                        this.f174514n.reset();
                        if (b3 != value) {
                            throw new IOException("frame header checksum mismatch.");
                        }
                        return;
                    }
                    throw new IOException("Premature end of stream while reading frame header checksum");
                }
                throw new IOException("Premature end of stream while reading frame BD byte");
            }
            throw new IOException("Unsupported version " + (b >> 6));
        }
        throw new IOException("Premature end of stream while reading frame flags");
    }

    /* renamed from: b */
    public int mo244945b() throws IOException {
        int read = this.f174505e.read();
        if (read == -1) {
            return -1;
        }
        mo244818a(1);
        return read & 255;
    }

    /* renamed from: a */
    private void m267957a(boolean z) throws IOException {
        if (m267962b(z)) {
            m267963c();
            m267964d();
        }
    }

    /* renamed from: a */
    private static boolean m267958a(byte[] bArr) {
        if ((bArr[0] & 80) != 80) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (bArr[i] != f174502b[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private int m267960b(byte[] bArr) throws IOException {
        int i = 4;
        while (i == 4 && m267958a(bArr)) {
            long a = C69748c.m267710a(this.f174504d, 4);
            long a2 = C69753g.m267721a(this.f174505e, a);
            mo244819a(a2);
            if (a == a2) {
                i = C69753g.m267719a(this.f174505e, bArr);
                mo244818a(i);
            } else {
                throw new IOException("Premature end of stream while skipping frame");
            }
        }
        return i;
    }

    /* renamed from: b */
    private boolean m267962b(boolean z) throws IOException {
        String str;
        if (z) {
            str = "Not a LZ4 frame stream";
        } else {
            str = "LZ4 frame stream followed by garbage";
        }
        byte[] bArr = new byte[4];
        int a = C69753g.m267719a(this.f174505e, bArr);
        mo244818a(a);
        if (a == 0 && !z) {
            this.f174512l = true;
            return false;
        } else if (4 == a) {
            int b = m267960b(bArr);
            if (b == 0 && !z) {
                this.f174512l = true;
                return false;
            } else if (4 == b && m267959a(bArr, 4)) {
                return true;
            } else {
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }

    public C69826c(InputStream inputStream, boolean z) throws IOException {
        this.f174505e = new C69752f(inputStream);
        this.f174506f = z;
        m267957a(true);
    }

    /* renamed from: a */
    private void m267956a(C69828d dVar, String str) throws IOException {
        byte[] bArr = new byte[4];
        int a = C69753g.m267719a(this.f174505e, bArr);
        mo244818a(a);
        if (4 != a) {
            throw new IOException("Premature end of stream while reading " + str + " checksum");
        } else if (dVar.getValue() != C69748c.m267711a(bArr)) {
            throw new IOException(str + " checksum mismatch.");
        }
    }

    /* renamed from: a */
    public static boolean m267959a(byte[] bArr, int i) {
        byte[] bArr2 = f174501a;
        if (i < bArr2.length) {
            return false;
        }
        if (bArr.length > bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: b */
    private void m267961b(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f174516p.length);
        if (min > 0) {
            byte[] bArr2 = this.f174516p;
            int length = bArr2.length - min;
            if (length > 0) {
                System.arraycopy(bArr2, min, bArr2, 0, length);
            }
            System.arraycopy(bArr, i, this.f174516p, length, min);
        }
    }

    /* renamed from: a */
    private int m267955a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f174513m) {
            int read = this.f174511k.read(bArr, i, i2);
            mo244818a(read);
            return read;
        }
        C69819a aVar = (C69819a) this.f174511k;
        long a = aVar.mo244817a();
        int read2 = this.f174511k.read(bArr, i, i2);
        mo244819a(aVar.mo244817a() - a);
        return read2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f174512l) {
            return -1;
        }
        int a = m267955a(bArr, i, i2);
        if (a == -1) {
            m267964d();
            if (!this.f174512l) {
                a = m267955a(bArr, i, i2);
            }
        }
        if (a != -1) {
            if (this.f174508h) {
                m267961b(bArr, i, a);
            }
            if (this.f174510j) {
                this.f174514n.update(bArr, i, a);
            }
        }
        return a;
    }
}

package org.apache.commons.compress.compressors.snappy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69747b;
import org.apache.commons.compress.p3493a.C69748c;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.snappy.a */
public class C69846a extends AbstractC69780a {

    /* renamed from: a */
    static final byte[] f174581a = {-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};

    /* renamed from: b */
    private long f174582b;

    /* renamed from: c */
    private final C69752f f174583c;

    /* renamed from: d */
    private final PushbackInputStream f174584d;

    /* renamed from: e */
    private final FramedSnappyDialect f174585e;

    /* renamed from: f */
    private C69849c f174586f;

    /* renamed from: g */
    private final byte[] f174587g;

    /* renamed from: h */
    private boolean f174588h;

    /* renamed from: i */
    private boolean f174589i;

    /* renamed from: j */
    private int f174590j;

    /* renamed from: k */
    private long f174591k;

    /* renamed from: l */
    private final int f174592l;

    /* renamed from: m */
    private final C69848b f174593m;

    /* renamed from: n */
    private final C69748c.AbstractC69749a f174594n;

    /* renamed from: c */
    static long m268032c(long j) {
        long j2 = (j - 2726488792L) & 4294967295L;
        return ((j2 << 15) | (j2 >> 17)) & 4294967295L;
    }

    /* renamed from: e */
    private int m268035e() throws IOException {
        return (int) C69748c.m267710a(this.f174594n, 3);
    }

    /* renamed from: d */
    private long m268034d() throws IOException {
        byte[] bArr = new byte[4];
        int a = C69753g.m267719a(this.f174584d, bArr);
        mo244818a(a);
        if (a == 4) {
            return C69748c.m267711a(bArr);
        }
        throw new IOException("premature end of stream");
    }

    /* renamed from: f */
    private void m268036f() throws IOException {
        long e = (long) m268035e();
        long a = C69753g.m267721a(this.f174584d, e);
        mo244819a(a);
        if (a != e) {
            throw new IOException("premature end of stream");
        }
    }

    /* renamed from: g */
    private void m268037g() throws IOException {
        byte[] bArr = new byte[10];
        int a = C69753g.m267719a(this.f174584d, bArr);
        mo244818a(a);
        if (10 != a || !m268031a(bArr, 10)) {
            throw new IOException("Not a framed Snappy stream");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f174589i) {
            return Math.min(this.f174590j, this.f174584d.available());
        }
        C69849c cVar = this.f174586f;
        if (cVar != null) {
            return cVar.available();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo245006b() throws IOException {
        int read = this.f174584d.read();
        if (read == -1) {
            return -1;
        }
        mo244818a(1);
        return read & 255;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            C69849c cVar = this.f174586f;
            if (cVar != null) {
                cVar.close();
                this.f174586f = null;
            }
        } finally {
            this.f174584d.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f174587g, 0, 1) == -1) {
            return -1;
        }
        return this.f174587g[0] & 255;
    }

    /* renamed from: h */
    private void m268038h() throws IOException {
        long j = this.f174591k;
        if (j < 0 || j == this.f174593m.getValue()) {
            this.f174591k = -1;
            this.f174593m.reset();
            return;
        }
        throw new IOException("Checksum verification failed");
    }

    /* renamed from: c */
    private void m268033c() throws IOException {
        long j;
        m268038h();
        this.f174589i = false;
        int b = mo245006b();
        if (b == -1) {
            this.f174588h = true;
        } else if (b == 255) {
            this.f174584d.unread(b);
            this.f174582b++;
            mo244820b(1);
            m268037g();
            m268033c();
        } else if (b == 254 || (b > 127 && b <= 253)) {
            m268036f();
            m268033c();
        } else if (b >= 2 && b <= 127) {
            throw new IOException("unskippable chunk with type " + b + " (hex " + Integer.toHexString(b) + ") detected.");
        } else if (b == 1) {
            this.f174589i = true;
            this.f174590j = m268035e() - 4;
            this.f174591k = m268032c(m268034d());
        } else if (b == 0) {
            boolean usesChecksumWithCompressedChunks = this.f174585e.usesChecksumWithCompressedChunks();
            long e = (long) m268035e();
            if (usesChecksumWithCompressedChunks) {
                j = 4;
            } else {
                j = 0;
            }
            long j2 = e - j;
            if (usesChecksumWithCompressedChunks) {
                this.f174591k = m268032c(m268034d());
            } else {
                this.f174591k = -1;
            }
            C69849c cVar = new C69849c(new C69747b(this.f174584d, j2), this.f174592l);
            this.f174586f = cVar;
            mo244819a(cVar.mo244817a());
        } else {
            throw new IOException("unknown chunk type " + b + " detected.");
        }
    }

    public C69846a(InputStream inputStream) throws IOException {
        this(inputStream, FramedSnappyDialect.STANDARD);
    }

    public C69846a(InputStream inputStream, FramedSnappyDialect framedSnappyDialect) throws IOException {
        this(inputStream, 32768, framedSnappyDialect);
    }

    /* renamed from: a */
    public static boolean m268031a(byte[] bArr, int i) {
        byte[] bArr2 = f174581a;
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

    public C69846a(InputStream inputStream, int i, FramedSnappyDialect framedSnappyDialect) throws IOException {
        this.f174587g = new byte[1];
        this.f174591k = -1;
        this.f174593m = new C69848b();
        this.f174594n = new C69748c.AbstractC69749a() {
            /* class org.apache.commons.compress.compressors.snappy.C69846a.C698471 */

            @Override // org.apache.commons.compress.p3493a.C69748c.AbstractC69749a
            /* renamed from: a */
            public int mo244680a() throws IOException {
                return C69846a.this.mo245006b();
            }
        };
        C69752f fVar = new C69752f(inputStream);
        this.f174583c = fVar;
        this.f174584d = new PushbackInputStream(fVar, 1);
        this.f174592l = i;
        this.f174585e = framedSnappyDialect;
        if (framedSnappyDialect.hasStreamIdentifier()) {
            m268037g();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = m268030a(bArr, i, i2);
        if (a != -1) {
            return a;
        }
        m268033c();
        if (this.f174588h) {
            return -1;
        }
        return m268030a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m268030a(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4.f174589i
            r1 = -1
            if (r0 == 0) goto L_0x001f
            int r0 = r4.f174590j
            int r7 = java.lang.Math.min(r0, r7)
            if (r7 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.io.PushbackInputStream r0 = r4.f174584d
            int r7 = r0.read(r5, r6, r7)
            if (r7 == r1) goto L_0x0042
            int r0 = r4.f174590j
            int r0 = r0 - r7
            r4.f174590j = r0
            r4.mo244818a(r7)
            goto L_0x0042
        L_0x001f:
            org.apache.commons.compress.compressors.snappy.c r0 = r4.f174586f
            if (r0 == 0) goto L_0x0043
            long r2 = r0.mo244817a()
            org.apache.commons.compress.compressors.snappy.c r0 = r4.f174586f
            int r7 = r0.read(r5, r6, r7)
            if (r7 != r1) goto L_0x0038
            org.apache.commons.compress.compressors.snappy.c r0 = r4.f174586f
            r0.close()
            r0 = 0
            r4.f174586f = r0
            goto L_0x0042
        L_0x0038:
            org.apache.commons.compress.compressors.snappy.c r0 = r4.f174586f
            long r0 = r0.mo244817a()
            long r0 = r0 - r2
            r4.mo244819a(r0)
        L_0x0042:
            r1 = r7
        L_0x0043:
            if (r1 <= 0) goto L_0x004a
            org.apache.commons.compress.compressors.snappy.b r7 = r4.f174593m
            r7.update(r5, r6, r1)
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.snappy.C69846a.m268030a(byte[], int, int):int");
    }
}

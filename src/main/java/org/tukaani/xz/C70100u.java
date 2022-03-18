package org.tukaani.xz;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.tukaani.xz.u */
public class C70100u extends InputStream {

    /* renamed from: a */
    private final C70046a f175218a;

    /* renamed from: b */
    private final int f175219b;

    /* renamed from: c */
    private InputStream f175220c;

    /* renamed from: d */
    private C70098s f175221d;

    /* renamed from: e */
    private final boolean f175222e;

    /* renamed from: f */
    private boolean f175223f;

    /* renamed from: g */
    private IOException f175224g;

    /* renamed from: h */
    private final byte[] f175225h;

    public C70100u(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, true);
    }

    public C70100u(InputStream inputStream, int i, boolean z) throws IOException {
        this(inputStream, i, z, C70046a.m268740a());
    }

    public C70100u(InputStream inputStream, int i, boolean z, C70046a aVar) throws IOException {
        this.f175225h = new byte[1];
        this.f175218a = aVar;
        this.f175220c = inputStream;
        this.f175219b = i;
        this.f175222e = z;
        this.f175221d = new C70098s(inputStream, i, z, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m268868a() throws java.io.IOException {
        /*
            r8 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r8.f175220c
            r0.<init>(r1)
            r1 = 12
            byte[] r6 = new byte[r1]
        L_0x000b:
            r1 = 0
            r2 = 1
            int r3 = r0.read(r6, r1, r2)
            r4 = -1
            if (r3 != r4) goto L_0x0017
            r8.f175223f = r2
            return
        L_0x0017:
            r3 = 3
            r0.readFully(r6, r2, r3)
            byte r1 = r6[r1]
            if (r1 != 0) goto L_0x002c
            byte r1 = r6[r2]
            if (r1 != 0) goto L_0x002c
            r1 = 2
            byte r1 = r6[r1]
            if (r1 != 0) goto L_0x002c
            byte r1 = r6[r3]
            if (r1 == 0) goto L_0x000b
        L_0x002c:
            r1 = 4
            r2 = 8
            r0.readFully(r6, r1, r2)
            org.tukaani.xz.s r0 = new org.tukaani.xz.s     // Catch:{ XZFormatException -> 0x0043 }
            java.io.InputStream r3 = r8.f175220c     // Catch:{ XZFormatException -> 0x0043 }
            int r4 = r8.f175219b     // Catch:{ XZFormatException -> 0x0043 }
            boolean r5 = r8.f175222e     // Catch:{ XZFormatException -> 0x0043 }
            org.tukaani.xz.a r7 = r8.f175218a     // Catch:{ XZFormatException -> 0x0043 }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ XZFormatException -> 0x0043 }
            r8.f175221d = r0     // Catch:{ XZFormatException -> 0x0043 }
            return
        L_0x0043:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r1 = "Garbage after a valid XZ Stream"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.C70100u.m268868a():void");
    }

    /* renamed from: a */
    public void mo246808a(boolean z) throws IOException {
        if (this.f175220c != null) {
            C70098s sVar = this.f175221d;
            if (sVar != null) {
                sVar.mo246803a(false);
                this.f175221d = null;
            }
            if (z) {
                try {
                    this.f175220c.close();
                } catch (Throwable th) {
                    this.f175220c = null;
                    throw th;
                }
            }
            this.f175220c = null;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f175220c != null) {
            IOException iOException = this.f175224g;
            if (iOException == null) {
                C70098s sVar = this.f175221d;
                if (sVar == null) {
                    return 0;
                }
                return sVar.available();
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        mo246808a(true);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175225h, 0, 1) == -1) {
            return -1;
        }
        return this.f175225h[0] & 255;
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
        if (this.f175220c != null) {
            IOException iOException = this.f175224g;
            if (iOException != null) {
                throw iOException;
            } else if (this.f175223f) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f175221d == null) {
                            m268868a();
                            if (this.f175223f) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int read = this.f175221d.read(bArr, i, i2);
                        if (read > 0) {
                            i4 += read;
                            i += read;
                            i2 -= read;
                        } else if (read == -1) {
                            this.f175221d = null;
                        }
                    } catch (IOException e) {
                        this.f175224g = e;
                        if (i4 == 0) {
                            throw e;
                        }
                    }
                }
                return i4;
            }
        } else {
            throw new XZIOException("Stream closed");
        }
    }
}

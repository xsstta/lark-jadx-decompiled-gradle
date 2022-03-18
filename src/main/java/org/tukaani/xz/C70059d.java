package org.tukaani.xz;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.tukaani.xz.p3523a.AbstractC70049c;
import org.tukaani.xz.p3524b.C70053a;

/* access modifiers changed from: package-private */
/* renamed from: org.tukaani.xz.d */
public class C70059d extends InputStream {

    /* renamed from: a */
    static final /* synthetic */ boolean f175086a = true;

    /* renamed from: b */
    private final DataInputStream f175087b;

    /* renamed from: c */
    private final C70064f f175088c;

    /* renamed from: d */
    private InputStream f175089d;

    /* renamed from: e */
    private final AbstractC70049c f175090e;

    /* renamed from: f */
    private final boolean f175091f;

    /* renamed from: g */
    private long f175092g = -1;

    /* renamed from: h */
    private long f175093h = -1;

    /* renamed from: i */
    private long f175094i;

    /* renamed from: j */
    private final int f175095j;

    /* renamed from: k */
    private long f175096k;

    /* renamed from: l */
    private boolean f175097l;

    /* renamed from: m */
    private final byte[] f175098m = new byte[1];

    public C70059d(InputStream inputStream, AbstractC70049c cVar, boolean z, int i, long j, long j2, C70046a aVar) throws IOException, C70091l {
        this.f175090e = cVar;
        this.f175091f = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f175087b = dataInputStream;
        byte[] bArr = new byte[1024];
        dataInputStream.readFully(bArr, 0, 1);
        if (bArr[0] != 0) {
            int i2 = ((bArr[0] & 255) + 1) * 4;
            this.f175095j = i2;
            dataInputStream.readFully(bArr, 1, i2 - 1);
            if (!C70053a.m268765a(bArr, 0, i2 - 4, i2 - 4)) {
                throw new CorruptedInputException("XZ Block Header is corrupt");
            } else if ((bArr[1] & 60) == 0) {
                int i3 = (bArr[1] & 3) + 1;
                long[] jArr = new long[i3];
                byte[][] bArr2 = new byte[i3][];
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
                try {
                    this.f175094i = (9223372036854775804L - ((long) i2)) - ((long) cVar.mo246726b());
                    if ((bArr[1] & 64) != 0) {
                        long a = C70053a.m268761a(byteArrayInputStream);
                        this.f175093h = a;
                        if (a == 0 || a > this.f175094i) {
                            throw new CorruptedInputException();
                        }
                        this.f175094i = a;
                    }
                    if ((bArr[1] & 128) != 0) {
                        this.f175092g = C70053a.m268761a(byteArrayInputStream);
                    }
                    for (int i4 = 0; i4 < i3; i4++) {
                        jArr[i4] = C70053a.m268761a(byteArrayInputStream);
                        long a2 = C70053a.m268761a(byteArrayInputStream);
                        if (a2 <= ((long) byteArrayInputStream.available())) {
                            bArr2[i4] = new byte[((int) a2)];
                            byteArrayInputStream.read(bArr2[i4]);
                        } else {
                            throw new CorruptedInputException();
                        }
                    }
                    for (int available = byteArrayInputStream.available(); available > 0; available--) {
                        if (byteArrayInputStream.read() != 0) {
                            throw new UnsupportedOptionsException("Unsupported options in XZ Block Header");
                        }
                    }
                    if (j != -1) {
                        long b = (long) (this.f175095j + cVar.mo246726b());
                        if (b < j) {
                            long j3 = j - b;
                            if (j3 <= this.f175094i) {
                                long j4 = this.f175093h;
                                if (j4 == -1 || j4 == j3) {
                                    long j5 = this.f175092g;
                                    if (j5 == -1 || j5 == j2) {
                                        this.f175094i = j3;
                                        this.f175093h = j3;
                                        this.f175092g = j2;
                                    } else {
                                        throw new CorruptedInputException("XZ Index does not match a Block Header");
                                    }
                                }
                            }
                            throw new CorruptedInputException("XZ Index does not match a Block Header");
                        }
                        throw new CorruptedInputException("XZ Index does not match a Block Header");
                    }
                    AbstractC70090k[] kVarArr = new AbstractC70090k[i3];
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (jArr[i5] == 33) {
                            kVarArr[i5] = new C70093n(bArr2[i5]);
                        } else if (jArr[i5] == 3) {
                            kVarArr[i5] = new C70080h(bArr2[i5]);
                        } else if (C70056c.m268757a(jArr[i5])) {
                            kVarArr[i5] = new C70056c(jArr[i5], bArr2[i5]);
                        } else {
                            throw new UnsupportedOptionsException("Unknown Filter ID " + jArr[i5]);
                        }
                    }
                    C70096q.m268863a(kVarArr);
                    if (i >= 0) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < i3; i7++) {
                            i6 += kVarArr[i7].mo246732d();
                        }
                        if (i6 > i) {
                            throw new MemoryLimitException(i6, i);
                        }
                    }
                    C70064f fVar = new C70064f(inputStream);
                    this.f175088c = fVar;
                    this.f175089d = fVar;
                    for (int i8 = i3 - 1; i8 >= 0; i8--) {
                        this.f175089d = kVarArr[i8].mo246731a(this.f175089d, aVar);
                    }
                } catch (IOException unused) {
                    throw new CorruptedInputException("XZ Block Header is corrupt");
                }
            } else {
                throw new UnsupportedOptionsException("Unsupported options in XZ Block Header");
            }
        } else {
            throw new C70091l();
        }
    }

    /* renamed from: c */
    private void m268771c() throws IOException {
        long a = this.f175088c.mo246758a();
        long j = this.f175093h;
        if (j == -1 || j == a) {
            long j2 = this.f175092g;
            if (j2 == -1 || j2 == this.f175096k) {
                while (true) {
                    long j3 = 1 + a;
                    if ((a & 3) == 0) {
                        byte[] bArr = new byte[this.f175090e.mo246726b()];
                        this.f175087b.readFully(bArr);
                        if (this.f175091f && !Arrays.equals(this.f175090e.mo246724a(), bArr)) {
                            throw new CorruptedInputException("Integrity check (" + this.f175090e.mo246727c() + ") does not match");
                        }
                        return;
                    } else if (this.f175087b.readUnsignedByte() == 0) {
                        a = j3;
                    } else {
                        throw new CorruptedInputException();
                    }
                }
            }
        }
        throw new CorruptedInputException();
    }

    /* renamed from: a */
    public long mo246734a() {
        return ((long) this.f175095j) + this.f175088c.mo246758a() + ((long) this.f175090e.mo246726b());
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f175089d.available();
    }

    /* renamed from: b */
    public long mo246736b() {
        return this.f175096k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        try {
            this.f175089d.close();
        } catch (IOException unused) {
            if (!f175086a) {
                throw new AssertionError();
            }
        }
        this.f175089d = null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175098m, 0, 1) == -1) {
            return -1;
        }
        return this.f175098m[0] & 255;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r0 == -1) goto L_0x005f;
     */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.C70059d.read(byte[], int, int):int");
    }
}

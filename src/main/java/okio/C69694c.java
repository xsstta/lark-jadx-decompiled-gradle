package okio;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: okio.c */
public final class C69694c implements Cloneable, ByteChannel, AbstractC69698d, AbstractC69699e {

    /* renamed from: c */
    private static final byte[] f174114c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a */
    C69719q f174115a;

    /* renamed from: b */
    long f174116b;

    @Override // okio.AbstractC69699e, okio.AbstractC69698d
    public C69694c buffer() {
        return this;
    }

    /* renamed from: c */
    public C69694c mo244560j() {
        return this;
    }

    @Override // java.lang.AutoCloseable, okio.AbstractC69723u, java.io.Closeable, okio.AbstractC69722t, java.nio.channels.Channel
    public void close() {
    }

    @Override // okio.AbstractC69698d
    /* renamed from: d */
    public AbstractC69698d mo244541d() {
        return this;
    }

    @Override // okio.AbstractC69698d, okio.AbstractC69722t, java.io.Flushable
    public void flush() {
    }

    @Override // okio.AbstractC69699e
    public C69694c getBuffer() {
        return this;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: a */
    public final long mo244510a() {
        return this.f174116b;
    }

    @Override // okio.AbstractC69723u, okio.AbstractC69722t
    public C69724v timeout() {
        return C69724v.NONE;
    }

    /* renamed from: a */
    public final C69694c mo244522a(C69694c cVar, long j, long j2) {
        if (cVar != null) {
            C69727x.m267647a(this.f174116b, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f174116b += j2;
            C69719q qVar = this.f174115a;
            while (j >= ((long) (qVar.f174169c - qVar.f174168b))) {
                j -= (long) (qVar.f174169c - qVar.f174168b);
                qVar = qVar.f174172f;
            }
            while (j2 > 0) {
                C69719q a = qVar.mo244623a();
                a.f174168b = (int) (((long) a.f174168b) + j);
                a.f174169c = Math.min(a.f174168b + ((int) j2), a.f174169c);
                C69719q qVar2 = cVar.f174115a;
                if (qVar2 == null) {
                    a.f174173g = a;
                    a.f174172f = a;
                    cVar.f174115a = a;
                } else {
                    qVar2.f174173g.mo244625a(a);
                }
                j2 -= (long) (a.f174169c - a.f174168b);
                qVar = qVar.f174172f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public C69694c mo244532b(ByteString byteString) {
        if (byteString != null) {
            byteString.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public C69694c mo244531b(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C69719q f = mo244548f(1);
                    byte[] bArr = f.f174167a;
                    int i3 = f.f174169c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = (i3 + i4) - f.f174169c;
                    f.f174169c += i5;
                    this.f174116b += (long) i5;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        mo244562k((charAt >> 6) | 192);
                        mo244562k((charAt & '?') | SmActions.ACTION_ONTHECALL_EXIT);
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo244562k((charAt >> '\f') | 224);
                        mo244562k(((charAt >> 6) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                        mo244562k((charAt & '?') | SmActions.ACTION_ONTHECALL_EXIT);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            mo244562k(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt & 10239) << 10) | (9215 & c)) + 65536;
                            mo244562k((i7 >> 18) | 240);
                            mo244562k(((i7 >> 12) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                            mo244562k(((i7 >> 6) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                            mo244562k((i7 & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: a */
    public C69694c mo244516a(int i) {
        if (i < 128) {
            mo244562k(i);
        } else if (i < 2048) {
            mo244562k((i >> 6) | 192);
            mo244562k((i & 63) | SmActions.ACTION_ONTHECALL_EXIT);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo244562k((i >> 12) | 224);
                mo244562k(((i >> 6) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                mo244562k((i & 63) | SmActions.ACTION_ONTHECALL_EXIT);
            } else {
                mo244562k(63);
            }
        } else if (i <= 1114111) {
            mo244562k((i >> 18) | 240);
            mo244562k(((i >> 12) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
            mo244562k(((i >> 6) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
            mo244562k((i & 63) | SmActions.ACTION_ONTHECALL_EXIT);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: a */
    public C69694c mo244520a(String str, Charset charset) {
        return mo244519a(str, 0, str.length(), charset);
    }

    /* renamed from: a */
    public C69694c mo244519a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C69727x.f174176a)) {
            return mo244531b(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo244534b(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    public C69694c mo244533b(byte[] bArr) {
        if (bArr != null) {
            return mo244534b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public C69694c mo244534b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C69727x.m267647a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C69719q f = mo244548f(1);
                int min = Math.min(i3 - i, 8192 - f.f174169c);
                System.arraycopy(bArr, i, f.f174167a, f.f174169c, min);
                i += min;
                f.f174169c += min;
            }
            this.f174116b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public boolean mo244525a(long j, ByteString byteString, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f174116b - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo244508a(((long) i3) + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C69697a mo244515a(C69697a aVar) {
        if (aVar.f174119a == null) {
            aVar.f174119a = this;
            aVar.f174120b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public OutputStream mo244527b() {
        return new OutputStream() {
            /* class okio.C69694c.C696951 */

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return C69694c.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                C69694c.this.mo244562k((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                C69694c.this.mo244534b(bArr, i, i2);
            }
        };
    }

    @Override // okio.AbstractC69699e
    public InputStream inputStream() {
        return new InputStream() {
            /* class okio.C69694c.C696962 */

            @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
            public void close() {
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(C69694c.this.f174116b, 2147483647L);
            }

            @Override // java.io.InputStream
            public int read() {
                if (C69694c.this.f174116b > 0) {
                    return C69694c.this.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return C69694c.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                return C69694c.this.read(bArr, i, i2);
            }
        };
    }

    @Override // okio.AbstractC69699e
    public boolean exhausted() {
        if (this.f174116b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo244546f() {
        try {
            return mo244514a(this.f174116b, C69727x.f174176a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.AbstractC69699e
    public byte[] readByteArray() {
        try {
            return readByteArray(this.f174116b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.AbstractC69699e
    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    @Override // okio.AbstractC69699e
    public int readIntLe() {
        return C69727x.m267644a(readInt());
    }

    @Override // okio.AbstractC69699e
    public long readLongLe() {
        return C69727x.m267645a(readLong());
    }

    @Override // okio.AbstractC69699e
    public short readShortLe() {
        return C69727x.m267646a(readShort());
    }

    @Override // okio.AbstractC69699e
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public String toString() {
        return mo244556i().toString();
    }

    /* renamed from: okio.c$a */
    public static final class C69697a implements Closeable {

        /* renamed from: a */
        public C69694c f174119a;

        /* renamed from: b */
        public boolean f174120b;

        /* renamed from: c */
        public long f174121c = -1;

        /* renamed from: d */
        public byte[] f174122d;

        /* renamed from: e */
        public int f174123e = -1;

        /* renamed from: f */
        public int f174124f = -1;

        /* renamed from: g */
        private C69719q f174125g;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f174119a != null) {
                this.f174119a = null;
                this.f174125g = null;
                this.f174121c = -1;
                this.f174122d = null;
                this.f174123e = -1;
                this.f174124f = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        /* renamed from: a */
        public final int mo244576a() {
            if (this.f174121c != this.f174119a.f174116b) {
                long j = this.f174121c;
                if (j == -1) {
                    return mo244577a(0);
                }
                return mo244577a(j + ((long) (this.f174124f - this.f174123e)));
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public final int mo244577a(long j) {
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i < 0 || j > this.f174119a.f174116b) {
                throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f174119a.f174116b)));
            } else if (i == 0 || j == this.f174119a.f174116b) {
                this.f174125g = null;
                this.f174121c = j;
                this.f174122d = null;
                this.f174123e = -1;
                this.f174124f = -1;
                return -1;
            } else {
                long j2 = 0;
                long j3 = this.f174119a.f174116b;
                C69719q qVar = this.f174119a.f174115a;
                C69719q qVar2 = this.f174119a.f174115a;
                C69719q qVar3 = this.f174125g;
                if (qVar3 != null) {
                    long j4 = this.f174121c - ((long) (this.f174123e - qVar3.f174168b));
                    if (j4 > j) {
                        qVar2 = this.f174125g;
                        j3 = j4;
                    } else {
                        qVar = this.f174125g;
                        j2 = j4;
                    }
                }
                if (j3 - j > j - j2) {
                    while (j >= ((long) (qVar.f174169c - qVar.f174168b)) + j2) {
                        j2 += (long) (qVar.f174169c - qVar.f174168b);
                        qVar = qVar.f174172f;
                    }
                } else {
                    while (j3 > j) {
                        qVar2 = qVar2.f174173g;
                        j3 -= (long) (qVar2.f174169c - qVar2.f174168b);
                    }
                    j2 = j3;
                    qVar = qVar2;
                }
                if (this.f174120b && qVar.f174170d) {
                    C69719q b = qVar.mo244627b();
                    if (this.f174119a.f174115a == qVar) {
                        this.f174119a.f174115a = b;
                    }
                    qVar = qVar.mo244625a(b);
                    qVar.f174173g.mo244628c();
                }
                this.f174125g = qVar;
                this.f174121c = j;
                this.f174122d = qVar.f174167a;
                this.f174123e = qVar.f174168b + ((int) (j - j2));
                int i2 = qVar.f174169c;
                this.f174124f = i2;
                return i2 - this.f174123e;
            }
        }
    }

    /* renamed from: e */
    public final long mo244542e() {
        long j = this.f174116b;
        if (j == 0) {
            return 0;
        }
        C69719q qVar = this.f174115a.f174173g;
        if (qVar.f174169c >= 8192 || !qVar.f174171e) {
            return j;
        }
        return j - ((long) (qVar.f174169c - qVar.f174168b));
    }

    /* renamed from: g */
    public final void mo244551g() {
        try {
            skip(this.f174116b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public int hashCode() {
        C69719q qVar = this.f174115a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f174169c;
            for (int i3 = qVar.f174168b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f174167a[i3];
            }
            qVar = qVar.f174172f;
        } while (qVar != this.f174115a);
        return i;
    }

    /* renamed from: h */
    public C69694c clone() {
        C69694c cVar = new C69694c();
        if (this.f174116b == 0) {
            return cVar;
        }
        C69719q a = this.f174115a.mo244623a();
        cVar.f174115a = a;
        a.f174173g = a;
        a.f174172f = a;
        C69719q qVar = this.f174115a;
        while (true) {
            qVar = qVar.f174172f;
            if (qVar != this.f174115a) {
                cVar.f174115a.f174173g.mo244625a(qVar.mo244623a());
            } else {
                cVar.f174116b = this.f174116b;
                return cVar;
            }
        }
    }

    /* renamed from: i */
    public final ByteString mo244556i() {
        long j = this.f174116b;
        if (j <= 2147483647L) {
            return mo244549g((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f174116b);
    }

    @Override // okio.AbstractC69699e
    public byte readByte() {
        if (this.f174116b != 0) {
            C69719q qVar = this.f174115a;
            int i = qVar.f174168b;
            int i2 = qVar.f174169c;
            int i3 = i + 1;
            byte b = qVar.f174167a[i];
            this.f174116b--;
            if (i3 == i2) {
                this.f174115a = qVar.mo244628c();
                C69720r.m267639a(qVar);
            } else {
                qVar.f174168b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.AbstractC69699e
    public short readShort() {
        if (this.f174116b >= 2) {
            C69719q qVar = this.f174115a;
            int i = qVar.f174168b;
            int i2 = qVar.f174169c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = qVar.f174167a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f174116b -= 2;
            if (i4 == i2) {
                this.f174115a = qVar.mo244628c();
                C69720r.m267639a(qVar);
            } else {
                qVar.f174168b = i4;
            }
            return (short) i5;
        }
        throw new IllegalStateException("size < 2: " + this.f174116b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r8 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r3;
     */
    @Override // okio.AbstractC69699e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readDecimalLong() {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C69694c.readDecimalLong():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f174115a = r6.mo244628c();
        okio.C69720r.m267639a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f174168b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    @Override // okio.AbstractC69699e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readHexadecimalUnsignedLong() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C69694c.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.AbstractC69699e
    public int readInt() {
        if (this.f174116b >= 4) {
            C69719q qVar = this.f174115a;
            int i = qVar.f174168b;
            int i2 = qVar.f174169c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = qVar.f174167a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f174116b -= 4;
            if (i8 == i2) {
                this.f174115a = qVar.mo244628c();
                C69720r.m267639a(qVar);
            } else {
                qVar.f174168b = i8;
            }
            return i9;
        }
        throw new IllegalStateException("size < 4: " + this.f174116b);
    }

    @Override // okio.AbstractC69699e
    public long readLong() {
        if (this.f174116b >= 8) {
            C69719q qVar = this.f174115a;
            int i = qVar.f174168b;
            int i2 = qVar.f174169c;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = qVar.f174167a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j = (((long) bArr[i9]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
            this.f174116b -= 8;
            if (i10 == i2) {
                this.f174115a = qVar.mo244628c();
                C69720r.m267639a(qVar);
            } else {
                qVar.f174168b = i10;
            }
            return j;
        }
        throw new IllegalStateException("size < 8: " + this.f174116b);
    }

    @Override // okio.AbstractC69699e
    public long indexOf(ByteString byteString) throws IOException {
        return mo244512a(byteString, 0);
    }

    @Override // okio.AbstractC69699e
    public long indexOfElement(ByteString byteString) {
        return mo244526b(byteString, 0);
    }

    @Override // okio.AbstractC69699e
    public String readUtf8(long j) throws EOFException {
        return mo244514a(j, C69727x.f174176a);
    }

    /* renamed from: a */
    public C69694c mo244530b(String str) {
        return mo244531b(str, 0, str.length());
    }

    /* renamed from: d */
    public C69694c mo244558i(long j) {
        return mo244537c(C69727x.m267645a(j));
    }

    /* renamed from: e */
    public C69694c mo244553h(int i) {
        return mo244557i(C69727x.m267644a(i));
    }

    /* renamed from: g */
    public final ByteString mo244549g(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        return new C69721s(this, i);
    }

    @Override // okio.AbstractC69699e
    public long indexOf(byte b) {
        return mo244511a(b, 0, Long.MAX_VALUE);
    }

    @Override // okio.AbstractC69699e
    public String readString(Charset charset) {
        try {
            return mo244514a(this.f174116b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.AbstractC69699e
    public boolean request(long j) {
        if (this.f174116b >= j) {
            return true;
        }
        return false;
    }

    @Override // okio.AbstractC69699e
    public void require(long j) throws EOFException {
        if (this.f174116b < j) {
            throw new EOFException();
        }
    }

    @Override // okio.AbstractC69698d
    /* renamed from: a */
    public long mo244513a(AbstractC69723u uVar) throws IOException {
        if (uVar != null) {
            long j = 0;
            while (true) {
                long read = uVar.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: b */
    public C69694c mo244562k(int i) {
        C69719q f = mo244548f(1);
        byte[] bArr = f.f174167a;
        int i2 = f.f174169c;
        f.f174169c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f174116b++;
        return this;
    }

    @Override // okio.AbstractC69699e
    public ByteString readByteString(long j) throws EOFException {
        return new ByteString(readByteArray(j));
    }

    @Override // okio.AbstractC69699e
    public int select(C69710l lVar) {
        int a = mo244509a(lVar, false);
        if (a == -1) {
            return -1;
        }
        try {
            skip((long) lVar.f174142a[a].size());
            return a;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo244528b(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo244508a(j2) == 13) {
                String readUtf8 = readUtf8(j2);
                skip(2);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j);
        skip(1);
        return readUtf82;
    }

    /* renamed from: c */
    public C69694c mo244561j(int i) {
        C69719q f = mo244548f(2);
        byte[] bArr = f.f174167a;
        int i2 = f.f174169c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        f.f174169c = i3 + 1;
        this.f174116b += 2;
        return this;
    }

    /* renamed from: d */
    public C69694c mo244557i(int i) {
        C69719q f = mo244548f(4);
        byte[] bArr = f.f174167a;
        int i2 = f.f174169c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        f.f174169c = i5 + 1;
        this.f174116b += 4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C69719q mo244548f(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C69719q qVar = this.f174115a;
        if (qVar == null) {
            C69719q a = C69720r.m267638a();
            this.f174115a = a;
            a.f174173g = a;
            a.f174172f = a;
            return a;
        }
        C69719q qVar2 = qVar.f174173g;
        if (qVar2.f174169c + i > 8192 || !qVar2.f174171e) {
            return qVar2.mo244625a(C69720r.m267638a());
        }
        return qVar2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C69719q qVar = this.f174115a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f174169c - qVar.f174168b);
        byteBuffer.put(qVar.f174167a, qVar.f174168b, min);
        qVar.f174168b += min;
        this.f174116b -= (long) min;
        if (qVar.f174168b == qVar.f174169c) {
            this.f174115a = qVar.mo244628c();
            C69720r.m267639a(qVar);
        }
        return min;
    }

    @Override // okio.AbstractC69699e
    public byte[] readByteArray(long j) throws EOFException {
        C69727x.m267647a(this.f174116b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // okio.AbstractC69699e
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C69719q f = mo244548f(1);
                int min = Math.min(i, 8192 - f.f174169c);
                byteBuffer.get(f.f174167a, f.f174169c, min);
                i -= min;
                f.f174169c += min;
            }
            this.f174116b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final byte mo244508a(long j) {
        C69727x.m267647a(this.f174116b, j, 1);
        long j2 = this.f174116b;
        if (j2 - j > j) {
            C69719q qVar = this.f174115a;
            while (true) {
                long j3 = (long) (qVar.f174169c - qVar.f174168b);
                if (j < j3) {
                    return qVar.f174167a[qVar.f174168b + ((int) j)];
                }
                j -= j3;
                qVar = qVar.f174172f;
            }
        } else {
            long j4 = j - j2;
            C69719q qVar2 = this.f174115a;
            do {
                qVar2 = qVar2.f174173g;
                j4 += (long) (qVar2.f174169c - qVar2.f174168b);
            } while (j4 < 0);
            return qVar2.f174167a[qVar2.f174168b + ((int) j4)];
        }
    }

    /* renamed from: c */
    public C69694c mo244537c(long j) {
        C69719q f = mo244548f(8);
        byte[] bArr = f.f174167a;
        int i = f.f174169c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        f.f174169c = i8 + 1;
        this.f174116b += 8;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69694c)) {
            return false;
        }
        C69694c cVar = (C69694c) obj;
        long j = this.f174116b;
        if (j != cVar.f174116b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C69719q qVar = this.f174115a;
        C69719q qVar2 = cVar.f174115a;
        int i = qVar.f174168b;
        int i2 = qVar2.f174168b;
        while (j2 < this.f174116b) {
            long min = (long) Math.min(qVar.f174169c - i, qVar2.f174169c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (qVar.f174167a[i] != qVar2.f174167a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == qVar.f174169c) {
                qVar = qVar.f174172f;
                i = qVar.f174168b;
            }
            if (i2 == qVar2.f174169c) {
                qVar2 = qVar2.f174172f;
                i2 = qVar2.f174168b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public C69694c mo244550g(long j) {
        if (j == 0) {
            return mo244562k(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C69719q f = mo244548f(numberOfTrailingZeros);
        byte[] bArr = f.f174167a;
        int i = f.f174169c;
        for (int i2 = (f.f174169c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f174114c[(int) (15 & j)];
            j >>>= 4;
        }
        f.f174169c += numberOfTrailingZeros;
        this.f174116b += (long) numberOfTrailingZeros;
        return this;
    }

    @Override // okio.AbstractC69699e
    public void skip(long j) throws EOFException {
        while (j > 0) {
            C69719q qVar = this.f174115a;
            if (qVar != null) {
                int min = (int) Math.min(j, (long) (qVar.f174169c - this.f174115a.f174168b));
                long j2 = (long) min;
                this.f174116b -= j2;
                j -= j2;
                this.f174115a.f174168b += min;
                if (this.f174115a.f174168b == this.f174115a.f174169c) {
                    C69719q qVar2 = this.f174115a;
                    this.f174115a = qVar2.mo244628c();
                    C69720r.m267639a(qVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.AbstractC69699e
    public String readUtf8LineStrict(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = mo244511a((byte) 10, 0, j2);
            if (a != -1) {
                return mo244528b(a);
            }
            if (j2 < mo244510a() && mo244508a(j2 - 1) == 13 && mo244508a(j2) == 10) {
                return mo244528b(j2);
            }
            C69694c cVar = new C69694c();
            mo244522a(cVar, 0, Math.min(32L, mo244510a()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo244510a(), j) + " content=" + cVar.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: e */
    public C69694c mo244554h(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo244562k(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo244530b("-9223372036854775808");
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C69719q f = mo244548f(i2);
        byte[] bArr = f.f174167a;
        int i3 = f.f174169c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f174114c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        f.f174169c += i2;
        this.f174116b += (long) i2;
        return this;
    }

    @Override // okio.AbstractC69699e
    public boolean rangeEquals(long j, ByteString byteString) {
        return mo244525a(j, byteString, 0, byteString.size());
    }

    @Override // okio.AbstractC69699e
    public void readFully(C69694c cVar, long j) throws EOFException {
        long j2 = this.f174116b;
        if (j2 >= j) {
            cVar.write(this, j);
        } else {
            cVar.write(this, j2);
            throw new EOFException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo244509a(C69710l lVar, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        C69719q qVar;
        int i4;
        C69719q qVar2 = this.f174115a;
        int i5 = -2;
        if (qVar2 != null) {
            byte[] bArr = qVar2.f174167a;
            int i6 = qVar2.f174168b;
            int i7 = qVar2.f174169c;
            int[] iArr = lVar.f174143b;
            C69719q qVar3 = qVar2;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (qVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & 255) != iArr[i12]) {
                            return i9;
                        }
                        if (i16 == i14) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i15 == i7) {
                            C69719q qVar4 = qVar3.f174172f;
                            i4 = qVar4.f174168b;
                            byte[] bArr2 = qVar4.f174167a;
                            i3 = qVar4.f174169c;
                            if (qVar4 != qVar2) {
                                qVar = qVar4;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                qVar = null;
                            }
                        } else {
                            i3 = i7;
                            i4 = i15;
                            qVar = qVar3;
                        }
                        if (z2) {
                            i = iArr[i16];
                            i2 = i4;
                            i7 = i3;
                            qVar3 = qVar;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i12 = i16;
                        qVar3 = qVar;
                    }
                } else {
                    int i17 = i6 + 1;
                    int i18 = bArr[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (i18 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i17 == i7) {
                                qVar3 = qVar3.f174172f;
                                i2 = qVar3.f174168b;
                                bArr = qVar3.f174167a;
                                i7 = qVar3.f174169c;
                                if (qVar3 == qVar2) {
                                    qVar3 = null;
                                }
                            } else {
                                i2 = i17;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            if (z) {
                return i5;
            }
            return i9;
        } else if (z) {
            return -2;
        } else {
            return lVar.indexOf(ByteString.EMPTY);
        }
    }

    /* renamed from: b */
    public long mo244526b(ByteString byteString, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            C69719q qVar = this.f174115a;
            if (qVar == null) {
                return -1;
            }
            long j3 = this.f174116b;
            if (j3 - j < j) {
                while (j3 > j) {
                    qVar = qVar.f174173g;
                    j3 -= (long) (qVar.f174169c - qVar.f174168b);
                }
            } else {
                while (true) {
                    long j4 = ((long) (qVar.f174169c - qVar.f174168b)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    qVar = qVar.f174172f;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j3 < this.f174116b) {
                    byte[] bArr = qVar.f174167a;
                    i = (int) ((((long) qVar.f174168b) + j) - j3);
                    int i3 = qVar.f174169c;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = qVar.f174168b;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (qVar.f174169c - qVar.f174168b);
                    qVar = qVar.f174172f;
                    j = j3;
                }
                return -1;
            }
            byte[] internalArray = byteString.internalArray();
            while (j3 < this.f174116b) {
                byte[] bArr2 = qVar.f174167a;
                i = (int) ((((long) qVar.f174168b) + j) - j3);
                int i4 = qVar.f174169c;
                while (i < i4) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray) {
                        if (b4 == b5) {
                            i2 = qVar.f174168b;
                        }
                    }
                    i++;
                }
                j3 += (long) (qVar.f174169c - qVar.f174168b);
                qVar = qVar.f174172f;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // okio.AbstractC69723u
    public long read(C69694c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f174116b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.write(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    @Override // okio.AbstractC69722t
    public void write(C69694c cVar, long j) {
        C69719q qVar;
        int i;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C69727x.m267647a(cVar.f174116b, 0, j);
            while (j > 0) {
                if (j < ((long) (cVar.f174115a.f174169c - cVar.f174115a.f174168b))) {
                    C69719q qVar2 = this.f174115a;
                    if (qVar2 != null) {
                        qVar = qVar2.f174173g;
                    } else {
                        qVar = null;
                    }
                    if (qVar != null && qVar.f174171e) {
                        long j2 = ((long) qVar.f174169c) + j;
                        if (qVar.f174170d) {
                            i = 0;
                        } else {
                            i = qVar.f174168b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            cVar.f174115a.mo244626a(qVar, (int) j);
                            cVar.f174116b -= j;
                            this.f174116b += j;
                            return;
                        }
                    }
                    cVar.f174115a = cVar.f174115a.mo244624a((int) j);
                }
                C69719q qVar3 = cVar.f174115a;
                long j3 = (long) (qVar3.f174169c - qVar3.f174168b);
                cVar.f174115a = qVar3.mo244628c();
                C69719q qVar4 = this.f174115a;
                if (qVar4 == null) {
                    this.f174115a = qVar3;
                    qVar3.f174173g = qVar3;
                    qVar3.f174172f = qVar3;
                } else {
                    qVar4.f174173g.mo244625a(qVar3).mo244629d();
                }
                cVar.f174116b -= j3;
                this.f174116b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: a */
    public long mo244512a(ByteString byteString, long j) throws IOException {
        byte[] bArr;
        if (byteString.size() != 0) {
            long j2 = 0;
            if (j >= 0) {
                C69719q qVar = this.f174115a;
                long j3 = -1;
                if (qVar == null) {
                    return -1;
                }
                long j4 = this.f174116b;
                if (j4 - j < j) {
                    while (j4 > j) {
                        qVar = qVar.f174173g;
                        j4 -= (long) (qVar.f174169c - qVar.f174168b);
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (qVar.f174169c - qVar.f174168b)) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        qVar = qVar.f174172f;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte b = byteString.getByte(0);
                int size = byteString.size();
                long j6 = 1 + (this.f174116b - ((long) size));
                long j7 = j;
                C69719q qVar2 = qVar;
                long j8 = j4;
                while (j8 < j6) {
                    byte[] bArr2 = qVar2.f174167a;
                    int min = (int) Math.min((long) qVar2.f174169c, (((long) qVar2.f174168b) + j6) - j8);
                    int i = (int) ((((long) qVar2.f174168b) + j7) - j8);
                    while (i < min) {
                        if (bArr2[i] == b) {
                            bArr = bArr2;
                            if (m267511a(qVar2, i + 1, byteString, 1, size)) {
                                return ((long) (i - qVar2.f174168b)) + j8;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i++;
                        bArr2 = bArr;
                    }
                    j8 += (long) (qVar2.f174169c - qVar2.f174168b);
                    qVar2 = qVar2.f174172f;
                    j7 = j8;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    /* renamed from: a */
    public String mo244514a(long j, Charset charset) throws EOFException {
        C69727x.m267647a(this.f174116b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C69719q qVar = this.f174115a;
            if (((long) qVar.f174168b) + j > ((long) qVar.f174169c)) {
                return new String(readByteArray(j), charset);
            }
            String str = new String(qVar.f174167a, qVar.f174168b, (int) j, charset);
            qVar.f174168b = (int) (((long) qVar.f174168b) + j);
            this.f174116b -= j;
            if (qVar.f174168b == qVar.f174169c) {
                this.f174115a = qVar.mo244628c();
                C69720r.m267639a(qVar);
            }
            return str;
        }
    }

    @Override // okio.AbstractC69699e
    public int read(byte[] bArr, int i, int i2) {
        C69727x.m267647a((long) bArr.length, (long) i, (long) i2);
        C69719q qVar = this.f174115a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i2, qVar.f174169c - qVar.f174168b);
        System.arraycopy(qVar.f174167a, qVar.f174168b, bArr, i, min);
        qVar.f174168b += min;
        this.f174116b -= (long) min;
        if (qVar.f174168b == qVar.f174169c) {
            this.f174115a = qVar.mo244628c();
            C69720r.m267639a(qVar);
        }
        return min;
    }

    /* renamed from: a */
    public long mo244511a(byte b, long j, long j2) {
        long j3;
        C69719q qVar;
        long j4 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f174116b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j5 = this.f174116b;
        if (j2 > j5) {
            j3 = j5;
        } else {
            j3 = j2;
        }
        if (j == j3 || (qVar = this.f174115a) == null) {
            return -1;
        }
        if (j5 - j < j) {
            while (j5 > j) {
                qVar = qVar.f174173g;
                j5 -= (long) (qVar.f174169c - qVar.f174168b);
            }
        } else {
            while (true) {
                long j6 = ((long) (qVar.f174169c - qVar.f174168b)) + j4;
                if (j6 >= j) {
                    break;
                }
                qVar = qVar.f174172f;
                j4 = j6;
            }
            j5 = j4;
        }
        long j7 = j;
        while (j5 < j3) {
            byte[] bArr = qVar.f174167a;
            int min = (int) Math.min((long) qVar.f174169c, (((long) qVar.f174168b) + j3) - j5);
            for (int i = (int) ((((long) qVar.f174168b) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - qVar.f174168b)) + j5;
                }
            }
            j5 += (long) (qVar.f174169c - qVar.f174168b);
            qVar = qVar.f174172f;
            j7 = j5;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m267511a(C69719q qVar, int i, ByteString byteString, int i2, int i3) {
        int i4 = qVar.f174169c;
        byte[] bArr = qVar.f174167a;
        while (i2 < i3) {
            if (i == i4) {
                qVar = qVar.f174172f;
                byte[] bArr2 = qVar.f174167a;
                bArr = bArr2;
                i = qVar.f174168b;
                i4 = qVar.f174169c;
            }
            if (bArr[i] != byteString.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}

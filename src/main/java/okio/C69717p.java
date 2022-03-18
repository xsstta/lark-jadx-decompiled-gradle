package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: okio.p */
public final class C69717p implements AbstractC69699e {

    /* renamed from: a */
    public final C69694c f174163a = new C69694c();

    /* renamed from: b */
    public final AbstractC69723u f174164b;

    /* renamed from: c */
    boolean f174165c;

    @Override // okio.AbstractC69699e
    public C69694c buffer() {
        return this.f174163a;
    }

    @Override // okio.AbstractC69699e
    public C69694c getBuffer() {
        return this.f174163a;
    }

    @Override // okio.AbstractC69699e
    public InputStream inputStream() {
        return new InputStream() {
            /* class okio.C69717p.C697181 */

            @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
            public void close() throws IOException {
                C69717p.this.close();
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                if (!C69717p.this.f174165c) {
                    return (int) Math.min(C69717p.this.f174163a.f174116b, 2147483647L);
                }
                throw new IOException("closed");
            }

            public String toString() {
                return C69717p.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (C69717p.this.f174165c) {
                    throw new IOException("closed");
                } else if (C69717p.this.f174163a.f174116b == 0 && C69717p.this.f174164b.read(C69717p.this.f174163a, 8192) == -1) {
                    return -1;
                } else {
                    return C69717p.this.f174163a.readByte() & 255;
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (!C69717p.this.f174165c) {
                    C69727x.m267647a((long) bArr.length, (long) i, (long) i2);
                    if (C69717p.this.f174163a.f174116b == 0 && C69717p.this.f174164b.read(C69717p.this.f174163a, 8192) == -1) {
                        return -1;
                    }
                    return C69717p.this.f174163a.read(bArr, i, i2);
                }
                throw new IOException("closed");
            }
        };
    }

    public boolean isOpen() {
        return !this.f174165c;
    }

    @Override // okio.AbstractC69723u
    public C69724v timeout() {
        return this.f174164b.timeout();
    }

    @Override // okio.AbstractC69699e
    public byte readByte() throws IOException {
        require(1);
        return this.f174163a.readByte();
    }

    @Override // okio.AbstractC69699e
    public byte[] readByteArray() throws IOException {
        this.f174163a.mo244513a(this.f174164b);
        return this.f174163a.readByteArray();
    }

    @Override // okio.AbstractC69699e
    public ByteString readByteString() throws IOException {
        this.f174163a.mo244513a(this.f174164b);
        return this.f174163a.readByteString();
    }

    @Override // okio.AbstractC69699e
    public int readInt() throws IOException {
        require(4);
        return this.f174163a.readInt();
    }

    @Override // okio.AbstractC69699e
    public int readIntLe() throws IOException {
        require(4);
        return this.f174163a.readIntLe();
    }

    @Override // okio.AbstractC69699e
    public long readLong() throws IOException {
        require(8);
        return this.f174163a.readLong();
    }

    @Override // okio.AbstractC69699e
    public long readLongLe() throws IOException {
        require(8);
        return this.f174163a.readLongLe();
    }

    @Override // okio.AbstractC69699e
    public short readShort() throws IOException {
        require(2);
        return this.f174163a.readShort();
    }

    @Override // okio.AbstractC69699e
    public short readShortLe() throws IOException {
        require(2);
        return this.f174163a.readShortLe();
    }

    @Override // okio.AbstractC69699e
    public String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (!this.f174165c) {
            this.f174165c = true;
            this.f174164b.close();
            this.f174163a.mo244551g();
        }
    }

    public String toString() {
        return "buffer(" + this.f174164b + ")";
    }

    @Override // okio.AbstractC69699e
    public boolean exhausted() throws IOException {
        if (this.f174165c) {
            throw new IllegalStateException("closed");
        } else if (!this.f174163a.exhausted() || this.f174164b.read(this.f174163a, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    @Override // okio.AbstractC69699e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readDecimalLong() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L_0x0040
            okio.c r3 = r6.f174163a
            long r4 = (long) r1
            byte r3 = r3.mo244508a(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            okio.c r0 = r6.f174163a
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C69717p.readDecimalLong():long");
    }

    @Override // okio.AbstractC69699e
    public long readHexadecimalUnsignedLong() throws IOException {
        require(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request((long) i2)) {
                break;
            }
            byte a = this.f174163a.mo244508a((long) i);
            if ((a >= 48 && a <= 57) || ((a >= 97 && a <= 102) || (a >= 65 && a <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(a)));
            }
        }
        return this.f174163a.readHexadecimalUnsignedLong();
    }

    @Override // okio.AbstractC69699e
    public long indexOf(ByteString byteString) throws IOException {
        return mo244612a(byteString, 0);
    }

    @Override // okio.AbstractC69699e
    public long indexOfElement(ByteString byteString) throws IOException {
        return mo244614b(byteString, 0);
    }

    @Override // okio.AbstractC69699e
    public long indexOf(byte b) throws IOException {
        return mo244611a(b, 0, Long.MAX_VALUE);
    }

    @Override // okio.AbstractC69699e
    public String readUtf8(long j) throws IOException {
        require(j);
        return this.f174163a.readUtf8(j);
    }

    @Override // okio.AbstractC69699e
    public void require(long j) throws IOException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    C69717p(AbstractC69723u uVar) {
        Objects.requireNonNull(uVar, "source == null");
        this.f174164b = uVar;
    }

    @Override // okio.AbstractC69699e
    public byte[] readByteArray(long j) throws IOException {
        require(j);
        return this.f174163a.readByteArray(j);
    }

    @Override // okio.AbstractC69699e
    public ByteString readByteString(long j) throws IOException {
        require(j);
        return this.f174163a.readByteString(j);
    }

    @Override // okio.AbstractC69699e
    public String readString(Charset charset) throws IOException {
        if (charset != null) {
            this.f174163a.mo244513a(this.f174164b);
            return this.f174163a.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f174163a.f174116b == 0 && this.f174164b.read(this.f174163a, 8192) == -1) {
            return -1;
        }
        return this.f174163a.read(byteBuffer);
    }

    @Override // okio.AbstractC69699e
    public void readFully(byte[] bArr) throws IOException {
        try {
            require((long) bArr.length);
            this.f174163a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f174163a.f174116b > 0) {
                C69694c cVar = this.f174163a;
                int read = cVar.read(bArr, i, (int) cVar.f174116b);
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    @Override // okio.AbstractC69699e
    public int select(C69710l lVar) throws IOException {
        if (!this.f174165c) {
            do {
                int a = this.f174163a.mo244509a(lVar, true);
                if (a == -1) {
                    return -1;
                }
                if (a != -2) {
                    this.f174163a.skip((long) lVar.f174142a[a].size());
                    return a;
                }
            } while (this.f174164b.read(this.f174163a, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69699e
    public boolean request(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f174165c) {
            while (this.f174163a.f174116b < j) {
                if (this.f174164b.read(this.f174163a, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // okio.AbstractC69699e
    public void skip(long j) throws IOException {
        if (!this.f174165c) {
            while (j > 0) {
                if (this.f174163a.f174116b == 0 && this.f174164b.read(this.f174163a, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f174163a.mo244510a());
                this.f174163a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69699e
    public String readUtf8LineStrict(long j) throws IOException {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long a = mo244611a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f174163a.mo244528b(a);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.f174163a.mo244508a(j2 - 1) == 13 && request(1 + j2) && this.f174163a.mo244508a(j2) == 10) {
                return this.f174163a.mo244528b(j2);
            }
            C69694c cVar = new C69694c();
            C69694c cVar2 = this.f174163a;
            cVar2.mo244522a(cVar, 0, Math.min(32L, cVar2.mo244510a()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f174163a.mo244510a(), j) + " content=" + cVar.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // okio.AbstractC69699e
    public boolean rangeEquals(long j, ByteString byteString) throws IOException {
        return mo244613a(j, byteString, 0, byteString.size());
    }

    @Override // okio.AbstractC69699e
    public void readFully(C69694c cVar, long j) throws IOException {
        try {
            require(j);
            this.f174163a.readFully(cVar, j);
        } catch (EOFException e) {
            cVar.mo244513a(this.f174163a);
            throw e;
        }
    }

    /* renamed from: a */
    public long mo244612a(ByteString byteString, long j) throws IOException {
        if (!this.f174165c) {
            while (true) {
                long a = this.f174163a.mo244512a(byteString, j);
                if (a != -1) {
                    return a;
                }
                long j2 = this.f174163a.f174116b;
                if (this.f174164b.read(this.f174163a, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: b */
    public long mo244614b(ByteString byteString, long j) throws IOException {
        if (!this.f174165c) {
            while (true) {
                long b = this.f174163a.mo244526b(byteString, j);
                if (b != -1) {
                    return b;
                }
                long j2 = this.f174163a.f174116b;
                if (this.f174164b.read(this.f174163a, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // okio.AbstractC69723u
    public long read(C69694c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f174165c) {
            throw new IllegalStateException("closed");
        } else if (this.f174163a.f174116b == 0 && this.f174164b.read(this.f174163a, 8192) == -1) {
            return -1;
        } else {
            return this.f174163a.read(cVar, Math.min(j, this.f174163a.f174116b));
        }
    }

    /* renamed from: a */
    public long mo244611a(byte b, long j, long j2) throws IOException {
        if (this.f174165c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        } else {
            while (j < j2) {
                long a = this.f174163a.mo244511a(b, j, j2);
                if (a == -1) {
                    long j3 = this.f174163a.f174116b;
                    if (j3 >= j2 || this.f174164b.read(this.f174163a, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a;
                }
            }
            return -1;
        }
    }

    @Override // okio.AbstractC69699e
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        C69727x.m267647a((long) bArr.length, (long) i, j);
        if (this.f174163a.f174116b == 0 && this.f174164b.read(this.f174163a, 8192) == -1) {
            return -1;
        }
        return this.f174163a.read(bArr, i, (int) Math.min(j, this.f174163a.f174116b));
    }

    /* renamed from: a */
    public boolean mo244613a(long j, ByteString byteString, int i, int i2) throws IOException {
        if (this.f174165c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!(request(1 + j2) && this.f174163a.mo244508a(j2) == byteString.getByte(i + i3))) {
                    return false;
                }
            }
            return true;
        }
    }
}

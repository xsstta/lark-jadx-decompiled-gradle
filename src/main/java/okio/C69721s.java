package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: okio.s */
public final class C69721s extends ByteString {
    final transient int[] directory;
    final transient byte[][] segments;

    private Object writeReplace() {
        return m267641a();
    }

    /* access modifiers changed from: package-private */
    @Override // okio.ByteString
    public byte[] internalArray() {
        return toByteArray();
    }

    /* renamed from: a */
    private ByteString m267641a() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // okio.ByteString
    public String base64() {
        return m267641a().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return m267641a().base64Url();
    }

    @Override // okio.ByteString
    public String hex() {
        return m267641a().hex();
    }

    @Override // okio.ByteString
    public ByteString md5() {
        return m267641a().md5();
    }

    @Override // okio.ByteString
    public ByteString sha1() {
        return m267641a().sha1();
    }

    @Override // okio.ByteString
    public ByteString sha256() {
        return m267641a().sha256();
    }

    @Override // okio.ByteString
    public int size() {
        return this.directory[this.segments.length - 1];
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return m267641a().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return m267641a().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public String toString() {
        return m267641a().toString();
    }

    @Override // okio.ByteString
    public String utf8() {
        return m267641a().utf8();
    }

    @Override // okio.ByteString
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int length = this.segments.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.segments[i2];
            int[] iArr = this.directory;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.hashCode = i4;
        return i4;
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.directory;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.segments[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // okio.ByteString
    public ByteString hmacSha1(ByteString byteString) {
        return m267641a().hmacSha1(byteString);
    }

    @Override // okio.ByteString
    public ByteString hmacSha256(ByteString byteString) {
        return m267641a().hmacSha256(byteString);
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        return m267641a().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i) {
        return m267641a().substring(i);
    }

    /* renamed from: a */
    private int m267640a(int i) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() != size() || !rangeEquals(0, byteString, 0, size())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public byte getByte(int i) {
        int i2;
        C69727x.m267647a((long) this.directory[this.segments.length - 1], (long) i, 1);
        int a = m267640a(i);
        if (a == 0) {
            i2 = 0;
        } else {
            i2 = this.directory[a - 1];
        }
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[a][(i - i2) + iArr[bArr.length + a]];
    }

    @Override // okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.segments.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.directory;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.segments[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: package-private */
    @Override // okio.ByteString
    public void write(C69694c cVar) {
        int length = this.segments.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C69719q qVar = new C69719q(this.segments[i], i3, (i3 + i4) - i2, true, false);
            if (cVar.f174115a == null) {
                qVar.f174173g = qVar;
                qVar.f174172f = qVar;
                cVar.f174115a = qVar;
            } else {
                cVar.f174115a.f174173g.mo244625a(qVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f174116b += (long) i2;
    }

    @Override // okio.ByteString
    public int indexOf(byte[] bArr, int i) {
        return m267641a().indexOf(bArr, i);
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] bArr, int i) {
        return m267641a().lastIndexOf(bArr, i);
    }

    @Override // okio.ByteString
    public ByteString substring(int i, int i2) {
        return m267641a().substring(i, i2);
    }

    C69721s(C69694c cVar, int i) {
        super(null);
        C69727x.m267647a(cVar.f174116b, 0, (long) i);
        C69719q qVar = cVar.f174115a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (qVar.f174169c != qVar.f174168b) {
                i3 += qVar.f174169c - qVar.f174168b;
                i4++;
                qVar = qVar.f174172f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i4][];
        this.directory = new int[(i4 * 2)];
        C69719q qVar2 = cVar.f174115a;
        int i5 = 0;
        while (i2 < i) {
            this.segments[i5] = qVar2.f174167a;
            i2 += qVar2.f174169c - qVar2.f174168b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.directory;
            iArr[i5] = i2;
            iArr[this.segments.length + i5] = qVar2.f174168b;
            qVar2.f174170d = true;
            i5++;
            qVar2 = qVar2.f174172f;
        }
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int a = m267640a(i);
        while (i3 > 0) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[a - 1];
            }
            int min = Math.min(i3, ((this.directory[a] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!byteString.rangeEquals(i2, bArr[a], (i - i4) + iArr[bArr.length + a], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            a++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int a = m267640a(i);
        while (i3 > 0) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[a - 1];
            }
            int min = Math.min(i3, ((this.directory[a] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!C69727x.m267649a(bArr2[a], (i - i4) + iArr[bArr2.length + a], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            a++;
        }
        return true;
    }
}

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: com.google.protobuf.e */
public final class C23108e {

    /* renamed from: a */
    public final byte[] f57037a;

    /* renamed from: b */
    public int f57038b;

    /* renamed from: c */
    private final boolean f57039c;

    /* renamed from: d */
    private int f57040d;

    /* renamed from: e */
    private int f57041e;

    /* renamed from: f */
    private final InputStream f57042f;

    /* renamed from: g */
    private int f57043g;

    /* renamed from: h */
    private boolean f57044h;

    /* renamed from: i */
    private int f57045i;

    /* renamed from: j */
    private int f57046j = Integer.MAX_VALUE;

    /* renamed from: k */
    private int f57047k;

    /* renamed from: l */
    private int f57048l = 100;

    /* renamed from: m */
    private int f57049m = 67108864;

    /* renamed from: n */
    private AbstractC23109a f57050n;

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.e$a */
    public interface AbstractC23109a {
        /* renamed from: a */
        void mo80270a();
    }

    /* renamed from: b */
    public long mo80255b() throws IOException {
        return mo80264i();
    }

    /* renamed from: c */
    public long mo80256c() throws IOException {
        return mo80267l();
    }

    /* renamed from: d */
    public int mo80258d() throws IOException {
        return mo80266k();
    }

    /* renamed from: g */
    public int mo80262g() throws IOException {
        return mo80263h();
    }

    /* renamed from: m */
    public boolean mo80268m() throws IOException {
        if (this.f57038b != this.f57040d || m83770f(1)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private void m83773o() {
        int i = this.f57040d + this.f57041e;
        this.f57040d = i;
        int i2 = this.f57045i + i;
        int i3 = this.f57046j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f57041e = i4;
            this.f57040d = i - i4;
            return;
        }
        this.f57041e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo80265j() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte n = mo80269n();
            j |= ((long) (n & Byte.MAX_VALUE)) << i;
            if ((n & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* renamed from: n */
    public byte mo80269n() throws IOException {
        if (this.f57038b == this.f57040d) {
            m83769e(1);
        }
        byte[] bArr = this.f57037a;
        int i = this.f57038b;
        this.f57038b = i + 1;
        return bArr[i];
    }

    /* renamed from: f */
    public ByteString mo80261f() throws IOException {
        ByteString byteString;
        int h = mo80263h();
        int i = this.f57040d;
        int i2 = this.f57038b;
        if (h <= i - i2 && h > 0) {
            if (!this.f57039c || !this.f57044h) {
                byteString = ByteString.copyFrom(this.f57037a, i2, h);
            } else {
                byteString = ByteString.wrap(this.f57037a, i2, h);
            }
            this.f57038b += h;
            return byteString;
        } else if (h == 0) {
            return ByteString.EMPTY;
        } else {
            return ByteString.wrap(m83771g(h));
        }
    }

    /* renamed from: k */
    public int mo80266k() throws IOException {
        int i = this.f57038b;
        if (this.f57040d - i < 4) {
            m83769e(4);
            i = this.f57038b;
        }
        byte[] bArr = this.f57037a;
        this.f57038b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    public int mo80251a() throws IOException {
        if (mo80268m()) {
            this.f57043g = 0;
            return 0;
        }
        int h = mo80263h();
        this.f57043g = h;
        if (WireFormat.m83737b(h) != 0) {
            return this.f57043g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: e */
    public String mo80260e() throws IOException {
        int h = mo80263h();
        int i = this.f57040d;
        if (h <= i - this.f57038b && h > 0) {
            String str = new String(this.f57037a, this.f57038b, h, C23115i.f57061a);
            this.f57038b += h;
            return str;
        } else if (h == 0) {
            return "";
        } else {
            if (h > i) {
                return new String(m83771g(h), C23115i.f57061a);
            }
            m83769e(h);
            String str2 = new String(this.f57037a, this.f57038b, h, C23115i.f57061a);
            this.f57038b += h;
            return str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo80263h() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23108e.mo80263h():int");
    }

    /* renamed from: l */
    public long mo80267l() throws IOException {
        int i = this.f57038b;
        if (this.f57040d - i < 8) {
            m83769e(8);
            i = this.f57038b;
        }
        byte[] bArr = this.f57037a;
        this.f57038b = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo80264i() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23108e.mo80264i():long");
    }

    /* renamed from: a */
    public static C23108e m83765a(InputStream inputStream) {
        return new C23108e(inputStream, 4096);
    }

    /* renamed from: a */
    public static C23108e m83766a(byte[] bArr) {
        return m83767a(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    private void m83769e(int i) throws IOException {
        if (!m83770f(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: c */
    public void mo80257c(int i) {
        this.f57046j = i;
        m83773o();
    }

    /* renamed from: b */
    public int mo80254b(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.f57045i + this.f57038b;
            int i3 = this.f57046j;
            if (i2 <= i3) {
                this.f57046j = i2;
                m83773o();
                return i3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* renamed from: d */
    public void mo80259d(int i) throws IOException {
        int i2 = this.f57040d;
        int i3 = this.f57038b;
        if (i > i2 - i3 || i < 0) {
            m83772h(i);
        } else {
            this.f57038b = i3 + i;
        }
    }

    /* renamed from: h */
    private void m83772h(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f57045i;
            int i3 = this.f57038b;
            int i4 = i2 + i3 + i;
            int i5 = this.f57046j;
            if (i4 <= i5) {
                int i6 = this.f57040d;
                int i7 = i6 - i3;
                this.f57038b = i6;
                m83769e(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f57040d;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f57038b = i9;
                        m83769e(1);
                    } else {
                        this.f57038b = i8;
                        return;
                    }
                }
            } else {
                mo80259d((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    /* renamed from: f */
    private boolean m83770f(int i) throws IOException {
        int i2 = this.f57038b;
        if (i2 + i <= this.f57040d) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        } else if (this.f57045i + i2 + i > this.f57046j) {
            return false;
        } else {
            AbstractC23109a aVar = this.f57050n;
            if (aVar != null) {
                aVar.mo80270a();
            }
            if (this.f57042f != null) {
                int i3 = this.f57038b;
                if (i3 > 0) {
                    int i4 = this.f57040d;
                    if (i4 > i3) {
                        byte[] bArr = this.f57037a;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    this.f57045i += i3;
                    this.f57040d -= i3;
                    this.f57038b = 0;
                }
                InputStream inputStream = this.f57042f;
                byte[] bArr2 = this.f57037a;
                int i5 = this.f57040d;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f57037a.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.f57040d += read;
                    if ((this.f57045i + i) - this.f57049m <= 0) {
                        m83773o();
                        if (this.f57040d >= i) {
                            return true;
                        }
                        return m83770f(i);
                    }
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    private byte[] m83771g(int i) throws IOException {
        if (i > 0) {
            int i2 = this.f57045i;
            int i3 = this.f57038b;
            int i4 = i2 + i3 + i;
            if (i4 <= this.f57049m) {
                int i5 = this.f57046j;
                if (i4 <= i5) {
                    InputStream inputStream = this.f57042f;
                    if (inputStream != null) {
                        int i6 = this.f57040d;
                        int i7 = i6 - i3;
                        this.f57045i = i2 + i6;
                        this.f57038b = 0;
                        this.f57040d = 0;
                        int i8 = i - i7;
                        if (i8 < 4096 || i8 <= inputStream.available()) {
                            byte[] bArr = new byte[i];
                            System.arraycopy(this.f57037a, i3, bArr, 0, i7);
                            while (i7 < i) {
                                int read = this.f57042f.read(bArr, i7, i - i7);
                                if (read != -1) {
                                    this.f57045i += read;
                                    i7 += read;
                                } else {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                            }
                            return bArr;
                        }
                        ArrayList<byte[]> arrayList = new ArrayList();
                        while (i8 > 0) {
                            int min = Math.min(i8, 4096);
                            byte[] bArr2 = new byte[min];
                            int i9 = 0;
                            while (i9 < min) {
                                int read2 = this.f57042f.read(bArr2, i9, min - i9);
                                if (read2 != -1) {
                                    this.f57045i += read2;
                                    i9 += read2;
                                } else {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                            }
                            i8 -= min;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i];
                        System.arraycopy(this.f57037a, i3, bArr3, 0, i7);
                        for (byte[] bArr4 : arrayList) {
                            System.arraycopy(bArr4, 0, bArr3, i7, bArr4.length);
                            i7 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                mo80259d((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        } else if (i == 0) {
            return C23115i.f57063c;
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    /* renamed from: a */
    public void mo80253a(int i) throws InvalidProtocolBufferException {
        if (this.f57043g != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    private C23108e(InputStream inputStream, int i) {
        this.f57037a = new byte[i];
        this.f57042f = inputStream;
    }

    /* renamed from: a */
    public <T extends AbstractC23125m> T mo80252a(AbstractC23129p<T> pVar, C23111g gVar) throws IOException {
        int h = mo80263h();
        if (this.f57047k < this.f57048l) {
            int b = mo80254b(h);
            this.f57047k++;
            T b2 = pVar.mo80150b(this, gVar);
            mo80253a(0);
            this.f57047k--;
            mo80257c(b);
            return b2;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: a */
    public static C23108e m83767a(byte[] bArr, int i, int i2) {
        return m83768a(bArr, i, i2, false);
    }

    private C23108e(byte[] bArr, int i, int i2, boolean z) {
        this.f57037a = bArr;
        this.f57040d = i2 + i;
        this.f57038b = i;
        this.f57045i = -i;
        this.f57039c = z;
    }

    /* renamed from: a */
    static C23108e m83768a(byte[] bArr, int i, int i2, boolean z) {
        C23108e eVar = new C23108e(bArr, i, i2, z);
        try {
            eVar.mo80254b(i2);
            return eVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

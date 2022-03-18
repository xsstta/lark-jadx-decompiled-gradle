package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ai */
public final class C22584ai extends FilterInputStream {

    /* renamed from: a */
    private byte[] f55675a = new byte[4096];

    /* renamed from: b */
    private long f55676b;

    /* renamed from: c */
    private boolean f55677c;

    /* renamed from: d */
    private boolean f55678d;

    C22584ai(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final int m81963a(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: a */
    private final ct m81964a(int i, String str, long j, int i2, boolean z) {
        return ct.m82098a(str, j, i2, z, Arrays.copyOf(this.f55675a, i));
    }

    /* renamed from: a */
    private final void m81965a(long j) {
        int length = this.f55675a.length;
        if (j > ((long) length)) {
            do {
                length += length;
            } while (((long) length) < j);
            this.f55675a = Arrays.copyOf(this.f55675a, length);
        }
    }

    /* renamed from: a */
    private final boolean m81966a(int i, int i2) throws IOException {
        return m81963a(this.f55675a, i, i2) == i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ct mo78729a() throws IOException {
        byte[] bArr;
        if (this.f55676b > 0) {
            do {
                bArr = this.f55675a;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f55677c || this.f55678d) {
            return ct.m82098a(null, -1, -1, false, null);
        }
        int a = m81963a(this.f55675a, 0, 30);
        if (a != 30 && !m81966a(a, 30 - a)) {
            this.f55677c = true;
            return m81964a(a, null, -1, -1, true);
        } else if (bz.m82057a(this.f55675a, 0) != 67324752) {
            this.f55678d = true;
            return m81964a(a, null, -1, -1, false);
        } else {
            long a2 = bz.m82057a(this.f55675a, 18);
            if (a2 != 4294967295L) {
                int b = bz.m82062b(this.f55675a, 8);
                int b2 = bz.m82062b(this.f55675a, 26);
                int i = b2 + 30;
                m81965a((long) i);
                int a3 = m81963a(this.f55675a, 30, b2);
                int i2 = a3 + 30;
                if (a3 == b2 || m81966a(i2, b2 - a3)) {
                    String str = new String(this.f55675a, 30, b2);
                    int b3 = bz.m82062b(this.f55675a, 28);
                    int i3 = i + b3;
                    m81965a((long) i3);
                    int a4 = m81963a(this.f55675a, i, b3);
                    int i4 = i + a4;
                    if (a4 == b3 || m81966a(i4, b3 - a4)) {
                        this.f55676b = bz.m82057a(this.f55675a, 18);
                        return m81964a(i3, str, a2, b, false);
                    }
                    this.f55677c = true;
                    return m81964a(i4, str, a2, b, true);
                }
                this.f55677c = true;
                return m81964a(i2, null, a2, b, true);
            }
            throw new ay("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo78730b() {
        return this.f55677c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo78731c() {
        return this.f55678d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo78732d() {
        return this.f55676b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f55676b;
        if (j <= 0 || this.f55677c) {
            return -1;
        }
        int a = m81963a(bArr, i, (int) Math.min(j, (long) i2));
        this.f55676b -= (long) a;
        if (a != 0) {
            return a;
        }
        this.f55677c = true;
        return 0;
    }
}

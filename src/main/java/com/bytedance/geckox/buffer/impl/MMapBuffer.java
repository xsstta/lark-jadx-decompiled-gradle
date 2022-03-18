package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14356d;
import com.bytedance.geckox.utils.C14362h;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

class MMapBuffer implements AbstractC14208a {

    /* renamed from: a */
    private long f37370a;

    /* renamed from: b */
    private long f37371b;

    /* renamed from: c */
    private long f37372c;

    /* renamed from: d */
    private AtomicBoolean f37373d = new AtomicBoolean(false);

    /* renamed from: e */
    private File f37374e;

    private native long nCreate(String str, long j) throws IOException;

    private native int nFlush(long j, long j2) throws IOException;

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native int nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public long mo52100b() {
        return this.f37370a;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: f */
    public File mo52105f() {
        return this.f37374e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo52123g() {
        return this.f37371b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo52124h() {
        return this.f37370a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public File mo52125i() {
        return this.f37374e;
    }

    static {
        C14362h.m57835a("buffer");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: d */
    public int mo52103d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo52098b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        try {
            mo52104e();
        } catch (Exception e) {
            C14356d.m57820a(e);
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52095a() throws IOException {
        if (!this.f37373d.get()) {
            nFlush(this.f37371b, this.f37370a);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: c */
    public long mo52102c() throws IOException {
        if (!this.f37373d.get()) {
            return this.f37372c;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: e */
    public void mo52104e() {
        if (!this.f37373d.getAndSet(true)) {
            nRelease(this.f37371b, this.f37370a);
            this.f37371b = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo52120c(long j) {
        this.f37371b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo52121d(long j) {
        this.f37370a = j;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52097a(byte[] bArr) throws IOException {
        mo52093a(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public int mo52098b(byte[] bArr) throws IOException {
        return mo52099b(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52096a(int i) throws IOException {
        mo52097a(new byte[]{(byte) i});
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public synchronized long mo52094a(long j) throws IOException {
        if (this.f37373d.get()) {
            throw new IOException("released!");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = this.f37372c;
            long j3 = j + j2;
            this.f37372c = j3;
            if (j3 < 0) {
                this.f37372c = 0;
            } else {
                long j4 = this.f37370a;
                if (j3 > j4) {
                    this.f37372c = j4;
                }
            }
            return this.f37372c - j2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r4 > r0) goto L_0x000e;
     */
    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52101b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f37373d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001a
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0010
        L_0x000e:
            r4 = r0
            goto L_0x0017
        L_0x0010:
            long r0 = r3.f37370a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0017
            goto L_0x000e
        L_0x0017:
            r3.f37372c = r4
            return
        L_0x001a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.MMapBuffer.mo52101b(long):void");
    }

    MMapBuffer(long j, File file) throws IOException {
        mo52121d(j);
        this.f37374e = file;
        file.getParentFile().mkdirs();
        mo52120c(nCreate(file.getAbsolutePath(), j));
        C14276b.m57604a("gecko-debug-tag", "MMap file[" + file.getAbsolutePath() + "],length:" + j + ",pid:" + C14350a.m57806a() + ",thread id:" + C14350a.m57808b());
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public int mo52093a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37373d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.f37372c;
                long j2 = this.f37370a;
                if (j == j2) {
                    return 0;
                }
                if (((long) i2) + j > j2) {
                    i2 = (int) (j2 - j);
                }
                nWrite(this.f37371b, j, bArr, i, i2);
                this.f37372c += (long) i2;
                return i2;
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public int mo52099b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37373d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 < 1 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.f37372c;
                long j2 = this.f37370a;
                if (j == j2) {
                    return -1;
                }
                if (((long) i2) + j > j2) {
                    i2 = (int) (j2 - j);
                }
                nRead(this.f37371b, j, bArr, i, i2);
                this.f37372c += (long) i2;
                return i2;
            }
        }
    }
}

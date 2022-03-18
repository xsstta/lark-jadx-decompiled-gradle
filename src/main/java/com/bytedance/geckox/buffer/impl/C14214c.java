package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.utils.C14355c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.buffer.impl.c */
class C14214c implements AbstractC14208a {

    /* renamed from: a */
    private long f37385a;

    /* renamed from: b */
    private long f37386b;

    /* renamed from: c */
    private RandomAccessFile f37387c;

    /* renamed from: d */
    private AtomicBoolean f37388d = new AtomicBoolean(false);

    /* renamed from: e */
    private File f37389e;

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public long mo52100b() {
        return this.f37385a;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: f */
    public File mo52105f() {
        return this.f37389e;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: d */
    public int mo52103d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo52098b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: e */
    public void mo52104e() {
        if (!this.f37388d.getAndSet(true)) {
            C14355c.m57819a(this.f37387c);
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52095a() throws IOException {
        if (this.f37388d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: c */
    public long mo52102c() throws IOException {
        if (!this.f37388d.get()) {
            return this.f37386b;
        }
        throw new IOException("released!");
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

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r4 > r0) goto L_0x000e;
     */
    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52101b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f37388d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0010
        L_0x000e:
            r4 = r0
            goto L_0x0017
        L_0x0010:
            long r0 = r3.f37385a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0017
            goto L_0x000e
        L_0x0017:
            r3.f37386b = r4
            java.io.RandomAccessFile r0 = r3.f37387c
            r0.seek(r4)
            return
        L_0x001f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.C14214c.mo52101b(long):void");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public synchronized long mo52094a(long j) throws IOException {
        int skipBytes;
        if (!this.f37388d.get()) {
            int i = (int) j;
            if (((long) i) == j) {
                skipBytes = this.f37387c.skipBytes(i);
                this.f37386b = this.f37387c.getFilePointer();
            } else {
                throw new IOException("too large:" + j);
            }
        } else {
            throw new IOException("released!");
        }
        return (long) skipBytes;
    }

    C14214c(long j, File file) throws IOException {
        this.f37385a = j;
        this.f37389e = file;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f37387c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e) {
            boolean exists = file.getParentFile().exists();
            C14355c.m57819a(this.f37387c);
            if (e instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    this.f37387c = randomAccessFile2;
                    randomAccessFile2.setLength(j);
                } catch (Exception unused) {
                    C14355c.m57819a(this.f37387c);
                    throw new IOException("create raf swap failed[2 dir mk:" + mkdirs2 + ",dir exist:+" + exists2 + ", dir mk:" + mkdirs + ",dir exist:+" + exists + "]! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
                }
            } else {
                throw new IOException("create raf swap failed[1 dir mk:" + mkdirs + ",dir exist:+" + exists + "]! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public int mo52093a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37388d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.f37386b;
                long j2 = this.f37385a;
                if (j == j2) {
                    return 0;
                }
                if (((long) i2) + j > j2) {
                    i2 = (int) (j2 - j);
                }
                this.f37387c.write(bArr, i, i2);
                this.f37386b += (long) i2;
                return i2;
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public int mo52099b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37388d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 < 1 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.f37386b;
                long j2 = this.f37385a;
                if (j == j2) {
                    return -1;
                }
                if (((long) i2) + j > j2) {
                    i2 = (int) (j2 - j);
                }
                int read = this.f37387c.read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                this.f37386b += (long) read;
                return read;
            }
        }
    }
}

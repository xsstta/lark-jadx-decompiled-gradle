package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.utils.C14355c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.buffer.impl.b */
class C14213b implements AbstractC14208a {

    /* renamed from: a */
    private RandomAccessFile f37382a;

    /* renamed from: b */
    private AtomicBoolean f37383b = new AtomicBoolean(false);

    /* renamed from: c */
    private File f37384c;

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: f */
    public File mo52105f() {
        return this.f37384c;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public long mo52100b() throws IOException {
        return this.f37382a.length();
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

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: e */
    public void mo52104e() {
        if (!this.f37383b.getAndSet(true)) {
            C14355c.m57819a(this.f37382a);
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52095a() throws IOException {
        if (this.f37383b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: c */
    public long mo52102c() throws IOException {
        if (!this.f37383b.get()) {
            return this.f37382a.getFilePointer();
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

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public void mo52101b(long j) throws IOException {
        if (!this.f37383b.get()) {
            if (j < 0) {
                j = 0;
            }
            this.f37382a.seek(j);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public synchronized long mo52094a(long j) throws IOException {
        int i;
        if (!this.f37383b.get()) {
            i = (int) j;
            if (((long) i) == j) {
            } else {
                throw new IOException("too large:" + j);
            }
        } else {
            throw new IOException("released!");
        }
        return (long) this.f37382a.skipBytes(i);
    }

    C14213b(File file) throws IOException {
        this.f37384c = file;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            this.f37382a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            boolean exists = file.getParentFile().exists();
            C14355c.m57819a(this.f37382a);
            if (e instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    this.f37382a = new RandomAccessFile(file, "rw");
                } catch (Exception unused) {
                    C14355c.m57819a(this.f37382a);
                    throw new IOException("create raf mSwap failed![2 dir mk:" + mkdirs2 + ",dir exist:+" + exists2 + ", dir mk:" + mkdirs + ",dir exist:+" + exists + "] path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
                }
            } else {
                throw new IOException("create raf mSwap failed![1 dir mk:" + mkdirs + ",dir exist:+" + exists + "] path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public int mo52093a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37383b.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                this.f37382a.write(bArr, i, i2);
            }
            return i2;
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public int mo52099b(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (this.f37383b.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 < 1 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                read = this.f37382a.read(bArr, i, i2);
            }
            return read;
        }
    }
}

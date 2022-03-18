package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.utils.C14355c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

public class MReMapBuffer extends MMapBuffer {

    /* renamed from: a */
    private AtomicBoolean f37375a;

    /* renamed from: b */
    private long f37376b;

    private native int nMReMap(long j, long j2, long j3);

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ long mo52102c() throws IOException {
        return super.mo52102c();
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ int mo52103d() throws IOException {
        return super.mo52103d();
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ File mo52105f() {
        return super.mo52105f();
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: e */
    public void mo52104e() {
        super.mo52104e();
        this.f37375a.set(true);
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ long mo52100b() {
        return super.mo52100b();
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52095a() throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        Exception e;
        super.mo52095a();
        try {
            randomAccessFile = new RandomAccessFile(mo52125i(), "rw");
            try {
                randomAccessFile.setLength(this.f37376b);
                C14355c.m57819a(randomAccessFile);
            } catch (Exception e2) {
                e = e2;
                try {
                    throw new IOException("reset swap length failed! path: " + mo52125i().getAbsolutePath() + " caused by: " + e.getMessage(), e);
                } catch (Throwable th2) {
                    th = th2;
                    C14355c.m57819a(randomAccessFile);
                    throw th;
                }
            }
        } catch (Exception e3) {
            randomAccessFile = null;
            e = e3;
            throw new IOException("reset swap length failed! path: " + mo52125i().getAbsolutePath() + " caused by: " + e.getMessage(), e);
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
            C14355c.m57819a(randomAccessFile);
            throw th;
        }
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo52101b(long j) throws IOException {
        super.mo52101b(j);
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ long mo52094a(long j) throws IOException {
        return super.mo52094a(j);
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo52098b(byte[] bArr) throws IOException {
        return super.mo52098b(bArr);
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52096a(int i) throws IOException {
        if (!this.f37375a.get()) {
            m57373b(1);
            super.mo52096a(i);
            return;
        }
        throw new IOException("released!");
    }

    /* renamed from: b */
    private synchronized void m57373b(int i) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        Exception e;
        if (i > 0) {
            long c = mo52102c();
            long h = mo52124h();
            long j = c + ((long) i);
            this.f37376b = Math.max(this.f37376b, j);
            if (j > h) {
                long j2 = ((j / 4096) + 1) * 4096;
                try {
                    randomAccessFile = new RandomAccessFile(mo52125i(), "rw");
                    try {
                        randomAccessFile.setLength(j2);
                        C14355c.m57819a(randomAccessFile);
                        mo52120c((long) nMReMap(mo52123g(), h, j2));
                        mo52121d(j2);
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            throw new IOException("create remap swap failed! path: " + mo52125i().getAbsolutePath() + " caused by: " + e.getMessage(), e);
                        } catch (Throwable th2) {
                            th = th2;
                            C14355c.m57819a(randomAccessFile);
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    randomAccessFile = null;
                    e = e3;
                    throw new IOException("create remap swap failed! path: " + mo52125i().getAbsolutePath() + " caused by: " + e.getMessage(), e);
                } catch (Throwable th3) {
                    randomAccessFile = null;
                    th = th3;
                    C14355c.m57819a(randomAccessFile);
                    throw th;
                }
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public void mo52097a(byte[] bArr) throws IOException {
        int i;
        if (!this.f37375a.get()) {
            if (bArr == null) {
                i = 0;
            } else {
                i = bArr.length;
            }
            m57373b(i);
            super.mo52097a(bArr);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo52099b(byte[] bArr, int i, int i2) throws IOException {
        return super.mo52099b(bArr, i, i2);
    }

    @Override // com.bytedance.geckox.buffer.impl.MMapBuffer, com.bytedance.geckox.buffer.AbstractC14208a
    /* renamed from: a */
    public int mo52093a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f37375a.get()) {
            m57373b(i2);
            return super.mo52093a(bArr, i, i2);
        }
        throw new IOException("released!");
    }
}

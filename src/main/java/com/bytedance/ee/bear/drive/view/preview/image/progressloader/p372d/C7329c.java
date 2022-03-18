package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.c */
public class C7329c extends InputStream {

    /* renamed from: a */
    private static final Queue<C7329c> f19613a = C7333f.m29295a(0);

    /* renamed from: b */
    private InputStream f19614b;

    /* renamed from: c */
    private IOException f19615c;

    C7329c() {
    }

    /* renamed from: a */
    public IOException mo28564a() {
        return this.f19615c;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f19614b.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f19614b.close();
    }

    public boolean markSupported() {
        return this.f19614b.markSupported();
    }

    /* renamed from: b */
    public void mo28566b() {
        this.f19615c = null;
        this.f19614b = null;
        Queue<C7329c> queue = f19613a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f19614b.read();
        } catch (IOException e) {
            this.f19615c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f19614b.reset();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28567b(InputStream inputStream) {
        this.f19614b = inputStream;
    }

    public void mark(int i) {
        this.f19614b.mark(i);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f19614b.skip(j);
        } catch (IOException e) {
            this.f19615c = e;
            return 0;
        }
    }

    /* renamed from: a */
    public static C7329c m29278a(InputStream inputStream) {
        C7329c poll;
        Queue<C7329c> queue = f19613a;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C7329c();
        }
        poll.mo28567b(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f19614b.read(bArr);
        } catch (IOException e) {
            this.f19615c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f19614b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f19615c = e;
            return -1;
        }
    }
}

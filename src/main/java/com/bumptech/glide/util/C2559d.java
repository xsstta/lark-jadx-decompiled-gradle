package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.util.d */
public class C2559d extends InputStream {

    /* renamed from: a */
    private static final Queue<C2559d> f8273a = C2568k.m10909a(0);

    /* renamed from: b */
    private InputStream f8274b;

    /* renamed from: c */
    private IOException f8275c;

    C2559d() {
    }

    /* renamed from: a */
    public IOException mo11233a() {
        return this.f8275c;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f8274b.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f8274b.close();
    }

    public boolean markSupported() {
        return this.f8274b.markSupported();
    }

    /* renamed from: b */
    public void mo11235b() {
        this.f8275c = null;
        this.f8274b = null;
        Queue<C2559d> queue = f8273a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f8274b.read();
        } catch (IOException e) {
            this.f8275c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f8274b.reset();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11236b(InputStream inputStream) {
        this.f8274b = inputStream;
    }

    public void mark(int i) {
        this.f8274b.mark(i);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f8274b.skip(j);
        } catch (IOException e) {
            this.f8275c = e;
            return 0;
        }
    }

    /* renamed from: a */
    public static C2559d m10873a(InputStream inputStream) {
        C2559d poll;
        Queue<C2559d> queue = f8273a;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C2559d();
        }
        poll.mo11236b(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f8274b.read(bArr);
        } catch (IOException e) {
            this.f8275c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f8274b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f8275c = e;
            return -1;
        }
    }
}

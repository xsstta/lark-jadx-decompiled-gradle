package com.tt.miniapp.streamloader.p3330a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* renamed from: com.tt.miniapp.streamloader.a.a */
public class C66863a extends InputStream {

    /* renamed from: a */
    boolean f168652a;

    /* renamed from: b */
    volatile boolean f168653b;

    /* renamed from: c */
    boolean f168654c;

    /* renamed from: d */
    Thread f168655d;

    /* renamed from: e */
    Thread f168656e;

    /* renamed from: f */
    protected byte[] f168657f;

    /* renamed from: g */
    protected int f168658g = -1;

    /* renamed from: h */
    protected int f168659h;

    /* renamed from: c */
    private static void m260818c() throws InterruptedIOException {
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo232815a() {
        this.f168652a = true;
        notifyAll();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        int i = this.f168658g;
        if (i < 0) {
            return 0;
        }
        return i - this.f168659h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f168653b = true;
        synchronized (this) {
            this.f168658g = -1;
        }
    }

    /* renamed from: b */
    private void m260817b() throws IOException {
        if (!this.f168654c) {
            throw new IOException("Pipe not connected");
        } else if (this.f168652a || this.f168653b) {
            throw new IOException("Pipe closed");
        } else {
            Thread thread = this.f168655d;
            if (thread != null && !thread.isAlive()) {
                throw new IOException("Read end dead");
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        byte[] bArr;
        if (!this.f168654c) {
            throw new IOException("Pipe not connected");
        } else if (!this.f168653b) {
            Thread thread = this.f168656e;
            if (thread != null && !thread.isAlive() && !this.f168652a) {
                if (this.f168658g < 0) {
                    throw new IOException("Write end dead");
                }
            }
            this.f168655d = Thread.currentThread();
            byte[] bArr2 = this.f168657f;
            if (bArr2 != null && this.f168659h >= bArr2.length) {
                return -1;
            }
            int i2 = 2;
            while (true) {
                int i3 = this.f168658g;
                if (i3 >= 0 && (i = this.f168659h) < i3 && (bArr = this.f168657f) != null) {
                    this.f168659h = i + 1;
                    return bArr[i] & 255;
                } else if (this.f168652a) {
                    return -1;
                } else {
                    Thread thread2 = this.f168656e;
                    if (thread2 == null || thread2.isAlive() || i2 - 1 >= 0) {
                        try {
                            wait(1000);
                        } catch (InterruptedException unused) {
                            m260818c();
                        }
                    } else {
                        throw new IOException("Pipe broken");
                    }
                }
            }
        } else {
            throw new IOException("Pipe closed");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo232816a(int i) throws IOException {
        m260817b();
        this.f168656e = Thread.currentThread();
        if (this.f168658g < 0) {
            this.f168658g = 0;
            this.f168659h = 0;
        }
        this.f168658g++;
        notifyAll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo232817a(byte[] bArr, int i, int i2) throws IOException {
        m260817b();
        this.f168656e = Thread.currentThread();
        if (bArr != null) {
            this.f168657f = bArr;
        }
        int i3 = i + i2;
        if (i3 > this.f168658g) {
            this.f168658g = i3;
            notifyAll();
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i >= 0 && i2 >= 0) {
                if (i2 <= bArr.length - i) {
                    if (i2 == 0) {
                        return 0;
                    }
                    int read = read();
                    if (read < 0) {
                        return -1;
                    }
                    bArr[i] = (byte) read;
                    int i3 = 1;
                    int i4 = i2 - 1;
                    int i5 = this.f168658g;
                    int i6 = this.f168659h;
                    if (i5 > i6 && i4 > 0) {
                        int i7 = i5 - i6;
                        if (i7 <= i4) {
                            i4 = i7;
                        }
                        System.arraycopy(this.f168657f, i6, bArr, i + 1, i4);
                        this.f168659h += i4;
                        i3 = 1 + i4;
                    }
                    return i3;
                }
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException();
    }
}

package com.bytedance.ee.falcon.inspector.network;

import com.bytedance.ee.falcon.inspector.p603a.C12643a;
import com.bytedance.ee.falcon.inspector.p604b.C12648a;
import com.bytedance.ee.falcon.inspector.protocol.module.Console;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.bytedance.ee.falcon.inspector.network.p */
public final class C12687p extends FilterInputStream {

    /* renamed from: a */
    private final String f33941a;

    /* renamed from: b */
    private final OutputStream f33942b;

    /* renamed from: c */
    private final C12667d f33943c;

    /* renamed from: d */
    private final C12648a f33944d;

    /* renamed from: e */
    private final AbstractC12686o f33945e;

    /* renamed from: f */
    private boolean f33946f;

    /* renamed from: g */
    private boolean f33947g;

    /* renamed from: h */
    private byte[] f33948h;

    /* renamed from: i */
    private long f33949i;

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException("Mark not supported");
    }

    /* renamed from: a */
    private byte[] m52560a() {
        if (this.f33948h == null) {
            this.f33948h = new byte[1024];
        }
        return this.f33948h;
    }

    /* renamed from: c */
    private void m52564c() {
        C12667d dVar = this.f33943c;
        if (dVar != null) {
            long a = dVar.mo48039a();
            this.f33945e.mo48046b((int) (a - this.f33949i));
            this.f33949i = a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        try {
            int a = m52557a(this.in.read());
            if (a != -1) {
                this.f33945e.mo48044a(1);
                m52562b(a);
            }
            return a;
        } catch (IOException e) {
            throw m52558a(e);
        }
    }

    /* renamed from: b */
    private synchronized void m52561b() {
        if (!this.f33946f) {
            try {
                this.f33942b.close();
                m52564c();
            } catch (IOException e) {
                C12648a aVar = this.f33944d;
                Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
                Console.MessageSource messageSource = Console.MessageSource.NETWORK;
                C12643a.m52422a(aVar, messageLevel, messageSource, "Could not close the output stream" + e);
            } catch (Throwable th) {
                this.f33946f = true;
                throw th;
            }
            this.f33946f = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        long j;
        try {
            if (!this.f33947g) {
                byte[] bArr = new byte[1024];
                j = 0;
                while (true) {
                    int read = read(bArr);
                    if (read == -1) {
                        break;
                    }
                    j += (long) read;
                }
            } else {
                j = 0;
            }
            if (j > 0) {
                C12643a.m52422a(this.f33944d, Console.MessageLevel.ERROR, Console.MessageSource.NETWORK, "There were " + String.valueOf(j) + " bytes that were not consumed while processing request " + this.f33941a);
            }
        } finally {
            super.close();
            m52561b();
        }
    }

    /* renamed from: a */
    private IOException m52558a(IOException iOException) {
        this.f33945e.mo48045a(iOException);
        return iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private synchronized int m52557a(int i) {
        if (i == -1) {
            m52561b();
            this.f33945e.mo48043a();
            this.f33947g = true;
        }
        return i;
    }

    /* renamed from: b */
    private synchronized void m52562b(int i) {
        if (!this.f33946f) {
            try {
                this.f33942b.write(i);
                m52564c();
            } catch (IOException e) {
                m52563b(e);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long j2;
        byte[] a = m52560a();
        j2 = 0;
        while (j2 < j) {
            int read = read(a, 0, (int) Math.min((long) a.length, j - j2));
            if (read == -1) {
                break;
            }
            j2 += (long) read;
        }
        return j2;
    }

    /* renamed from: b */
    private void m52563b(IOException iOException) {
        C12648a aVar = this.f33944d;
        Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
        Console.MessageSource messageSource = Console.MessageSource.NETWORK;
        C12643a.m52422a(aVar, messageLevel, messageSource, "Could not write response body to the stream " + iOException);
        m52561b();
    }

    /* renamed from: a */
    private synchronized void m52559a(byte[] bArr, int i, int i2) {
        if (!this.f33946f) {
            try {
                this.f33942b.write(bArr, i, i2);
                m52564c();
            } catch (IOException e) {
                m52563b(e);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int a = m52557a(this.in.read(bArr, i, i2));
            if (a != -1) {
                this.f33945e.mo48044a(a);
                m52559a(bArr, i, a);
            }
            return a;
        } catch (IOException e) {
            throw m52558a(e);
        }
    }

    public C12687p(InputStream inputStream, String str, OutputStream outputStream, C12667d dVar, C12648a aVar, AbstractC12686o oVar) {
        super(inputStream);
        this.f33941a = str;
        this.f33942b = outputStream;
        this.f33943c = dVar;
        this.f33944d = aVar;
        this.f33945e = oVar;
    }
}

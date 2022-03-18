package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: okio.o */
public final class C69715o implements AbstractC69698d {

    /* renamed from: a */
    public final C69694c f174159a = new C69694c();

    /* renamed from: b */
    public final AbstractC69722t f174160b;

    /* renamed from: c */
    boolean f174161c;

    @Override // okio.AbstractC69698d
    public C69694c buffer() {
        return this.f174159a;
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public OutputStream mo244527b() {
        return new OutputStream() {
            /* class okio.C69715o.C697161 */

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                C69715o.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (!C69715o.this.f174161c) {
                    C69715o.this.flush();
                }
            }

            public String toString() {
                return C69715o.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                if (!C69715o.this.f174161c) {
                    C69715o.this.f174159a.mo244562k((int) ((byte) i));
                    C69715o.this.mo244560j();
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (!C69715o.this.f174161c) {
                    C69715o.this.f174159a.mo244534b(bArr, i, i2);
                    C69715o.this.mo244560j();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    public boolean isOpen() {
        return !this.f174161c;
    }

    @Override // okio.AbstractC69722t
    public C69724v timeout() {
        return this.f174160b.timeout();
    }

    @Override // okio.AbstractC69698d
    /* renamed from: d */
    public AbstractC69698d mo244541d() throws IOException {
        if (!this.f174161c) {
            long a = this.f174159a.mo244510a();
            if (a > 0) {
                this.f174160b.write(this.f174159a, a);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: j */
    public AbstractC69698d mo244560j() throws IOException {
        if (!this.f174161c) {
            long e = this.f174159a.mo244542e();
            if (e > 0) {
                this.f174160b.write(this.f174159a, e);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f174160b + ")";
    }

    @Override // java.io.Closeable, okio.AbstractC69722t, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (!this.f174161c) {
            Throwable th = null;
            try {
                if (this.f174159a.f174116b > 0) {
                    AbstractC69722t tVar = this.f174160b;
                    C69694c cVar = this.f174159a;
                    tVar.write(cVar, cVar.f174116b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f174160b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f174161c = true;
            if (th != null) {
                C69727x.m267648a(th);
            }
        }
    }

    @Override // okio.AbstractC69698d, okio.AbstractC69722t, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f174161c) {
            if (this.f174159a.f174116b > 0) {
                AbstractC69722t tVar = this.f174160b;
                C69694c cVar = this.f174159a;
                tVar.write(cVar, cVar.f174116b);
            }
            this.f174160b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    C69715o(AbstractC69722t tVar) {
        Objects.requireNonNull(tVar, "sink == null");
        this.f174160b = tVar;
    }

    @Override // okio.AbstractC69698d
    /* renamed from: a */
    public long mo244513a(AbstractC69723u uVar) throws IOException {
        if (uVar != null) {
            long j = 0;
            while (true) {
                long read = uVar.read(this.f174159a, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
                mo244560j();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public AbstractC69698d mo244530b(String str) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244530b(str);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: g */
    public AbstractC69698d mo244550g(long j) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244550g(j);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: h */
    public AbstractC69698d mo244553h(int i) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244553h(i);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: i */
    public AbstractC69698d mo244557i(int i) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244557i(i);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: k */
    public AbstractC69698d mo244562k(int i) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244562k(i);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f174161c) {
            int write = this.f174159a.write(byteBuffer);
            mo244560j();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: h */
    public AbstractC69698d mo244554h(long j) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244554h(j);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: i */
    public AbstractC69698d mo244558i(long j) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244558i(j);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: j */
    public AbstractC69698d mo244561j(int i) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244561j(i);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public AbstractC69698d mo244532b(ByteString byteString) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244532b(byteString);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public AbstractC69698d mo244533b(byte[] bArr) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244533b(bArr);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69722t
    public void write(C69694c cVar, long j) throws IOException {
        if (!this.f174161c) {
            this.f174159a.write(cVar, j);
            mo244560j();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public AbstractC69698d mo244531b(String str, int i, int i2) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244531b(str, i, i2);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.AbstractC69698d
    /* renamed from: b */
    public AbstractC69698d mo244534b(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f174161c) {
            this.f174159a.mo244534b(bArr, i, i2);
            return mo244560j();
        }
        throw new IllegalStateException("closed");
    }
}

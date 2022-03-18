package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: okio.j */
public final class C69704j implements AbstractC69723u {

    /* renamed from: a */
    private final AbstractC69699e f174132a;

    /* renamed from: b */
    private final Inflater f174133b;

    /* renamed from: c */
    private int f174134c;

    /* renamed from: d */
    private boolean f174135d;

    @Override // okio.AbstractC69723u
    public C69724v timeout() {
        return this.f174132a.timeout();
    }

    /* renamed from: b */
    private void m267587b() throws IOException {
        int i = this.f174134c;
        if (i != 0) {
            int remaining = i - this.f174133b.getRemaining();
            this.f174134c -= remaining;
            this.f174132a.skip((long) remaining);
        }
    }

    @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f174135d) {
            this.f174133b.end();
            this.f174135d = true;
            this.f174132a.close();
        }
    }

    /* renamed from: a */
    public final boolean mo244593a() throws IOException {
        if (!this.f174133b.needsInput()) {
            return false;
        }
        m267587b();
        if (this.f174133b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f174132a.exhausted()) {
            return true;
        } else {
            C69719q qVar = this.f174132a.buffer().f174115a;
            this.f174134c = qVar.f174169c - qVar.f174168b;
            this.f174133b.setInput(qVar.f174167a, qVar.f174168b, this.f174134c);
            return false;
        }
    }

    C69704j(AbstractC69699e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f174132a = eVar;
            this.f174133b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    @Override // okio.AbstractC69723u
    public long read(C69694c cVar, long j) throws IOException {
        C69719q f;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f174135d) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo244593a();
                try {
                    f = cVar.mo244548f(1);
                    int inflate = this.f174133b.inflate(f.f174167a, f.f174169c, (int) Math.min(j, (long) (8192 - f.f174169c)));
                    if (inflate > 0) {
                        f.f174169c += inflate;
                        long j2 = (long) inflate;
                        cVar.f174116b += j2;
                        return j2;
                    } else if (this.f174133b.finished()) {
                        break;
                    } else if (this.f174133b.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m267587b();
            if (f.f174168b != f.f174169c) {
                return -1;
            }
            cVar.f174115a = f.mo244628c();
            C69720r.m267639a(f);
            return -1;
        }
    }
}

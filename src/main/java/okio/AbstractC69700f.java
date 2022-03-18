package okio;

import java.io.IOException;

/* renamed from: okio.f */
public abstract class AbstractC69700f implements AbstractC69722t {
    private final AbstractC69722t delegate;

    public final AbstractC69722t delegate() {
        return this.delegate;
    }

    @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // okio.AbstractC69722t, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.AbstractC69722t
    public C69724v timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    public AbstractC69700f(AbstractC69722t tVar) {
        if (tVar != null) {
            this.delegate = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.AbstractC69722t
    public void write(C69694c cVar, long j) throws IOException {
        this.delegate.write(cVar, j);
    }
}

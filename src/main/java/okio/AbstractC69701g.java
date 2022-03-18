package okio;

import java.io.IOException;

/* renamed from: okio.g */
public abstract class AbstractC69701g implements AbstractC69723u {
    private final AbstractC69723u delegate;

    public final AbstractC69723u delegate() {
        return this.delegate;
    }

    @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // okio.AbstractC69723u
    public C69724v timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    public AbstractC69701g(AbstractC69723u uVar) {
        if (uVar != null) {
            this.delegate = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.AbstractC69723u
    public long read(C69694c cVar, long j) throws IOException {
        return this.delegate.read(cVar, j);
    }
}

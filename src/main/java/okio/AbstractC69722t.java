package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: okio.t */
public interface AbstractC69722t extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    C69724v timeout();

    void write(C69694c cVar, long j) throws IOException;
}

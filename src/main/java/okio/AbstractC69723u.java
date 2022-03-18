package okio;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: okio.u */
public interface AbstractC69723u extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(C69694c cVar, long j) throws IOException;

    C69724v timeout();
}

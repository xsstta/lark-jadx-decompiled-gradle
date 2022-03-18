package okhttp3.internal.cache;

import java.io.IOException;
import okio.AbstractC69700f;
import okio.AbstractC69722t;
import okio.C69694c;

/* access modifiers changed from: package-private */
public class FaultHidingSink extends AbstractC69700f {
    private boolean hasErrors;

    /* access modifiers changed from: protected */
    public void onException(IOException iOException) {
    }

    @Override // okio.AbstractC69700f, okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    @Override // okio.AbstractC69700f, okio.AbstractC69722t, java.io.Flushable
    public void flush() throws IOException {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    FaultHidingSink(AbstractC69722t tVar) {
        super(tVar);
    }

    @Override // okio.AbstractC69700f, okio.AbstractC69722t
    public void write(C69694c cVar, long j) throws IOException {
        if (this.hasErrors) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}

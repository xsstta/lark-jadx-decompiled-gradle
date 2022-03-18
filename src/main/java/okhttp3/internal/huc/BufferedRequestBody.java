package okhttp3.internal.huc;

import java.io.IOException;
import okhttp3.Request;
import okio.AbstractC69698d;
import okio.C69694c;

/* access modifiers changed from: package-private */
public final class BufferedRequestBody extends OutputStreamRequestBody {
    final C69694c buffer;
    long contentLength = -1;

    @Override // okhttp3.internal.huc.OutputStreamRequestBody, okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    BufferedRequestBody(long j) {
        C69694c cVar = new C69694c();
        this.buffer = cVar;
        initOutputStream(cVar, j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(AbstractC69698d dVar) throws IOException {
        this.buffer.mo244522a(dVar.buffer(), 0, this.buffer.mo244510a());
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody
    public Request prepareToSendRequest(Request request) throws IOException {
        if (request.header("Content-Length") != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.mo244510a();
        return request.newBuilder().removeHeader("Transfer-Encoding").header("Content-Length", Long.toString(this.buffer.mo244510a())).build();
    }
}

package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.AbstractC69698d;
import okio.AbstractC69699e;
import okio.AbstractC69722t;
import okio.AbstractC69723u;
import okio.C69694c;
import okio.C69702h;
import okio.C69705k;
import okio.C69724v;

public final class Http1Codec implements HttpCodec {
    final OkHttpClient client;
    private long headerLimit = 262144;
    final AbstractC69698d sink;
    final AbstractC69699e source;
    int state;
    final StreamAllocation streamAllocation;

    private abstract class AbstractSource implements AbstractC69723u {
        protected long bytesRead;
        protected boolean closed;
        protected final C69702h timeout;

        @Override // okio.AbstractC69723u
        public C69724v timeout() {
            return this.timeout;
        }

        private AbstractSource() {
            this.timeout = new C69702h(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        @Override // okio.AbstractC69723u
        public long read(C69694c cVar, long j) throws IOException {
            try {
                long read = Http1Codec.this.source.read(cVar, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        public final void endOfInput(boolean z, IOException iOException) throws IOException {
            if (Http1Codec.this.state != 6) {
                if (Http1Codec.this.state == 5) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 6;
                    if (Http1Codec.this.streamAllocation != null) {
                        Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this, this.bytesRead, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class ChunkedSink implements AbstractC69722t {
        private boolean closed;
        private final C69702h timeout;

        @Override // okio.AbstractC69722t
        public C69724v timeout() {
            return this.timeout;
        }

        @Override // okio.AbstractC69722t, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                Http1Codec.this.sink.mo244530b("0\r\n\r\n");
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = 3;
            }
        }

        ChunkedSink() {
            this.timeout = new C69702h(Http1Codec.this.sink.timeout());
        }

        @Override // okio.AbstractC69722t
        public void write(C69694c cVar, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1Codec.this.sink.mo244550g(j);
                Http1Codec.this.sink.mo244530b("\r\n");
                Http1Codec.this.sink.write(cVar, j);
                Http1Codec.this.sink.mo244530b("\r\n");
            }
        }
    }

    /* access modifiers changed from: private */
    public final class FixedLengthSink implements AbstractC69722t {
        private long bytesRemaining;
        private boolean closed;
        private final C69702h timeout;

        @Override // okio.AbstractC69722t
        public C69724v timeout() {
            return this.timeout;
        }

        @Override // okio.AbstractC69722t, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        FixedLengthSink(long j) {
            this.timeout = new C69702h(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // okio.AbstractC69722t
        public void write(C69694c cVar, long j) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(cVar.mo244510a(), 0, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(cVar, j);
                    this.bytesRemaining -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        private final HttpUrl url;

        @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.readHexadecimalUnsignedLong();
                String trim = Http1Codec.this.source.readUtf8LineStrict().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
        }

        @Override // okio.AbstractC69723u, okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(C69694c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(cVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* access modifiers changed from: private */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        FixedLengthSource(long j) throws IOException {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                endOfInput(true, null);
            }
        }

        @Override // okio.AbstractC69723u, okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(C69694c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.closed) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(cVar, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        endOfInput(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* access modifiers changed from: private */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        UnknownLengthSource() {
            super();
        }

        @Override // okio.AbstractC69723u, okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(C69694c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1;
            }
        }
    }

    private String readHeaderLine() throws IOException {
        String readUtf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    public AbstractC69722t newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC69723u newUnknownLengthSource() throws IOException {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.state);
    }

    /* access modifiers changed from: package-private */
    public void detachTimeout(C69702h hVar) {
        C69724v a = hVar.mo244584a();
        hVar.mo244583a(C69724v.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }

    public AbstractC69723u newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC69722t newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC69723u newFixedLengthSource(long j) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, C69705k.m267590a(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, C69705k.m267590a(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, C69705k.m267590a(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1, C69705k.m267590a(newUnknownLengthSource()));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        int i = this.state;
        if (i == 1 || i == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.state);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public AbstractC69722t createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            this.sink.mo244530b(str).mo244530b("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.mo244530b(headers.name(i)).mo244530b(": ").mo244530b(headers.value(i)).mo244530b("\r\n");
            }
            this.sink.mo244530b("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation2, AbstractC69699e eVar, AbstractC69698d dVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation2;
        this.source = eVar;
        this.sink = dVar;
    }
}

package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.AbstractC69698d;
import okio.AbstractC69699e;
import okio.AbstractC69700f;
import okio.AbstractC69701g;
import okio.AbstractC69722t;
import okio.AbstractC69723u;
import okio.ByteString;
import okio.C69694c;
import okio.C69705k;

public final class Cache implements Closeable, Flushable {
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    /* access modifiers changed from: private */
    public final class CacheRequestImpl implements CacheRequest {
        private AbstractC69722t body;
        private AbstractC69722t cacheOut;
        boolean done;
        private final DiskLruCache.Editor editor;

        @Override // okhttp3.internal.cache.CacheRequest
        public AbstractC69722t body() {
            return this.body;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (!this.done) {
                    this.done = true;
                    Cache.this.writeAbortCount++;
                    Util.closeQuietly(this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        CacheRequestImpl(final DiskLruCache.Editor editor2) {
            this.editor = editor2;
            AbstractC69722t newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new AbstractC69700f(newSink, Cache.this) {
                /* class okhttp3.Cache.CacheRequestImpl.C696471 */

                @Override // okio.AbstractC69700f, okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (Cache.this) {
                        if (!CacheRequestImpl.this.done) {
                            CacheRequestImpl.this.done = true;
                            Cache.this.writeSuccessCount++;
                            super.close();
                            editor2.commit();
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: private */
    public static class CacheResponseBody extends ResponseBody {
        private final AbstractC69699e bodySource;
        @Nullable
        private final String contentLength;
        @Nullable
        private final String contentType;
        final DiskLruCache.Snapshot snapshot;

        @Override // okhttp3.ResponseBody
        public AbstractC69699e source() {
            return this.bodySource;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                String str = this.contentLength;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        CacheResponseBody(final DiskLruCache.Snapshot snapshot2, String str, String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C69705k.m267590a(new AbstractC69701g(snapshot2.getSource(1)) {
                /* class okhttp3.Cache.CacheResponseBody.C696481 */

                @Override // okio.AbstractC69701g, okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    snapshot2.close();
                    super.close();
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public void delete() throws IOException {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() throws IOException {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() throws IOException {
        return this.cache.size();
    }

    public Iterator<String> urls() throws IOException {
        return new Iterator<String>() {
            /* class okhttp3.Cache.C696462 */
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            @Nullable
            String nextUrl;

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = C69705k.m267590a(next.getSource(0)).readUtf8LineStrict();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            {
                this.delegate = Cache.this.cache.snapshots();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* access modifiers changed from: private */
    public static final class Entry {
        private static final String RECEIVED_MILLIS = (Platform.get().getPrefix() + "-Received-Millis");
        private static final String SENT_MILLIS = (Platform.get().getPrefix() + "-Sent-Millis");
        private final int code;
        @Nullable
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private List<Certificate> readCertificateList(AbstractC69699e eVar) throws IOException {
            int readInt = Cache.readInt(eVar);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readUtf8LineStrict = eVar.readUtf8LineStrict();
                    C69694c cVar = new C69694c();
                    cVar.mo244532b(ByteString.decodeBase64(readUtf8LineStrict));
                    arrayList.add(instance.generateCertificate(cVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        Entry(AbstractC69723u uVar) throws IOException {
            TlsVersion tlsVersion;
            try {
                AbstractC69699e a = C69705k.m267590a(uVar);
                this.url = a.readUtf8LineStrict();
                this.requestMethod = a.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(a);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(a.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(a.readUtf8LineStrict());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(a);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(a.readUtf8LineStrict());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j = 0;
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String readUtf8LineStrict = a.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        CipherSuite forJavaName = CipherSuite.forJavaName(a.readUtf8LineStrict());
                        List<Certificate> readCertificateList = readCertificateList(a);
                        List<Certificate> readCertificateList2 = readCertificateList(a);
                        if (!a.exhausted()) {
                            tlsVersion = TlsVersion.forJavaName(a.readUtf8LineStrict());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + "\"");
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                uVar.close();
            }
        }

        public void writeTo(DiskLruCache.Editor editor) throws IOException {
            AbstractC69698d a = C69705k.m267589a(editor.newSink(0));
            a.mo244530b(this.url).mo244562k(10);
            a.mo244530b(this.requestMethod).mo244562k(10);
            a.mo244554h((long) this.varyHeaders.size()).mo244562k(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                a.mo244530b(this.varyHeaders.name(i)).mo244530b(": ").mo244530b(this.varyHeaders.value(i)).mo244562k(10);
            }
            a.mo244530b(new StatusLine(this.protocol, this.code, this.message).toString()).mo244562k(10);
            a.mo244554h((long) (this.responseHeaders.size() + 2)).mo244562k(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a.mo244530b(this.responseHeaders.name(i2)).mo244530b(": ").mo244530b(this.responseHeaders.value(i2)).mo244562k(10);
            }
            a.mo244530b(SENT_MILLIS).mo244530b(": ").mo244554h(this.sentRequestMillis).mo244562k(10);
            a.mo244530b(RECEIVED_MILLIS).mo244530b(": ").mo244554h(this.receivedResponseMillis).mo244562k(10);
            if (isHttps()) {
                a.mo244562k(10);
                a.mo244530b(this.handshake.cipherSuite().javaName()).mo244562k(10);
                writeCertList(a, this.handshake.peerCertificates());
                writeCertList(a, this.handshake.localCertificates());
                a.mo244530b(this.handshake.tlsVersion().javaName()).mo244562k(10);
            }
            a.close();
        }

        private void writeCertList(AbstractC69698d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.mo244554h((long) list.size()).mo244562k(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo244530b(ByteString.of(list.get(i).getEncoded()).base64()).mo244562k(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            if (!this.url.equals(request.url().toString()) || !this.requestMethod.equals(request.method()) || !HttpHeaders.varyMatches(response, this.varyHeaders, request)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    private void abortQuietly(@Nullable DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void remove(Request request) throws IOException {
        this.cache.remove(key(request.url()));
    }

    public static String key(HttpUrl httpUrl) {
        return ByteString.encodeUtf8(httpUrl.toString()).md5().hex();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    static int readInt(AbstractC69699e eVar) throws IOException {
        try {
            long readDecimalLong = eVar.readDecimalLong();
            String readUtf8LineStrict = eVar.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    /* access modifiers changed from: package-private */
    public void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            editor = null;
            abortQuietly(editor);
        }
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            /* class okhttp3.Cache.C696451 */

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public Response get(Request request) throws IOException {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) throws IOException {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) throws IOException {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, 201105, 2, j);
    }
}

package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.AbstractC69699e;
import okio.C69694c;

public abstract class ResponseBody implements Closeable {
    private Reader reader;

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    public abstract AbstractC69699e source();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    private Charset charset() {
        MediaType contentType = contentType();
        if (contentType != null) {
            return contentType.charset(Util.UTF_8);
        }
        return Util.UTF_8;
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final AbstractC69699e source;

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        BomAwareReader(AbstractC69699e eVar, Charset charset2) {
            this.source = eVar;
            this.charset = charset2;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final String string() throws IOException {
        AbstractC69699e source = source();
        try {
            return source.readString(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            AbstractC69699e source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                Util.closeQuietly(source);
                if (contentLength == -1 || contentLength == ((long) readByteArray.length)) {
                    return readByteArray;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + readByteArray.length + ") disagree");
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public static ResponseBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, (long) bArr.length, new C69694c().mo244533b(bArr));
    }

    public static ResponseBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        C69694c a = new C69694c().mo244520a(str, charset);
        return create(mediaType, a.mo244510a(), a);
    }

    public static ResponseBody create(@Nullable final MediaType mediaType, final long j, final AbstractC69699e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new ResponseBody() {
            /* class okhttp3.ResponseBody.C696611 */

            @Override // okhttp3.ResponseBody
            public long contentLength() {
                return j;
            }

            @Override // okhttp3.ResponseBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.ResponseBody
            public AbstractC69699e source() {
                return eVar;
            }
        };
    }
}

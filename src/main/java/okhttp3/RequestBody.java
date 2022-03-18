package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.AbstractC69698d;
import okio.AbstractC69723u;
import okio.ByteString;
import okio.C69705k;

public abstract class RequestBody {
    public long contentLength() throws IOException {
        return -1;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(AbstractC69698d dVar) throws IOException;

    public static RequestBody create(@Nullable final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() {
            /* class okhttp3.RequestBody.C696581 */

            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() throws IOException {
                return (long) byteString.size();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(AbstractC69698d dVar) throws IOException {
                dVar.mo244532b(byteString);
            }
        };
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final File file) {
        Objects.requireNonNull(file, "content == null");
        return new RequestBody() {
            /* class okhttp3.RequestBody.C696603 */

            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return file.length();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(AbstractC69698d dVar) throws IOException {
                AbstractC69723u uVar = null;
                try {
                    uVar = C69705k.m267595a(file);
                    dVar.mo244513a(uVar);
                } finally {
                    Util.closeQuietly(uVar);
                }
            }
        };
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        Objects.requireNonNull(bArr, "content == null");
        Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
        return new RequestBody() {
            /* class okhttp3.RequestBody.C696592 */

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return (long) i2;
            }

            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(AbstractC69698d dVar) throws IOException {
                dVar.mo244534b(bArr, i, i2);
            }
        };
    }
}

package okhttp3;

import com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.AbstractC69698d;
import okio.ByteString;
import okio.C69694c;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.parse("multipart/alternative");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {StrictLineReader.f164804b, 10};
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.parse("multipart/digest");
    public static final MediaType FORM = MediaType.parse("multipart/form-data");
    public static final MediaType MIXED = MediaType.parse("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.parse("multipart/parallel");
    private final ByteString boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;

    public static final class Part {
        final RequestBody body;
        @Nullable
        final Headers headers;

        public RequestBody body() {
            return this.body;
        }

        @Nullable
        public Headers headers() {
            return this.headers;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        private Part(@Nullable Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part create(@Nullable Headers headers2, RequestBody requestBody) {
            Objects.requireNonNull(requestBody, "body == null");
            if (headers2 != null && headers2.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (headers2 == null || headers2.get("Content-Length") == null) {
                return new Part(headers2, requestBody);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            Objects.requireNonNull(str, "name == null");
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(Headers.of("Content-Disposition", sb.toString()), requestBody);
        }
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public List<Part> parts() {
        return this.parts;
    }

    public MediaType type() {
        return this.originalType;
    }

    public String boundary() {
        return this.boundary.utf8();
    }

    public int size() {
        return this.parts.size();
    }

    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = ByteString.encodeUtf8(str);
        }

        public Builder addPart(Part part) {
            Objects.requireNonNull(part, "part == null");
            this.parts.add(part);
            return this;
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public Builder setType(MediaType mediaType) {
            Objects.requireNonNull(mediaType, "type == null");
            if (mediaType.type().equals("multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + mediaType);
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(AbstractC69698d dVar) throws IOException {
        writeOrCountBytes(dVar, false);
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: okio.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: okio.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: okio.c */
    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(@Nullable AbstractC69698d dVar, boolean z) throws IOException {
        C69694c cVar;
        if (z) {
            dVar = new C69694c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            dVar.mo244533b(DASHDASH);
            dVar.mo244532b(this.boundary);
            dVar.mo244533b(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dVar.mo244530b(headers.name(i2)).mo244533b(COLONSPACE).mo244530b(headers.value(i2)).mo244533b(CRLF);
                }
            }
            MediaType contentType2 = requestBody.contentType();
            if (contentType2 != null) {
                dVar.mo244530b("Content-Type: ").mo244530b(contentType2.toString()).mo244533b(CRLF);
            }
            long contentLength2 = requestBody.contentLength();
            if (contentLength2 != -1) {
                dVar.mo244530b("Content-Length: ").mo244554h(contentLength2).mo244533b(CRLF);
            } else if (z) {
                cVar.mo244551g();
                return -1;
            }
            byte[] bArr = CRLF;
            dVar.mo244533b(bArr);
            if (z) {
                j += contentLength2;
            } else {
                requestBody.writeTo(dVar);
            }
            dVar.mo244533b(bArr);
        }
        byte[] bArr2 = DASHDASH;
        dVar.mo244533b(bArr2);
        dVar.mo244532b(this.boundary);
        dVar.mo244533b(bArr2);
        dVar.mo244533b(CRLF);
        if (!z) {
            return j;
        }
        long a = j + cVar.mo244510a();
        cVar.mo244551g();
        return a;
    }

    MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        this.boundary = byteString;
        this.originalType = mediaType;
        this.contentType = MediaType.parse(mediaType + "; boundary=" + byteString.utf8());
        this.parts = Util.immutableList(list);
    }
}

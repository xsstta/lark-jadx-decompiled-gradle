package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.AbstractC69698d;
import okio.C69694c;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset2) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset2;
        }

        public Builder add(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
            return this;
        }

        public Builder addEncoded(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
            return this;
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(AbstractC69698d dVar) throws IOException {
        writeOrCountBytes(dVar, false);
    }

    public String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(@Nullable AbstractC69698d dVar, boolean z) {
        C69694c cVar;
        if (z) {
            cVar = new C69694c();
        } else {
            cVar = dVar.buffer();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.mo244562k(38);
            }
            cVar.mo244530b(this.encodedNames.get(i));
            cVar.mo244562k(61);
            cVar.mo244530b(this.encodedValues.get(i));
        }
        if (!z) {
            return 0;
        }
        long a = cVar.mo244510a();
        cVar.mo244551g();
        return a;
    }
}

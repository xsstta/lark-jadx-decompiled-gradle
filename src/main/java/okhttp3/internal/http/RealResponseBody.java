package okhttp3.internal.http;

import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.AbstractC69699e;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    @Nullable
    private final String contentTypeString;
    private final AbstractC69699e source;

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public AbstractC69699e source() {
        return this.source;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public RealResponseBody(@Nullable String str, long j, AbstractC69699e eVar) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = eVar;
    }
}

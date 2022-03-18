package okhttp3.internal.huc;

import java.io.IOException;
import okhttp3.internal.http.UnrepeatableRequestBody;
import okio.AbstractC69698d;
import okio.C69694c;
import okio.C69705k;
import okio.C69711m;

/* access modifiers changed from: package-private */
public final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final C69711m pipe;

    StreamedRequestBody(long j) {
        C69711m mVar = new C69711m(8192);
        this.pipe = mVar;
        initOutputStream(C69705k.m267589a(mVar.mo244600b()), j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(AbstractC69698d dVar) throws IOException {
        C69694c cVar = new C69694c();
        while (this.pipe.mo244599a().read(cVar, 8192) != -1) {
            dVar.write(cVar, cVar.mo244510a());
        }
    }
}

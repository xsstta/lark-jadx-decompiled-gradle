package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C1930e;
import com.android.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.android.volley.toolbox.a */
class C1946a extends AbstractC1947b {

    /* renamed from: a */
    private final AbstractC1958i f6635a;

    C1946a(AbstractC1958i iVar) {
        this.f6635a = iVar;
    }

    @Override // com.android.volley.toolbox.AbstractC1947b
    /* renamed from: a */
    public C1957h mo9828a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            HttpResponse b = this.f6635a.mo9829b(request, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C1930e(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new C1957h(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C1957h(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C1930e;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.android.volley.toolbox.b */
public abstract class AbstractC1947b implements AbstractC1958i {
    /* renamed from: a */
    public abstract C1957h mo9828a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;

    @Override // com.android.volley.toolbox.AbstractC1958i
    /* renamed from: b */
    public final HttpResponse mo9829b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        C1957h a = mo9828a(request, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.mo9845a(), ""));
        ArrayList arrayList = new ArrayList();
        for (C1930e eVar : a.mo9846b()) {
            arrayList.add(new BasicHeader(eVar.mo9799a(), eVar.mo9800b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream d = a.mo9848d();
        if (d != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(d);
            basicHttpEntity.setContentLength((long) a.mo9847c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}

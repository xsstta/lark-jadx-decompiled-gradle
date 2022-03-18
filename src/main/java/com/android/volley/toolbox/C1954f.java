package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.android.volley.toolbox.f */
public class C1954f implements AbstractC1958i {

    /* renamed from: a */
    protected final HttpClient f6659a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9843a(HttpUriRequest httpUriRequest) throws IOException {
    }

    /* renamed from: com.android.volley.toolbox.f$a */
    public static final class C1955a extends HttpEntityEnclosingRequestBase {
        public String getMethod() {
            return "PATCH";
        }

        public C1955a() {
        }

        public C1955a(String str) {
            setURI(URI.create(str));
        }
    }

    public C1954f(HttpClient httpClient) {
        this.f6659a = httpClient;
    }

    /* renamed from: a */
    private static void m8654a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request<?> request) throws AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    /* renamed from: a */
    private static void m8655a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.AbstractC1958i
    /* renamed from: b */
    public HttpResponse mo9829b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpUriRequest a = m8653a(request, map);
        m8655a(a, map);
        m8655a(a, request.getHeaders());
        mo9843a(a);
        HttpParams params = a.getParams();
        int timeoutMs = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return this.f6659a.execute(a);
    }

    /* renamed from: a */
    static HttpUriRequest m8653a(Request<?> request, Map<String, String> map) throws AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody == null) {
                    return new HttpGet(request.getUrl());
                }
                HttpPost httpPost = new HttpPost(request.getUrl());
                httpPost.addHeader("Content-Type", request.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                return httpPost;
            case 0:
                return new HttpGet(request.getUrl());
            case 1:
                HttpPost httpPost2 = new HttpPost(request.getUrl());
                httpPost2.addHeader("Content-Type", request.getBodyContentType());
                m8654a((HttpEntityEnclosingRequestBase) httpPost2, request);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(request.getUrl());
                httpPut.addHeader("Content-Type", request.getBodyContentType());
                m8654a((HttpEntityEnclosingRequestBase) httpPut, request);
                return httpPut;
            case 3:
                return new HttpDelete(request.getUrl());
            case 4:
                return new HttpHead(request.getUrl());
            case 5:
                return new HttpOptions(request.getUrl());
            case 6:
                return new HttpTrace(request.getUrl());
            case 7:
                C1955a aVar = new C1955a(request.getUrl());
                aVar.addHeader("Content-Type", request.getBodyContentType());
                m8654a((HttpEntityEnclosingRequestBase) aVar, request);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }
}

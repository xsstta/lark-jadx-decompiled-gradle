package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C1930e;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.android.volley.toolbox.j */
public class C1959j extends AbstractC1947b {

    /* renamed from: a */
    private final AbstractC1961b f6664a;

    /* renamed from: b */
    private final SSLSocketFactory f6665b;

    /* renamed from: com.android.volley.toolbox.j$b */
    public interface AbstractC1961b {
        /* renamed from: a */
        String mo9851a(String str);
    }

    /* renamed from: a */
    private static boolean m8675a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    public C1959j() {
        this(null);
    }

    /* renamed from: com.android.volley.toolbox.j$a */
    static class C1960a extends FilterInputStream {

        /* renamed from: a */
        private final HttpURLConnection f6666a;

        @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() throws IOException {
            super.close();
            this.f6666a.disconnect();
        }

        C1960a(HttpURLConnection httpURLConnection) {
            super(C1959j.m8670a(httpURLConnection));
            this.f6666a = httpURLConnection;
        }
    }

    public C1959j(AbstractC1961b bVar) {
        this(bVar, null);
    }

    /* renamed from: a */
    public static InputStream m8670a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    static List<C1930e> m8672a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new C1930e(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo9849a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: b */
    private static void m8676b(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            m8674a(httpURLConnection, request, body);
        }
    }

    public C1959j(AbstractC1961b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f6664a = bVar;
        this.f6665b = sSLSocketFactory;
    }

    /* renamed from: a */
    private HttpURLConnection m8671a(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection a = mo9849a(url);
        int timeoutMs = request.getTimeoutMs();
        a.setConnectTimeout(timeoutMs);
        a.setReadTimeout(timeoutMs);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f6665b) != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(sSLSocketFactory);
        }
        return a;
    }

    /* renamed from: a */
    static void m8673a(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m8674a(httpURLConnection, request, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m8676b(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m8676b(httpURLConnection, request);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m8676b(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.android.volley.toolbox.AbstractC1947b
    /* renamed from: a */
    public C1957h mo9828a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        AbstractC1961b bVar = this.f6664a;
        if (bVar != null) {
            String a = bVar.mo9851a(url);
            if (a != null) {
                url = a;
            } else {
                throw new IOException("URL blocked by rewriter: " + url);
            }
        }
        HttpURLConnection a2 = m8671a(new URL(url), request);
        try {
            for (String str : hashMap.keySet()) {
                a2.setRequestProperty(str, (String) hashMap.get(str));
            }
            m8673a(a2, request);
            int responseCode = a2.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            } else if (m8675a(request.getMethod(), responseCode)) {
                return new C1957h(responseCode, m8672a(a2.getHeaderFields()), a2.getContentLength(), new C1960a(a2));
            } else {
                C1957h hVar = new C1957h(responseCode, m8672a(a2.getHeaderFields()));
                a2.disconnect();
                return hVar;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                a2.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m8674a(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}

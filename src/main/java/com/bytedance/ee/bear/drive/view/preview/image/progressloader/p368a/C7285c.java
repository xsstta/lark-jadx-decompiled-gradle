package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7328b;
import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.c */
public class C7285c {

    /* renamed from: a */
    private static final AbstractC7288b f19528a = new C7287a();

    /* renamed from: b */
    private final C7282a f19529b;

    /* renamed from: c */
    private final AbstractC7288b f19530c;

    /* renamed from: d */
    private HttpURLConnection f19531d;

    /* renamed from: e */
    private InputStream f19532e;

    /* renamed from: f */
    private volatile boolean f19533f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.c$b */
    public interface AbstractC7288b {
        /* renamed from: a */
        HttpURLConnection mo28468a(URL url) throws IOException;
    }

    /* renamed from: c */
    public void mo28467c() {
        this.f19533f = true;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a.c$a */
    private static class C7287a implements AbstractC7288b {
        private C7287a() {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7285c.AbstractC7288b
        /* renamed from: a */
        public HttpURLConnection mo28468a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: a */
    public InputStream mo28465a() throws Exception {
        return m29114a(this.f19529b.mo28457a(), 0, null, this.f19529b.mo28459c());
    }

    /* renamed from: b */
    public void mo28466b() {
        InputStream inputStream = this.f19532e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f19531d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public C7285c(C7282a aVar) {
        this(aVar, f19528a);
    }

    /* renamed from: a */
    private InputStream m29113a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f19532e = C7328b.m29277a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            C13479a.m54772d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            this.f19532e = httpURLConnection.getInputStream();
        }
        return this.f19532e;
    }

    C7285c(C7282a aVar, AbstractC7288b bVar) {
        this.f19529b = aVar;
        this.f19530c = bVar;
    }

    /* renamed from: a */
    private InputStream m29114a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f19531d = this.f19530c.mo28468a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f19531d.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f19531d.setConnectTimeout(30000);
            this.f19531d.setReadTimeout(30000);
            this.f19531d.setUseCaches(false);
            this.f19531d.setDoInput(true);
            this.f19531d.connect();
            if (this.f19533f) {
                return null;
            }
            int responseCode = this.f19531d.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                return m29113a(this.f19531d);
            }
            if (i2 == 3) {
                String headerField = this.f19531d.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    return m29114a(new URL(url, headerField), i + 1, url, map);
                }
                throw new IOException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
            } else {
                throw new IOException("GenericRequest failed " + responseCode + ": " + this.f19531d.getResponseMessage());
            }
        } else {
            throw new IOException("Too many (> 5) redirects!");
        }
    }
}

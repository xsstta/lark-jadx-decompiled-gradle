package com.bumptech.glide.load.p083a;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.util.C2558c;
import com.bumptech.glide.util.C2563f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.j */
public class C2157j implements AbstractC2147d<InputStream> {

    /* renamed from: a */
    static final AbstractC2159b f7456a = new C2158a();

    /* renamed from: b */
    private final C2219g f7457b;

    /* renamed from: c */
    private final int f7458c;

    /* renamed from: d */
    private final AbstractC2159b f7459d;

    /* renamed from: e */
    private HttpURLConnection f7460e;

    /* renamed from: f */
    private InputStream f7461f;

    /* renamed from: g */
    private volatile boolean f7462g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.a.j$b */
    public interface AbstractC2159b {
        /* renamed from: a */
        HttpURLConnection mo10520a(URL url) throws IOException;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
        this.f7462g = true;
    }

    /* renamed from: com.bumptech.glide.load.a.j$a */
    private static class C2158a implements AbstractC2159b {
        C2158a() {
        }

        @Override // com.bumptech.glide.load.p083a.C2157j.AbstractC2159b
        /* renamed from: a */
        public HttpURLConnection mo10520a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<InputStream> mo10481a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        InputStream inputStream = this.f7461f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f7460e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f7460e = null;
    }

    /* renamed from: a */
    private static boolean m9383a(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m9384b(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private InputStream m9381a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f7461f = C2558c.m10872a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f7461f = httpURLConnection.getInputStream();
        }
        return this.f7461f;
    }

    public C2157j(C2219g gVar, int i) {
        this(gVar, i, f7456a);
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super InputStream> aVar) {
        StringBuilder sb;
        long a = C2563f.m10880a();
        try {
            aVar.mo10503a(m9382a(this.f7457b.mo10575a(), 0, null, this.f7457b.mo10577c()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C2563f.m10879a(a));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo10502a((Exception) e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C2563f.m10879a(a));
            }
            throw th;
        }
    }

    C2157j(C2219g gVar, int i, AbstractC2159b bVar) {
        this.f7457b = gVar;
        this.f7458c = i;
        this.f7459d = bVar;
    }

    /* renamed from: a */
    private InputStream m9382a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f7460e = this.f7459d.mo10520a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f7460e.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f7460e.setConnectTimeout(this.f7458c);
            this.f7460e.setReadTimeout(this.f7458c);
            this.f7460e.setUseCaches(false);
            this.f7460e.setDoInput(true);
            this.f7460e.setInstanceFollowRedirects(false);
            this.f7460e.connect();
            this.f7461f = this.f7460e.getInputStream();
            if (this.f7462g) {
                return null;
            }
            int responseCode = this.f7460e.getResponseCode();
            if (m9383a(responseCode)) {
                return m9381a(this.f7460e);
            }
            if (m9384b(responseCode)) {
                String headerField = this.f7460e.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo10489b();
                    return m9382a(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f7460e.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }
}

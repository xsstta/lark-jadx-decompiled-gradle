package com.bytedance.ee.bear.facade.glide;

import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.bear.facade.glide.b */
public class C7768b implements AbstractC2147d<InputStream> {

    /* renamed from: a */
    private final Call.Factory f21046a;

    /* renamed from: b */
    private final C13664a f21047b;

    /* renamed from: c */
    private InputStream f21048c;

    /* renamed from: d */
    private ResponseBody f21049d;

    /* renamed from: e */
    private volatile Call f21050e;

    /* renamed from: f */
    private volatile boolean f21051f;

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
    /* renamed from: c */
    public void mo10490c() {
        this.f21051f = true;
        Call call = this.f21050e;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        try {
            InputStream inputStream = this.f21048c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f21049d;
        if (responseBody != null) {
            responseBody.close();
        }
    }

    public C7768b(Call.Factory factory, C13664a aVar) {
        this.f21046a = factory;
        this.f21047b = aVar;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super InputStream> aVar) {
        try {
            if (this.f21047b.mo29120e()) {
                InputStream a = m31111a(this.f21047b.mo10575a(), 0, null, this.f21047b.mo10577c());
                if (a != null) {
                    aVar.mo10503a(a);
                } else {
                    aVar.mo10502a(new Exception("Request is canceled"));
                }
            } else {
                throw new IOException("url or headers is null");
            }
        } catch (Exception e) {
            C13479a.m54758a("OkHttpStreamFetcher", "loadData failed:" + e);
            aVar.mo10502a(e);
        }
    }

    /* renamed from: a */
    private InputStream m31111a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            Request.Builder url3 = new Request.Builder().url(this.f21047b.mo10576b());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                url3.addHeader(entry.getKey(), entry.getValue());
            }
            this.f21050e = this.f21046a.newCall(url3.build());
            Response execute = this.f21050e.execute();
            if (this.f21051f) {
                return null;
            }
            int code = execute.code();
            this.f21049d = execute.body();
            int i2 = code / 100;
            if (i2 == 2) {
                InputStream byteStream = execute.body().byteStream();
                this.f21048c = byteStream;
                return byteStream;
            } else if (i2 == 3) {
                String header = execute.header("Location");
                if (!TextUtils.isEmpty(header)) {
                    return m31111a(new URL(url, header), i + 1, url, map);
                }
                throw new IOException("Received empty or null redirect url");
            } else if (code == -1) {
                throw new IOException("Unable to retrieve response code from OkHttpClient.");
            } else {
                throw new IOException("Request failed " + code + ": " + execute.message());
            }
        } else {
            throw new IOException("Too many (> 5) redirects!");
        }
    }
}

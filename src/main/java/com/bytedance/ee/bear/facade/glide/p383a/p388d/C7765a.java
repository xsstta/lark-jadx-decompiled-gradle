package com.bytedance.ee.bear.facade.glide.p383a.p388d;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.p387a.AbstractC7757b;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.p387a.C7756a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.d.a */
public class C7765a {

    /* renamed from: f */
    private static List<AbstractC7757b> f21037f;

    /* renamed from: a */
    private C7754c f21038a;

    /* renamed from: b */
    private final Call.Factory f21039b;

    /* renamed from: c */
    private volatile boolean f21040c;

    /* renamed from: d */
    private volatile Call f21041d;

    /* renamed from: e */
    private ResponseBody f21042e;

    static {
        ArrayList arrayList = new ArrayList();
        f21037f = arrayList;
        arrayList.add(new C7756a());
    }

    /* renamed from: b */
    public void mo30402b() {
        this.f21040c = true;
        Call call = this.f21041d;
        if (call != null) {
            call.cancel();
        }
    }

    /* renamed from: a */
    public void mo30401a() {
        ResponseBody responseBody = this.f21042e;
        if (responseBody != null) {
            try {
                responseBody.close();
            } catch (Throwable th) {
                C13479a.m54761a("ThumbDownloadTask", th);
            }
        }
    }

    /* renamed from: a */
    private void m31100a(Response response) {
        try {
            response.close();
        } catch (Exception e) {
            C13479a.m54761a("ThumbDownloadTask", e);
        }
    }

    public C7765a(Call.Factory factory, C7754c cVar) {
        this.f21039b = factory;
        this.f21038a = cVar;
    }

    /* renamed from: a */
    public InputStream mo30400a(URL url, int i, URL url2, String str) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            Request.Builder url3 = new Request.Builder().url(url);
            for (Map.Entry<String, String> entry : this.f21038a.mo10577c().entrySet()) {
                url3.addHeader(entry.getKey(), entry.getValue());
            }
            new C10917c(new C10929e());
            al d = C4511g.m18594d();
            url3.addHeader("If-None-Match", str);
            url3.addHeader("User-Agent", d.mo17352M());
            url3.addHeader("use-new-default-thumbnail", "true");
            this.f21041d = this.f21039b.newCall(url3.build());
            Response execute = this.f21041d.execute();
            if (this.f21040c) {
                if (execute != null) {
                    m31100a(execute);
                }
                return null;
            }
            String header = execute.header("etag", "");
            if (!TextUtils.isEmpty(header)) {
                C7745a.m31019a().mo30367a(url.toString(), header, this.f21038a.mo30395w());
                this.f21038a.mo30379b(header);
            }
            for (AbstractC7757b bVar : f21037f) {
                if (bVar.mo30398a(execute)) {
                    this.f21038a.mo30377a(true);
                    C7745a.m31019a().mo30368a(this.f21038a.mo29122g(), true, this.f21038a.mo30395w());
                    InputStream a = bVar.mo30397a(this.f21038a, execute);
                    m31100a(execute);
                    return a;
                }
            }
            this.f21038a.mo30377a(false);
            C7745a.m31019a().mo30368a(this.f21038a.mo29122g(), false, this.f21038a.mo30395w());
            int code = execute.code();
            ResponseBody body = execute.body();
            this.f21042e = body;
            int i2 = code / 100;
            if (i2 == 2) {
                return body.byteStream();
            }
            if (i2 == 3) {
                String header2 = execute.header("Location");
                if (TextUtils.equals(header, str) || TextUtils.isEmpty(header2)) {
                    return null;
                }
                return mo30400a(new URL(url, header2), i + 1, url, "");
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

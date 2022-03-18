package com.bytedance.ee.bear.middleground.comment.p447e;

import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.imageviewer.C7842a;
import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.comment.e.c */
public class C9214c implements AbstractC2147d<InputStream> {

    /* renamed from: a */
    private final Call.Factory f24777a;

    /* renamed from: b */
    private final C9213b f24778b;

    /* renamed from: c */
    private InputStream f24779c;

    /* renamed from: d */
    private ResponseBody f24780d;

    /* renamed from: e */
    private volatile Call f24781e;

    /* renamed from: f */
    private volatile boolean f24782f;

    /* renamed from: g */
    private C7842a f24783g = new C7842a(C5234y.m21391b());

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
        this.f24782f = true;
        Call call = this.f24781e;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        try {
            InputStream inputStream = this.f24779c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f24780d;
        if (responseBody != null) {
            responseBody.close();
        }
    }

    public C9214c(Call.Factory factory, C9213b bVar) {
        this.f24777a = factory;
        this.f24778b = bVar;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super InputStream> aVar) {
        try {
            if (this.f24778b.mo29120e()) {
                InputStream a = m38072a(this.f24778b.mo10575a(), 0, (URL) null);
                if (a != null) {
                    C13479a.m54764b("CommentImageStreamFetcher", "loadData succeed.");
                    aVar.mo10503a(a);
                    return;
                }
                C13479a.m54758a("CommentImageStreamFetcher", "loadData failed.");
                aVar.mo10502a(new Exception("Request is canceled"));
                return;
            }
            throw new IOException("url is null");
        } catch (Exception e) {
            C13479a.m54758a("CommentImageStreamFetcher", "loadData failed with exception:" + e);
            aVar.mo10502a(e);
        }
    }

    /* renamed from: a */
    private void m38073a(int i, String str, long j) {
        C7842a aVar = this.f24783g;
        if (aVar != null) {
            aVar.mo30646a(i, str, "commentCardDocs", -1, j, -1);
        }
    }

    /* renamed from: a */
    private InputStream m38072a(URL url, int i, URL url2) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            Request.Builder url3 = new Request.Builder().url(this.f24778b.mo10576b());
            for (Map.Entry<String, String> entry : this.f24778b.mo10577c().entrySet()) {
                url3.addHeader(entry.getKey(), entry.getValue());
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f24781e = this.f24777a.newCall(url3.build());
            Response execute = this.f24781e.execute();
            if (this.f24782f) {
                return null;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            int code = execute.code();
            C13479a.m54764b("CommentImageStreamFetcher", "statusCode =" + code + ", costTime=" + currentTimeMillis2);
            this.f24780d = execute.body();
            if (code == 200 && execute.body() != null) {
                this.f24783g.mo30647a("commentCardDocs", execute.body().contentLength(), currentTimeMillis2);
                InputStream byteStream = execute.body().byteStream();
                this.f24779c = byteStream;
                return byteStream;
            } else if (code / 100 == 3) {
                String header = execute.header("Location");
                if (!TextUtils.isEmpty(header)) {
                    return m38072a(new URL(url, header), i + 1, url);
                }
                throw new IOException("Received empty or null redirect url");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(execute.body().string());
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("message");
                    C13479a.m54772d("CommentImageStreamFetcher", "parse json code=" + i2 + "; message=" + string);
                    m38073a(i2, string, currentTimeMillis2);
                } catch (JSONException unused2) {
                    C13479a.m54758a("CommentImageStreamFetcher", "parse json data fail.");
                    m38073a(code, execute.message(), currentTimeMillis2);
                }
                throw new IOException("Request failed " + code + ": " + execute.message());
            }
        } else {
            throw new IOException("Too many (> 5) redirects!");
        }
    }
}

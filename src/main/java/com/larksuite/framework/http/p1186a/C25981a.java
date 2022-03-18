package com.larksuite.framework.http.p1186a;

import android.text.TextUtils;
import com.larksuite.framework.http.p1186a.C25984b;
import com.larksuite.framework.http.p1188c.C25997a;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.FormBody;
import com.larksuite.framework.http.request.HttpHeaders;
import com.larksuite.framework.http.response.ErrorResult;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.larksuite.framework.http.a.a */
public class C25981a<T> implements AbstractC25988d<T> {

    /* renamed from: a */
    protected C26010a<T> f64326a;

    /* renamed from: b */
    protected OkHttpClient f64327b;

    /* renamed from: c */
    protected Call f64328c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.framework.http.a.a$2 */
    public static /* synthetic */ class C259832 {

        /* renamed from: a */
        static final /* synthetic */ int[] f64331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.larksuite.framework.http.request.HttpMethod[] r0 = com.larksuite.framework.http.request.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.framework.http.p1186a.C25981a.C259832.f64331a = r0
                com.larksuite.framework.http.request.HttpMethod r1 = com.larksuite.framework.http.request.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.framework.http.p1186a.C25981a.C259832.f64331a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.framework.http.request.HttpMethod r1 = com.larksuite.framework.http.request.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.http.p1186a.C25981a.C259832.<clinit>():void");
        }
    }

    @Override // com.larksuite.framework.http.p1186a.AbstractC25988d
    /* renamed from: a */
    public void mo92408a(final AbstractC26011b<T> bVar) {
        this.f64328c.enqueue(new Callback() {
            /* class com.larksuite.framework.http.p1186a.C25981a.C259821 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                ErrorResult errorResult = new ErrorResult(-1, 0, iOException.getMessage());
                AbstractC26011b bVar = bVar;
                if (bVar != null) {
                    bVar.mo86433a(errorResult);
                }
                C25984b.m94076a(C25981a.this.f64326a, 0, errorResult.getErrorMessage());
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                C25984b.C25986a a = C25984b.m94073a(C25997a.m94105a(bVar.getClass()), C25981a.this.f64326a.mo92480c(), C25981a.this.f64326a, response);
                if (a.f64334b != null) {
                    C25984b.m94076a(C25981a.this.f64326a, 0, a.f64334b.getErrorMessage());
                    bVar.mo86433a(a.f64334b);
                    return;
                }
                C25984b.m94076a(C25981a.this.f64326a, 0, null);
                bVar.mo86434a((Object) a.f64333a);
            }
        });
    }

    /* renamed from: a */
    private Request m94069a(C26010a aVar) {
        String c = aVar.mo92480c();
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        Request.Builder url = new Request.Builder().url(c);
        HttpHeaders h = aVar.mo92486h();
        if (!h.isEmpty()) {
            for (String str : h.getNames()) {
                url.addHeader(str, h.get(str));
            }
        }
        int i = C259832.f64331a[aVar.mo92483e().ordinal()];
        if (i == 1) {
            url.get();
        } else if (i == 2) {
            url.post(m94070b(aVar));
        }
        return url.build();
    }

    /* renamed from: b */
    private RequestBody m94070b(C26010a aVar) {
        com.larksuite.framework.http.request.RequestBody f = aVar.mo92484f();
        if (f == null) {
            return null;
        }
        if (f instanceof FormBody) {
            FormBody formBody = (FormBody) f;
            Charset charset = formBody.getCharset();
            FormBody.Builder builder = new FormBody.Builder();
            Map<String, String> name2Value = formBody.getName2Value();
            for (String str : name2Value.keySet()) {
                String str2 = name2Value.get(str);
                if (charset == null) {
                    builder.add(str, str2);
                } else {
                    builder.addEncoded(str, str2);
                }
            }
            return builder.build();
        }
        try {
            MediaType parse = MediaType.parse(f.getMediaType());
            if (f.getContent() != null) {
                return RequestBody.create(parse, f.getContent());
            }
            return RequestBody.create(parse, f.getBytesContent());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.larksuite.framework.http.p1186a.AbstractC25988d
    /* renamed from: a */
    public T mo92407a(Class<T> cls) {
        try {
            C25984b.C25986a a = C25984b.m94073a(cls, this.f64326a.mo92480c(), this.f64326a, this.f64328c.execute());
            if (a.f64334b != null) {
                Log.m165383e("CallImpl", "execute error = " + a.f64334b);
                C25984b.m94076a(this.f64326a, 0, a.f64334b.getErrorMessage());
                return null;
            }
            C25984b.m94076a(this.f64326a, 0, null);
            return a.f64333a;
        } catch (IOException e) {
            e.printStackTrace();
            C25984b.m94076a(this.f64326a, 0, e.getMessage());
            return null;
        }
    }

    public C25981a(OkHttpClient okHttpClient, C26010a<T> aVar) {
        this.f64326a = aVar;
        this.f64327b = okHttpClient;
        this.f64328c = this.f64327b.newCall(m94069a(aVar));
    }
}

package com.bytedance.ee.falcon.inspector;

import com.bytedance.ee.falcon.inspector.network.AbstractC12674i;
import com.bytedance.ee.falcon.inspector.network.C12669f;
import com.bytedance.ee.falcon.inspector.network.C12680j;
import com.bytedance.ee.falcon.inspector.network.C12683l;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69698d;
import okio.AbstractC69699e;
import okio.C69705k;

/* renamed from: com.bytedance.ee.falcon.inspector.b */
public class C12644b implements Interceptor {

    /* renamed from: a */
    private final AbstractC12674i f33874a = C12680j.m52524c();

    /* renamed from: com.bytedance.ee.falcon.inspector.b$a */
    private static class C12645a extends ResponseBody {

        /* renamed from: a */
        private final ResponseBody f33875a;

        /* renamed from: b */
        private final AbstractC69699e f33876b;

        @Override // okhttp3.ResponseBody
        public AbstractC69699e source() {
            return this.f33876b;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f33875a.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f33875a.contentType();
        }

        public C12645a(ResponseBody responseBody, InputStream inputStream) {
            this.f33875a = responseBody;
            this.f33876b = C69705k.m267590a(C69705k.m267596a(inputStream));
        }
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.b$b */
    private static class C12646b implements AbstractC12674i.AbstractC12676b {

        /* renamed from: a */
        private final String f33877a;

        /* renamed from: b */
        private final Request f33878b;

        /* renamed from: c */
        private C12683l f33879c;

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12677c
        /* renamed from: b */
        public String mo48007b() {
            return null;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12676b
        /* renamed from: c */
        public Integer mo48009c() {
            return null;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12677c
        /* renamed from: a */
        public String mo48004a() {
            return this.f33877a;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12676b
        /* renamed from: e */
        public String mo48011e() {
            return this.f33878b.method();
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12676b
        /* renamed from: d */
        public String mo48010d() {
            return this.f33878b.url().toString();
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: g */
        public int mo48013g() {
            return this.f33878b.headers().size();
        }

        /* JADX INFO: finally extract failed */
        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12676b
        /* renamed from: f */
        public byte[] mo48012f() throws IOException {
            RequestBody body = this.f33878b.body();
            if (body == null) {
                return null;
            }
            AbstractC69698d a = C69705k.m267589a(C69705k.m267592a(this.f33879c.mo48066a(mo48006a("Content-Encoding"))));
            try {
                body.writeTo(a);
                a.close();
                return this.f33879c.mo48067a();
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: a */
        public String mo48006a(String str) {
            return this.f33878b.header(str);
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: a */
        public String mo48005a(int i) {
            return this.f33878b.headers().name(i);
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: b */
        public String mo48008b(int i) {
            return this.f33878b.headers().value(i);
        }

        public C12646b(String str, Request request, C12683l lVar) {
            this.f33877a = str;
            this.f33878b = request;
            this.f33879c = lVar;
        }
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.b$c */
    private static class C12647c implements AbstractC12674i.AbstractC12678d {

        /* renamed from: a */
        private final String f33880a;

        /* renamed from: b */
        private final Request f33881b;

        /* renamed from: c */
        private final Response f33882c;

        /* renamed from: d */
        private int f33883d = new Random().nextInt();

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12678d
        /* renamed from: e */
        public boolean mo48018e() {
            return false;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12679e
        /* renamed from: a */
        public String mo48014a() {
            return this.f33880a;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12678d
        /* renamed from: f */
        public int mo48019f() {
            return this.f33883d;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12679e
        /* renamed from: c */
        public int mo48016c() {
            return this.f33882c.code();
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12679e
        /* renamed from: d */
        public String mo48017d() {
            return this.f33882c.message();
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12678d
        /* renamed from: b */
        public String mo48015b() {
            return this.f33881b.url().toString();
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: g */
        public int mo48013g() {
            return this.f33882c.headers().size();
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12678d
        /* renamed from: h */
        public boolean mo48020h() {
            if (this.f33882c.cacheResponse() != null) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: a */
        public String mo48006a(String str) {
            return this.f33882c.header(str);
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: a */
        public String mo48005a(int i) {
            return this.f33882c.headers().name(i);
        }

        @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i.AbstractC12675a
        /* renamed from: b */
        public String mo48008b(int i) {
            return this.f33882c.headers().value(i);
        }

        public C12647c(String str, Request request, Response response) {
            this.f33880a = str;
            this.f33881b = request;
            this.f33882c = response;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        C12683l lVar;
        InputStream inputStream;
        MediaType mediaType;
        String b = this.f33874a.mo48061b();
        Request request = chain.request();
        String str = null;
        if (this.f33874a.mo48060a()) {
            lVar = new C12683l(this.f33874a, b);
            this.f33874a.mo48055a(new C12646b(b, request, lVar));
        } else {
            lVar = null;
        }
        try {
            Response proceed = chain.proceed(request);
            if (!this.f33874a.mo48060a()) {
                return proceed;
            }
            if (lVar != null && lVar.mo48068b()) {
                lVar.mo48069c();
            }
            this.f33874a.mo48056a(new C12647c(b, request, proceed));
            ResponseBody body = proceed.body();
            if (body != null) {
                mediaType = body.contentType();
                inputStream = body.byteStream();
            } else {
                mediaType = null;
                inputStream = null;
            }
            AbstractC12674i iVar = this.f33874a;
            if (mediaType != null) {
                str = mediaType.toString();
            }
            InputStream a = iVar.mo48054a(b, str, proceed.header("Content-Encoding"), inputStream, new C12669f(this.f33874a, b));
            if (a != null) {
                return proceed.newBuilder().body(new C12645a(body, a)).build();
            }
            return proceed;
        } catch (IOException e) {
            if (this.f33874a.mo48060a()) {
                this.f33874a.mo48059a(b, e.toString());
            }
            throw e;
        }
    }
}

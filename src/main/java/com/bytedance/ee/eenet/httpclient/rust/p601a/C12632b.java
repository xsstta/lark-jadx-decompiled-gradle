package com.bytedance.ee.eenet.httpclient.rust.p601a;

import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.eenet.httpclient.rust.p602b.C12637a;
import com.bytedance.ee.eenet.httpclient.rust.p602b.C12639c;
import com.bytedance.ee.eenet.httpclient.rust.p602b.C12640d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.sdk.HttpHeader;
import com.bytedance.lark.sdk.LarkNetApi;
import com.bytedance.lark.sdk.LarkRequest;
import com.bytedance.lark.sdk.LarkResponse;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.a.b */
public class C12632b implements Interceptor {

    /* renamed from: a */
    private final LarkNetApi f33840a;

    /* renamed from: b */
    private OkHttpClient f33841b;

    /* renamed from: c */
    private Request f33842c;

    /* renamed from: d */
    private LarkRequest f33843d;

    /* renamed from: e */
    private volatile boolean f33844e;

    /* renamed from: f */
    private volatile boolean f33845f;

    /* renamed from: g */
    private volatile boolean f33846g;

    /* renamed from: a */
    public void mo47965a() {
        this.f33845f = false;
    }

    /* renamed from: c */
    public boolean mo47967c() {
        return this.f33844e;
    }

    /* renamed from: d */
    private LarkRequest m52396d() throws RustIOException {
        return C12639c.m52410a(this.f33842c, this.f33841b).mo67116m();
    }

    /* renamed from: b */
    public void mo47966b() {
        if (!this.f33846g && !this.f33844e) {
            this.f33844e = true;
            LarkRequest larkRequest = this.f33843d;
            if (larkRequest != null) {
                this.f33840a.mo67182a(larkRequest.mo67088h());
            }
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        this.f33842c = chain.request();
        if (!this.f33845f) {
            this.f33845f = true;
            if (this.f33843d == null) {
                LarkRequest d = m52396d();
                this.f33843d = d;
                this.f33843d.mo67087g().add(new HttpHeader("EENet-XRequest-Id", String.valueOf(d.mo67088h())));
            }
            C13479a.m54764b("eenet_CallServerInterceptor", "rust net request task id: " + this.f33843d.mo67088h());
            if (!mo47967c()) {
                LarkResponse a = this.f33840a.mo67181a(this.f33843d);
                LarkResponse.ResponseError e = a.mo67121e();
                LarkResponse.InnerError d2 = a.mo67120d();
                int i = LarkResponse.InnerErrorCode.UNKNOWN.toInt();
                Response.Builder a2 = C12640d.m52413a(a);
                String str2 = "";
                if (e != null) {
                    str = e.mo67148b();
                    i = e.mo67147a().toInt();
                } else if (d2 != null) {
                    String b = d2.mo67144b();
                    i = d2.mo67143a().toInt();
                    str = b;
                } else {
                    str = str2;
                }
                a2.message(str);
                a2.request(this.f33842c);
                a2.addHeader("EENet-XRequest-Id", String.valueOf(this.f33843d.mo67088h()));
                String header = this.f33842c.header("request-id");
                if (header != null) {
                    str2 = header;
                }
                a2.addHeader("request-id", str2);
                Response build = a2.build();
                if (LarkResponse.ResponseStatus.CANCEL == a.mo67118b()) {
                    RustIOException rustIOException = new RustIOException("request cancel", -3331001);
                    rustIOException.setRequestCallInfo(C12637a.m52408a(build));
                    throw rustIOException;
                } else if (LarkResponse.ResponseStatus.ERROR != a.mo67118b()) {
                    this.f33846g = true;
                    return build;
                } else {
                    RustIOException rustIOException2 = new RustIOException(str, i);
                    rustIOException2.setRequestCallInfo(C12637a.m52408a(build));
                    throw rustIOException2;
                }
            } else {
                throw new RustIOException("request cancel", -3331001);
            }
        } else {
            throw new RustIOException(new IllegalStateException("Already mExecuted."), -3331002);
        }
    }

    public C12632b(OkHttpClient okHttpClient, LarkNetApi hVar) {
        this.f33840a = hVar;
        this.f33841b = okHttpClient;
    }
}

package com.bytedance.ee.eenet.httpclient.rust.p601a;

import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.a.d */
public class C12634d implements Interceptor.Chain {

    /* renamed from: a */
    private final List<Interceptor> f33851a;

    /* renamed from: b */
    private final int f33852b;

    /* renamed from: c */
    private final Request f33853c;

    /* renamed from: d */
    private final Call f33854d;

    /* renamed from: e */
    private int f33855e;

    /* renamed from: f */
    private final int f33856f;

    /* renamed from: g */
    private final int f33857g;

    /* renamed from: h */
    private final int f33858h;

    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.f33854d;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.f33856f;
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.f33857g;
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.f33853c;
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.f33858h;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        if (this.f33852b < this.f33851a.size()) {
            int i = this.f33855e + 1;
            this.f33855e = i;
            if (i > 1) {
                for (Interceptor interceptor : this.f33851a) {
                    if (interceptor instanceof C12632b) {
                        ((C12632b) interceptor).mo47965a();
                    }
                }
            }
            C12634d dVar = new C12634d(this.f33851a, this.f33852b + 1, request, this.f33854d, this.f33856f, this.f33857g, this.f33858h);
            Interceptor interceptor2 = this.f33851a.get(this.f33852b);
            Response intercept = interceptor2.intercept(dVar);
            if (this.f33852b + 1 < this.f33851a.size() && dVar.f33855e < 1) {
                throw new RustIOException(new IllegalStateException("interceptor " + interceptor2 + " must mCall proceed() at least once"), -3331002);
            } else if (intercept != null) {
                return intercept;
            } else {
                throw new RustIOException("interceptor " + interceptor2 + " returned null", -3331002);
            }
        } else {
            throw new AssertionError();
        }
    }

    public C12634d(List<Interceptor> list, int i, Request request, Call call, int i2, int i3, int i4) {
        this.f33851a = list;
        this.f33852b = i;
        this.f33853c = request;
        this.f33854d = call;
        this.f33856f = i2;
        this.f33857g = i3;
        this.f33858h = i4;
    }
}

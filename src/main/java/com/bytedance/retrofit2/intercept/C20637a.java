package com.bytedance.retrofit2.intercept;

import com.bytedance.retrofit2.C20588b;
import com.bytedance.retrofit2.C20638j;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.intercept.a */
public class C20637a implements Interceptor.Chain {

    /* renamed from: a */
    private final List<Interceptor> f50248a;

    /* renamed from: b */
    private final int f50249b;

    /* renamed from: c */
    private final Request f50250c;

    /* renamed from: d */
    private final Call f50251d;

    /* renamed from: e */
    private int f50252e;

    /* renamed from: f */
    private C20639k f50253f;

    @Override // com.bytedance.retrofit2.intercept.Interceptor.Chain
    public Call call() {
        return this.f50251d;
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor.Chain
    public C20639k metrics() {
        return this.f50253f;
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor.Chain
    public Request request() {
        return this.f50250c;
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor.Chain
    public SsResponse proceed(Request request) throws Exception {
        String str;
        if (this.f50249b < this.f50248a.size()) {
            int i = this.f50252e + 1;
            this.f50252e = i;
            if (i > 1) {
                for (Interceptor interceptor : this.f50248a) {
                    if (interceptor instanceof C20588b) {
                        ((C20588b) interceptor).mo69342c();
                    }
                }
            }
            C20637a aVar = new C20637a(this.f50248a, this.f50249b + 1, request, this.f50251d, this.f50253f);
            Interceptor interceptor2 = this.f50248a.get(this.f50249b);
            StringBuilder sb = new StringBuilder();
            sb.append("interceptor = ");
            if (interceptor2 != null) {
                str = interceptor2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" url = ");
            sb.append(request.getUrl());
            C20638j.m75019a("RealInterceptorChain", sb.toString());
            SsResponse intercept = interceptor2.intercept(aVar);
            if (intercept == null) {
                throw new NullPointerException("interceptor " + interceptor2 + " returned null");
            } else if (intercept.raw() != null) {
                return intercept;
            } else {
                throw new IllegalStateException("interceptor " + interceptor2 + " returned a ssResponse with no body");
            }
        } else {
            throw new AssertionError();
        }
    }

    public C20637a(List<Interceptor> list, int i, Request request, Call call, C20639k kVar) {
        this.f50248a = list;
        this.f50249b = i;
        this.f50250c = request;
        this.f50251d = call;
        this.f50253f = kVar;
    }
}

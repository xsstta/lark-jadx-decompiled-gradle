package com.larksuite.framework.http.request;

import com.larksuite.framework.http.p1186a.AbstractC25988d;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.p1187b.C25994d;
import com.larksuite.framework.http.p1188c.AbstractC25998b;
import com.larksuite.framework.http.p1191f.C26006d;
import com.larksuite.framework.http.p1191f.C26007e;
import com.larksuite.framework.http.response.AbstractC26016b;

/* renamed from: com.larksuite.framework.http.request.a */
public class C26010a<T> {

    /* renamed from: a */
    private HttpParams f64369a = new HttpParams();

    /* renamed from: b */
    private HttpHeaders f64370b = new HttpHeaders();

    /* renamed from: c */
    private String f64371c;

    /* renamed from: d */
    private String f64372d;

    /* renamed from: e */
    private AbstractC26016b f64373e;

    /* renamed from: f */
    private AbstractC25998b<T> f64374f;

    /* renamed from: g */
    private HttpMethod f64375g = HttpMethod.GET;

    /* renamed from: h */
    private RequestBody f64376h;

    /* renamed from: i */
    private String f64377i = "BaseRequest";

    /* renamed from: j */
    private volatile AbstractC25988d<T> f64378j = null;

    /* renamed from: k */
    private AbstractC25990b f64379k = C25994d.m94103b().mo92425a();

    /* renamed from: d */
    public AbstractC25998b<T> mo92481d() {
        return this.f64374f;
    }

    /* renamed from: e */
    public HttpMethod mo92483e() {
        return this.f64375g;
    }

    /* renamed from: f */
    public RequestBody mo92484f() {
        return this.f64376h;
    }

    /* renamed from: g */
    public String mo92485g() {
        return this.f64377i;
    }

    /* renamed from: i */
    public HttpParams mo92487i() {
        return this.f64369a;
    }

    /* renamed from: j */
    public AbstractC26016b mo92488j() {
        return this.f64373e;
    }

    /* renamed from: b */
    public String mo92478b() {
        String str = this.f64372d;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    public String mo92480c() {
        return C26007e.m94129a(mo92474a() + mo92478b(), this.f64369a.urlParamsMap);
    }

    /* renamed from: h */
    public HttpHeaders mo92486h() {
        if (!this.f64370b.headersMap.containsKey("X-BaseRequest-ID")) {
            this.f64370b.put("X-BaseRequest-ID", C26006d.m94128a());
        }
        return this.f64370b;
    }

    public C26010a() {
    }

    /* renamed from: a */
    public String mo92474a() {
        return this.f64371c;
    }

    /* renamed from: a */
    public C26010a<T> mo92468a(HttpHeaders httpHeaders) {
        this.f64370b = httpHeaders;
        return this;
    }

    /* renamed from: b */
    public C26010a<T> mo92477b(String str) {
        this.f64371c = str;
        return this;
    }

    /* renamed from: c */
    public C26010a<T> mo92479c(String str) {
        this.f64372d = str;
        return this;
    }

    /* renamed from: a */
    public C26010a<T> mo92469a(HttpMethod httpMethod) {
        this.f64375g = httpMethod;
        return this;
    }

    /* renamed from: b */
    public C26010a<T> mo92476b(RequestBody requestBody) {
        this.f64375g = HttpMethod.POST;
        this.f64376h = requestBody;
        return this;
    }

    /* renamed from: d */
    public C26010a<T> mo92482d(String str) {
        this.f64370b.remove(str);
        return this;
    }

    /* renamed from: a */
    public C26010a<T> mo92470a(HttpParams httpParams) {
        this.f64369a = httpParams;
        return this;
    }

    /* renamed from: a */
    public C26010a<T> mo92471a(RequestBody requestBody) {
        this.f64376h = requestBody;
        return this;
    }

    /* renamed from: a */
    public C26010a<T> mo92472a(String str) {
        this.f64371c = str;
        return this;
    }

    /* renamed from: a */
    public final void mo92475a(AbstractC26011b<T> bVar) {
        this.f64378j = this.f64379k.mo92412a(this);
        this.f64378j.mo92408a(bVar);
    }

    public C26010a(HttpMethod httpMethod, String str) {
        this.f64375g = httpMethod;
        this.f64371c = str;
    }

    /* renamed from: a */
    public C26010a<T> mo92473a(String str, String str2) {
        this.f64370b.put(str, str2);
        return this;
    }
}

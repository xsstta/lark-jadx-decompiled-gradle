package com.larksuite.framework.http.p1187b;

import android.content.Context;
import com.larksuite.framework.http.p1186a.AbstractC25988d;
import com.larksuite.framework.http.p1189d.AbstractC26000b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.response.C26014a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.http.b.b */
public interface AbstractC25990b {
    /* renamed from: a */
    <T> AbstractC25988d<T> mo92412a(C26010a<T> aVar);

    /* renamed from: a */
    C25991a mo92413a();

    /* renamed from: a */
    List<C26014a> mo92414a(String str);

    /* renamed from: a */
    void mo92415a(Context context);

    /* renamed from: a */
    void mo92416a(String str, List<C26014a> list);

    /* renamed from: com.larksuite.framework.http.b.b$a */
    public static final class C25991a {

        /* renamed from: a */
        Context f64344a;

        /* renamed from: b */
        List<AbstractC26000b> f64345b;

        /* renamed from: c */
        boolean f64346c;

        /* renamed from: d */
        long f64347d;

        /* renamed from: e */
        TimeUnit f64348e;

        /* renamed from: f */
        long f64349f;

        /* renamed from: g */
        TimeUnit f64350g;

        /* renamed from: h */
        long f64351h;

        /* renamed from: i */
        TimeUnit f64352i;

        public C25991a() {
            this.f64345b = new ArrayList();
            this.f64347d = 10000;
            this.f64349f = 10000;
            this.f64351h = 10000;
        }

        /* renamed from: a */
        public AbstractC25990b mo92421a() {
            return new C25992c(this);
        }

        /* renamed from: a */
        public C25991a mo92418a(Context context) {
            this.f64344a = context;
            return this;
        }

        /* renamed from: a */
        public C25991a mo92419a(List<AbstractC26000b> list) {
            if (list != null) {
                this.f64345b.addAll(list);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C25991a mo92420a(boolean z) {
            this.f64346c = z;
            return this;
        }

        public C25991a(C25991a aVar) {
            this.f64345b = new ArrayList();
            this.f64344a = aVar.f64344a;
            this.f64345b = aVar.f64345b;
            this.f64346c = aVar.f64346c;
            this.f64347d = aVar.f64347d;
            this.f64348e = aVar.f64348e;
            this.f64349f = aVar.f64349f;
            this.f64350g = aVar.f64350g;
            this.f64351h = aVar.f64351h;
            this.f64352i = aVar.f64352i;
        }

        /* renamed from: a */
        public C25991a mo92417a(long j, TimeUnit timeUnit) {
            this.f64347d = j;
            this.f64348e = timeUnit;
            return this;
        }

        /* renamed from: b */
        public C25991a mo92422b(long j, TimeUnit timeUnit) {
            this.f64349f = j;
            this.f64350g = timeUnit;
            return this;
        }

        /* renamed from: c */
        public C25991a mo92423c(long j, TimeUnit timeUnit) {
            this.f64351h = j;
            this.f64352i = timeUnit;
            return this;
        }
    }
}

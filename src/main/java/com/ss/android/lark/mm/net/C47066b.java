package com.ss.android.lark.mm.net;

import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mm.net.b */
public final class C47066b {

    /* renamed from: a */
    public final HttpMethod f118450a;

    /* renamed from: b */
    public final String f118451b;

    /* renamed from: c */
    public final String f118452c;

    /* renamed from: d */
    public final Map<String, String> f118453d;

    /* renamed from: e */
    public final Map<String, String> f118454e;

    /* renamed from: f */
    public final String f118455f;

    /* renamed from: g */
    public final boolean f118456g;

    /* renamed from: h */
    public final IHttpLocalErrorHandler f118457h;

    /* renamed from: com.ss.android.lark.mm.net.b$a */
    public static class C47067a {

        /* renamed from: a */
        private HttpMethod f118458a = HttpMethod.GET;

        /* renamed from: b */
        private String f118459b;

        /* renamed from: c */
        private String f118460c;

        /* renamed from: d */
        private Map<String, String> f118461d = Collections.emptyMap();

        /* renamed from: e */
        private Map<String, String> f118462e = Collections.emptyMap();

        /* renamed from: f */
        private String f118463f;

        /* renamed from: g */
        private boolean f118464g;

        /* renamed from: h */
        private IHttpLocalErrorHandler f118465h;

        public String toString() {
            return "Builder{host='" + this.f118459b + '\'' + ", path='" + this.f118460c + '\'' + '}';
        }

        /* renamed from: a */
        public C47066b mo165301a() {
            return new C47066b(this.f118458a, this.f118459b, this.f118460c, this.f118461d, this.f118462e, this.f118463f, this.f118464g, this.f118465h);
        }

        /* renamed from: a */
        public C47067a mo165296a(HttpMethod httpMethod) {
            this.f118458a = httpMethod;
            return this;
        }

        /* renamed from: b */
        public C47067a mo165302b(String str) {
            this.f118460c = str;
            return this;
        }

        /* renamed from: c */
        public C47067a mo165304c(String str) {
            this.f118463f = str;
            return this;
        }

        /* renamed from: a */
        public C47067a mo165297a(IHttpLocalErrorHandler aVar) {
            this.f118465h = aVar;
            return this;
        }

        /* renamed from: b */
        public C47067a mo165303b(Map<String, String> map) {
            this.f118462e = map;
            return this;
        }

        /* renamed from: a */
        public C47067a mo165298a(String str) {
            this.f118459b = str;
            return this;
        }

        /* renamed from: a */
        public C47067a mo165299a(Map<String, String> map) {
            this.f118461d = map;
            return this;
        }

        /* renamed from: a */
        public C47067a mo165300a(boolean z) {
            this.f118464g = z;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.f118450a, this.f118451b, this.f118452c, this.f118453d, this.f118454e, this.f118455f);
    }

    public String toString() {
        return "MmHttpRequest{method=" + this.f118450a + ", host='" + this.f118451b + '\'' + ", path='" + this.f118452c + '\'' + ", queryMap=" + this.f118453d + ", fieldMap=" + this.f118454e + ", requestId='" + this.f118455f + '\'' + ", isAllowCache=" + this.f118456g + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C47066b bVar = (C47066b) obj;
        if (this.f118450a != bVar.f118450a || !Objects.equals(this.f118451b, bVar.f118451b) || !Objects.equals(this.f118452c, bVar.f118452c) || !Objects.equals(this.f118453d, bVar.f118453d) || !Objects.equals(this.f118454e, bVar.f118454e) || !Objects.equals(this.f118455f, bVar.f118455f)) {
            return false;
        }
        return true;
    }

    public C47066b(HttpMethod httpMethod, String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, boolean z, IHttpLocalErrorHandler aVar) {
        this.f118450a = httpMethod;
        this.f118451b = str;
        this.f118452c = str2;
        this.f118453d = map;
        this.f118454e = map2;
        this.f118455f = str3;
        this.f118456g = z;
        this.f118457h = aVar;
    }
}

package com.larksuite.framework.http.response;

import java.util.Objects;
import okhttp3.internal.Util;

/* renamed from: com.larksuite.framework.http.response.a */
public class C26014a {

    /* renamed from: a */
    private final String f64380a;

    /* renamed from: b */
    private final String f64381b;

    /* renamed from: c */
    private final long f64382c;

    /* renamed from: d */
    private final String f64383d;

    /* renamed from: e */
    private final String f64384e;

    /* renamed from: f */
    private final boolean f64385f;

    /* renamed from: g */
    private final boolean f64386g;

    /* renamed from: h */
    private final boolean f64387h;

    /* renamed from: i */
    private final boolean f64388i;

    /* renamed from: a */
    public String mo92502a() {
        return this.f64380a;
    }

    /* renamed from: b */
    public String mo92503b() {
        return this.f64381b;
    }

    /* renamed from: c */
    public long mo92504c() {
        return this.f64382c;
    }

    /* renamed from: d */
    public String mo92505d() {
        return this.f64383d;
    }

    /* renamed from: e */
    public String mo92506e() {
        return this.f64384e;
    }

    /* renamed from: f */
    public boolean mo92507f() {
        return this.f64385f;
    }

    /* renamed from: g */
    public boolean mo92508g() {
        return this.f64386g;
    }

    /* renamed from: h */
    public boolean mo92509h() {
        return this.f64387h;
    }

    /* renamed from: i */
    public boolean mo92510i() {
        return this.f64388i;
    }

    /* renamed from: com.larksuite.framework.http.response.a$a */
    public static final class C26015a {

        /* renamed from: a */
        String f64389a;

        /* renamed from: b */
        String f64390b;

        /* renamed from: c */
        long f64391c = 253402300799999L;

        /* renamed from: d */
        String f64392d;

        /* renamed from: e */
        String f64393e = "/";

        /* renamed from: f */
        boolean f64394f;

        /* renamed from: g */
        boolean f64395g;

        /* renamed from: h */
        boolean f64396h;

        /* renamed from: i */
        boolean f64397i;

        /* renamed from: a */
        public C26015a mo92511a() {
            this.f64394f = true;
            return this;
        }

        /* renamed from: b */
        public C26015a mo92514b() {
            this.f64395g = true;
            return this;
        }

        /* renamed from: c */
        public C26015a mo92516c() {
            this.f64395g = true;
            return this;
        }

        /* renamed from: d */
        public C26014a mo92519d() {
            return new C26014a(this);
        }

        /* renamed from: c */
        public C26015a mo92517c(String str) {
            return m94167a(str, false);
        }

        /* renamed from: a */
        public C26015a mo92512a(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.f64391c = j;
            this.f64396h = true;
            return this;
        }

        /* renamed from: b */
        public C26015a mo92515b(String str) {
            Objects.requireNonNull(str, "value == null");
            if (str.trim().equals(str)) {
                this.f64390b = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }

        /* renamed from: d */
        public C26015a mo92518d(String str) {
            if (str.startsWith("/")) {
                this.f64393e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        /* renamed from: a */
        public C26015a mo92513a(String str) {
            Objects.requireNonNull(str, "name == null");
            if (str.trim().equals(str)) {
                this.f64389a = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        /* renamed from: a */
        private C26015a m94167a(String str, boolean z) {
            Objects.requireNonNull(str, "domain == null");
            String canonicalizeHost = Util.canonicalizeHost(str);
            if (canonicalizeHost != null) {
                this.f64392d = canonicalizeHost;
                this.f64397i = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    C26014a(C26015a aVar) {
        Objects.requireNonNull(aVar.f64389a, "builder.name == null");
        Objects.requireNonNull(aVar.f64390b, "builder.value == null");
        Objects.requireNonNull(aVar.f64392d, "builder.domain == null");
        this.f64380a = aVar.f64389a;
        this.f64381b = aVar.f64390b;
        this.f64382c = aVar.f64391c;
        this.f64383d = aVar.f64392d;
        this.f64384e = aVar.f64393e;
        this.f64385f = aVar.f64394f;
        this.f64386g = aVar.f64395g;
        this.f64387h = aVar.f64396h;
        this.f64388i = aVar.f64397i;
    }
}

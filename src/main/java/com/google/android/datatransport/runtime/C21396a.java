package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.AbstractC21433h;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.a */
final class C21396a extends AbstractC21433h {

    /* renamed from: a */
    private final String f51979a;

    /* renamed from: b */
    private final Integer f51980b;

    /* renamed from: c */
    private final C21432g f51981c;

    /* renamed from: d */
    private final long f51982d;

    /* renamed from: e */
    private final long f51983e;

    /* renamed from: f */
    private final Map<String, String> f51984f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.a$a */
    public static final class C21398a extends AbstractC21433h.AbstractC21434a {

        /* renamed from: a */
        private String f51985a;

        /* renamed from: b */
        private Integer f51986b;

        /* renamed from: c */
        private C21432g f51987c;

        /* renamed from: d */
        private Long f51988d;

        /* renamed from: e */
        private Long f51989e;

        /* renamed from: f */
        private Map<String, String> f51990f;

        C21398a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: a */
        public Map<String, String> mo72618a() {
            Map<String, String> map = this.f51990f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: b */
        public AbstractC21433h mo72620b() {
            String str = "";
            if (this.f51985a == null) {
                str = str + " transportName";
            }
            if (this.f51987c == null) {
                str = str + " encodedPayload";
            }
            if (this.f51988d == null) {
                str = str + " eventMillis";
            }
            if (this.f51989e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f51990f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C21396a(this.f51985a, this.f51986b, this.f51987c, this.f51988d.longValue(), this.f51989e.longValue(), this.f51990f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: a */
        public AbstractC21433h.AbstractC21434a mo72615a(Integer num) {
            this.f51986b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: a */
        public AbstractC21433h.AbstractC21434a mo72613a(long j) {
            this.f51988d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: b */
        public AbstractC21433h.AbstractC21434a mo72619b(long j) {
            this.f51989e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: a */
        public AbstractC21433h.AbstractC21434a mo72614a(C21432g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f51987c = gVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: a */
        public AbstractC21433h.AbstractC21434a mo72616a(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f51985a = str;
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.AbstractC21433h.AbstractC21434a
        /* renamed from: a */
        public AbstractC21433h.AbstractC21434a mo72617a(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f51990f = map;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21433h
    /* renamed from: a */
    public String mo72604a() {
        return this.f51979a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21433h
    /* renamed from: b */
    public Integer mo72605b() {
        return this.f51980b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21433h
    /* renamed from: c */
    public C21432g mo72606c() {
        return this.f51981c;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21433h
    /* renamed from: d */
    public long mo72607d() {
        return this.f51982d;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21433h
    /* renamed from: e */
    public long mo72608e() {
        return this.f51983e;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.datatransport.runtime.AbstractC21433h
    /* renamed from: f */
    public Map<String, String> mo72610f() {
        return this.f51984f;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f51979a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f51980b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f51982d;
        long j2 = this.f51983e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f51981c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f51984f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f51979a + ", code=" + this.f51980b + ", encodedPayload=" + this.f51981c + ", eventMillis=" + this.f51982d + ", uptimeMillis=" + this.f51983e + ", autoMetadata=" + this.f51984f + "}";
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21433h)) {
            return false;
        }
        AbstractC21433h hVar = (AbstractC21433h) obj;
        if (!this.f51979a.equals(hVar.mo72604a()) || ((num = this.f51980b) != null ? !num.equals(hVar.mo72605b()) : hVar.mo72605b() != null) || !this.f51981c.equals(hVar.mo72606c()) || this.f51982d != hVar.mo72607d() || this.f51983e != hVar.mo72608e() || !this.f51984f.equals(hVar.mo72610f())) {
            return false;
        }
        return true;
    }

    private C21396a(String str, Integer num, C21432g gVar, long j, long j2, Map<String, String> map) {
        this.f51979a = str;
        this.f51980b = num;
        this.f51981c = gVar;
        this.f51982d = j;
        this.f51983e = j2;
        this.f51984f = map;
    }
}

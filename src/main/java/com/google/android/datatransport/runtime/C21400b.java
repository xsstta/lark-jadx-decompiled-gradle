package com.google.android.datatransport.runtime;

import com.google.android.datatransport.AbstractC21350c;
import com.google.android.datatransport.AbstractC21392d;
import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.runtime.AbstractC21437k;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.b */
final class C21400b extends AbstractC21437k {

    /* renamed from: a */
    private final AbstractC21439l f51991a;

    /* renamed from: b */
    private final String f51992b;

    /* renamed from: c */
    private final AbstractC21350c<?> f51993c;

    /* renamed from: d */
    private final AbstractC21392d<?, byte[]> f51994d;

    /* renamed from: e */
    private final C21349b f51995e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.b$a */
    public static final class C21402a extends AbstractC21437k.AbstractC21438a {

        /* renamed from: a */
        private AbstractC21439l f51996a;

        /* renamed from: b */
        private String f51997b;

        /* renamed from: c */
        private AbstractC21350c<?> f51998c;

        /* renamed from: d */
        private AbstractC21392d<?, byte[]> f51999d;

        /* renamed from: e */
        private C21349b f52000e;

        C21402a() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21437k.AbstractC21438a
        /* renamed from: a */
        public AbstractC21437k mo72634a() {
            String str = "";
            if (this.f51996a == null) {
                str = str + " transportContext";
            }
            if (this.f51997b == null) {
                str = str + " transportName";
            }
            if (this.f51998c == null) {
                str = str + " event";
            }
            if (this.f51999d == null) {
                str = str + " transformer";
            }
            if (this.f52000e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C21400b(this.f51996a, this.f51997b, this.f51998c, this.f51999d, this.f52000e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.AbstractC21437k.AbstractC21438a
        /* renamed from: a */
        public AbstractC21437k.AbstractC21438a mo72629a(C21349b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f52000e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.AbstractC21437k.AbstractC21438a
        /* renamed from: a */
        public AbstractC21437k.AbstractC21438a mo72630a(AbstractC21350c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f51998c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.AbstractC21437k.AbstractC21438a
        /* renamed from: a */
        public AbstractC21437k.AbstractC21438a mo72631a(AbstractC21392d<?, byte[]> dVar) {
            Objects.requireNonNull(dVar, "Null transformer");
            this.f51999d = dVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21437k.AbstractC21438a
        /* renamed from: a */
        public AbstractC21437k.AbstractC21438a mo72632a(AbstractC21439l lVar) {
            Objects.requireNonNull(lVar, "Null transportContext");
            this.f51996a = lVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21437k.AbstractC21438a
        /* renamed from: a */
        public AbstractC21437k.AbstractC21438a mo72633a(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f51997b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21437k
    /* renamed from: a */
    public AbstractC21439l mo72621a() {
        return this.f51991a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21437k
    /* renamed from: b */
    public String mo72622b() {
        return this.f51992b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC21437k
    /* renamed from: c */
    public AbstractC21350c<?> mo72623c() {
        return this.f51993c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC21437k
    /* renamed from: d */
    public AbstractC21392d<?, byte[]> mo72624d() {
        return this.f51994d;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21437k
    /* renamed from: e */
    public C21349b mo72625e() {
        return this.f51995e;
    }

    public int hashCode() {
        return ((((((((this.f51991a.hashCode() ^ 1000003) * 1000003) ^ this.f51992b.hashCode()) * 1000003) ^ this.f51993c.hashCode()) * 1000003) ^ this.f51994d.hashCode()) * 1000003) ^ this.f51995e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f51991a + ", transportName=" + this.f51992b + ", event=" + this.f51993c + ", transformer=" + this.f51994d + ", encoding=" + this.f51995e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21437k)) {
            return false;
        }
        AbstractC21437k kVar = (AbstractC21437k) obj;
        if (!this.f51991a.equals(kVar.mo72621a()) || !this.f51992b.equals(kVar.mo72622b()) || !this.f51993c.equals(kVar.mo72623c()) || !this.f51994d.equals(kVar.mo72624d()) || !this.f51995e.equals(kVar.mo72625e())) {
            return false;
        }
        return true;
    }

    private C21400b(AbstractC21439l lVar, String str, AbstractC21350c<?> cVar, AbstractC21392d<?, byte[]> dVar, C21349b bVar) {
        this.f51991a = lVar;
        this.f51992b = str;
        this.f51993c = cVar;
        this.f51994d = dVar;
        this.f51995e = bVar;
    }
}

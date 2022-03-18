package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC22863k;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.a */
final class C22849a extends AbstractC22863k {

    /* renamed from: a */
    private final String f56481a;

    /* renamed from: b */
    private final long f56482b;

    /* renamed from: c */
    private final long f56483c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.a$a */
    public static final class C22851a extends AbstractC22863k.AbstractC22864a {

        /* renamed from: a */
        private String f56484a;

        /* renamed from: b */
        private Long f56485b;

        /* renamed from: c */
        private Long f56486c;

        C22851a() {
        }

        @Override // com.google.firebase.installations.AbstractC22863k.AbstractC22864a
        /* renamed from: a */
        public AbstractC22863k mo79377a() {
            String str = "";
            if (this.f56484a == null) {
                str = str + " token";
            }
            if (this.f56485b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f56486c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C22849a(this.f56484a, this.f56485b.longValue(), this.f56486c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC22863k.AbstractC22864a
        /* renamed from: a */
        public AbstractC22863k.AbstractC22864a mo79375a(long j) {
            this.f56485b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC22863k.AbstractC22864a
        /* renamed from: b */
        public AbstractC22863k.AbstractC22864a mo79378b(long j) {
            this.f56486c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC22863k.AbstractC22864a
        /* renamed from: a */
        public AbstractC22863k.AbstractC22864a mo79376a(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f56484a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC22863k
    /* renamed from: a */
    public String mo79369a() {
        return this.f56481a;
    }

    @Override // com.google.firebase.installations.AbstractC22863k
    /* renamed from: b */
    public long mo79370b() {
        return this.f56482b;
    }

    @Override // com.google.firebase.installations.AbstractC22863k
    /* renamed from: c */
    public long mo79371c() {
        return this.f56483c;
    }

    public int hashCode() {
        long j = this.f56482b;
        long j2 = this.f56483c;
        return ((((this.f56481a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f56481a + ", tokenExpirationTimestamp=" + this.f56482b + ", tokenCreationTimestamp=" + this.f56483c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC22863k)) {
            return false;
        }
        AbstractC22863k kVar = (AbstractC22863k) obj;
        if (this.f56481a.equals(kVar.mo79369a()) && this.f56482b == kVar.mo79370b() && this.f56483c == kVar.mo79371c()) {
            return true;
        }
        return false;
    }

    private C22849a(String str, long j, long j2) {
        this.f56481a = str;
        this.f56482b = j;
        this.f56483c = j2;
    }
}

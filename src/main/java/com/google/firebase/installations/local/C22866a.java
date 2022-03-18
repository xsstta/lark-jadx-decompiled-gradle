package com.google.firebase.installations.local;

import com.google.firebase.installations.local.AbstractC22870c;
import com.google.firebase.installations.local.PersistedInstallation;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.local.a */
final class C22866a extends AbstractC22870c {

    /* renamed from: b */
    private final String f56518b;

    /* renamed from: c */
    private final PersistedInstallation.RegistrationStatus f56519c;

    /* renamed from: d */
    private final String f56520d;

    /* renamed from: e */
    private final String f56521e;

    /* renamed from: f */
    private final long f56522f;

    /* renamed from: g */
    private final long f56523g;

    /* renamed from: h */
    private final String f56524h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.local.a$a */
    public static final class C22868a extends AbstractC22870c.AbstractC22871a {

        /* renamed from: a */
        private String f56525a;

        /* renamed from: b */
        private PersistedInstallation.RegistrationStatus f56526b;

        /* renamed from: c */
        private String f56527c;

        /* renamed from: d */
        private String f56528d;

        /* renamed from: e */
        private Long f56529e;

        /* renamed from: f */
        private Long f56530f;

        /* renamed from: g */
        private String f56531g;

        C22868a() {
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: a */
        public AbstractC22870c mo79411a() {
            String str = "";
            if (this.f56526b == null) {
                str = str + " registrationStatus";
            }
            if (this.f56529e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f56530f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C22866a(this.f56525a, this.f56526b, this.f56527c, this.f56528d, this.f56529e.longValue(), this.f56530f.longValue(), this.f56531g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: a */
        public AbstractC22870c.AbstractC22871a mo79410a(String str) {
            this.f56525a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: b */
        public AbstractC22870c.AbstractC22871a mo79413b(String str) {
            this.f56527c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: c */
        public AbstractC22870c.AbstractC22871a mo79414c(String str) {
            this.f56528d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: d */
        public AbstractC22870c.AbstractC22871a mo79415d(String str) {
            this.f56531g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: a */
        public AbstractC22870c.AbstractC22871a mo79408a(long j) {
            this.f56529e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: b */
        public AbstractC22870c.AbstractC22871a mo79412b(long j) {
            this.f56530f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.AbstractC22870c.AbstractC22871a
        /* renamed from: a */
        public AbstractC22870c.AbstractC22871a mo79409a(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.f56526b = registrationStatus;
            return this;
        }

        private C22868a(AbstractC22870c cVar) {
            this.f56525a = cVar.mo79397a();
            this.f56526b = cVar.mo79398b();
            this.f56527c = cVar.mo79399c();
            this.f56528d = cVar.mo79400d();
            this.f56529e = Long.valueOf(cVar.mo79401e());
            this.f56530f = Long.valueOf(cVar.mo79403f());
            this.f56531g = cVar.mo79404g();
        }
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: a */
    public String mo79397a() {
        return this.f56518b;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: b */
    public PersistedInstallation.RegistrationStatus mo79398b() {
        return this.f56519c;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: c */
    public String mo79399c() {
        return this.f56520d;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: d */
    public String mo79400d() {
        return this.f56521e;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: e */
    public long mo79401e() {
        return this.f56522f;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: f */
    public long mo79403f() {
        return this.f56523g;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: g */
    public String mo79404g() {
        return this.f56524h;
    }

    @Override // com.google.firebase.installations.local.AbstractC22870c
    /* renamed from: h */
    public AbstractC22870c.AbstractC22871a mo79405h() {
        return new C22868a(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f56518b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f56519c.hashCode()) * 1000003;
        String str2 = this.f56520d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f56521e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f56522f;
        long j2 = this.f56523g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f56524h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f56518b + ", registrationStatus=" + this.f56519c + ", authToken=" + this.f56520d + ", refreshToken=" + this.f56521e + ", expiresInSecs=" + this.f56522f + ", tokenCreationEpochInSecs=" + this.f56523g + ", fisError=" + this.f56524h + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC22870c)) {
            return false;
        }
        AbstractC22870c cVar = (AbstractC22870c) obj;
        String str3 = this.f56518b;
        if (str3 != null ? str3.equals(cVar.mo79397a()) : cVar.mo79397a() == null) {
            if (this.f56519c.equals(cVar.mo79398b()) && ((str = this.f56520d) != null ? str.equals(cVar.mo79399c()) : cVar.mo79399c() == null) && ((str2 = this.f56521e) != null ? str2.equals(cVar.mo79400d()) : cVar.mo79400d() == null) && this.f56522f == cVar.mo79401e() && this.f56523g == cVar.mo79403f()) {
                String str4 = this.f56524h;
                if (str4 == null) {
                    if (cVar.mo79404g() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.mo79404g())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C22866a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f56518b = str;
        this.f56519c = registrationStatus;
        this.f56520d = str2;
        this.f56521e = str3;
        this.f56522f = j;
        this.f56523g = j2;
        this.f56524h = str4;
    }
}

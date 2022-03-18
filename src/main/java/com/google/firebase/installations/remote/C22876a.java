package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
final class C22876a extends InstallationResponse {

    /* renamed from: a */
    private final String f56538a;

    /* renamed from: b */
    private final String f56539b;

    /* renamed from: c */
    private final String f56540c;

    /* renamed from: d */
    private final TokenResult f56541d;

    /* renamed from: e */
    private final InstallationResponse.ResponseCode f56542e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.remote.a$a */
    public static final class C22878a extends InstallationResponse.AbstractC22874a {

        /* renamed from: a */
        private String f56543a;

        /* renamed from: b */
        private String f56544b;

        /* renamed from: c */
        private String f56545c;

        /* renamed from: d */
        private TokenResult f56546d;

        /* renamed from: e */
        private InstallationResponse.ResponseCode f56547e;

        C22878a() {
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.AbstractC22874a
        /* renamed from: a */
        public InstallationResponse mo79439a() {
            return new C22876a(this.f56543a, this.f56544b, this.f56545c, this.f56546d, this.f56547e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.AbstractC22874a
        /* renamed from: a */
        public InstallationResponse.AbstractC22874a mo79436a(InstallationResponse.ResponseCode responseCode) {
            this.f56547e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.AbstractC22874a
        /* renamed from: b */
        public InstallationResponse.AbstractC22874a mo79440b(String str) {
            this.f56544b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.AbstractC22874a
        /* renamed from: c */
        public InstallationResponse.AbstractC22874a mo79441c(String str) {
            this.f56545c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.AbstractC22874a
        /* renamed from: a */
        public InstallationResponse.AbstractC22874a mo79437a(TokenResult tokenResult) {
            this.f56546d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.AbstractC22874a
        /* renamed from: a */
        public InstallationResponse.AbstractC22874a mo79438a(String str) {
            this.f56543a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* renamed from: a */
    public String mo79431a() {
        return this.f56538a;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* renamed from: b */
    public String mo79432b() {
        return this.f56539b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* renamed from: c */
    public String mo79433c() {
        return this.f56540c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* renamed from: d */
    public TokenResult mo79434d() {
        return this.f56541d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    /* renamed from: e */
    public InstallationResponse.ResponseCode mo79435e() {
        return this.f56542e;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f56538a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f56539b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f56540c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        TokenResult tokenResult = this.f56541d;
        if (tokenResult == null) {
            i4 = 0;
        } else {
            i4 = tokenResult.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f56542e;
        if (responseCode != null) {
            i5 = responseCode.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f56538a + ", fid=" + this.f56539b + ", refreshToken=" + this.f56540c + ", authToken=" + this.f56541d + ", responseCode=" + this.f56542e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f56538a;
        if (str != null ? str.equals(installationResponse.mo79431a()) : installationResponse.mo79431a() == null) {
            String str2 = this.f56539b;
            if (str2 != null ? str2.equals(installationResponse.mo79432b()) : installationResponse.mo79432b() == null) {
                String str3 = this.f56540c;
                if (str3 != null ? str3.equals(installationResponse.mo79433c()) : installationResponse.mo79433c() == null) {
                    TokenResult tokenResult = this.f56541d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo79434d()) : installationResponse.mo79434d() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f56542e;
                        if (responseCode == null) {
                            if (installationResponse.mo79435e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo79435e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private C22876a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f56538a = str;
        this.f56539b = str2;
        this.f56540c = str3;
        this.f56541d = tokenResult;
        this.f56542e = responseCode;
    }
}

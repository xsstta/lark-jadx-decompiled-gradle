package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
final class C22879b extends TokenResult {

    /* renamed from: a */
    private final String f56548a;

    /* renamed from: b */
    private final long f56549b;

    /* renamed from: c */
    private final TokenResult.ResponseCode f56550c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.remote.b$a */
    public static final class C22881a extends TokenResult.AbstractC22875a {

        /* renamed from: a */
        private String f56551a;

        /* renamed from: b */
        private Long f56552b;

        /* renamed from: c */
        private TokenResult.ResponseCode f56553c;

        C22881a() {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.AbstractC22875a
        /* renamed from: a */
        public TokenResult mo79448a() {
            String str = "";
            if (this.f56552b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C22879b(this.f56551a, this.f56552b.longValue(), this.f56553c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.AbstractC22875a
        /* renamed from: a */
        public TokenResult.AbstractC22875a mo79446a(TokenResult.ResponseCode responseCode) {
            this.f56553c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.AbstractC22875a
        /* renamed from: a */
        public TokenResult.AbstractC22875a mo79445a(long j) {
            this.f56552b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.AbstractC22875a
        /* renamed from: a */
        public TokenResult.AbstractC22875a mo79447a(String str) {
            this.f56551a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    /* renamed from: a */
    public String mo79442a() {
        return this.f56548a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    /* renamed from: b */
    public long mo79443b() {
        return this.f56549b;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    /* renamed from: c */
    public TokenResult.ResponseCode mo79444c() {
        return this.f56550c;
    }

    public int hashCode() {
        int i;
        String str = this.f56548a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f56549b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f56550c;
        if (responseCode != null) {
            i2 = responseCode.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f56548a + ", tokenExpirationTimestamp=" + this.f56549b + ", responseCode=" + this.f56550c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f56548a;
        if (str != null ? str.equals(tokenResult.mo79442a()) : tokenResult.mo79442a() == null) {
            if (this.f56549b == tokenResult.mo79443b()) {
                TokenResult.ResponseCode responseCode = this.f56550c;
                if (responseCode == null) {
                    if (tokenResult.mo79444c() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo79444c())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C22879b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f56548a = str;
        this.f56549b = j;
        this.f56550c = responseCode;
    }
}

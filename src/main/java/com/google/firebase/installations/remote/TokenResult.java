package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.C22879b;

public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: com.google.firebase.installations.remote.TokenResult$a */
    public static abstract class AbstractC22875a {
        /* renamed from: a */
        public abstract AbstractC22875a mo79445a(long j);

        /* renamed from: a */
        public abstract AbstractC22875a mo79446a(ResponseCode responseCode);

        /* renamed from: a */
        public abstract AbstractC22875a mo79447a(String str);

        /* renamed from: a */
        public abstract TokenResult mo79448a();
    }

    /* renamed from: a */
    public abstract String mo79442a();

    /* renamed from: b */
    public abstract long mo79443b();

    /* renamed from: c */
    public abstract ResponseCode mo79444c();

    /* renamed from: d */
    public static AbstractC22875a m83093d() {
        return new C22879b.C22881a().mo79445a(0);
    }
}

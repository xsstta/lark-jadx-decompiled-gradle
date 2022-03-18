package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.C22876a;

public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    /* renamed from: com.google.firebase.installations.remote.InstallationResponse$a */
    public static abstract class AbstractC22874a {
        /* renamed from: a */
        public abstract AbstractC22874a mo79436a(ResponseCode responseCode);

        /* renamed from: a */
        public abstract AbstractC22874a mo79437a(TokenResult tokenResult);

        /* renamed from: a */
        public abstract AbstractC22874a mo79438a(String str);

        /* renamed from: a */
        public abstract InstallationResponse mo79439a();

        /* renamed from: b */
        public abstract AbstractC22874a mo79440b(String str);

        /* renamed from: c */
        public abstract AbstractC22874a mo79441c(String str);
    }

    /* renamed from: a */
    public abstract String mo79431a();

    /* renamed from: b */
    public abstract String mo79432b();

    /* renamed from: c */
    public abstract String mo79433c();

    /* renamed from: d */
    public abstract TokenResult mo79434d();

    /* renamed from: e */
    public abstract ResponseCode mo79435e();

    /* renamed from: f */
    public static AbstractC22874a m83081f() {
        return new C22876a.C22878a();
    }
}

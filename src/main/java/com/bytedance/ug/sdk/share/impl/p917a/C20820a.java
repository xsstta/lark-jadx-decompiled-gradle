package com.bytedance.ug.sdk.share.impl.p917a;

import com.bytedance.ug.sdk.share.impl.p928j.C20859f;

/* renamed from: com.bytedance.ug.sdk.share.impl.a.a */
public class C20820a {

    /* renamed from: a */
    private C20859f f50978a;

    /* renamed from: com.bytedance.ug.sdk.share.impl.a.a$a */
    private static class C20822a {

        /* renamed from: a */
        public static C20820a f50979a = new C20820a();
    }

    /* renamed from: a */
    public static C20820a m75834a() {
        return C20822a.f50979a;
    }

    private C20820a() {
        this.f50978a = C20859f.m75922a();
    }

    /* renamed from: b */
    public String mo70283b() {
        return this.f50978a.mo70335a("token_regex", "€[0-9A-Za-z]{5}€[0-9A-Za-z]{6}");
    }
}

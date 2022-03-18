package com.ss.android.lark.chatthread.p1714a;

import android.os.Bundle;

/* renamed from: com.ss.android.lark.chatthread.a.a */
public class C35079a {

    /* renamed from: a */
    public final String f90533a;

    /* renamed from: b */
    public final String f90534b;

    /* renamed from: c */
    public final String f90535c;

    /* renamed from: com.ss.android.lark.chatthread.a.a$a */
    public static class C35080a {

        /* renamed from: a */
        public String f90536a;

        /* renamed from: b */
        public String f90537b;

        /* renamed from: c */
        public String f90538c;

        /* renamed from: a */
        public C35079a mo129324a() {
            return new C35079a(this);
        }

        /* renamed from: a */
        public C35080a mo129323a(String str) {
            this.f90536a = str;
            return this;
        }

        /* renamed from: b */
        public C35080a mo129325b(String str) {
            this.f90537b = str;
            return this;
        }

        /* renamed from: c */
        public C35080a mo129326c(String str) {
            this.f90538c = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C35080a m136808a() {
        return new C35080a();
    }

    protected C35079a(C35080a aVar) {
        this.f90533a = aVar.f90536a;
        this.f90534b = aVar.f90537b;
        this.f90535c = aVar.f90538c;
    }

    /* renamed from: a */
    public static C35079a m136809a(Bundle bundle) {
        return m136808a().mo129323a(bundle.getString("chatId")).mo129325b(bundle.getString("rootId")).mo129326c(bundle.getString("title")).mo129324a();
    }
}

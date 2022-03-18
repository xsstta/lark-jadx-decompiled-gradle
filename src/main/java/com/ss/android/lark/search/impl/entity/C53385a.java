package com.ss.android.lark.search.impl.entity;

import com.ss.android.lark.search.impl.func.detail.p2616b.C53561a;

/* renamed from: com.ss.android.lark.search.impl.entity.a */
public class C53385a {

    /* renamed from: a */
    public final String f131929a;

    /* renamed from: b */
    public final int f131930b;

    /* renamed from: c */
    public final int f131931c;

    /* renamed from: d */
    public final String f131932d;

    /* renamed from: e */
    public final C53561a f131933e;

    /* renamed from: f */
    public final String f131934f;

    /* renamed from: com.ss.android.lark.search.impl.entity.a$b */
    public static class C53387b extends AbstractC53386a<C53385a, C53387b> {
        /* renamed from: c */
        public C53387b mo182090a() {
            return this;
        }

        /* renamed from: b */
        public C53385a mo182097b() {
            return new C53385a(this);
        }
    }

    /* renamed from: a */
    public static C53387b m206660a() {
        return new C53387b();
    }

    /* renamed from: com.ss.android.lark.search.impl.entity.a$a */
    public static abstract class AbstractC53386a<P extends C53385a, B extends AbstractC53386a<P, B>> {

        /* renamed from: a */
        protected String f131935a = "";

        /* renamed from: b */
        protected int f131936b;

        /* renamed from: c */
        protected int f131937c;

        /* renamed from: d */
        protected String f131938d = "";

        /* renamed from: e */
        protected C53561a f131939e = new C53561a();

        /* renamed from: f */
        protected String f131940f = "";

        /* renamed from: a */
        public abstract B mo182090a();

        protected AbstractC53386a() {
        }

        /* renamed from: a */
        public B mo182091a(int i) {
            this.f131936b = i;
            return mo182090a();
        }

        /* renamed from: b */
        public B mo182094b(int i) {
            this.f131937c = i;
            return mo182090a();
        }

        /* renamed from: c */
        public B mo182096c(String str) {
            this.f131940f = str;
            return mo182090a();
        }

        /* renamed from: a */
        public B mo182092a(C53561a aVar) {
            this.f131939e = aVar;
            return mo182090a();
        }

        /* renamed from: b */
        public B mo182095b(String str) {
            this.f131938d = str;
            return mo182090a();
        }

        /* renamed from: a */
        public B mo182093a(String str) {
            this.f131935a = str;
            return mo182090a();
        }
    }

    public C53385a(AbstractC53386a<?, ?> aVar) {
        this.f131929a = aVar.f131935a;
        this.f131930b = aVar.f131936b;
        this.f131931c = aVar.f131937c;
        this.f131932d = aVar.f131938d;
        this.f131933e = aVar.f131939e;
        this.f131934f = aVar.f131940f;
    }
}

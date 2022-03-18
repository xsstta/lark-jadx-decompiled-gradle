package com.bytedance.ee.lark.infra.network.ref.entity;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.entity.i */
public class C12883i {

    /* renamed from: a */
    public C12880g f34376a;

    /* renamed from: b */
    public Map<String, String> f34377b;

    /* renamed from: c */
    public int f34378c;

    /* renamed from: d */
    public String f34379d;

    /* renamed from: e */
    public AbstractC12885j f34380e;

    /* renamed from: a */
    public AbstractC12885j mo48574a() {
        return this.f34380e;
    }

    /* renamed from: b */
    public String mo48575b() {
        return this.f34379d;
    }

    /* renamed from: c */
    public Map<String, String> mo48576c() {
        return this.f34377b;
    }

    /* renamed from: d */
    public int mo48577d() {
        return this.f34378c;
    }

    /* renamed from: e */
    public C12884a mo48578e() {
        return new C12884a(this);
    }

    /* renamed from: com.bytedance.ee.lark.infra.network.ref.entity.i$a */
    public static class C12884a {

        /* renamed from: a */
        public C12880g f34381a;

        /* renamed from: b */
        public Map<String, String> f34382b;

        /* renamed from: c */
        public int f34383c;

        /* renamed from: d */
        public String f34384d;

        /* renamed from: e */
        public AbstractC12885j f34385e;

        public C12884a() {
            this.f34382b = new HashMap();
        }

        /* renamed from: a */
        public C12883i mo48584a() {
            return new C12883i(this);
        }

        /* renamed from: a */
        public C12884a mo48579a(int i) {
            this.f34383c = i;
            return this;
        }

        /* renamed from: a */
        public C12884a mo48580a(C12880g gVar) {
            this.f34381a = gVar;
            return this;
        }

        /* renamed from: a */
        public C12884a mo48581a(AbstractC12885j jVar) {
            this.f34385e = jVar;
            return this;
        }

        C12884a(C12883i iVar) {
            this.f34381a = iVar.f34376a;
            this.f34382b = iVar.f34377b;
            this.f34383c = iVar.f34378c;
            this.f34384d = iVar.f34379d;
            this.f34385e = iVar.f34380e;
        }

        /* renamed from: a */
        public C12884a mo48582a(String str) {
            this.f34384d = str;
            return this;
        }

        /* renamed from: a */
        public C12884a mo48583a(String str, String str2) {
            if (this.f34382b == null) {
                this.f34382b = new HashMap();
            }
            this.f34382b.put(str, str2);
            return this;
        }
    }

    C12883i(C12884a aVar) {
        this.f34376a = aVar.f34381a;
        this.f34377b = aVar.f34382b;
        this.f34378c = aVar.f34383c;
        this.f34379d = aVar.f34384d;
        this.f34380e = aVar.f34385e;
    }
}

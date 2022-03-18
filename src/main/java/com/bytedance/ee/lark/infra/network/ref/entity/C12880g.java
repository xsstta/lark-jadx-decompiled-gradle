package com.bytedance.ee.lark.infra.network.ref.entity;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.entity.g */
public class C12880g {

    /* renamed from: a */
    public String f34365a;

    /* renamed from: b */
    public MethodType f34366b;

    /* renamed from: c */
    public Map<String, String> f34367c;

    /* renamed from: d */
    public C12882h f34368d;

    /* renamed from: a */
    public Map<String, String> mo48562a() {
        return this.f34367c;
    }

    /* renamed from: b */
    public C12882h mo48563b() {
        return this.f34368d;
    }

    /* renamed from: c */
    public String mo48564c() {
        return this.f34365a;
    }

    /* renamed from: d */
    public MethodType mo48565d() {
        return this.f34366b;
    }

    /* renamed from: e */
    public C12881a mo48566e() {
        return new C12881a(this);
    }

    /* renamed from: com.bytedance.ee.lark.infra.network.ref.entity.g$a */
    public static class C12881a {

        /* renamed from: a */
        public String f34369a;

        /* renamed from: b */
        public MethodType f34370b;

        /* renamed from: c */
        public Map<String, String> f34371c;

        /* renamed from: d */
        public C12882h f34372d;

        public C12881a() {
            this.f34370b = MethodType.GET;
            this.f34371c = new HashMap();
        }

        /* renamed from: a */
        public C12880g mo48570a() {
            return new C12880g(this);
        }

        /* renamed from: a */
        public C12881a mo48568a(String str) {
            this.f34369a = str;
            return this;
        }

        /* renamed from: a */
        public C12881a mo48569a(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            this.f34371c = map;
            return this;
        }

        public C12881a(C12880g gVar) {
            this.f34369a = gVar.f34365a;
            this.f34370b = gVar.f34366b;
            this.f34371c = gVar.f34367c;
            this.f34372d = gVar.f34368d;
        }

        /* renamed from: a */
        public C12881a mo48567a(MethodType methodType, C12882h hVar) {
            this.f34370b = methodType;
            this.f34372d = hVar;
            return this;
        }
    }

    C12880g(C12881a aVar) {
        this.f34365a = aVar.f34369a;
        this.f34366b = aVar.f34370b;
        this.f34367c = aVar.f34371c;
        this.f34368d = aVar.f34372d;
    }
}

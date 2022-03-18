package com.lynx.tasm.p1216a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.a.e */
public class C26549e extends C26546b {

    /* renamed from: a */
    private String f65658a;

    /* renamed from: b */
    private HashMap<String, Object> f65659b;

    @Override // com.lynx.tasm.p1216a.C26546b
    /* renamed from: a */
    public Map<String, Object> mo94345a() {
        HashMap<String, Object> hashMap = this.f65659b;
        if (hashMap == null) {
            return null;
        }
        return hashMap;
    }

    @Override // com.lynx.tasm.p1216a.C26546b
    /* renamed from: b */
    public String mo94346b() {
        String str = this.f65658a;
        if (str != null) {
            return str;
        }
        return "params";
    }

    /* renamed from: a */
    public static C26549e m96248a(int i) {
        return new C26549e(i, "attach");
    }

    /* renamed from: b */
    public static C26549e m96249b(int i) {
        return new C26549e(i, "detach");
    }

    public C26549e(int i, String str) {
        super(i, str);
    }

    /* renamed from: a */
    public void mo94350a(String str, HashMap<String, Object> hashMap) {
        this.f65658a = str;
        this.f65659b = hashMap;
    }
}

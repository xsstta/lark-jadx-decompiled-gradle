package com.lynx.tasm.p1227d;

import java.util.HashMap;

/* renamed from: com.lynx.tasm.d.a */
public class C26886a {

    /* renamed from: a */
    private HashMap<String, String> f66749a = new HashMap<>();

    /* renamed from: b */
    private int f66750b = 0;

    /* renamed from: a */
    public boolean mo95679a(C26886a aVar) {
        if (aVar == null) {
            return false;
        }
        this.f66749a = aVar.f66749a;
        this.f66750b++;
        return true;
    }

    /* renamed from: a */
    public void mo95678a(HashMap hashMap, String str) {
        hashMap.put(str, this.f66749a);
    }

    /* renamed from: a */
    public boolean mo95680a(String str, String str2) {
        if (str == null || str.isEmpty() || str.startsWith("__")) {
            return false;
        }
        if (str2 == null) {
            this.f66749a.remove(str);
        } else {
            this.f66749a.put(str, str2);
        }
        this.f66750b++;
        return true;
    }
}

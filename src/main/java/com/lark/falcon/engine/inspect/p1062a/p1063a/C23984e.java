package com.lark.falcon.engine.inspect.p1062a.p1063a;

import java.util.ArrayList;

/* renamed from: com.lark.falcon.engine.inspect.a.a.e */
public class C23984e {

    /* renamed from: a */
    public final ArrayList<String> f59334a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<String> f59335b = new ArrayList<>();

    /* renamed from: a */
    public void mo86145a() {
        this.f59334a.clear();
        this.f59335b.clear();
    }

    /* renamed from: a */
    public String mo86144a(String str) {
        int size = this.f59334a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(this.f59334a.get(i))) {
                return this.f59335b.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo86146a(String str, String str2) {
        this.f59334a.add(str);
        this.f59335b.add(str2);
    }
}

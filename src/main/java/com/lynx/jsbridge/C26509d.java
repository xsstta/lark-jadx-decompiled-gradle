package com.lynx.jsbridge;

/* renamed from: com.lynx.jsbridge.d */
public class C26509d {

    /* renamed from: a */
    private String f65552a;

    /* renamed from: b */
    private Class<? extends LynxModule> f65553b;

    /* renamed from: c */
    private Object f65554c;

    /* renamed from: a */
    public String mo93990a() {
        return this.f65552a;
    }

    /* renamed from: b */
    public Class<? extends LynxModule> mo93994b() {
        return this.f65553b;
    }

    /* renamed from: c */
    public Object mo93995c() {
        return this.f65554c;
    }

    public String toString() {
        return "[" + this.f65553b.getSimpleName() + " - " + this.f65552a + "]";
    }

    /* renamed from: a */
    public void mo93991a(Class<? extends LynxModule> cls) {
        this.f65553b = cls;
    }

    /* renamed from: a */
    public void mo93992a(Object obj) {
        this.f65554c = obj;
    }

    /* renamed from: a */
    public void mo93993a(String str) {
        this.f65552a = str;
    }
}

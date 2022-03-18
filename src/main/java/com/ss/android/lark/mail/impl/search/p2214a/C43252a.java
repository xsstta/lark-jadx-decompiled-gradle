package com.ss.android.lark.mail.impl.search.p2214a;

/* renamed from: com.ss.android.lark.mail.impl.search.a.a */
public class C43252a<T> {

    /* renamed from: a */
    private T f110052a;

    /* renamed from: b */
    private int f110053b;

    /* renamed from: c */
    private AbstractC43253a<T> f110054c;

    /* renamed from: com.ss.android.lark.mail.impl.search.a.a$a */
    public interface AbstractC43253a<T> {
        /* renamed from: a */
        int mo154858a(T t);
    }

    /* renamed from: a */
    public T mo154856a() {
        return this.f110052a;
    }

    public C43252a(AbstractC43253a<T> aVar) {
        this.f110054c = aVar;
    }

    /* renamed from: a */
    public void mo154857a(T t) {
        if (t != null) {
            int a = this.f110054c.mo154858a(t);
            if (this.f110052a == null || a > this.f110053b) {
                this.f110052a = t;
                this.f110053b = a;
            }
        }
    }
}

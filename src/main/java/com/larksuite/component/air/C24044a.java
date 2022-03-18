package com.larksuite.component.air;

/* renamed from: com.larksuite.component.air.a */
public class C24044a {

    /* renamed from: a */
    private static C24044a f59449a;

    /* renamed from: b */
    private AbstractC24045b f59450b;

    private C24044a() {
    }

    /* renamed from: b */
    public AbstractC24045b mo86282b() {
        return this.f59450b;
    }

    /* renamed from: a */
    public static C24044a m87852a() {
        if (f59449a == null) {
            synchronized (C24044a.class) {
                if (f59449a == null) {
                    f59449a = new C24044a();
                }
            }
        }
        return f59449a;
    }

    /* renamed from: a */
    public void mo86281a(AbstractC24045b bVar) {
        this.f59450b = bVar;
    }
}

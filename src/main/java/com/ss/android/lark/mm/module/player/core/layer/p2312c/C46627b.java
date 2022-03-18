package com.ss.android.lark.mm.module.player.core.layer.p2312c;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.c.b */
public class C46627b {

    /* renamed from: a */
    private String f117341a;

    /* renamed from: b */
    private float f117342b = 1.0f;

    /* renamed from: c */
    private long f117343c;

    /* renamed from: d */
    private boolean f117344d = true;

    /* renamed from: e */
    private C46629c f117345e;

    /* renamed from: f */
    private AbstractC46628a f117346f;

    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.c.b$a */
    public interface AbstractC46628a {
        /* renamed from: a */
        void mo163741a();

        /* renamed from: a */
        void mo163742a(float f);
    }

    /* renamed from: a */
    public C46629c mo163821a() {
        return this.f117345e;
    }

    /* renamed from: b */
    public float mo163826b() {
        return this.f117342b;
    }

    /* renamed from: c */
    public long mo163827c() {
        return this.f117343c;
    }

    /* renamed from: d */
    public String mo163828d() {
        return this.f117341a;
    }

    /* renamed from: e */
    public boolean mo163829e() {
        return this.f117344d;
    }

    /* renamed from: a */
    public void mo163824a(String str) {
        this.f117341a = str;
    }

    /* renamed from: a */
    public void mo163822a(float f) {
        this.f117342b = f;
        AbstractC46628a aVar = this.f117346f;
        if (aVar != null) {
            aVar.mo163742a(f);
        }
    }

    /* renamed from: a */
    public void mo163823a(AbstractC46628a aVar) {
        this.f117346f = aVar;
        C46629c cVar = this.f117345e;
        if (cVar != null) {
            cVar.mo163831a(aVar);
        }
    }

    /* renamed from: a */
    public void mo163825a(boolean z) {
        this.f117344d = z;
    }

    public C46627b(String str, String str2) {
        this.f117345e = new C46629c(str, str2);
    }
}

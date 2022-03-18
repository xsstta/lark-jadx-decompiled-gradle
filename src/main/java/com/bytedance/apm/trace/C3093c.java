package com.bytedance.apm.trace;

/* renamed from: com.bytedance.apm.trace.c */
public final class C3093c {

    /* renamed from: a */
    private C3098f f9938a;

    /* renamed from: b */
    private String f9939b;

    /* renamed from: c */
    private int f9940c;

    /* renamed from: b */
    public void mo12973b() {
        C3098f fVar = this.f9938a;
        if (fVar != null) {
            fVar.mo12991d();
            this.f9938a = null;
        }
    }

    /* renamed from: a */
    public void mo12970a() {
        String str;
        if (this.f9940c == 1) {
            str = "activity";
        } else {
            str = "fragment";
        }
        C3098f fVar = new C3098f("page_load_trace", str);
        this.f9938a = fVar;
        fVar.mo12990c();
    }

    public C3093c(String str) {
        this(str, 1);
    }

    /* renamed from: b */
    public void mo12974b(String str) {
        C3098f fVar = this.f9938a;
        if (fVar != null) {
            fVar.mo12989b("", str);
        }
    }

    /* renamed from: a */
    public void mo12972a(String str) {
        C3098f fVar = this.f9938a;
        if (fVar != null) {
            fVar.mo12985a("", str);
        }
    }

    public C3093c(String str, int i) {
        this.f9939b = str;
        this.f9940c = i;
    }

    /* renamed from: a */
    public void mo12971a(int i, long j) {
        C3098f fVar = this.f9938a;
        if (fVar != null) {
            fVar.mo12982a(i, this.f9939b, j);
        }
    }
}

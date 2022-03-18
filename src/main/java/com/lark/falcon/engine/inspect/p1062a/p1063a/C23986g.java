package com.lark.falcon.engine.inspect.p1062a.p1063a;

/* renamed from: com.lark.falcon.engine.inspect.a.a.g */
public class C23986g extends C23984e {

    /* renamed from: c */
    public int f59339c;

    /* renamed from: d */
    public String f59340d;

    /* renamed from: e */
    public AbstractC23982d f59341e;

    @Override // com.lark.falcon.engine.inspect.p1062a.p1063a.C23984e
    /* renamed from: a */
    public void mo86145a() {
        super.mo86145a();
        this.f59339c = -1;
        this.f59340d = null;
        this.f59341e = null;
    }

    /* renamed from: b */
    public void mo86147b() {
        AbstractC23982d dVar = this.f59341e;
        if (dVar != null) {
            mo86146a("Content-Type", dVar.mo86141a());
            mo86146a("Content-Length", String.valueOf(this.f59341e.mo86143b()));
        }
    }
}

package com.bytedance.p725f.p726a.p728b;

import android.content.Context;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p727a.C13850a;
import com.bytedance.p725f.p726a.p728b.p729a.C13857a;
import com.bytedance.p725f.p726a.p728b.p730b.C13859a;
import com.bytedance.p725f.p726a.p728b.p731c.C13860a;
import com.bytedance.p725f.p726a.p728b.p732d.C13865a;
import com.bytedance.p725f.p726a.p734d.C13872a;
import com.bytedance.p725f.p726a.p734d.C13880b;
import java.util.List;

/* renamed from: com.bytedance.f.a.b.a */
public class C13856a implements AbstractC13853c {

    /* renamed from: a */
    private static volatile C13856a f36243a;

    /* renamed from: b */
    private Context f36244b;

    /* renamed from: c */
    private C13859a f36245c;

    /* renamed from: d */
    private C13865a f36246d;

    /* renamed from: e */
    private C13860a f36247e;

    /* renamed from: f */
    private C13857a f36248f;

    /* renamed from: g */
    private C13850a f36249g;

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: a */
    public C13850a mo51096a() {
        return this.f36249g;
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: d */
    public int mo51100d() {
        return this.f36245c.mo51117d();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: e */
    public int mo51101e() {
        return this.f36245c.mo51118e();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: f */
    public float mo51102f() {
        return this.f36245c.mo51119f();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: g */
    public void mo51103g() {
        this.f36247e.mo51122e();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: h */
    public AbstractC13853c.C13855b mo51104h() {
        return this.f36247e.mo51124g();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: i */
    public boolean mo51105i() {
        return this.f36248f.mo51112a();
    }

    /* renamed from: k */
    public String mo51108k() {
        return C13872a.m56255b();
    }

    /* renamed from: l */
    public List<List<Integer>> mo51109l() {
        return this.f36247e.mo51123f();
    }

    /* renamed from: m */
    public boolean mo51110m() {
        return this.f36245c.mo51116c();
    }

    /* renamed from: n */
    public int mo51111n() {
        return this.f36246d.mo51151c();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: b */
    public AbstractC13853c mo51098b() {
        C13880b.m56265a("start");
        this.f36245c.mo51114a();
        this.f36246d.mo51114a();
        this.f36247e.mo51114a();
        return this;
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: c */
    public void mo51099c() {
        C13880b.m56265a("end");
        this.f36245c.mo51115b();
        this.f36246d.mo51115b();
        this.f36247e.mo51115b();
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: j */
    public AbstractC13853c.C13854a mo51106j() {
        AbstractC13853c.C13854a aVar = new AbstractC13853c.C13854a();
        aVar.f36221a = mo51108k();
        aVar.f36222b = mo51110m();
        aVar.f36223c = mo51101e();
        aVar.f36224d = mo51111n();
        aVar.f36225e = mo51100d();
        aVar.f36226f = mo51102f();
        aVar.f36227g = mo51109l();
        return aVar;
    }

    private C13856a(Context context) {
        this(context, C13850a.f36211a);
    }

    @Override // com.bytedance.p725f.p726a.p727a.AbstractC13853c
    /* renamed from: a */
    public boolean mo51097a(float f) {
        return this.f36248f.mo51113a(f);
    }

    /* renamed from: a */
    public static C13856a m56177a(Context context) {
        if (f36243a == null) {
            synchronized (C13856a.class) {
                if (f36243a == null) {
                    f36243a = new C13856a(context);
                }
            }
        }
        return f36243a;
    }

    private C13856a(Context context, C13850a aVar) {
        this.f36244b = context.getApplicationContext();
        this.f36249g = aVar == null ? C13850a.f36211a : aVar;
        this.f36245c = new C13859a(this.f36244b, this);
        this.f36246d = new C13865a(this.f36244b, this);
        this.f36247e = new C13860a(this.f36244b, this);
        this.f36248f = new C13857a(this);
    }
}

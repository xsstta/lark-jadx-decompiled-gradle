package com.bytedance.ee.bear.drive.biz.preview.vc;

import com.bytedance.ee.bear.doc.follow.AbstractC5431f;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7137h;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.g */
public class C6738g {

    /* renamed from: a */
    private C6732e f18341a;

    /* renamed from: b */
    private C6724a f18342b;

    /* renamed from: c */
    private boolean f18343c;

    /* renamed from: d */
    private boolean f18344d;

    /* renamed from: e */
    private String f18345e = "";

    /* renamed from: f */
    private AbstractC5431f f18346f;

    /* renamed from: g */
    private AbstractC5424c f18347g;

    /* renamed from: b */
    public AbstractC5424c mo26514b() {
        return this.f18347g;
    }

    /* renamed from: c */
    public C6732e mo26515c() {
        return this.f18341a;
    }

    /* renamed from: d */
    public C6724a mo26516d() {
        return this.f18342b;
    }

    /* renamed from: e */
    public boolean mo26517e() {
        return this.f18343c;
    }

    /* renamed from: f */
    public String mo26518f() {
        return this.f18345e;
    }

    /* renamed from: g */
    public boolean mo26519g() {
        return this.f18344d;
    }

    public C6738g() {
        mo26509a();
    }

    /* renamed from: a */
    public void mo26509a() {
        this.f18342b = new C6724a();
        this.f18341a = new C6732e();
    }

    /* renamed from: i */
    private void m26543i() {
        C7137h hVar = new C7137h(mo26517e(), mo26518f());
        C6920b.m27342f().mo27166a().mo27917a(hVar);
        C6920b.m27342f().mo27167b().mo27877a(hVar);
    }

    /* renamed from: h */
    public void mo26520h() {
        this.f18342b.mo26472b();
        this.f18341a.mo26506e();
        AbstractC5431f fVar = this.f18346f;
        if (fVar != null) {
            fVar.mo21713b(this.f18342b);
            this.f18346f.mo21713b(this.f18341a);
            this.f18346f.mo21712b(this.f18347g);
        }
    }

    /* renamed from: a */
    public void mo26510a(AbstractC5424c cVar) {
        this.f18347g = cVar;
    }

    /* renamed from: a */
    public void mo26512a(boolean z) {
        this.f18344d = z;
    }

    /* renamed from: a */
    public void mo26511a(AbstractC5431f fVar) {
        this.f18346f = fVar;
        fVar.mo21711a(this.f18342b);
        this.f18346f.mo21711a(this.f18341a);
        this.f18346f.mo21710a(this.f18347g);
    }

    /* renamed from: a */
    public void mo26513a(boolean z, String str) {
        this.f18343c = z;
        this.f18345e = str;
        m26543i();
    }
}

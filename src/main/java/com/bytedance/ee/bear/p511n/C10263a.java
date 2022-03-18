package com.bytedance.ee.bear.p511n;

import android.content.Context;
import com.bytedance.ee.bear.debug.C5258c;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5468h;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5471k;
import com.bytedance.ee.bear.doc.resupdate.C5472l;
import com.bytedance.ee.bear.doc.resupdate.C5486o;
import com.bytedance.ee.bear.doc.resupdate.ResUpdateListener;
import com.bytedance.ee.bear.doc.resupdate.ResourceCallback;
import com.bytedance.ee.util.p701d.C13615c;

/* renamed from: com.bytedance.ee.bear.n.a */
public class C10263a implements AbstractC5469i {

    /* renamed from: a */
    AbstractC5471k f27737a;

    /* renamed from: b */
    private void m42825b() {
        if (this.f27737a == null) {
            mo21871a(C13615c.f35773a);
        }
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: a */
    public void mo21870a() {
        AbstractC5471k kVar = this.f27737a;
        if (kVar == null) {
            mo21871a(C13615c.f35773a);
        } else {
            kVar.mo21885a();
        }
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: a */
    public C5486o mo21869a(String str) {
        m42825b();
        return this.f27737a.mo21884a(str);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: c */
    public boolean mo21876c(String str) {
        m42825b();
        return this.f27737a.mo21890c(str);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: b */
    public void mo21875b(String str) {
        m42825b();
        this.f27737a.mo21889b(str);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: a */
    public void mo21871a(Context context) {
        C5472l b = C5472l.m22202b();
        this.f27737a = b;
        b.mo21886a(context);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: a */
    public void mo21873a(ResourceCallback pVar) {
        m42825b();
        this.f27737a.mo21887a(pVar);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: a */
    public void mo21874a(String str, ResUpdateListener mVar) {
        m42825b();
        this.f27737a.mo21888a(str, mVar);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5469i
    /* renamed from: a */
    public void mo21872a(Context context, String str, AbstractC5468h hVar) {
        new C5258c(context).mo21201a(str, hVar);
    }
}

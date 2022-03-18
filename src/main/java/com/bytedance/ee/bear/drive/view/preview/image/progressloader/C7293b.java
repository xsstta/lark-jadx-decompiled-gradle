package com.bytedance.ee.bear.drive.view.preview.image.progressloader;

import com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7280a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.Request;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7336b;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7282a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7285c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p369b.AbstractC7296c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.AbstractC7324b;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.AbstractC7325c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.b */
public class C7293b<V, D, E> implements Request, AbstractC7322c<D, E>, AbstractC7324b {

    /* renamed from: a */
    private C7282a f19543a;

    /* renamed from: b */
    private AbstractC7325c<V, D> f19544b;

    /* renamed from: c */
    private int f19545c;

    /* renamed from: d */
    private int f19546d;

    /* renamed from: e */
    private AbstractC7326d<V, D, E> f19547e;

    /* renamed from: f */
    private AbstractC7336b<D, E> f19548f;

    /* renamed from: g */
    private C7280a f19549g;

    /* renamed from: h */
    private Request.Status f19550h;

    /* renamed from: i */
    private C7280a.C7281a f19551i;

    /* renamed from: j */
    private AbstractC7296c<D> f19552j;

    /* renamed from: k */
    private AbstractC7296c<E> f19553k;

    /* renamed from: c */
    private void m29131c() {
        m29133e();
        m29134f();
        this.f19544b = null;
    }

    /* renamed from: d */
    private void m29132d() {
        C7280a.C7281a aVar = this.f19551i;
        if (aVar != null) {
            aVar.mo28455a();
            this.f19551i = null;
        }
    }

    /* renamed from: f */
    private void m29134f() {
        AbstractC7296c<E> cVar = this.f19553k;
        if (cVar != null) {
            cVar.mo28485b();
            this.f19553k = null;
        }
    }

    /* renamed from: e */
    private void m29133e() {
        if (this.f19552j != null) {
            this.f19544b.mo28553b();
            this.f19552j.mo28485b();
            this.f19552j = null;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.Request
    /* renamed from: a */
    public void mo28452a() {
        this.f19550h = Request.Status.WAITING_FOR_SIZE;
        if (C7333f.m29297a(this.f19545c, this.f19546d)) {
            mo28480a(this.f19545c, this.f19546d);
        } else {
            this.f19544b.mo28551a(this);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.Request
    /* renamed from: b */
    public void mo28453b() {
        if (this.f19550h != Request.Status.CANCELLED) {
            m29132d();
            m29131c();
            this.f19550h = Request.Status.CANCELLED;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.AbstractC7322c
    /* renamed from: a */
    public void mo28482a(Throwable th) {
        this.f19550h = Request.Status.FAILED;
        this.f19551i.mo28456b();
        AbstractC7326d<V, D, E> dVar = this.f19547e;
        if (dVar != null) {
            dVar.mo28557a(th);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.AbstractC7324b
    /* renamed from: a */
    public void mo28480a(int i, int i2) {
        C13479a.m54764b("ProgressiveImageLoader", String.format("on size ready, width = %d, height = %d", Integer.valueOf(i), Integer.valueOf(i2)));
        if (this.f19550h == Request.Status.WAITING_FOR_SIZE) {
            this.f19550h = Request.Status.RUNNING;
            this.f19551i = this.f19549g.mo28454a(new C7285c(this.f19543a), this.f19548f, this, i, i2);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.AbstractC7322c
    /* renamed from: b */
    public void mo28483b(AbstractC7296c<D> cVar, boolean z) {
        if (z) {
            this.f19550h = Request.Status.COMPLETE;
            this.f19551i.mo28456b();
        }
        m29133e();
        this.f19552j = cVar;
        AbstractC7326d<V, D, E> dVar = this.f19547e;
        if (dVar == null || !dVar.mo28555a(cVar.mo28486c(), this.f19544b.mo28554c(), z)) {
            this.f19544b.mo28552a(cVar.mo28486c());
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.AbstractC7322c
    /* renamed from: a */
    public void mo28481a(AbstractC7296c<E> cVar, boolean z) {
        m29134f();
        this.f19553k = cVar;
        AbstractC7326d<V, D, E> dVar = this.f19547e;
        if (dVar == null || !dVar.mo28556a(cVar.mo28486c(), z)) {
            cVar.mo28485b();
        }
    }

    public C7293b(C7282a aVar, AbstractC7325c<V, D> cVar, AbstractC7326d<V, D, E> dVar, AbstractC7336b<D, E> bVar, C7280a aVar2) {
        this(aVar, cVar, -1, -1, dVar, bVar, aVar2, Request.Status.PENDING);
    }

    public C7293b(C7282a aVar, AbstractC7325c<V, D> cVar, int i, int i2, AbstractC7326d<V, D, E> dVar, AbstractC7336b<D, E> bVar, C7280a aVar2, Request.Status status) {
        this.f19543a = aVar;
        this.f19544b = cVar;
        this.f19545c = i;
        this.f19546d = i2;
        this.f19547e = dVar;
        this.f19548f = bVar;
        this.f19549g = aVar2;
        this.f19550h = status;
    }
}

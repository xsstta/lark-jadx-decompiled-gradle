package com.bytedance.ee.bear.drive.loader.download.platform;

import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7044f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import io.reactivex.AbstractC68307f;
import java.util.Collections;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.e */
public class C7078e implements IDownloader, AbstractC7077d {

    /* renamed from: a */
    private final C10917c f19048a;

    /* renamed from: b */
    private final AbstractC7039c f19049b;

    /* renamed from: c */
    private final AbstractC7042d f19050c;

    /* renamed from: d */
    private C6923a f19051d;

    /* renamed from: e */
    private AbstractC7095c f19052e;

    /* renamed from: f */
    private AbstractC6993e f19053f;

    /* renamed from: g */
    private C7010a f19054g = new C7010a(this);

    /* renamed from: h */
    private C7080g f19055h = new C7080g(this);

    /* renamed from: i */
    private C7128a f19056i;

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.AbstractC7077d
    /* renamed from: a */
    public AbstractC7042d mo27672a() {
        return this.f19050c;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.AbstractC7077d
    /* renamed from: b */
    public C6923a mo27673b() {
        return this.f19051d;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.AbstractC7077d
    /* renamed from: c */
    public AbstractC7095c mo27674c() {
        return this.f19052e;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.AbstractC7077d
    /* renamed from: d */
    public AbstractC7039c mo27675d() {
        return this.f19049b;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.AbstractC7077d
    /* renamed from: e */
    public AbstractC6993e mo27676e() {
        return this.f19053f;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.AbstractC7077d
    /* renamed from: f */
    public C7128a mo27677f() {
        return this.f19056i;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader
    /* renamed from: a */
    public void mo27579a(AbstractC6949c cVar) {
        this.f19054g.mo27563b(cVar);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader
    /* renamed from: a */
    public void mo27580a(AbstractC7013c cVar) {
        C7010a aVar = this.f19054g;
        if (aVar != null) {
            aVar.mo27562a(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27578a(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        C7044f fVar = new C7044f(aVar);
        this.f19054g.mo27563b(cVar);
        return new C7075c(this.f19055h.mo27683a(cVar, fVar, this.f19055h.mo27682a(cVar, fVar)), fVar, this).mo27670a();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo27581b(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        C7044f fVar = new C7044f(aVar);
        this.f19054g.mo27561a(cVar);
        return new C7075c(this.f19055h.mo27683a(cVar, fVar, this.f19055h.mo27682a(cVar, fVar)), fVar, this).mo27670a();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader
    /* renamed from: c */
    public AbstractC68307f<Boolean> mo27582c(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        C7044f fVar = new C7044f(aVar);
        return new C7075c(Collections.singletonList(this.f19055h.mo27684b(cVar, fVar)), fVar, this).mo27670a();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader
    /* renamed from: d */
    public AbstractC68307f<Boolean> mo27583d(AbstractC6949c cVar, IDownloader.C7022a aVar) {
        C7044f fVar = new C7044f(aVar);
        this.f19054g.mo27564c(cVar);
        return new C7075c(this.f19055h.mo27683a(cVar, fVar, this.f19055h.mo27685c(cVar, fVar)), fVar, this).mo27670a();
    }

    /* renamed from: a */
    public static IDownloader m28152a(AbstractC7039c cVar, AbstractC7042d dVar, AbstractC6993e eVar) {
        return new C7078e(cVar, dVar, eVar);
    }

    private C7078e(AbstractC7039c cVar, AbstractC7042d dVar, AbstractC6993e eVar) {
        C10917c cVar2 = new C10917c(new C10929e());
        C6920b f = C6920b.m27342f();
        this.f19048a = cVar2;
        this.f19049b = cVar;
        this.f19050c = dVar;
        this.f19052e = f.mo27169d();
        this.f19053f = eVar;
        this.f19051d = f.mo27168c();
        this.f19056i = f.mo27167b();
    }
}

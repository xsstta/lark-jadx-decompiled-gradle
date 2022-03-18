package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.p374a;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.PagePart;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.a.a */
public class C7462a implements AbstractC2147d<PagePart> {

    /* renamed from: a */
    private final PDFPageModel f20129a;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<PagePart> mo10481a() {
        return PagePart.class;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.REMOTE;
    }

    public C7462a(PDFPageModel cVar) {
        this.f20129a = cVar;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super PagePart> aVar) {
        try {
            C13479a.m54764b("PDFPageDataFetcher", "loadData, page: " + this.f20129a.mo29121f() + ", thread: " + Thread.currentThread());
            aVar.mo10503a(this.f20129a.mo29120e().loadPageSync(this.f20129a.mo29121f(), ((float) this.f20129a.mo29122g()) * 1.0f, ((float) this.f20129a.mo29123h()) * 1.0f, this.f20129a.mo29124i(), this.f20129a.mo29125j(), this.f20129a.mo29126k()));
        } catch (Exception e) {
            C13479a.m54759a("PDFPageDataFetcher", "loadPageSync err. ", e);
            aVar.mo10502a(e);
        }
    }
}

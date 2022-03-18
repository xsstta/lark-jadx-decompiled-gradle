package com.bytedance.ee.bear.document.offline.sync.htmlcache;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.sync.htmlcache.C5994d;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6009a;
import com.bytedance.ee.bear.service.C10917c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.htmlcache.a */
public class C5991a implements AbstractC5993c, C6009a.AbstractC6012b {

    /* renamed from: a */
    private C10917c f16783a;

    /* renamed from: b */
    private C6009a f16784b;

    /* renamed from: c */
    private C5994d f16785c;

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: c */
    public void mo24247c() {
    }

    /* renamed from: d */
    private void m24251d() {
        if (m24252e()) {
            this.f16785c = new C5994d(this.f16783a);
        }
    }

    /* renamed from: e */
    private boolean m24252e() {
        return C4211a.m17514a().mo16536a("ccm.docx.ssr_mobile_app", false);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: a */
    public void mo24241a() {
        this.f16784b.mo24249a();
        C5994d dVar = this.f16785c;
        if (dVar != null) {
            dVar.mo24249a();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: b */
    public void mo24245b() {
        this.f16784b.mo24245b();
        C5994d dVar = this.f16785c;
        if (dVar != null) {
            dVar.mo24251b();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6009a.AbstractC6012b
    /* renamed from: a */
    public void mo24243a(OfflineDoc offlineDoc) {
        m24250c(offlineDoc);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6009a.AbstractC6012b
    /* renamed from: b */
    public void mo24246b(OfflineDoc offlineDoc) {
        m24250c(offlineDoc);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: a */
    public void mo24242a(ConnectionService.NetworkState networkState) {
        this.f16784b.mo24242a(networkState);
    }

    /* renamed from: c */
    private void m24250c(OfflineDoc offlineDoc) {
        if (offlineDoc != null && this.f16785c != null) {
            C5994d.C5996b bVar = new C5994d.C5996b();
            bVar.mo24255a(offlineDoc);
            this.f16785c.mo24250a(bVar);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: a */
    public void mo24244a(List<OfflineDoc> list) {
        this.f16784b.mo24244a(list);
    }

    public C5991a(C6009a aVar, C10917c cVar) {
        this.f16784b = aVar;
        aVar.mo24295a(this);
        this.f16783a = cVar;
        m24251d();
    }
}

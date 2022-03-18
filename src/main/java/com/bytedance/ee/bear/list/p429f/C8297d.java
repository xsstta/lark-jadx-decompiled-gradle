package com.bytedance.ee.bear.list.p429f;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.p429f.AbstractC8293a;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;

/* renamed from: com.bytedance.ee.bear.list.f.d */
public class C8297d extends BaseListPresenter<AbstractC8542h, AbstractC8293a, AbstractC8293a.AbstractC8294a> implements AbstractC8293a.AbstractC8294a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "quick_access";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "PinDocumentPresenter";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: m */
    public String mo32597m() {
        return "home";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("PinDocumentPresenter", "create()...");
    }

    /* renamed from: c */
    private RouteBean m34202c(Document document) {
        return new C8706f(this.f23067c, document, "home", mo33311l(), mo32593a(), "").mo33741a();
    }

    @Override // com.bytedance.ee.bear.list.p429f.AbstractC8293a.AbstractC8294a
    /* renamed from: b */
    public void mo32585b(Document document) {
        C13479a.m54764b(mo32596c(), "onPinClick()...");
        C8292f.m34155a(this.f23068d, document, mo32593a(), mo33318t());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a, com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32594a(Document document) {
        super.mo32594a(document);
        ListAnalysis.m32520a("home", mo32593a(), "share", "ccm_permission_share_view", mo32593a(), document.mo32472o(), document.mo32483t(), document.mo32377C(), Boolean.valueOf(C13657b.m55421a(((AbstractC8293a) getView()).mo33351w())), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m34202c(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_home_page_click", "home", mo32593a(), mo32593a(), "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    C8297d(AbstractC8293a aVar, AbstractC8542h hVar, Context context, C10917c cVar, C7718l lVar) {
        super(aVar, hVar, context, cVar, lVar);
    }
}

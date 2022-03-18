package com.bytedance.ee.bear.wikiv2.home.recent;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.route.C12339a;
import com.bytedance.ee.bear.wikiv2.route.WikiRouteBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.d */
public class C12292d extends BaseListPresenter<AbstractC8542h, AbstractC8544i<AbstractC8544i.AbstractC8545a>, AbstractC8544i.AbstractC8545a> {

    /* renamed from: a */
    private boolean f33006a;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "wiki";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "Wiki_RecentWikiListPresenter";
    }

    /* renamed from: d */
    public void mo32660d() {
        this.f33006a = true;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: k */
    public void mo33310k() {
        super.mo33310k();
        if (this.f33006a) {
            mo33313o();
            this.f33006a = false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: q */
    public void mo33315q() {
        C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.preloadDocuments. ");
        super.mo33315q();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ List m51215b(List list) throws Exception {
        return C13659d.m55431a(list, $$Lambda$tG28LNtrrHkKRLx9UZzJXW6JFeE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m51213a(String str) throws Exception {
        return C8153a.m32844b().mo31649n();
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public /* synthetic */ void m51216c(Throwable th) throws Exception {
        C13479a.m54759a("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onListChanged, load recent wiki failure. ", th);
        super.mo33301a(new ArrayList<>());
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public /* synthetic */ void m51214a(List list) throws Exception {
        C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onListChanged, load recent wiki success, size= " + list.size());
        super.mo33301a((ArrayList) list);
    }

    /* renamed from: a */
    private RouteBean m51212a(WikiDocument wikiDocument) {
        WikiRouteBean wikiRouteBean = new WikiRouteBean(wikiDocument.mo32472o(), wikiDocument.mo32483t(), wikiDocument.mo21011c(), wikiDocument.mo21016e(), "");
        wikiRouteBean.mo40615d(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(this.f23067c, wikiDocument));
        Bundle bundle = new Bundle();
        bundle.putString("wiki_version", "2");
        wikiRouteBean.mo40613b(bundle);
        return wikiRouteBean;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo33301a(ArrayList<Document> arrayList) {
        C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onListChanged, size= " + C13657b.m55424c(arrayList));
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33055a("wiki");
        this.f23075k.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d($$Lambda$d$cuGLZ_iVl1I03K4ckVv2r7drRo8.INSTANCE).mo238020d($$Lambda$d$UJoHI4xPzccgNnnDMoVQTuLjEE4.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$d$2tc5rczOuvBoZRiGrlHdwpeyef8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12292d.this.m51214a((C12292d) ((List) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$d$nCvfE8hJDSmXJQ7rM7GUrvpqGCI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12292d.this.m51216c((C12292d) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        if (!C13737d.m55692a()) {
            C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onItemClick, invalid click. ");
        } else if (mo33312n() || document.mo32464l()) {
            WikiDocument wikiDocument = (WikiDocument) document;
            wikiDocument.mo32467m(C12339a.m51373a(wikiDocument.mo21011c()));
            C8292f.m34139a(this.f23069e.getActivity(), this.f23068d, wikiDocument, mo33312n(), m51212a(wikiDocument), "wiki", i, z, 0);
            C12237b.m50898a("select_page", "recents", ((AbstractC8544i) getView()).mo33351w().size(), i);
            WikiReportV2.m50923c("recently_view", "ccm_docs_page_view");
        } else {
            C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onItemClick, offline click. ");
            Toast.showText(this.f23069e.getContext(), this.f23069e.getString(R.string.Doc_Wiki_Network_Error), 0);
        }
    }

    public C12292d(AbstractC8544i<AbstractC8544i.AbstractC8545a> iVar, AbstractC8542h hVar, Context context, C10917c cVar, C7718l lVar) {
        super(iVar, hVar, context, cVar, lVar);
    }
}

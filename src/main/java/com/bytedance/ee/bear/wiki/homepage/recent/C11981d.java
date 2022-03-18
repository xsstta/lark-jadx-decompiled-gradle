package com.bytedance.ee.bear.wiki.homepage.recent;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.contract.route.parcelable.WikiRouteBean;
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
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
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

/* renamed from: com.bytedance.ee.bear.wiki.homepage.recent.d */
public class C11981d extends BaseListPresenter<AbstractC8542h, AbstractC8544i<AbstractC8544i.AbstractC8545a>, AbstractC8544i.AbstractC8545a> {

    /* renamed from: a */
    private boolean f32364a;

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
        this.f32364a = true;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: k */
    public void mo33310k() {
        super.mo33310k();
        if (this.f32364a) {
            mo33313o();
            this.f32364a = false;
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
    public static /* synthetic */ List m49652b(List list) throws Exception {
        return C13659d.m55431a(list, $$Lambda$tG28LNtrrHkKRLx9UZzJXW6JFeE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m49650a(String str) throws Exception {
        return C8153a.m32844b().mo31649n();
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public /* synthetic */ void m49653c(Throwable th) throws Exception {
        C13479a.m54759a("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onListChanged, load recent wiki failure. ", th);
        super.mo33301a(new ArrayList<>());
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public /* synthetic */ void m49651a(List list) throws Exception {
        C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onListChanged, load recent wiki success, size= " + list.size());
        super.mo33301a((ArrayList) list);
    }

    /* renamed from: a */
    private RouteBean m49649a(WikiDocument wikiDocument) {
        WikiRouteBean wikiRouteBean = new WikiRouteBean("");
        wikiRouteBean.mo21055a(wikiDocument.mo21016e());
        Bundle bundle = new Bundle();
        bundle.putParcelable("home_node", ((C11978c) getModel()).mo45916a(wikiRouteBean.mo21054a()));
        bundle.putString("wiki_version", "1");
        wikiRouteBean.mo40613b(bundle);
        wikiRouteBean.mo40615d(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(this.f23067c, wikiDocument));
        return wikiRouteBean;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo33301a(ArrayList<Document> arrayList) {
        C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onListChanged, size= " + C13657b.m55424c(arrayList));
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33055a("wiki");
        this.f23075k.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d($$Lambda$d$xASBtIhcZLMQPp5Y53FxmOIyt4.INSTANCE).mo238020d($$Lambda$d$hBH9zYRsxiDkQVTIXD3xj5OymR0.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$d$5aeVcuD9p7CXRFF4U1bs88ES_9E */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11981d.this.m49651a((C11981d) ((List) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$d$JOlMyytBZCHjHEYESKXg9O5yGJw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11981d.this.m49653c((C11981d) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        if (!C13737d.m55692a()) {
            C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onItemClick, invalid click. ");
        } else if (mo33312n() || document.mo32464l()) {
            C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m49649a((WikiDocument) document), mo32593a(), i, z);
            C11933b.m49481a("select_page", "recents", ((AbstractC8544i) getView()).mo33351w().size(), i);
        } else {
            C13479a.m54764b("Wiki_RecentWikiListPresenter", "RecentWikiListPresenter.onItemClick, offline click. ");
            Toast.showText(this.f23069e.getContext(), this.f23069e.getString(R.string.Doc_Wiki_Network_Error), 0);
        }
    }

    public C11981d(AbstractC8544i<AbstractC8544i.AbstractC8545a> iVar, AbstractC8542h hVar, Context context, C10917c cVar, C7718l lVar) {
        super(iVar, hVar, context, cVar, lVar);
    }
}

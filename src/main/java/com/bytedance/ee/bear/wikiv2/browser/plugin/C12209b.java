package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.C6057p;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13681h;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.b */
public class C12209b extends C6057p {

    /* renamed from: h */
    private final WikiViewModel f32848h;

    /* renamed from: i */
    private final AbstractC12210a f32849i;

    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.b$a */
    public interface AbstractC12210a {
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ WikiInfo m50837k() throws Exception {
        WikiInfo b = this.f32848h.getWikiInfo().mo5927b();
        WikiException.validate(this.f16931b.mo19562e(), ar.f14811a, b);
        return b;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: e */
    public BearUrl mo24480e() {
        return C6313i.m25327a().mo25399g(C13681h.m55563b(this.f16931b.mo24598m().getOriginUrl(), "wiki_version", "2"));
    }

    /* renamed from: j */
    private void m50836j() {
        TitleBar d;
        if (this.f16931b.mo24598m().getOpenSource() == DocsOpenSource.vc && (d = this.f16931b.mo24597l().mo19444d()) != null) {
            d.mo19515a(false);
            d.mo19525e(false);
            d.mo19526f(false);
        }
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o, com.bytedance.ee.bear.document.C6057p
    /* renamed from: a */
    public void mo23795a() {
        AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$b$5qsEgEsMGe8Y9bh2K5faBX47kU */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C12209b.this.m50837k();
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$b$n9Ahx5Mb1QHmRINvGaOiqPXd0k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12209b.this.m50835b((C12209b) ((WikiInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$b$phP6UYAahKbEMGP4E3Lr8BNJoVY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12209b.this.m50834a((C12209b) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: a */
    public /* synthetic */ void m50834a(Throwable th) throws Exception {
        C13479a.m54759a("WikiLoaderV2", "WikiLoader.load err. ", th);
        mo24477a(th, (Map<String, String>) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50835b(WikiInfo wikiInfo) throws Exception {
        m50833a(this.f32848h.getWikiInfo().mo5927b());
    }

    /* renamed from: a */
    private void m50833a(WikiInfo wikiInfo) {
        C5890a.m23695a(wikiInfo.getObjType());
        mo24484i().mo22333a("wikiInfo", wikiInfo);
        super.mo23795a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: a */
    public C5968f mo24474a(BearUrl bearUrl) {
        boolean z;
        C5968f fVar = null;
        try {
            WikiInfo b = this.f32848h.getWikiInfo().mo5927b();
            if (b != null) {
                fVar = C5955d.m24025b().mo24091c(this.f16934e.f14592i + "_" + this.f16934e.f14584a + C8275a.m34053c(b.getObjTypeString()), b.getObjToken());
            }
        } catch (Exception e) {
            C13479a.m54761a("WikiLoaderV2", e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getClientVarCache success?");
        if (fVar != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("WikiLoaderV2", sb.toString());
        if (fVar == null) {
            return new C5968f();
        }
        return fVar;
    }

    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: a */
    public void mo24477a(Throwable th, Map<String, String> map) {
        m50836j();
        super.mo24477a(th, map);
    }

    C12209b(C6095s sVar, AbstractC12210a aVar) {
        super(sVar);
        this.f32848h = (WikiViewModel) C4950k.m20479a(sVar, WikiViewModel.class, WikiViewModel.newFactory(sVar.mo24597l().getArguments()));
        this.f16930a = "WikiLoaderV2";
        this.f32849i = aVar;
    }
}

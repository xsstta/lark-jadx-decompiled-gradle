package com.bytedance.ee.bear.wikiv2.route;

import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12477f;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.route.e */
public class C12343e extends AbstractC10737b {
    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/wikiv2/treehome/activity";
    }

    public C12343e(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51400a(Throwable th) throws Exception {
        C13479a.m54759a("WikiTreeHomeRouteInterceptorV2", "getWikiSpace fail. ", th);
        m51397a(C12477f.m51915b(th));
    }

    /* renamed from: b */
    private boolean m51401b(BearUrl bearUrl) {
        if (bearUrl == null || !TextUtils.equals(bearUrl.f17446a, "wiki_space_home")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m51397a(int i) {
        C13479a.m54764b("WikiTreeHomeRouteInterceptorV2", "navigate to default route, enableNativeDefaultRoute: $enableNativeDefaultRoute");
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/default/route").mo17308a("wiki_space_error_code", i).mo17317a();
    }

    /* renamed from: b */
    public void mo47039b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("WikiTreeHomeRouteInterceptorV2", "route. ");
        WikiSpaceRepository.m51027a(bearUrl.f17454i).mo238001b(new Consumer(bearUrl, routeBean) {
            /* class com.bytedance.ee.bear.wikiv2.route.$$Lambda$e$XHAKS4TgkaVFRSeQRfYlmn5xKw */
            public final /* synthetic */ BearUrl f$1;
            public final /* synthetic */ RouteBean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12343e.this.m51398a((C12343e) this.f$1, (BearUrl) this.f$2, (RouteBean) ((Document) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.route.$$Lambda$e$aXduRepkU_oDkz_kQEacYqck4iA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12343e.this.m51400a((C12343e) ((Throwable) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            C13479a.m54775e("WikiTreeHomeRouteInterceptorV2", "onIntercept, feature disable, return. ");
            return false;
        } else if (!m51401b(bearUrl)) {
            return false;
        } else {
            if (mo40642c(bearUrl, routeBean)) {
                return true;
            }
            mo47039b(bearUrl, routeBean);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51398a(Document document, BearUrl bearUrl, RouteBean routeBean) {
        WikiTreeActivityContract wikiTreeActivityContract = new WikiTreeActivityContract();
        wikiTreeActivityContract.setSpaceId(document.mo32399O());
        WikiDocument wikiDocument = (WikiDocument) document;
        wikiTreeActivityContract.setDocumentToken(wikiDocument.mo21011c());
        wikiTreeActivityContract.setDocumentName(document.mo32469n());
        wikiTreeActivityContract.setWikiDocument(wikiDocument);
        mo40641d(bearUrl, routeBean).mo17311a(WikiTreeActivityContract.class.getName(), (Parcelable) wikiTreeActivityContract).mo17317a();
    }
}

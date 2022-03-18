package com.bytedance.ee.bear.wikiv2.home.banner;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.banner.c */
public class C12272c extends BaseBannerPresenter<IBannerContract.IModel, IBannerContract.IView<IBannerContract.IView.Delegate>, IBannerContract.IView.Delegate> {
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: g */
    public String mo33106g() {
        return "wiki";
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: h */
    public String mo33107h() {
        return "";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ IModel getModel() {
        return super.mo33112m();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ IView getView() {
        return super.mo33113n();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: j */
    public ArrayList<Document> mo33109j() {
        ArrayList<Document> arrayList = new ArrayList<>();
        arrayList.addAll(mo33112m().mo33088e());
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: i */
    public void mo33108i() {
        C13479a.m54764b("WikiBannerPresenter", "clickMore...");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<Document> it = mo33109j().iterator();
        while (it.hasNext()) {
            Document next = it.next();
            if (next instanceof WikiDocument) {
                arrayList.add((WikiDocument) next);
            }
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wikiv2/spacelist/activity").mo17308a("EXTRA_PAGE_MODE", 0).mo17315a("space_list_data", arrayList).mo17317a();
        C12237b.m50898a("see_all", "all_workspaces", arrayList.size(), -1);
        WikiReportV2.m50923c("view_all_workspace", "ccm_wiki_all_space_view");
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ void setModel(IModel iModel) {
        super.mo33098a((IBannerContract.IModel) iModel);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter
    public /* synthetic */ void setView(IView iView) {
        super.mo33099a((IBannerContract.IView) iView);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: a */
    public void mo33100a(ArrayList<Document> arrayList) {
        mo33112m().mo33084a(arrayList);
        if (((C12271b) mo33112m()).mo46839m() || C13657b.m55423b(arrayList)) {
            mo33113n().mo33122a(arrayList);
        }
        mo33113n().mo33123a(mo33112m().mo33089f());
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter
    /* renamed from: a */
    public void mo33097a(Document document, int i) {
        C13479a.m54764b("WikiBannerPresenter", "handleItemClick... Document = " + document);
        if (document == null) {
            C13479a.m54758a("wiki_flow", "item is null");
            return;
        }
        WikiTreeActivityContract wikiTreeActivityContract = new WikiTreeActivityContract();
        wikiTreeActivityContract.setSpaceId(document.mo32399O());
        WikiDocument wikiDocument = (WikiDocument) document;
        wikiTreeActivityContract.setDocumentToken(wikiDocument.mo21011c());
        wikiTreeActivityContract.setDocumentName(document.mo32469n());
        wikiTreeActivityContract.setWikiDocument(wikiDocument);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wikiv2/treehome/activity").mo17311a(WikiTreeActivityContract.class.getName(), (Parcelable) wikiTreeActivityContract).mo17317a();
        C12237b.m50898a("select_space", "workspaces", mo33109j().size(), i);
        WikiReportV2.m50923c("workspace", "ccm_wiki_tree_view");
    }

    public C12272c(C7667e eVar, Context context, IBannerContract.IModel aVar, IBannerContract.IView<IBannerContract.IView.Delegate> bVar, C10917c cVar) {
        super(eVar, context, aVar, bVar, cVar);
    }
}

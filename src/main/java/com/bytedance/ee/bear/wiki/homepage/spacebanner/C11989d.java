package com.bytedance.ee.bear.wiki.homepage.spacebanner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerView;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacebanner.d */
public class C11989d extends BaseBannerView<C11991f, IBannerContract.IView.Delegate> {

    /* renamed from: e */
    private WikiBannerRVLinearLayoutManager f32378e;

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: e */
    public String mo33128e() {
        return mo33129f().getString(R.string.Doc_Wiki_Home_WorkspaceTitle);
    }

    /* renamed from: i */
    public C11991f mo33127d() {
        return new C11991f(mo33131h(), R.layout.wiki_space_banner_item_content);
    }

    /* renamed from: j */
    private void m49706j() {
        this.f32378e.mo45921a(false);
        ((C11991f) this.f22879c).mo45935a(true);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new WikiDocument());
        }
        ((C11991f) this.f22879c).mo70690f(arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: b */
    public void mo33124b() {
        super.mo33124b();
        this.f22878b.setPadding(0, 0, 0, 0);
        C11986a aVar = new C11986a();
        ((C11991f) this.f22879c).mo45934a(aVar);
        ((C11991f) this.f22879c).mo70663a(R.layout.wiki_space_banner_empty, (ViewGroup) this.f22878b);
        this.f32378e = new WikiBannerRVLinearLayoutManager(mo33129f(), 0, false);
        this.f22878b.setLayoutManager(this.f32378e);
        int itemDecorationCount = this.f22878b.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            this.f22878b.removeItemDecorationAt(i);
        }
        C11990e eVar = new C11990e();
        eVar.mo45932a((int) aVar.mo45926e());
        eVar.mo45933b(1);
        eVar.attachToRecyclerView(this.f22878b);
        this.f22877a.setText(R.string.Doc_Wiki_Home_SeeAll);
        m49706j();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: a */
    public void mo33120a(ConnectionService.NetworkState networkState) {
        super.mo33120a(networkState);
        ((C11991f) this.f22879c).notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: a */
    public void mo33122a(ArrayList<Document> arrayList) {
        ((C11991f) this.f22879c).mo45935a(false);
        this.f32378e.mo45921a(true);
        if (arrayList == null || arrayList.isEmpty()) {
            C13479a.m54764b("WikiBannerView", "showList: list is empty ");
            ((C11991f) this.f22879c).mo70690f(new ArrayList());
            return;
        }
        C13479a.m54764b("WikiBannerView", "showList: " + arrayList.size());
        ((C11991f) this.f22879c).mo70690f(arrayList);
    }

    public C11989d(Context context, View view, C10917c cVar) {
        super(context, view, cVar);
    }
}

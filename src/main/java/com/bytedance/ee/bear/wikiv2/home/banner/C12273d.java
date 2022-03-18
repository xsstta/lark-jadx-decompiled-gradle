package com.bytedance.ee.bear.wikiv2.home.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerView;
import com.bytedance.ee.bear.list.homepage.banner.IBannerContract;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3459a.C68326a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.banner.d */
public class C12273d extends BaseBannerView<C12275f, IBannerContract.IView.Delegate> {

    /* renamed from: e */
    private WikiBannerRVLinearLayoutManager f32964e;

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m51076k() throws Exception {
        ((C12275f) this.f22879c).notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: e */
    public String mo33128e() {
        return mo33129f().getString(R.string.Doc_Wiki_Home_WorkspaceTitle);
    }

    /* renamed from: i */
    public C12275f mo33127d() {
        return new C12275f(mo33131h(), R.layout.wiki_home_banner_item);
    }

    /* renamed from: j */
    private void m51075j() {
        this.f32964e.mo46830a(false);
        ((C12275f) this.f22879c).mo46844a(true);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new WikiDocument());
        }
        ((C12275f) this.f22879c).mo70690f(arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: b */
    public void mo33124b() {
        super.mo33124b();
        this.f22878b.setPadding(0, 0, 0, 0);
        C12270a aVar = new C12270a();
        ((C12275f) this.f22879c).mo46843a(aVar);
        ((C12275f) this.f22879c).mo70663a(R.layout.wiki_home_banner_empty, (ViewGroup) this.f22878b);
        this.f32964e = new WikiBannerRVLinearLayoutManager(mo33129f(), 0, false);
        this.f22878b.setLayoutManager(this.f32964e);
        int itemDecorationCount = this.f22878b.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            this.f22878b.removeItemDecorationAt(i);
        }
        C12274e eVar = new C12274e();
        eVar.mo46841a((int) aVar.mo46835e());
        eVar.mo46842b(1);
        eVar.attachToRecyclerView(this.f22878b);
        this.f22877a.setText(R.string.Doc_Wiki_Home_SeeAll);
        m51075j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51074a(List list) throws Exception {
        ((C12275f) this.f22879c).mo46845b((List<String>) list);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView
    /* renamed from: a */
    public void mo33120a(ConnectionService.NetworkState networkState) {
        super.mo33120a(networkState);
        WikiSpaceRepository.m51026a(networkState).mo237985a(C11678b.m48481e()).mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.banner.$$Lambda$d$zkv1O8LE4M1xDNIDMwqZcJ47sig */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12273d.this.m51074a((C12273d) ((List) obj));
            }
        }).mo238015c(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.wikiv2.home.banner.$$Lambda$d$c6j1h0KE_x04D64UTbmbdAFg094 */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C12273d.this.m51076k();
            }
        }).mo238001b(C68326a.m265193b(), $$Lambda$d$73SCjj1t9SxzWk6quSUzFV4H1g.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.homepage.banner.BaseBannerView, com.bytedance.ee.bear.list.homepage.banner.IBannerContract.IView
    /* renamed from: a */
    public void mo33122a(ArrayList<Document> arrayList) {
        ((C12275f) this.f22879c).mo46844a(false);
        this.f32964e.mo46830a(true);
        if (arrayList == null || arrayList.isEmpty()) {
            C13479a.m54764b("WikiBannerView", "showList: list is empty ");
            ((C12275f) this.f22879c).mo70690f(new ArrayList());
            return;
        }
        C13479a.m54764b("WikiBannerView", "showList: " + arrayList.size());
        ((C12275f) this.f22879c).mo70690f(arrayList);
    }

    public C12273d(Context context, View view, C10917c cVar) {
        super(context, view, cVar);
    }
}

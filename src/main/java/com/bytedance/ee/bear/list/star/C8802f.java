package com.bytedance.ee.bear.list.star;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.list.star.AbstractC8808k;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.star.f */
public class C8802f extends BaseListPresenter<AbstractC8807j, AbstractC8808k, AbstractC8808k.AbstractC8809a> implements AbstractC8651p.AbstractC8659h, AbstractC8808k.AbstractC8809a {

    /* renamed from: a */
    protected C8786n f23725a;

    /* renamed from: b */
    private Disposable f23726b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "favorites";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "FavoritePresenter";
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8659h
    public void F_() {
        C13479a.m54764b("FavoritePresenter", "onStarItemSuccess()...");
        mo33313o();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m36904d();
        C13479a.m54764b("FavoritePresenter", "create()...");
    }

    /* renamed from: d */
    private void m36904d() {
        if (this.f23069e.getActivity() == null) {
            C13479a.m54758a("FavoritePresenter", "observeSortAndFilter()...activity is null");
            return;
        }
        if (this.f23725a == null) {
            this.f23725a = (C8786n) aj.m5366a(this.f23069e.getActivity()).mo6005a(C8786n.class);
        }
        this.f23725a.getSortStrategyLiveData().mo5923a(this.f23069e, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$f$OUz4tFPJCSPBtcK0xLiL3Rfqx5M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8802f.this.m36901a((C8802f) ((FolderSortStrategy) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36903c(Throwable th) throws Exception {
        C13479a.m54758a("FavoritePresenter", "getFilterDocuments()...error = " + th);
    }

    /* renamed from: e */
    private RouteBean m36905e(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "home").mo33741a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36901a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), "star")) {
            Disposable disposable = this.f23726b;
            if (disposable != null && !disposable.isDisposed()) {
                this.f23726b.dispose();
            }
            this.f23726b = ((AbstractC8807j) getModel()).mo32720k().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.star.$$Lambda$f$fO8__8lTcVbav4gcZNzcZoUJ3vU */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8802f.this.m36902b((C8802f) ((ArrayList) obj));
                }
            }, $$Lambda$f$0rdxir5xwqM6W9SqIDU25xuyX50.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36902b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("FavoritePresenter", "onFilterChanged()...getFilterDocuments success, size = " + C13657b.m55424c(arrayList));
        if (C13657b.m55423b(arrayList)) {
            ((AbstractC8808k) getView()).mo33334b(arrayList);
        }
    }

    @Override // com.bytedance.ee.bear.list.star.AbstractC8808k.AbstractC8809a
    /* renamed from: c */
    public void mo32659c(Document document) {
        C13479a.m54764b(mo32596c(), "onStarClick()...");
        C8292f.m34170b(this.f23068d, document, mo32593a(), mo33318t());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a, com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32594a(Document document) {
        boolean z;
        super.mo32594a(document);
        String a = mo32593a();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        ListAnalysis.m32523a("ccm_space_favorites_page_click", a, "", "share", "ccm_permission_share_view", "", o, t, C, "", z, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33308i()), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m36905e(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_favorites_page_click", mo32593a(), "", "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    C8802f(AbstractC8808k kVar, AbstractC8807j jVar, Context context, C10917c cVar, C7718l lVar) {
        super(kVar, jVar, context, cVar, lVar);
    }
}

package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.list.share.AbstractC8744r;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class au extends BaseListPresenter<AbstractC8743q, AbstractC8744r, AbstractC8744r.AbstractC8745a> implements AbstractC8744r.AbstractC8745a {

    /* renamed from: a */
    protected C8786n f23578a;

    /* renamed from: b */
    private Disposable f23579b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "shared";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "SharedPresenter";
    }

    /* renamed from: d */
    private void m36606d() {
        this.f23075k.mo237937a(((AbstractC8743q) getModel()).mo33773e().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$au$sEeNJE4ZjEobsTxretcovyQ0bmY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                au.this.m36602a((au) ((Integer) obj));
            }
        }, $$Lambda$au$Vr69v2Q1pc1wxMVFabBs07O3fw.INSTANCE));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m36608e();
        m36606d();
        C13479a.m54764b("SharedPresenter", "create()...");
    }

    /* renamed from: e */
    private void m36608e() {
        if (this.f23069e.getActivity() == null) {
            C13479a.m54758a("SharedPresenter", "observeSortAndFilter()...activity is null");
            return;
        }
        if (this.f23578a == null) {
            this.f23578a = (C8786n) aj.m5366a(this.f23069e.getActivity()).mo6005a(C8786n.class);
        }
        this.f23578a.getSortStrategyLiveData().mo5923a(this.f23069e, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$au$2GHosMnwIlNKaV86snnJBYGTbk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                au.this.m36601a((au) ((FolderSortStrategy) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8744r.AbstractC8745a
    /* renamed from: b */
    public void mo33774b(Document document) {
        C8292f.m34170b(this.f23068d, document, mo32593a(), mo33318t());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36602a(Integer num) throws Exception {
        if (num != null && num.intValue() > 0 && (this.f23069e.getParentFragment() instanceof AbstractC8736k)) {
            ((AbstractC8736k) this.f23069e.getParentFragment()).mo33778c(true);
        }
    }

    /* renamed from: c */
    private RouteBean m36604c(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "home").mo33741a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36601a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), "shared")) {
            Disposable disposable = this.f23579b;
            if (disposable != null && !disposable.isDisposed()) {
                this.f23579b.dispose();
            }
            this.f23579b = ((AbstractC8743q) getModel()).D_().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$au$bFgWsvm194oQJcStnIGbbGnpV78 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    au.this.m36603b((au) ((ArrayList) obj));
                }
            }, $$Lambda$au$t7n1DddBH8Df3c5eKneZbM0boLA.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36603b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("SharedPresenter", "onFilterChanged()...getFilterDocuments success, size = " + C13657b.m55424c(arrayList));
        if (C13657b.m55423b(arrayList)) {
            ((AbstractC8744r) getView()).mo33334b(arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36605c(Throwable th) throws Exception {
        C13479a.m54758a("SharedPresenter", "getFilterDocuments()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m36607d(Throwable th) throws Exception {
        C13479a.m54758a("SharedPresenter", "getHistorySharedFolders()...error = " + th);
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
        ListAnalysis.m32523a("ccm_space_shared_page_click", a, "", "share", "ccm_permission_share_view", "", o, t, C, "", z, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33308i()), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m36604c(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_shared_page_click", mo32593a(), "", "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    au(AbstractC8744r rVar, AbstractC8743q qVar, Context context, C10917c cVar, C7718l lVar) {
        super(rVar, qVar, context, cVar, lVar);
    }
}

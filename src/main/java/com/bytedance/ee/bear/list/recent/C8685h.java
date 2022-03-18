package com.bytedance.ee.bear.list.recent;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.list.listsync.AbstractC8564c;
import com.bytedance.ee.bear.list.listsync.C8565d;
import com.bytedance.ee.bear.list.listsync.ListSyncManager;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.preload.C8664a;
import com.bytedance.ee.bear.list.recent.C8685h;
import com.bytedance.ee.bear.list.sort.C8764f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.recent.h */
public class C8685h extends AbstractC8531b<C8691j> implements C8664a.AbstractC8665a, AbstractC8679a {

    /* renamed from: k */
    private ListSyncManager f23498k;

    /* renamed from: l */
    private final AtomicBoolean f23499l = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "recent";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "RecentDocumentModel";
    }

    /* renamed from: a */
    public void mo33710a(C7718l lVar) {
        this.f23120a = lVar;
        mo33362r();
        if (this.f23123d != null) {
            this.f23124e.setSortStrategy(this.f23123d);
        }
        C8664a.m36218a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        super.mo33356a(folderSortStrategy);
        if (folderSortStrategy != null && TextUtils.equals("recent", folderSortStrategy.mo31545a())) {
            ((C8691j) this.f23126g).mo33714a(folderSortStrategy);
            C8143b.m32605a().mo31461a(folderSortStrategy);
            ListSyncManager listSyncManager = this.f23498k;
            if (listSyncManager != null) {
                listSyncManager.mo33391a(folderSortStrategy);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8681c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C8691j mo32592n() {
        return new C8691j();
    }

    @Override // com.bytedance.ee.bear.list.preload.C8664a.AbstractC8665a
    public void onFirstContentDraw() {
        m36311a(this.f23120a, this.f23122c);
    }

    @Override // com.bytedance.ee.bear.list.recent.AbstractC8679a
    public AbstractC68307f<ArrayList<Document>> B_() {
        return ((C8691j) this.f23126g).mo33716b();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        ListSyncManager listSyncManager = this.f23498k;
        if (listSyncManager != null) {
            listSyncManager.mo33394b();
            this.f23498k = null;
        }
        ((C8691j) this.f23126g).mo33717c();
        C8664a.m36219b(this);
    }

    /* renamed from: l */
    public void mo33711l() {
        if (this.f23123d == null) {
            this.f23123d = ((C8691j) this.f23126g).mo32619a();
            if (this.f23123d != null) {
                ((C8691j) this.f23126g).mo33714a(this.f23123d);
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b(mo32590h(), "create()...");
        if (this.f23499l.get()) {
            C13479a.m54764b(mo32590h(), "create()...already create, return...");
            return;
        }
        super.create();
        this.f23499l.compareAndSet(false, true);
    }

    /* renamed from: j */
    public AbstractC68307f<ArrayList<Document>> mo32591j() {
        C8143b.m32605a().mo31470c("pre_load_db_data");
        return AbstractC68307f.m265083a((Object) true).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$PEI9DhwdHnQq6qS9AMnGOIjhUbA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36320d((Boolean) obj);
            }
        }).mo238029f(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$_E475SiCI3BtLO5u6Pc8iCFL9Ng */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36318c((Throwable) obj);
            }
        });
    }

    /* renamed from: k */
    public AbstractC68307f<ArrayList<Document>> mo32720k() {
        C8143b.m32605a().mo31470c("pre_load_online_data");
        return AbstractC68307f.m265083a((Object) true).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$_77HjkiXWrXWZPsJfeVFx18jrl8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36319c((Boolean) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$GmBAHRa9jugcNt44ii7PyHU72Ww */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36315b((DocumentListInfo) obj);
            }
        }).mo238029f(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$6iDGTX5gjB0vHYFef69tkmXKaIY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36316b((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$zqJSG569xjziBG7cOVgXlRT8dg */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36314b((Boolean) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$VqH9ZM47drhI6_XhhIsb6i2o */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36308a((Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$mu5CPaHNWACqr1kYvttduluBwmE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.this.m36310a((Integer) obj);
            }
        }).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$8wcyKH_HMxgnHFYewkA1MF9mJos */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8685h.this.m36312a((C8685h) ((DocumentListInfo) obj));
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$h$Tu2PmO0AAe324sZQtX8soYHsRE.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20782g().f14914a) {
            return "/api/explorer/recent/list/";
        }
        return "space/api/explorer/lean/browse/list/";
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        C8143b.m32605a().mo31470c("load_db_data");
        return C1138ae.m5354a(C8153a.m32844b().mo31574a(1), new AbstractC0193a() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$JJRcuGrs60DXJvARqlYrgC6YZts */

            @Override // androidx.p011a.p012a.p015c.AbstractC0193a
            public final Object apply(Object obj) {
                return C8685h.this.m36317b((List) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.recent.AbstractC8679a
    /* renamed from: a */
    public void mo33705a(String str) {
        ((C8691j) this.f23126g).mo33715a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m36319c(Boolean bool) throws Exception {
        return this.f23127h.mo20141a(mo32729c());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ ArrayList m36317b(List list) {
        ArrayList<Document> a = m36309a(list);
        C8143b.m32605a().mo31463a("load_db_data", 0, C13657b.m55424c(a));
        return a;
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ Integer m36308a(Boolean bool) throws Exception {
        int c = C13657b.m55424c(C8764f.m36799a(this.f23123d, C8200i.m33450a(C8153a.m32844b().mo31579a(1, "fake_", ""))));
        String h = mo32590h();
        C13479a.m54764b(h, "fakeTokenList size = " + c);
        return Integer.valueOf(c);
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public /* synthetic */ Boolean m36314b(Boolean bool) throws Exception {
        C8143b.m32605a().mo31470c("pre_load_from_network");
        if (this.f23123d == null) {
            this.f23123d = ((C8691j) this.f23126g).mo32619a();
            if (this.f23123d != null) {
                this.f23124e.postSortStrategy(this.f23123d);
            }
        }
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ ArrayList m36318c(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "preloadDatabaseList()...error = " + th);
        C8143b.m32605a().mo31463a("pre_load_db_data", 1, 0);
        return new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ ArrayList m36320d(Boolean bool) throws Exception {
        ArrayList<Document> a = m36309a(C8153a.m32844b().mo31599b(1));
        String h = mo32590h();
        C13479a.m54772d(h, "preloadDatabaseList()...result = " + C13657b.m55424c(a));
        C8143b.m32605a().mo31463a("pre_load_db_data", 0, C13657b.m55424c(a));
        return a;
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public /* synthetic */ ArrayList m36315b(DocumentListInfo documentListInfo) throws Exception {
        ArrayList<Document> documentList = documentListInfo.getDocumentList();
        C8143b.m32605a().mo31470c("update_db_data");
        ((C8691j) this.f23126g).mo32620a(documentList);
        C8143b.m32605a().mo31463a("update_db_data", 0, C13657b.m55424c(documentList));
        String h = mo32590h();
        C13479a.m54772d(h, "preloadOnlineList()...result = " + C13657b.m55424c(documentList));
        C8143b.m32605a().mo31463a("pre_load_online_data", 0, C13657b.m55424c(documentList));
        return documentList;
    }

    /* renamed from: a */
    private ArrayList<Document> m36309a(List<C8200i> list) {
        ArrayList<Document> a = C8764f.m36799a(this.f23123d, C8200i.m33450a(list));
        if (C13657b.m55421a(a)) {
            return a;
        }
        try {
            Collections.sort(a, new Comparator() {
                /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$vybEc2K3MLKXtegn1vxMxBZcLc0 */

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C8685h.this.m36306a((Document) obj, (Document) obj2);
                }
            });
        } catch (Exception e) {
            C13479a.m54761a(mo32590h(), e);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ ArrayList m36316b(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "preloadOnlineList()...error = " + th);
        C8143b.m32605a().mo31463a("pre_load_online_data", 1, 0);
        return new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m36310a(Integer num) throws Exception {
        C8143b.m32605a().mo31468b("pre_load_from_network");
        C8143b.m32605a().mo31470c("load_from_network");
        return this.f23127h.mo20141a(mo32729c()).mo238020d(new Function(num) {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$WYHeBWsWSrjVp2t8BHDA0NGSUm8 */
            public final /* synthetic */ Integer f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8685h.m36307a(this.f$0, (DocumentListInfo) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m36312a(DocumentListInfo documentListInfo) throws Exception {
        ListSyncManager listSyncManager = this.f23498k;
        if (listSyncManager != null) {
            listSyncManager.mo33393a(documentListInfo.getDocumentList());
        }
        C8143b.m32605a().mo31463a("load_from_network", 0, C13657b.m55424c(documentListInfo.getDocumentList()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36313a(Throwable th) throws Exception {
        C8143b.m32605a().mo31463a("load_from_network", 1, 0);
        C8143b.m32605a().mo31464a(th, "recent");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m36307a(Integer num, DocumentListInfo documentListInfo) throws Exception {
        documentListInfo.setTotal(documentListInfo.getTotal() + num.intValue());
        return documentListInfo;
    }

    /* renamed from: a */
    private void m36311a(C7718l lVar, C10917c cVar) {
        ListSyncManager listSyncManager = new ListSyncManager(this, lVar, cVar, new C8565d(cVar, new AbstractC8564c() {
            /* class com.bytedance.ee.bear.list.recent.C8685h.C86861 */

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m36335c() {
                if (C8685h.this.f23129j != null) {
                    C8685h.this.f23129j.mo33316r();
                }
            }

            @Override // com.bytedance.ee.bear.list.listsync.AbstractC8564c
            /* renamed from: b */
            public void mo33420b() {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.recent.$$Lambda$h$1$8C1gOlgMZFVVzMmqgk39b_Aas28 */

                    public final void run() {
                        C8685h.C86861.this.m36335c();
                    }
                });
            }

            @Override // com.bytedance.ee.bear.list.listsync.AbstractC8564c
            /* renamed from: a */
            public boolean mo33419a() {
                if (C8685h.this.f23129j != null) {
                    return C8685h.this.f23129j.mo33317s();
                }
                return false;
            }
        }));
        this.f23498k = listSyncManager;
        listSyncManager.mo33390a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ int m36306a(Document document, Document document2) {
        if (this.f23123d == null || this.f23123d.mo31549b() == RecentSort.ALL.getRank()) {
            return C13721c.m55647b(document2.mo32391J(), document.mo32391J());
        }
        if (this.f23123d.mo31549b() == RecentSort.MODIFIED.getRank()) {
            return C13721c.m55647b(document2.mo32389I(), document.mo32389I());
        }
        if (this.f23123d.mo31549b() == RecentSort.CREATED.getRank()) {
            return C13721c.m55647b(document2.mo32373A(), document.mo32373A());
        }
        return C13721c.m55647b(document2.mo32492x(), document.mo32492x());
    }

    public C8685h(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
        if (lVar != null) {
            mo33710a(lVar);
        }
    }
}

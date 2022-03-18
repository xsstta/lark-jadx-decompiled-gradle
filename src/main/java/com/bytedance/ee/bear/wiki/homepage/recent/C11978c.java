package com.bytedance.ee.bear.wiki.homepage.recent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import androidx.p034e.p035a.C0978a;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.as;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.homepage.C11973d;
import com.bytedance.ee.bear.wiki.wikitree.TreeSyncEntity;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p718t.C13726a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.recent.c */
public final class C11978c implements AbstractC8542h {

    /* renamed from: a */
    private C7718l f32352a;

    /* renamed from: b */
    private Context f32353b;

    /* renamed from: c */
    private C10917c f32354c;

    /* renamed from: d */
    private C68289a f32355d = new C68289a();

    /* renamed from: e */
    private C11977b f32356e;

    /* renamed from: f */
    private int f32357f;

    /* renamed from: g */
    private NetService.AbstractC5075d<DocumentListInfo> f32358g;

    /* renamed from: h */
    private DocumentListInfo f32359h;

    /* renamed from: i */
    private AbstractC8542h.AbstractC8543a f32360i;

    /* renamed from: j */
    private BroadcastReceiver f32361j;

    /* renamed from: k */
    private Map<String, HomePage> f32362k = new ArrayMap();

    /* renamed from: f */
    private void m49639f() {
        this.f32357f = 0;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: p */
    public void mo33360p() {
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31645l(), $$Lambda$pDt3mvsNj4Wcr0q5xBEwuBZx0.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public void mo33357a(AbstractC8542h.AbstractC8543a aVar) {
        this.f32360i = aVar;
    }

    /* renamed from: a */
    public void mo45917a(boolean z) {
        m49639f();
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.refreshFromNet. offset: " + this.f32357f);
        this.f32355d.mo237937a(this.f32358g.mo20141a(m49627b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$WE06nT3O1ZsqfXlAKNgCXUTdKU4 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11978c.this.m49617a((DocumentListInfo) obj);
            }
        }).mo238020d($$Lambda$UM87tD8wdWXJXLuqoMRtIDktY.INSTANCE).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$OhvhLnHzdhPVvQSYzDdeVaJIE7Y */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11978c.this.m49625a((C11978c) ((ArrayList) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$7RsheS_IqjtVqDlctF6lvglsSM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11978c.this.m49634c((C11978c) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    public HomePage mo45916a(String str) {
        return this.f32362k.get(str);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: q */
    public void mo33361q() {
        mo45917a(false);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: s */
    public boolean mo33363s() {
        DocumentListInfo documentListInfo = this.f32359h;
        if (documentListInfo == null || !documentListInfo.isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private NetService.C5076e m49627b() {
        NetService.C5077f fVar = new NetService.C5077f("/api/wiki/search/get_recent/");
        fVar.mo20143a(2);
        fVar.mo20145a("offset", String.valueOf(this.f32357f));
        fVar.mo20145a("size", "20");
        return fVar;
    }

    /* renamed from: c */
    private void m49632c() {
        this.f32358g = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new RecentWikiListParser());
        this.f32356e = new C11977b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.create. ");
        m49632c();
        m49636d();
        m49638e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.destroy. ");
        this.f32355d.mo237935a();
        C0978a.m4782a(this.f32353b).mo4990a(this.f32361j);
    }

    /* renamed from: d */
    private void m49636d() {
        C7718l lVar = this.f32352a;
        if (lVar != null && C13726a.m55676b(lVar.getActivity())) {
            ((C11973d) aj.m5366a(this.f32352a.getActivity()).mo6005a(C11973d.class)).getBannerList().mo5923a(this.f32352a, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$MdwwbLfTnYNw26KEAuyxxrOvFE */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C11978c.this.m49626a((C11978c) ((List) obj));
                }
            });
        }
    }

    /* renamed from: e */
    private void m49638e() {
        this.f32361j = new C11980a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.bytedance.ee.bear.wiki.treeNodeAdded");
        intentFilter.addAction("com.bytedance.ee.bear.wiki.treeNodeRemoved");
        C0978a.m4782a(this.f32353b).mo4991a(this.f32361j, intentFilter);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: o */
    public void mo33359o() {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.loadMoreFromNet(). offset: " + this.f32357f);
        this.f32355d.mo237937a(this.f32358g.mo20141a(m49627b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$nT_Zf_RFwttcYlELK0fYEL1_M_U */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11978c.this.m49628b((DocumentListInfo) obj);
            }
        }).mo238020d($$Lambda$UM87tD8wdWXJXLuqoMRtIDktY.INSTANCE).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$3HtoMYd1HdtLLHZaHwxYMs_bxR0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11978c.this.m49630b((C11978c) ((ArrayList) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$HbKXmvwxGHj6KOaDyV9dkqP1tIk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11978c.this.m49637d((C11978c) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ DocumentListInfo m49617a(DocumentListInfo documentListInfo) throws Exception {
        this.f32359h = documentListInfo;
        return documentListInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ DocumentListInfo m49628b(DocumentListInfo documentListInfo) throws Exception {
        this.f32359h = documentListInfo;
        return documentListInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.recent.c$a */
    public final class C11980a extends BroadcastReceiver {
        private C11980a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null) {
                C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.onWikiChanged, action=" + intent.getAction());
                String action = intent.getAction();
                action.hashCode();
                if (action.equals("com.bytedance.ee.bear.wiki.treeNodeAdded")) {
                    C11978c.this.mo33361q();
                } else if (action.equals("com.bytedance.ee.bear.wiki.treeNodeRemoved")) {
                    C11978c.this.mo45918b(((TreeSyncEntity) intent.getSerializableExtra("extra_tree_sync_entity")).getWikiToken());
                }
            }
        }
    }

    /* renamed from: a */
    private HomePage m49618a(WikiDocument wikiDocument) {
        return new HomePage(wikiDocument.mo21011c(), wikiDocument.mo32472o(), wikiDocument.mo32483t(), wikiDocument.mo32399O(), wikiDocument.mo32469n(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ AbstractC70020b m49635d(String str) throws Exception {
        return this.f32354c.mo41508c(as.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$KZxTQmuUoMTPwd0SplrOZxYZUYw */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((as) obj).delDocs(this.f$0);
            }
        });
    }

    /* renamed from: a */
    private void m49621a(int i) {
        this.f32357f += i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m49630b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.loadMoreFromNet, pull success, size = " + C13657b.m55424c(arrayList));
        m49621a(Integer.valueOf("20").intValue());
        this.f32356e.mo32621b(arrayList);
        AbstractC8542h.AbstractC8543a aVar = this.f32360i;
        if (aVar != null) {
            aVar.mo33304b(this.f32359h.isHasMore());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m49634c(Throwable th) throws Exception {
        C13479a.m54759a("Wiki_RecentWikiListModel", "RecentWikiListModel.refreshFromNet, pull error. ", th);
        this.f32359h = null;
        AbstractC8542h.AbstractC8543a aVar = this.f32360i;
        if (aVar != null) {
            aVar.mo32655a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49622a(Document document) {
        if (document instanceof WikiDocument) {
            this.f32362k.put(document.mo32399O(), m49618a((WikiDocument) document));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m49637d(Throwable th) throws Exception {
        C13479a.m54759a("Wiki_RecentWikiListModel", "RecentWikiListModel.loadMoreFromNet, pull error. ", th);
        this.f32359h = null;
        AbstractC8542h.AbstractC8543a aVar = this.f32360i;
        if (aVar != null) {
            aVar.mo33303b(th);
        }
    }

    /* renamed from: b */
    public void mo45918b(String str) {
        this.f32355d.mo237937a(AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) new AbstractC68322n(str) {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$sy1hOaMde6OR2nSLfj952DMctO0 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C11978c.m49631b(this.f$0, (String) obj);
            }
        }).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$ZCC7T0SE2dRhNxnyJnnE7y__86s */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11978c.this.m49623a((C11978c) this.f$1, (String) obj);
            }
        }, $$Lambda$c$PX8DXn7GiYw00bAQbdhWUJOseD0.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49625a(ArrayList arrayList) throws Exception {
        C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.refreshFromNet, pull success, size= " + C13657b.m55424c(arrayList));
        m49621a(Integer.valueOf("20").intValue());
        this.f32356e.mo32620a(arrayList);
        AbstractC8542h.AbstractC8543a aVar = this.f32360i;
        if (aVar != null) {
            aVar.mo32648a(this.f32359h.getTotal(), this.f32359h.isHasMore());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49626a(List list) {
        if (list != null) {
            C13479a.m54764b("Wiki_RecentWikiListModel", "RecentWikiListModel.onBannerSpaceChanged, size= " + list.size());
            this.f32362k.clear();
            C13659d.m55432a(list, new C13659d.AbstractC13661b() {
                /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$UTypRZiNuho8r7P6EzwqPX1gwtQ */

                @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
                public final void accept(Object obj) {
                    C11978c.this.m49622a((C11978c) ((Document) obj));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m49631b(String str, String str2) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49623a(String str, String str2) throws Exception {
        C8153a.m32844b().mo31646m(str);
        C8153a.m32844b().mo31644l(str);
        this.f32354c.mo41508c(AbstractC5094ag.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$9ehIi8e61MO0DWDQM_8k_2slHc */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC5094ag) obj).delDocs(this.f$0);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.wiki.homepage.recent.$$Lambda$c$tzuiRoRkJHJdbOdS1sbGszxIiPk */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11978c.this.m49635d((String) obj);
            }
        }).mo238001b($$Lambda$c$rM2pVGyHEfRVC11gVcTUCtfDA0A.INSTANCE, $$Lambda$c$L8nUMHA2KN1mWn3RbLG7A0NZtM.INSTANCE);
    }

    public C11978c(C7718l lVar, Context context, C10917c cVar) {
        this.f32352a = lVar;
        this.f32353b = context;
        this.f32354c = cVar;
    }
}

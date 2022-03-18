package com.bytedance.ee.bear.list;

import android.app.Application;
import android.content.Context;
import android.os.IInterface;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AbstractC5214r;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.as;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8212n;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.makecopy.MakeCopyExecutor;
import com.bytedance.ee.bear.list.offlinecache.C8640a;
import com.bytedance.ee.bear.list.p429f.C8298e;
import com.bytedance.ee.bear.list.star.C8810l;
import com.bytedance.ee.bear.list.subscribe.SubscribeExecutor;
import com.bytedance.ee.bear.service.remote.C10959f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.i */
public class C8511i extends AbstractC5214r {

    /* renamed from: a */
    public Context f23032a;

    /* renamed from: b */
    private final C10959f<BinderListDataChangeCallback> f23033b = new C10959f<>();

    /* renamed from: c */
    private C8144c f23034c;

    /* renamed from: d */
    private DocumentCreateHelper f23035d;

    /* renamed from: e */
    private C8810l f23036e;

    /* renamed from: f */
    private C8298e f23037f;

    /* renamed from: g */
    private SubscribeExecutor f23038g;

    /* renamed from: h */
    private C8640a f23039h;

    /* renamed from: i */
    private final C68289a f23040i = new C68289a();

    /* renamed from: a */
    private void m35318a(String str, String str2) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) $$Lambda$i$0fqJ_KPZprriZ8J0r45sFr0rDs.INSTANCE).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str, str2) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$gO9wuoRvDDdbwLZcXQi_QYgF2tI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35320a(this.f$0, this.f$1, (String) obj);
            }
        }, $$Lambda$i$P0JXVNbJ0gIHicdwM1MaxnnBIE.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35320a(String str, String str2, String str3) throws Exception {
        C8153a.m32844b().mo31601b(str, str2);
        C8153a.m32844b().mo31620d(str, str2);
        C8153a.m32844b().mo31624e(str, str2);
        C13479a.m54764b("ListDataServiceImpl", "onRename()...success");
    }

    /* renamed from: a */
    private void m35325a(List<OfflineRenameData> list) {
        m35339b(list);
        this.f23033b.mo41596a(new C10959f.AbstractC10961b(list) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$utD5y3k5ygp3ejjplSx_nEo2L94 */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderListDataChangeCallback) iInterface).onRename(this.f$0);
            }
        });
    }

    /* renamed from: a */
    public void mo33275a(String str, boolean z) {
        m35356f(str, z);
        this.f23033b.mo41596a(new C10959f.AbstractC10961b(str, z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$4f99Dz_ejRX4hAS8uZcT82VTEl8 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderListDataChangeCallback) iInterface).onPin(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public void mo33276b(String str, boolean z) {
        m35359g(str, z);
        this.f23033b.mo41596a(new C10959f.AbstractC10961b(str, z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$AcihXC5LXyBigiPLYoni26JqWTo */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderListDataChangeCallback) iInterface).onSubscribe(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35327a(boolean z, String str) throws Exception {
        C8153a.m32844b().mo31612c(str, z);
        C13479a.m54764b("ListDataServiceImpl", "onSubscribe()...success, isSubscribe = " + z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m35329a(BinderIDeleteDocCallback binderIDeleteDocCallback, Boolean bool) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "delOfflineDoc()... delete offline " + bool);
        if (!bool.booleanValue() && binderIDeleteDocCallback != null) {
            binderIDeleteDocCallback.onOfflinePostExecute(false);
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35323a(String str, boolean z, String str2) throws Exception {
        C8153a.m32844b().mo31632g(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35322a(String str, boolean z, Boolean bool) throws Exception {
        C8153a.m32844b().mo31602b(str, z);
        if (!z) {
            C8153a.m32844b().mo31594b(6, str);
        }
        C8153a.m32844b().mo31627f(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35328a(boolean z, String str, Boolean bool) throws Exception {
        if (!z) {
            C8153a.m32844b().mo31594b(5, str);
        }
        C8153a.m32844b().mo31588a(str, z);
    }

    /* renamed from: a */
    public void mo33274a(AbstractC5233x xVar, String str, String str2, String str3) {
        ListAnalysis.m32501a(xVar, str, "status_name", str2);
        ListAnalysis.m32500a(xVar, str3, str);
    }

    /* renamed from: a */
    private void m35317a(String str, AbstractC5233x xVar, String str2, String str3) {
        ListAnalysis.m32501a(xVar, str2, "file_id", C13598b.m55197d(str));
        ListAnalysis.m32501a(xVar, str2, "action", str3);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void deleteAllDocStatus() {
        C8153a.m32844b().mo31635h();
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyFileClose() {
        this.f23033b.mo41596a($$Lambda$fNv9vzCl7_ULvPM1ZD5N3TFAGCE.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyFileOpen() {
        this.f23033b.mo41596a($$Lambda$Rf881ye1J65KunaQppCIB5ci90M.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.f23033b.mo41594a();
        this.f23040i.mo237935a();
    }

    @Override // com.bytedance.ee.bear.contract.am
    public List<Document> getManualOfflineStateList() {
        m35350d();
        return this.f23039h.mo33625c();
    }

    /* renamed from: d */
    private void m35350d() {
        if (this.f23039h == null) {
            C8640a aVar = new C8640a(mo20926c());
            this.f23039h = aVar;
            aVar.mo33608a();
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5214r, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.f23032a = application;
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void renameDocList(List<OfflineRenameData> list) {
        m35325a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ boolean m35361g(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ boolean m35363h(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ boolean m35365i(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ boolean m35367j(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<Boolean> isManualOffline(String str) {
        return C8640a.m36105a(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void registerChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback) {
        this.f23033b.mo41595a(binderListDataChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void setDocDataCached(String str) {
        C8153a.m32844b().mo31633g(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void unRegisterChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback) {
        this.f23033b.mo41597b(binderListDataChangeCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void updateFileName(OfflineRenameData offlineRenameData) {
        C8522k.m35387a().mo33289a(offlineRenameData);
    }

    /* renamed from: a */
    private AbstractC68307f<Boolean> m35306a(String str) {
        return C8522k.m35387a().mo33290b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ boolean m35358f(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public int delCachedStatus(List<String> list) {
        return C8153a.m32844b().mo31616d(list);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public int deleteDocStatusList(List<String> list) {
        return C8153a.m32844b().mo31597b(list);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<OfflineDoc> getOfflineDoc(String str) {
        return C8522k.m35387a().mo33286a(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void handleSyncedDoc(OfflineDoc offlineDoc) {
        C8522k.m35387a().mo33288a(offlineDoc);
        m35350d();
        this.f23039h.mo33612a(offlineDoc);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public int saveCachedStatus(List<String> list) {
        return C8153a.m32844b().mo31606c(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ AbstractC70020b m35348d(String str) throws Exception {
        return mo20926c().mo41508c(as.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$PBM3EYjKBShi2ohcwEjlmCxe5Ks */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35308a(this.f$0, (as) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ AbstractC70020b m35353e(String str) throws Exception {
        return mo20926c().mo41508c(AbstractC5094ag.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$5gUWzYUpgIWamqigp5cPo6RjZs */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35309a(this.f$0, (AbstractC5094ag) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m35360g(Throwable th) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "onSubscribe()...error, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m35362h(Throwable th) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "onPin()...error, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m35364i(Throwable th) throws Exception {
        C13479a.m54758a("ListDataServiceImpl", "onStar()...error, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m35366j(Throwable th) throws Exception {
        C13479a.m54758a("ListDataServiceImpl", "onRename()...error, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m35368k(Throwable th) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "onDelete()...fail, throwable = " + th);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<Boolean> hasCached(String str) {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$VPcro9qL40wexmu70vSp53gaYI */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35352e(this.f$0, (Boolean) obj);
            }
        });
    }

    /* renamed from: c */
    private AbstractC68307f<Boolean> m35341c(String str) {
        return AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) new AbstractC68322n(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$cHQSVvPdvhuhVpoQDICzn76PfU */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C8511i.m35346c(this.f$0, (String) obj);
            }
        }).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$yKMzSBxnwnayJaKTm_E8lh4mhPk */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35332b(this.f$0, (String) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$VP3v0c8xRGlhmD831PvG0BSxcTU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.this.m35353e((String) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$v6sXuuDvFiZRXYcOWMQxmGvHks */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.this.m35348d((String) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyListDocDelete(String str) {
        C13479a.m54764b("ListDataServiceImpl", "notifyListDocDelete()... objToken = " + C13598b.m55197d(str));
        m35335b(str);
        this.f23033b.mo41596a(new C10959f.AbstractC10961b(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$2mJ18vpJYtbbj7RC_HWL9iJaiw */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderListDataChangeCallback) iInterface).onDelete(this.f$0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void onDocNotFound(String str) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$whoVtft83uRx61_bcYCWjUHcBcY */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.this.m35310a(this.f$1, (Boolean) obj);
            }
        }).mo238001b($$Lambda$i$xLDEh_zy5empMt5hvmk1OqIHuU.INSTANCE, $$Lambda$i$N0MbosVIRjaAKFhe6t7_A6mnnw.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<Boolean> clearDocsCacheDataFlowable(long j) {
        C13479a.m54764b("ListDataServiceImpl", "clearDocsCacheDataFlowable(), beforeTimeInMills:" + j);
        return mo20926c().mo41505a(AbstractC5094ag.class, C11678b.m48479c()).mo238020d(new Function(j) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$14SmyhhF22Xx9zXzZF2Jwzp_k2c */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35307a(this.f$0, (AbstractC5094ag) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$i$ByMFGzr3nRtUyzMULjMVvbZMo3Q.INSTANCE).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) false));
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5214r, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
        super.lazyInit(application);
        this.f23034c = new C8144c(mo20926c());
        this.f23035d = new DocumentCreateHelper(mo20926c());
        this.f23036e = new C8810l((NetService) KoinJavaComponent.m268610a(NetService.class));
        this.f23037f = new C8298e((NetService) KoinJavaComponent.m268610a(NetService.class));
        this.f23038g = new SubscribeExecutor((NetService) KoinJavaComponent.m268610a(NetService.class));
    }

    /* renamed from: b */
    private void m35335b(String str) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) $$Lambda$i$Vez3bkukYx1Ei8fDhpT2hyUVkVU.INSTANCE).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$jrQankeq1zOJVkjeScg5vxgpI */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35347d(this.f$0, (String) obj);
            }
        }).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$8FQgRLPbjQusl4PmU9a1QA1UtuA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.this.m35349d(this.f$1, (Boolean) obj);
            }
        }).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$KUJEazRjIvgz95E9_BmPKx28Pk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.this.m35343c(this.f$1, (Boolean) obj);
            }
        }).mo238001b($$Lambda$i$ZtJh9rUgOhDP4Ae9vSGW2oLRGXk.INSTANCE, $$Lambda$i$LcBNq2gkxfdT75kAfqJipwOl8FQ.INSTANCE));
    }

    /* renamed from: b */
    private void m35339b(List<OfflineRenameData> list) {
        C13479a.m54764b("ListDataServiceImpl", "handleOfflineDocumentRename()...size = " + C13657b.m55424c(list));
        if (C13657b.m55423b(list)) {
            for (OfflineRenameData offlineRenameData : list) {
                m35318a(offlineRenameData.getObjToken(), offlineRenameData.getNewName());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m35333b(String str, Boolean bool) throws Exception {
        return m35341c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m35330b(String str, AbstractC5094ag agVar) throws Exception {
        agVar.delDocs(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Boolean m35342c(String str, AbstractC5094ag agVar) throws Exception {
        agVar.delDocs(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Boolean m35347d(String str, String str2) throws Exception {
        C8153a.m32844b().mo31621e(str);
        return true;
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyListRename(String str, String str2) {
        m35318a(str, str2);
        this.f23033b.mo41596a(new C10959f.AbstractC10961b(str, str2) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$dRZEWeYd3zqHQMosVXpFtiTI5Y */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderListDataChangeCallback) iInterface).onRename(this.f$0, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void notifyListStar(String str, boolean z) {
        m35354e(str, z);
        this.f23033b.mo41596a(new C10959f.AbstractC10961b(str, z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$AtbGRDmrtsEsFF7vMZhQU_tCaXg */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderListDataChangeCallback) iInterface).onStar(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m35308a(String str, as asVar) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "deleteDatabaseDocByObjToken()... delete docs vcData");
        asVar.delDocs(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m35331b(String str, as asVar) throws Exception {
        asVar.delDocs(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m35343c(String str, Boolean bool) throws Exception {
        return mo20926c().mo41508c(as.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$hpBl4wXBhk_gcNcHo_aFZZ3xAeM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35331b(this.f$0, (as) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void deleteListRecord(String str, int i) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238001b(new Consumer(i, str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$7vSLS1iLvf4zoEASfEXXWi9XKM */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35311a(this.f$0, this.f$1, (String) obj);
            }
        }, $$Lambda$i$seP5Dt_x54jhKtDezu9EmimlMk.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void starSpace(String str, boolean z) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str, z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$k49WHcBcfZsqxlMLq8xjZPGw_Yg */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35323a(this.f$0, this.f$1, (String) obj);
            }
        }, $$Lambda$i$w9LoGK8jO9tDOCdolm6TLBwRJB8.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m35309a(String str, AbstractC5094ag agVar) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "deleteDatabaseDocByObjToken()... delete docs Data");
        agVar.delDocs(str);
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m35332b(String str, String str2) throws Exception {
        C8153a.m32844b().mo31621e(str);
        C8153a.m32844b().mo31646m(str2);
        C8153a.m32844b().mo31644l(str2);
        return str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ AbstractC70020b m35349d(String str, Boolean bool) throws Exception {
        return mo20926c().mo41508c(AbstractC5094ag.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$OjWtVemmLvBCS994FgQIxGWElPE */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35342c(this.f$0, (AbstractC5094ag) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Boolean m35352e(String str, Boolean bool) throws Exception {
        int h = C8153a.m32844b().mo31636h(str);
        C13479a.m54764b("ListDataServiceImpl", "hasCached()...status = " + h);
        return Boolean.valueOf(C8212n.m33653a(h));
    }

    /* renamed from: f */
    private void m35356f(String str, boolean z) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) $$Lambda$i$kYxyGlubLa7kn2WWrtSg6eSJqU.INSTANCE).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$oTXzY2eklg0YgDJFtUGzPzOlFYs */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35340b(this.f$0, (String) obj);
            }
        }, $$Lambda$i$RH74Kl1kokDI4AimlvqSUujluQ.INSTANCE));
    }

    /* renamed from: g */
    private void m35359g(String str, boolean z) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) $$Lambda$i$G_qPXSgkIJAXiehjU3NCEcVg0o.INSTANCE).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$UvRRXWMpR9GeKvjjB9YjiTHRSKE */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35327a(this.f$0, (String) obj);
            }
        }, $$Lambda$i$A3vPxtGstiZoPApQoWgGMWlM_s.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void delOfflineDoc(String str, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        if (binderIDeleteDocCallback != null) {
            binderIDeleteDocCallback.onPreExecute();
        }
        this.f23040i.mo237937a(m35306a(str).mo237998a(new AbstractC68322n() {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$5Ih6CY6GFRfBVf6s_Jc6h4dYhOw */

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C8511i.m35329a(BinderIDeleteDocCallback.this, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48479c()).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$uwOLT4It5p7ZHJxv4cJNI_ANEFY */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.this.m35333b(this.f$1, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(binderIDeleteDocCallback, str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$wLvk6ToWS7ETufJ71CbYrP2JGfw */
            public final /* synthetic */ BinderIDeleteDocCallback f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.this.m35313a((C8511i) this.f$1, (BinderIDeleteDocCallback) this.f$2, (String) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$eZ0zMU9nVDlmYRXr5oqaLblQzLY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35314a(BinderIDeleteDocCallback.this, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m35307a(long j, AbstractC5094ag agVar) throws Exception {
        C8153a b = C8153a.m32844b();
        b.mo31592a(true);
        b.mo31609c(6);
        b.mo31609c(3);
        List<String> a = b.mo31580a(j);
        C13479a.m54764b("ListDataServiceImpl", "keepObjTokenList.size(): " + a.size());
        b.mo31595b(1, a);
        b.mo31595b(2, a);
        b.mo31595b(4, a);
        b.mo31595b(10, a);
        b.mo31595b(5, a);
        List<String> tokenList = agVar.getTokenList();
        tokenList.removeAll(a);
        agVar.delDocsList(tokenList);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ boolean m35346c(String str, String str2) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: e */
    private void m35354e(String str, boolean z) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a(str).mo237998a((AbstractC68322n) $$Lambda$i$VYHuMXa8SOMkrM7lrOMFh4rTNEs.INSTANCE).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str, z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$ZrK3MCf1oMmZEOZKuOmn8jgTVIc */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35337b(this.f$0, this.f$1, (String) obj);
            }
        }, $$Lambda$i$M1EEMbiNFEpRoe2lMaocti5De0.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m35310a(String str, Boolean bool) throws Exception {
        C8153a.m32844b().mo31621e(str);
        return mo20926c().mo41508c(AbstractC5094ag.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$DrslidmlCgym_Br43YVVisej1c */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8511i.m35330b(this.f$0, (AbstractC5094ag) obj);
            }
        });
    }

    /* renamed from: c */
    public void mo33277c(String str, boolean z) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str, z) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$ZcmS3jNcA7xY0jJ3O8PFHlL7RQ */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35322a(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$i$LQ3LR8roFQqQQxW6NAHT6GQ3bPk.INSTANCE));
    }

    /* renamed from: d */
    public void mo33278d(String str, boolean z) {
        this.f23040i.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(z, str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$i$wp4T8VYf_i95y87HWqLoqeuG74 */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8511i.m35328a(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$i$_Z6SdBp01qVW22Qz83WlqJMNuVE.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35314a(BinderIDeleteDocCallback binderIDeleteDocCallback, Throwable th) throws Exception {
        C13479a.m54761a("ListDataServiceImpl", th);
        if (binderIDeleteDocCallback != null) {
            C13742g.m55705a(new Runnable() {
                /* class com.bytedance.ee.bear.list.$$Lambda$i$3NcivCGsUiIUci_62auez2bGTUs */

                public final void run() {
                    BinderIDeleteDocCallback.this.onOfflinePostExecute(false);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m35340b(boolean z, String str) throws Exception {
        C8153a.m32844b().mo31588a(str, z);
        C13479a.m54764b("ListDataServiceImpl", "onPin()...success, isPin = " + z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35311a(int i, String str, String str2) throws Exception {
        C8153a.m32844b().mo31594b(i, str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void pinDoc(final String str, int i, boolean z) {
        boolean b = C5084ad.m20847d().mo20038b().mo20041b();
        final AbstractC5233x b2 = C5234y.m21391b();
        if (z) {
            if (b) {
                m35317a(str, b2, "pin", "remove_quickaccess");
                this.f23037f.mo32599b(str, i, new C8298e.AbstractC8300a() {
                    /* class com.bytedance.ee.bear.list.C8511i.C85143 */

                    @Override // com.bytedance.ee.bear.list.p429f.C8298e.AbstractC8300a
                    /* renamed from: a */
                    public void mo32600a() {
                        C13479a.m54764b("ListDataServiceImpl", "unpin success");
                        Toast.showSuccessText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_RemoveSucccessfully), 0);
                        C8511i.this.mo33275a(str, false);
                        C8511i.this.mo33278d(str, false);
                        C8511i.this.mo33274a(b2, "pin", "succeed", "client_content_management");
                    }

                    @Override // com.bytedance.ee.bear.list.p429f.C8298e.AbstractC8300a
                    /* renamed from: a */
                    public void mo32601a(int i, Throwable th) {
                        C13479a.m54759a("ListDataServiceImpl", "unpin fail: code = " + i, th);
                        Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_RemoveFaildRetry), 0);
                        C8511i.this.mo33274a(b2, "pin", "failed", "client_content_management");
                    }
                });
                return;
            }
            Context context = this.f23032a;
            Toast.showFailureText(context, context.getString(R.string.Doc_List_RemoveFaildRetry), 0);
            C13479a.m54764b("ListDataServiceImpl", "pinDoc()...failed for offline");
        } else if (b) {
            m35317a(str, b2, "pin", "add_quickaccess");
            this.f23037f.mo32598a(str, i, new C8298e.AbstractC8300a() {
                /* class com.bytedance.ee.bear.list.C8511i.C85154 */

                @Override // com.bytedance.ee.bear.list.p429f.C8298e.AbstractC8300a
                /* renamed from: a */
                public void mo32600a() {
                    C13479a.m54764b("ListDataServiceImpl", "pin success");
                    Toast.showSuccessText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_AddSuccessfully), 0);
                    C8511i.this.mo33275a(str, true);
                    C8511i.this.mo33278d(str, true);
                    C8674q.m36243f().mo33648b();
                    C8511i.this.mo33274a(b2, "pin", "succeed", "client_content_management");
                }

                @Override // com.bytedance.ee.bear.list.p429f.C8298e.AbstractC8300a
                /* renamed from: a */
                public void mo32601a(int i, Throwable th) {
                    C13479a.m54759a("ListDataServiceImpl", "pin fail: code = " + i, th);
                    if (!(th instanceof NetService.ServerErrorException) || ((NetService.ServerErrorException) th).getCode() != 4001) {
                        Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_AddFailedRetry), 0);
                        C8511i.this.mo33274a(b2, "pin", "failed", "client_content_management");
                        return;
                    }
                    Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_AddStarOverLimit), 0);
                }
            });
        } else {
            Context context2 = this.f23032a;
            Toast.showFailureText(context2, context2.getString(R.string.Doc_List_AddFailedRetry), 0);
            C13479a.m54764b("ListDataServiceImpl", "unPinDoc()...failed for offline");
        }
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void starDoc(final String str, int i, boolean z) {
        boolean b = C5084ad.m20847d().mo20038b().mo20041b();
        final AbstractC5233x b2 = C5234y.m21391b();
        if (z) {
            if (b) {
                m35317a(str, b2, "star", "remove_favorites");
                this.f23036e.mo33864b(str, i, new C8810l.AbstractC8812a() {
                    /* class com.bytedance.ee.bear.list.C8511i.C85121 */

                    @Override // com.bytedance.ee.bear.list.star.C8810l.AbstractC8812a
                    /* renamed from: a */
                    public void mo33279a() {
                        Toast.showSuccessText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
                        C8511i.this.notifyListStar(str, false);
                        C8511i.this.mo33277c(str, false);
                        C8511i.this.mo33274a(b2, "star", "succeed", "client_content_management");
                    }

                    @Override // com.bytedance.ee.bear.list.star.C8810l.AbstractC8812a
                    /* renamed from: a */
                    public void mo33280a(int i, Throwable th) {
                        Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
                        C8511i.this.mo33274a(b2, "star", "failed", "client_content_management");
                    }
                });
                return;
            }
            Context context = this.f23032a;
            Toast.showFailureText(context, context.getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
            C13479a.m54764b("ListDataServiceImpl", "starDoc()...failed for offline");
        } else if (b) {
            m35317a(str, b2, "star", "add_favorites");
            this.f23036e.mo33863a(str, i, new C8810l.AbstractC8812a() {
                /* class com.bytedance.ee.bear.list.C8511i.C85132 */

                @Override // com.bytedance.ee.bear.list.star.C8810l.AbstractC8812a
                /* renamed from: a */
                public void mo33279a() {
                    Toast.showSuccessText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_AddSuccessfully), 0);
                    C8511i.this.notifyListStar(str, true);
                    C8511i.this.mo33277c(str, true);
                    C8674q.m36243f().mo33650c();
                    C8511i.this.mo33274a(b2, "star", "succeed", "client_content_management");
                }

                @Override // com.bytedance.ee.bear.list.star.C8810l.AbstractC8812a
                /* renamed from: a */
                public void mo33280a(int i, Throwable th) {
                    Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_AddFailedRetry), 0);
                    C8511i.this.mo33274a(b2, "star", "failed", "client_content_management");
                }
            });
        } else {
            Context context2 = this.f23032a;
            Toast.showFailureText(context2, context2.getString(R.string.Doc_List_AddFailedRetry), 0);
            C13479a.m54764b("ListDataServiceImpl", "unStarDoc()...failed for offline");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m35337b(String str, boolean z, String str2) throws Exception {
        C8153a.m32844b().mo31602b(str, z);
        C13479a.m54764b("ListDataServiceImpl", "onStar()...success, star = " + z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35313a(BinderIDeleteDocCallback binderIDeleteDocCallback, String str, Boolean bool) throws Exception {
        C13479a.m54764b("ListDataServiceImpl", "delOfflineDoc()... end");
        if (binderIDeleteDocCallback != null) {
            binderIDeleteDocCallback.onOfflinePostExecute(true);
        }
        notifyListDocDelete(str);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void deleteDocByObjToken(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        this.f23034c.mo31472a(str, i, i2, binderIDeleteDocCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void cancelManualOffline(String str, int i, boolean z, String str2) {
        m35350d();
        this.f23039h.mo33617a(str, i, z, str2);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<DocumentCreateInfo> createDocument(int i, String str, String str2, boolean z) {
        return this.f23035d.mo31350a(i, null, null, str, str2, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public AbstractC68307f<OfflineDoc> createOfflineDocument(int i, String str, String str2, boolean z) {
        return C8522k.m35387a().mo33287a(str, i, str2, z);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void subscribeDoc(final String str, int i, boolean z, final BinderOnRequestCallback binderOnRequestCallback) {
        final AbstractC5233x b = C5234y.m21391b();
        if (z) {
            m35317a(str, b, "subscribe", "add_subscribe");
            this.f23038g.mo33867a(str, i, new SubscribeExecutor.AbstractC8818a() {
                /* class com.bytedance.ee.bear.list.C8511i.C85165 */

                @Override // com.bytedance.ee.bear.list.subscribe.SubscribeExecutor.AbstractC8818a
                /* renamed from: a */
                public void mo33281a() {
                    C13479a.m54764b("ListDataServiceImpl", "subscribe success");
                    BinderOnRequestCallback binderOnRequestCallback = binderOnRequestCallback;
                    if (binderOnRequestCallback != null) {
                        binderOnRequestCallback.onSuccess();
                    }
                    Toast.showText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_Facade_SubscribeSuccess), 0);
                    C8511i.this.mo33276b(str, true);
                    C8511i.this.mo33274a(b, "subscribe", "succeed", "client_content_management");
                }

                @Override // com.bytedance.ee.bear.list.subscribe.SubscribeExecutor.AbstractC8818a
                /* renamed from: a */
                public void mo33282a(int i, Throwable th) {
                    String str;
                    C13479a.m54759a("ListDataServiceImpl", "subscribe fail: code = " + i, th);
                    if (binderOnRequestCallback != null) {
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "";
                        }
                        binderOnRequestCallback.onFail(i, str);
                    }
                    Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_AddFailedRetry), 0);
                    C8511i.this.mo33274a(b, "subscribe", "failed", "client_content_management");
                }
            });
            return;
        }
        m35317a(str, b, "subscribe", "remove_subscribe");
        this.f23038g.mo33868b(str, i, new SubscribeExecutor.AbstractC8818a() {
            /* class com.bytedance.ee.bear.list.C8511i.C85176 */

            @Override // com.bytedance.ee.bear.list.subscribe.SubscribeExecutor.AbstractC8818a
            /* renamed from: a */
            public void mo33281a() {
                C13479a.m54764b("ListDataServiceImpl", "unSubscribe success");
                BinderOnRequestCallback binderOnRequestCallback = binderOnRequestCallback;
                if (binderOnRequestCallback != null) {
                    binderOnRequestCallback.onSuccess();
                }
                Toast.showText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_Facade_UnsubscribeSuccess), 0);
                C8511i.this.mo33276b(str, false);
                C8511i.this.mo33274a(b, "subscribe", "succeed", "client_content_management");
            }

            @Override // com.bytedance.ee.bear.list.subscribe.SubscribeExecutor.AbstractC8818a
            /* renamed from: a */
            public void mo33282a(int i, Throwable th) {
                String str;
                C13479a.m54759a("ListDataServiceImpl", "unSubscribe fail: code = " + i, th);
                if (binderOnRequestCallback != null) {
                    if (th != null) {
                        str = th.getMessage();
                    } else {
                        str = "";
                    }
                    binderOnRequestCallback.onFail(i, str);
                }
                Toast.showFailureText(C8511i.this.f23032a, C8511i.this.f23032a.getString(R.string.Doc_List_RemoveFaildRetry), 0);
                C8511i.this.mo33274a(b, "subscribe", "failed", "client_content_management");
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void manualOfflineDownload(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback) {
        m35350d();
        this.f23039h.mo33621a(z, z2, str, z3, document, binderIManualOfflineCallback);
    }

    @Override // com.bytedance.ee.bear.contract.am
    public void makeCopy(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback) {
        String str7;
        if (TextUtils.isEmpty(str4)) {
            str7 = C8292f.m34178c(this.f23032a, i);
        } else {
            str7 = str4;
        }
        new MakeCopyExecutor((NetService) KoinJavaComponent.m268610a(NetService.class)).mo33531a(str, i, str2, str3, str7, this.f23032a.getString(R.string.Doc_Facade_CopyDocSuffix), i2, new ListDataServiceImpl$7(this, binderIMakeCopyCallback, str6, str5, i, str));
    }
}

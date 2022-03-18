package com.bytedance.ee.bear.document;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.bear.contract.AbstractC5170f;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.BinderPushListener;
import com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.as;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.p315b.C5893b;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5997i;
import com.bytedance.ee.bear.document.offline.sync.C6002l;
import com.bytedance.ee.bear.document.offline.sync.C6005m;
import com.bytedance.ee.bear.document.offline.sync.sync.C6027a;
import com.bytedance.ee.bear.document.p302c.C5683b;
import com.bytedance.ee.bear.p409j.AbstractC7935a;
import com.bytedance.ee.bear.rn.RnBaseProtocol;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.document.k */
public class C5856k extends AbstractC5170f {

    /* renamed from: a */
    private RnBaseProtocol f16401a;

    /* renamed from: b */
    private RnManager f16402b;

    /* renamed from: c */
    private Context f16403c;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void clearCacheView() {
        C5683b.m23048b(this.f16403c);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m23567e() {
        C6027a.m24403a().mo24352b();
        C6002l.m24300a();
        C5683b.m23043a(this.f16403c);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Boolean> clearDocCache() {
        return C6027a.m24403a().mo24362f();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public List<String> getTokenList() {
        return C6027a.m24403a().mo24357c();
    }

    /* renamed from: d */
    private RnManager m23565d() {
        if (this.f16402b == null) {
            this.f16402b = (RnManager) KoinJavaComponent.m268610a(RnManager.class);
        }
        return this.f16402b;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Boolean> clearMemUserData() {
        C13479a.m54764b("DocsDataServiceImpl", "clearMemUserData()...");
        return AbstractC68307f.m265083a((Object) true).mo238020d($$Lambda$k$x7SR4bYPUkYbsskASNg2LrPHZjE.INSTANCE).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$k$CB3tvowrmQcNZc5CQH0KZOkYJc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5856k.this.m23557a((Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Boolean> clearUserData() {
        C13479a.m54764b("DocsDataServiceImpl", "clearUserData()...");
        return AbstractC68307f.m265083a((Object) true).mo238020d($$Lambda$k$6EiucMv92V0dkFKM1KZ1KB_VZcs.INSTANCE).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$k$BHYXdoYcvWPVF9OQIwJiIPq41M */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5856k.this.m23564c((Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5170f, com.bytedance.ee.bear.service.AbstractC10933f
    /* renamed from: b */
    public Class<?>[] mo16351b() {
        return new Class[]{NetService.class, am.class};
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void delDocs(String str) {
        C6027a.m24403a().mo24350a(str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void delDocsList(List<String> list) {
        C6027a.m24403a().mo24351a(list);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registSendDataCallback(BinderISendDataCallback binderISendDataCallback) {
        m23565d().mo40248a(binderISendDataCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registerBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
        C6027a.m24403a().mo24346a(binderBackgroundSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registerUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
        C6027a.m24403a().mo24347a(binderUnSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void removeRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus) {
        m23565d().mo40256b(binderIRnConnectStatus);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegistSendDataCallback(BinderISendDataCallback binderISendDataCallback) {
        m23565d().mo40257b(binderISendDataCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegisterBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
        C6027a.m24403a().mo24353b(binderBackgroundSyncDocumentsCallback);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegisterUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
        C6027a.m24403a().mo24354b(binderUnSyncDocumentsCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m23556a(as asVar) throws Exception {
        asVar.clearOffMemCache();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m23562b(as asVar) throws Exception {
        asVar.clearOfflineDB();
        return true;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public AbstractC68307f<Long> getDocCacheSize(long j) {
        return C6027a.m24403a().mo24344a(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m23557a(Boolean bool) throws Exception {
        return mo20649c().mo41508c(as.class).mo238020d($$Lambda$k$uon1dIESlolmDtARYHlIvJu7A.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m23563b(Boolean bool) throws Exception {
        C5955d.m24025b().mo24106h();
        C6027a.m24403a().mo24359d();
        C6002l.m24300a().mo24267b();
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m23564c(Boolean bool) throws Exception {
        return mo20649c().mo41508c(as.class).mo238020d($$Lambda$k$IEEHrr3nmXorxYV2Lnovsu6ns.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void addRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus) {
        if (m23565d().mo40262d()) {
            binderIRnConnectStatus.connected();
        }
        m23565d().mo40247a(binderIRnConnectStatus);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5170f, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
        super.lazyInit(application);
        this.f16403c = application;
        C6027a.m24403a();
        C13748k.m55733a(new Runnable() {
            /* class com.bytedance.ee.bear.document.$$Lambda$k$LfaMAXcuOhYQ7Sc8hq7vhCc64dU */

            public final void run() {
                C5856k.this.m23567e();
            }
        }, 3000);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void preloadDocsInterval(List<OfflineDoc> list) {
        if (list != null && !list.isEmpty()) {
            C6002l.m24300a().mo24265a(list);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void uploadDocs(List<OfflineDoc> list) {
        if (list != null && !list.isEmpty()) {
            C6027a.m24403a().mo24356b(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Boolean m23566d(Boolean bool) throws Exception {
        C5955d.m24025b().mo24104g();
        C6027a.m24403a().mo24359d();
        C6002l.m24300a().mo24267b();
        return bool;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public int clearUpTimeMills(long j) {
        int a = C5955d.m24025b().mo24070a(j);
        C13479a.m54764b("DocsDataServiceImpl", "DocsDataServiceImpl.clearUpTimeMills, upTimeMills: " + j + ", cleanSize: " + a);
        return a;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void preloadDocs(List<OfflineDoc> list) {
        if (list != null && !list.isEmpty()) {
            AbstractC7935a aVar = (AbstractC7935a) KoinJavaComponent.m268610a(AbstractC7935a.class);
            if (aVar != null) {
                aVar.mo30706a().mo238001b(new Consumer(list) {
                    /* class com.bytedance.ee.bear.document.$$Lambda$k$Bxl2xXzoRmCtXu4s_TLq1ZVO4 */
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C5856k.m23561a(this.f$0, obj);
                    }
                }, $$Lambda$k$4NMnwZQCFrxaQx8APKAGmdxVivU.INSTANCE);
            } else {
                C13479a.m54775e("DocsDataServiceImpl", "appInitialize == null");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void preloadDocs(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48478b()).mo238001b(new Consumer(offlineDoc) {
            /* class com.bytedance.ee.bear.document.$$Lambda$k$v3fwCZkBem9zlrNvbXtzFuoC8 */
            public final /* synthetic */ OfflineDoc f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5856k.m23558a(BinderIPreloadCallback.this, this.f$1, (String) obj);
            }
        }, new Consumer(offlineDoc) {
            /* class com.bytedance.ee.bear.document.$$Lambda$k$r_cLYi31lxjYTVbuiny_dNqlSws */
            public final /* synthetic */ OfflineDoc f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5856k.m23559a(BinderIPreloadCallback.this, this.f$1, (Throwable) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void registerListPushListener(BinderPushListener binderPushListener, String str) {
        if (this.f16401a == null) {
            this.f16401a = (RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class);
        }
        this.f16401a.mo40305a(binderPushListener, str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unRegisterListPushListener(BinderPushListener binderPushListener, String str) {
        if (this.f16401a == null) {
            this.f16401a = (RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class);
        }
        this.f16401a.mo40309b(binderPushListener, str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void unWatchDocs(List<OfflineDoc> list, String str) {
        if (this.f16401a == null) {
            this.f16401a = (RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class);
        }
        if (list != null && !list.isEmpty()) {
            this.f16401a.mo40311b(list, str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public void watchDocs(List<OfflineDoc> list, String str) {
        if (this.f16401a == null) {
            this.f16401a = (RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class);
        }
        if (list != null && !list.isEmpty()) {
            this.f16401a.mo40308a(list, str);
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
    public int clearImageUpTimeMills(long j, long j2) {
        int a = C5893b.m23724a().mo23806a(j, j2);
        C13479a.m54764b("DocsDataServiceImpl", "DocsDataServiceImpl.clearImageUpTimeMills, upTimeMills: " + j + ", maxSizeBytes: " + j2 + ", cleanSize: " + a);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23561a(List list, Object obj) throws Exception {
        C6002l.m24300a().mo24268b(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23559a(BinderIPreloadCallback binderIPreloadCallback, OfflineDoc offlineDoc, Throwable th) throws Exception {
        C13479a.m54761a("DocsDataServiceImpl", th);
        if (binderIPreloadCallback != null) {
            binderIPreloadCallback.onPreloadFail(offlineDoc.getObj_token());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23558a(BinderIPreloadCallback binderIPreloadCallback, OfflineDoc offlineDoc, String str) throws Exception {
        if (binderIPreloadCallback != null) {
            binderIPreloadCallback.onPreloadStart(offlineDoc.getObj_token());
        }
        AbstractC5997i a = C6005m.m24312a().mo24271a(offlineDoc.getType());
        if (a == null) {
            C13479a.m54775e("DocsDataServiceImpl", "type error: " + offlineDoc);
            if (binderIPreloadCallback != null) {
                binderIPreloadCallback.onPreloadFail(offlineDoc.getObj_token());
            }
        } else if (a.mo24219c(offlineDoc.getObj_token()) != null) {
            C13479a.m54764b("DocsDataServiceImpl", "preloadDocs has cache");
            if (binderIPreloadCallback != null) {
                binderIPreloadCallback.onPreloadSuccess(offlineDoc.getObj_token());
            }
        } else {
            a.mo24221a(offlineDoc, binderIPreloadCallback);
        }
    }
}

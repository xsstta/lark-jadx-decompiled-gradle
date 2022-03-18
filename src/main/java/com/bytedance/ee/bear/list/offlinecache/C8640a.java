package com.bytedance.ee.bear.list.offlinecache;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.offlinecache.C8640a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.offlinecache.a */
public class C8640a {

    /* renamed from: a */
    public final AtomicBoolean f23409a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f23410b = new AtomicBoolean(false);

    /* renamed from: c */
    public boolean f23411c;

    /* renamed from: d */
    public String f23412d;

    /* renamed from: e */
    public final List<Document> f23413e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final List<OfflineDoc> f23414f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final List<OfflineDoc> f23415g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public final List<OfflineDoc> f23416h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final RunnableC8646d f23417i = new RunnableC8646d();

    /* renamed from: j */
    private final C10917c f23418j;

    /* renamed from: k */
    private ConnectionService f23419k;

    /* renamed from: l */
    private final C68289a f23420l = new C68289a();

    /* renamed from: m */
    private BinderAccountChangeCallback f23421m;

    /* renamed from: n */
    private LiveData<ConnectionService.NetworkState> f23422n;

    /* renamed from: o */
    private final AbstractC1178x<ConnectionService.NetworkState> f23423o = new C8645c();

    /* renamed from: p */
    private final RunnableC8643a f23424p = new RunnableC8643a();

    /* renamed from: q */
    private final RunnableC8644b f23425q = new RunnableC8644b();

    /* renamed from: c */
    public List<Document> mo33625c() {
        return this.f23413e;
    }

    /* renamed from: a */
    public void mo33608a() {
        C13479a.m54764b("OfflineCacheManager", "init()...");
        ConnectionService d = C5084ad.m20847d();
        this.f23419k = d;
        this.f23422n = d.mo20037a();
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f != null) {
            this.f23412d = f.f14584a;
        }
        m36143g();
        m36147i();
        m36141f();
        m36145h();
        mo33622b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36120a(ArrayList arrayList) throws Exception {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Document document = (Document) it.next();
            mo33613a(document);
            int i = document.mo32464l() ? 7 : 5;
            document.mo32436e(i);
            mo33616a(document.mo32472o(), i);
        }
        mo33620a(this.f23419k.mo20038b().mo20042c());
        C13479a.m54764b("OfflineCacheManager", "get manual list from db success, size = " + arrayList.size());
    }

    /* renamed from: a */
    public void mo33621a(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback) {
        C13479a.m54764b("OfflineCacheManager", "manualOffline()...module = " + str + ", type = " + document.mo32483t());
        if (this.f23419k.mo20038b().mo20041b() || document.mo32464l()) {
            mo33613a(document);
            m36129b(z, z2, str, z3, document, binderIManualOfflineCallback);
            return;
        }
        mo33615a(document, z2, false, str);
        mo33613a(document);
        if (binderIManualOfflineCallback != null) {
            binderIManualOfflineCallback.onDownloadStatusChange();
        }
    }

    /* renamed from: a */
    public void mo33613a(Document document) {
        boolean z;
        boolean z2;
        C13479a.m54764b("OfflineCacheManager", "produce()...");
        Iterator<OfflineDoc> it = this.f23414f.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().getToken(), document.mo32472o())) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2 && !Document.m33924M(document.mo32472o())) {
            this.f23414f.add(new OfflineDoc(document.mo32472o(), document.mo32483t()));
            mo33618a(this.f23414f, true);
        }
        Iterator<Document> it2 = this.f23413e.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (TextUtils.equals(it2.next().mo32472o(), document.mo32472o())) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            document.mo32436e(document.mo32464l() ? 7 : 5);
            this.f23413e.add(document);
        }
    }

    /* renamed from: a */
    public void mo33615a(Document document, boolean z, boolean z2, String str) {
        this.f23420l.mo237937a(AbstractC68307f.m265083a(document).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(z2, z, str) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$RX_wQd8mMb26yKawGBiO4GINkI */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8640a.m36115a(Document.this, this.f$1, this.f$2, this.f$3, (Document) obj);
            }
        }, new Consumer(z2, z, str, document) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$Jif2ABr7s6v6nJqROAjUL1lidE */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ Document f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8640a.m36122a(this.f$0, this.f$1, this.f$2, this.f$3, (Throwable) obj);
            }
        }));
        mo33616a(document.mo32472o(), 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36115a(Document document, boolean z, boolean z2, String str, Document document2) throws Exception {
        document2.mo32382E(String.valueOf(System.currentTimeMillis() / 1000));
        C8153a.m32844b().mo31583a(C8200i.m33446a(document), C8200i.m33447a(document, 7));
        if (document.mo32483t() == C8275a.f22375h.mo32555b()) {
            C8153a.m32844b().mo31585a(document.mo32472o(), document2.mo32407W());
        }
        if (z) {
            ListAnalysis.m32509a(C5234y.m21391b(), z2, str, document, "succeed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36122a(boolean z, boolean z2, String str, Document document, Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "insertManualDb() error:" + th);
        if (z) {
            ListAnalysis.m32509a(C5234y.m21391b(), z2, str, document, "failed");
        }
    }

    /* renamed from: a */
    public void mo33616a(String str, int i) {
        C13479a.m54764b("OfflineCacheManager", "SpaceNotificationService notifyManualOffline Status, newStatus:" + i);
        C8674q.m36243f().mo33644a(str, i);
    }

    /* renamed from: a */
    public void mo33611a(final BinderIManualOfflineCallback binderIManualOfflineCallback, final Document document, final boolean z, final boolean z2, final String str) {
        Bundle bundle = new Bundle();
        bundle.putString("module", str);
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19658a(false, document.mo32472o(), (AbstractC4967c.AbstractC4968a) new AbstractC4967c.AbstractC4968a() {
            /* class com.bytedance.ee.bear.list.offlinecache.C8640a.C86422 */

            @Override // com.bytedance.ee.bear.AbstractC4967c.AbstractC4968a
            /* renamed from: a */
            public void mo19663a(DriveManualCacheStatus driveManualCacheStatus) {
                C8640a.this.mo33610a(binderIManualOfflineCallback, document, driveManualCacheStatus, z, z2, str);
            }
        }, bundle);
    }

    /* renamed from: a */
    public void mo33610a(BinderIManualOfflineCallback binderIManualOfflineCallback, Document document, DriveManualCacheStatus driveManualCacheStatus, boolean z, boolean z2, String str) {
        C13479a.m54764b("OfflineCacheManager", "updateDriveDownloadStatus()...status = " + driveManualCacheStatus.mo20377a());
        int a = driveManualCacheStatus.mo20377a();
        int i = 5;
        if (a == 0) {
            if (driveManualCacheStatus.mo20384c() != 508) {
                i = 8;
            }
            mo33616a(document.mo32472o(), i);
            mo33614a(document, i);
        } else if (a == 5) {
            if (document.mo32408X()) {
                C8153a.m32844b().mo31625e(document.mo32472o(), false);
            }
            mo33616a(document.mo32472o(), 7);
            mo33614a(document, 7);
        } else if (a == 2) {
            if (binderIManualOfflineCallback != null) {
                binderIManualOfflineCallback.getClass();
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$OPWG5wD6fhal0gb66YbMjZR4RU */

                    public final void run() {
                        BinderIManualOfflineCallback.this.onDownloadStatusChange();
                    }
                });
            }
            document.mo32384F(String.valueOf(driveManualCacheStatus.mo20381b()));
            mo33615a(document, z, z2, str);
        } else if (a == 3) {
            mo33616a(document.mo32472o(), 6);
            mo33614a(document, 6);
        }
    }

    /* renamed from: a */
    public void mo33614a(Document document, int i) {
        document.mo32436e(i);
        for (Document document2 : this.f23413e) {
            if (TextUtils.equals(document.mo32472o(), document2.mo32472o())) {
                document2.mo32436e(document.mo32486u());
            }
        }
    }

    /* renamed from: a */
    public void mo33612a(OfflineDoc offlineDoc) {
        for (Document document : this.f23413e) {
            if (TextUtils.equals(document.mo32472o(), offlineDoc.getFakeToken())) {
                document.mo32451i(offlineDoc.getObj_token());
            }
        }
    }

    /* renamed from: a */
    public void mo33617a(String str, int i, boolean z, String str2) {
        C13479a.m54764b("OfflineCacheManager", "cancelManualOffline()...type = " + i + ", module = " + str2);
        this.f23420l.mo237937a(AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238014c(new Function(i, str) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$aUxx47J_fZ4sUlImRDGKyX4TvE */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.m36113a(this.f$0, this.f$1, (String) obj);
            }
        }).mo238001b(new Consumer(str, i, z, str2) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$DLgjGuc6phIEOwt0_XacLOvVbbQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8640a.this.m36117a((C8640a) this.f$1, (String) this.f$2, (int) this.f$3, (boolean) this.f$4, (String) obj);
            }
        }, new Consumer(z, str2, str, i) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$GqwnPCIWDYQWuTmdzHJKmJIgoVc */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8640a.m36121a(this.f$0, this.f$1, this.f$2, this.f$3, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36118a(String str, String str2) throws Exception {
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19661b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36117a(String str, int i, boolean z, String str2, String str3) throws Exception {
        mo33616a(str3, 0);
        m36127b(str, i);
        ListAnalysis.m32510a(C5234y.m21391b(), z, str2, str, i, "succeed");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36121a(boolean z, String str, String str2, int i, Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "cancelManualOffline() error:" + th);
        ListAnalysis.m32510a(C5234y.m21391b(), z, str, str2, i, "failed");
    }

    /* renamed from: a */
    public void mo33619a(JSONArray jSONArray) {
        if (jSONArray != null) {
            this.f23420l.mo237937a(AbstractC68307f.m265083a(jSONArray).mo237985a(C11678b.m48479c()).mo238020d(new Function(jSONArray) {
                /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$3Q3YLrQlCDMSuM9zZ20aXw0 */
                public final /* synthetic */ JSONArray f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8640a.m36112a(this.f$0, (JSONArray) obj);
                }
            }).mo237998a((AbstractC68322n) $$Lambda$HyKqOAfpJVSmEnqumDMjGy_h1ek.INSTANCE).mo238014c(new Function() {
                /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$r8xYesxsYK6qlsVRvYKn_05Y_U */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8640a.this.m36114a((List) obj);
                }
            }).mo238001b($$Lambda$a$gWki5pwZguODpYfQj7uD1HDs.INSTANCE, $$Lambda$a$_8rg4eCx1MIsPK2ulmIerGPvgYs.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m36114a(List list) throws Exception {
        C8153a.m32844b().mo31570a(7, list);
        C8153a.m32844b().mo31570a(1, list);
        C8153a.m32844b().mo31597b(list);
        C13479a.m54764b("OfflineCacheManager", "delete list record");
        return this.f23418j.mo41508c(AbstractC5094ag.class).mo238020d(new Function(list) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$alqEJNXkmew3uuWlHFx7GBFvloo */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.m36108a(this.f$0, (AbstractC5094ag) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo33618a(List<OfflineDoc> list, boolean z) {
        C13479a.m54764b("OfflineCacheManager", "watchDocs()...watch = " + z + ", size = " + C13657b.m55424c(list));
        if (!this.f23419k.mo20038b().mo20041b()) {
            C13479a.m54764b("OfflineCacheManager", "watchDocs()...offline");
        } else if (C13657b.m55423b(list)) {
            this.f23420l.mo237937a(this.f23418j.mo41508c(AbstractC5094ag.class).mo238020d(new Function(z, list) {
                /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$gzctfOkJmpvo5yaPwSXzq3zf7Is */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ List f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8640a.m36109a(this.f$0, this.f$1, (AbstractC5094ag) obj);
                }
            }).mo238001b($$Lambda$a$YWGBEFY2vc6slkHwf8dgmbTEMLA.INSTANCE, $$Lambda$a$WT8eUX1O08Ar7IsVNTOF1X1jfRw.INSTANCE));
        } else {
            C13479a.m54764b("OfflineCacheManager", "watchDocs()...list is empty");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36116a(Boolean bool) throws Exception {
        C13479a.m54764b("OfflineCacheManager", "watchDocs()...result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36119a(Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "watchDocs()...error = " + th);
    }

    /* renamed from: a */
    public void mo33609a(long j) {
        C13748k.m55735c(this.f23425q);
        C13748k.m55733a(this.f23425q, j);
    }

    /* renamed from: a */
    public void mo33620a(boolean z) {
        C13479a.m54764b("OfflineCacheManager", "reManualOfflineDownload()...isWifi = " + z);
        for (Document document : this.f23413e) {
            document.mo32436e(document.mo32464l() ? 7 : 5);
            if (document.mo32486u() == 5 && (!document.mo32408X() || z)) {
                m36129b(false, false, "", false, document, null);
            }
        }
    }

    /* renamed from: h */
    private void m36145h() {
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$FwmqP4aD_8NSq_3XlVWmS9bM */

            public final void run() {
                C8640a.this.m36151m();
            }
        });
    }

    /* renamed from: i */
    private void m36147i() {
        this.f23422n.mo5928b(this.f23423o);
        this.f23422n.mo5925a(this.f23423o);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.offlinecache.a$a */
    public class RunnableC8643a implements Runnable {
        public void run() {
            C13479a.m54764b("OfflineCacheManager", "BackgroundSleepRunnable()...");
            C8640a.this.f23410b.compareAndSet(false, true);
            C8640a aVar = C8640a.this;
            aVar.mo33618a(aVar.f23416h, false);
            C8640a.this.mo33628e();
        }

        private RunnableC8643a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.offlinecache.a$b */
    public class RunnableC8644b implements Runnable {
        public void run() {
            C13479a.m54764b("OfflineCacheManager", "JobRunnable()...");
            C8640a aVar = C8640a.this;
            aVar.mo33618a(aVar.f23414f, true);
            C8640a aVar2 = C8640a.this;
            aVar2.mo33618a(aVar2.f23415g, false);
        }

        private RunnableC8644b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.offlinecache.a$d */
    public class RunnableC8646d implements Runnable {
        public void run() {
            C13479a.m54764b("OfflineCacheManager", "ProcessStartRunnable()...");
            C8640a.this.f23409a.set(false);
            C8640a.this.mo33608a();
        }

        private RunnableC8646d() {
        }
    }

    /* renamed from: f */
    private void m36141f() {
        this.f23420l.mo237937a(this.f23418j.mo41508c(ak.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$MsAlEQvlWh6RdQ1nYsHOvpCCgA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.this.m36106a((ak) obj);
            }
        }).mo238001b($$Lambda$a$LHAz_1Wql6UZegqiMjexTDhrYw.INSTANCE, $$Lambda$a$WrNYXvSnIIaFWW5xYjhu4MMNSb0.INSTANCE));
    }

    /* renamed from: g */
    private void m36143g() {
        C5102ai.m20872j().mo20215g().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$iOxSkxsSNMMuwqR4A5uRmmfr35g */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8640a.this.m36134d((C8640a) ((Boolean) obj));
            }
        });
    }

    /* renamed from: j */
    private void m36148j() {
        this.f23420l.mo237937a(this.f23418j.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$77ORkxUt5i3Ko8B5YXAcXv2zzAI */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.this.m36130c((AbstractC5094ag) obj);
            }
        }).mo238001b($$Lambda$a$HJeterbys06eYcQqFde0hdNt3oY.INSTANCE, $$Lambda$a$OgmKsDVY6fYM_Zgu7VC0pMXcUnE.INSTANCE));
    }

    /* renamed from: k */
    private void m36149k() {
        this.f23420l.mo237937a(this.f23418j.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$uyBjConhIauKbZaG_duZxd_XCoc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.this.m36123b((AbstractC5094ag) obj);
            }
        }).mo238001b($$Lambda$a$obbA1Yd4S7AjygUxua6JZSGP8kg.INSTANCE, $$Lambda$a$hwva4APFOZ1VGmFVmNV0of4XY.INSTANCE));
    }

    /* renamed from: l */
    private void m36150l() {
        this.f23420l.mo237937a(this.f23418j.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$wbUlO4cThW9IiC48zm_IcPfA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.this.m36110a((AbstractC5094ag) obj);
            }
        }).mo238001b($$Lambda$a$wXx_8CB4j_OTaOY0wSQJuBcmEM.INSTANCE, $$Lambda$a$yRUWaYx3_0t02dHFDeG9lf84E30.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m36151m() {
        if (this.f23421m == null) {
            this.f23421m = new ManualOfflineManager$5(this);
        }
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(this.f23421m);
    }

    /* renamed from: d */
    public void mo33627d() {
        C13479a.m54764b("OfflineCacheManager", "registerListeners()...");
        m36149k();
        m36150l();
        m36148j();
    }

    /* renamed from: e */
    public void mo33628e() {
        C13479a.m54764b("OfflineCacheManager", "clear()...");
        C13748k.m55735c(this.f23425q);
        this.f23413e.clear();
        this.f23414f.clear();
        this.f23415g.clear();
        this.f23416h.clear();
        this.f23420l.mo237935a();
    }

    /* renamed from: b */
    public void mo33622b() {
        C13479a.m54764b("OfflineCacheManager", "initData()...");
        this.f23420l.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d($$Lambda$a$Wl3XLcxIbNBN3an5ZTqPVLfoPMk.INSTANCE).mo237998a((AbstractC68322n) $$Lambda$TzFZCqcgOn5o_KmhCFFSN51CmY.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$ECvpBhnEu8hNhhL5hVvBTL9fuog */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8640a.this.m36120a((C8640a) ((ArrayList) obj));
            }
        }, $$Lambda$a$oYF7bMUZQ0mYwcamUII4YJAd_z8.INSTANCE));
    }

    /* renamed from: com.bytedance.ee.bear.list.offlinecache.a$c */
    private class C8645c implements AbstractC1178x<ConnectionService.NetworkState> {
        private C8645c() {
        }

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            C13479a.m54764b("OfflineCacheManager", "on Network Changed...");
            boolean z = false;
            if (networkState != null && networkState.mo20041b()) {
                if (C8640a.this.f23409a.compareAndSet(false, true)) {
                    C8640a.this.mo33627d();
                }
                C8640a.this.mo33609a(0);
                if (C8640a.this.f23411c) {
                    C8640a.this.mo33620a(networkState.mo20042c());
                }
            }
            C8640a aVar = C8640a.this;
            if (networkState == null || !networkState.mo20041b()) {
                z = true;
            }
            aVar.f23411c = z;
        }
    }

    /* renamed from: b */
    private String m36124b(Document document) {
        return C8292f.m34185d(document);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m36106a(ak akVar) throws Exception {
        akVar.addProcessStartCallback(new ManualOfflineManager$4(this));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m36123b(AbstractC5094ag agVar) throws Exception {
        agVar.addRnConnectStatusCallback(new ManualOfflineManager$7(this));
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m36130c(AbstractC5094ag agVar) throws Exception {
        agVar.registerBackgroundSyncDocumentsChangeCallback(new ManualOfflineManager$6(this));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ ArrayList m36140f(Boolean bool) throws Exception {
        return C8200i.m33450a(C8153a.m32844b().mo31599b(7));
    }

    /* renamed from: a */
    public static AbstractC68307f<Boolean> m36105a(String str) {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$VTblgke4Fe5AnSZrjfnGAd3yqnE */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.m36107a(this.f$0, (Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36126b(Boolean bool) throws Exception {
        C13479a.m54764b("OfflineCacheManager", "onDocDeleted()...success = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m36136d(Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "registerRNConnectCallback()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m36139e(Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "registerSyncDocumentCallback()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m36146h(Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "init()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36128b(Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "onDocDeleted()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m36142f(Throwable th) throws Exception {
        C13479a.m54758a("OfflineCacheManager", "registerProcessStartCallBack()...fail = " + th);
    }

    public C8640a(C10917c cVar) {
        this.f23418j = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m36134d(Boolean bool) {
        long j;
        C13479a.m54764b("OfflineCacheManager", "observeAppForeground()...isVisible = " + bool);
        if (bool == Boolean.TRUE) {
            C13748k.m55735c(this.f23424p);
            if (this.f23410b.get()) {
                this.f23410b.set(false);
                mo33622b();
                return;
            }
            return;
        }
        C13748k.m55735c(this.f23424p);
        RunnableC8643a aVar = this.f23424p;
        if (C5102ai.m20872j().mo20214f()) {
            j = 0;
        } else {
            j = ManualOfflineConfig.getConfig().getManual_offline_suspend_time();
        }
        C13748k.m55733a(aVar, j);
    }

    /* renamed from: c */
    public void mo33626c(OfflineDoc offlineDoc) {
        int i = -1;
        for (int i2 = 0; i2 < this.f23415g.size(); i2++) {
            if (TextUtils.equals(offlineDoc.getToken(), this.f23415g.get(i2).getToken())) {
                C13479a.m54764b("OfflineCacheManager", "onUnWatchedSuccess()...index = " + i2);
                i = i2;
            }
        }
        if (i != -1) {
            this.f23415g.remove(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m36110a(AbstractC5094ag agVar) throws Exception {
        agVar.registSendDataCallback(new ManualOfflineManager$8(this));
        return "";
    }

    /* renamed from: b */
    public void mo33623b(OfflineDoc offlineDoc) {
        int i = -1;
        for (int i2 = 0; i2 < this.f23414f.size(); i2++) {
            if (TextUtils.equals(offlineDoc.getToken(), this.f23414f.get(i2).getToken())) {
                C13479a.m54764b("OfflineCacheManager", "onWatchedSuccess()...index = " + i2);
                i = i2;
            }
        }
        if (i != -1) {
            this.f23414f.remove(i);
        }
        this.f23416h.add(offlineDoc);
    }

    /* renamed from: b */
    public boolean mo33624b(String str) {
        return TextUtils.equals(str, "OFFLINE");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m36107a(String str, Boolean bool) throws Exception {
        return Boolean.valueOf(C8153a.m32844b().mo31643k(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m36108a(List list, AbstractC5094ag agVar) throws Exception {
        agVar.delDocsList(list);
        C13479a.m54764b("OfflineCacheManager", "delete resource data");
        return true;
    }

    /* renamed from: b */
    private void m36127b(String str, int i) {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f23413e.size()) {
                i2 = -1;
                break;
            } else if (TextUtils.equals(this.f23413e.get(i2).mo32472o(), str)) {
                C13479a.m54764b("OfflineCacheManager", "onCancelManualOffline()...withWatchedIndex = " + i2);
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            this.f23413e.remove(i2);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f23414f.size()) {
                i3 = -1;
                break;
            } else if (TextUtils.equals(this.f23414f.get(i3).getToken(), str)) {
                C13479a.m54764b("OfflineCacheManager", "onCancelManualOffline()...needWatchedIndex = " + i3);
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1) {
            this.f23414f.remove(i3);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f23416h.size()) {
                i4 = -1;
                break;
            } else if (TextUtils.equals(this.f23416h.get(i4).getToken(), str)) {
                C13479a.m54764b("OfflineCacheManager", "onCancelManualOffline()...watchedSuccessIndex = " + i4);
                break;
            } else {
                i4++;
            }
        }
        if (i4 != -1) {
            this.f23416h.remove(i4);
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.f23415g.size()) {
                z = false;
                break;
            } else if (TextUtils.equals(this.f23415g.get(i5).getToken(), str)) {
                z = true;
                break;
            } else {
                i5++;
            }
        }
        if (!z && !Document.m33924M(str)) {
            this.f23415g.add(new OfflineDoc(str, i));
            mo33618a(this.f23415g, false);
            C13479a.m54764b("OfflineCacheManager", "onCancelManualOffline()...existUnWatchedList");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m36112a(JSONArray jSONArray, JSONArray jSONArray2) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = ((JSONObject) jSONArray.get(i)).optString("token");
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
                C13479a.m54764b("OfflineCacheManager", "onDocDeleted()...token = " + C13598b.m55197d(optString));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m36109a(boolean z, List list, AbstractC5094ag agVar) throws Exception {
        C13479a.m54764b("OfflineCacheManager", "get docsDataService success");
        if (z) {
            agVar.watchDocs(list, "OFFLINE");
        } else {
            agVar.unWatchDocs(list, "OFFLINE");
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m36113a(int i, String str, String str2) throws Exception {
        C8153a.m32844b().mo31594b(7, str2);
        if (i == C8275a.f22375h.mo32555b()) {
            return AbstractC68307f.m265083a(str).mo238005b((Consumer) new Consumer(str) {
                /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$iWlbUn36uQKsYT6UNUdldYF2Jm4 */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8640a.m36118a(this.f$0, (String) obj);
                }
            });
        }
        return AbstractC68307f.m265083a(str2);
    }

    /* renamed from: b */
    private void m36125b(BinderIManualOfflineCallback binderIManualOfflineCallback, Document document, boolean z, boolean z2, String str) {
        C13479a.m54764b("OfflineCacheManager", "docsDownload()...module = " + str + ", type = " + document.mo32483t());
        this.f23420l.mo237937a(this.f23418j.mo41508c(AbstractC5094ag.class).mo238020d(new Function(new OfflineDoc(document.mo32472o(), m36124b(document), document.mo32483t(), "tab_manual_offline"), binderIManualOfflineCallback, document, z, z2, str) {
            /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$oxqkQPnjbylmfUP0XqPGhzuVB00 */
            public final /* synthetic */ OfflineDoc f$1;
            public final /* synthetic */ BinderIManualOfflineCallback f$2;
            public final /* synthetic */ Document f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ boolean f$5;
            public final /* synthetic */ String f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8640a.this.m36111a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (AbstractC5094ag) obj);
            }
        }).mo238001b($$Lambda$a$jDACcg9yuKuHXFQCX8T1z6rG4Yg.INSTANCE, $$Lambda$a$dPJWrJVAWkFPGmcDOIEKrBK6iV0.INSTANCE));
    }

    /* renamed from: b */
    private void m36129b(boolean z, final boolean z2, final String str, final boolean z3, final Document document, final BinderIManualOfflineCallback binderIManualOfflineCallback) {
        C13479a.m54764b("OfflineCacheManager", "download()...module = " + str + ", type = " + document.mo32483t());
        if (document.mo32483t() == C8275a.f22375h.mo32555b()) {
            Bundle bundle = new Bundle();
            bundle.putString("module", str);
            ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19658a(z, document.mo32472o(), new AbstractC4967c.AbstractC4968a() {
                /* class com.bytedance.ee.bear.list.offlinecache.C8640a.C86411 */

                @Override // com.bytedance.ee.bear.AbstractC4967c.AbstractC4968a
                /* renamed from: a */
                public void mo19663a(DriveManualCacheStatus driveManualCacheStatus) {
                    if (driveManualCacheStatus.mo20377a() == 1) {
                        document.mo32384F(String.valueOf(driveManualCacheStatus.mo20381b()));
                        BinderIManualOfflineCallback binderIManualOfflineCallback = binderIManualOfflineCallback;
                        if (binderIManualOfflineCallback != null) {
                            C13748k.m55732a(new Runnable(binderIManualOfflineCallback, document, driveManualCacheStatus, z2, z3, str) {
                                /* class com.bytedance.ee.bear.list.offlinecache.$$Lambda$a$1$Y7ctaLtRql9HD9HjdUid9rhJEQ8 */
                                public final /* synthetic */ BinderIManualOfflineCallback f$1;
                                public final /* synthetic */ Document f$2;
                                public final /* synthetic */ DriveManualCacheStatus f$3;
                                public final /* synthetic */ boolean f$4;
                                public final /* synthetic */ boolean f$5;
                                public final /* synthetic */ String f$6;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                    this.f$3 = r4;
                                    this.f$4 = r5;
                                    this.f$5 = r6;
                                    this.f$6 = r7;
                                }

                                public final void run() {
                                    C8640a.C86411.this.m36173a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    C8640a.this.mo33610a(binderIManualOfflineCallback, document, driveManualCacheStatus, z2, z3, str);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m36173a(BinderIManualOfflineCallback binderIManualOfflineCallback, Document document, DriveManualCacheStatus driveManualCacheStatus, boolean z, boolean z2, String str) {
                    binderIManualOfflineCallback.onShowConfirmDownloadDialog(document, driveManualCacheStatus.mo20381b(), new ManualOfflineManager$1$1(this, binderIManualOfflineCallback, z, z2, str));
                }
            }, bundle);
            return;
        }
        m36125b(binderIManualOfflineCallback, document, z2, z3, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m36111a(OfflineDoc offlineDoc, BinderIManualOfflineCallback binderIManualOfflineCallback, Document document, boolean z, boolean z2, String str, AbstractC5094ag agVar) throws Exception {
        agVar.preloadDocs(offlineDoc, new ManualOfflineManager$3(this, binderIManualOfflineCallback, document, z, z2, str));
        return "";
    }
}

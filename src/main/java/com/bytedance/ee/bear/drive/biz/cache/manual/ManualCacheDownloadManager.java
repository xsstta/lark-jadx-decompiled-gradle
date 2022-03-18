package com.bytedance.ee.bear.drive.biz.cache.manual;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager;
import com.bytedance.ee.bear.drive.biz.cache.manual.model.ManualOfflineSyncData;
import com.bytedance.ee.bear.drive.biz.cache.manual.model.ManualOfflineSyncDeletedTokenData;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6929f;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.C7003b;
import com.bytedance.ee.bear.drive.loader.download.platform.C7078e;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.FileInfoV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.C6990b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback;
import com.bytedance.ee.bear.drive.view.preview.excel.C7271a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public class ManualCacheDownloadManager {

    /* renamed from: a */
    public C6880a f17538a;

    /* renamed from: b */
    public Map<String, String> f17539b = new ConcurrentHashMap();

    /* renamed from: c */
    public Context f17540c;

    /* renamed from: d */
    public C7271a f17541d;

    /* renamed from: e */
    public AbstractC7095c f17542e;

    /* renamed from: f */
    public C7130c f17543f;

    /* renamed from: g */
    public Map<String, String> f17544g = new ConcurrentHashMap();

    /* renamed from: h */
    private Map<String, Disposable> f17545h = new ConcurrentHashMap();

    /* renamed from: i */
    private Map<String, Disposable> f17546i = new ConcurrentHashMap();

    /* renamed from: j */
    private AbstractC7064c<FileInfoV1Puller.Params, C7086a> f17547j;

    /* renamed from: k */
    private IDownloader f17548k;

    /* renamed from: l */
    private AbstractC6927d f17549l;

    /* renamed from: m */
    private C10917c f17550m;

    /* renamed from: n */
    private BinderISendDataCallbackWrapper f17551n;

    /* renamed from: o */
    private volatile boolean f17552o;

    /* renamed from: p */
    private ConnectionService f17553p;

    /* renamed from: q */
    private AbstractC5197b f17554q;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25462a(C7086a aVar) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25481b(Throwable th, String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m25480b(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m25484c(Boolean bool) throws Exception {
    }

    /* renamed from: a */
    public void mo25440a() {
        if (!this.f17552o) {
            this.f17552o = true;
            if (!((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a()) {
                C13479a.m54764b("DRIVE_MANUAL_CACHE", "ignore init because isSuiteFileFeatureEnable=false");
                return;
            }
            m25483c();
            m25488d();
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(new SimpleListDataChangeCallback() {
                /* class com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager.BinderC63371 */

                static /* synthetic */ void lambda$onDelete$0(Boolean bool) throws Exception {
                }

                @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
                public void onDelete(String str) {
                    C13479a.m54775e("DRIVE_MANUAL_CACHE", "BinderListDataChangeCallback delete file");
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(str);
                    ManualCacheDownloadManager.this.f17538a.mo27084a(arrayList).mo238001b($$Lambda$ManualCacheDownloadManager$1$8kbQF4euwm2N8lnDHgsVdU6pBdE.INSTANCE, $$Lambda$ManualCacheDownloadManager$1$aJqXEOugoZprDa8BllWFVcmVWA.INSTANCE);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo25444a(boolean z, String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("module");
            if (!TextUtils.isEmpty(string)) {
                this.f17544g.put(str, string);
            }
        }
        if (!this.f17553p.mo20038b().mo20041b()) {
            m25468a(str, binderIDownloadDriveManualCacheCallback);
        } else {
            m25477a(false, z, str, binderIDownloadDriveManualCacheCallback);
        }
    }

    /* renamed from: a */
    private void m25468a(String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback) {
        String a = C6880a.m27076a(str);
        String a2 = C6313i.m25327a().mo25382a(C8275a.f22375h.mo32553a(), str, null);
        this.f17545h.put(str, AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function(a) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$C23v2JiERsCw4j5gctV0J3P0 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25478b(this.f$1, (String) obj);
            }
        }).mo238020d(new Function<DriveCache, DriveCache>() {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager.C63382 */

            /* renamed from: a */
            public DriveCache apply(DriveCache driveCache) throws Exception {
                if (!driveCache.mo20344j() || driveCache.mo20325b().exists()) {
                    return driveCache;
                }
                C13479a.m54764b("DriveComponent", "fetchManualOfflineFileInOffline() current is wps fileinfo cache, ignore");
                return null;
            }
        }).mo238020d(new Function(binderIDownloadDriveManualCacheCallback, str, a2, a) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$1hutFMLGF50DSS627RQMNV6w2g0 */
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25454a(this.f$1, this.f$2, this.f$3, this.f$4, (DriveCache) obj);
            }
        }).mo238001b(new Consumer(binderIDownloadDriveManualCacheCallback, str, a2) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$IaLwYbFqK6B05pPTYosO3Y2Ql48 */
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25463a((ManualCacheDownloadManager) this.f$1, (BinderIDownloadDriveManualCacheCallback) this.f$2, this.f$3, (String) ((DriveCache) obj));
            }
        }, new Consumer(binderIDownloadDriveManualCacheCallback, str, a2) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$9fSRqLqjz83YlCI0cwfIAdhNApw */
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25466a((ManualCacheDownloadManager) this.f$1, (BinderIDownloadDriveManualCacheCallback) this.f$2, this.f$3, (String) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25466a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, Throwable th) throws Exception {
        C13479a.m54761a("DRIVE_MANUAL_CACHE", th);
        if (binderIDownloadDriveManualCacheCallback != null) {
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, str, str2, (C7086a) null, 0, ""));
        }
    }

    /* renamed from: a */
    private void m25477a(boolean z, boolean z2, String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback) {
        String a = C6313i.m25327a().mo25382a(C8275a.f22375h.mo32553a(), str, null);
        if (!this.f17554q.mo20801b().mo20780e().f14914a) {
            C13479a.m54758a("DRIVE_MANUAL_CACHE", "downloadManualOfflineFileInternal() lean model!!!, ignore downloadManualOfflineFileInternal, callback failed");
            if (binderIDownloadDriveManualCacheCallback != null) {
                binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, str, a, (C7086a) null, 0, "").mo20385c(506));
                return;
            }
            return;
        }
        m25485c(str);
        AtomicReference atomicReference = new AtomicReference();
        this.f17545h.put(str, this.f17547j.mo26542a(new FileInfoV1Puller.Params(str, null, "explorer", null, null, null)).mo238005b(new Consumer(atomicReference) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$1ndHZErhPJvJMLOwS_Wqdy3_8s4 */
            public final /* synthetic */ AtomicReference f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f$0.set((C7086a) obj);
            }
        }).mo237985a(C11678b.m48478b()).mo238005b($$Lambda$ManualCacheDownloadManager$u5x075jaShQgdKY9oOCO_k5TTYI.INSTANCE).mo237988a(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$saH1eNCVS5Oj2ny6JfrBDOTJOWE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25481b((ManualCacheDownloadManager) this.f$1, (String) ((Throwable) obj));
            }
        }).mo238020d(new Function(z2, z, binderIDownloadDriveManualCacheCallback, str, a) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$ppte56stCJeHszV0DThdOhdjQKE */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25455a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (C7086a) obj);
            }
        }).mo238014c(new Function(binderIDownloadDriveManualCacheCallback, str, a) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$nrqfoY0EZIHjlYK1i5BKcrvuVDU */
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25458a(this.f$1, this.f$2, this.f$3, (C7086a) obj);
            }
        }).mo238001b($$Lambda$ManualCacheDownloadManager$DLrR7u1yIT_UQiYcTCxTwDzRZc.INSTANCE, new Consumer(atomicReference, binderIDownloadDriveManualCacheCallback, a, str) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$zROy7Nfb9xynfTklmVFFJKSMH0o */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25476a((ManualCacheDownloadManager) this.f$1, (AtomicReference) this.f$2, (BinderIDownloadDriveManualCacheCallback) this.f$3, this.f$4, (String) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25476a(AtomicReference atomicReference, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, Throwable th) throws Exception {
        if (atomicReference.get() != null) {
            mo25443a(th, binderIDownloadDriveManualCacheCallback, (C7086a) atomicReference.get(), str);
        } else {
            m25472a(th, binderIDownloadDriveManualCacheCallback, str2, str);
        }
    }

    /* renamed from: a */
    public void mo25442a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, AbstractC6949c<C7086a> cVar, String str, String str2) {
        if (binderIDownloadDriveManualCacheCallback != null) {
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, str, str2, cVar.mo27371a(), 0, "wrong streamingUrlCompleted step").mo20385c(505));
        }
    }

    /* renamed from: a */
    public Disposable mo25438a(C7086a aVar, String str, String str2, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, boolean z) {
        return this.f17538a.mo27082a(2, this.f17549l.mo27240a(aVar), aVar.mo27343j(), aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g(), aVar.mo27333d(), this.f17549l.mo27245b(), aVar.mo27322a().f19098q, aVar.mo27322a().mo27358a(), aVar.mo27339f(), aVar.mo27351r(), z, aVar.mo27322a().f18791g).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(binderIDownloadDriveManualCacheCallback, str, str2, aVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$qWRLE0Op_J5Y2flnqc9A_xZiQI */
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ C7086a f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25464a((ManualCacheDownloadManager) this.f$1, (BinderIDownloadDriveManualCacheCallback) this.f$2, this.f$3, (String) this.f$4, (C7086a) ((Boolean) obj));
            }
        }, new Consumer(binderIDownloadDriveManualCacheCallback, str, str2, aVar) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$4pc_afinZB7SA0o43yYPFo1ptpI */
            public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ C7086a f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25465a((ManualCacheDownloadManager) this.f$1, (BinderIDownloadDriveManualCacheCallback) this.f$2, this.f$3, (String) this.f$4, (C7086a) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25465a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, C7086a aVar, Throwable th) throws Exception {
        C13479a.m54761a("DRIVE_MANUAL_CACHE", th);
        if (binderIDownloadDriveManualCacheCallback != null) {
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, str, str2, aVar, 0, "put cache failed1"));
        }
    }

    /* renamed from: a */
    private void m25472a(Throwable th, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2) {
        mo25443a(th, binderIDownloadDriveManualCacheCallback, new C7086a(new C7086a.C7087a("", 0, null, 0, "", false, str, "", "", 0, "", "", "", 0, 0)), str2);
    }

    /* renamed from: a */
    public void mo25443a(Throwable th, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, C7086a aVar, String str) {
        String str2;
        C13479a.m54761a("DRIVE_MANUAL_CACHE", th);
        if (th instanceof DriveException) {
            switch (C63404.f17561a[((DriveException) th).getErrorCode().ordinal()]) {
                case 1:
                    C13479a.m54764b("DRIVE_MANUAL_CACHE", "cb MobileNetworkNotAuthorizationException");
                    if (binderIDownloadDriveManualCacheCallback != null) {
                        binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(1, aVar.mo27322a().f18785a, str, aVar, 0, ""));
                        return;
                    }
                    return;
                case 2:
                    if (binderIDownloadDriveManualCacheCallback != null) {
                        binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, aVar.mo27322a().f18785a, str, aVar, 0, "").mo20385c(507));
                        return;
                    }
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    if (binderIDownloadDriveManualCacheCallback != null) {
                        binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, aVar.mo27322a().f18785a, str, (C7086a) null, 0, "").mo20385c(501));
                        return;
                    }
                    return;
            }
        }
        if (binderIDownloadDriveManualCacheCallback != null) {
            String str3 = aVar.mo27322a().f18785a;
            StringBuilder sb = new StringBuilder();
            sb.append("unexcepted error, ");
            if (th == null) {
                str2 = "";
            } else {
                str2 = th.getMessage();
            }
            sb.append(str2);
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(0, str3, str, (C7086a) null, 0, sb.toString()));
        }
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo25439a(String str) {
        m25485c(str);
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$G46AU9SY7Ks4mQeUi0ZiEFviyDo */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25456a(this.f$1, (String) obj);
            }
        });
    }

    /* renamed from: a */
    public DriveManualCacheStatus mo25437a(int i, String str, String str2, C7086a aVar, int i2, String str3) {
        DriveManualCacheStatus driveManualCacheStatus = new DriveManualCacheStatus();
        driveManualCacheStatus.mo20378a(i);
        driveManualCacheStatus.mo20382b(i2);
        driveManualCacheStatus.mo20380a(str);
        driveManualCacheStatus.mo20387d(str2);
        if (aVar != null) {
            driveManualCacheStatus.mo20380a(aVar.mo27322a().f18785a);
            driveManualCacheStatus.mo20379a(aVar.mo27322a().f18787c);
            driveManualCacheStatus.mo20386c(aVar.mo27322a().mo27364g());
        }
        driveManualCacheStatus.mo20383b(str3);
        return driveManualCacheStatus;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25474a(List list, AbstractC68323g gVar) throws Exception {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "get long time no use manual cache size=" + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gVar.onNext(((DriveCache) it.next()).mo20337g());
        }
        gVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25469a(String str, AbstractC68323g gVar) throws Exception {
        if (gVar.isCancelled()) {
            C13479a.m54764b("DRIVE_MANUAL_CACHE", "emitter cancelled");
            return;
        }
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "start downloadManualOfflineFileInternal in background");
        m25477a(true, false, str, (BinderIDownloadDriveManualCacheCallback) null);
        gVar.onNext(true);
        gVar.onComplete();
    }

    /* renamed from: a */
    public void mo25441a(ManualOfflineSyncDeletedTokenData manualOfflineSyncDeletedTokenData) {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "start handleReceiveDeletedFile");
        AbstractC68307f.m265080a(new AbstractC68324h() {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$mFNq1dzUAxWb3f_rnLENIWebumQ */

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                ManualCacheDownloadManager.m25461a(ManualOfflineSyncDeletedTokenData.this, gVar);
            }
        }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48479c()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$JcoreW1qCJi7dnFGXWGSbBgyIvg */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25487d((String) obj);
            }
        }).mo238001b($$Lambda$ManualCacheDownloadManager$S1rNCnzuH1WdaPFIDuuyAcdqfQ.INSTANCE, $$Lambda$ManualCacheDownloadManager$UORELUPURaY3W6TsbOYusga2DBU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25467a(Boolean bool) throws Exception {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "handleReceiveDeletedFile -> " + bool);
    }

    /* renamed from: c */
    private void m25483c() {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "registerManualCacheDataChangeCallback");
        this.f17550m.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$s4Hm_YkUtqLOK_EMe5ddxjI9tA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25457a((AbstractC5094ag) obj);
            }
        }).mo238001b($$Lambda$ManualCacheDownloadManager$SfsiS2ArLUqSYrbtpVJAogsaA.INSTANCE, $$Lambda$ManualCacheDownloadManager$6QfEGuxuAqDgYuaqXpZz1aGI8GM.INSTANCE);
    }

    /* renamed from: d */
    private void m25488d() {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "checkNoMoreNeedManualOfflineFile start");
        this.f17538a.mo27087b(System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert(10, TimeUnit.DAYS)).mo238014c($$Lambda$ManualCacheDownloadManager$b1B4_rzzXt2Z2jfVqL3U31AstA.INSTANCE).mo238019d(2, TimeUnit.SECONDS).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$lisoKbJinYA79uy1L8FyDUv3RDM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25490e((String) obj);
            }
        }).mo238001b($$Lambda$ManualCacheDownloadManager$OF3N3gtA15Q3ECw1iAFjWS1lwBk.INSTANCE, $$Lambda$ManualCacheDownloadManager$a8RtwpnXgPX_EhW4yFqC04zpAR8.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager$4 */
    public static /* synthetic */ class C63404 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17561a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager.C63404.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo25445b() {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "cancelAllTask() start");
        for (Map.Entry<String, Disposable> entry : this.f17545h.entrySet()) {
            m25485c(entry.getKey());
        }
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "cancelAllTask() end");
    }

    /* access modifiers changed from: private */
    public class BinderISendDataCallbackWrapper extends BinderISendDataCallback.Stub {
        private BinderISendDataCallbackWrapper() {
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5098d
        public void onReceiveData(String str) {
            ManualOfflineSyncDeletedTokenData manualOfflineSyncDeletedTokenData;
            C13479a.m54772d("DRIVE_MANUAL_CACHE", "receive MG data callback: " + str);
            try {
                JSONObject parseObject = JSONObject.parseObject(str);
                String string = parseObject.getString("action");
                if ("offWatchDriveUpdate".equals(string)) {
                    C13479a.m54764b("DRIVE_MANUAL_CACHE", "receive drive offWatchDriveUpdate");
                    ManualOfflineSyncData manualOfflineSyncData = (ManualOfflineSyncData) parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).toJavaObject(ManualOfflineSyncData.class);
                    if (manualOfflineSyncData.getType() != C8275a.f22375h.mo32555b()) {
                        C13479a.m54764b("DRIVE_MANUAL_CACHE", "receive not drive sync data push ignore it");
                        return;
                    }
                    C13479a.m54764b("DRIVE_MANUAL_CACHE", "receive drive sync data push");
                    String channel = manualOfflineSyncData.getData().getChannel();
                    C13479a.m54764b("DRIVE_MANUAL_CACHE", "receive drive channel = " + channel);
                    ManualCacheDownloadManager.this.mo25446b(manualOfflineSyncData.getToken());
                } else if ("offWatchEntityDeleted".equals(string) && (manualOfflineSyncDeletedTokenData = (ManualOfflineSyncDeletedTokenData) parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).toJavaObject(ManualOfflineSyncDeletedTokenData.class)) != null && !C13657b.m55421a(manualOfflineSyncDeletedTokenData.getTokens())) {
                    ManualCacheDownloadManager.this.mo25441a(manualOfflineSyncDeletedTokenData);
                }
            } catch (Exception e) {
                C13479a.m54761a("DRIVE_MANUAL_CACHE", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m25457a(AbstractC5094ag agVar) throws Exception {
        agVar.registSendDataCallback(this.f17551n);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public AbstractC68307f<Boolean> m25487d(String str) {
        return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31515c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m25460a(List list) throws Exception {
        return AbstractC68307f.m265080a(new AbstractC68324h(list) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$iOBCbQTvG6CLFCiSGYM0ASEafs */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                ManualCacheDownloadManager.m25474a(this.f$0, gVar);
            }
        }, BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ AbstractC70020b m25490e(String str) throws Exception {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "check fileinfo " + C13598b.m55197d(str));
        return this.f17547j.mo26542a(new FileInfoV1Puller.Params(str, null, null, null, null, null)).mo237988a(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$yCyLEpW20t2vs9Bnk58do4yYbOo */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ManualCacheDownloadManager.this.m25470a((ManualCacheDownloadManager) this.f$1, (String) ((Throwable) obj));
            }
        });
    }

    /* renamed from: c */
    private void m25485c(String str) {
        if (this.f17539b.get(str) != null) {
            ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19657a(new ArrayList<>(Arrays.asList(this.f17539b.get(str))));
        }
        Disposable disposable = this.f17545h.get(str);
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
        this.f17541d.mo28438a();
    }

    /* renamed from: b */
    public void mo25446b(String str) {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "start handleReceiveSyncFile");
        if (this.f17546i.get(str) != null && !this.f17546i.get(str).isDisposed()) {
            this.f17546i.get(str).dispose();
        }
        this.f17546i.put(str, AbstractC68307f.m265098b(100, TimeUnit.MILLISECONDS).mo238004b(C11678b.m48478b()).mo237985a(C11678b.m48478b()).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$rmg1dSYWomvMsc0U3B4UHvBUnw */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ManualCacheDownloadManager.this.m25459a(this.f$1, (Long) obj);
            }
        }).mo238001b($$Lambda$ManualCacheDownloadManager$P_OV8seNyRWNWUG5lya9c6FI9oM.INSTANCE, $$Lambda$ManualCacheDownloadManager$X7TpRindUSqQ5oGimc5QgIt6FW8.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ DriveCache m25478b(String str, String str2) throws Exception {
        return this.f17538a.mo27076a(str, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m25459a(String str, Long l) throws Exception {
        return AbstractC68307f.m265080a(new AbstractC68324h(str) {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$2q9ZjFZM9KVRez8Gmfigz9jiwI */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                ManualCacheDownloadManager.this.m25469a((ManualCacheDownloadManager) this.f$1, (String) gVar);
            }
        }, BackpressureStrategy.BUFFER);
    }

    public ManualCacheDownloadManager(C10917c cVar, Context context) {
        this.f17550m = cVar;
        C6920b f = C6920b.m27342f();
        this.f17538a = f.mo27170e();
        this.f17549l = f.mo27165a(C6929f.class);
        this.f17553p = C5084ad.m20847d();
        this.f17540c = context;
        this.f17551n = new BinderISendDataCallbackWrapper();
        this.f17554q = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
        this.f17547j = C7058b.m28085a((NetService) KoinJavaComponent.m268610a(NetService.class));
        C6920b.m27342f().mo27167b();
        this.f17543f = C6920b.m27342f().mo27166a();
        this.f17548k = C7078e.m28152a(new C7023a(cVar), new C7003b(this.f17549l), new C6990b(this.f17549l));
        this.f17541d = new C7271a(this.f17538a, cVar, this.f17540c);
        this.f17542e = C6920b.m27342f().mo27169d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m25456a(String str, String str2) throws Exception {
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "start cancelManualOfflineFile, token=" + C13598b.m55197d(str2));
        DriveCache a = this.f17538a.mo27076a(C6880a.m27076a(str), false);
        if (a == null || a.mo20333e() != 2) {
            C13479a.m54775e("DRIVE_MANUAL_CACHE", "cancelManualOfflineFile but get cache null");
        } else {
            C13479a.m54775e("DRIVE_MANUAL_CACHE", "cancelManualOfflineFile convert type to lru");
            this.f17538a.mo27086a(a.mo20319a(), a.mo20333e(), 0);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25461a(ManualOfflineSyncDeletedTokenData manualOfflineSyncDeletedTokenData, AbstractC68323g gVar) throws Exception {
        for (ManualOfflineSyncDeletedTokenData.Token token : manualOfflineSyncDeletedTokenData.getTokens()) {
            if (token.getType() == C8275a.f22375h.mo32555b()) {
                gVar.onNext(token.getToken());
            }
        }
        gVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m25458a(final BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, final String str, final String str2, final C7086a aVar) throws Exception {
        if (binderIDownloadDriveManualCacheCallback != null) {
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(3, str, str2, aVar, 0, ""));
        }
        String str3 = this.f17544g.get(str);
        if (str3 == null) {
            str3 = "";
        }
        this.f17543f.mo27924a(str3, "click_download", aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g());
        return this.f17548k.mo27583d(C7090c.m28237a(aVar), new IDownloader.C7022a<C7086a>() {
            /* class com.bytedance.ee.bear.drive.biz.cache.manual.ManualCacheDownloadManager.C63393 */

            /* renamed from: b */
            private void m25507b(String str) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31509b(arrayList).mo238001b($$Lambda$ManualCacheDownloadManager$3$kytkk38O6F2wGbE8PJaQEFjCwNs.INSTANCE, $$Lambda$ManualCacheDownloadManager$3$2w0YM72kbPuJuy0jGOScNlQvU4.INSTANCE);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: c */
            public void mo25455c(AbstractC6949c<C7086a> cVar) {
                mo25453a((String) null, cVar.mo27371a().mo27322a().f19098q);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m25505a(Integer num) throws Exception {
                C13479a.m54764b("DRIVE_MANUAL_CACHE", "manual cache syncCacheToStatusDoc count=" + num);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25448a(int i) {
                DriveManualCacheStatus a = ManualCacheDownloadManager.this.mo25437a(4, str, str2, aVar, i, "");
                C13479a.m54764b("DRIVE_MANUAL_CACHE", "updateProgress p=" + i);
                BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback = binderIDownloadDriveManualCacheCallback;
                if (binderIDownloadDriveManualCacheCallback != null) {
                    binderIDownloadDriveManualCacheCallback.onStatusChange(a);
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: b */
            public void mo25454b(AbstractC6949c<C7086a> cVar) {
                C13479a.m54758a("DRIVE_MANUAL_CACHE", "receive onStreamingUrlCompleted");
                if (C6892d.m27243b(ManualCacheDownloadManager.this.f17542e, cVar.mo27371a().mo27322a().mo27364g(), cVar.mo27371a().mo27333d())) {
                    ManualCacheDownloadManager.this.f17541d.mo28437a(cVar.mo27371a()).mo238001b(new Consumer(cVar, str, str2, binderIDownloadDriveManualCacheCallback) {
                        /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$3$kdkJc45IqTKK4qaQytkgnEkYyE */
                        public final /* synthetic */ AbstractC6949c f$1;
                        public final /* synthetic */ String f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ManualCacheDownloadManager.C63393.this.m25503a((ManualCacheDownloadManager.C63393) this.f$1, (AbstractC6949c) this.f$2, this.f$3, (String) this.f$4, (BinderIDownloadDriveManualCacheCallback) ((Boolean) obj));
                        }
                    }, new Consumer(binderIDownloadDriveManualCacheCallback, cVar, str, str2) {
                        /* class com.bytedance.ee.bear.drive.biz.cache.manual.$$Lambda$ManualCacheDownloadManager$3$UmJVfrTHhkLt0YAI9YQBYNpIeqc */
                        public final /* synthetic */ BinderIDownloadDriveManualCacheCallback f$1;
                        public final /* synthetic */ AbstractC6949c f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ String f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ManualCacheDownloadManager.C63393.this.m25504a((ManualCacheDownloadManager.C63393) this.f$1, (BinderIDownloadDriveManualCacheCallback) this.f$2, (AbstractC6949c) this.f$3, this.f$4, (String) ((Throwable) obj));
                        }
                    });
                } else {
                    ManualCacheDownloadManager.this.mo25442a(binderIDownloadDriveManualCacheCallback, cVar, str, str2);
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25449a(AbstractC6949c<C7086a> cVar) {
                super.mo25449a(cVar);
                C13479a.m54758a("DRIVE_MANUAL_CACHE", "receive onNoDownloadCompleted");
                ManualCacheDownloadManager.this.mo25442a(binderIDownloadDriveManualCacheCallback, cVar, str, str2);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25450a(DriveException driveException) {
                ManualCacheDownloadManager.this.mo25443a(driveException, binderIDownloadDriveManualCacheCallback, aVar, str2);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25451a(String str) {
                ManualCacheDownloadManager.this.f17539b.put(aVar.mo27322a().f18785a, str);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25452a(String str, int i) {
                C13479a.m54758a("DRIVE_MANUAL_CACHE", "rust onFailed, key=" + str + " code=" + i);
                if (i != 1000) {
                    ManualCacheDownloadManager manualCacheDownloadManager = ManualCacheDownloadManager.this;
                    String str2 = str;
                    String str3 = str2;
                    C7086a aVar = aVar;
                    DriveManualCacheStatus c = manualCacheDownloadManager.mo25437a(0, str2, str3, aVar, 0, "rust return failed, key=" + str + " code=" + i).mo20385c(503);
                    if (i == 1010) {
                        try {
                            c.mo20385c(508);
                        } catch (Throwable th) {
                            C13479a.m54761a("DRIVE_MANUAL_CACHE", th);
                        }
                    } else if (C6880a.m27088b(ManualCacheDownloadManager.this.f17540c).getFreeSpace() < aVar.mo27322a().f18787c) {
                        C13479a.m54758a("DRIVE_MANUAL_CACHE", "user phone space not enough");
                        c.mo20385c(502);
                    }
                    BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback = binderIDownloadDriveManualCacheCallback;
                    if (binderIDownloadDriveManualCacheCallback != null) {
                        binderIDownloadDriveManualCacheCallback.onStatusChange(c);
                    }
                    ManualCacheDownloadManager.this.f17544g.remove(str);
                }
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25453a(String str, String str2) {
                C13479a.m54764b("DRIVE_MANUAL_CACHE", "updateProgress finish, download size=" + aVar.mo27322a().f18787c);
                String str3 = ManualCacheDownloadManager.this.f17544g.get(str);
                if (str3 == null) {
                    str3 = "";
                }
                ManualCacheDownloadManager.this.f17543f.mo27924a(str3, "finish_download", aVar.mo27322a().f18785a, aVar.mo27322a().mo27364g());
                if (!TextUtils.isEmpty(str)) {
                    ManualCacheDownloadManager.this.mo25438a(aVar, str, str2, binderIDownloadDriveManualCacheCallback, false);
                } else {
                    C13479a.m54764b("DRIVE_MANUAL_CACHE", "put cache finished, it alerady cached");
                    BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback = binderIDownloadDriveManualCacheCallback;
                    if (binderIDownloadDriveManualCacheCallback != null) {
                        binderIDownloadDriveManualCacheCallback.onStatusChange(ManualCacheDownloadManager.this.mo25437a(5, str, str2, aVar, 100, ""));
                    }
                    m25507b(aVar.mo27322a().f18785a);
                }
                ManualCacheDownloadManager.this.f17544g.remove(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m25504a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, AbstractC6949c cVar, String str, String str2, Throwable th) throws Exception {
                C13479a.m54759a("DRIVE_MANUAL_CACHE", "excel to html onServerTransform failed", th);
                ManualCacheDownloadManager.this.mo25442a(binderIDownloadDriveManualCacheCallback, cVar, str, str2);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m25503a(AbstractC6949c cVar, String str, String str2, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, Boolean bool) throws Exception {
                ManualCacheDownloadManager.this.mo25438a((C7086a) cVar.mo27371a(), str, str2, binderIDownloadDriveManualCacheCallback, true);
                m25507b(str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25463a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, DriveCache driveCache) throws Exception {
        if (binderIDownloadDriveManualCacheCallback != null) {
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(5, str, str2, (C7086a) null, 100, ""));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ DriveCache m25454a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, String str3, DriveCache driveCache) throws Exception {
        if (binderIDownloadDriveManualCacheCallback != null) {
            C7086a a = C6880a.m27066a(str, driveCache, "");
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(2, str, str2, a, 0, ""));
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(4, str, str2, a, 0, ""));
        }
        if (driveCache.mo20333e() != 2) {
            this.f17538a.mo27086a(str3, driveCache.mo20333e(), 2);
        }
        return driveCache;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25464a(BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, C7086a aVar, Boolean bool) throws Exception {
        int i;
        String str3;
        C13479a.m54764b("DRIVE_MANUAL_CACHE", "put cache finished");
        if (binderIDownloadDriveManualCacheCallback != null) {
            if (bool.booleanValue()) {
                i = 5;
            } else {
                i = 0;
            }
            if (bool.booleanValue()) {
                str3 = "";
            } else {
                str3 = "put cache failed0";
            }
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(i, str, str2, aVar, 100, str3));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C7086a m25455a(boolean z, boolean z2, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, String str, String str2, C7086a aVar) throws Exception {
        if (this.f17549l.mo27244a(this.f17538a, C7090c.m28237a(aVar))) {
            if (z) {
                throw new DriveException(ErrCode.MOBILE_NETWORK_NOT_AUTHORIZATION, aVar);
            } else if (z2) {
                throw new DriveException(ErrCode.MANUAL_CACHE_NEED_WIFI, aVar);
            } else if (binderIDownloadDriveManualCacheCallback != null) {
                binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(2, str, str2, aVar, 0, ""));
            }
        } else if (binderIDownloadDriveManualCacheCallback != null) {
            binderIDownloadDriveManualCacheCallback.onStatusChange(mo25437a(2, str, str2, aVar, 0, ""));
        }
        return aVar;
    }
}

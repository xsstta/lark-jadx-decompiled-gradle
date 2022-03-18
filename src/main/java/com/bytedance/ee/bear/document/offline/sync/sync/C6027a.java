package com.bytedance.ee.bear.document.offline.sync.sync;

import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.apm.util.C3130n;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineDocsPriority;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.sync.OfflineDbConfig;
import com.bytedance.ee.bear.document.offline.sync.sync.C6027a;
import com.bytedance.ee.bear.document.reloadwebview.C6083a;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.C10959f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.sync.a */
public class C6027a implements AbstractC6033d {

    /* renamed from: h */
    private static OfflineDbConfig f16875h = new OfflineDbConfig();

    /* renamed from: i */
    private static volatile C6027a f16876i;

    /* renamed from: a */
    public volatile boolean f16877a;

    /* renamed from: b */
    public Handler f16878b;

    /* renamed from: c */
    public List<OfflineDoc> f16879c = Collections.synchronizedList(new LinkedList());

    /* renamed from: d */
    public LiveData<List<String>> f16880d;

    /* renamed from: e */
    public final List<String> f16881e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public boolean f16882f;

    /* renamed from: g */
    public AbstractC1178x<List<String>> f16883g = new AbstractC1178x<List<String>>() {
        /* class com.bytedance.ee.bear.document.offline.sync.sync.C6027a.C60281 */

        /* renamed from: a */
        public void onChanged(List<String> list) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238001b(new Consumer(list) {
                /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$1$Y6UGi9dJGkTwsLU_tGrwDhqYOc */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6027a.C60281.this.m24470a(this.f$1, (Boolean) obj);
                }
            }, $$Lambda$a$1$VRX6FJHyIPWkbBVNxJAm7DlcUA.INSTANCE);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m24470a(List list, Boolean bool) throws Exception {
            if (list != null) {
                ArrayList arrayList = null;
                if (C6027a.this.f16881e.size() > 0) {
                    arrayList = new ArrayList();
                    arrayList.addAll(C6027a.this.f16881e);
                    arrayList.removeAll(list);
                }
                C6027a.this.f16881e.clear();
                C6027a.this.f16881e.addAll(list);
                if (arrayList != null && arrayList.size() > 0) {
                    C6027a.this.mo24360d(arrayList);
                }
                if (C6027a.this.f16881e.size() <= 0) {
                    C6027a.this.f16878b.removeMessages(2);
                } else if (!C6027a.this.f16878b.hasMessages(2)) {
                    C13479a.m54772d("SyncOfflineDataManager", "list got valid need sync tokens, try trigger retry");
                    C6027a.this.f16878b.sendEmptyMessageDelayed(2, 60000);
                }
            }
            C6027a aVar = C6027a.this;
            aVar.mo24358c(aVar.f16881e);
        }
    };

    /* renamed from: j */
    private C10917c f16884j;

    /* renamed from: k */
    private Context f16885k;

    /* renamed from: l */
    private final OfflineDoc f16886l;

    /* renamed from: m */
    private OfflineDoc f16887m;

    /* renamed from: n */
    private Handler f16888n = new Handler(Looper.getMainLooper());

    /* renamed from: o */
    private C6031b f16889o = new C6031b();

    /* renamed from: p */
    private int f16890p;

    /* renamed from: q */
    private final C10959f<BinderUnSyncDocumentsCallback> f16891q = new C10959f<>();

    /* renamed from: r */
    private final C10959f<BinderBackgroundSyncDocumentsCallback> f16892r = new C10959f<>();

    /* renamed from: s */
    private ConnectionService f16893s;

    /* renamed from: t */
    private an f16894t;

    /* renamed from: u */
    private AbstractC5233x f16895u;

    /* renamed from: v */
    private LiveData<ConnectionService.NetworkState> f16896v;

    /* renamed from: w */
    private AbstractC1178x<ConnectionService.NetworkState> f16897w = new AbstractC1178x<ConnectionService.NetworkState>() {
        /* class com.bytedance.ee.bear.document.offline.sync.sync.C6027a.C60303 */

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            C13479a.m54772d("SyncOfflineDataManager", "network changed!");
            C6027a.this.f16882f = networkState.mo20041b();
            C6027a.this.mo24363g();
        }
    };

    /* renamed from: x */
    private Runnable f16898x = new Runnable() {
        /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$wXldyIXR0pbll54OWA6NpNdO4 */

        public final void run() {
            C6027a.this.m24443n();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24419b(String str) throws Exception {
    }

    /* renamed from: h */
    public void mo24364h() {
        this.f16877a = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ List m24444o() throws Exception {
        return this.f16879c;
    }

    /* renamed from: a */
    public void mo24345a(Context context, C10917c cVar) {
        this.f16885k = context;
        this.f16884j = cVar;
        ConnectionService d = C5084ad.m20847d();
        this.f16893s = d;
        this.f16896v = d.mo20037a();
        this.f16895u = C5234y.m21391b();
        this.f16878b = new Handler(CoreThreadPool.getBackgroundHandler().getLooper()) {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.C6027a.HandlerC60292 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m24472a() {
                C6083a.m24591a().mo24582b();
            }

            public void handleMessage(Message message) {
                if (message.what != 1 || C6027a.this.f16877a) {
                    if (message.what == 2) {
                        C13479a.m54764b("SyncOfflineDataManager", "MSG_RETRY  mUploadOfflineDocList: " + C6027a.this.f16879c.size() + "   mNeedSyncTokens: " + C6027a.this.f16881e.size());
                        if (C6027a.this.f16881e.size() > 0) {
                            C6027a.this.mo24363g();
                        }
                    }
                } else if (!C6027a.this.f16882f || C6027a.this.f16879c.isEmpty() || !C5102ai.m20872j().mo20212d()) {
                    C13748k.m55732a($$Lambda$a$2$51Uh2jQ90NUhv6aVR25XL9uJruM.INSTANCE);
                    C13479a.m54764b("SyncOfflineDataManager", "MSG_HANDLE_SYNC_DOC  size: " + C6027a.this.f16879c.size() + "   appIsVisible: " + C5102ai.m20872j().mo20212d() + "   mIsConnected: " + C6027a.this.f16882f);
                } else {
                    try {
                        C6027a aVar = C6027a.this;
                        aVar.mo24348a(aVar.f16879c.get(0));
                    } catch (Exception e) {
                        C6027a.this.mo24364h();
                        C13479a.m54761a("SyncOfflineDataManager", e);
                    }
                }
                super.handleMessage(message);
            }
        };
        an anVar = (an) KoinJavaComponent.m268610a(an.class);
        this.f16894t = anVar;
        anVar.mo16399a(new SyncOfflineDataManager$3(this));
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$SRSFS6RInb1cVmxA4QZjPP89D2s */

            public final void run() {
                C6027a.this.m24445p();
            }
        });
        OfflineDbConfig offlineDbConfig = (OfflineDbConfig) C4211a.m17514a().mo16532a("offline_db_config", OfflineDbConfig.class, new OfflineDbConfig());
        if (offlineDbConfig != null && offlineDbConfig.offline_db_size > 0) {
            f16875h = offlineDbConfig;
            C13479a.m54764b("SyncOfflineDataManager", "OfflineDbConfig " + f16875h);
        }
    }

    /* renamed from: a */
    public void mo24350a(String str) {
        C5955d.m24025b().mo24088b(str).mo238001b($$Lambda$a$MGQ6oXAq8b1xVcMrInaUlQkxfU.INSTANCE, $$Lambda$a$tpK582MSsxhixJ527hRbwUZCu0.INSTANCE);
    }

    /* renamed from: a */
    public void mo24351a(List<String> list) {
        C5955d.m24025b().mo24079a(list).mo238001b($$Lambda$a$P0SkRCQxw2xjO1auiV0DYuSivv8.INSTANCE, $$Lambda$a$Ohwju2Rs_tjlfnFcQkYzsO5zG1g.INSTANCE);
    }

    /* renamed from: a */
    public void mo24347a(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
        this.f16891q.mo41595a(binderUnSyncDocumentsCallback);
        LiveData<List<String>> liveData = this.f16880d;
        if (liveData != null) {
            binderUnSyncDocumentsCallback.onChange(liveData.mo5927b());
        }
    }

    /* renamed from: a */
    public void mo24346a(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
        this.f16892r.mo41595a(binderBackgroundSyncDocumentsCallback);
    }

    /* renamed from: a */
    public AbstractC68307f<Long> mo24344a(long j) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(j) {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$X8Uz98OGpT9YggMq8TitIEIq_fs */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6027a.this.m24405a(this.f$1, (String) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$a$tRsIafB3B5yRa7gGMRPfrSzgQg.INSTANCE);
    }

    /* renamed from: b */
    public void mo24356b(List<OfflineDoc> list) {
        C13479a.m54764b("SyncOfflineDataManager", "uploadDocs... raw docList size: " + list.size());
        AbstractC68307f.m265081a((Iterable) list).mo238004b(C11678b.m48480d()).mo237998a((AbstractC68322n) new AbstractC68322n() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$qVEy0w4z4BwkRYdq3x5_97OuMUk */

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C6027a.this.m24429d((OfflineDoc) obj);
            }
        }).mo237977a(new Callable() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$kvoAboAvlGOTKE3MeG37WDhbrKc */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6027a.this.m24444o();
            }
        }, new AbstractC68310b() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$fJ4xmh2bqqrzebrYROms65CleDA */

            @Override // io.reactivex.functions.AbstractC68310b
            public final void accept(Object obj, Object obj2) {
                C6027a.this.m24413a((C6027a) ((List) obj), (List) ((OfflineDoc) obj2));
            }
        }).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$lO6rcmJqFeeaDEIWTTa7KXhZqBk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6027a.this.m24431e((C6027a) ((List) obj));
            }
        }, $$Lambda$a$eMLE0veae7mSqy7LMvCvQy1c8_8.INSTANCE);
    }

    /* renamed from: a */
    public void mo24348a(OfflineDoc offlineDoc) {
        if (offlineDoc != null) {
            if (TextUtils.equals(C5890a.m23707b(), offlineDoc.getObj_token())) {
                C13479a.m54775e("SyncOfflineDataManager", "beginSync() equals with foreground webview mCurrentToken " + C13598b.m55197d(offlineDoc.getObj_token()));
                this.f16889o.mo24370a(this.f16884j, offlineDoc.getObj_token());
                m24423c(offlineDoc);
                m24442m();
            } else if (!this.f16881e.contains(offlineDoc.getObj_token())) {
                C13479a.m54775e("SyncOfflineDataManager", "beginSync() mNeedSyncTokens not contain mCurrentToken " + C13598b.m55197d(offlineDoc.getObj_token()));
                m24423c(offlineDoc);
                m24442m();
            } else {
                C3130n<Boolean, Integer> a = this.f16889o.mo24369a(this.f16884j, offlineDoc);
                if (!a.f10052a.booleanValue()) {
                    C13479a.m54775e("SyncOfflineDataManager", "beginSync() retry recorder rejects :" + C13598b.m55197d(offlineDoc.getObj_token()));
                    m24423c(offlineDoc);
                    m24442m();
                    return;
                }
                this.f16877a = true;
                this.f16887m = offlineDoc;
                m24404a(offlineDoc, a).mo238001b($$Lambda$a$kfbhnWDYv47RGkB44QhrbKltzBk.INSTANCE, $$Lambda$a$qGIjr6mW7VG1lKNrq7e6YEBQ.INSTANCE);
            }
        }
    }

    /* renamed from: b */
    public void mo24355b(OfflineDoc offlineDoc) {
        this.f16887m.setObj_token(offlineDoc.getObj_token());
        this.f16887m.setFakeToken(offlineDoc.getFakeToken());
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.sync.AbstractC6033d
    /* renamed from: a */
    public void mo24349a(SyncStatusModel syncStatusModel) {
        if (syncStatusModel == null) {
            C13479a.m54772d("SyncOfflineDataManager", "sync status data is empty -- ignore");
        } else if (TextUtils.equals(syncStatusModel.objToken, this.f16887m.getObj_token()) || syncStatusModel.status != 0) {
            C3130n<Boolean, Integer> a = this.f16889o.mo24369a(this.f16884j, this.f16887m);
            C13479a.m54764b("SyncOfflineDataManager", "notifySyncStatus    FEdata.status: " + syncStatusModel.status + "    FEdata.objToken: " + C13598b.m55198e(syncStatusModel.objToken) + "    mCurrentOpenDoc.token: " + C13598b.m55198e(this.f16887m.getObj_token()) + "    mRetryTime: " + ((Object) a.f10053b));
            if (syncStatusModel.status == 0) {
                m24408a(a);
            } else if (syncStatusModel.status == 1) {
                m24415b(a);
            } else if (syncStatusModel.status != 2 && syncStatusModel.status == 3) {
                m24407a(2);
            }
        } else {
            this.f16889o.mo24370a(this.f16884j, syncStatusModel.objToken);
        }
    }

    /* renamed from: k */
    private void m24439k() {
        m24441l();
        mo24364h();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m24446q() {
        this.f16896v.mo5925a(this.f16897w);
    }

    /* renamed from: j */
    private void m24437j() {
        mo24361e().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$8a16AMnps96VNE2h4P7AxVWbMhI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6027a.this.m24410a((C6027a) ((Long) obj));
            }
        }, $$Lambda$a$WweeiM8A4HvOxEUZAcLCiakWQ0.INSTANCE);
    }

    /* renamed from: l */
    private void m24441l() {
        OfflineDoc offlineDoc = this.f16887m;
        this.f16887m = this.f16886l;
        this.f16879c.remove(offlineDoc);
    }

    /* renamed from: m */
    private void m24442m() {
        Handler handler = this.f16878b;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    public AbstractC68307f<Long> mo24361e() {
        return mo24344a(0L);
    }

    /* renamed from: a */
    public static C6027a m24403a() {
        if (f16876i == null) {
            synchronized (C6027a.class) {
                if (f16876i == null) {
                    f16876i = new C6027a();
                }
            }
        }
        return f16876i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m24445p() {
        C5102ai.m20872j().mo20215g().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$WAwsy3CBrxc2kZ3f9t1gnKSL7uU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C6027a.this.m24424c((C6027a) ((Boolean) obj));
            }
        });
    }

    /* renamed from: d */
    public void mo24359d() {
        if (this.f16885k == null) {
            C13479a.m54758a("SyncOfflineDataManager", "clearData: mBaseApplication == null ");
            return;
        }
        this.f16887m = this.f16886l;
        mo24364h();
        this.f16879c.clear();
        this.f16881e.clear();
    }

    /* renamed from: f */
    public AbstractC68307f<Boolean> mo24362f() {
        return C5955d.m24025b().mo24102f().mo237988a($$Lambda$a$Ledwz6JagFzDXqapN445UA3Q.INSTANCE);
    }

    /* renamed from: g */
    public void mo24363g() {
        if (this.f16882f) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d($$Lambda$a$y7VeBq5oei_9AAZ9cd2JmsUWp1Y.INSTANCE).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$WGXVTlWbngsDQXZ3DBCerLpk1kk */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6027a.this.m24433f((C6027a) ((List) obj));
                }
            }, $$Lambda$a$3quR_FbLzw625dAOQwoRKwku3VA.INSTANCE);
        }
    }

    /* renamed from: i */
    public boolean mo24365i() {
        boolean isEmpty = this.f16879c.isEmpty();
        if (!isEmpty) {
            C13479a.m54764b("SyncOfflineDataManager", "hasSyncTask(): " + this.f16879c.size());
        }
        return !isEmpty;
    }

    private C6027a() {
        OfflineDoc offlineDoc = new OfflineDoc();
        this.f16886l = offlineDoc;
        this.f16887m = offlineDoc;
        mo24345a(C13615c.f35773a, new C10917c(new C10929e()));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m24443n() {
        C3130n<Boolean, Integer> a = this.f16889o.mo24369a(this.f16884j, this.f16887m);
        C13479a.m54758a("SyncOfflineDataManager", "time out : " + C13598b.m55198e(this.f16887m.getObj_token()) + " retryTimes : " + ((Object) a.f10053b));
        C6032c.m24484a(this.f16895u, this.f16887m, a.f10053b.intValue(), 2);
        if (a.f10052a.booleanValue()) {
            C13479a.m54758a("SyncOfflineDataManager", "time out : " + C13598b.m55198e(this.f16887m.getObj_token()) + " able to retry");
            this.f16889o.mo24371b(this.f16884j, this.f16887m);
            m24407a(1);
        } else {
            C13479a.m54758a("SyncOfflineDataManager", "time out : " + C13598b.m55198e(this.f16887m.getObj_token()) + " retry recorder rejects, mark failed");
            m24407a(4);
        }
        m24439k();
        m24442m();
        if (!this.f16878b.hasMessages(2)) {
            this.f16878b.sendEmptyMessageDelayed(2, 60000);
        }
    }

    /* renamed from: c */
    public List<String> mo24357c() {
        return C5955d.m24025b().mo24092c();
    }

    /* renamed from: b */
    public void mo24352b() {
        if (this.f16885k == null) {
            C13479a.m54758a("SyncOfflineDataManager", "onCreate: mBaseApplication == null ");
            return;
        }
        mo24364h();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$lfhxFl8uhRElvcfxeClyDYmFUo */

            public final void run() {
                C6027a.this.m24446q();
            }
        });
        m24437j();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m24431e(List list) throws Exception {
        m24442m();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24422c(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) throws Exception {
        binderBackgroundSyncDocumentsCallback.onChange(this.f16887m);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m24406a(Boolean bool) throws Exception {
        return C5955d.m24025b().mo24100e();
    }

    /* renamed from: c */
    private void m24423c(OfflineDoc offlineDoc) {
        this.f16879c.remove(offlineDoc);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m24429d(OfflineDoc offlineDoc) throws Exception {
        return !this.f16879c.contains(offlineDoc);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m24433f(List list) throws Exception {
        if (list != null && list.size() > 0) {
            mo24356b(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24416b(Boolean bool) throws Exception {
        C13479a.m54764b("SyncOfflineDataManager", "startVacuum ret: " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24424c(Boolean bool) {
        if (bool == Boolean.TRUE) {
            C13479a.m54772d("SyncOfflineDataManager", "goes to foreground");
            m24442m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24417b(Integer num) throws Exception {
        C13479a.m54764b("SyncOfflineDataManager", "deleteResourceDataByDocToken token  =  ret : " + num);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m24425c(Long l) throws Exception {
        C13479a.m54764b("SyncOfflineDataManager", "deleteResourceDataByAccessTime token  ret: " + l);
    }

    /* renamed from: d */
    public void mo24360d(List<String> list) {
        this.f16891q.mo41596a(new C10959f.AbstractC10961b(list) {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$wvlKSREkTTVIAWuHfth0WZr0dLE */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                ((BinderUnSyncDocumentsCallback) iInterface).onRemove(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24418b(Long l) throws Exception {
        C13479a.m54764b("SyncOfflineDataManager", "deleteFileModelByLastModified ret: " + l);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m24426c(Throwable th) throws Exception {
        C13479a.m54758a("SyncOfflineDataManager", "loadDocFromDbAndSync throwable= " + th);
    }

    /* renamed from: a */
    private void m24407a(int i) {
        C13479a.m54764b("SyncOfflineDataManager", "notifySyncStateChanged... status = " + i);
        OfflineDoc offlineDoc = this.f16887m;
        if (offlineDoc == this.f16886l) {
            C13479a.m54764b("SyncOfflineDataManager", "notifySyncStateChanged: mCurrentOpenDoc == EMPTY_OFFLINE_DOC");
            return;
        }
        offlineDoc.setSyncState(i);
        this.f16892r.mo41596a(new C10959f.AbstractC10961b() {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$nt_4sW2kixP7fziZ2AjamH4w2YM */

            @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
            public final void notify(IInterface iInterface) {
                C6027a.this.m24422c((C6027a) ((BinderBackgroundSyncDocumentsCallback) iInterface));
            }
        });
    }

    /* renamed from: a */
    private void m24408a(C3130n<Boolean, Integer> nVar) {
        C6032c.m24484a(this.f16895u, this.f16887m, nVar.f10053b.intValue(), 0);
        this.f16889o.mo24370a(this.f16884j, this.f16887m.getObj_token());
        this.f16888n.removeCallbacks(this.f16898x);
        m24407a(3);
        m24439k();
        m24442m();
    }

    /* renamed from: b */
    private void m24415b(C3130n<Boolean, Integer> nVar) {
        C6032c.m24484a(this.f16895u, this.f16887m, nVar.f10053b.intValue(), 1);
        this.f16888n.removeCallbacks(this.f16898x);
        if (nVar.f10052a.booleanValue()) {
            C13479a.m54772d("SyncOfflineDataManager", "doc :" + C13598b.m55198e(this.f16887m.getObj_token()) + " able to retry");
            this.f16889o.mo24371b(this.f16884j, this.f16887m);
            m24407a(1);
        } else {
            C13479a.m54772d("SyncOfflineDataManager", "doc :" + C13598b.m55198e(this.f16887m.getObj_token()) + " exceed retry limit, mark failed");
            m24407a(4);
        }
        m24439k();
        m24442m();
        if (!this.f16878b.hasMessages(2)) {
            this.f16878b.sendEmptyMessageDelayed(2, 60000);
        }
    }

    /* renamed from: c */
    public void mo24358c(List<String> list) {
        if (list != null && !list.isEmpty()) {
            C13479a.m54764b("SyncOfflineDataManager", "notifyNeedSyncListChanged... tokenList size = " + list.size());
            this.f16890p = list.size();
            this.f16891q.mo41596a(new C10959f.AbstractC10961b(list) {
                /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$m1AXtku6D7YELuiuL0RO_PAuzGo */
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
                public final void notify(IInterface iInterface) {
                    ((BinderUnSyncDocumentsCallback) iInterface).onChange(this.f$0);
                }
            });
        } else if (this.f16890p > 0) {
            C13479a.m54764b("SyncOfflineDataManager", "notifyNeedSyncListChanged... tokenList size changed from : " + this.f16890p + "to 0");
            this.f16890p = 0;
            this.f16891q.mo41596a(new C10959f.AbstractC10961b(list) {
                /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$C0HmPYsApqSMG0S4r2wjmhmDg0 */
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
                public final void notify(IInterface iInterface) {
                    ((BinderUnSyncDocumentsCallback) iInterface).onChange(this.f$0);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24409a(Integer num) throws Exception {
        C13479a.m54764b("SyncOfflineDataManager", "deleteResourceDataByDocTokenList token  =  ret : " + num);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24410a(Long l) throws Exception {
        List<String> c = C5955d.m24025b().mo24092c();
        C5955d.m24025b().mo24107i();
        HashMap hashMap = new HashMap();
        hashMap.put("number", Integer.valueOf(c.size()));
        hashMap.put("db_size", Integer.valueOf((int) (l.longValue() / 1024)));
        this.f16895u.mo21079a("docs_offlinedb_info", hashMap);
        C13479a.m54764b("SyncOfflineDataManager", " checkDbSize   dbSize = " + l + "  itemSize = " + c.size());
        if (l.longValue() > f16875h.offline_db_size && ((long) c.size()) >= f16875h.offline_db_item_count) {
            C5955d.m24025b().mo24076a(100).mo238001b($$Lambda$a$RQAkSPwWN8eSPgGiNFucaUJbFnI.INSTANCE, $$Lambda$a$G6hnzx2Pu4z6FntJIWTzqtqH1m8.INSTANCE);
        }
        if (l.longValue() > f16875h.offline_db_size && ((long) c.size()) >= f16875h.offline_db_item_count) {
            C5955d.m24025b().mo24087b(100).mo238001b($$Lambda$a$uVubokbb4kMY4HY3H2Wwml2JII.INSTANCE, $$Lambda$a$F48fpjxSom7_v_xfiSzBcMd1LAk.INSTANCE);
        }
        if (l.longValue() > f16875h.offline_db_size && ((long) c.size()) < f16875h.offline_db_item_count / 2) {
            C5955d.m24025b().mo24108j().mo238001b($$Lambda$a$s2LCYbIGm_dKTXxmLIAeDtRRQqI.INSTANCE, $$Lambda$a$O3_WethyE0XHUCWrrqPiGy0pYO8.INSTANCE);
        }
    }

    /* renamed from: b */
    public void mo24353b(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
        this.f16892r.mo41597b(binderBackgroundSyncDocumentsCallback);
    }

    /* renamed from: b */
    public void mo24354b(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
        this.f16891q.mo41597b(binderUnSyncDocumentsCallback);
    }

    /* renamed from: a */
    private AbstractC68307f<String> m24404a(OfflineDoc offlineDoc, C3130n<Boolean, Integer> nVar) {
        return ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40246a(new Function0(offlineDoc, nVar) {
            /* class com.bytedance.ee.bear.document.offline.sync.sync.$$Lambda$a$F8KDC6op15v8hgOVij4F1yRIAo */
            public final /* synthetic */ OfflineDoc f$1;
            public final /* synthetic */ C3130n f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6027a.this.m24414b(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Long m24405a(long j, String str) throws Exception {
        long d = C13675f.m55525d(this.f16885k.getDatabasePath(DBController.m55314a().mo50585a(this.f16885k, "offlineData.db")).getAbsolutePath());
        C13479a.m54764b("SyncOfflineDataManager", "getDbSizeByLimit db size : " + d);
        long b = C5955d.m24025b().mo24085b(this.f16885k);
        C13479a.m54764b("SyncOfflineDataManager", "getDbSizeByLimit file size : " + b);
        long j2 = d + b;
        if (j2 < j) {
            j2 = 0;
        }
        return Long.valueOf(j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC68307f m24414b(OfflineDoc offlineDoc, C3130n nVar) {
        C13479a.m54764b("SyncOfflineDataManager", "beginSync startLoad(): " + C13598b.m55198e(offlineDoc.getObj_token()) + "in thread : " + Thread.currentThread());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operation", (Object) "beginSync");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("token", (Object) offlineDoc.getObj_token());
        jSONObject2.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(offlineDoc.getType()));
        jSONObject.put("body", (Object) jSONObject2);
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40259b(jSONObject.toJSONString());
        C6032c.m24483a(this.f16895u, offlineDoc, nVar.f10053b.intValue());
        this.f16888n.removeCallbacks(this.f16898x);
        this.f16888n.postDelayed(this.f16898x, 600000);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24413a(List list, OfflineDoc offlineDoc) throws Exception {
        if (offlineDoc.getPriority() == OfflineDocsPriority.High_Priority.ordinal()) {
            this.f16879c.add(0, offlineDoc);
        } else {
            this.f16879c.add(offlineDoc);
        }
        C13479a.m54764b("SyncOfflineDataManager", "uploadDocs... after filtering mUploadOfflineDocList size: " + this.f16879c.size());
    }
}

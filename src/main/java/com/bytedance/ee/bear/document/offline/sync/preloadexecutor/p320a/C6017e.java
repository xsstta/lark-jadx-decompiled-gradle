package com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.apm.util.C3130n;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.p315b.C5893b;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6020b;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockModel;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13674e;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a.e */
public class C6017e extends C6020b implements C5893b.AbstractC5899c {

    /* renamed from: o */
    private static CountDownLatch f16842o = new CountDownLatch(1);

    /* renamed from: p */
    private static CountDownLatch f16843p = new CountDownLatch(1);

    /* renamed from: a */
    public final BlockingQueue<AbstractC6015c> f16844a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final BlockingQueue<String> f16845b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final BlockingQueue<AbstractC6015c> f16846c = new LinkedBlockingQueue();

    /* renamed from: f */
    private Set<String> f16847f = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: g */
    private C6016d f16848g = new C6016d();

    /* renamed from: h */
    private RunnableC6019a f16849h;

    /* renamed from: i */
    private HandlerThread f16850i;

    /* renamed from: j */
    private Handler f16851j;

    /* renamed from: k */
    private ConnectionService f16852k = C5084ad.m20847d();

    /* renamed from: l */
    private AccountService.Account f16853l;

    /* renamed from: m */
    private boolean f16854m;

    /* renamed from: n */
    private boolean f16855n;

    /* renamed from: b */
    public static HandlerThread m24365b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.bytedance.ee.bear.document.offline.p315b.C5893b.AbstractC5899c
    /* renamed from: a */
    public void mo20417a(String str) {
        C13479a.m54764b("PreloadImageExecutor-ImgCb", "onDownloadStart(): url = " + C13598b.m55197d(str));
        Set<String> set = this.f16847f;
        if (set != null) {
            set.add(str);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.p315b.C5893b.AbstractC5899c
    /* renamed from: a */
    public void mo20419a(String str, String str2, int i) {
        Set<String> set = this.f16847f;
        if (set != null && set.contains(str)) {
            this.f16847f.remove(str);
        }
        if (!this.f16852k.mo20038b().mo20041b()) {
            this.f16845b.add(str);
        } else {
            C6013a a = this.f16848g.mo24312a(str, false);
            if (a != null) {
                m24366b(a);
            }
        }
        C13479a.m54758a("PreloadImageExecutor-ImgCb", "onDownloadFail(): url = " + C13598b.m55197d(str) + ",errorCode = " + i);
    }

    @Override // com.bytedance.ee.bear.document.offline.p315b.C5893b.AbstractC5899c
    /* renamed from: a */
    public void mo20418a(String str, C5893b.C5896a aVar) {
        C13479a.m54772d("PreloadImageExecutor-ImgCb", "onDownloadSuccess(): url " + C13598b.m55197d(str));
        C6013a a = this.f16848g.mo24312a(str, true);
        if (a != null) {
            m24366b(a);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6020b
    /* renamed from: a */
    public void mo24249a() {
        this.f16849h = new RunnableC6019a();
        m24368c();
    }

    /* renamed from: c */
    private void m24368c() {
        HandlerThread b = m24365b("Docs_Image_Preload");
        this.f16850i = b;
        b.start();
        Handler handler = new Handler(this.f16850i.getLooper());
        this.f16851j = handler;
        handler.post(this.f16849h);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a.e$a */
    public class RunnableC6019a implements Runnable {
        public void run() {
            while (true) {
                try {
                    C6017e.this.mo24321d();
                    C6017e eVar = C6017e.this;
                    eVar.mo24318a(eVar.f16844a.take());
                } catch (Exception e) {
                    C13479a.m54758a("PreloadImageExecutor", "Consumer  e: " + e);
                }
            }
        }

        private RunnableC6019a() {
        }
    }

    /* renamed from: b */
    public void mo24319b() {
        C13479a.m54764b("PreloadImageExecutor", "clearData()...");
        this.f16844a.clear();
        this.f16846c.clear();
        this.f16847f.clear();
        this.f16848g.mo24313a();
    }

    /* renamed from: a */
    public void mo24315a(AccountService.Account account) {
        this.f16853l = account;
    }

    /* renamed from: b */
    private void m24366b(C6013a aVar) {
        if (aVar != null) {
            C6014b bVar = new C6014b(aVar.mo24301c(), aVar.mo24302d(), aVar.mo24300b());
            try {
                BlockingQueue<AbstractC6015c> blockingQueue = this.f16844a;
                if (blockingQueue != null) {
                    blockingQueue.put(bVar);
                }
            } catch (Exception e) {
                C13479a.m54759a("PreloadImageExecutor", "pushResultUpdateJob... err happens : ", e);
            }
        }
    }

    /* renamed from: a */
    public void mo24316a(ConnectionService.NetworkState networkState) {
        if (networkState != null && networkState.mo20041b()) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238001b(new Consumer(networkState) {
                /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a.$$Lambda$e$_KinGgZR0ZrxIli2CvfWxv0XHQs */
                public final /* synthetic */ ConnectionService.NetworkState f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6017e.this.m24359a((C6017e) this.f$1, (ConnectionService.NetworkState) ((Boolean) obj));
                }
            }, $$Lambda$e$A_MF92pwAPZnJNG30CdNDu4NRI.INSTANCE);
        }
    }

    /* renamed from: c */
    private void m24369c(C6013a aVar) {
        C13479a.m54764b("PreloadImageExecutor", "doImgBatchDownload... in thread : " + Thread.currentThread().getName());
        if (aVar == null || aVar.mo24303e().isEmpty()) {
            C13479a.m54764b("PreloadImageExecutor", "no imgs for this batch");
            return;
        }
        C3130n<List<SubBlockModel>, List<SubBlockModel>> d = m24370d(aVar);
        if (d == null || d.f10052a == null || d.f10053b == null) {
            C13479a.m54758a("PreloadImageExecutor", "img slicing failed");
            return;
        }
        C13479a.m54764b("PreloadImageExecutor", "doImgBatchDownload... netimg-size:" + d.f10052a.size() + " driveimg-size:" + d.f10053b.size() + "in thread : " + Thread.currentThread().getName());
        this.f16848g.mo24314a(aVar);
        for (SubBlockModel subBlockModel : d.f10052a) {
            m24360a(aVar, subBlockModel);
        }
        ArrayList arrayList = new ArrayList();
        for (SubBlockModel subBlockModel2 : d.f10053b) {
            arrayList.add(subBlockModel2.getUrl());
        }
        m24362a(aVar, arrayList);
    }

    /* renamed from: d */
    private C3130n<List<SubBlockModel>, List<SubBlockModel>> m24370d(C6013a aVar) {
        C13479a.m54764b("PreloadImageExecutor", "doImgSlicing... in:" + Thread.currentThread().getName());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<SubBlockModel> it = aVar.mo24303e().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubBlockModel next = it.next();
            if (this.f16847f.contains(next.getUrl())) {
                C13479a.m54772d("PreloadImageExecutor", "img : " + next.getUrl() + " hit the cache");
            } else if (i >= 10) {
                C13479a.m54772d("PreloadImageExecutor", "doImgSlicing... exceed batch img threshold");
                break;
            } else {
                if (C5627ab.m22839c(next.getUrl())) {
                    arrayList2.add(next);
                } else {
                    arrayList.add(next);
                }
                i++;
            }
        }
        aVar.mo24303e().clear();
        aVar.mo24303e().addAll(arrayList2);
        aVar.mo24303e().addAll(arrayList);
        return new C3130n<>(arrayList, arrayList2);
    }

    /* renamed from: a */
    private void m24363a(C6014b bVar) {
        C13479a.m54764b("PreloadImageExecutor", "doResultUpdate... in : " + Thread.currentThread().getName());
        if (bVar != null) {
            C5968f c = C5955d.m24025b().mo24091c(bVar.mo24309b(), bVar.mo24310c());
            if (c == null || c.mo24152l() == null) {
                C13479a.m54758a("PreloadImageExecutor", "doResultUpdate... can not find target resource data");
                return;
            }
            if (bVar.mo24308a()) {
                c.mo24152l().mo24331a(3);
            } else {
                c.mo24152l().mo24331a(2);
            }
            int b = c.mo24152l().mo24334b();
            C13479a.m54772d("PreloadImageExecutor", "doResultUpdate... status code = " + b + "ObjToken = " + C13598b.m55197d(c.mo24134c()));
            C5955d.m24025b().mo24083b(c);
        }
    }

    /* renamed from: a */
    public void mo24317a(C6013a aVar) {
        if (aVar != null && aVar.mo24303e() != null) {
            C13479a.m54764b("PreloadImageExecutor", "preloadImages(): original job img size = " + aVar.mo24303e().size());
            AbstractC68307f.m265083a((Object) true).mo238004b(C11678b.m48480d()).mo238001b(new Consumer(aVar) {
                /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a.$$Lambda$e$ARDHjiTS34ElNMvit7yEW61pV3c */
                public final /* synthetic */ C6013a f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6017e.this.m24361a((C6017e) this.f$1, (C6013a) ((Boolean) obj));
                }
            }, $$Lambda$e$4bA9mjGGi1v6CMFekBSdF6meZqA.INSTANCE);
        }
    }

    /* renamed from: a */
    public void mo24318a(AbstractC6015c cVar) {
        try {
            if (!this.f16852k.mo20038b().mo20041b()) {
                C13479a.m54764b("PreloadImageExecutor", "consume  sCountDownLatch.await(): ");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                f16842o = countDownLatch;
                countDownLatch.await();
            }
            if (this.f16853l == null) {
                return;
            }
            if (cVar != null) {
                int g = cVar.mo24306g();
                C13479a.m54764b("PreloadImageExecutor", "do image job, type = " + g);
                if (cVar.mo24306g() == 0) {
                    m24369c((C6013a) cVar);
                } else if (cVar.mo24306g() == 1) {
                    m24363a((C6014b) cVar);
                }
            }
        } catch (Exception e) {
            C13479a.m54758a("PreloadImageExecutor", "consume()... e = " + e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m24361a(C6013a aVar, Boolean bool) throws Exception {
        if (this.f16855n) {
            if (!this.f16844a.contains(aVar)) {
                this.f16844a.put(aVar);
            }
        } else if (!this.f16846c.contains(aVar)) {
            this.f16846c.put(aVar);
        }
    }

    public C6017e(C10917c cVar, boolean z) {
        super(cVar);
        this.f16854m = z;
        C13479a.m54764b("PreloadImageExecutor", "PreloadImageExecutor only_wifi_config = " + this.f16854m);
    }

    /* renamed from: a */
    private void m24362a(C6013a aVar, List<String> list) {
        if (aVar == null || list == null || list.isEmpty()) {
            C13479a.m54764b("PreloadImageExecutor", "batchDownloadDriveImage(): empty");
            return;
        }
        C13479a.m54764b("PreloadImageExecutor", "batchDownloadDriveImage()... with type = " + aVar.mo24305f() + " with token = " + C13598b.m55197d(aVar.mo24302d()));
        C5893b.m23724a().mo23811a(list, aVar.mo24302d(), aVar.mo24305f(), DownloadRequestInfo.DownloadType.COVER, this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m24359a(ConnectionService.NetworkState networkState, Boolean bool) throws Exception {
        C13479a.m54764b("PreloadImageExecutor", "consume  sCountDownLatch.countDown(): ");
        f16843p.countDown();
        f16842o.countDown();
        if (networkState.mo20042c()) {
            this.f16855n = true;
            if (this.f16846c.size() > 0) {
                this.f16844a.addAll(this.f16846c);
                this.f16846c.clear();
            }
            if (this.f16845b.size() > 0) {
                C13479a.m54764b("PreloadImageExecutor", "onNetChanged(): retry networkErrorUrls size = " + this.f16845b.size());
                while (!this.f16845b.isEmpty()) {
                    C6013a a = this.f16848g.mo24311a(this.f16845b.take());
                    if (a != null) {
                        this.f16844a.put(a);
                    }
                }
                return;
            }
            return;
        }
        this.f16855n = false;
        if (this.f16844a.size() > 0) {
            this.f16846c.addAll(this.f16844a);
            this.f16844a.clear();
        }
    }

    /* renamed from: a */
    private void m24360a(C6013a aVar, SubBlockModel subBlockModel) {
        try {
            if (!this.f16852k.mo20038b().mo20041b()) {
                C13479a.m54764b("PreloadImageExecutor", "consume  sCountDownImageLatch.await(): ");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                f16843p = countDownLatch;
                countDownLatch.await();
            }
            if (this.f16853l == null) {
                return;
            }
            if (aVar != null) {
                C13479a.m54772d("PreloadImageExecutor", "consume url = " + subBlockModel.getUrl());
                mo20417a(subBlockModel.getUrl());
                String a = C13721c.m55643a(subBlockModel.getUrl());
                String str = Uri.parse(a).getScheme() + "://" + C6313i.f17510b + C6313i.m25327a().mo25400h(Uri.parse(a).getPath());
                C5937c e = C5955d.m24025b().mo24099e(a);
                if (e == null || TextUtils.isEmpty(e.mo23961d())) {
                    File file = (File) ComponentCallbacks2C2115c.m9151c(C13615c.f35773a).mo10414a(new C13664a(str)).mo10405b(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                    if (C13674e.m55485b(file)) {
                        C5937c cVar = new C5937c();
                        cVar.mo23956a(file.getName() + "_" + System.currentTimeMillis());
                        cVar.mo23958b(subBlockModel.getObjToken());
                        cVar.mo23960c(a);
                        cVar.mo23962d(C5955d.m24032i(file.getAbsolutePath()));
                        cVar.mo23955a(Long.valueOf(C13675f.m55541k(file)));
                        cVar.mo23966f(C6313i.m25327a().mo25400h(Uri.parse(a).getPath()));
                        long a2 = C5955d.m24025b().mo24071a(cVar);
                        this.f16847f.add(subBlockModel.getUrl());
                        C13479a.m54764b("PreloadImageExecutor", "preloadImages ret: " + a2);
                        mo20418a(subBlockModel.getUrl(), (C5893b.C5896a) null);
                        return;
                    }
                    C13479a.m54775e("PreloadImageExecutor", "preloadImages is not image: ");
                    mo20419a(subBlockModel.getUrl(), "", 1);
                    return;
                }
                this.f16847f.add(subBlockModel.getUrl());
                mo20418a(subBlockModel.getUrl(), (C5893b.C5896a) null);
            }
        } catch (Exception e2) {
            C13479a.m54758a("PreloadImageExecutor", "consume() SubBlockModel ... e = " + e2);
            mo20419a(subBlockModel.getUrl(), "", 1);
        }
    }
}

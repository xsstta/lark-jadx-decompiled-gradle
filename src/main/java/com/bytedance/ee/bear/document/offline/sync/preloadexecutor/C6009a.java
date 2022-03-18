package com.bytedance.ee.bear.document.offline.sync.preloadexecutor;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5990h;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5997i;
import com.bytedance.ee.bear.document.offline.sync.C6002l;
import com.bytedance.ee.bear.document.offline.sync.C6005m;
import com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a */
public class C6009a extends C6020b implements AbstractC5993c {

    /* renamed from: j */
    private static CountDownLatch f16821j = new CountDownLatch(1);

    /* renamed from: a */
    public final BlockingQueue<OfflineDoc> f16822a = new LinkedBlockingQueue();

    /* renamed from: b */
    public Map<String, Long> f16823b = new HashMap();

    /* renamed from: c */
    private ConnectionService f16824c;

    /* renamed from: f */
    private final BlockingQueue<OfflineDoc> f16825f = new LinkedBlockingQueue();

    /* renamed from: g */
    private RunnableC6011a f16826g;

    /* renamed from: h */
    private C10917c f16827h;

    /* renamed from: i */
    private AbstractC5990h f16828i;

    /* renamed from: k */
    private AbstractC6012b f16829k;

    /* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a$b */
    public interface AbstractC6012b {
        /* renamed from: a */
        void mo24243a(OfflineDoc offlineDoc);

        /* renamed from: b */
        void mo24246b(OfflineDoc offlineDoc);
    }

    /* renamed from: a */
    public static Thread m24325a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: c */
    public void mo24247c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a$a */
    public class RunnableC6011a implements Runnable {
        public void run() {
            while (true) {
                try {
                    C6009a.this.mo24321d();
                    C6009a aVar = C6009a.this;
                    aVar.mo24294a(aVar.f16822a.take());
                } catch (Exception e) {
                    C13479a.m54759a("PreloadClientVarExecutor", "Consumer  e: ", e);
                }
            }
        }

        private RunnableC6011a() {
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: b */
    public void mo24245b() {
        C13479a.m54764b("PreloadClientVarExecutor", "clearData()...");
        this.f16822a.clear();
        this.f16825f.clear();
        this.f16823b.clear();
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c, com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6020b
    /* renamed from: a */
    public void mo24249a() {
        this.f16826g = new RunnableC6011a();
        m24325a(new Thread(this.f16826g, "Docs_Preload")).start();
    }

    /* renamed from: a */
    public void mo24295a(AbstractC6012b bVar) {
        this.f16829k = bVar;
    }

    public C6009a(C10917c cVar) {
        super(cVar);
        this.f16827h = cVar;
        this.f16824c = C5084ad.m20847d();
        this.f16828i = new AbstractC5990h() {
            /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6009a.C60101 */

            @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5990h
            /* renamed from: a */
            public void mo24233a(String str, long j) {
                C6009a.this.f16823b.put(str, Long.valueOf(j));
            }
        };
        C6005m.m24312a().mo24273a(this.f16828i);
    }

    /* renamed from: b */
    private boolean m24330b(OfflineDoc offlineDoc) {
        String obj_token = offlineDoc.getObj_token();
        boolean z = false;
        if (TextUtils.isEmpty(obj_token)) {
            return false;
        }
        boolean z2 = true;
        if (!this.f16823b.containsKey(obj_token)) {
            AbstractC5997i a = C6005m.m24312a().mo24271a(offlineDoc.getType());
            if (a == null) {
                return false;
            }
            C5968f c = a.mo24219c(obj_token);
            if (c == null || TextUtils.isEmpty(c.mo24137d())) {
                z = true;
            }
            C13479a.m54764b("PreloadClientVarExecutor", "consume  isNeedPreload:    ret " + z + "  OfflineDoc: " + offlineDoc);
            if (!z) {
                ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31513b(obj_token);
            }
        }
        if (offlineDoc.getForce_update() == 1 && !z && System.currentTimeMillis() - this.f16823b.get(obj_token).longValue() > C6002l.f16804b.getUpdate_clientvar_frequency()) {
            C13479a.m54764b("PreloadClientVarExecutor", "filter  getForce_update == 1");
            z = true;
        }
        if (z || !((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35937a(this.f16827h, offlineDoc.getFrom_source())) {
            z2 = z;
        } else {
            offlineDoc.setOnlyPreLoadFeed(true);
        }
        C13479a.m54772d("PreloadClientVarExecutor", "filter  token: ret: " + z2);
        return z2;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: a */
    public void mo24242a(ConnectionService.NetworkState networkState) {
        if (networkState != null && networkState.mo20041b()) {
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238001b(new Consumer(networkState) {
                /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$a$MVtpyqgoia3tsgNweaGlmTxelcU */
                public final /* synthetic */ ConnectionService.NetworkState f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6009a.this.m24326a((C6009a) this.f$1, (ConnectionService.NetworkState) ((Boolean) obj));
                }
            }, $$Lambda$a$3xKzEpXFN8A2CYr67ohGMnW4Vmc.INSTANCE);
        }
    }

    /* renamed from: a */
    public void mo24294a(OfflineDoc offlineDoc) {
        try {
            if (!this.f16824c.mo20038b().mo20041b()) {
                C13479a.m54764b("PreloadClientVarExecutor", "consume  sCountDownLatch.await(): ");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                f16821j = countDownLatch;
                countDownLatch.await();
            }
            if (!m24330b(offlineDoc)) {
                AbstractC6012b bVar = this.f16829k;
                if (bVar != null) {
                    bVar.mo24246b(offlineDoc);
                    return;
                }
                return;
            }
            AbstractC5997i a = C6005m.m24312a().mo24271a(offlineDoc.getType());
            if (a == null) {
                return;
            }
            if (offlineDoc.isOnlyPreLoadFeed()) {
                ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35935a(this.f16827h, offlineDoc);
                return;
            }
            a.mo24221a(offlineDoc, null);
            ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35935a(this.f16827h, offlineDoc);
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40654b(offlineDoc.getObj_token(), Integer.toString(offlineDoc.getType()));
            AbstractC6012b bVar2 = this.f16829k;
            if (bVar2 != null) {
                bVar2.mo24243a(offlineDoc);
            }
        } catch (InterruptedException e) {
            C13479a.m54758a("PreloadClientVarExecutor", "consume()... e = " + e);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.htmlcache.AbstractC5993c
    /* renamed from: a */
    public void mo24244a(List<OfflineDoc> list) {
        AbstractC68307f.m265083a((Object) true).mo238004b(C11678b.m48480d()).mo238001b(new Consumer(list) {
            /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$a$HWsdcTW5GzeHQwgOdUEUp5El1nc */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6009a.this.m24328a((C6009a) this.f$1, (List) ((Boolean) obj));
            }
        }, $$Lambda$a$XwEA6oYHxeJuIyZn0wmmgu8ehO8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24328a(List list, Boolean bool) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineDoc offlineDoc = (OfflineDoc) it.next();
            if (!this.f16822a.contains(offlineDoc)) {
                this.f16822a.put(offlineDoc);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24326a(ConnectionService.NetworkState networkState, Boolean bool) throws Exception {
        C13479a.m54764b("PreloadClientVarExecutor", "consume  sCountDownLatch.countDown(): ");
        f16821j.countDown();
        if (!networkState.mo20042c()) {
            Iterator it = this.f16822a.iterator();
            while (it.hasNext()) {
                OfflineDoc offlineDoc = (OfflineDoc) it.next();
                if (offlineDoc.isWifiOnly()) {
                    this.f16825f.add(offlineDoc);
                    it.remove();
                }
            }
        } else if (this.f16825f.size() > 0) {
            this.f16822a.addAll(this.f16825f);
            this.f16825f.clear();
        }
    }
}

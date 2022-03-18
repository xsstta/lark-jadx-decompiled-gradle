package com.bytedance.ee.bear.document.offline.sync.htmlcache;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.htmlcache.C5994d;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6020b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.htmlcache.d */
public class C5994d extends C6020b {

    /* renamed from: a */
    public BlockingQueue<C5996b> f16786a = new LinkedBlockingQueue(20);

    /* renamed from: b */
    public CountDownLatch f16787b = new CountDownLatch(1);

    /* renamed from: c */
    public volatile boolean f16788c = false;

    /* renamed from: f */
    private an f16789f = ((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: g */
    private RunnableC5995a f16790g;

    /* renamed from: h */
    private Map<String, Long> f16791h = new HashMap();

    /* renamed from: i */
    private C5996b f16792i;

    /* renamed from: j */
    private C5992b f16793j;

    /* renamed from: a */
    public static Thread m24269a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.htmlcache.d$b */
    public static class C5996b {

        /* renamed from: a */
        public OfflineDoc f16795a;

        C5996b() {
        }

        /* renamed from: a */
        public void mo24255a(OfflineDoc offlineDoc) {
            this.f16795a = offlineDoc;
        }
    }

    /* renamed from: b */
    public void mo24251b() {
        this.f16786a.clear();
        this.f16791h.clear();
    }

    /* renamed from: c */
    public void mo24253c() throws InterruptedException {
        if (this.f16788c) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f16787b = countDownLatch;
            countDownLatch.await();
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.offline.sync.htmlcache.d$a */
    private class RunnableC5995a implements Runnable {
        public void run() {
            while (true) {
                try {
                    C5994d.this.mo24253c();
                    C5994d.this.mo24321d();
                    C5994d dVar = C5994d.this;
                    dVar.mo24252b(dVar.f16786a.take());
                } catch (Exception e) {
                    C13479a.m54758a("PreloadHtmlCacheExecutor", "Consumer  e: " + e.getMessage());
                }
            }
        }

        private RunnableC5995a() {
        }

        /* synthetic */ RunnableC5995a(C5994d dVar, PreloadHtmlCacheExecutor$1 preloadHtmlCacheExecutor$1) {
            this();
        }
    }

    /* renamed from: a */
    public void mo24249a() {
        this.f16790g = new RunnableC5995a(this, null);
        m24269a(new Thread(this.f16790g, "Html_Cache_Preload")).start();
    }

    /* renamed from: b */
    public void mo24252b(C5996b bVar) {
        if (!this.f16788c) {
            this.f16792i = bVar;
            this.f16793j.mo24248a(bVar.f16795a);
        }
    }

    public C5994d(C10917c cVar) {
        super(cVar);
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(new PreloadHtmlCacheExecutor$1(this));
        this.f16793j = new C5992b();
    }

    /* renamed from: a */
    private boolean m24272a(OfflineDoc offlineDoc) {
        AccountService.Account f = this.f16789f.mo16408f();
        if (TextUtils.isEmpty(offlineDoc.getObj_token()) || f == null || C8275a.f22378k != C8275a.m34052b(offlineDoc.getType())) {
            return false;
        }
        C5968f a = C5955d.m24025b().mo24075a(f, offlineDoc.getObj_token());
        if (a == null || TextUtils.isEmpty(a.mo24137d())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo24250a(C5996b bVar) {
        AbstractC68307f.m265083a((Object) true).mo238004b(C11678b.m48480d()).mo238001b(new Consumer(bVar) {
            /* class com.bytedance.ee.bear.document.offline.sync.htmlcache.$$Lambda$d$zi82XgLHkeH2KqNcxfwd4Rq5JDY */
            public final /* synthetic */ C5994d.C5996b f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5994d.this.m24270a(this.f$1, (Boolean) obj);
            }
        }, $$Lambda$d$veib_Pd3n6VArAzXy0tq4KN_kC8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24270a(C5996b bVar, Boolean bool) throws Exception {
        if (!this.f16786a.contains(bVar) && !bVar.equals(this.f16792i) && m24272a(bVar.f16795a)) {
            this.f16786a.offer(bVar);
        }
    }
}

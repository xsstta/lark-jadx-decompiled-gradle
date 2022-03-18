package com.bytedance.ee.bear.document.offline.sync.preloadexecutor;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.C6002l;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6022c;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.RnBaseProtocol;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.c */
public class C6022c extends C6020b {

    /* renamed from: b */
    public static CountDownLatch f16861b = new CountDownLatch(1);

    /* renamed from: j */
    private static CountDownLatch f16862j = new CountDownLatch(1);

    /* renamed from: a */
    public final BlockingQueue<SubBlockModel> f16863a = new LinkedBlockingQueue();

    /* renamed from: c */
    public SubBlockModel f16864c;

    /* renamed from: f */
    private final String f16865f = "biz.util.preloadComplete";

    /* renamed from: g */
    private RunnableC6024a f16866g;

    /* renamed from: h */
    private ConnectionService f16867h = C5084ad.m20847d();

    /* renamed from: i */
    private AccountService.Account f16868i;

    /* renamed from: k */
    private RnBaseProtocol f16869k = ((RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class));

    /* renamed from: l */
    private String f16870l;

    /* renamed from: m */
    private String f16871m;

    /* renamed from: a */
    public static Thread m24383a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.c$b */
    public class C6025b implements AbstractC7945d<String> {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m24394a() {
            C6022c.this.mo24328c();
        }

        private C6025b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            if (str == null) {
                C13479a.m54775e("PreloadSubBlockExecutor", "PreloadCompleteHandler data == null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("objToken");
                String optString2 = jSONObject.optString(ShareHitPoint.f121869d);
                C13479a.m54764b("PreloadSubBlockExecutor", "PreloadCompleteHandler(): objToken  " + C13598b.m55197d(optString) + "   type " + optString2);
                if (C6022c.this.f16864c != null && TextUtils.equals(C6022c.this.f16864c.getObjToken(), optString) && TextUtils.equals(C6022c.this.f16864c.getSubBlockType().getSubBlockType(), optString2)) {
                    C11678b.m48479c().scheduleDirect(new Runnable() {
                        /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$c$b$07BDZUjiO0nwQpcaCA3JlSMpygA */

                        public final void run() {
                            C6022c.C6025b.this.m24394a();
                        }
                    });
                    C6022c.f16861b.countDown();
                }
            } catch (JSONException e) {
                C13479a.m54759a("PreloadSubBlockExecutor", "PreloadCompleteHandler handle(): ", e);
            }
        }
    }

    /* renamed from: b */
    public void mo24327b() {
        C13479a.m54764b("PreloadSubBlockExecutor", "clearData()...");
        this.f16863a.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ AbstractC68307f m24386e() {
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40252a("biz.util.preloadComplete", new C6025b());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.c$a */
    public class RunnableC6024a implements Runnable {
        public void run() {
            while (true) {
                try {
                    C6022c.this.mo24321d();
                    C6022c cVar = C6022c.this;
                    cVar.mo24325a(cVar.f16863a.take());
                } catch (Exception e) {
                    C13479a.m54758a("PreloadSubBlockExecutor", "Consumer  e: " + e);
                }
            }
        }

        private RunnableC6024a() {
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6020b
    /* renamed from: a */
    public void mo24249a() {
        this.f16866g = new RunnableC6024a();
        m24383a(new Thread(this.f16866g, "Docs_SubBlock_Preload")).start();
    }

    /* renamed from: c */
    public void mo24328c() {
        int i;
        if (this.f16864c != null) {
            C5968f c = C5955d.m24025b().mo24091c(this.f16864c.getOwnerResKey(), this.f16864c.getObjToken());
            if (this.f16864c.getSubBlockType() == SubBlockType.COMMENTS_DATA) {
                i = 48;
            } else if (this.f16864c.getSubBlockType() == SubBlockType.POLL_DATA) {
                i = 12;
            } else {
                i = 0;
            }
            if (c != null && c.mo24152l() != null) {
                c.mo24152l().mo24331a(i);
                C5955d.m24025b().mo24083b(c);
            }
        }
    }

    public C6022c(C10917c cVar) {
        super(cVar);
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40246a(new Function0() {
            /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$c$vM9XyNWui_MBOFDx4z7E5lXe0 */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6022c.this.m24386e();
            }
        }).mo238036k();
    }

    /* renamed from: a */
    public void mo24323a(AccountService.Account account) {
        this.f16868i = account;
        this.f16870l = account.f14592i + "_" + account.f14584a + "_COMMENTS_DATA_COMPLETE";
        this.f16871m = account.f14592i + "_" + account.f14584a + "_POLL_DATA_COMPLETE";
    }

    /* renamed from: a */
    public void mo24324a(ConnectionService.NetworkState networkState) {
        if (networkState != null && networkState.mo20041b()) {
            C13479a.m54764b("PreloadSubBlockExecutor", "consume  sCountDownLatch.countDown(): ");
            f16862j.countDown();
        }
    }

    /* renamed from: a */
    public void mo24325a(SubBlockModel subBlockModel) {
        try {
            if (!this.f16867h.mo20038b().mo20041b()) {
                C13479a.m54764b("PreloadSubBlockExecutor", "consume  sCountDownLatch.await(): ");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                f16862j = countDownLatch;
                countDownLatch.await();
            }
            if (subBlockModel.getSubBlockType() == SubBlockType.COMMENTS_DATA) {
                if (C5955d.m24025b().mo24098d(this.f16870l, subBlockModel.getObjToken()) == null) {
                    this.f16869k.mo40306a(String.valueOf(subBlockModel.getType()), subBlockModel.getObjToken(), subBlockModel.getDataToken(), SubBlockType.COMMENTS_DATA.getSubBlockType());
                }
            } else if (subBlockModel.getSubBlockType() == SubBlockType.POLL_DATA && C5955d.m24025b().mo24098d(this.f16871m, subBlockModel.getObjToken()) == null) {
                this.f16869k.mo40306a(String.valueOf(subBlockModel.getType()), subBlockModel.getObjToken(), subBlockModel.getDataToken(), SubBlockType.POLL_DATA.getSubBlockType());
            }
            this.f16864c = subBlockModel;
            C13479a.m54772d("PreloadSubBlockExecutor", "PreloadCompleteHandler(): consume  mSubBlockModel:  " + this.f16864c);
            try {
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                f16861b = countDownLatch2;
                countDownLatch2.await(C6002l.f16803a.longValue(), TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                C13479a.m54761a("PreloadSubBlockExecutor", e);
            }
        } catch (Exception e2) {
            C13479a.m54758a("PreloadSubBlockExecutor", "consume()... e = " + e2);
        }
    }

    /* renamed from: a */
    public void mo24326a(SubBlockModel... subBlockModelArr) {
        AbstractC68307f.m265083a((Object) true).mo238004b(C11678b.m48480d()).mo238001b(new Consumer(subBlockModelArr) {
            /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$c$x2PMPM1qmnPNzB1dgO9oXW58Pz8 */
            public final /* synthetic */ SubBlockModel[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6022c.this.m24385a(this.f$1, (Boolean) obj);
            }
        }, $$Lambda$c$pJ8aCmOmHOvJdxo0butgbU9eW8A.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24385a(SubBlockModel[] subBlockModelArr, Boolean bool) throws Exception {
        for (SubBlockModel subBlockModel : subBlockModelArr) {
            if (!this.f16863a.contains(subBlockModel)) {
                this.f16863a.put(subBlockModel);
            }
        }
    }
}

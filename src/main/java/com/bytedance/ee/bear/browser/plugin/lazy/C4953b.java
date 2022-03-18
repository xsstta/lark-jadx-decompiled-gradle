package com.bytedance.ee.bear.browser.plugin.lazy;

import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.BridgeHolder;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.browser.plugin.lazy.b */
public class C4953b implements AbstractC4956d {

    /* renamed from: a */
    protected C4946h f14536a;

    /* renamed from: b */
    protected final C4943e f14537b;

    /* renamed from: c */
    private final Map<C4946h.C4947a, Map<String, AbstractC7945d<?>>> f14538c = new HashMap();

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4956d
    /* renamed from: a */
    public void mo19608a() {
        C13479a.m54764b("DefaultPluginMounter", "release");
    }

    public C4953b(C4943e eVar) {
        this.f14537b = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19613c(AbstractC4941c<?> cVar) {
        if (this.f14537b.mo19569k()) {
            C13479a.m54758a("DefaultPluginMounter", "mountPlugin while plugin host destroyed !");
        } else {
            this.f14537b.mo19543a(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4956d
    /* renamed from: a */
    public void mo19609a(AbstractC4941c<?> cVar) {
        if (!this.f14537b.mo19555b(cVar)) {
            C13479a.m54764b("DefaultPluginMounter", "Mount plugin by findPlugin:" + cVar);
            mo19612b(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, AbstractC7945d<?>> mo19607a(C4946h.C4947a aVar) {
        AbstractC4941c cVar = aVar.f14519a;
        HashMap hashMap = new HashMap();
        C4943e eVar = this.f14537b;
        if (!(eVar instanceof C4933k) || !(cVar instanceof AbstractC4952a)) {
            BridgeHolder bVar = (BridgeHolder) eVar.mo19556c(BridgeHolder.class);
            if (bVar != null && (cVar instanceof AbstractC4952a)) {
                ((AbstractC4952a) cVar).getBridgeHandlers(hashMap);
                for (Map.Entry entry : hashMap.entrySet()) {
                    bVar.mo19354a().mo19349a((String) entry.getKey(), (AbstractC7945d) entry.getValue());
                }
            }
        } else {
            ((AbstractC4952a) cVar).getBridgeHandlers(hashMap);
            AbstractC4931i b = ((C4933k) this.f14537b).mo19448b();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                b.mo19431a((String) entry2.getKey(), (AbstractC7945d) entry2.getValue());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19612b(AbstractC4941c<?> cVar) {
        if (cVar != null && !this.f14537b.mo19555b(cVar)) {
            if (C13742g.m55707a()) {
                mo19613c(cVar);
                return;
            }
            C13479a.m54775e("DefaultPluginMounter", "Sync wait plugin mount:" + cVar);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C13742g.m55711d(new Runnable(cVar, countDownLatch) {
                /* class com.bytedance.ee.bear.browser.plugin.lazy.$$Lambda$b$q1hSCXwzClPMNoE6U5z4LfsbXkM */
                public final /* synthetic */ AbstractC4941c f$1;
                public final /* synthetic */ CountDownLatch f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C4953b.this.m20503a((C4953b) this.f$1, (AbstractC4941c) this.f$2);
                }
            });
            try {
                countDownLatch.await(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                C13479a.m54773d("DefaultPluginMounter", "syncMountWebPluginByJSMsg wait err", e);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4956d
    /* renamed from: a */
    public final void mo19611a(C4946h hVar) {
        this.f14536a = hVar;
        List<C4946h.C4947a> a = hVar.mo19572a(true);
        C13479a.m54764b("DefaultPluginMounter", "mountPlugins size:" + a.size());
        for (C4946h.C4947a aVar : a) {
            if (aVar.f14519a instanceof BasePlugin) {
                ((BasePlugin) aVar.f14519a).setHost(this.f14537b);
            }
        }
        for (C4946h.C4947a aVar2 : a) {
            if (!this.f14538c.containsKey(aVar2)) {
                this.f14538c.put(aVar2, mo19607a(aVar2));
            }
        }
        for (C4946h.C4947a aVar3 : a) {
            if (!this.f14537b.mo19555b(aVar3.f14519a)) {
                mo19610a(aVar3, this.f14538c.get(aVar3));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20503a(AbstractC4941c cVar, CountDownLatch countDownLatch) {
        try {
            mo19613c(cVar);
        } finally {
            countDownLatch.countDown();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19610a(C4946h.C4947a aVar, Map<String, AbstractC7945d<?>> map) {
        mo19613c(aVar.f14519a);
    }
}

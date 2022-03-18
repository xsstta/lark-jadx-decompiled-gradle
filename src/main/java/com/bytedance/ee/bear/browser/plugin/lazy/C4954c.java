package com.bytedance.ee.bear.browser.plugin.lazy;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.browser.plugin.lazy.c */
public class C4954c extends C4953b {

    /* renamed from: c */
    private final Map<String, AbstractC4941c<?>> f14539c = new ConcurrentHashMap();

    /* renamed from: d */
    private boolean f14540d;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m20512c() {
        mo19611a(this.f14536a);
    }

    /* renamed from: com.bytedance.ee.bear.browser.plugin.lazy.c$1 */
    static /* synthetic */ class C49551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14541a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy[] r0 = com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.browser.plugin.lazy.C4954c.C49551.f14541a = r0
                com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy r1 = com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy.Immediate     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.browser.plugin.lazy.C4954c.C49551.f14541a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy r1 = com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy.FirstFind     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.browser.plugin.lazy.C4954c.C49551.f14541a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy r1 = com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy.FirstJSCall     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.browser.plugin.lazy.C4954c.C49551.f14541a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy r1 = com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy.LoadFinish     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.browser.plugin.lazy.C4954c.C49551.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo19615b() {
        C13479a.m54764b("LazyPluginMounter", "syncMountPluginsByLoadFinish");
        this.f14540d = true;
        C13742g.m55711d(new Runnable() {
            /* class com.bytedance.ee.bear.browser.plugin.lazy.$$Lambda$c$jklhQ7qxhYFo66DbrV3fEBSW_4 */

            public final void run() {
                C4954c.m269138lambda$jklhQ7qxhYFo66DbrV3fEBSW_4(C4954c.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.plugin.lazy.C4953b
    /* renamed from: a */
    public Map<String, AbstractC7945d<?>> mo19607a(C4946h.C4947a aVar) {
        Map<String, AbstractC7945d<?>> a = super.mo19607a(aVar);
        m20511b(aVar, a);
        return a;
    }

    public C4954c(C4943e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public void mo19614a(String str) {
        AbstractC4941c<?> remove = this.f14539c.remove(str);
        if (remove != null && !this.f14537b.mo19555b(remove)) {
            C13479a.m54764b("LazyPluginMounter", "Mount plugin by js msg:" + remove);
            mo19612b(remove);
        }
    }

    /* renamed from: b */
    private void m20511b(C4946h.C4947a aVar, Map<String, AbstractC7945d<?>> map) {
        for (String str : map.keySet()) {
            this.f14539c.put(str, aVar.f14519a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.plugin.lazy.C4953b
    /* renamed from: a */
    public void mo19610a(C4946h.C4947a aVar, Map<String, AbstractC7945d<?>> map) {
        PluginMountStrategy pluginMountStrategy = aVar.f14523e;
        if (pluginMountStrategy == null) {
            pluginMountStrategy = PluginMountStrategy.Immediate;
        }
        int i = C49551.f14541a[pluginMountStrategy.ordinal()];
        if (i == 1) {
            super.mo19610a(aVar, map);
        } else if (i == 2) {
            m20511b(aVar, map);
        } else if (i == 3) {
            m20511b(aVar, map);
            if (map.isEmpty()) {
                C13479a.m54775e("LazyPluginMounter", "Plugin lazy mount with FirstJSCall , but no js handler . Mount it now !" + aVar.f14519a);
                super.mo19610a(aVar, map);
            }
        } else if (i == 4) {
            if (this.f14540d) {
                super.mo19610a(aVar, map);
            } else {
                m20511b(aVar, map);
            }
        }
    }
}

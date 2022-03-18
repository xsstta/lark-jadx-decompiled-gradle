package com.bytedance.ee.bear.integrator.p400b.p401a.p406e;

import com.bytedance.ee.bear.basesdk.p250a.C4361i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.document.loading.DocLoadingPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.wikiv2.browser.plugin.AbstractC12208a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.integrator.b.a.e.b */
public class C7895b extends C4361i implements AbstractC12208a {
    @Override // com.bytedance.ee.bear.wikiv2.browser.plugin.AbstractC12208a
    /* renamed from: b */
    public C4946h mo30725b(C4943e eVar, String str) {
        C13479a.m54764b("WikiContentPluginsProviderImplV2", "getWikiContentPlugins:" + str);
        C4946h a = mo17012a(eVar, str);
        a.mo19574b(LoadingFailedPlugin.class);
        a.mo19574b(DocLoadingPlugin.class);
        return a;
    }
}

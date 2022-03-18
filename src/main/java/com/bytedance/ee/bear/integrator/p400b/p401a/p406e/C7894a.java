package com.bytedance.ee.bear.integrator.p400b.p401a.p406e;

import com.bytedance.ee.bear.basesdk.p250a.C4361i;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.loading.DocLoadingPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wiki.browser.plugin.AbstractC11921a;
import com.bytedance.ee.bear.wiki.browser.plugin.WikiInfo;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.integrator.b.a.e.a */
public class C7894a extends C4361i implements AbstractC11921a {
    @Override // com.bytedance.ee.bear.wiki.browser.plugin.AbstractC11921a
    /* renamed from: a */
    public C4946h mo30724a(C6095s sVar, WikiInfo wikiInfo) {
        C13479a.m54764b("WikiContentPluginsProviderImpl", "getWikiContentPlugins:" + wikiInfo);
        C4946h a = mo17012a(sVar, C8275a.m34050a(wikiInfo.getObjType()));
        a.mo19574b(LoadingFailedPlugin.class);
        a.mo19574b(DocLoadingPlugin.class);
        return a;
    }
}

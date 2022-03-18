package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.browser.AbstractC4934l;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.document.statistics.C6157b;
import com.bytedance.ee.bear.externallink.AbstractC7648a;
import com.bytedance.ee.bear.externallink.C7657d;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.basesdk.a.k */
public class C4363k extends AbstractC7648a {
    @Override // com.bytedance.ee.bear.browser.AbstractC4936n
    /* renamed from: a */
    public List<AbstractC4934l> mo17013a() {
        C13479a.m54772d("ExternalLinksBrowserConfigs", "getWebServices");
        return Arrays.asList(new C6157b());
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
    /* renamed from: a */
    public C4946h mo17011a(C4943e eVar) {
        C13479a.m54772d("ExternalLinksBrowserConfigs", "getPluginList");
        return C7657d.m30666a(eVar);
    }
}

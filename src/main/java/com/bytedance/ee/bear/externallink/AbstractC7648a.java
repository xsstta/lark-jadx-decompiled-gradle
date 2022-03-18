package com.bytedance.ee.bear.externallink;

import com.bytedance.ee.bear.browser.AbstractC4936n;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.externallink.a */
public abstract class AbstractC7648a implements AbstractC4936n, AbstractC4948i {

    /* renamed from: a */
    private static AbstractC7648a f20740a;

    /* renamed from: b */
    public static AbstractC7648a m30632b() {
        AbstractC7648a aVar = f20740a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("ExternalLinkBrowserConfigs impl not injected yet , see ExternalLinkBrowserConfigs.setup");
    }

    /* renamed from: a */
    public static void m30631a(AbstractC7648a aVar) {
        C13479a.m54764b("ExternalLinkBrowserConfigs", "setup");
        f20740a = aVar;
    }
}

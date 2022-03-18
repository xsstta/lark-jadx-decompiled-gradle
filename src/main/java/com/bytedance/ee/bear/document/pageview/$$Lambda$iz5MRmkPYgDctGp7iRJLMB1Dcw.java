package com.bytedance.ee.bear.document.pageview;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;

/* renamed from: com.bytedance.ee.bear.document.pageview.-$$Lambda$iz5MRmkPYgDctGp7-iRJLMB1Dcw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iz5MRmkPYgDctGp7iRJLMB1Dcw implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$iz5MRmkPYgDctGp7iRJLMB1Dcw INSTANCE = new $$Lambda$iz5MRmkPYgDctGp7iRJLMB1Dcw();

    private /* synthetic */ $$Lambda$iz5MRmkPYgDctGp7iRJLMB1Dcw() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((PageviewPlugin) cVar).showPageview();
    }
}

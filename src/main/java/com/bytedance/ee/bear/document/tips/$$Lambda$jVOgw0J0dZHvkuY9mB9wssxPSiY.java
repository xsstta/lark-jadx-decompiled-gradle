package com.bytedance.ee.bear.document.tips;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;

/* renamed from: com.bytedance.ee.bear.document.tips.-$$Lambda$jVOgw0J0dZHvkuY9mB9wssxPSiY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jVOgw0J0dZHvkuY9mB9wssxPSiY implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$jVOgw0J0dZHvkuY9mB9wssxPSiY INSTANCE = new $$Lambda$jVOgw0J0dZHvkuY9mB9wssxPSiY();

    private /* synthetic */ $$Lambda$jVOgw0J0dZHvkuY9mB9wssxPSiY() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((TitlePlugin) cVar).setAppBarLayoutVisible();
    }
}

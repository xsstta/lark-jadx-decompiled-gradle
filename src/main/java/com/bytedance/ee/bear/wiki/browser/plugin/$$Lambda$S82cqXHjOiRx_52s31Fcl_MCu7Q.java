package com.bytedance.ee.bear.wiki.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;

/* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.-$$Lambda$S82cqXHjOiRx_52s31Fcl_MCu7Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$S82cqXHjOiRx_52s31Fcl_MCu7Q implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$S82cqXHjOiRx_52s31Fcl_MCu7Q INSTANCE = new $$Lambda$S82cqXHjOiRx_52s31Fcl_MCu7Q();

    private /* synthetic */ $$Lambda$S82cqXHjOiRx_52s31Fcl_MCu7Q() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((WikiTreeMenuPlugin) cVar).treeSync();
    }
}

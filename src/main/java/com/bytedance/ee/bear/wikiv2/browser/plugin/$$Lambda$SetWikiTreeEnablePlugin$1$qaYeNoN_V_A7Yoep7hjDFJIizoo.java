package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;

/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.-$$Lambda$SetWikiTreeEnablePlugin$1$qaYeNoN_V_A7Yoep7hjDFJIizoo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SetWikiTreeEnablePlugin$1$qaYeNoN_V_A7Yoep7hjDFJIizoo implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$SetWikiTreeEnablePlugin$1$qaYeNoN_V_A7Yoep7hjDFJIizoo INSTANCE = new $$Lambda$SetWikiTreeEnablePlugin$1$qaYeNoN_V_A7Yoep7hjDFJIizoo();

    private /* synthetic */ $$Lambda$SetWikiTreeEnablePlugin$1$qaYeNoN_V_A7Yoep7hjDFJIizoo() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((WikiTreeMenuPlugin) cVar).setLoadState(0);
    }
}

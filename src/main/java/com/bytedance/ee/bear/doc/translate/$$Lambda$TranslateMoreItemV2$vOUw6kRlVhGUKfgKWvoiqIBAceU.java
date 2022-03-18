package com.bytedance.ee.bear.doc.translate;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin;

/* renamed from: com.bytedance.ee.bear.doc.translate.-$$Lambda$TranslateMoreItemV2$vOUw6kRlVhGUKfgKWvoiqIBAceU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TranslateMoreItemV2$vOUw6kRlVhGUKfgKWvoiqIBAceU implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$TranslateMoreItemV2$vOUw6kRlVhGUKfgKWvoiqIBAceU INSTANCE = new $$Lambda$TranslateMoreItemV2$vOUw6kRlVhGUKfgKWvoiqIBAceU();

    private /* synthetic */ $$Lambda$TranslateMoreItemV2$vOUw6kRlVhGUKfgKWvoiqIBAceU() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((EditModeSwitchPlugin) cVar).hideButton();
    }
}

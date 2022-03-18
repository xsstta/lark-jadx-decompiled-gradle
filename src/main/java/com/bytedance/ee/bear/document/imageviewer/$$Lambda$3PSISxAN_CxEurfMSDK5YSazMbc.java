package com.bytedance.ee.bear.document.imageviewer;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin;

/* renamed from: com.bytedance.ee.bear.document.imageviewer.-$$Lambda$3PSISxAN_CxEurfMSDK5YSazMbc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$3PSISxAN_CxEurfMSDK5YSazMbc implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$3PSISxAN_CxEurfMSDK5YSazMbc INSTANCE = new $$Lambda$3PSISxAN_CxEurfMSDK5YSazMbc();

    private /* synthetic */ $$Lambda$3PSISxAN_CxEurfMSDK5YSazMbc() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((GroupTemplatePreviewPlugin) cVar).showTemplatePreview();
    }
}

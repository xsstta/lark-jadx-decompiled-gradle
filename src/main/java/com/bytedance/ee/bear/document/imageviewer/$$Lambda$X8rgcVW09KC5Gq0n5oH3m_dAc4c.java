package com.bytedance.ee.bear.document.imageviewer;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.document.multitask.MultiTaskPlugin;

/* renamed from: com.bytedance.ee.bear.document.imageviewer.-$$Lambda$X8rgcVW09KC5Gq0n5oH3m_dAc4c  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$X8rgcVW09KC5Gq0n5oH3m_dAc4c implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$X8rgcVW09KC5Gq0n5oH3m_dAc4c INSTANCE = new $$Lambda$X8rgcVW09KC5Gq0n5oH3m_dAc4c();

    private /* synthetic */ $$Lambda$X8rgcVW09KC5Gq0n5oH3m_dAc4c() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((MultiTaskPlugin) cVar).disableMultiTaskSlide();
    }
}

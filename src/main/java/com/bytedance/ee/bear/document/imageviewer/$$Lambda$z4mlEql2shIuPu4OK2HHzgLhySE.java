package com.bytedance.ee.bear.document.imageviewer;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.document.multitask.MultiTaskPlugin;

/* renamed from: com.bytedance.ee.bear.document.imageviewer.-$$Lambda$z4mlEql2shIuPu4OK2HHzgLhySE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$z4mlEql2shIuPu4OK2HHzgLhySE implements AbstractC4942d {
    public static final /* synthetic */ $$Lambda$z4mlEql2shIuPu4OK2HHzgLhySE INSTANCE = new $$Lambda$z4mlEql2shIuPu4OK2HHzgLhySE();

    private /* synthetic */ $$Lambda$z4mlEql2shIuPu4OK2HHzgLhySE() {
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final void onPluginFound(AbstractC4941c cVar) {
        ((MultiTaskPlugin) cVar).enableMultiTaskSlide();
    }
}

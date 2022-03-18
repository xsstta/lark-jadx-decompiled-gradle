package com.bytedance.ee.bear.middleground.calendar.toolbar;

import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;
import com.bytedance.ee.bear.middleground.calendar.editor.WebEditorToolbar;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.toolbar.c */
public class C8931c {

    /* renamed from: a */
    private WeakReference<WebEditorToolbar> f24091a;

    /* renamed from: b */
    private BridgeWebViewV2 f24092b;

    public C8931c(BridgeWebViewV2 bridgeWebViewV2) {
        this.f24092b = bridgeWebViewV2;
    }

    /* renamed from: a */
    public void mo34275a(WebEditorToolbar webEditorToolbar) {
        WeakReference<WebEditorToolbar> weakReference = this.f24091a;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (webEditorToolbar != null) {
            webEditorToolbar.setCurrentWebView(this.f24092b);
            this.f24091a = new WeakReference<>(webEditorToolbar);
        }
    }
}

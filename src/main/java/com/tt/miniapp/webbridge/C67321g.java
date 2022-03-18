package com.tt.miniapp.webbridge;

import android.webkit.JavascriptInterface;
import com.tt.miniapp.RenderViewManager;
import java.lang.ref.SoftReference;

/* renamed from: com.tt.miniapp.webbridge.g */
public class C67321g {

    /* renamed from: a */
    private SoftReference<RenderViewManager.IRender> f169878a;

    @JavascriptInterface
    public boolean isRenderInBrowser() {
        SoftReference<RenderViewManager.IRender> softReference = this.f169878a;
        if (softReference == null || softReference.get() == null) {
            return false;
        }
        return this.f169878a.get().isRenderInBrowserEnabled();
    }

    /* renamed from: a */
    public void mo233995a(RenderViewManager.IRender iRender) {
        this.f169878a = new SoftReference<>(iRender);
    }
}

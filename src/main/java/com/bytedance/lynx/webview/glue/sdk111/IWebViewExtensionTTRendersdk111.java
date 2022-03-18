package com.bytedance.lynx.webview.glue.sdk111;

import android.view.View;

public interface IWebViewExtensionTTRendersdk111 {
    boolean isTTRenderInBrowserEnabled();

    void platformViewOnComputeScroll(int i, int i2, int i3);

    void platformViewParpareDraw(int i);

    void registerPlatformView(View view, int i);

    void setPlatformViewLayersScrollListener(Object obj);

    void unregisterPlatformView(View view, int i);
}

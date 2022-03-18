package com.bytedance.lynx.webview.glue.sdk113;

public interface IWebViewExtensionNetsdk113 {
    int getAllRequestCount();

    int getCacheHitRequestCount();

    void preresolveHosts(String[] strArr);
}

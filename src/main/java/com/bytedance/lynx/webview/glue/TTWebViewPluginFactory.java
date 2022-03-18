package com.bytedance.lynx.webview.glue;

public interface TTWebViewPluginFactory {
    TTWebViewPlugin create(Object obj);

    String name();
}

package com.bytedance.lynx.webview.glue.sdk112;

public interface IWebViewExtensionsdk112 {
    void addPluginFactory(Object obj);

    boolean enableFeature(String str, boolean z);

    void removePluginFactory(String str);

    void setRenderProcessGoneListener(Object obj);
}

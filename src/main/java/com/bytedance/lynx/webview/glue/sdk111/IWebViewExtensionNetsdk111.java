package com.bytedance.lynx.webview.glue.sdk111;

import java.util.Map;

public interface IWebViewExtensionNetsdk111 {
    Map<String, Object> getTTWebViewProxyMap();

    void setTTWebViewProxyMap(Map<String, Object> map);

    void setTag(String str);

    void setUrlPreconnect(String str, int i);
}

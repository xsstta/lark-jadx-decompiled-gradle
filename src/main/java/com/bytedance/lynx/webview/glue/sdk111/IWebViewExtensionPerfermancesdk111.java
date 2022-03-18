package com.bytedance.lynx.webview.glue.sdk111;

public interface IWebViewExtensionPerfermancesdk111 {
    long getLoadingStatusCode();

    String getPerformanceTiming();

    void setPerformanceTimingListener(Object obj);
}

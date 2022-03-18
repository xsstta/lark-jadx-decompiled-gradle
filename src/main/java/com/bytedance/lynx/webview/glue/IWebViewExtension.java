package com.bytedance.lynx.webview.glue;

import com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111;
import com.bytedance.lynx.webview.glue.sdk111.IPlatformViewLayersScrollListenersdk111;
import com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionNetsdk111;
import com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionPerfermancesdk111;
import com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111;
import com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionsdk111;
import com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112;
import com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenerWrappersdk112;
import com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112;
import com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionNetsdk112;
import com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionPerfermancesdk112;
import com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionTTRendersdk112;
import com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionsdk112;
import com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113;
import com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionNetsdk113;
import com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionPredictorsdk113;
import com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113;

public interface IWebViewExtension extends IWebViewExtensionNetsdk111, IWebViewExtensionPerfermancesdk111, IWebViewExtensionTTRendersdk111, IWebViewExtensionsdk111, IWebViewExtensionNetsdk112, IWebViewExtensionPerfermancesdk112, IWebViewExtensionTTRendersdk112, IWebViewExtensionsdk112, IWebViewExtensionNetsdk113, IWebViewExtensionPredictorsdk113, IWebViewExtensionsdk113 {

    public interface MemoryEventListener {
    }

    public interface PerformanceTimingListener extends IPerformanceTimingListenersdk111, IPerformanceTimingListenersdk112, IPerformanceTimingListenersdk113 {
    }

    public interface PlatformViewLayersScrollListener extends IPlatformViewLayersScrollListenersdk111 {
    }

    public interface RenderProcessGoneListener extends IRenderProcessGoneListenersdk112 {
    }

    public interface RenderProcessGoneListenerWrapper extends IRenderProcessGoneListenerWrappersdk112 {
    }

    void setMemoryEventListener(MemoryEventListener memoryEventListener);

    void setPerformanceTimingListener(PerformanceTimingListener performanceTimingListener);

    void setPlatformViewLayersScrollListener(PlatformViewLayersScrollListener platformViewLayersScrollListener);

    void setRenderProcessGoneListener(RenderProcessGoneListener renderProcessGoneListener);
}

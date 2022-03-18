package com.bytedance.lynx.webview.glue.sdk112;

import android.webkit.WebView;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;

public interface IRenderProcessGoneListenersdk112 {
    boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail);
}

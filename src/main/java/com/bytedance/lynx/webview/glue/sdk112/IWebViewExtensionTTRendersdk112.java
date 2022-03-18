package com.bytedance.lynx.webview.glue.sdk112;

import android.webkit.ValueCallback;

public interface IWebViewExtensionTTRendersdk112 {
    boolean isTTRenderEnabled(String str);

    boolean renderEvaluateJavaScript(String str, ValueCallback<String> valueCallback);
}

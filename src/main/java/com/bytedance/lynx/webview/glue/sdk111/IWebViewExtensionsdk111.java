package com.bytedance.lynx.webview.glue.sdk111;

import com.bytedance.lynx.webview.glue.TTWebViewSettings;
import com.bytedance.lynx.webview.glue.TextSelectedEventListener;

public interface IWebViewExtensionsdk111 {
    TTWebViewSettings getTTWebViewSettings();

    void setHeadXRequestWith(boolean z, String str);

    void setIsNeedTTwebviewUserAgent(boolean z);

    void setTextSelectedEventListener(TextSelectedEventListener textSelectedEventListener);

    void setTextSelectedEventListener(Object obj);
}

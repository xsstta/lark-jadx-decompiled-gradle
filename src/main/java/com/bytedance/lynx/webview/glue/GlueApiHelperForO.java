package com.bytedance.lynx.webview.glue;

import android.webkit.ServiceWorkerController;
import android.webkit.TokenBindingService;
import android.webkit.WebViewFactoryProvider;

public final class GlueApiHelperForO {
    private GlueApiHelperForO() {
    }

    public static ServiceWorkerController createServiceWorkerController(WebViewFactoryProvider webViewFactoryProvider) {
        return webViewFactoryProvider.getServiceWorkerController();
    }

    public static TokenBindingService createTokenBindingService(WebViewFactoryProvider webViewFactoryProvider) {
        return webViewFactoryProvider.getTokenBindingService();
    }
}

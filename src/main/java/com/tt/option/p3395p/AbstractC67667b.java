package com.tt.option.p3395p;

import android.view.View;
import android.webkit.WebView;
import com.tt.miniapp.view.webcore.AbstractC67282j;

/* renamed from: com.tt.option.p.b */
public interface AbstractC67667b {
    void cleanTTWebViewExtension(int i);

    void fetchWebviewCore(boolean z);

    String getLoadSoVersion();

    String getLocalSoVersion();

    String getTTWebViewVersion();

    void initTTWebViewExtension(WebView webView, int i);

    boolean isTTRenderInBrowserEnabled(int i);

    boolean isTTWebView();

    void registerPlatformView(int i, View view, int i2);

    void setPerformanceListener(AbstractC67282j.AbstractC67283a aVar);

    void setPlatformLayerScrollListener(int i, AbstractC67282j.AbstractC67284b bVar);

    boolean shouldCheckTTWebview();

    boolean shouldDownloadIn4G();
}

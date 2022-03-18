package com.bytedance.ee.bear.document;

import android.webkit.WebView;
import androidx.fragment.app.Fragment;

/* renamed from: com.bytedance.ee.bear.document.aa */
public interface AbstractC5625aa {

    /* renamed from: com.bytedance.ee.bear.document.aa$a */
    public interface AbstractC5626a {
        void onDocWebViewDetach();
    }

    /* renamed from: a */
    void mo22547a(Fragment fragment);

    /* renamed from: a */
    void mo22548a(DocBridgeWebViewV2 docBridgeWebViewV2, Fragment fragment);

    /* renamed from: a */
    boolean mo22549a();

    /* renamed from: b */
    void mo22550b();

    int getHeight();

    AbstractC5626a getOnDetachListener();

    WebView getWebView();

    void setOnDetachListener(AbstractC5626a aVar);
}

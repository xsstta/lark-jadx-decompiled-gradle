package com.bytedance.ee.bear.document;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.document.AbstractC5625aa;
import com.bytedance.ee.log.C13479a;

public class WebViewContainer extends FrameLayout implements AbstractC5625aa {

    /* renamed from: a */
    private AbstractC5625aa.AbstractC5626a f15942a;

    /* renamed from: b */
    private Boolean f15943b;

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    public AbstractC5625aa.AbstractC5626a getOnDetachListener() {
        return this.f15942a;
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    public WebView getWebView() {
        return (WebView) getChildAt(0);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    /* renamed from: a */
    public boolean mo22549a() {
        if (getWebView() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    /* renamed from: b */
    public void mo22550b() {
        WebView webView = getWebView();
        if (webView != null) {
            webView.onResume();
        }
    }

    public float getScale() {
        WebView webView = getWebView();
        if (webView == null) {
            return 1.0f;
        }
        return webView.getScale();
    }

    public String getUrl() {
        WebView webView = getWebView();
        if (webView != null) {
            return webView.getUrl();
        }
        return "";
    }

    public boolean isVerticalScrollBarEnabled() {
        WebView webView = getWebView();
        if (webView != null) {
            return webView.isVerticalScrollBarEnabled();
        }
        Boolean bool = this.f15943b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public WebViewContainer(Context context) {
        super(context);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    public void setOnDetachListener(AbstractC5625aa.AbstractC5626a aVar) {
        this.f15942a = aVar;
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.f15943b = Boolean.valueOf(z);
        WebView webView = getWebView();
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(z);
        }
    }

    public void removeView(View view) {
        AbstractC5625aa.AbstractC5626a aVar;
        if ((view instanceof WebView) && view.getParent() == this && (aVar = this.f15942a) != null) {
            aVar.onDocWebViewDetach();
        }
        super.removeView(view);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    /* renamed from: a */
    public void mo22547a(Fragment fragment) {
        C13479a.m54764b("WebViewContainer", "detach: ");
        DocBridgeWebViewV2 docBridgeWebViewV2 = (DocBridgeWebViewV2) getWebView();
        if (docBridgeWebViewV2 == null) {
            C13479a.m54764b("WebViewContainer", "detach: webview has already detached");
            return;
        }
        docBridgeWebViewV2.mo22324a(fragment);
        docBridgeWebViewV2.setHostFragment(null);
        docBridgeWebViewV2.setOnTouchListener(null);
        super.removeView(docBridgeWebViewV2);
    }

    public WebViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5625aa
    /* renamed from: a */
    public void mo22548a(DocBridgeWebViewV2 docBridgeWebViewV2, Fragment fragment) {
        C13479a.m54764b("WebViewContainer", "attach: ");
        if (getWebView() != null) {
            C13479a.m54764b("WebViewContainer", "attach: webview has alreay attached");
            return;
        }
        super.addView(docBridgeWebViewV2, -1, -1);
        docBridgeWebViewV2.setHostFragment(fragment);
        Boolean bool = this.f15943b;
        if (bool != null) {
            docBridgeWebViewV2.setVerticalScrollBarEnabled(bool.booleanValue());
        }
    }

    public WebViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

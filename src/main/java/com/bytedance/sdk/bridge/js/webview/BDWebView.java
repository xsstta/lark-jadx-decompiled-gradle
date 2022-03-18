package com.bytedance.sdk.bridge.js.webview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.bridge.js.delegate.JavaScriptInterfaceModule;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Deprecated(message = "")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0006\u0010\u001e\u001a\u00020\u0011J$\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0016J8\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0018H\u0016J$\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180)H\u0017J\u0010\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020\u0011H\u0016¨\u0006>"}, d2 = {"Lcom/bytedance/sdk/bridge/js/webview/BDWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "canGoBack", "", "canGoBackOrForward", "steps", "canGoForward", "clearCache", "", "includeDiskFiles", "clearFormData", "clearHistory", "computeScroll", "getContentHeight", "getOriginalUrl", "", "getProgress", "getUrl", "goBack", "goBackOrForward", "goForward", "init", "loadData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mimeType", "encoding", "loadDataWithBaseURL", "baseUrl", "historyUrl", "loadUrl", "url", "additionalHttpHeaders", "", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "postUrl", "postData", "", "reload", "setBackgroundColor", "color", "setDownloadListener", "listener", "Landroid/webkit/DownloadListener;", "setNetworkAvailable", "networkUp", "setWebChromeClient", "client", "Landroid/webkit/WebChromeClient;", "setWebViewClient", "Landroid/webkit/WebViewClient;", "stopLoading", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BDWebView extends WebView {
    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception e) {
            e.printStackTrace();
            return 100;
        }
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void goBack() {
        try {
            super.goBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goForward() {
        try {
            super.goForward();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reload() {
        try {
            super.reload();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo69672a() {
        setWebViewClient(null);
        WebSettings settings = getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
        settings.setJavaScriptEnabled(true);
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                addJavascriptInterface(new JavaScriptInterfaceModule(JsBridgeDelegate.f50450a.mo69594a(this), null, 2, null), "JS2NativeBridge");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getOriginalUrl() {
        String url;
        try {
            String originalUrl = super.getOriginalUrl();
            return (originalUrl == null || !StringsKt.startsWith$default(originalUrl, "data:text/html", false, 2, null) || (url = super.getUrl()) == null || !StringsKt.startsWith$default(url, "file://", false, 2, null)) ? originalUrl : url;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BDWebView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo69672a();
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        try {
            super.loadUrl(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        Intrinsics.checkParameterIsNotNull(downloadListener, "listener");
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        Intrinsics.checkParameterIsNotNull(webChromeClient, "client");
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(new WebViewClientWrapper(webViewClient));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BDWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        mo69672a();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(map, "additionalHttpHeaders");
        try {
            super.loadUrl(str, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void postUrl(String str, byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bArr, "postData");
        try {
            super.postUrl(str, bArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadData(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            super.loadData(str, str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BDWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        mo69672a();
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

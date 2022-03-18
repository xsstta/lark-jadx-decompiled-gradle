package com.bytedance.ee.bear.browser;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.C13404c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.browser.c */
public class C4920c extends C13404c {

    /* renamed from: a */
    private List<WebChromeClient> f14474a = new CopyOnWriteArrayList();

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public Bitmap getDefaultVideoPoster() {
        for (WebChromeClient webChromeClient : this.f14474a) {
            Bitmap defaultVideoPoster = webChromeClient.getDefaultVideoPoster();
            if (defaultVideoPoster != null) {
                return defaultVideoPoster;
            }
        }
        return super.getDefaultVideoPoster();
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public View getVideoLoadingProgressView() {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.getVideoLoadingProgressView();
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onGeolocationPermissionsHidePrompt() {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onHideCustomView() {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onHideCustomView();
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onJsTimeout() {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onJsTimeout()) {
                return true;
            }
        }
        return super.onJsTimeout();
    }

    /* renamed from: b */
    public void mo19358b(WebChromeClient webChromeClient) {
        this.f14474a.remove(webChromeClient);
    }

    public C4920c(AbstractC13402a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo19356a(WebChromeClient webChromeClient) {
        if (!this.f14474a.contains(webChromeClient)) {
            this.f14474a.add(webChromeClient);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c, android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.getVisitedHistory(valueCallback);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onCloseWindow(WebView webView) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onCloseWindow(webView);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onPermissionRequest(permissionRequest);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onRequestFocus(WebView webView) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onRequestFocus(webView);
        }
    }

    /* renamed from: a */
    public void mo19357a(Comparator<WebChromeClient> comparator) {
        ArrayList arrayList = new ArrayList(this.f14474a);
        Collections.sort(arrayList, comparator);
        this.f14474a.clear();
        this.f14474a.addAll(arrayList);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onConsoleMessage(consoleMessage)) {
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    /* renamed from: a */
    public void mo19355a(int i, WebChromeClient webChromeClient) {
        if (!this.f14474a.contains(webChromeClient)) {
            this.f14474a.add(i, webChromeClient);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onProgressChanged(WebView webView, int i) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onProgressChanged(webView, i);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onReceivedTitle(WebView webView, String str) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onReceivedTitle(webView, str);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c, android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onConsoleMessage(String str, int i, String str2) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onConsoleMessage(str, i, str2);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onCreateWindow(webView, z, z2, message)) {
                return true;
            }
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onJsAlert(webView, str, str2, jsResult)) {
                return true;
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult)) {
                return true;
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onJsConfirm(webView, str, str2, jsResult)) {
                return true;
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            if (webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult)) {
                return true;
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13404c
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        for (WebChromeClient webChromeClient : this.f14474a) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }
}

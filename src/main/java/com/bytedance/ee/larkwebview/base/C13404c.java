package com.bytedance.ee.larkwebview.base;

import android.content.Context;
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
import com.bytedance.android.monitor.webview.C2711i;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.ee.larkwebview.quality.safe.FileChooseHandlerV2;
import com.bytedance.ee.larkwebview.service.AbstractC13472g;
import com.ss.android.lark.log.Log;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkwebview.base.c */
public class C13404c extends WebChromeClient {

    /* renamed from: a */
    private AbstractC13402a f35332a;

    /* renamed from: b */
    private WebChromeClient f35333b;

    /* renamed from: c */
    private FileChooseHandlerV2 f35334c;

    public boolean onJsTimeout() {
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            return webChromeClient.onJsTimeout();
        }
        return super.onJsTimeout();
    }

    public View getVideoLoadingProgressView() {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "getVideoLoadingProgressView");
            return this.f35333b.getVideoLoadingProgressView();
        }
        Log.m165389i("LarkWebChromeClient", "getVideoLoadingProgressView");
        return super.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        Log.m165389i("LarkWebChromeClient", "onGeolocationPermissionsHidePrompt");
        super.onGeolocationPermissionsHidePrompt();
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onGeolocationPermissionsHidePrompt mClient");
            this.f35333b.onGeolocationPermissionsHidePrompt();
        }
    }

    public void onHideCustomView() {
        Log.m165389i("LarkWebChromeClient", "onHideCustomView");
        super.onHideCustomView();
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
    }

    public Bitmap getDefaultVideoPoster() {
        AbstractC13472g gVar = (AbstractC13472g) this.f35332a.getServiceManager().mo49931b(AbstractC13472g.class);
        if (gVar != null) {
            Log.m165389i("LarkWebChromeClient", "getDefaultVideoPoster service handle");
            return gVar.mo49912a();
        } else if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "getDefaultVideoPoster mClient handle");
            return this.f35333b.getDefaultVideoPoster();
        } else {
            Log.m165389i("LarkWebChromeClient", "getDefaultVideoPoster default");
            return super.getDefaultVideoPoster();
        }
    }

    /* renamed from: a */
    public void mo49742a(Context context) {
        FileChooseHandlerV2 aVar = this.f35334c;
        if (aVar != null) {
            aVar.mo49818a(context);
        }
    }

    /* renamed from: c */
    public void mo49743c(WebChromeClient webChromeClient) {
        Log.m165389i("LarkWebChromeClient", "Caller setWebChromeClient");
        this.f35333b = webChromeClient;
    }

    public void onRequestFocus(WebView webView) {
        super.onRequestFocus(webView);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onRequestFocus(webView);
        }
    }

    public C13404c(AbstractC13402a aVar) {
        this.f35332a = aVar;
        this.f35334c = new FileChooseHandlerV2(aVar.getWebView().getContext());
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        Log.m165389i("LarkWebChromeClient", "getVisitedHistory");
        super.getVisitedHistory(valueCallback);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
        }
    }

    public void onCloseWindow(WebView webView) {
        Log.m165389i("LarkWebChromeClient", "onCloseWindow");
        super.onCloseWindow(webView);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onCloseWindow(webView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onPermissionRequest mClient");
            this.f35333b.onPermissionRequest(permissionRequest);
            return;
        }
        Log.m165389i("LarkWebChromeClient", "onPermissionRequest default");
        super.onPermissionRequest(permissionRequest);
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onPermissionRequestCanceled mClient");
            this.f35333b.onPermissionRequestCanceled(permissionRequest);
            return;
        }
        Log.m165389i("LarkWebChromeClient", "onPermissionRequestCanceled default");
        super.onPermissionRequestCanceled(permissionRequest);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Log.m165389i("LarkWebChromeClient", "onGeolocationPermissionsShowPrompt");
        super.onGeolocationPermissionsShowPrompt(str, callback);
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onGeolocationPermissionsShowPrompt default");
            this.f35333b.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Log.m165389i("LarkWebChromeClient", "onReceiveIcon");
        super.onReceivedIcon(webView, bitmap);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        Log.m165389i("LarkWebChromeClient", "onReceivedTitle");
        super.onReceivedTitle(webView, str);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Log.m165389i("LarkWebChromeClient", "onShowCustomView");
        super.onShowCustomView(view, customViewCallback);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        Log.m165389i("LarkWebChromeClient", "onProgressChanged " + i);
        super.onProgressChanged(webView, i);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i);
        }
        C2711i.m11480a().mo11580a(webView, i);
    }

    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        super.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
    }

    public void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onConsoleMessage(str, i, str2);
        }
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, i, customViewCallback);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        Log.m165389i("LarkWebChromeClient", "onReceivedTouchIconUrl , precomposed = " + z);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebMonitorManager.f35486a.mo49873a(this.f35332a.getWebView(), "input", (Map<String, ? extends Object>) null);
        WebChromeClient webChromeClient = this.f35333b;
        if (webChromeClient != null) {
            boolean onShowFileChooser = webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
            Log.m165389i("LarkWebChromeClient", "onShowFileChooser mClient clientResult = " + onShowFileChooser);
            if (!onShowFileChooser) {
                this.f35334c.mo49820a(valueCallback, fileChooserParams);
            }
            return true;
        }
        Log.m165389i("LarkWebChromeClient", "onShowFileChooser default");
        this.f35334c.mo49820a(valueCallback, fileChooserParams);
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onCreateWindow mClient");
            return this.f35333b.onCreateWindow(webView, z, z2, message);
        }
        Log.m165389i("LarkWebChromeClient", "onCreateWindow default");
        return super.onCreateWindow(webView, z, z2, message);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onJsAlert mClient");
            return this.f35333b.onJsAlert(webView, str, str2, jsResult);
        }
        Log.m165389i("LarkWebChromeClient", "onJsAlert default");
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onJsBeforeUnload mClient");
            return this.f35333b.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        Log.m165389i("LarkWebChromeClient", "onJsBeforeUnload default");
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onJsConfirm mClient");
            return this.f35333b.onJsConfirm(webView, str, str2, jsResult);
        }
        Log.m165389i("LarkWebChromeClient", "onJsConfirm default");
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (this.f35333b != null) {
            Log.m165389i("LarkWebChromeClient", "onJsPrompt mClient");
            return this.f35333b.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        Log.m165389i("LarkWebChromeClient", "onJsPrompt default");
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }
}

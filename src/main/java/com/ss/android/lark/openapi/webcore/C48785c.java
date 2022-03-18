package com.ss.android.lark.openapi.webcore;

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
import com.ss.android.lark.jsbridge.BridgeWebView;
import com.ss.android.lark.jsbridge.C40667c;
import com.ss.android.lark.openapi.webcore.p2398a.AbstractC48778b;

/* renamed from: com.ss.android.lark.openapi.webcore.c */
public class C48785c extends C40667c {

    /* renamed from: b */
    private AbstractC48778b f122571b;

    public Bitmap getDefaultVideoPoster() {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170411d();
        }
        return super.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170412e();
        }
        return super.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170405b();
        }
    }

    public void onHideCustomView() {
        super.onHideCustomView();
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170388a();
        }
    }

    public boolean onJsTimeout() {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170409c();
        }
        return super.onJsTimeout();
    }

    public C48785c(BridgeWebView bridgeWebView) {
        super(bridgeWebView);
    }

    /* renamed from: a */
    public void mo170440a(AbstractC48778b bVar) {
        this.f122571b = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170392a(valueCallback);
        }
    }

    public void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170407b(webView);
        }
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170391a(permissionRequest);
        } else {
            permissionRequest.deny();
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170406b(permissionRequest);
        } else {
            super.onPermissionRequestCanceled(permissionRequest);
        }
    }

    public void onRequestFocus(WebView webView) {
        super.onRequestFocus(webView);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170393a(webView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170400a(consoleMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170399a(str, callback);
        }
    }

    @Override // com.ss.android.lark.jsbridge.C40667c
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170394a(webView, i);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170395a(webView, bitmap);
        }
    }

    @Override // com.ss.android.lark.jsbridge.C40667c
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170396a(webView, str);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170390a(view, customViewCallback);
        }
    }

    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        super.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
    }

    public void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170398a(str, i, str2);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170397a(webView, str, z);
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            bVar.mo170389a(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170401a(webView, valueCallback, fileChooserParams);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170404a(webView, z, z2, message);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170402a(webView, str, str2, jsResult);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170410c(webView, str, str2, jsResult);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170408b(webView, str, str2, jsResult);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC48778b bVar = this.f122571b;
        if (bVar != null) {
            return bVar.mo170403a(webView, str, str2, str3, jsPromptResult);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }
}

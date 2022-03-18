package com.bytedance.lark.webview.container.impl;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25853d;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25854e;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25856g;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h;
import com.larksuite.component.webview.container.impl.statistics.WebContainerReporter;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.ss.android.lark.log.Log;
import java.util.HashMap;

/* renamed from: com.bytedance.lark.webview.container.impl.a */
class C19848a extends WebChromeClient {

    /* renamed from: a */
    private AbstractC25857h f48442a;

    /* renamed from: b */
    private AbstractC25856g f48443b;

    /* renamed from: c */
    private AbstractC25854e f48444c;

    /* renamed from: d */
    private AbstractC25853d f48445d;

    /* renamed from: e */
    private IWebContainerContract.IWebContainerView.AbstractC25824a f48446e;

    /* renamed from: f */
    private IWebContainerContract.IWebContainerView f48447f;

    public void onGeolocationPermissionsHidePrompt() {
        AbstractC25853d dVar = this.f48445d;
        if (dVar != null) {
            dVar.mo91947a();
        } else {
            super.onGeolocationPermissionsHidePrompt();
        }
    }

    public void onHideCustomView() {
        AbstractC25857h hVar = this.f48442a;
        if (hVar != null) {
            hVar.mo67252a();
        } else {
            super.onHideCustomView();
        }
    }

    public Bitmap getDefaultVideoPoster() {
        IWebContainerContract.IWebContainerView iWebContainerView = this.f48447f;
        if (iWebContainerView == null || iWebContainerView.mo67310c()) {
            return super.getDefaultVideoPoster();
        }
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    public void onCloseWindow(WebView webView) {
        AbstractC25857h hVar = this.f48442a;
        if (hVar != null) {
            hVar.mo67255a(webView);
        } else {
            super.onCloseWindow(webView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR || consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.WARNING) {
            Log.m165397w("LarkWebChromeClient", "onConsoleMessage, line : " + consoleMessage.lineNumber() + ", level : " + consoleMessage.messageLevel() + ", message : " + consoleMessage.message());
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("line", String.valueOf(consoleMessage.lineNumber()));
            hashMap.put("level", String.valueOf(consoleMessage.messageLevel()));
            hashMap.put("message", String.valueOf(consoleMessage.message()));
            WebContainerReporter.m93651a().mo92046a("console_error", hashMap);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        AbstractC25853d dVar = this.f48445d;
        if (dVar != null) {
            dVar.mo91948a(str, callback);
        } else {
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        this.f48443b.mo67293f();
        AbstractC25854e eVar = this.f48444c;
        if (eVar != null) {
            eVar.mo67302a(i);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC25857h hVar = this.f48442a;
        if (hVar != null) {
            hVar.mo67254a(view, customViewCallback);
        } else {
            super.onShowCustomView(view, customViewCallback);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (TextUtils.equals(webView.getUrl(), str) && !TextUtils.isEmpty(webView.getTitle()) && !TextUtils.equals(webView.getUrl(), webView.getTitle())) {
            str = webView.getTitle();
        }
        IWebContainerContract.IWebContainerView.AbstractC25824a aVar = this.f48446e;
        if (aVar != null) {
            aVar.mo51004d(webView, str);
        }
        this.f48443b.mo67283a(str);
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC25857h hVar = this.f48442a;
        if (hVar != null) {
            hVar.mo67253a(view, i, customViewCallback);
        } else {
            super.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (C25821b.m93347a() == null || !C25821b.m93347a().mo91848a("openplatform.webapp.input.filechoose")) {
            AbstractC25857h hVar = this.f48442a;
            if (hVar != null) {
                return hVar.mo67257a(webView, valueCallback, fileChooserParams);
            }
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        Log.m165389i("LarkWebChromeClient", "fg open so use default fileChooser");
        return false;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (z2) {
            return this.f48442a.mo67258a(webView, z, z2, message);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    public C19848a(AbstractC25857h hVar, IWebContainerContract.IWebContainerView.AbstractC25824a aVar, IWebContainerContract.IWebContainerView iWebContainerView, AbstractC25856g gVar, AbstractC25854e eVar, AbstractC25853d dVar) {
        this.f48446e = aVar;
        this.f48447f = iWebContainerView;
        this.f48442a = hVar;
        this.f48443b = gVar;
        this.f48444c = eVar;
        this.f48445d = dVar;
    }
}

package com.bytedance.ee.bear.middleground.docsdk;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;
import com.bytedance.ee.util.p701d.C13613a;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import java.util.Map;

public abstract class DocSDKBridgeWebViewV2 extends BridgeWebViewV2 {

    /* renamed from: a */
    private boolean f25025a = true;

    /* renamed from: b */
    private TTWebViewExtension f25026b;

    /* renamed from: a */
    private void mo19616a() {
    }

    public void setBridgeWebViewClient(AbstractC9313f fVar) {
        setWebViewClient(fVar);
    }

    public void setUseInputWrapper(boolean z) {
        this.f25025a = z;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.DocSDKBridgeWebViewV2$a */
    public static class C9305a extends InputConnectionWrapper {
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            return super.sendKeyEvent(keyEvent);
        }

        public C9305a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            if (i - i2 != 1) {
                return super.deleteSurroundingText(i, i2);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 67, 0, 0, -1, 0, 22));
            sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 67, 0, 0, -1, 0, 22));
            return true;
        }
    }

    public DocSDKBridgeWebViewV2(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo35519a(IWebViewExtension.RenderProcessGoneListener renderProcessGoneListener) {
        if (this.f25026b == null) {
            this.f25026b = new TTWebViewExtension(this);
        }
        this.f25026b.setRenderProcessGoneListener(renderProcessGoneListener);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!this.f25025a) {
            return onCreateInputConnection;
        }
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C9305a(onCreateInputConnection, true);
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    public void setWebViewClient(WebViewClient webViewClient) {
        C13613a.m55255a((Application) getContext().getApplicationContext());
        super.setWebViewClient(webViewClient);
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2
    /* renamed from: a */
    public void mo30811a(String str, boolean z) {
        mo19616a();
        super.mo30811a(str, z);
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView, android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        mo19616a();
        super.loadUrl(str, map);
    }

    public DocSDKBridgeWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

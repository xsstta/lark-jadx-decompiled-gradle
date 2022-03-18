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
import com.bytedance.ee.bear.jsbridge.BridgeWebView;
import com.bytedance.ee.util.p701d.C13613a;
import java.util.Map;

public abstract class DocSDKBridgeWebView extends BridgeWebView {

    /* renamed from: a */
    private boolean f25024a = true;

    /* renamed from: a */
    private void m38473a() {
    }

    public void setBridgeWebViewClient(AbstractC9312e eVar) {
        setWebViewClient(eVar);
    }

    public void setUseInputWrapper(boolean z) {
        this.f25024a = z;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.DocSDKBridgeWebView$a */
    public static class C9304a extends InputConnectionWrapper {
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            return super.sendKeyEvent(keyEvent);
        }

        public C9304a(InputConnection inputConnection, boolean z) {
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

    public DocSDKBridgeWebView(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!this.f25024a) {
            return onCreateInputConnection;
        }
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C9304a(onCreateInputConnection, true);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        C13613a.m55255a((Application) getContext().getApplicationContext());
        super.setWebViewClient(webViewClient);
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebView, android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        m38473a();
        super.loadUrl(str, map);
    }

    public DocSDKBridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DocSDKBridgeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

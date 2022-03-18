package com.bytedance.ee.bear.jsbridge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public abstract class BridgeWebView extends WebView implements C7939a.AbstractC7942a {

    /* renamed from: a */
    private C7939a f21344a;

    /* renamed from: b */
    private BridgeWebViewTouchDispatcher f21345b;

    public C7939a getBridge() {
        return this.f21344a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeTimers();
    }

    public void destroy() {
        C7939a aVar = this.f21344a;
        if (aVar != null) {
            aVar.mo30836b();
        }
        super.destroy();
    }

    /* renamed from: a */
    private void m31694a() {
        C7939a aVar = new C7939a(this);
        this.f21344a = aVar;
        addJavascriptInterface(aVar, "_DocsBridge");
        this.f21345b = new BridgeWebViewTouchDispatcher();
    }

    public BridgeWebView(Context context) {
        super(context);
        m31694a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void loadUrl(String str) {
        mo30799a(str, false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21345b.mo30842a(this, motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public BridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m31694a();
    }

    /* renamed from: a */
    public void mo30799a(String str, boolean z) {
        if (z) {
            try {
                evaluateJavascript(str, null);
            } catch (Throwable th) {
                C13479a.m54758a("BridgeWebView", "loadUrl e = " + th);
            }
        } else {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    super.loadUrl(str, map);
                    return;
                }
            } catch (Throwable th) {
                C13479a.m54758a("BridgeWebView", "loadUrl additionalHttpHeaders e = " + th);
                return;
            }
        }
        loadUrl(str);
    }

    public BridgeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31694a();
    }
}

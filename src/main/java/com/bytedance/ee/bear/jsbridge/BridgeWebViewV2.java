package com.bytedance.ee.bear.jsbridge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.bear.webview.fps.FpsWebViewV2;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.Bridge;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p704g.C13665a;
import java.util.Map;

public abstract class BridgeWebViewV2 extends FpsWebViewV2 {

    /* renamed from: m */
    public static boolean f21346m;

    /* renamed from: a */
    private Bridge f21347a;

    /* renamed from: b */
    private BridgeWebViewTouchDispatcher f21348b;

    /* renamed from: o */
    public void mo30814o() {
        this.f21348b.mo30840a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeTimers();
    }

    @Override // com.bytedance.ee.bear.webview.fps.FpsWebViewV2, com.bytedance.ee.larkwebview.base.LarkWebView
    public void destroy() {
        Bridge aVar = this.f21347a;
        if (aVar != null) {
            aVar.mo49775c();
        }
        super.destroy();
    }

    /* renamed from: a */
    private void mo19616a() {
        this.f21347a = getBridge();
        this.f21348b = new BridgeWebViewTouchDispatcher();
    }

    public BridgeWebViewV2(Context context) {
        super(context);
        mo19616a();
    }

    /* renamed from: a */
    public static AbstractC7947h m31696a(final JsCallBack gVar) {
        return new AbstractC7947h() {
            /* class com.bytedance.ee.bear.jsbridge.BridgeWebViewV2.C79383 */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17188a(JSONObject jSONObject) {
                gVar.mo49778a(Status.SUCCESS, jSONObject);
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17189a(NonProguard nonProguard) {
                gVar.mo49778a(Status.SUCCESS, nonProguard);
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17190a(String str) {
                gVar.mo49778a(Status.SUCCESS, str);
            }
        };
    }

    /* renamed from: b */
    public void mo30812b(View.OnTouchListener onTouchListener) {
        this.f21348b.mo30843b(onTouchListener);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void loadUrl(String str) {
        mo30811a(str, false);
    }

    /* renamed from: a */
    public static <T> BridgeHandler<String, LarkWebView> m31697a(final AbstractC7945d dVar) {
        return new BridgeHandler<String, LarkWebView>() {
            /* class com.bytedance.ee.bear.jsbridge.BridgeWebViewV2.C79372 */

            @Override // com.bytedance.ee.larkwebview.bridge.BridgeHandler
            /* renamed from: a */
            public boolean mo30817a() {
                if (!(dVar instanceof RunWithoutMainThread) || BridgeWebViewV2.f21346m) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public void mo30815a(String str, JsCallBack gVar, String str2, LarkWebView larkWebView) {
                C7939a.m31736a(str, dVar, BridgeWebViewV2.m31696a(gVar));
            }
        };
    }

    /* renamed from: a */
    public static <T> BridgeHandler<String, LarkWebView> m31698a(final AbstractC7948j jVar) {
        return new BridgeHandler<String, LarkWebView>() {
            /* class com.bytedance.ee.bear.jsbridge.BridgeWebViewV2.C79361 */

            @Override // com.bytedance.ee.larkwebview.bridge.BridgeHandler
            /* renamed from: a */
            public boolean mo30817a() {
                if (!(jVar instanceof RunWithoutMainThread) || BridgeWebViewV2.f21346m) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public void mo30815a(String str, JsCallBack gVar, String str2, LarkWebView larkWebView) {
                C7939a.m31737a(str, jVar, BridgeWebViewV2.m31696a(gVar));
            }
        };
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21348b.mo30842a(this, motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo30807a(View.OnTouchListener onTouchListener) {
        this.f21348b.mo30841a(onTouchListener);
    }

    public BridgeWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo19616a();
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView, android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    super.loadUrl(str, map);
                    return;
                }
            } catch (Throwable th) {
                C13479a.m54758a("BridgeWebViewV2", "loadUrl additionalHttpHeaders e = " + th);
                return;
            }
        }
        loadUrl(str);
    }

    /* renamed from: a */
    public void mo22332a(String str, JSONObject jSONObject) {
        mo30808a(str, jSONObject, false);
    }

    /* renamed from: a */
    public <T> void mo30809a(String str, AbstractC7945d<T> dVar) {
        this.f21347a.mo49770a(str, m31697a((AbstractC7945d) dVar));
    }

    /* renamed from: a */
    public <T> void mo30810a(String str, AbstractC7948j<T> jVar) {
        this.f21347a.mo49770a(str, m31698a(jVar));
    }

    /* renamed from: a */
    public void mo30811a(String str, boolean z) {
        if (z) {
            try {
                evaluateJavascript(str, null);
            } catch (Throwable th) {
                C13479a.m54758a("BridgeWebViewV2", "loadUrl e = " + th);
            }
        } else {
            super.loadUrl(str);
        }
    }

    /* renamed from: a */
    public void mo30808a(String str, JSONObject jSONObject, boolean z) {
        if (z) {
            try {
                C11755a.m48726a(this, str, jSONObject, (ValueCallback<String>) null);
            } catch (Throwable th) {
                C13479a.m54758a("BridgeWebViewV2", "loadUrl e = " + th);
            }
        } else {
            super.loadUrl(C13665a.m55441a(str, jSONObject));
        }
    }
}

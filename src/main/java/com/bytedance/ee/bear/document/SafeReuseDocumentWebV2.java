package com.bytedance.ee.bear.document;

import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4920c;
import com.bytedance.ee.bear.browser.C4921d;
import com.bytedance.ee.bear.browser.bridge.JSBridge;
import com.bytedance.ee.bear.document.AbstractC6295z;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.jsbridge.RunWithoutMainThread;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.JsMsgInterceptor;
import com.bytedance.ee.larkwebview.bridge.Message;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

public class SafeReuseDocumentWebV2 extends C5630ae implements LifecycleObserver, AbstractC6295z, JsMsgInterceptor {

    /* renamed from: b */
    private boolean f15930b;

    /* renamed from: c */
    private Map<String, AbstractC7945d> f15931c = new HashMap();

    /* renamed from: d */
    private C4921d f15932d;

    /* renamed from: e */
    private C4920c f15933e;

    /* renamed from: f */
    private Map<WebViewClient, Integer> f15934f;

    /* renamed from: g */
    private Map<WebChromeClient, Integer> f15935g;

    /* renamed from: h */
    private AbstractC6295z.AbstractC6296a f15936h;

    /* renamed from: i */
    private final JSBridge f15937i;

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public IBridge mo19440c() {
        return this.f15937i;
    }

    public String toString() {
        return this.f15947a;
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6295z
    /* renamed from: a */
    public void mo22532a(boolean z, Integer num) {
        String str = this.f15947a;
        C13479a.m54764b(str, "setWebViewActive:" + z);
        this.f15930b = z;
        if (z) {
            mo22569e().mo22321a(0, this.f15932d);
            mo22569e().mo22320a(0, this.f15933e);
            mo22569e().mo22337b(C5622a.m22827a());
            mo22569e().getWebViewActiveMap().put(num, true);
        } else {
            mo22569e().mo22337b(this.f15932d);
            mo22569e().mo22322a(this.f15933e);
            mo22569e().getWebViewActiveMap().remove(num);
        }
        if (mo22569e().getWebViewActiveMap().size() == 0) {
            mo22569e().mo22321a(0, C5622a.m22827a());
            C13479a.m54764b(this.f15947a, "setWebViewActive: add BackgroundWebViewClient");
        }
    }

    @Override // com.bytedance.ee.larkwebview.bridge.JsMsgInterceptor
    /* renamed from: a */
    public boolean mo22534a(Message message, JsCallBack gVar) {
        if (message == null) {
            C13479a.m54758a(this.f15947a, "onInterceptJSMsg msg == null");
            return false;
        }
        com.bytedance.ee.bear.jsbridge.Message message2 = new com.bytedance.ee.bear.jsbridge.Message();
        message2.mo30826d(message.getData());
        message2.mo30824c(message.getCallbackID());
        message2.mo30828e(message.getApiName());
        return mo22533a(message2, m20301a(gVar));
    }

    /* renamed from: a */
    public boolean mo22533a(com.bytedance.ee.bear.jsbridge.Message message, AbstractC7947h hVar) {
        String e;
        AbstractC7945d dVar;
        if (!this.f15930b || (dVar = this.f15931c.get((e = message.mo30827e()))) == null) {
            return false;
        }
        if (dVar instanceof RunWithoutMainThread) {
            AbstractC6295z.AbstractC6296a aVar = this.f15936h;
            if (aVar != null) {
                aVar.onBeforeJsMsgDispatch(e);
            }
            C7939a.m31736a(message.mo30825d(), dVar, hVar);
            return true;
        }
        C13742g.m55705a(new Runnable(e, message, dVar, hVar) {
            /* class com.bytedance.ee.bear.document.$$Lambda$SafeReuseDocumentWebV2$fPdCR9Vhws3vZQriXmpyGmTG8 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ com.bytedance.ee.bear.jsbridge.Message f$2;
            public final /* synthetic */ AbstractC7945d f$3;
            public final /* synthetic */ AbstractC7947h f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                SafeReuseDocumentWebV2.this.m22806a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
        return true;
    }

    /* renamed from: f */
    private void m22807f() {
        JSBridge aVar = this.f15937i;
        if (aVar instanceof JSBridge) {
            aVar.mo19351a(new Function3() {
                /* class com.bytedance.ee.bear.document.$$Lambda$SafeReuseDocumentWebV2$RcMFdhP89AiIMzX3nQzePHy1wmg */

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SafeReuseDocumentWebV2.this.m22805a((String) obj, obj2, (AbstractC7947h) obj3);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6295z
    /* renamed from: d */
    public void mo22535d() {
        C13479a.m54764b(this.f15947a, "onOwnerDestroy");
        mo22569e().getBridge().mo49773b(this);
        mo22569e().mo22337b(this.f15932d);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6295z
    /* renamed from: a */
    public void mo22531a(AbstractC6295z.AbstractC6296a aVar) {
        this.f15936h = aVar;
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19425a(WebViewClient webViewClient) {
        mo19426a(webViewClient, 0);
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19437b(WebChromeClient webChromeClient) {
        this.f15933e.mo19358b(webChromeClient);
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public void mo19441c(String str) {
        this.f15931c.remove(str);
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19438b(WebViewClient webViewClient) {
        this.f15932d.mo19389b(webViewClient);
        this.f15934f.remove(webViewClient);
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19423a(WebChromeClient webChromeClient) {
        String str = this.f15947a;
        C13479a.m54764b(str, "addWebChromeClientDelegate:" + (webChromeClient instanceof C5806g));
        mo19424a(webChromeClient, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ int m22803a(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        int i;
        Integer num = this.f15935g.get(webChromeClient);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = this.f15935g.get(webChromeClient2);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return i - i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ int m22804a(WebViewClient webViewClient, WebViewClient webViewClient2) {
        int i;
        Integer num = this.f15934f.get(webViewClient);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = this.f15934f.get(webViewClient2);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return i - i2;
    }

    @Override // com.bytedance.ee.bear.browser.C4929h
    /* renamed from: a */
    public void mo19424a(WebChromeClient webChromeClient, int i) {
        this.f15935g.put(webChromeClient, Integer.valueOf(i));
        this.f15933e.mo19356a(webChromeClient);
        this.f15933e.mo19357a(new Comparator() {
            /* class com.bytedance.ee.bear.document.$$Lambda$SafeReuseDocumentWebV2$dIfPRuuLH90Yt441HimKx2cjA0g */

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SafeReuseDocumentWebV2.this.m22803a((WebChromeClient) obj, (WebChromeClient) obj2);
            }
        });
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19426a(WebViewClient webViewClient, int i) {
        this.f15934f.put(webViewClient, Integer.valueOf(i));
        this.f15932d.mo19387a(webViewClient);
        this.f15932d.mo19388a(new Comparator() {
            /* class com.bytedance.ee.bear.document.$$Lambda$SafeReuseDocumentWebV2$Tm2FOY9Pe94midTzgEJMNa9vF4A */

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SafeReuseDocumentWebV2.this.m22804a((WebViewClient) obj, (WebViewClient) obj2);
            }
        });
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19431a(String str, AbstractC7945d dVar) {
        this.f15931c.put(str, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m22805a(String str, Object obj, final AbstractC7947h hVar) {
        C11755a.m48726a(mo19435b(), str, (JSONObject) obj, new ValueCallback<String>() {
            /* class com.bytedance.ee.bear.document.SafeReuseDocumentWebV2.C56212 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                hVar.mo17190a(str);
            }
        });
        return null;
    }

    public SafeReuseDocumentWebV2(String str, Lifecycle lifecycle, final DocBridgeWebViewV2 docBridgeWebViewV2) {
        super(docBridgeWebViewV2);
        this.f15947a = "SafeReuseDocumentWebV2#" + str;
        C56201 r2 = new AbstractC13402a() {
            /* class com.bytedance.ee.bear.document.SafeReuseDocumentWebV2.C56201 */

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public LarkWebView getWebView() {
                return docBridgeWebViewV2;
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public C13477l getServiceManager() {
                return new C13477l();
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public Context getWebViewContext() {
                return docBridgeWebViewV2.getContext();
            }
        };
        this.f15932d = new C4921d(r2);
        this.f15933e = new C4920c(r2);
        this.f15934f = new HashMap();
        this.f15935g = new HashMap();
        docBridgeWebViewV2.getBridge().mo49768a(this);
        this.f15937i = new JSBridge(this);
        m22807f();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22806a(String str, com.bytedance.ee.bear.jsbridge.Message message, AbstractC7945d dVar, AbstractC7947h hVar) {
        if (this.f15930b) {
            AbstractC6295z.AbstractC6296a aVar = this.f15936h;
            if (aVar != null) {
                aVar.onBeforeJsMsgDispatch(str);
            }
            C7939a.m31736a(message.mo30825d(), dVar, hVar);
        }
    }
}

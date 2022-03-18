package com.bytedance.ee.bear.middleground.calendar.p440a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.bytedance.common.util.LollipopV21Compat;
import com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b;
import com.bytedance.ee.bear.document.bridgestatus.BridgeReadyModel;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.bear.middleground.calendar.C8890a;
import com.bytedance.ee.bear.middleground.calendar.bean.EditorStyleData;
import com.bytedance.ee.bear.middleground.calendar.bean.PlaceholderData;
import com.bytedance.ee.bear.middleground.calendar.bean.PlaceholderStyle;
import com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b;
import com.bytedance.ee.bear.middleground.calendar.editor.WebEditorToolbar;
import com.bytedance.ee.bear.middleground.calendar.monitor.JSLoggerHandler;
import com.bytedance.ee.bear.middleground.calendar.monitor.MonitorHandler;
import com.bytedance.ee.bear.middleground.calendar.toolbar.C8931c;
import com.bytedance.ee.bear.middleground.docsdk.DocSDKBridgeWebViewV2;
import com.bytedance.ee.bear.middleground.docsdk.plugins.p450a.C9314a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13618f;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import java.io.StringReader;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.a.a */
public class C8891a extends DocSDKBridgeWebViewV2 {

    /* renamed from: a */
    public C8911b f23975a;

    /* renamed from: b */
    public List<AbstractC8913d> f23976b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public C1177w<Boolean> f23977c = new C1177w<>();

    /* renamed from: d */
    public C1177w<AbstractC7947h> f23978d = new C1177w<>();

    /* renamed from: e */
    public C1177w<AbstractC7947h> f23979e = new C1177w<>();

    /* renamed from: f */
    public C1177w<AbstractC7947h> f23980f = new C1177w<>();

    /* renamed from: g */
    public C1177w<AbstractC7947h> f23981g = new C1177w<>();

    /* renamed from: h */
    public C1177w<AbstractC7947h> f23982h = new C1177w<>();

    /* renamed from: i */
    public C1177w<AbstractC7947h> f23983i = new C1177w<>();

    /* renamed from: j */
    public C1177w<String> f23984j = new C1177w<>();

    /* renamed from: k */
    public C1177w<AbstractC7947h> f23985k = new C1177w<>();

    /* renamed from: l */
    public C1177w<String> f23986l = new C1177w<>();

    /* renamed from: n */
    public C1177w<AbstractC7947h> f23987n = new C1177w<>();

    /* renamed from: o */
    public C1177w<String> f23988o = new C1177w<>();

    /* renamed from: p */
    public C1177w<AbstractC7947h> f23989p = new C1177w<>();

    /* renamed from: q */
    public C1177w<String> f23990q = new C1177w<>();

    /* renamed from: r */
    public C1177w<AbstractC7947h> f23991r = new C1177w<>();

    /* renamed from: y */
    private C8931c f23992y = new C8931c(this);

    /* renamed from: f */
    private void m37295f() {
        mo30810a("biz.util.monitor", new MonitorHandler());
    }

    /* renamed from: g */
    private void m37296g() {
        mo30810a("biz.core.isChanged", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass29 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23991r.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.isChangedValue", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass30 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23990q.mo5926a(str);
            }
        });
    }

    /* renamed from: h */
    private void m37297h() {
        mo30810a("biz.core.getText", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C88992 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23985k.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.getTextValue", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C89023 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23984j.mo5926a(str);
            }
        });
    }

    /* renamed from: i */
    private void m37298i() {
        mo30810a("biz.core.getContent", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C89034 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23987n.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.getContentValue", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C89045 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23986l.mo5926a(str);
            }
        });
    }

    /* renamed from: j */
    private void m37299j() {
        mo30810a("biz.core.getHtml", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C89056 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23989p.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.getHtmlValue", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C89067 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C13479a.m54764b("CalendarWebView", "handler(): s = " + str);
                C8891a.this.f23988o.mo5926a(str);
            }
        });
    }

    /* renamed from: k */
    private void m37300k() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        setUserAgent(settings);
        LollipopV21Compat.setMixedContentMode(settings, 2);
    }

    /* renamed from: c */
    public void mo34133c() {
        mo34131a((WebEditorToolbar) null);
        setOnUrlLoadingCallback(null);
        setEditable(false);
        setPlaceHolder("");
        setCustomStyle(new WebEditorStyle.C8917a().mo34205a());
        mo22336b();
    }

    /* renamed from: d */
    private void m37293d() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        m37300k();
        C8911b bVar = new C8911b(getContext());
        this.f23975a = bVar;
        setWebViewClient(bVar);
        mo35519a(new IWebViewExtension.RenderProcessGoneListener() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.$$Lambda$a$W6ZbOPlpFViAYabYwoR5r6QY3SI */

            @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
            public final boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                return C8891a.lambda$W6ZbOPlpFViAYabYwoR5r6QY3SI(C8891a.this, webView, tTRenderProcessGoneDetail);
            }
        });
        m37294e();
    }

    /* renamed from: b */
    public void mo22336b() {
        C13479a.m54764b("CalendarWebView", "clear(), webView = " + hashCode());
        final String uuid = UUID.randomUUID().toString();
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass22 */

            public void run() {
                C8891a.this.f23983i.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass22.C89011 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        if (hVar != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("requestId", (Object) uuid);
                            hVar.mo17188a(jSONObject);
                        }
                        C8891a.this.f23983i.mo5928b(this);
                    }
                });
            }
        });
    }

    /* renamed from: e */
    private void m37294e() {
        mo30809a("biz.notify.ready", (AbstractC7945d) new C9314a(new AbstractC5678b() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.C88921 */

            @Override // com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b
            public void ready(BridgeReadyModel bridgeReadyModel) {
                C13479a.m54764b("CalendarWebView", " ***************jsBridge ready ***************" + C8891a.this.hashCode() + ",callBackList = " + C8891a.this.f23976b.size());
                C8891a.this.f23977c.mo5929b((Boolean) true);
                for (AbstractC8913d dVar : C8891a.this.f23976b) {
                    C13479a.m54764b("CalendarWebView", "ready renderCallBack onReadyFinish():" + dVar.hashCode());
                    dVar.mo34194a();
                }
            }
        }));
        mo30810a("biz.util.logger", new JSLoggerHandler());
        mo30810a("biz.util.setStyle", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass12 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23978d.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.setEditable", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass23 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23979e.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.clearContent", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass25 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23983i.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.setPlaceholder", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass26 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23980f.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.render", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass27 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23981g.mo5926a(hVar);
            }
        });
        mo30810a("biz.core.setContent", new AbstractC7948j<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass28 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                C8891a.this.f23982h.mo5926a(hVar);
            }
        });
        m37297h();
        m37298i();
        m37299j();
        m37296g();
        m37295f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onAttachedToWindow() {
        int i;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.getLayoutParams() == null) {
            C13479a.m54764b("CalendarWebView", "onAttachedToWindow(): parent is null");
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i2 = -1;
            if (viewGroup.getLayoutParams().width == 0) {
                i = -1;
            } else {
                i = viewGroup.getLayoutParams().width;
            }
            layoutParams.width = i;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (viewGroup.getLayoutParams().height != 0) {
                i2 = viewGroup.getLayoutParams().height;
            }
            layoutParams2.height = i2;
        }
        super.onAttachedToWindow();
    }

    /* renamed from: a */
    public void mo19616a() {
        resumeTimers();
        C13479a.m54772d("CalendarWebView", "monitor: start load template, webView = " + hashCode());
        loadUrl(C8890a.m37287c());
    }

    public void setAnalyticCallback(AbstractC8912c cVar) {
        this.f23975a.mo34187a(cVar);
    }

    public void setOnUrlLoadingCallback(AbstractC8922b bVar) {
        this.f23975a.mo34189a(bVar);
    }

    public void setRenderProcessListener(AbstractC8921a aVar) {
        this.f23975a.mo34188a(aVar);
    }

    /* renamed from: a */
    private void m37291a(final Runnable runnable) {
        this.f23977c.mo5925a(new AbstractC1178x<Boolean>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass24 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    runnable.run();
                    C13479a.m54768c("CalendarWebView", "ensureJSReady run: ");
                }
                C8891a.this.f23977c.mo5928b(this);
            }
        });
    }

    public void setBodyBackgroundColor(int i) {
        m37291a(new Runnable(i) {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.$$Lambda$a$Z9TrE6xgu2_fJVthRR9J0ofV7mI */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C8891a.lambda$Z9TrE6xgu2_fJVthRR9J0ofV7mI(C8891a.this, this.f$1);
            }
        });
    }

    public void setData(String str) {
        C13479a.m54764b("CalendarWebView", "setData(), webView = " + hashCode());
        setContent(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m37290a(int i) {
        evaluateJavascript("document.body.style.backgroundColor=\"" + String.format("#%06X", Integer.valueOf(i & 16777215)) + "\"", null);
    }

    /* renamed from: c */
    public void mo34134c(final ValueCallback<String> valueCallback) {
        final String uuid = UUID.randomUUID().toString();
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass17 */

            public void run() {
                C8891a.this.f23987n.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass17.C88971 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("requestId", (Object) uuid);
                        hVar.mo17188a(jSONObject);
                        C8891a.this.f23987n.mo5928b(this);
                    }
                });
            }
        });
        this.f23986l.mo5925a(new AbstractC1178x<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass18 */

            /* renamed from: a */
            public void onChanged(String str) {
                if (TextUtils.equals(C8891a.this.mo34129a(str, "requestId"), uuid)) {
                    try {
                        org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("content");
                        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("initialAttributedText");
                        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("apool");
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("initialAttributedText", optJSONObject2);
                        jSONObject.put("apool", optJSONObject3);
                        valueCallback.onReceiveValue(jSONObject.toString());
                    } catch (JSONException e) {
                        C13479a.m54759a("CalendarWebView", "getHtml onChanged(): error !!! ", e);
                    }
                    C8891a.this.f23986l.mo5928b(this);
                }
            }
        });
    }

    public void setContent(final String str) {
        C13479a.m54764b("CalendarWebView", "setContent, webView = " + hashCode());
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass11 */

            public void run() {
                C8891a.this.f23981g.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass11.C88941 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("content", (Object) str);
                            if (hVar != null) {
                                hVar.mo17188a(jSONObject);
                            }
                        } catch (Exception e) {
                            C13479a.m54759a("CalendarWebView", "onChanged(): ", e);
                        }
                        C8891a.this.f23981g.mo5928b(this);
                    }
                });
            }
        });
    }

    public void setCustomStyle(final WebEditorStyle webEditorStyle) {
        C13479a.m54764b("CalendarWebView", "setCustomStyle, webView = " + hashCode());
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.RunnableC89078 */

            public void run() {
                C8891a.this.f23978d.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.RunnableC89078.C89081 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        if (hVar != null) {
                            hVar.mo17189a(new EditorStyleData(webEditorStyle));
                        }
                        C8891a.this.f23978d.mo5928b(this);
                    }
                });
            }
        });
    }

    public void setEditable(final boolean z) {
        C13479a.m54764b("CalendarWebView", "setEditable, webView = " + hashCode());
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass19 */

            public void run() {
                C8891a.this.f23979e.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass19.C88981 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("editable", (Object) Boolean.valueOf(z));
                        if (hVar != null) {
                            hVar.mo17188a(jSONObject);
                        }
                        C8891a.this.f23979e.mo5928b(this);
                    }
                });
            }
        });
    }

    public void setPlaceHolder(final String str) {
        C13479a.m54764b("CalendarWebView", "setPlaceHolder, webView = " + hashCode());
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass10 */

            public void run() {
                C8891a.this.f23980f.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass10.C88931 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject.put("props", (Object) jSONObject2);
                            jSONObject2.put("text", (Object) str);
                            if (hVar != null) {
                                hVar.mo17188a(jSONObject);
                            }
                        } catch (Exception e) {
                            C13479a.m54759a("CalendarWebView", "onChanged(): ", e);
                        }
                        C8891a.this.f23980f.mo5928b(this);
                    }
                });
            }
        });
    }

    public void setPlaceholderStyle(final PlaceholderStyle placeholderStyle) {
        C13479a.m54764b("CalendarWebView", "setPlaceHolderSty, webView = " + hashCode());
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.RunnableC89099 */

            public void run() {
                C8891a.this.f23980f.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.RunnableC89099.C89101 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        if (hVar != null) {
                            hVar.mo17189a(new PlaceholderData(placeholderStyle));
                        }
                        C8891a.this.f23980f.mo5928b(this);
                    }
                });
            }
        });
    }

    public C8891a(Context context) {
        super(context);
        m37293d();
    }

    /* renamed from: a */
    private static String m37289a(Context context) {
        String str;
        try {
            str = WebSettings.getDefaultUserAgent(context.getApplicationContext());
        } catch (Exception unused) {
            str = System.getProperty("http.agent");
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                stringBuffer.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    private void setUserAgent(WebSettings webSettings) {
        String a = m37289a(getContext());
        if (TextUtils.isEmpty(a)) {
            a = "Mozilla/5.0 (Linux; Android 7.0; FRD-AL00 Build/HUAWEIFRD-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36";
        }
        webSettings.setUserAgentString(a + "DocEditorSdk" + C13618f.m55265a(getContext()));
        StringBuilder sb = new StringBuilder();
        sb.append("setUserAgent: ua = ");
        sb.append(webSettings.getUserAgentString());
        C13479a.m54772d("CalendarWebView", sb.toString());
    }

    /* renamed from: b */
    public void mo34132b(final ValueCallback<String> valueCallback) {
        C13479a.m54764b("CalendarWebView", "getHtmlText, webView = " + hashCode());
        final String uuid = UUID.randomUUID().toString();
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass15 */

            public void run() {
                C8891a.this.f23989p.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass15.C88961 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("requestId", (Object) uuid);
                        hVar.mo17188a(jSONObject);
                        C8891a.this.f23989p.mo5928b(this);
                    }
                });
            }
        });
        this.f23988o.mo5925a(new AbstractC1178x<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass16 */

            /* renamed from: a */
            public void onChanged(String str) {
                if (TextUtils.equals(C8891a.this.mo34129a(str, "requestId"), uuid)) {
                    try {
                        valueCallback.onReceiveValue(new org.json.JSONObject(str).optString("html"));
                    } catch (JSONException e) {
                        C13479a.m54759a("CalendarWebView", "getHtml onChanged(): error !!! ", e);
                    }
                    C8891a.this.f23988o.mo5928b(this);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo34135d(final ValueCallback<Boolean> valueCallback) {
        C13479a.m54764b("CalendarWebView", "hasModify(): webView = " + hashCode());
        final String uuid = UUID.randomUUID().toString();
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass20 */

            public void run() {
                C8891a.this.f23991r.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass20.C89001 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("requestId", (Object) uuid);
                        hVar.mo17188a(jSONObject);
                        C8891a.this.f23991r.mo5928b(this);
                    }
                });
            }
        });
        this.f23990q.mo5925a(new AbstractC1178x<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass21 */

            /* renamed from: a */
            public void onChanged(String str) {
                if (TextUtils.equals(C8891a.this.mo34129a(str, "requestId"), uuid)) {
                    try {
                        valueCallback.onReceiveValue(Boolean.valueOf(new org.json.JSONObject(str).optBoolean("isChanged")));
                    } catch (JSONException e) {
                        C13479a.m54759a("CalendarWebView", "getText onChanged(): error !!! ", e);
                    }
                    C8891a.this.f23990q.mo5928b(this);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34130a(final ValueCallback<String> valueCallback) {
        C13479a.m54764b("CalendarWebView", "getText, webView = " + hashCode());
        final String uuid = UUID.randomUUID().toString();
        m37291a(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass13 */

            public void run() {
                C8891a.this.f23985k.mo5925a(new AbstractC1178x<AbstractC7947h>() {
                    /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass13.C88951 */

                    /* renamed from: a */
                    public void onChanged(AbstractC7947h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("requestId", (Object) uuid);
                        hVar.mo17188a(jSONObject);
                        C8891a.this.f23985k.mo5928b(this);
                    }
                });
            }
        });
        this.f23984j.mo5925a(new AbstractC1178x<String>() {
            /* class com.bytedance.ee.bear.middleground.calendar.p440a.C8891a.AnonymousClass14 */

            /* renamed from: a */
            public void onChanged(String str) {
                if (TextUtils.equals(C8891a.this.mo34129a(str, "requestId"), uuid)) {
                    try {
                        valueCallback.onReceiveValue(new org.json.JSONObject(str).optString("text"));
                    } catch (JSONException e) {
                        C13479a.m54759a("CalendarWebView", "getText onChanged(): error !!! ", e);
                    }
                    C8891a.this.f23984j.mo5928b(this);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34131a(WebEditorToolbar webEditorToolbar) {
        C13479a.m54764b("CalendarWebView", "bindEditorToolbar(): webView = " + hashCode());
        this.f23992y.mo34275a(webEditorToolbar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m37292a(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
        return this.f23975a.mo35536b(webView, tTRenderProcessGoneDetail.didCrash(), tTRenderProcessGoneDetail.rendererPriority());
    }

    /* renamed from: a */
    public String mo34129a(String str, String str2) {
        String str3;
        JSONReader jSONReader = new JSONReader(new StringReader(str));
        jSONReader.startObject();
        while (true) {
            if (!jSONReader.hasNext()) {
                str3 = null;
                break;
            } else if (TextUtils.equals(str2, jSONReader.readString())) {
                str3 = jSONReader.readString();
                break;
            } else {
                jSONReader.readString();
            }
        }
        jSONReader.close();
        return str3;
    }
}

package com.ss.android.lark.mail.impl.uiframework.view.webview;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ee.bear.middleground.docsdk.C9306a;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b;
import com.ss.android.lark.mail.impl.p2168g.C42150b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e;
import com.ss.android.lark.mail.impl.uiframework.view.webview.larkwebview.DocSDKBridgeWebViewImpV2;
import com.ss.android.lark.mail.impl.uiframework.view.webview.p2222a.AbstractC43714a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.g */
public class C43728g extends AbstractC43714a {

    /* renamed from: a */
    public AbstractC43719c f110965a;

    /* renamed from: b */
    public boolean f110966b;

    /* renamed from: c */
    public TTWebViewExtension f110967c;

    /* renamed from: d */
    public final DocSDKBridgeWebViewImpV2 f110968d;

    /* renamed from: e */
    public int f110969e;

    /* renamed from: f */
    public long f110970f;

    /* renamed from: g */
    public long f110971g;

    /* renamed from: h */
    public final Map<String, MailImage> f110972h = new HashMap();

    /* renamed from: i */
    public final Map<String, List<String>> f110973i = new HashMap();

    /* renamed from: j */
    List<MailImage> f110974j = new ArrayList();

    /* renamed from: k */
    public final C43746i f110975k = new C43746i();

    /* renamed from: l */
    private C43743a f110976l;

    /* renamed from: m */
    private AbstractC43201b f110977m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153541a(WebResourceRequest webResourceRequest) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo153543d() {
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f, com.ss.android.lark.mail.impl.uiframework.view.webview.p2222a.AbstractC43714a
    /* renamed from: a */
    public C9306a mo35539a() {
        return C9306a.f25027a;
    }

    /* renamed from: a */
    public void mo155859a(final boolean z) {
        this.f110968d.getWebView().evaluateJavascript("ttwebview:/*getRenderBlockDur*/;", new ValueCallback<String>() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.C437313 */

            /* renamed from: a */
            public void onReceiveValue(final String str) {
                Log.m165388i("MailWebViewClient onReceiveValue s:" + str);
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.C437313.RunnableC437321 */

                    public void run() {
                        if (!TextUtils.isEmpty(str) && !"null".equals(str)) {
                            try {
                                if (!new JSONObject(str).isNull("getRenderBlockDur")) {
                                    String performanceTiming = C43728g.this.f110967c.getPerformanceTiming();
                                    if (C43728g.this.f110965a != null) {
                                        C42187a.m168504b(C43728g.this.f110965a.getContainerName(), performanceTiming);
                                    }
                                    if (!z) {
                                        return;
                                    }
                                    if (C43728g.this.f110965a == null || C43728g.this.f110965a.mo150631p() >= 2) {
                                        ((C42351b) C42344d.m169091a(C42351b.class, C43728g.this.f110965a.getContext())).mo152465b(-1);
                                        ((C42352c) C42344d.m169091a(C42352c.class, C43728g.this.f110965a.getContext())).mo152465b(-1);
                                        return;
                                    }
                                    C43728g.this.f110965a.mo150630o();
                                    Log.m165388i("MailWebViewClient crashRenderProcess");
                                    C43728g.this.f110968d.evaluateJavascript("ttwebview:/*crashRenderProcess*/;", null);
                                }
                            } catch (JSONException e) {
                                Log.m165388i("MailWebViewClient JSONException:" + e.getMessage());
                            }
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo155858a(List<MailImage> list, C43743a aVar) {
        this.f110974j = list;
        this.f110976l = aVar;
    }

    /* renamed from: g */
    public Handler mo155865g() {
        return CoreThreadPool.getBackgroundHandler();
    }

    /* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.g$a */
    public static class C43743a {

        /* renamed from: a */
        public final String f111007a;

        /* renamed from: b */
        private final boolean f111008b;

        /* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.g$a$a */
        public static class C43744a {

            /* renamed from: a */
            private String f111009a;

            /* renamed from: b */
            private boolean f111010b;

            /* renamed from: a */
            public C43743a mo155883a() {
                return new C43743a(this.f111009a, this.f111010b);
            }

            /* renamed from: a */
            public C43744a mo155881a(String str) {
                this.f111009a = str;
                return this;
            }

            /* renamed from: a */
            public C43744a mo155882a(boolean z) {
                this.f111010b = z;
                return this;
            }
        }

        private C43743a(String str, boolean z) {
            this.f111007a = str;
            this.f111008b = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo155864f() {
        Log.m165388i("MailWebViewClient clearTimeout");
        this.f110966b = true;
    }

    /* renamed from: i */
    public void mo155867i() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437418 */

            public void run() {
                boolean z;
                if (C43728g.this.f110969e > 0) {
                    int size = C43728g.this.f110969e - C43728g.this.f110972h.size();
                    if (size > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C42187a.m168491a(z, C43728g.this.f110969e, size, C43728g.this.f110970f, C43728g.this.f110971g, C43728g.this.f110975k.mo155884a());
                }
                C43728g.this.f110969e = 0;
                C43728g.this.f110971g = 0;
                C43728g.this.f110970f = 0;
                C43728g.this.f110972h.clear();
                C43728g.this.f110975k.mo155887b();
            }
        });
    }

    /* renamed from: c */
    private void mo153542c() {
        TTWebViewExtension tTWebViewExtension = new TTWebViewExtension(this.f110968d.getWebView());
        this.f110967c = tTWebViewExtension;
        tTWebViewExtension.setPerformanceTimingListener((IWebViewExtension.PerformanceTimingListener) new IWebViewExtension.PerformanceTimingListener() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.C437291 */

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onBodyParsing() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onCustomTagNotify(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
            public void onDOMContentLoaded() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onFirstImagePaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
            public void onFirstMeaningfulPaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onFirstScreenPaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public /* synthetic */ void onGetJavaScriptStackTrace(String str) {
                IPerformanceTimingListenersdk113.CC.$default$onGetJavaScriptStackTrace(this, str);
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onIframeLoaded(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onJSError(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onNetFinish() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onReceivedResponse(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onReceivedSpecialEvent(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
            public void onFirstContentfulPaint() {
                Log.m165388i("MailWebViewClient onFirstContentfulPaint");
                C43728g.this.mo155863e();
            }
        });
        this.f110968d.evaluateJavascript("ttwebview:/*enableTTLogEvent*/;", null);
    }

    /* renamed from: e */
    public void mo155863e() {
        if (!this.f110966b) {
            this.f110966b = true;
            AbstractC43719c cVar = this.f110965a;
            if (cVar != null) {
                cVar.mo150632q();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo155866h() {
        if (this.f110968d.getContext() instanceof Activity) {
            return C42150b.m168218a().mo152115a((Activity) this.f110968d.getContext());
        }
        return C42150b.m168218a().mo152117c();
    }

    /* renamed from: j */
    public void mo155868j() {
        Log.m165389i("MailWebViewClient", "cancelImageDownloadTasks");
        Set<String> keySet = this.f110973i.keySet();
        if (!CollectionUtils.isEmpty(keySet)) {
            try {
                C41816b.m166115a().mo150158y().mo150171b((String[]) keySet.toArray(new String[this.f110973i.size()]));
            } catch (Throwable unused) {
            }
            mo155865g().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437429 */

                public void run() {
                    C43728g.this.f110973i.clear();
                }
            });
        }
    }

    /* renamed from: e */
    private String m173380e(String str) {
        return str.split("&r=")[0];
    }

    /* renamed from: a */
    public void mo155853a(final MailImage mailImage) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437407 */

            public void run() {
                MailImage mailImage = mailImage;
                if (mailImage == null || TextUtils.isEmpty(mailImage.mo151480f())) {
                    Log.m165383e("MailWebViewClient", "recordDownloadImage invalid data");
                    return;
                }
                C43728g.this.f110969e++;
                C43728g.this.f110971g += mailImage.mo151482h();
                String f = mailImage.mo151480f();
                MailImage mailImage2 = C43728g.this.f110972h.get(f);
                if (mailImage2 != null) {
                    C43728g.this.f110970f += mailImage2.mo151482h();
                    C43728g.this.f110975k.mo155886a(f, mailImage);
                    return;
                }
                C43728g.this.f110972h.put(mailImage.mo151480f(), mailImage);
            }
        });
    }

    /* renamed from: f */
    private boolean m173381f(String str) {
        AbstractC43201b bVar;
        if (!TextUtils.isEmpty(str) && (bVar = this.f110977m) != null) {
            return bVar.mo154407a(str);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo155860b(String str) {
        String e = m173380e(str);
        if (!e.contains(":")) {
            return "";
        }
        String[] split = e.split(":");
        if (split.length > 1) {
            return split[1];
        }
        return "";
    }

    public C43728g(DocSDKBridgeWebViewImpV2 docSDKBridgeWebViewImpV2) {
        super(docSDKBridgeWebViewImpV2);
        this.f110968d = docSDKBridgeWebViewImpV2;
        mo153542c();
    }

    /* renamed from: c */
    private boolean m173379c(WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !m173381f(webResourceRequest.getUrl().toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public MailImage mo155861c(String str) {
        String str2;
        if (this.f110974j == null) {
            return null;
        }
        String str3 = str.split("_msgId")[0];
        if (str3.length() < str.length()) {
            str2 = str.substring(str3.length() + 6);
        } else {
            str2 = "";
        }
        for (int i = 0; i < this.f110974j.size(); i++) {
            MailImage mailImage = this.f110974j.get(i);
            if (str3.equals(mailImage.mo151481g()) && (C43819s.m173689a(str2) || str2.equals(mailImage.mo151474d()))) {
                return mailImage;
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo155862d(String str) {
        String str2;
        if (this.f110974j == null) {
            return -1;
        }
        String str3 = str.split("_msgId")[0];
        if (str3.length() < str.length()) {
            str2 = str.substring(str3.length() + 6);
        } else {
            str2 = "";
        }
        for (int i = 0; i < this.f110974j.size(); i++) {
            MailImage mailImage = this.f110974j.get(i);
            if (str3.equals(mailImage.mo151481g()) && (C43819s.m173689a(str2) || str2.equals(mailImage.mo151474d()))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo155854a(AbstractC43201b bVar) {
        this.f110977m = bVar;
    }

    /* renamed from: b */
    private WebResourceResponse m173376b(WebResourceRequest webResourceRequest) {
        String str;
        MailImage mailImage;
        boolean z;
        String uri = webResourceRequest.getUrl().toString();
        String b = mo155860b(uri);
        if (TextUtils.isEmpty(b) || CollectionUtils.isEmpty(this.f110974j)) {
            if (!TextUtils.isEmpty(b) && CollectionUtils.isEmpty(this.f110974j)) {
                Log.m165383e("MailWebViewClient", "handleCidRequest no_filetoken");
                if (this.f110976l != null) {
                    str = b + this.f110976l.f111007a;
                } else {
                    str = b + System.currentTimeMillis();
                }
                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str)).mo152380b("download");
                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str)).mo152369a(-1, "no_filetoken");
                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
            }
            Log.m165383e("MailWebViewClient", "handleCidRequest cidValue null");
            return null;
        }
        int d = mo155862d(b);
        if (d < 0) {
            mailImage = null;
        } else {
            mailImage = this.f110974j.get(d);
        }
        if (mailImage != null) {
            AbstractC43201b bVar = this.f110977m;
            if (bVar == null || !bVar.mo154406a() || TextUtils.isEmpty(mailImage.mo151486k())) {
                long h = mailImage.mo151482h();
                C43721e eVar = new C43721e(mailImage);
                WebResourceResponse b2 = eVar.mo155842b();
                StringBuilder sb = new StringBuilder();
                sb.append("handleCidRequest : ");
                sb.append(uri);
                sb.append("; ");
                if (b2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                Log.m165389i("MailWebViewClient", sb.toString());
                if (b2 == null) {
                    b2 = mo153540a(eVar, uri, webResourceRequest, uri);
                } else {
                    mo153541a(webResourceRequest);
                    if (h > 0 && !TextUtils.isEmpty(uri)) {
                        ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), uri)).mo152423a(true, h);
                    }
                }
                if (b2 != null) {
                    return b2;
                }
            } else {
                C43721e eVar2 = new C43721e(mailImage);
                eVar2.mo155843b(mailImage.mo151486k());
                WebResourceResponse b3 = eVar2.mo155842b();
                if (b3 != null) {
                    return b3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155855a(AbstractC43719c cVar) {
        this.f110965a = cVar;
    }

    /* renamed from: a */
    public void mo155856a(final String str) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437396 */

            public void run() {
                if (C43728g.this.f110968d != null) {
                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                    jSONObject.put("src", (Object) str);
                    C43728g.this.f110968d.mo22332a("javascript:loadImgSuccess", jSONObject);
                    Log.m165379d("MailWebViewClient", "informDownloadImageSuccess: " + str);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo155857a(List<MailImage> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f110974j.addAll(list);
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f, com.bytedance.ee.larkwebview.base.C13405d
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.m165388i("onRenderProcessGone 33");
        AbstractC43719c cVar = this.f110965a;
        if (cVar != null) {
            cVar.mo150561a(webView);
        }
        C41988g.m166973d();
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f, android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!mo153543d()) {
            return true;
        }
        C42187a.m168475a(webResourceRequest);
        if (m173379c(webResourceRequest)) {
            return true;
        }
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !C42699a.m170291j(webView.getContext(), webResourceRequest.getUrl().toString())) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155852a(int i, final boolean z) {
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.jsblockreload")) {
            long a = C43745h.m173414a(i);
            AbstractC43719c cVar = this.f110965a;
            if (!(cVar == null || cVar.getContext() == null)) {
                ((C42351b) C42344d.m169091a(C42351b.class, this.f110965a.getContext())).mo152463a(i, a);
                ((C42352c) C42344d.m169091a(C42352c.class, this.f110965a.getContext())).mo152463a(i, a);
            }
            C43849u.m173827a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437302 */

                public void run() {
                    Log.m165388i("MailWebViewClient registeTimeout mIsRenderDone:" + C43728g.this.f110966b);
                    if (!C43728g.this.f110966b) {
                        if (!(C43728g.this.f110965a == null || C43728g.this.f110965a.getContext() == null)) {
                            ((C42351b) C42344d.m169091a(C42351b.class, C43728g.this.f110965a.getContext())).mo152472i();
                            ((C42352c) C42344d.m169091a(C42352c.class, C43728g.this.f110965a.getContext())).mo152472i();
                        }
                        C43728g.this.mo155859a(z);
                    }
                }
            }, a);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f, android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!mo153543d()) {
            return true;
        }
        C42187a.m168566r(str);
        if (!m173381f(str) && !C42699a.m170291j(webView.getContext(), str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r5, android.webkit.WebResourceRequest r6) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f
    /* renamed from: a */
    public void mo35540a(String str, Map<String, String> map) {
        Log.m165389i("onTrackEvent", "onTrackEvent s:" + str);
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            C41816b.m166115a().mo150114D().mo150182b(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private void m173377b(final String str, final C43721e eVar, final String str2) {
        mo155865g().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437365 */

            public void run() {
                MailImage mailImage;
                final long j;
                C43721e eVar = eVar;
                if (eVar == null) {
                    mailImage = null;
                } else {
                    mailImage = eVar.mo155847f();
                }
                if (mailImage == null) {
                    j = 0;
                } else {
                    j = mailImage.mo151482h();
                }
                if (TextUtils.isEmpty(str) || eVar == null) {
                    Log.m165383e("MailWebViewClient", "loadImageBasedOnFileToken invalid parameter");
                } else if (mailImage == null || TextUtils.isEmpty(mailImage.mo151480f())) {
                    Log.m165383e("MailWebViewClient", "loadImageBasedOnFileToken empty token");
                } else {
                    final String f = mailImage.mo151480f();
                    List<String> list = C43728g.this.f110973i.get(f);
                    boolean z = false;
                    if (list == null) {
                        list = new ArrayList<>();
                        C43728g.this.f110973i.put(f, list);
                        z = true;
                    }
                    list.add(str);
                    if (z) {
                        C43728g.this.mo155853a(mailImage);
                        eVar.mo155841a(C43728g.this.mo155866h(), new C43721e.AbstractC43724a() {
                            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437365.C437371 */

                            @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                            /* renamed from: a */
                            public void mo155835a() {
                                Log.m165389i("MailWebViewClient", "loadImageBasedOnFileToken onSuccess");
                                C43728g.this.mo155865g().post(new Runnable() {
                                    /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437365.C437371.RunnableC437381 */

                                    public void run() {
                                        List<String> list = C43728g.this.f110973i.get(f);
                                        if (CollectionUtils.isEmpty(list)) {
                                            Log.m165383e("MailWebViewClient", "loadImageBasedOnFileToken onSuccess token not hit");
                                            return;
                                        }
                                        for (String str : list) {
                                            if (TextUtils.isEmpty(str)) {
                                                Log.m165383e("MailWebViewClient", "loadImageBasedOnFileToken invalid src");
                                            } else {
                                                C43728g.this.mo155856a(str);
                                            }
                                        }
                                    }
                                });
                                C43728g.this.f110975k.mo155888b(eVar.mo155845d());
                                if (j <= 0 || TextUtils.isEmpty(str2)) {
                                    Log.m165389i("MailWebViewClient", "MessageImageLoadEventMonitor not end");
                                } else {
                                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152423a(false, j);
                                }
                            }

                            @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                            /* renamed from: b */
                            public void mo155837b() {
                                Log.m165389i("MailWebViewClient", "loadImageBasedOnFileToken onStart");
                                C43728g.this.f110975k.mo155885a(eVar.mo155845d());
                                if (j > 0 && !TextUtils.isEmpty(str2)) {
                                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152403l();
                                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152368a();
                                }
                            }

                            @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                            /* renamed from: a */
                            public void mo155836a(String str, int i) {
                                Log.m165383e("MailWebViewClient", "loadImageBasedOnFileToken onError");
                                C43728g.this.f110975k.mo155888b(eVar.mo155845d());
                                if (j <= 0 || TextUtils.isEmpty(str2)) {
                                    Log.m165389i("MailWebViewClient", "MessageImageLoadEventMonitor not end");
                                    return;
                                }
                                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152423a(false, j);
                                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152369a(i, str);
                                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, j);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Log.m165383e("MailWebViewClient", "onReceivedError :" + webResourceError);
    }

    /* renamed from: a */
    private void m173375a(final String str, final C43721e eVar, final String str2) {
        MailImage mailImage;
        final long j;
        if (eVar != null) {
            final String b = mo155860b(str);
            if (eVar == null) {
                mailImage = null;
            } else {
                mailImage = eVar.mo155847f();
            }
            if (mailImage == null) {
                j = 0;
            } else {
                j = mailImage.mo151482h();
            }
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437334 */

                public void run() {
                    Log.m165388i("loadImageAsync start : " + b);
                    eVar.mo155841a(C43728g.this.mo155866h(), new C43721e.AbstractC43724a() {
                        /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437334.C437341 */

                        @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                        /* renamed from: a */
                        public void mo155835a() {
                            Log.m165388i("loadImageAsync success: " + b);
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g.RunnableC437334.C437341.RunnableC437351 */

                                public void run() {
                                    if (C43728g.this.f110968d != null) {
                                        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                                        jSONObject.put("src", (Object) str);
                                        jSONObject.put("cid", (Object) b);
                                        C43728g.this.f110968d.mo22332a("javascript:loadImgSuccess", jSONObject);
                                    }
                                }
                            });
                            C43728g.this.f110975k.mo155888b(eVar.mo155845d());
                            if (j <= 0 || TextUtils.isEmpty(str2)) {
                                Log.m165389i("MailWebViewClient", "MessageImageLoadEventMonitor not end");
                            } else {
                                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152423a(false, j);
                            }
                        }

                        @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                        /* renamed from: b */
                        public void mo155837b() {
                            Log.m165389i("MailWebViewClient", "loadImageAsync onStart");
                            C43728g.this.f110975k.mo155885a(eVar.mo155845d());
                            if (j > 0 && !TextUtils.isEmpty(str2)) {
                                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152403l();
                                ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152368a();
                            }
                        }

                        @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                        /* renamed from: a */
                        public void mo155836a(String str, int i) {
                            Log.m165389i("MailWebViewClient", "loadImageAsync onError");
                            C43728g.this.f110975k.mo155888b(eVar.mo155845d());
                            if (j <= 0 || TextUtils.isEmpty(str2)) {
                                Log.m165389i("MailWebViewClient", "MessageImageLoadEventMonitor not end");
                                return;
                            }
                            ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152423a(false, j);
                            ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152369a(i, str);
                            ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), str2)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, j);
                        }
                    });
                }
            });
            return;
        }
        Log.m165389i("MailWebViewClient", "MessageImageLoadEventMonitor not end");
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String path = webResourceRequest.getUrl().getPath();
        int statusCode = webResourceResponse.getStatusCode();
        if (path != null && !TextUtils.isEmpty(path) && path.contains(C41816b.m166115a().mo150145l())) {
            C42187a.m168497b(statusCode);
        }
        Log.m165383e("MailWebViewClient", "onReceivedHttpError :" + statusCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebResourceResponse mo153540a(C43721e eVar, String str, WebResourceRequest webResourceRequest, String str2) {
        if (eVar == null) {
            Log.m165389i("MailWebViewClient", "MessageImageLoadEventMonitor not end");
            return null;
        }
        if (eVar.mo155846e()) {
            m173377b(str, eVar, str2);
        } else {
            m173375a(str, eVar, str2);
            mo155853a(eVar.mo155847f());
        }
        return null;
    }
}

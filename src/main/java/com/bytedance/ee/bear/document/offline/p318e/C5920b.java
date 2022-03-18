package com.bytedance.ee.bear.document.offline.p318e;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.document.offline.e.b */
public class C5920b extends WebViewClient {

    /* renamed from: a */
    public String f16573a = "DocSessionEngine";

    /* renamed from: b */
    public AbstractC5923c f16574b;

    /* renamed from: c */
    public void mo23898c() {
        AbstractC5923c cVar = this.f16574b;
        if (cVar != null) {
            cVar.mo23906c();
        }
    }

    /* renamed from: a */
    public void mo23896a() {
        C13479a.m54764b(this.f16573a, "checkOfflineRes()...");
        AbstractC5923c cVar = this.f16574b;
        if (cVar != null) {
            cVar.mo23903a();
        }
    }

    /* renamed from: b */
    public boolean mo23897b() {
        C13479a.m54764b(this.f16573a, "isSim()...");
        AbstractC5923c cVar = this.f16574b;
        if (cVar != null) {
            return cVar.mo23905b();
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo23895a(final DocBridgeWebViewV2 docBridgeWebViewV2, final String str) {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238020d(new Function<String, Boolean>() {
            /* class com.bytedance.ee.bear.document.offline.p318e.C5920b.C59222 */

            /* renamed from: a */
            public Boolean apply(String str) throws Exception {
                if (C5920b.this.f16574b != null) {
                    C5920b.this.f16574b.mo23904a(str);
                }
                docBridgeWebViewV2.mo22365l();
                docBridgeWebViewV2.mo22336b();
                docBridgeWebViewV2.resumeTimers();
                docBridgeWebViewV2.loadUrl(str);
                String str2 = C5920b.this.f16573a;
                C13479a.m54764b(str2, "***reportPreloadHtml*** preloadHtml start  preloadUrl: " + str);
                return true;
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC5923c cVar = this.f16574b;
        if (cVar != null) {
            return cVar.mo23902a(webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
        }
        C13479a.m54775e(this.f16573a, "shouldInterceptRequest()...2");
        return null;
    }

    public C5920b(WebView webView, C10917c cVar, String str) {
        ServiceWorkerController instance;
        if (!TextUtils.isEmpty(str)) {
            this.f16573a += "_" + str;
        }
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.offlineresource_interceptor", false);
        C13479a.m54764b(this.f16573a, "shouldInterceptRequest  OFFLINERESOURCE_INTERCEPTOR ret: " + a);
        if (a) {
            this.f16574b = new C5927e(webView.getContext().getApplicationContext(), cVar, str);
        } else {
            this.f16574b = new C5924d(webView.getContext().getApplicationContext(), cVar, str);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (DocOpenConfig.m22764e() && (instance = ServiceWorkerController.getInstance()) != null) {
                    instance.setServiceWorkerClient(new ServiceWorkerClient() {
                        /* class com.bytedance.ee.bear.document.offline.p318e.C5920b.C59211 */

                        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                            String str = C5920b.this.f16573a;
                            C13479a.m54764b(str, "shouldInterceptRequest() ServiceWorkerController   request= " + webResourceRequest.getUrl());
                            if (C5920b.this.f16574b != null) {
                                return C5920b.this.f16574b.mo23902a(webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
                            }
                            C13479a.m54775e(C5920b.this.f16573a, "shouldInterceptRequest()...3");
                            return null;
                        }
                    });
                }
            } catch (Throwable th) {
                C13479a.m54758a(this.f16573a, "ServiceWorkerController()...e: " + th);
            }
        }
        C13479a.m54772d(this.f16573a, "initDocSessionEngine()...");
    }
}

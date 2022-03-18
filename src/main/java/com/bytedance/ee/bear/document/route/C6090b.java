package com.bytedance.ee.bear.document.route;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.C5628ac;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.document.route.b */
public class C6090b extends WebViewClient {

    /* renamed from: a */
    private C6095s f16971a;

    /* renamed from: b */
    private boolean f16972b;

    /* renamed from: c */
    private C6092a f16973c = new C6092a();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.route.b$a */
    public class C6092a {

        /* renamed from: b */
        private long f16975b;

        /* renamed from: c */
        private String f16976c;

        private C6092a() {
        }

        /* renamed from: a */
        public final boolean mo24591a(WebView webView, String str) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!TextUtils.equals(this.f16976c, str) || currentTimeMillis - this.f16975b >= 500) {
                this.f16975b = currentTimeMillis;
                this.f16976c = str;
                return C6090b.this.overrideUrlLoading(webView, str);
            }
            C13479a.m54775e("DebounceShouldOverrideUrlLoading", "So fast click , ignored !");
            return true;
        }
    }

    /* renamed from: a */
    private void m24621a(String str) {
        C13479a.m54764b("DocumentRouterWebViewClient", "dispatchAsNormalWeb");
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f16973c.mo24591a(webView, str);
    }

    C6090b(C6095s sVar, boolean z) {
        this.f16971a = sVar;
        this.f16972b = z;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean overrideUrlLoading(WebView webView, String str) {
        C13479a.m54764b("DocumentRouterWebViewClient", "overrideUrlLoading:" + C13598b.m55197d(str));
        if (!C6313i.m25327a().mo25392c(str)) {
            m24621a(str);
            return true;
        }
        m24620a(webView, str);
        return true;
    }

    /* renamed from: a */
    private void m24620a(WebView webView, String str) {
        C13479a.m54764b("DocumentRouterWebViewClient", "dispatchDocumentUrl");
        AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class);
        RouteBean routeBean = new RouteBean();
        routeBean.mo40622h(str);
        String a = C5130a.m20993a(str, "tab_link");
        BearUrl g = C6313i.m25327a().mo25399g(a);
        if (!C5628ac.m22844a(a, this.f16971a)) {
            if (C4511g.m18594d().mo17342C()) {
                String host = Uri.parse(str).getHost();
                int b = C8275a.m34051b(g.f17446a);
                String str2 = C6313i.f17509a;
                if (!TextUtils.isEmpty(str2) && !host.endsWith(str2) && Arrays.binarySearch(C8275a.f22381n, b) >= 0) {
                    C13479a.m54764b("DocumentRouterWebViewClient", "originHost = " + host);
                    fVar.mo17293a(a, routeBean);
                    return;
                }
            }
            if (this.f16972b) {
                webView.clearHistory();
            }
            fVar.mo17293a(a, routeBean);
        }
    }
}

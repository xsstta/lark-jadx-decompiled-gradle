package com.bytedance.ee.webapp.v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ee.larkwebview.service.AbstractC13468c;
import com.bytedance.ee.larkwebview.service.AbstractC13469d;
import com.bytedance.ee.larkwebview.service.AbstractC13475j;
import com.bytedance.ee.webapp.AbstractC13762b;
import com.bytedance.ee.webapp.C13805h;

/* renamed from: com.bytedance.ee.webapp.v2.f */
public class C13845f implements AbstractC13468c, AbstractC13469d, AbstractC13475j {
    @Override // com.bytedance.ee.larkwebview.service.AbstractC13468c
    /* renamed from: a */
    public void mo49922a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13468c
    /* renamed from: a */
    public void mo49923a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13475j
    /* renamed from: b */
    public WebResourceResponse mo49927b(WebView webView, WebResourceRequest webResourceRequest) {
        return null;
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13475j
    /* renamed from: b */
    public boolean mo49928b(WebView webView, String str) {
        return false;
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13475j
    /* renamed from: c */
    public WebResourceResponse mo49929c(WebView webView, String str) {
        return null;
    }

    /* renamed from: a */
    private Context m56124a(WebView webView) {
        return webView.getContext().getApplicationContext();
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13475j
    /* renamed from: a */
    public boolean mo49926a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return mo49928b(webView, webResourceRequest.getUrl().toString());
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13469d
    /* renamed from: a */
    public void mo49924a(WebView webView, String str) {
        for (AbstractC13762b bVar : C13805h.m55929a().mo50869b().values()) {
            if (bVar != null) {
                bVar.mo50750b(webView, m56124a(webView), str, C13805h.m55929a().mo50870c());
            }
        }
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13468c
    /* renamed from: a */
    public void mo49921a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        for (AbstractC13762b bVar : C13805h.m55929a().mo50869b().values()) {
            if (bVar != null) {
                bVar.mo50747a(webView, m56124a(webView), webView.getUrl(), sslError, C13805h.m55929a().mo50870c());
            }
        }
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13469d
    /* renamed from: a */
    public void mo49925a(WebView webView, String str, Bitmap bitmap) {
        for (AbstractC13762b bVar : C13805h.m55929a().mo50869b().values()) {
            if (bVar != null) {
                bVar.mo50749a(webView, m56124a(webView), str, C13805h.m55929a().mo50870c());
            }
        }
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13468c
    /* renamed from: a */
    public void mo49920a(WebView webView, int i, String str, String str2) {
        for (AbstractC13762b bVar : C13805h.m55929a().mo50869b().values()) {
            if (bVar != null) {
                bVar.mo50748a(webView, m56124a(webView), str2, "Error", C13805h.m55929a().mo50870c());
            }
        }
    }
}

package com.ss.android.lark.mail.impl.mailtoolbar;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42799b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43716b;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.a */
public class C42753a extends C43728g {

    /* renamed from: l */
    private final String f108891l = "ComposeWebViewClient";

    /* renamed from: m */
    private final AbstractC42759b f108892m;

    /* renamed from: n */
    private final Map<WebResourceRequest, Long> f108893n = new HashMap();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g
    /* renamed from: d */
    public boolean mo153543d() {
        return false;
    }

    /* renamed from: c */
    public void mo153542c() {
        mo155858a(this.f108892m.mo150922g(), new C43728g.C43743a.C43744a().mo155881a("").mo155882a(false).mo155883a());
    }

    protected C42753a(AbstractC42759b bVar) {
        super(C41988g.m166978i());
        this.f108892m = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g
    /* renamed from: a */
    public void mo153541a(WebResourceRequest webResourceRequest) {
        Long l = this.f108893n.get(webResourceRequest);
        if (l != null) {
            C42187a.m168473a(SystemClock.uptimeMillis() - l.longValue(), true);
        }
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g, android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Log.m165389i("ComposeWebViewClient", "shouldInterceptRequest");
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url.toString();
        if (uri.startsWith("cid")) {
            String str = C42799b.mImgMap.get(mo155860b(uri));
            try {
                if (!C43819s.m173689a(str)) {
                    if (!new File(str).exists()) {
                        Log.m165383e("ComposeWebViewClient", "shouldInterceptRequest cid invalid file");
                    }
                    return new WebResourceResponse("*/*", "utf-8", new FileInputStream(str));
                }
                Log.m165383e("ComposeWebViewClient", "shouldInterceptRequest cid empty file path");
                this.f108893n.put(webResourceRequest, Long.valueOf(SystemClock.uptimeMillis()));
            } catch (Exception e) {
                Log.m165384e("ComposeWebViewClient", "shouldInterceptRequest cid", e);
            }
        }
        String scheme = url.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            scheme.hashCode();
            if (scheme.equals("https")) {
                String queryParameter = url.getQueryParameter("isShare");
                if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals("true")) {
                    String queryParameter2 = url.getQueryParameter("cid");
                    String queryParameter3 = url.getQueryParameter("token");
                    String queryParameter4 = url.getQueryParameter("size");
                    if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3) && !TextUtils.isEmpty(queryParameter4)) {
                        MailImage mailImage = new MailImage();
                        mailImage.mo151475d(queryParameter2);
                        mailImage.mo151473c(queryParameter3);
                        String queryParameter5 = url.getQueryParameter("fileType");
                        if (TextUtils.isEmpty(queryParameter5)) {
                            queryParameter5 = "png";
                        }
                        mailImage.mo151472b(queryParameter3 + "." + queryParameter5);
                        try {
                            mailImage.mo151469a(Long.parseLong(queryParameter4));
                        } catch (Exception e2) {
                            Log.m165384e("ComposeWebViewClient", "shouldInterceptRequest", e2);
                        }
                        AbstractC42759b bVar = this.f108892m;
                        if (bVar != null) {
                            bVar.mo150893a(mailImage);
                        }
                    }
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g
    /* renamed from: a */
    public WebResourceResponse mo153540a(C43721e eVar, String str, WebResourceRequest webResourceRequest, String str2) {
        return new C43716b(mo155866h(), eVar, this.f108893n.get(webResourceRequest));
    }
}

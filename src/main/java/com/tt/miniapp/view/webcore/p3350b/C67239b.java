package com.tt.miniapp.view.webcore.p3350b;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.view.webcore.p3350b.AbstractC67242e;
import java.io.ByteArrayInputStream;
import java.net.URLConnection;

/* renamed from: com.tt.miniapp.view.webcore.b.b */
public class C67239b implements AbstractC67242e<WebResourceRequest, WebResourceResponse> {

    /* renamed from: a */
    private IAppContext f169729a;

    public C67239b(IAppContext iAppContext) {
        this.f169729a = iAppContext;
    }

    @Override // com.tt.miniapp.view.webcore.p3350b.AbstractC67242e
    /* renamed from: a */
    public C67248h<WebResourceResponse> mo233843a(AbstractC67242e.AbstractC67243a<WebResourceRequest, WebResourceResponse> aVar) {
        C67247g<WebResourceRequest> a = aVar.mo233844a();
        Uri url = a.f169745a.getUrl();
        if (!"https".equals(url.getScheme()) || !"tmaservice.developer.toutiao.com".equals(url.getHost())) {
            return aVar.mo233845a(a);
        }
        if ("page-frame.html".equals(url.getLastPathSegment())) {
            return new C67248h<>(C67244f.m262064a(this.f169729a, "page-frame.html"));
        }
        if ("ttjssdk".equals(url.getQueryParameter("from"))) {
            return new C67248h<>(C67244f.m262062a(this.f169729a, url));
        }
        if ("components".equals(url.getQueryParameter("from"))) {
            return new C67248h<>(C67244f.m262063a(this.f169729a, url, "components"));
        }
        String a2 = C67244f.m262065a(url);
        if (!a2.endsWith(".svg") || StreamLoader.findFile(a2, this.f169729a) == null) {
            return new C67248h<>(new WebResourceResponse("text/plain", "UTF-8", C67244f.m262068b(this.f169729a, a2)));
        }
        return new C67248h<>(new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(a2), "UTF-8", new ByteArrayInputStream(StreamLoader.loadByteFromStream(a2, this.f169729a))));
    }
}

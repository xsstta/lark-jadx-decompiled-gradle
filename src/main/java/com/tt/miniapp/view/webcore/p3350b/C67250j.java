package com.tt.miniapp.view.webcore.p3350b;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.view.webcore.p3350b.AbstractC67242e;

/* renamed from: com.tt.miniapp.view.webcore.b.j */
public class C67250j implements AbstractC67242e<WebResourceRequest, WebResourceResponse> {

    /* renamed from: a */
    private IAppContext f169748a;

    public C67250j(IAppContext iAppContext) {
        this.f169748a = iAppContext;
    }

    @Override // com.tt.miniapp.view.webcore.p3350b.AbstractC67242e
    /* renamed from: a */
    public C67248h<WebResourceResponse> mo233843a(AbstractC67242e.AbstractC67243a<WebResourceRequest, WebResourceResponse> aVar) {
        C67247g<WebResourceRequest> a = aVar.mo233844a();
        Uri url = a.f169745a.getUrl();
        if ("ttjssdk".equals(url.getScheme())) {
            return new C67248h<>(C67244f.m262062a(this.f169748a, url));
        }
        return aVar.mo233845a(a);
    }
}

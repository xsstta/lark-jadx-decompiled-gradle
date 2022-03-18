package com.tt.miniapp.view.webcore.p3350b;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.view.webcore.p3350b.AbstractC67242e;

/* renamed from: com.tt.miniapp.view.webcore.b.a */
public class C67238a implements AbstractC67242e<WebResourceRequest, WebResourceResponse> {
    @Override // com.tt.miniapp.view.webcore.p3350b.AbstractC67242e
    /* renamed from: a */
    public C67248h<WebResourceResponse> mo233843a(AbstractC67242e.AbstractC67243a<WebResourceRequest, WebResourceResponse> aVar) {
        try {
            AppBrandLogger.m52829e("resource_interceptor", "not found resource:" + aVar.mo233844a().f169745a.toString());
            return null;
        } catch (Exception e) {
            AppBrandLogger.m52829e("DefaultResourceInterceptor error:", e.getMessage(), e);
            return null;
        }
    }
}

package com.tt.miniapp.view.webcore.p3350b;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.LocationRequest;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.view.webcore.p3350b.AbstractC67242e;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLConnection;
import java.util.HashMap;

/* renamed from: com.tt.miniapp.view.webcore.b.i */
public class C67249i implements AbstractC67242e<WebResourceRequest, WebResourceResponse> {

    /* renamed from: a */
    private IAppContext f169747a;

    public C67249i(IAppContext iAppContext) {
        this.f169747a = iAppContext;
    }

    /* renamed from: b */
    private C67248h<WebResourceResponse> m262071b(AbstractC67242e.AbstractC67243a<WebResourceRequest, WebResourceResponse> aVar) {
        C67247g<WebResourceRequest> a = aVar.mo233844a();
        Uri url = a.f169745a.getUrl();
        AppBrandLogger.m52830i("TTFileResourceInterceptor", "standardIntercept urlString:" + url);
        TTFile gVar = new TTFile(url.toString());
        if (gVar.mo235649c()) {
            return new C67248h<>(m262070a(gVar, this.f169747a));
        }
        return aVar.mo233845a(a);
    }

    @Override // com.tt.miniapp.view.webcore.p3350b.AbstractC67242e
    /* renamed from: a */
    public C67248h<WebResourceResponse> mo233843a(AbstractC67242e.AbstractC67243a<WebResourceRequest, WebResourceResponse> aVar) {
        if (TTFileHelper.m264259a("imageComponent", this.f169747a)) {
            return m262071b(aVar);
        }
        C67247g<WebResourceRequest> a = aVar.mo233844a();
        String uri = a.f169745a.getUrl().toString();
        if (!uri.startsWith("ttfile")) {
            return aVar.mo233845a(a);
        }
        String b = ((AbstractC67722a) this.f169747a.findServiceByInterface(AbstractC67722a.class)).mo235082b(uri);
        File file = new File(b);
        if (!file.exists() || !file.isFile() || !C67404a.m262266a(this.f169747a).mo234080b(file)) {
            return new C67248h<>(new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0])));
        }
        byte[] readBytes = IOUtils.readBytes(file.getAbsolutePath());
        HashMap hashMap = new HashMap();
        hashMap.put("Access-Control-Allow-Origin", "https://tmaservice.developer.toutiao.com");
        return new C67248h<>(new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(b), "UTF-8", LocationRequest.PRIORITY_HD_ACCURACY, "ok", hashMap, new ByteArrayInputStream(readBytes)));
    }

    /* renamed from: a */
    public static WebResourceResponse m262070a(TTFile gVar, IAppContext iAppContext) {
        try {
            File i = ((AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class)).mo235635i(gVar, new TTFileContext(null, "TTFileResourceInterceptor"));
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "https://tmaservice.developer.toutiao.com");
            return new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(gVar.mo235655i()), "UTF-8", LocationRequest.PRIORITY_HD_ACCURACY, "ok", hashMap, new FileInputStream(i));
        } catch (TTFileException | FileNotFoundException e) {
            AppBrandLogger.m52829e("TTFileResourceInterceptor", "readFile exception", e);
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
    }
}

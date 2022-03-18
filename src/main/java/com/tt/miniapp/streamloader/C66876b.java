package com.tt.miniapp.streamloader;

import com.bytedance.ee.falcon.loader.AbstractC12702a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;

/* renamed from: com.tt.miniapp.streamloader.b */
public class C66876b extends StreamLoader implements AbstractC12702a {

    /* renamed from: a */
    private final IAppContext f168702a;

    public C66876b(IAppContext iAppContext) {
        this.f168702a = iAppContext;
    }

    @Override // com.bytedance.ee.falcon.loader.AbstractC12702a
    /* renamed from: a */
    public byte[] mo48093a(String str) {
        try {
            if (findFile(str, this.f168702a) != null) {
                return loadByteFromStream(str, this.f168702a);
            }
            C67500a aVar = new C67500a(C67501b.f170239g, this.f168702a);
            aVar.setErrorMessage("loadSync file: " + str + " error, ttaPkgFile not found").flush();
            AppBrandLogger.m52828d("JsFileReader", "file ", str, " doesn't loaded, wait for resolve");
            return null;
        } catch (Exception e) {
            C67500a aVar2 = new C67500a(C67501b.f170239g, this.f168702a);
            aVar2.setErrorMessage("loadSync file: " + str + " exception!").setError(e).flush();
            AppBrandLogger.m52829e("JsFileReader", "Exception", e);
            return null;
        }
    }
}

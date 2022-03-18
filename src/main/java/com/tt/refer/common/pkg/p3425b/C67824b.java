package com.tt.refer.common.pkg.p3425b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a;
import com.tt.miniapp.ttapkgdecoder.utils.DecodeException;
import com.tt.miniapphost.AppbrandContext;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69723u;

/* renamed from: com.tt.refer.common.pkg.b.b */
public class C67824b implements AbstractC66978a {

    /* renamed from: a */
    private Response f170835a;

    /* renamed from: b */
    private ResponseBody f170836b;

    /* renamed from: c */
    private long f170837c;

    /* renamed from: d */
    private IAppContext f170838d;

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: a */
    public long mo233006a() {
        ResponseBody responseBody = this.f170836b;
        if (responseBody != null) {
            return responseBody.contentLength();
        }
        return 0;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: b */
    public boolean mo233008b() {
        Response response = this.f170835a;
        if (response == null || !response.isSuccessful()) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: d */
    public void mo233010d() {
        AppBrandLogger.m52828d("app_start_load_download_stream_fetcher", "onReadFinished....");
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: c */
    public void mo233009c() {
        Response response = this.f170835a;
        if (response != null) {
            try {
                response.close();
            } catch (Exception e) {
                AppBrandLogger.m52829e("app_start_load_download_stream_fetcher", e);
            }
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: a */
    public AbstractC69723u mo233007a(String str) throws IOException {
        ResponseBody responseBody;
        int i;
        Request.Builder url = new Request.Builder().url(str);
        C12793a.m52873a(url, this.f170838d, C12805d.m52895a((TracingCoreSpan) AppbrandContext.getInst().getTracing(), true, this.f170838d));
        if (this.f170837c > 0) {
            url.addHeader("Range", "bytes=" + this.f170837c + "-");
        }
        Response execute = C66517e.m259918b().newCall(url.build()).execute();
        this.f170835a = execute;
        if (execute == null || !execute.isSuccessful()) {
            responseBody = null;
        } else {
            responseBody = this.f170835a.body();
        }
        this.f170836b = responseBody;
        if (responseBody != null) {
            return responseBody.source();
        }
        Response response = this.f170835a;
        if (response != null) {
            i = response.code();
        } else {
            i = -2;
        }
        throw new DecodeException(i);
    }

    public C67824b(long j, IAppContext iAppContext) {
        this.f170837c = j;
        this.f170838d = iAppContext;
    }
}

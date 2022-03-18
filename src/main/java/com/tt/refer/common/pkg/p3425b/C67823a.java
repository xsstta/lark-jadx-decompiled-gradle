package com.tt.refer.common.pkg.p3425b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.streamloader.C66879e;
import com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a;
import com.tt.miniapp.ttapkgdecoder.utils.DecodeException;
import com.tt.miniapphost.AppbrandContext;
import java.io.File;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69698d;
import okio.AbstractC69723u;
import okio.C69705k;

/* renamed from: com.tt.refer.common.pkg.b.a */
public class C67823a implements AbstractC66978a {

    /* renamed from: a */
    private final File f170830a;

    /* renamed from: b */
    private Response f170831b;

    /* renamed from: c */
    private ResponseBody f170832c;

    /* renamed from: d */
    private C66879e f170833d;

    /* renamed from: e */
    private IAppContext f170834e;

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: a */
    public long mo233006a() {
        ResponseBody responseBody = this.f170832c;
        if (responseBody != null) {
            return responseBody.contentLength();
        }
        return 0;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: b */
    public boolean mo233008b() {
        Response response = this.f170831b;
        if (response == null || !response.isSuccessful()) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: c */
    public void mo233009c() {
        C66879e eVar = this.f170833d;
        if (eVar != null) {
            try {
                eVar.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        Response response = this.f170831b;
        if (response != null) {
            try {
                response.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: d */
    public void mo233010d() {
        File file = this.f170830a;
        if (file != null) {
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                AbstractC69698d dVar = null;
                try {
                    if (this.f170830a.createNewFile()) {
                        dVar = C69705k.m267589a(C69705k.m267599b(this.f170830a));
                        dVar.write(this.f170833d.mo232855b(), this.f170833d.mo232855b().mo244510a());
                    }
                    if (dVar != null) {
                        try {
                            dVar.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e2) {
                    AppBrandLogger.m52829e("app_start_load_decode_stream_fetcher", "save file failed!", e2);
                    if (this.f170830a.exists()) {
                        this.f170830a.delete();
                    }
                    if (0 != 0) {
                        dVar.close();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            dVar.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a
    /* renamed from: a */
    public AbstractC69723u mo233007a(String str) throws IOException {
        ResponseBody responseBody;
        int i;
        ResponseBody responseBody2;
        Request.Builder url = new Request.Builder().url(str);
        C12793a.m52873a(url, this.f170834e, C12805d.m52895a((TracingCoreSpan) AppbrandContext.getInst().getTracing(), true, this.f170834e));
        Response execute = C66517e.m259918b().newCall(url.build()).execute();
        this.f170831b = execute;
        if (execute != null) {
            responseBody = execute.body();
        } else {
            responseBody = null;
        }
        this.f170832c = responseBody;
        Response response = this.f170831b;
        if (response == null || !response.isSuccessful() || (responseBody2 = this.f170832c) == null) {
            File file = this.f170830a;
            if (file != null && file.exists()) {
                this.f170830a.delete();
            }
            Response response2 = this.f170831b;
            if (response2 != null) {
                i = response2.code();
            } else {
                i = -2;
            }
            throw new DecodeException(i);
        }
        C66879e eVar = new C66879e(responseBody2.source());
        this.f170833d = eVar;
        return eVar;
    }

    public C67823a(File file, IAppContext iAppContext) {
        if (file.exists()) {
            file.delete();
        }
        this.f170834e = iAppContext;
        this.f170830a = file;
    }
}

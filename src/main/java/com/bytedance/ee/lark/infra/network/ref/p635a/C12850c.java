package com.bytedance.ee.lark.infra.network.ref.p635a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12885j;
import com.bytedance.ee.lark.infra.network.ref.entity.C12883i;
import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.a.c */
public class C12850c {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Request m53061a(com.bytedance.ee.lark.infra.network.ref.entity.C12880g r4) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.network.ref.p635a.C12850c.m53061a(com.bytedance.ee.lark.infra.network.ref.entity.g):okhttp3.Request");
    }

    /* renamed from: a */
    public static C12883i m53060a(AbstractC12860j jVar, Response response) throws Exception {
        if (response != null) {
            C12883i.C12884a aVar = new C12883i.C12884a();
            aVar.mo48580a(jVar.mo48487b());
            aVar.mo48579a(response.code()).mo48582a(response.message());
            final ResponseBody body = response.body();
            if (body != null) {
                aVar.mo48581a(new AbstractC12885j() {
                    /* class com.bytedance.ee.lark.infra.network.ref.p635a.C12850c.C128511 */

                    @Override // com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12885j
                    /* renamed from: a */
                    public String mo48485a() throws IOException {
                        return body.string();
                    }
                });
            }
            if (response.headers() != null) {
                for (String str : response.headers().names()) {
                    aVar.mo48583a(str, response.header(str));
                }
            }
            return aVar.mo48584a();
        }
        AppBrandLogger.m52829e("EeClientConvert", " response is null");
        throw new RuntimeException(" real response is null");
    }
}

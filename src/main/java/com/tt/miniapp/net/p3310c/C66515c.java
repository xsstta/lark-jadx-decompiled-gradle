package com.tt.miniapp.net.p3310c;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.tt.miniapphost.AppbrandContext;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.C69703i;
import okio.C69705k;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.c.c */
public class C66515c implements Interceptor {
    /* renamed from: a */
    private static boolean m259914a(String str) {
        JSONObject b;
        if (!TextUtils.isEmpty(str) && (b = C12738a.m52729b(AppbrandContext.getInst().getApplicationContext(), Settings.BDP_TTPKG_CONFIG, Settings.BdpTtPkgConfig.HOSTS_ADD_GZIP)) != null) {
            return b.optBoolean(str, false);
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        Response proceed;
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        if (request.header("Range") != null) {
            if (m259914a(request.url().host())) {
                z = true;
                newBuilder.addHeader("Accept-Encoding", "gzip");
                proceed = chain.proceed(newBuilder.build());
                Response.Builder request2 = proceed.newBuilder().request(request);
                String header = proceed.header("Content-Encoding");
                String header2 = proceed.header("Content-Type");
                if (z && "gzip".equalsIgnoreCase(header) && HttpHeaders.hasBody(proceed)) {
                    C69703i iVar = new C69703i(proceed.body().source());
                    request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
                    request2.body(new RealResponseBody(header2, -1, C69705k.m267590a(iVar)));
                }
                return request2.build();
            }
            newBuilder.addHeader("Accept-Encoding", "identity");
        }
        z = false;
        proceed = chain.proceed(newBuilder.build());
        Response.Builder request22 = proceed.newBuilder().request(request);
        String header3 = proceed.header("Content-Encoding");
        String header22 = proceed.header("Content-Type");
        C69703i iVar2 = new C69703i(proceed.body().source());
        request22.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
        request22.body(new RealResponseBody(header22, -1, C69705k.m267590a(iVar2)));
        return request22.build();
    }
}

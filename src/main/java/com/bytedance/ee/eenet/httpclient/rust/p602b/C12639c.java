package com.bytedance.ee.eenet.httpclient.rust.p602b;

import android.text.TextUtils;
import com.bytedance.ee.eenet.httpclient.p600a.C12615a;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.ee.eenet.util.RequestAlias;
import com.bytedance.ee.eenet.util.RequestPriority;
import com.bytedance.lark.sdk.LarkRequest;
import com.bytedance.lark.sdk.LarkRequestBody;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.C69694c;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.b.c */
public class C12639c {
    /* renamed from: a */
    public static LarkRequestBody m52411a(RequestBody requestBody) throws RustIOException {
        if (requestBody == null) {
            return LarkRequestBody.f48403a.mo67193a();
        }
        C69694c cVar = new C69694c();
        try {
            requestBody.writeTo(cVar);
            return LarkRequestBody.f48403a.mo67194a(cVar.readByteArray());
        } catch (IOException e) {
            throw new RustIOException(e, -3331002);
        } catch (OutOfMemoryError e2) {
            throw new RustIOException(e2, -3331003);
        }
    }

    /* renamed from: a */
    public static LarkRequest.Builder m52410a(Request request, OkHttpClient okHttpClient) throws RustIOException {
        LarkRequest.Builder aVar = new LarkRequest.Builder();
        aVar.mo67098a(request.url().toString());
        if ("GET".equals(request.method().toUpperCase())) {
            aVar.mo67114k();
        } else if ("POST".equals(request.method().toUpperCase())) {
            aVar.mo67092a(m52411a(request.body()));
        } else if ("HEAD".equals(request.method().toUpperCase())) {
            aVar.mo67115l();
        } else if ("PUT".equals(request.method().toUpperCase())) {
            aVar.mo67105c(m52411a(request.body()));
        } else if ("DELETE".equals(request.method().toUpperCase())) {
            aVar.mo67101b(m52411a(request.body()));
        } else if ("PATCH".equals(request.method().toUpperCase())) {
            aVar.mo67106d(m52411a(request.body()));
        }
        for (String str : request.headers().names()) {
            aVar.mo67093a(str, request.headers().get(str));
        }
        aVar.mo67093a("EENet-Request-Http-Channel", HttpChannel.RustChannel.toString());
        String str2 = request.headers().get("EENet-Request-Priority");
        if (!TextUtils.isEmpty(str2)) {
            int intValue = Integer.valueOf(str2).intValue();
            if (intValue == RequestPriority.HIGH.getLevel()) {
                aVar.mo67097a(LarkRequest.Priority.HIGH);
            } else if (intValue == RequestPriority.MEDIUM.getLevel()) {
                aVar.mo67097a(LarkRequest.Priority.MEDIUM);
            } else if (intValue == RequestPriority.LOW.getLevel()) {
                aVar.mo67097a(LarkRequest.Priority.LOW);
            }
        }
        String str3 = request.headers().get("EENet-Request-alias");
        if (!TextUtils.isEmpty(str3)) {
            int intValue2 = Integer.valueOf(str3).intValue();
            if (intValue2 == RequestAlias.API.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.API);
            } else if (intValue2 == RequestAlias.DOCS.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.DOCS);
            } else if (intValue2 == RequestAlias.DOCS_API.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.DOCS_API);
            } else if (intValue2 == RequestAlias.DRIVE.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.DRIVE);
            } else if (intValue2 == RequestAlias.FILE.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.FILE);
            } else if (intValue2 == RequestAlias.MINA.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.MINA);
            } else if (intValue2 == RequestAlias.OAPI.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.OAPI);
            } else if (intValue2 == RequestAlias.OPEN.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.OPEN);
            } else if (intValue2 == RequestAlias.PASSPORT.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.PASSPORT);
            } else if (intValue2 == RequestAlias.UNKNOWN.getValue()) {
                aVar.mo67096a(LarkRequest.Alias.UNKNOWN);
            }
        }
        String str4 = request.headers().get("EENet-Request-Retry-Num");
        if (!TextUtils.isEmpty(str4)) {
            aVar.mo67102b(Integer.valueOf(str4).intValue());
        } else {
            aVar.mo67102b(3);
        }
        String str5 = request.headers().get("EENet-Rust-Request-Timeout");
        if (TextUtils.isEmpty(str5) || !TextUtils.isDigitsOnly(str5)) {
            aVar.mo67095a(okHttpClient.connectTimeoutMillis() + okHttpClient.writeTimeoutMillis() + okHttpClient.readTimeoutMillis());
        } else {
            aVar.mo67095a(Integer.parseInt(str5));
        }
        aVar.mo67103b(C12615a.m52354a(request));
        aVar.mo67099a(okHttpClient.followRedirects());
        return aVar;
    }
}

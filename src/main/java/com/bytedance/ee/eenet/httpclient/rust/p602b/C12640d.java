package com.bytedance.ee.eenet.httpclient.rust.p602b;

import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.lark.sdk.HttpHeader;
import com.bytedance.lark.sdk.LarkNetProtocol;
import com.bytedance.lark.sdk.LarkResponse;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.b.d */
public class C12640d {
    /* renamed from: a */
    public static Protocol m52412a(LarkNetProtocol larkNetProtocol) {
        if (LarkNetProtocol.HTTP_1_1 == larkNetProtocol) {
            return Protocol.HTTP_1_1;
        }
        if (LarkNetProtocol.HTTP_2 == larkNetProtocol) {
            return Protocol.HTTP_2;
        }
        if (LarkNetProtocol.QUIC == larkNetProtocol) {
            return Protocol.QUIC;
        }
        return Protocol.HTTP_1_0;
    }

    /* renamed from: a */
    public static Response.Builder m52413a(LarkResponse larkResponse) {
        Response.Builder builder = new Response.Builder();
        LarkResponse.ResponseHeader c = larkResponse.mo67119c();
        LarkResponse.ResponseBody f = larkResponse.mo67122f();
        if (c != null) {
            builder.code(c.mo67149a());
            builder.protocol(m52412a(c.mo67150b()));
            Headers.Builder builder2 = new Headers.Builder();
            for (HttpHeader bVar : c.mo67151c()) {
                Internal.instance.addLenient(builder2, bVar.mo67175a(), bVar.mo67176b());
            }
            builder.headers(builder2.build());
        } else {
            builder.code(LarkResponse.InnerErrorCode.UNKNOWN.toInt());
            builder.protocol(Protocol.HTTP_1_0);
        }
        builder.addHeader("EENet-Request-Http-Channel", HttpChannel.RustChannel.toString());
        builder.addHeader("EENet-Request-Server-Ip", larkResponse.mo67123g());
        LarkResponse.StageCost a = larkResponse.mo67117a();
        if (a != null) {
            builder.addHeader("EENet-Request-Dns-Cost", String.valueOf(a.mo67152a()));
            builder.addHeader("EENet-Request-Tls-Cost", String.valueOf(a.mo67154c()));
            builder.addHeader("EENet-Request-Tcp-Cost", String.valueOf(a.mo67153b()));
        }
        if (f != null) {
            builder.body(m52414a(f.mo67145a(), f));
        }
        return builder;
    }

    /* renamed from: a */
    public static ResponseBody m52414a(String str, LarkResponse.ResponseBody cVar) {
        return ResponseBody.create(MediaType.parse(str), cVar.mo67146b().toByteArray());
    }
}

package com.bytedance.ee.eenet.httpclient.rust.p602b;

import android.text.TextUtils;
import com.bytedance.ee.eenet.httpclient.p600a.C12615a;
import com.bytedance.ee.eenet.p598a.C12611a;
import com.bytedance.ee.eenet.util.HttpChannel;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.b.a */
public final class C12637a {
    /* renamed from: a */
    public static C12611a m52407a(Request request) {
        String httpUrl = request.url().toString();
        String host = request.url().host();
        String str = request.url().topPrivateDomain();
        C12611a aVar = new C12611a();
        aVar.f33778n = str;
        aVar.f33776l = host;
        aVar.f33779o = HttpChannel.RustChannel.toString();
        aVar.f33775k = httpUrl;
        if (request != null) {
            String header = request.header("request-id");
            String str2 = "";
            if (header == null) {
                header = str2;
            }
            aVar.f33780p = header;
            String header2 = request.header("EENet-Request-Tag");
            if (header2 != null) {
                str2 = header2;
            }
            aVar.f33783s = str2;
            aVar.f33782r = request.method();
            aVar.f33784t = C12615a.m52354a(request);
        }
        return aVar;
    }

    /* renamed from: a */
    public static C12611a m52408a(Response response) {
        int i;
        int i2;
        int i3;
        int size;
        int i4;
        String header = response.header("EENet-Request-Dns-Cost");
        String header2 = response.header("EENet-Request-Tcp-Cost");
        String header3 = response.header("EENet-Request-Tls-Cost");
        int i5 = 0;
        if (!TextUtils.isEmpty(header)) {
            i = Integer.valueOf(header).intValue();
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(header2)) {
            i2 = Integer.valueOf(header2).intValue();
        } else {
            i2 = 0;
        }
        if (!TextUtils.isEmpty(header3)) {
            i3 = Integer.valueOf(header3).intValue();
        } else {
            i3 = 0;
        }
        String header4 = response.header("EENet-Request-Server-Ip");
        String httpUrl = response.request().url().toString();
        String host = response.request().url().host();
        String protocol = response.protocol().toString();
        String str = response.request().url().topPrivateDomain();
        C12611a aVar = new C12611a();
        aVar.f33765a = i;
        aVar.f33766b = i2;
        aVar.f33767c = i3;
        aVar.f33778n = str;
        aVar.f33776l = host;
        aVar.f33774j = protocol;
        aVar.f33777m = header4;
        aVar.f33779o = HttpChannel.RustChannel.toString();
        aVar.f33775k = httpUrl;
        List<String> headers = response.headers("server-timing");
        StringBuffer stringBuffer = new StringBuffer();
        if (headers != null && (size = headers.size()) > 0) {
            while (true) {
                i4 = size - 1;
                if (i5 >= i4) {
                    break;
                }
                stringBuffer.append(headers.get(i5));
                stringBuffer.append(",");
                i5++;
            }
            stringBuffer.append(headers.get(i4));
        }
        aVar.f33786v = stringBuffer.toString();
        ResponseBody body = response.body();
        if (body != null) {
            aVar.f33785u = body.contentLength();
        }
        Request request = response.request();
        String str2 = "";
        if (request != null) {
            String header5 = request.header("EENet-Request-Tag");
            if (header5 == null) {
                header5 = str2;
            }
            aVar.f33783s = header5;
            aVar.f33782r = request.method();
            aVar.f33784t = C12615a.m52354a(request);
        }
        String header6 = response.header("request-id");
        if (header6 == null) {
            header6 = str2;
        }
        aVar.f33780p = header6;
        String header7 = response.header("EENet-XRequest-Id");
        if (header7 != null) {
            str2 = header7;
        }
        aVar.f33781q = str2;
        return aVar;
    }
}

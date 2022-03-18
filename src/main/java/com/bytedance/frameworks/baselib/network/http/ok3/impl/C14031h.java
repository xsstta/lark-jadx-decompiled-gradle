package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.h */
public class C14031h implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        URI uri;
        Set<String> names;
        Set<String> names2;
        Request request = chain.request();
        try {
            uri = request.url().uri();
        } catch (Exception unused) {
            uri = C14091i.m57054b(request.url().toString());
        }
        Request.Builder newBuilder = request.newBuilder();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        Headers headers = request.headers();
        try {
            HashMap hashMap = new HashMap();
            if (!(headers == null || (names2 = headers.names()) == null || names2.isEmpty())) {
                for (String str : names2) {
                    hashMap.put(str, headers.values(str));
                }
            }
            Map<String, List<String>> map = null;
            if (cookieHandler != null) {
                try {
                    map = cookieHandler.get(uri, hashMap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    StringBuilder sb = new StringBuilder();
                    if (("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
                        int i = 0;
                        for (String str2 : entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str2);
                            i++;
                        }
                        newBuilder.addHeader(key, sb.toString());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            request = newBuilder.build();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Response proceed = chain.proceed(request);
        HashMap hashMap2 = new HashMap();
        Headers headers2 = proceed.headers();
        if (!(headers2 == null || (names = headers2.names()) == null || names.isEmpty())) {
            for (String str3 : names) {
                hashMap2.put(str3, headers2.values(str3));
            }
        }
        if (cookieHandler != null) {
            try {
                cookieHandler.put(uri, hashMap2);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return proceed;
    }
}

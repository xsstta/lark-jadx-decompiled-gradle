package com.bytedance.ee.eenet.httpclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* renamed from: com.bytedance.ee.eenet.httpclient.e */
public class C12623e {

    /* renamed from: c */
    private static int f33823c;

    /* renamed from: a */
    private OkHttpClient f33824a;

    /* renamed from: b */
    private EventListener f33825b;

    C12623e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public OkHttpClient mo47927a() {
        OkHttpClient okHttpClient = this.f33824a;
        if (okHttpClient != null) {
            m52374a(okHttpClient);
            return this.f33824a;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        int i = f33823c;
        if (i > 0 && i < 4) {
            m52375a(builder);
        }
        builder.pingInterval(10, TimeUnit.SECONDS);
        builder.connectionPool(new ConnectionPool(15, 180000, TimeUnit.MILLISECONDS));
        builder.connectTimeout(10000, TimeUnit.MILLISECONDS);
        builder.readTimeout(101000, TimeUnit.MILLISECONDS);
        builder.writeTimeout(101000, TimeUnit.MILLISECONDS);
        builder.addNetworkInterceptor(new Interceptor() {
            /* class com.bytedance.ee.eenet.httpclient.C12623e.C126241 */

            /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(4:2|(4:5|(2:9|40)|36|3)|37|10)|11|12|13|(1:15)(1:16)|(1:18)|19|20|21|(3:23|24|41)(1:43)|(1:(1:35))) */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
                r8 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
                if (r1 != null) goto L_0x00ab;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
                r0 = r8.getMessage();
                r2 = new java.lang.StringBuilder();
                r2.append(r1.getAddress().getHostAddress());
                r2.append("|");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
                if (r0 == null) goto L_0x00c6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
                r0 = "null";
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
                r2.append(r0);
                com.bytedance.common.utility.reflect.Reflect.on(r8).set("detailMessage", r2.toString());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
                r0.printStackTrace();
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x008c */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0092 A[SYNTHETIC, Splitter:B:23:0x0092] */
            /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
            @Override // okhttp3.Interceptor
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public okhttp3.Response intercept(okhttp3.Interceptor.Chain r8) throws java.io.IOException {
                /*
                // Method dump skipped, instructions count: 222
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.eenet.httpclient.C12623e.C126241.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
            }
        });
        builder.cookieJar(CookieJar.NO_COOKIES);
        EventListener eventListener = this.f33825b;
        if (eventListener != null) {
            builder.eventListener(eventListener);
        }
        OkHttpClient build = builder.build();
        this.f33824a = build;
        return build;
    }

    /* renamed from: a */
    private static OkHttpClient m52374a(OkHttpClient okHttpClient) {
        int i = f33823c;
        if (i <= 0 || i >= 4 || okHttpClient == null) {
            return okHttpClient;
        }
        OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
        m52375a(newBuilder);
        return newBuilder.build();
    }

    /* renamed from: a */
    private static void m52375a(OkHttpClient.Builder builder) {
        if (builder != null) {
            ArrayList arrayList = new ArrayList();
            int i = f33823c;
            if (i == 1) {
                arrayList.add(Protocol.HTTP_2);
            } else if (i == 2) {
                arrayList.add(Protocol.SPDY_3);
            } else if (i != 3) {
                arrayList.add(Protocol.HTTP_2);
                arrayList.add(Protocol.SPDY_3);
            }
            f33823c = 4;
            arrayList.add(Protocol.HTTP_1_1);
            builder.protocols(Collections.unmodifiableList(arrayList));
        }
    }
}

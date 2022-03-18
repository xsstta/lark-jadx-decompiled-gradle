package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.os.Build;
import android.util.Log;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.g */
public class C14028g {

    /* renamed from: b */
    private static AbstractC14030a f36750b;

    /* renamed from: c */
    private static int f36751c;

    /* renamed from: a */
    private OkHttpClient f36752a;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.g$a */
    public interface AbstractC14030a {
        /* renamed from: a */
        void mo51630a(OkHttpClient.Builder builder);
    }

    /* renamed from: a */
    public static void m56766a(int i) {
        if (i > 0 && f36751c == 0) {
            f36751c = i;
        }
    }

    /* renamed from: a */
    private static OkHttpClient m56765a(OkHttpClient okHttpClient) {
        int i = f36751c;
        if (i <= 0 || i >= 4 || okHttpClient == null) {
            return okHttpClient;
        }
        OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
        m56767a(newBuilder);
        return newBuilder.build();
    }

    /* renamed from: a */
    private static void m56767a(OkHttpClient.Builder builder) {
        if (builder != null) {
            ArrayList arrayList = new ArrayList();
            int i = f36751c;
            if (i == 1) {
                arrayList.add(Protocol.HTTP_2);
            } else if (i == 2) {
                arrayList.add(Protocol.SPDY_3);
            } else if (i != 3) {
                arrayList.add(Protocol.HTTP_2);
                arrayList.add(Protocol.SPDY_3);
            }
            f36751c = 4;
            arrayList.add(Protocol.HTTP_1_1);
            builder.protocols(Collections.unmodifiableList(arrayList));
        }
    }

    /* renamed from: b */
    private static OkHttpClient.Builder m56768b(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init(null, null, null);
                builder.sslSocketFactory(new C14063s(instance.getSocketFactory()));
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", e);
            }
        }
        return builder;
    }

    /* renamed from: a */
    public OkHttpClient mo51629a(boolean z) {
        if (z) {
            NetworkParams.tryNecessaryInit();
        }
        synchronized (NetworkParams.class) {
            OkHttpClient okHttpClient = this.f36752a;
            if (okHttpClient != null) {
                m56765a(okHttpClient);
                return this.f36752a;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            int i = f36751c;
            if (i > 0 && i < 4) {
                m56767a(builder);
            }
            builder.connectionPool(new ConnectionPool(15, 180000, TimeUnit.MILLISECONDS));
            builder.connectTimeout(15000, TimeUnit.MILLISECONDS);
            builder.readTimeout(15000, TimeUnit.MILLISECONDS);
            builder.writeTimeout(15000, TimeUnit.MILLISECONDS);
            builder.addNetworkInterceptor(new Interceptor() {
                /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.C14028g.C140291 */

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)(1:5)|(1:7)|8|(1:10)|11|12|(3:14|15|27)(1:29)|(1:(1:26))) */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
                    r8 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
                    if (r1 != null) goto L_0x006e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                    r0 = r8.getMessage();
                    r2 = new java.lang.StringBuilder();
                    r2.append(r1.getAddress().getHostAddress());
                    r2.append("|");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
                    if (r0 == null) goto L_0x0089;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
                    r0 = "null";
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
                    r2.append(r0);
                    com.bytedance.common.utility.reflect.Reflect.on(r8).set("detailMessage", r2.toString());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
                    r0.printStackTrace();
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004f */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[SYNTHETIC, Splitter:B:14:0x0055] */
                /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                @Override // okhttp3.Interceptor
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain r8) throws java.io.IOException {
                    /*
                    // Method dump skipped, instructions count: 161
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.C14028g.C140291.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                }
            });
            builder.dns(C14048i.m56873a());
            builder.cookieJar(CookieJar.NO_COOKIES);
            builder.addInterceptor(new C14031h());
            builder.addInterceptor(new C14052l());
            OkHttpClient.Builder b = m56768b(builder);
            b.followRedirects(true);
            AbstractC14030a aVar = f36750b;
            if (aVar != null) {
                aVar.mo51630a(b);
            }
            OkHttpClient build = b.build();
            this.f36752a = build;
            return build;
        }
    }
}

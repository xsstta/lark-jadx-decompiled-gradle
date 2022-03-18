package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import com.facebook.common.logging.FLog;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

/* renamed from: com.facebook.react.modules.network.i */
public class C21228i {

    /* renamed from: a */
    private static AbstractC21227h f51724a;

    /* renamed from: a */
    public static OkHttpClient.Builder m76996a() {
        OkHttpClient.Builder cookieJar = new OkHttpClient.Builder().connectTimeout(0, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).cookieJar(new C21235n());
        try {
            Security.insertProviderAt((Provider) Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
            return cookieJar;
        } catch (Exception unused) {
            return m76998a(cookieJar);
        }
    }

    /* renamed from: a */
    public static void m77000a(AbstractC21227h hVar) {
        f51724a = hVar;
    }

    /* renamed from: b */
    public static OkHttpClient.Builder m77001b(Context context) {
        return m76997a(context, 10485760);
    }

    /* renamed from: a */
    public static OkHttpClient.Builder m76998a(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new C21239q());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                FLog.m76575e("OkHttpClientProvider", "Error while enabling TLS 1.2", e);
            }
        }
        return builder;
    }

    /* renamed from: a */
    public static OkHttpClient m76999a(Context context) {
        AbstractC21227h hVar = f51724a;
        if (hVar != null) {
            return hVar.createNewNetworkModuleClient();
        }
        return m77001b(context).build();
    }

    /* renamed from: a */
    public static OkHttpClient.Builder m76997a(Context context, int i) {
        OkHttpClient.Builder a = m76996a();
        if (i == 0) {
            return a;
        }
        return a.cache(new Cache(new File(context.getCacheDir(), "http-cache"), (long) i));
    }
}

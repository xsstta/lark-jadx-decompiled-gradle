package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.p741a.C13979a;
import com.bytedance.frameworks.baselib.network.http.p741a.C13981b;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a */
public class C14078a implements Interceptor {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51792a(Request request, SsResponse ssResponse) throws Exception {
    }

    /* renamed from: a */
    private String m57001a(String str) {
        try {
            return NetworkParams.addCommonParams(str, true);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor
    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request request = chain.request();
        try {
            URL url = new URL(request.getUrl());
            if (url.getProtocol().equals("http")) {
                NetworkParams.monitorApiHttp(url.getHost(), url.getPath(), false);
            }
        } catch (MalformedURLException unused) {
        }
        Request a = mo51791a(request);
        if (a.getMetrics() != null) {
            a.getMetrics().f50294x.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        SsResponse proceed = chain.proceed(a);
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        mo51792a(a, proceed);
        if (a.getMetrics() != null) {
            a.getMetrics().f50295y.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf2.longValue()));
        }
        return proceed;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request mo51791a(Request request) throws IOException {
        String str;
        if (NetworkParams.getEnableMainThreadCheck() && Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("You must not send request on main thread");
        } else if (request == null) {
            return request;
        } else {
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            String url = request.getUrl();
            if (request.getExtraInfo() instanceof BaseRequestContext) {
                str = NetworkParams.filterUrl(url, (BaseRequestContext) request.getExtraInfo());
            } else {
                str = NetworkParams.filterUrl(url);
            }
            if (request.getMetrics() != null) {
                request.getMetrics().f50296z = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            if (request.getUrl().startsWith("https:") && str.startsWith("http:")) {
                try {
                    URL url2 = new URL(str);
                    NetworkParams.monitorApiHttp(url2.getHost(), url2.getPath(), true);
                } catch (Throwable unused) {
                }
            }
            Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
            if (request.isAddCommonParam()) {
                C13979a b = C13981b.m56538a().mo51399b();
                if (b == null || !b.mo51385b()) {
                    str = m57001a(str);
                } else {
                    str = C13981b.m56538a().mo51397a(request, str);
                }
            }
            if (request.getMetrics() != null) {
                request.getMetrics().f50255A = SystemClock.uptimeMillis() - valueOf2.longValue();
            }
            Request.C20591a newBuilder = request.newBuilder();
            newBuilder.mo69377a(str);
            return newBuilder.mo69380b();
        }
    }
}

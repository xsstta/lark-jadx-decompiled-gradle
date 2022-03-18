package com.bytedance.apm.agent.instrumentation.interceptor;

import android.text.TextUtils;
import com.bytedance.apm.p124a.p125a.C2744d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddHeaderInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        if (TextUtils.isEmpty(request.header("x-tt-trace-log")) && C2744d.m11644c().mo11805f()) {
            if (C2744d.m11644c().mo11803d() && C2744d.m11644c().mo11806g()) {
                newBuilder.addHeader("x-tt-trace-log", HiAnalyticsConstant.KeyAndValue.NUMBER_01);
            } else if (C2744d.m11644c().mo11804e() == 1 && C2744d.m11644c().mo11806g()) {
                newBuilder.addHeader("x-tt-trace-log", "02");
            }
        }
        return chain.proceed(newBuilder.build());
    }
}

package com.ss.video.rtc.base.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okio.C69694c;

public class RtcNet {
    private static HashMap<String, WeakReference<Call>> callStorage = new HashMap<>();
    private static Gson gson = new GsonBuilder().create();

    public interface HttpCallBack<T> {
        void onError(RequestErrTime requestErrTime, Exception exc, String str, int i);

        void onResponse(T t, String str);

        void onUUIDGen(String str);
    }

    public enum RequestErrTime {
        ON_BUILD_REQUEST,
        ON_EXECUTE_REQUEST,
        ON_HANDLE_RESPONSE
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    private static String buildUrl(RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        HttpUrl.Builder newBuilder = HttpUrl.parse(rtcNetBaseRequestModel.getRequestUrl()).newBuilder();
        setQueryParameter(newBuilder, rtcNetBaseRequestModel);
        return newBuilder.build().toString();
    }

    private static String bodyToString(Request request) {
        try {
            Request build = request.newBuilder().build();
            C69694c cVar = new C69694c();
            if (build.body() == null) {
                return "";
            }
            build.body().writeTo(cVar);
            return cVar.mo244546f();
        } catch (IOException unused) {
            return "has exception when get body.";
        }
    }

    public static void cancelRequest(String str) {
        if (callStorage.containsKey(str)) {
            Call call = callStorage.get(str).get();
            if (call != null) {
                call.cancel();
            }
            callStorage.remove(str);
        }
    }

    private static String convertWithIteration(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("{");
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(map.get(str));
                sb.append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }

    private static void setCustomDnsReslov(OkHttpClient.Builder builder, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        builder.dns(new Dns() {
            /* class com.ss.video.rtc.base.net.$$Lambda$RtcNet$PGgHH0ZZXkYs8P7Q62ogLGBgBE8 */

            @Override // okhttp3.Dns
            public final List lookup(String str) {
                return RtcNet.lambda$setCustomDnsReslov$0(RtcNetBaseRequestModel.this, str);
            }
        });
    }

    static /* synthetic */ List lambda$setCustomDnsReslov$0(RtcNetBaseRequestModel rtcNetBaseRequestModel, String str) throws UnknownHostException {
        try {
            List<InetAddress> customDnsReslov = rtcNetBaseRequestModel.setCustomDnsReslov(str);
            if (customDnsReslov == null) {
                return Dns.SYSTEM.lookup(str);
            }
            rtcNetBaseRequestModel.setCallDnsLog(str, customDnsReslov.get(0).getHostAddress());
            return customDnsReslov;
        } catch (IOException unused) {
            return Dns.SYSTEM.lookup(str);
        }
    }

    private static void setHeaderParameter(Request.Builder builder, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        rtcNetBaseRequestModel.setHeaderParameter();
        for (Map.Entry<String, String> entry : rtcNetBaseRequestModel.getRequestHeader().entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }
    }

    private static void setQueryParameter(HttpUrl.Builder builder, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        rtcNetBaseRequestModel.setQueryParameter();
        for (Map.Entry<String, String> entry : rtcNetBaseRequestModel.getQueryParameter().entrySet()) {
            builder.addQueryParameter(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ee, code lost:
        if (r17 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        r17.onError(com.ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE, r0, java.lang.String.format("JsonSyntaxException, URL = %s, Header = %s, QueryParams = %s, Body = %s", r16.getRequestUrl(), convertWithIteration(r16.getRequestHeader()), convertWithIteration(r16.getQueryParameter()), bodyToString(r7)), -1);
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0124, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0129, code lost:
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        r17.onError(com.ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_EXECUTE_REQUEST, r0, java.lang.String.format("IOException, URL = %s, Header = %s, QueryParams = %s, Body = %s", r16.getRequestUrl(), convertWithIteration(r16.getRequestHeader()), convertWithIteration(r16.getQueryParameter()), bodyToString(r7)), -1);
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015f, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed A[ExcHandler: JsonSyntaxException (r0v6 'e' com.google.gson.JsonSyntaxException A[CUSTOM_DECLARE]), Splitter:B:12:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T request(com.ss.video.rtc.base.net.RtcNetBaseRequestModel r16, com.ss.video.rtc.base.net.RtcNet.HttpCallBack<T> r17) {
        /*
        // Method dump skipped, instructions count: 352
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.base.net.RtcNet.request(com.ss.video.rtc.base.net.RtcNetBaseRequestModel, com.ss.video.rtc.base.net.RtcNet$HttpCallBack):java.lang.Object");
    }
}
